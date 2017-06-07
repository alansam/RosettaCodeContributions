/* Rexx */

call demo
return
exit

-- -----------------------------------------------------------------------------
--  Gnome sort implementation
-- -----------------------------------------------------------------------------
::routine gnomeSort
--trace ?r;nop
  use arg ra, sAsc = ''
  if sAsc = '' then sAsc = isTrue()

  /*
   * <pre>
   * function gnomeSort(a[0..size-1])
   *   i := 1
   *   j := 2
   *   while i < size do
   *     if a[i-1] <= a[i] then
   *       // for descending sort, use >= for comparison
   *       i := j
   *       j := j + 1 
   *     else
   *       swap a[i-1] and a[i]
   *       i := i - 1
   *       if i = 0 then
   *         i := j
   *         j := j + 1
   *       endif
   *     endif
   *   done
   * </pre>
   */

  sDsc = \sAsc -- Ascending/descending switches
  i_ = 1
  j_ = 2
  loop label i_ while i_ < ra~items()
    ctx = (ra~get(i_ - 1))~compareTo(ra~get(i_))
    if (sAsc & ctx <= 0) | (sDsc & ctx >= 0) then do
      i_ = j_
      j_ = j_ + 1
      end
    else do
      swap = ra~get(i_)
      ra~set(i_, ra~get(i_ - 1))
      ra~set(i_ - 1, swap)
      i_ = i_ - 1
      if i_ = 0 then do
        i_ = j_
        j_ = j_ + 1
        end
      end
    end i_

  return ra

-- -----------------------------------------------------------------------------
-- Demonstrate the implementation
-- -----------------------------------------------------------------------------
::routine demo
  placesList = .nlist~of( -
      "UK  London",     "US  New York",   "US  Boston",     "US  Washington" -
    , "UK  Washington", "US  Birmingham", "UK  Birmingham", "UK  Boston"     -
  )

  riverData = riverData()
  stateData = stateData()
  lists = .nlist~of( -
      placesList -
    , gnomeSort(placesList~copy()) -
    , riverData -
    , gnomeSort(riverData~copy()) -
    , stateData -
    , gnomeSort(stateData~copy()) -
  )

  loop ln = 0 to lists~items() - 1
    cl = lists[ln]
    loop ct = 0 to cl~items() - 1
      say right(ct + 1, 3)':' cl[ct]
      end ct
    say
    end ln

  i_.0 = 2
  i_.1 = .nlist~of(3, 3, 1, 2, 4, 3, 5, 6)
  i_.2 = gnomeSort(i_.1~copy())
  loop s_ = 1 to i_.0
    ss = ''
    loop x_ = 0 to i_.s_~items() - 1
      ss ||= right(i_.s_~get(x_), 3)' '
      end x_
    say strip(ss, 'T')
    end s_

  return

::routine riverData -- inheritable constant binary returns String[]

  data = .nlist~of( -
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

::routine stateData -- inheritable constant binary returns String[]

  data = .nlist~of( -
       'MAE  Maine' -
    ,  'CAL  California' -
    ,  'KAN  Kansas' -
    ,  'MAS  Massachusetts' -
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

-- -----------------------------------------------------------------------------
::routine isTrue
  return 1 == 1

-- -----------------------------------------------------------------------------
::routine isFalse
  return \isTrue()

-- -----------------------------------------------------------------------------
-- Helper class.  Map get and set methods for easier conversion from java.util.List
-- -----------------------------------------------------------------------------
::class NList mixinclass List public

-- Map get() to at()
::method get
  use arg ix
  return self~at(ix)

-- Map set() to put()
::method set
  use arg ix, item
  self~put(item, ix)
  return

