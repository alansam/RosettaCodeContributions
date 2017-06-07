/* NetRexx */
options replace format comments java crossref symbols nobinary

numeric digits 20

  isTrue  = (1 == 1)
  isFalse = (1 \== 1)
  boolean = 'isTrue isFalse'

  parse arg maxLim .
  smallSample = 10000
  largeSample = 1000000
  if maxlim \= '' & datatype(maxLim, 'w') then largeSample = maxLim
  
  say '-'~copies(80)
  limit = smallSample
  et = time('r')
  KN = kaprekar00(limit)
  et = time('e')
  say 'kaprekar00('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = largeSample
  et = time('r')
  KN = kaprekar00(limit)
  et = time('e')
  say 'kaprekar00('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = smallSample
  et = time('r')
  KN = kaprekar01(limit)
  et = time('e')
  say 'kaprekar01('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = largeSample
  et = time('r')
  KN = kaprekar01(limit)
  et = time('e')
  say 'kaprekar01('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = smallSample
  et = time('r')
  KN = kaprekar02(1, limit)
  et = time('e')
  say 'kaprekar02('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = largeSample
  et = time('r')
  KN = kaprekar02(1, limit)
  et = time('e')
  say 'kaprekar02('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = smallSample
  et = time('r')
  KN = kaprekar03(limit)
  et = time('e')
  say 'kaprekar03('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  say '-'~copies(80)
  limit = largeSample
  et = time('r')
  KN = kaprekar03(limit)
  et = time('e')
  say 'kaprekar03('limit'):' et
  say '-'~copies(80)
  call rowFormatter KN
  say

  return
exit

-- -----------------------------------------------------------------------------
kaprekar00:
procedure expose (boolean)
  parse arg limit .

  kapNums = ''
  loop kn = 1 to limit
    kSq = kn * kn
    if kSq // 9 \== kn // 9 then iterate kn
    loop splt = 1 to kSq~length()
      parse var kSq kl +(splt) kr .
      if kr = 0 then leave splt
      if kr = '' then kr = 0
      kNum = ''
      if kl + kr = kn then do
        kNum = kn
        kapNums = kapNums || kNum' '
        end
      if kNum \= '' then leave splt
      end splt
    end kn

  kapNums = strip(kapNums)
  return kapNums

-- -----------------------------------------------------------------------------
kaprekar01:
procedure expose (boolean)
  parse arg limit .

  kapNums = ''
  loop kn = 1 to limit
    kSq = kn * kn
    loop splt = 1 to kSq~length()
      parse var kSq kl +(splt) kr .
      if kr = 0 then leave splt
      if kr = '' then kr = 0
      kNum = ''
      if kl + kr = kn then do
        kNum = kn
        kapNums = kapNums || kNum' '
        end
      if kNum \= '' then leave splt
      end splt
    end kn

  kapNums = strip(kapNums)
  return kapNums

-- -----------------------------------------------------------------------------
kaprekar02:
procedure
  parse arg Lo, Hi
  kapNums = 1
  if Lo <= 1 then kapNums = 1
  numeric digits max(10, 2 * length((Hi + 1) ** 2))    /*ensure enough digs for power of 2.*/

  /*slow way to find Kaprekar nums.*/
  do j = max(2, Lo) to Hi
    s = j * j
    do k = 1 for length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then kapNums = kapNums j  /*found a Kaprekar #.*/
      end k
    end j

  kapNums = strip(kapNums)
  return kapNums                         /*return the Kaprekar numbers.   */

/*──────────────────────────────────Kaprekar subroutine─────────────────*/
kaprekar03:
procedure
  arg limit
  nd = 2 * length((limit + 1) ** 2)
  numeric digits max(10, nd)    /*ensure enough digs for power 2.*/

  kapNums = 1
  do j = 2 to abs(limit) - 1
    s = j * j
    if j // 9 \== s // 9 then iterate j    /*didn't pass cast-out-9s test ? */
                                           /*cast-out-9s test is much faster*/
    do k = 1  for  length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then kapNums = kapNums j  /*Eureka! */
      end k
    end j

  kapNums = strip(kapNums)
  return kapNums

-- -----------------------------------------------------------------------------
rowFormatter:
procedure
  parse arg kapNums
  Lo = word(kapNums, 1)
  Hi = word(kapNums, words(kapNums))
  fmword = length(Hi) + 1
  fwords = 80 % (fmword + 1)
  dline. = ''
  lw = 0
  r_ = 1
  do w_ = 1 to words(kapNums)
    dline.0 = r_
    dline.r_ = dline.r_ || right(word(kapNums, w_), fmword)' '
    lw = lw + 1
    if lw >= fwords then do
      r_ = r_ + 1
      lw = 0
      end
    end w_
  do r_ = 1 to dline.0
    say strip(dline.r_, 't')
    end r_

  say words(kapNums) 'Kaprekar numbers in the range' Lo 'to' Hi
  return

