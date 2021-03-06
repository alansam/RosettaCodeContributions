/* Rexx */
/* Using the RxRegExp Regular Expression built-in utility class */

st1 = 'Fee, fie, foe, fum, I smell the blood of an Englishman'
rx1 = '[Ff]?e' -- unlike most regex engines, RxRegExp uses '?' instead of '.' to match any single character
sbx = 'foo'

myRE = .RegularExpression~new()
myRE~parse(rx1, MINIMAL)

mcm = myRE~pos(st1)
say 'String "'st1'"' 'matches pattern "'rx1'":' bool2string(mcm > 0)
say

-- The RxRegExp package doesn't provide a replace capability so you must roll your own
st0 = st1
loop label GREP forever
  mcp = myRE~pos(st1)
  if mcp > 0 then do
    mpp = myRE~position
    fnd = st1~substr(mcp, mpp - mcp + 1)
    stx = st1~changestr(fnd, sbx, 1)
    end
  else leave GREP
  st1 = stx
  end GREP
say 'Input string:  "'st0'"'
say 'Result string: "'stx'"'

call tt1
call tt0

return
exit

tt0:
procedure
do
  st1 = 'Fex, fie, foe, fum, I smell the blood of an Englishman'
  rx1 = '[Ff]?e'
  myRE = .RegularExpression~new()
  myRE~parse(rx1, MINIMAL)
  begin = myRE~pos(st1)
  if begin > 0 then do
    foo = st1~substr(begin, myRE~position - begin + 1)
    say "Found the text" foo "in this sentence."
    end
  return
end
exit

tt1:
procedure
do
  str = "It is the year 2002!"
  myRE = .RegularExpression~new("[1-9][0-9]*")
  begin = myRE~pos(str)
  if begin > 0 then do
    year = str~substr(begin, myRE~position - begin + 1)
    say "Found the number" year "in this sentence."
    end
  return
end
exit

bool2string:
procedure
do
  parse arg bv .
  if bv then bx = 'true'
        else bx = 'false'
  return bx
end
exit

::requires "rxregexp.cls"

