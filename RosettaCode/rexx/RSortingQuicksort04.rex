/* Rexx */
-- =============================================================================

placesList = .array~of( -
    "UK  London",     "US  New York" -
  , "US  Boston",     "US  Washington" -
  , "UK  Washington", "US  Birmingham" -
  , "UK  Birmingham", "UK  Boston" -
)

lists = .array~of( -
    placesList -
  , quickSortSimple(placesList~allItems()) -
  , quickSortInplace(placesList~allItems()) -
)

loop ln = 1 to lists~items()
  cl = lists[ln]
  loop ct = 1 to cl~items()
    say cl[ct]
    end ct
  say
  end ln

return

-- -----------------------------------------------------------------------------
::routine quickSortSimple
  use arg array

  if array~items() > 1 then do
    less    = .array~new()
    equal   = .array~new()
    greater = .array~new()

    pivot = array[random(1, array~items())]
    loop x_ = 1 to array~items()
      if array[x_] << pivot then less~append(array[x_])
      if array[x_] == pivot then equal~append(array[x_])
      if array[x_] >> pivot then greater~append(array[x_])
      end x_
    less    = quickSortSimple(less)
    greater = quickSortSimple(greater)
    out = .array~new(array~items())
    out~appendAll(less)
    out~appendAll(equal)
    out~appendAll(greater)

    array = out
    end

  return array

-- -----------------------------------------------------------------------------
::routine quickSortInplace
  use arg array, ixL = 1, ixR = '-1'
  if ixR = -1 then ixR = array~items()

  if ixL < ixR then do
    ixP = ixL + (ixR - ixL) % 2
    ixP = quickSortInplacePartition(array, ixL, ixR, ixP)
    call quickSortInplace array, ixL, ixP - 1
    call quickSortInplace array, ixP + 1, ixR
    end

  return array

-- -----------------------------------------------------------------------------
::routine quickSortInplacePartition
  use arg array, ixL ixR, ixP

  pivotValue = array[ixP]
  rValue     = array[ixR]
  array~put(rValue, ixP)
  array~put(pivotValue, ixR)
  ixStore = ixL
  loop i_ = ixL to ixR - 1
    iValue = array[i_]
    if iValue < pivotValue then do
      storeValue = array[ixStore]
      array~put(storeValue, i_)
      array~put(iValue, ixStore)
      ixStore += 1
      end
    end i_
  storeValue = array[ixStore]
  rValue     = array[ixR]
  array~put(rValue, ixStore)
  array~put(storeValue, ixR)

  return ixStore

-- =============================================================================

