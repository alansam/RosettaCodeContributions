/* Rexx */

placesList = .nlist~of( -
    "UK  London",     "US  New York",   "US  Boston",     "US  Washington" -
  , "UK  Washington", "US  Birmingham", "UK  Birmingham", "UK  Boston"     -
)

riverData = riverData()
stateData = stateData()
lists = .array~of( -
    placesList -
  , shellSort(placesList~copy()) -
  , riverData -
  , shellSort(riverData~copy()) -
  , stateData -
  , shellSort(stateData~copy()) -
  )

loop ln = 1 to lists~items()
  cl = lists[ln]
  k_ = 0
  loop ct = 0 to cl~items() - 1
    k_ += 1
    say right(k_, 4)':' cl[ct]
    end ct
    say
  end ln

return

::routine shellSort
  use arg ra

  /*
   * input: an array a of length n with array elements numbered 0 to n − 1
   * <pre>
   * inc <- round(n/2)
   * while inc > 0 do:
   *   for i = inc .. n - 1 do:
   *     temp <- a[i]
   *     j <- i
   *     while j >= inc and a[j − inc] > temp do:
   *       a[j] <- a[j - inc]
   *       j <- j − inc
   *     a[j] <- temp
   *   inc <- round(inc / 2.2)
   * </pre>
   */

  n = ra~items()
  inc = format(n / 2.0,, 0)
  loop label inc while inc > 0
    loop i_ = inc to n - 1
      temp = ra~get(i_)
      j_ = i_
      loop label j_ while j_ >= inc
        if \(ra~get(j_ - inc) > temp) then leave j_
        ra~set(j_, ra~get(j_ - inc))
        j_ = j_ - inc
        end j_
      ra~set(j_, temp)
      end i_
    inc = format(inc / 2.2,, 0)
    end inc

  return ra

::routine isTrue
  return 1 == 1

::routine isFalse
  return \isTrue()

::routine riverData

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

::routine stateData

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

/* Helper class.  Map get and set methods for easier conversion from java.util.List */
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

