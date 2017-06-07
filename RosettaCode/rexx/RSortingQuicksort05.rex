/* Rexx */

-- =============================================================================
--trace ?r;nop

placesList = .array~of( -
    "UK  London",     "US  New York" -
  , "US  Boston",     "US  Washington" -
  , "UK  Washington", "US  Birmingham" -
  , "UK  Birmingham", "UK  Boston" -
)

riverData = riverData()
stateData = stateData()
lists = .array~of( -
    placesList -
  , quickSortSimple(placesList~allItems()) -
  , quickSortInplace(placesList~allItems()) -
  , riverData -
  , quickSortSimple(riverData~allItems()) -
  , quickSortInplace(riverData~allItems()) -
  , stateData -
  , quickSortSimple(stateData~allItems()) -
  , quickSortInplace(stateData~allItems()) -
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

  /*
   * function quicksort(array)
   * less, equal, greater := three empty arrays
   * if length(array) > 1  
   *   pivot := select any element of array
   *   for each x in array
   *     if x < pivot then add x to less
   *     if x = pivot then add x to equal
   *     if x > pivot then add x to greater
   *   quicksort(less)
   *   quicksort(greater)
   *   array := concatenate(less, equal, greater)
   */

  if array~items() > 1 then do
    less    = .array~new()
    equal   = .array~new()
    greater = .array~new()

    pivot = array[Random(1, array~items())]
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

  /*
   * function quicksort(array, 'left', 'right')
   *
   *   // If the list has 2 or more items
   *   if 'left' < 'right'
   *
   *     // See "Choice of pivot" section below for possible choices
   *     choose any 'pivotIndex' such that 'left' <= 'pivotIndex' <= 'right'
   *
   *     // Get lists of bigger and smaller items and final position of pivot
   *     'pivotNewIndex' := partition(array, 'left', 'right', 'pivotIndex')
   *
   *     // Recursively sort elements smaller than the pivot
   *     quicksort(array, 'left', 'pivotNewIndex' - 1)
   *
   *     // Recursively sort elements at least as big as the pivot
   *     quicksort(array, 'pivotNewIndex' + 1, 'right')
   */

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

  /*
   * // left is the index of the leftmost element of the array
   * // right is the index of the rightmost element of the array (inclusive)
   * //   number of elements in subarray = right-left+1
   * function partition(array, 'left', 'right', 'pivotIndex')
   *  'pivotValue' := array['pivotIndex']
   *  swap array['pivotIndex'] and array['right']  // Move pivot to end
   *  'storeIndex' := 'left'
   *  for 'i' from 'left' to 'right' - 1  // left <= i < right
   *    if array['i'] < 'pivotValue'
   *      swap array['i'] and array['storeIndex']
   *      'storeIndex' := 'storeIndex' + 1
   *  swap array['storeIndex'] and array['right']  // Move pivot to its final place
   *  return 'storeIndex'
   */

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
      ixStore = ixStore + 1
      end
    end i_
  storeValue = array[ixStore]
  rValue     = array[ixR]
  array~put(rValue, ixStore)
  array~put(storeValue, ixR)

  return ixStore

-- -----------------------------------------------------------------------------
::routine isTrue
  return 1 == 1

-- -----------------------------------------------------------------------------
::routine isFalse
  return \isTrue()

-- -----------------------------------------------------------------------------
::routine riverData

  data = .array~of( -
       "Chattahoochee River:                Alabama, Georgia" -
    ,  "Colorado River:                     Arizona, Nevada, California, Baja California (Mexico)" -
    ,  "St. Francis River:                  Arkansas, Missouri" -
    ,  "Poteau River:                       Arkansas, Oklahoma" -
    ,  "Byram River:                        Connecticut, New York" -
    ,  "Pawcatuck River:                    Connecticut, Rhode Island" -
    ,  "Perdido River:                      Florida, Alabama" -
    ,  "St. Marys River:                    Florida, Georgia" -
    ,  "Chattooga River:                    Georgia, South Carolina" -
    ,  "Tugaloo River:                      Georgia, South Carolina" -
    ,  "Snake River:                        Idaho, Washington, Oregon" -
    ,  "Wabash River:                       Illinois, Indiana" -
    ,  "Ohio River:                         Illinois, Indiana, Ohio, Kentucky, West Virginia" -
    ,  "Des Moines River:                   Iowa, Missouri" -
    ,  "Tennessee River:                    Kentucky, Tennessee, Mississippi, Alabama" -
    ,  "Big Sandy River:                    Kentucky, West Virginia" -
    ,  "Tug Fork River:                     Kentucky, West Virginia, Virginia" -
    ,  "Monument Creek:                     Maine, New Brunswick (Canada)" -
    ,  "St. Croix River:                    Maine, New Brunswick (Canada)" -
    ,  "Piscataqua River:                   Maine, New Hampshire" -
    ,  "St. Francis River:                  Maine, Quebec (Canada)" -
    ,  "St. John River:                     Maine, Quebec (Canada)" -
    ,  "Pocomoke River:                     Maryland, Virginia" -
    ,  "Potomac River:                      Maryland, Virginia, city of Washington (District of Columbia), West Virginia" -
    ,  "Montreal River:                     Michigan (upper peninsula ), Wisconsin" -
    ,  "Detroit River:                      Michigan, Ontario (Canada)" -
    ,  "St. Clair River:                    Michigan, Ontario (Canada)" -
    ,  "St. Marys River:                    Michigan, Ontario (Canada)" -
    ,  "Brule River:                        Michigan, Wisconsin" -
    ,  "Menominee River:                    Michigan, Wisconsin" -
    ,  "Pigeon River:                       Minnesota, Ontario (Canada)" -
    ,  "Rainy River:                        Minnesota, Ontario (Canada)" -
    ,  "St. Croix River:                    Minnesota, Wisconsin" -
    ,  "St. Louis River:                    Minnesota, Wisconsin" -
    ,  "Mississippi River:                  Minnesota, Wisconsin, Iowa, Illinois, Missouri, Kentucky, Tennesse, Arkansas, Mississippi, Louisiana" -
    ,  "Pearl River:                        Mississippi, Louisiana" -
    ,  "Halls Stream:                       New Hampshire, Canada" -
    ,  "Salmon Falls River:                 New Hampshire, Maine" -
    ,  "Connecticut River:                  New Hampshire, Vermont" -
    ,  "Hudson River (lower part only):     New Jersey, New York" -
    ,  "Arthur Kill:                        New Jersey, New York (tidal strait)" -
    ,  "Kill Van Kull:                      New Jersey, New York (tidal strait)" -
    ,  "Rio Grande:                         New Mexico, Texas, Tamaulipas (Mexico), Nuevo Leon (Mexico), Coahuila De Zaragoza (Mexico), Chihuahua (Mexico)" -
    ,  "Niagara River:                      New York, Ontario (Canada)" -
    ,  "St. Lawrence River:                 New York, Ontario (Canada)" -
    ,  "Delaware River:                     New York, Pennsylvania, New Jersey, Delaware" -
    ,  "Catawba River:                      North Carolina, South Carolina" -
    ,  "Red River of the North:             North Dakota, Minnesota" -
    ,  "Great Miami River (mouth only):     Ohio, Indiana" -
    ,  "Arkansas River:                     Oklahoma, Arkansas" -
    ,  "Palmer River:                       Rhode Island, Massachusetts" -
    ,  "Runnins River:                      Rhode Island, Massachusetts" -
    ,  "Savannah River:                     South Carolina, Georgia" -
    ,  "Big Sioux River:                    South Dakota, Iowa" -
    ,  "Bois de Sioux River:                South Dakota, Minnesota, North Dakota" -
    ,  "Missouri River:                     South Dakota, Nebraska, Iowa, Missouri, Kansas" -
    ,  "Sabine River:                       Texas, Louisiana" -
    ,  "Red River (Mississippi watershed):  Texas, Oklahoma, Arkansas" -
    ,  "Poultney River:                     Vermont, New York" -
    ,  "Blackwater River:                   Virginia, North Carolina" -
    ,  "Columbia River:                     Washington, Oregon" -
  )
 
  return data

-- -----------------------------------------------------------------------------
::routine stateData

  data = .array~of( -
       'MAE  Maine' -
    ,  'CAL  California' -
    ,  'KAN  Kansas' -
    ,  'MAS  Massachusztts' -
    ,  'WAS  Washington' -
    ,  'HAW  Hawaii' -
    ,  'NCR  North Carolina' -
    ,  'SCR  South Carolina' -
    ,  'IDA  Idaho' -
    ,  'NDK  North Dakota' -
    ,  'SDK  South Dakota' -
    ,  'NEB  Nebraska' -
    ,  'DEL  Delaware' -
    ,  'PEN  Pennsylvania' -
    ,  'TEN  Tennessee' -
    ,  'GEO  Georgia' -
    ,  'VER  Vermont' -
    ,  'NEV  Nevada' -
    ,  'TEX  Texas' -
    ,  'VGI  Virginia' -
    ,  'OHI  Ohio' -
    ,  'NHM  New Hampshire' -
    ,  'RHO  Rhode Island and Providence Plantations' -
    ,  'MIC  Michigan' -
    ,  'MIN  Minnesota' -
    ,  'MIS  Mississippi' -
    ,  'WIS  Wisconsin' -
    ,  'OKA  Oklahoma' -
    ,  'ALA  Alabama' -
    ,  'FLA  Florida' -
    ,  'MLD  Maryland' -
    ,  'ALK  Alaska' -
    ,  'ILL  Illinois' -
    ,  'NMX  New Mexico' -
    ,  'IND  Indiana' -
    ,  'MOE  Missouri' -
    ,  'COL  Colorado' -
    ,  'CON  Connecticut' -
    ,  'MON  Montana' -
    ,  'LOU  Louisiana' -
    ,  'IOW  Iowa' -
    ,  'ORE  Oregon' -
    ,  'ARK  Arkansas' -
    ,  'ARZ  Arizona' -
    ,  'UTH  Utah' -
    ,  'KTY  Kentucky' -
    ,  'WVG  West Virginia' -
    ,  'NWJ  New Jersey' -
    ,  'NYK  New York' -
    ,  'WYO  Wyoming' -
  )

  return data

-- =============================================================================

