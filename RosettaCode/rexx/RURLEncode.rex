/* Rexx */
/* ========================================================================== */

/*
http%3A%2F%2Ffoo%20bar%2F
http://foo bar/

mailto%3A%22Ivan%20Aim%22%20%3Civan%2Eaim%40email%2Ecom%3E
mailto:"Ivan Aim" <ivan.aim@email.com>

%6D%61%69%6C%74%6F%3A%22%49%72%6D%61%20%55%73%65%72%22%20%3C%69%72%6D%61%2E%75%73%65%72%40%6D%61%69%6C%2E%63%6F%6D%3E
mailto:"Irma User" <irma.user@mail.com>
*/

/* -------------------------------------------------------------------------- */
do
  call testcase
  say
  say RFC3986
  call testcase RFC3986
  say
  say HTML5
  call testcase HTML5
  say
  return
end
exit

/* -------------------------------------------------------------------------- */
encode:
procedure
do
  parse arg url, varn .
  parse upper var varn variation 
  drop RFC3986 HTML5
  opts.        = ''
  opts.RFC3986 = '-._~'
  opts.HTML5   = '-._*'
  res = "!*'();:@&=+$,/?#[]"

  rp = ''
  do while length(url) > 0
    parse var url tc +1 url
    select
      when datatype(tc, 'A') then do
        rp = rp || tc
        end
      when tc == ' ' then do
        if variation = HTML5 then
          rp = rp || '+'
        else
          rp = rp || '%' || c2x(tc)
        end
      otherwise do
        if pos(tc, opts.variation) > 0 then do
          rp = rp || tc
          end
        else do
          rp = rp || '%' || c2x(tc)
          end
        end
      end
    end

  return rp
end
exit

/* -------------------------------------------------------------------------- */
testcase:
procedure
do
  parse arg variation
  X = 0
  url. = ''
  X = X + 1; url.0 = X; url.X = 'http://foo bar/'
  X = X + 1; url.0 = X; url.X = 'mailto:"Ivan Aim" <ivan.aim@email.com>'
  X = X + 1; url.0 = X; url.X = 'mailto:"Irma User" <irma.user@mail.com>'
  X = X + 1; url.0 = X; url.X = 'http://foo.bar.com/~user-name/_subdir/*~.html'

  do i_ = 1 to url.0
    say url.i_
    say encode(url.i_, variation)
    end i_

  return
end

/* ========================================================================== */

