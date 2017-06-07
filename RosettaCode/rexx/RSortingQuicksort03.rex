/*REXX program sorts an array using the quicksort method.          */
call genR                              /*generate array elements.  */
call showR 'before sort'               /*show before array elements*/
call quickSort highItem                /*invoke the quick sort.    */
call showR ' after sort'               /*show  after array elements*/
exit
/*─────────────────────────────────────QUICKSORT subroutine───────-*/
quickSort: procedure expose !_.
a.1=1
b.1=arg(1)
?_=1
 
  do while ?_\==0
  l=a.?_
  t=b.?_
  ?_=?_-1
  if t<2 then iterate
  h=l+t-1
  ?=l+t%2
  if !_.h<!_.l then if !_.?<!_.h then do;p=!_.h;!_.h=!_.l;end
                             else if !_.?>!_.l then p=!_.l
                                             else do;p=!_.?;!_.?=!_.l;end
             else if !_.?<!_.l then p=!_.l
                             else if !_.?>!_.h then do;p=!_.h;!_.h=!_.l;end
                                             else do;p=!_.?;!_.?=!_.l;end
  j=l+1
  k=h
     do forever
          do j=j       while j<=k & !_.j<=p; end
          do k=k by -1 while j <k & !_.k>=p; end
     if j>=k then leave
     _=!_.j; !_.j=!_.k; !_.k=_
     end
  k=j-1; !_.l=!_.k; !_.k=p
  ?_=?_+1
  if j<=? then do; a.?_=j; b.?_=h-j+1; ?_=?_+1; a.?_=l; b.?_=k-l;   end
          else do; a.?_=l; b.?_=k-l;   ?_=?_+1; a.?_=j; b.?_=h-j+1; end
  end
 
return
/*─────────────────────────────────────genR subroutine────────────-*/
genR: !_.=''                            /*assign default value.     */
!_.1 ="------------------- Rivers that form part of a state's (USA) border -----------------------------"
!_.2 ="========================================================================================================================================"
!_.3 ="Chattahoochee River:                Alabama, Georgia"
!_.4 ="Colorado River:                     Arizona, Nevada, California, Baja California (Mexico)"
!_.5 ="St. Francis River:                  Arkansas, Missouri"
!_.6 ="Poteau River:                       Arkansas, Oklahoma"
!_.7 ="Byram River:                        Connecticut, New York"
!_.8 ="Pawcatuck River:                    Connecticut, Rhode Island"
!_.9 ="Perdido River:                      Florida, Alabama"
!_.10="St. Marys River:                    Florida, Georgia"
!_.11="Chattooga River:                    Georgia, South Carolina"
!_.12="Tugaloo River:                      Georgia, South Carolina"
!_.13="Snake River:                        Idaho, Washington, Oregon"
!_.14="Wabash River:                       Illinois, Indiana"
!_.15="Ohio River:                         Illinois, Indiana, Ohio, Kentucky, West Virginia"
!_.16="Des Moines River:                   Iowa, Missouri"
!_.17="Tennessee River:                    Kentucky, Tennessee, Mississippi, Alabama"
!_.18="Big Sandy River:                    Kentucky, West Virginia"
!_.19="Tug Fork River:                     Kentucky, West Virginia, Virginia"
!_.20="Monument Creek:                     Maine, New Brunswick (Canda)"
!_.21="St. Croix River:                    Maine, New Brunswick (Canda)"
!_.22="Piscataqua River:                   Maine, New Hampshire"
!_.23="St. Francis River:                  Maine, Quebec (Canada)"
!_.24="St. John River:                     Maine, Quebec (Canada)"
!_.25="Pocomoke River:                     Maryland, Virginia"
!_.26="Potomac River:                      Maryland, Virginia, city of Washington (District of Columbia), West Virginia"
!_.27="Montreal River:                     Michigan (upper peninsula ), Wisconsin"
!_.28="Detroit River:                      Michigan, Ontario (Canada)"
!_.29="St. Clair River:                    Michigan, Ontario (Canada)"
!_.30="St. Marys River:                    Michigan, Ontario (Canada)"
!_.31="Brule River:                        Michigan, Wisconsin"
!_.32="Menominee River:                    Michigan, Wisconsin"
!_.33="Pigeon River:                       Minnesota, Ontario (Canada)"
!_.34="Rainy River:                        Minnesota, Ontario (Canada)"
!_.35="St. Croix River:                    Minnesota, Wisconsin"
!_.36="St. Louis River:                    Minnesota, Wisconsin"
!_.37="Mississippi River:                  Minnesota, Wisconsin, Iowa, Illinois, Missouri, Kentucky, Tennesse, Arkansas, Mississippi, Louisiana"
!_.38="Pearl River:                        Mississippi, Louisiana"
!_.39="Halls Stream:                       New Hampshire, Canada"
!_.40="Salmon Falls River:                 New Hampshire, Maine"
!_.41="Connecticut River:                  New Hampshire, Vermont"
!_.42="Hudson River (lower part only):     New Jersey, New York"
!_.43="Arthur Kill:                        New Jersey, New York (tidal strait)"
!_.44="Kill Van Kull:                      New Jersey, New York (tidal strait)"
!_.45="Rio Grande:                         New Mexico, Texas, Tamaulipas (Mexico), Nuevo Leon (Mexico), Coahuila De Zaragoza (Mexico), Chihuahua (Mexico)"
!_.46="Niagara River:                      New York, Ontario (Canada)"
!_.47="St. Lawrence River:                 New York, Ontario (Canada)"
!_.48="Delaware River:                     New York, Pennsylvania, New Jersey, Delaware"
!_.49="Catawba River:                      North Carolina, South Carolina"
!_.50="Red River of the North:             North Dakota, Minnesota"
!_.51="Great Miami River (mouth only):     Ohio, Indiana"
!_.52="Arkansas River:                     Oklahoma, Arkansas"
!_.53="Palmer River:                       Rhode Island, Massachusetts"
!_.54="Runnins River:                      Rhode Island, Massachusetts"
!_.55="Savannah River:                     South Carolina, Georgia"
!_.56="Big Sioux River:                    South Dakota, Iowa"
!_.57="Bois de Sioux River:                South Dakota, Minnesota, North Dakota"
!_.58="Missouri River:                     South Dakota, Nebraska, Iowa, Missouri, Kansas"
!_.59="Sabine River:                       Texas, Louisiana"
!_.60="Red River (Mississippi watershed):  Texas, Oklahoma, Arkansas"
!_.61="Poultney River:                     Vermont, New York"
!_.62="Blackwater River:                   Virginia, North Carolina"
!_.63="Columbia River:                     Washington, Oregon"
 
  do highItem=1 while !_.highItem\==''  /*find how many entries.    */
  end
 
highItem=highItem-1                    /*adjust highItem slightly. */
return
/*─────────────────────────────────────showR subroutine───────────-*/
showR: widthH=length(highItem)         /*maximum width of any line.*/
 
  do j=1 for highItem
  say 'element' right(j,widthH) arg(1)':' !_.j
  end
 
say copies('─',80)                     /*show a separator line.    */
return

