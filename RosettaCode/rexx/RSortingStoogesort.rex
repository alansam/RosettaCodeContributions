/* Rexx */
-- =============================================================================

iList = .array~of( 1, 4, 5, 3, -6, 3, 7, 10, -2, -5, 7, 5, 9, -3, 7)
sList = iList~allItems()

placesList = .list~of( -
    "UK  London",     "US  New York",   "US  Boston",     "US  Washington" -
  , "UK  Washington", "US  Birmingham", "UK  Birmingham", "UK  Boston"     -
)

sList = stoogeSort(sList)
sortedList = stoogeSort(placesList~allItems())

iLists = .list~of(iList, sList)
loop icl over iLists
  rpt = ''
  loop ct over icl
    rpt = rpt ct
    end ct
    say '['rpt~strip()~changestr(' ', ',')']'
  end icl

say
sLists = .list~of(placesList, sortedList)
loop scl over sLists
  loop ct over scl
    say ct
    end ct
    say
  end scl

return

-- -----------------------------------------------------------------------------
::routine stoogeSort
  use arg L_, i_ = 1, j_ = '*'
  if j_ = '*' then j_ = L_~items()

  /*
   * <pre>
   * algorithm stoogesort(array L, i = 0, j = length(L)-1)
   *   if L[j] < L[i] then
   *     L[i] <-> L[j]
   *   if j - i > 1 then
   *     t := (j - i + 1)/3
   *     stoogesort(L, i  , j-t)
   *     stoogesort(L, i+t, j  )
   *     stoogesort(L, i  , j-t)
   *   return L
   * </pre>
   */

  rL_ = L_~allItems()
  if rL_[j_] < rL_[i_] then do
    Lt = rL_[i_]
    rL_~put(rL_[j_], i_)
    rL_~put(Lt, j_)
    end
  if j_ - i_ > 1 then do
    t_ = (j_ - i_ + 1) % 3
    rL_ = stoogeSort(rL_, i_, j_ - t_)
    rL_ = stoogeSort(rL_, i_ + t_, j_)
    rL_ = stoogeSort(rL_, i_, j_ - t_)
    end

  return rL_

-- =============================================================================

