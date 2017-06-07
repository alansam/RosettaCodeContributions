/*REXX program to demonstrate casting-out-nines (with Kaprekar numbers).*/

parse arg start stop base .            /*get the user args (if any).    */
if base == '' then base = 10               /*use base ten if not specified. */

if start == '' then do                   /*use defaults if not specified. */
  start = 1
  stop = 1000
  end

if stop == '' then stop = start            /*not specified?  Use the default*/
numbers = castOut(start, stop, base)       /*generate a list of numbers.    */
cast_out = 'cast-out-' || (base - 1) "test"  /*build text shortcut.*/

say 'For' start "through" stop', the following passed the' cast_out":"
numList = numbers
nx = 16
mn = length(word(numList, words(numList)))
do while length(numList) > 0
  line = subword(numList, 1, nx)
  numList = subword(numList, nx + 1)
  pline = ''
  do w = 1 to nx
    pline = pline || right(word(line, w), mn)' '
    end w
  say strip(pline, 't')
  end
say

q = stop - start + 1
p = words(numbers)
pc = format(p / q * 100,, 2) / 1 || '%'

say 'For' q "numbers," p 'passed the' cast_out "("pc') for base' base"."
if base \== 10 then exit

Kaps = kaprekar(start, stop)              /*generate a list of Kaprekar numbers.*/
say
say 'The Kaprekar numbers in the same range are:' Kaps
say
do i = 1 for words(Kaps)
  x = word(Kaps, i)    /*verify 'em in list. */
  if wordpos(x, numbers) \== 0 then iterate     /*OK so far ...       */
  say 'Kaprekar number' x "isn't in the numbers list."     /*oops! */
  exit                                       /*go spank the coder. */
  end i

say 'All Kaprekar numbers are in the' cast_out "numbers list."      /*ok*/
exit                                   /*stick a fork in it, we're done.*/

/*──────────────────────────────────CASTOUT subroutine──────────────────*/
castOut:
  procedure
  parse arg low, high, radix
  SS = ''
  high = word(high low, 1)                 /*use default of LOW for HIGH.*/
  radix = word(radix 10, 1)                /*use default of 10  for RADIX.*/
  niner = radix - 1                        /*a fast way to use  RADIX - 1.  */
  do j = low to high     /*traipse through the arg range. */
    if j // niner == j * j // niner then SS = SS j    /*pass the test?*/
    end
  return strip(SS)                        /*strip leading blank from result*/

/*──────────────────────────────────Kaprekar subroutine─────────────────*/
kaprekar:
  procedure
  parse arg L, H
  SS = ''
  if L <= 1 then SS = 1
  numeric digits max(10, 2 * length(L ** 2))    /*ensure enough digs for power of 2.*/

  /*slow way to find Kaprekar nums.*/
  do j = max(2, L) to H
    s = j * j
    do k = 1 for length(s) % 2
      if j == left(s, k) + substr(s, k + 1) then SS = SS j     /*found a Kaprekar #.*/
      end k
    end j

  return strip(SS)                        /*return the Kaprekar numbers.   */

