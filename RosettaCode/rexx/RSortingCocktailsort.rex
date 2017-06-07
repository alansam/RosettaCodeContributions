/* Rexx */

placesList = .array~of( -
    "UK  London",     "US  New York"   , "US  Boston",     "US  Washington" -
  , "UK  Washington", "US  Birmingham" , "UK  Birmingham", "UK  Boston"     -
)

sortedList = cocktailSort(placesList~allItems())

lists = .array~of(placesList, sortedList)
loop ln = 1 to lists~items()
  cl = lists[ln]
  loop ct = 1 to cl~items()
    say cl[ct]
    end ct
    say
  end ln

rn = .array~new()
loop n_ = 1 to 1000
  rn[n_] = random(-99, 999)
  end n_

call shownums rn
say
call shownums cocktailSort(rn~allItems())
say

rn = .array~new()
loop x_ = 1 to 1099
  rn[x_] = x_ - 100
  end x_
rn = shuffleFischerYates(rn)

call shownums rn
say
call shownums cocktailSort(rn~allItems())
say

return
exit

::routine shownums
  use arg rn

  rk = -1
  rl = ''
  ln = 0
  say right('', 3)':    1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30'
  loop r_ = 1 to rn~items()
    rk += 1
    if rk = 30 then do
      ln += 1
      say right((ln -1) * 30, 3)':' rl
      rl = ''
      rk = 0
      end
    rl = rl || right(rn[r_], 4)
    end r_
  ln += 1
  say right((ln -1) * 30, 3)':' rl
/*
   1    2    3    4    5    6    7    8    9   10    1    2    3    4    5    6    7    8    9   20    1    2    3    4
 000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000
*/
  return

::routine cocktailSort
  use arg A
  /*
   * The cocktail shaker sort is an improvement on the Bubble Sort. The improvement is basically that values
   * "bubble" both directions through the array, because on each iteration the cocktail shaker sort bubble
   * sorts once forwards and once backwards.
   *
   * Pseudocode for the algorithm (from wikipedia):
   * <pre>
   * function cocktailSort( A : list of sortable items )
   *   do
   *     swapped := false
   *     for each i in 0 to length( A ) - 2 do
   *       if A[ i ] > A[ i+1 ] then // test whether the two 
   *                                 // elements are in the wrong 
   *                                 // order
   *         swap( A[ i ], A[ i+1 ] ) // let the two elements
   *                                  // change places
   *         swapped := true;
   *     if swapped = false then
   *       // we can exit the outer loop here if no swaps occurred.
   *       break do-while loop;
   *     swapped := false
   *     for each i in length( A ) - 2 down to 0 do
   *       if A[ i ] > A[ i+1 ] then
   *         swap( A[ i ], A[ i+1 ] )
   *         swapped := true;
   *   while swapped; // if no elements have been swapped, 
   *                  // then the list is sorted
   * </pre>
   */

  Alength = A~items()
  swapped = isFalse()
  loop label swaps until \swapped
    swapped = isFalse()
    loop i_ = 1 to Alength - 1
      if A[i_] > A[i_ + 1] then do
        swap      = A[i_ + 1]
        A[i_ + 1] = A[i_]
        A[i_]     = swap
        swapped = isTrue()
        end
      end i_
    if \swapped then do
      leave swaps
      end
    swapped = isFalse()
    loop i_ = Alength - 1 to 1 by -1
      if A[i_] > A[i_ + 1] then do
        swap      = A[i_ + 1]
        A[i_ + 1] = A[i_]
        A[i_]     = swap
        swapped = isTrue()
        end
      end i_
    end swaps

  return A

::routine isTrue
  return 1 == 1

::routine isFalse
  return \isTrue()

::routine shuffleFischerYates
  /* Fischer-Yates Shuffle */
  use arg arry
  alen = arry~items()
  loop i_ = alen to 1 by -1
    j_ = random(1, i_)
    if i_ == j_ then
      iterate i_
    tmp = arry[i_]
    arry~put(arry[j_], i_) 
    arry~put(tmp, j_)
    end i_
  return arry

/* ----------- */

::routine shuffleNaive
/* Naive Shuffle */
  use arg arry
  alen = arry~items()
  loop alen
    p1 = random(1, alen)
    p2 = random(1, alen)
    loop while p2 == p1
      p2 = random(1, alen)
      end
    tmp = arry[p1]
    arry~put(arry[p2], p1)
    arry~put(tmp, p2)
    end
  return arry

