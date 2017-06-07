/* NetRexx */
options replace format comments java crossref symbols nobinary

numeric digits 20

  isTrue  = (1 == 1)
  isFalse = (1 \== 1)
  boolean = 'isTrue isFalse'

  say '-'~copies(80)
  call kaprekar01 10000
  say

  say '-'~copies(80)
  call kaprekar01 1000000, isTrue
  say

  say '-'~copies(80)
  call kaprekar02 1, 10000
  say

  say '-'~copies(80)
  call kaprekar02 1, 1000000
  say

  say '-'~copies(80)
  call kaprekar03 10000
  say

  say '-'~copies(80)
  call kaprekar03 1000000
  say

  return
exit

-- -----------------------------------------------------------------------------
kaprekar01:
procedure expose (boolean)
  parse arg limit ., listAll .
  if listAll == '' then listAll = isTrue

  kCount = 0
  loop kn = 1 to limit
    kSq = kn * kn
    loop splt = 1 to kSq~length()
      parse var kSq kl +(splt) kr .
      if kr = 0 then leave splt
      if kr = '' then kr = 0
      kNum = ''
      if kl + kr = kn then do
        kNum = kn
        kCount = kCount + 1
        if listAll then do
          ll = limit~length() + 1
          lx = (limit * limit)~length()
          say kNum~right(ll) ':' kSq~right(lx) '('kl~right(lx) '+' kr~right(lx)')'
          end
        end
      if kNum \= '' then leave splt
      end splt
    end kn

  say
  say kCount~right(10) 'Kaprekar numbers <' limit

  return

-- -----------------------------------------------------------------------------
kaprekar02:
procedure
  parse arg Lo, Hi
  SS = ''
  fmword = length(Hi) + 1
  fwords = 80 % fmword
  if Lo <= 1 then SS = 1
  numeric digits max(10, 2 * length((Hi + 1) ** 2))    /*ensure enough digs for power of 2.*/

  /*slow way to find Kaprekar nums.*/
  do j = max(2, Lo) to Hi
    s = j * j
    do k = 1 for length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then SS = SS j     /*found a Kaprekar #.*/
      end k
    end j

  SS = strip(SS)
  --say SS                         /*return the Kaprekar numbers.   */
  dline. = ''
  lw = 0
  r_ = 1
  do w_ = 1 to words(SS)
    dline.0 = r_
    dline.r_ = dline.r_ || right(word(SS, w_), fmword)' '
    lw = lw + 1
    if lw >= fwords then do
      r_ = r_ + 1
      lw = 0
      end
    end w_
  do r_ = 1 to dline.0
    say strip(dline.r_, 't')
    end r_

  say words(SS) 'Kaprekar numbers in the range' Lo 'to' Hi
  return

/*──────────────────────────────────Kaprekar subroutine─────────────────*/
kaprekar03:
procedure
  arg limit
  nd = 2 * length((limit + 1) ** 2)
  numeric digits max(10, nd)    /*ensure enough digs for power 2.*/
  HH = 0

  --if 1 <= abs(limit)  then call tell 1
  call tell 1

  do j = 2 to abs(limit) - 1
    s = j * j
    if j // 9 \== s // 9 then iterate j    /*didn't pass cast-out-9s test ? */
                                           /*cast-out-9s test is much faster*/
    do k = 1  for  length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then call tell j      /*Eureka! */
      end k
    end j

  say center("There are" HH 'Kaprekar numbers below' abs(limit)".", 79, '=')
  say
  return

/*──────────────────────────────────TELL subroutine─────echoHH if limit>0*/
tell:
  HH = HH + 1
  if limit > 0 then say right(arg(1), length(limit))
  return

