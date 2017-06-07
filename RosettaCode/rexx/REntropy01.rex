/*REXX program calculates the information entropy  for a given char str.*/
numeric digits 30                      /*use thirty digits for precision*/
parse arg SS
if SS == '' then SS = 1223334444  /*obtain optional input*/
n = 0
AT. = 0
L = length(SS)
SxSx = ''

do j = 1 for L
  U_ = substr(SS, j, 1)  /*process each character in SS str*/
  if AT.U_ == 0 then do
    n = n + 1      /*if unique,  bump char counter. */
    SxSx = SxSx || U_       /*add this character to the list.*/
    end
  AT.U_ = AT.U_ + 1                      /*keep track of this char count. */
  end j
sum = 0                                  /*calc info entropy for each char*/
do i = 1 for n
  U_ = substr(SxSx, i, 1) /*obtain a char from unique list.*/
  sum = sum  -  AT.U_ / L * log2(AT.U_ / L) /*add (negatively) the entropies.*/
  end i

say ' input string: ' SS
say 'string length: ' L
say ' unique chars: ' n
say
say 'the information entropy of the string --> ' format(sum,, 12)  " bits."
exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------LOG2 subroutine---------------------*/
log2:
procedure
  parse arg x 1 xx
  ig = x > 1.5
  is = 1 - 2 * (ig \== 1)
  ii = 0
  numeric digits digits() + 5      /* [↓] precision of E must be > digits().*/
  e = 2.7182818284590452353602874713526624977572470936999595749669676277240766303535
  do  while ig & xx >1 .5 | \ig & xx < .5
    U_ = e
    do k = -1
      iz = xx * U_ ** -is
      if k >= 0 & (ig & iz < 1 | \ig & iz > .5) then leave k
      U_ = U_ * U_
      izz = iz
      end k
    xx = izz
    ii = ii + is * 2 ** k
    end
  x = x * e ** -ii - 1
  z = 0
  U_ = -1
  p = z
  do k = 1
    U_ = - U_ * x
    z = z + U_ / k
    if z = p then leave k
    p = z
    end k
  r = z + ii
  if arg() == 2 then return r
  return r / log2(2, 0)

