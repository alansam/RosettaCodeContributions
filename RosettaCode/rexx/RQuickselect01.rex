/*REXX program sorts a list (which may be numbers)  using  quick select.*/
parse arg list
if list = '' then list = 9 8 7 6 5 0 1 2 3 4    /*default?*/

do H_ = 1 for words(list)
  A_.H_ = word(list, H_)
  end H_
H_ = H_ - 1                   /* [decrement]  H_=number of items in list*/

do j = 1 for H_                       /*show  1 --> H_  place and value.*/
  say '         item' right(j,length(H_))",  value: " qSel(1, H_, j)
  end j
exit                                   /*stick a fork in it, we're done.*/

/*----------------------------------QPART subroutine--------------------*/
qPart:
procedure expose A_.
  parse arg L 1 Q_, R, pivotIndex
  pVal = A_.pivotIndex
  parse value A_.pivotIndex A_.R with A_.R A_.pivotIndex  /*swap 2 items*/
  do k = L to R - 1                    /*process the left side of list. */
    if A_.k > pVal then iterate        /*when item>pivotValue, skip it. */
    parse value  A_.Q_ A_.k with A_.k  A_.Q_              /*swap 2 items*/
    Q_ = Q_ + 1                                           /*next item.  */
    end k
  parse  value A_.R A_.Q_ with A_.Q_ A_.R                 /*swap 2 items*/
  return Q_

/*----------------------------------QSEL subroutine---------------------*/
qSel:
procedure expose A_.
  parse arg L, R, z
  if L == R then return A_.L
  do forever                                   /*keep looping until all done.   */
    pivotNewIndex = qPart(L, R, (L + R) % 2) /*partition the list into  ≈  1/2. */
    pivotDist = pivotNewIndex - L + 1
    select
      when pivotDist == z then do
        returnVal = A_.pivotNewIndex
        leave /*forever*/
        end
      when z < pivotDist then do
        R = pivotNewIndex - 1
        end
      otherwise do
        z = z - pivotDist
        L = pivotNewindex + 1
        end
      end
    end /*forever*/
  return returnVal
