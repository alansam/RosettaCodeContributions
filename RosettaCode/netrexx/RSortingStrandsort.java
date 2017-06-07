/* Generated from 'RSortingStrandsort.nrx' 21 Sep 2011 12:15:05 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingStrandsort{
 private static final java.lang.String $0="RSortingStrandsort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String riverData[];
  java.lang.String stateData[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  java.util.ArrayList i1;
  java.util.ArrayList i2;
  java.util.ArrayList i3;
  java.util.ArrayList ilists[];
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  //sortedList = strandSort(String[] Arrays.copyOf(placesList, placesList.length))
  
  riverData=riverData();
  stateData=stateData();
  lists=new java.lang.String[][]{placesList,strandSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,strandSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,strandSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    netrexx.lang.RexxIO.Say(cl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  netrexx.lang.RexxIO.Say("");
  i1=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(3),new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(4),new java.lang.Integer(5)}))));
  i2=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(3),new java.lang.Integer(3),new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(4),new java.lang.Integer(5)}))));
  i3=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(3),new java.lang.Integer(3),new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(4),new java.lang.Integer(3),new java.lang.Integer(5),new java.lang.Integer(6)}))));
  
  ilists=new java.util.ArrayList[]{i1,strandSort((java.util.List)i1),i2,strandSort((java.util.List)i2),i3,strandSort((java.util.List)i3)};
  
  
  
  
  
  
  
  {int $3=ilists.length-1;ln=0;ln:for(;ln<=$3;ln++){
   netrexx.lang.RexxIO.Say(ilists[ln].toString());
   }
  }/*ln*/
  
  return;
  }

 
 public static final java.lang.String[] strandSort(java.lang.String A[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[A.length];
  al=(java.util.List)(strandSort(java.util.Arrays.asList((java.lang.Object[])A)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList strandSort(java.util.List Alst){
  java.util.ArrayList A;
  java.util.ArrayList result;
  java.util.ArrayList sublist=null;
  int i_=0;
  
  /*
   * <pre>
   * procedure strandSort( A : list of sortable items ) defined as:
   *   while length( A ) > 0
   *     clear sublist
   *     sublist[ 0 ] := A[ 0 ]
   *     remove A[ 0 ]
   *     for each i in 0 to length( A ) - 1 do:
   *       if A[ i ] > sublist[ last ] then
   *         append A[ i ] to sublist
   *         remove A[ i ]
   *       end if
   *     end for
   *     merge sublist into results
   *   end while
   * return results
   * end procedure
   * </pre>
   */
  
  A=new java.util.ArrayList((java.util.Collection)Alst);
  result=new java.util.ArrayList();
  {A_:for(;;){if(!((A.size())>0))break;
   sublist=new java.util.ArrayList();
   sublist.add(A.get(0));
   A.remove(0);
   {i_=0;i_:for(;;i_++){if(!(i_<((A.size())-1)))break;
    if ((((java.lang.Comparable)(A.get(i_))).compareTo((java.lang.Object)((java.lang.Comparable)(sublist.get((sublist.size())-1)))))>0) 
     {
      sublist.add(A.get(i_));
      A.remove(i_);
     }
    }
   }/*i_*/
   result=merge((java.util.List)result,(java.util.List)sublist);
   }
  }/*A_*/
  
  return result;
  }

 
 public static final java.util.ArrayList merge(java.util.List left,java.util.List right){
  java.util.ArrayList result;
  
  result=new java.util.ArrayList();
  {mx:for(;;){if(!(((left.size())>0)&((right.size())>0)))break;
   if ((((java.lang.Comparable)(left.get(0))).compareTo((java.lang.Object)((java.lang.Comparable)(right.get(0)))))<=0) 
    {
     result.add(left.get(0));
     left.remove(0);
    }
   else 
    {
     result.add(right.get(0));
     right.remove(0);
    }
   }
  }/*mx*/
  if ((left.size())>0) 
   {
    result.addAll((java.util.Collection)left);
   }
  if ((right.size())>0) 
   {
    result.addAll((java.util.Collection)right);
   }
  
  return result;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }

 
 protected static final java.lang.String[] riverData(){
  java.lang.String data[];
  
  data=new java.lang.String[]{"Chattahoochee River:                Alabama, Georgia","Colorado River:                     Arizona, Nevada, California, Baja California (Mexico)","St. Francis River:                  Arkansas, Missouri","Poteau River:                       Arkansas, Oklahoma","Byram River:                        Connecticut, New York","Pawcatuck River:                    Connecticut, Rhode Island","Perdido River:                      Florida, Alabama","St. Marys River:                    Florida, Georgia","Chattooga River:                    Georgia, South Carolina","Tugaloo River:                      Georgia, South Carolina","Snake River:                        Idaho, Washington, Oregon","Wabash River:                       Illinois, Indiana","Ohio River:                         Illinois, Indiana, Ohio, Kentucky, West Virginia","Des Moines River:                   Iowa, Missouri","Tennessee River:                    Kentucky, Tennessee, Mississippi, Alabama","Big Sandy River:                    Kentucky, West Virginia","Tug Fork River:                     Kentucky, West Virginia, Virginia","Monument Creek:                     Maine, New Brunswick (Canada)","St. Croix River:                    Maine, New Brunswick (Canada)","Piscataqua River:                   Maine, New Hampshire","St. Francis River:                  Maine, Quebec (Canada)","St. John River:                     Maine, Quebec (Canada)","Pocomoke River:                     Maryland, Virginia","Potomac River:                      Maryland, Virginia, city of Washington (District of Columbia), West Virginia","Montreal River:                     Michigan (upper peninsula ), Wisconsin","Detroit River:                      Michigan, Ontario (Canada)","St. Clair River:                    Michigan, Ontario (Canada)","St. Marys River:                    Michigan, Ontario (Canada)","Brule River:                        Michigan, Wisconsin","Menominee River:                    Michigan, Wisconsin","Pigeon River:                       Minnesota, Ontario (Canada)","Rainy River:                        Minnesota, Ontario (Canada)","St. Croix River:                    Minnesota, Wisconsin","St. Louis River:                    Minnesota, Wisconsin","Mississippi River:                  Minnesota, Wisconsin, Iowa, Illinois, Missouri, Kentucky, Tennesse, Arkansas, Mississippi, Louisiana","Pearl River:                        Mississippi, Louisiana","Halls Stream:                       New Hampshire, Canada","Salmon Falls River:                 New Hampshire, Maine","Connecticut River:                  New Hampshire, Vermont","Hudson River (lower part only):     New Jersey, New York","Arthur Kill:                        New Jersey, New York (tidal strait)","Kill Van Kull:                      New Jersey, New York (tidal strait)","Rio Grande:                         New Mexico, Texas, Tamaulipas (Mexico), Nuevo Leon (Mexico), Coahuila De Zaragoza (Mexico), Chihuahua (Mexico)","Niagara River:                      New York, Ontario (Canada)","St. Lawrence River:                 New York, Ontario (Canada)","Delaware River:                     New York, Pennsylvania, New Jersey, Delaware","Catawba River:                      North Carolina, South Carolina","Red River of the North:             North Dakota, Minnesota","Great Miami River (mouth only):     Ohio, Indiana","Arkansas River:                     Oklahoma, Arkansas","Palmer River:                       Rhode Island, Massachusetts","Runnins River:                      Rhode Island, Massachusetts","Savannah River:                     South Carolina, Georgia","Big Sioux River:                    South Dakota, Iowa","Bois de Sioux River:                South Dakota, Minnesota, North Dakota","Missouri River:                     South Dakota, Nebraska, Iowa, Missouri, Kansas","Sabine River:                       Texas, Louisiana","Red River (Mississippi watershed):  Texas, Oklahoma, Arkansas","Poultney River:                     Vermont, New York","Blackwater River:                   Virginia, North Carolina","Columbia River:                     Washington, Oregon"};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return data;
  }

 
 protected static final java.lang.String[] stateData(){
  java.lang.String data[];
  
  data=new java.lang.String[]{"MAE  Maine","CAL  California","KAN  Kansas","MAS  Massachusetts","WAS  Washington","HAW  Hawaii","NCR  North Carolina","SCR  South Carolina","IDA  Idaho","NDK  North Dakota","SDK  South Dakota","NEB  Nebraska","DEL  Delaware","PEN  Pennsylvania","TEN  Tennessee","GEO  Georgia","VER  Vermont","NEV  Nevada","TEX  Texas","VGI  Virginia","OHI  Ohio","NHM  New Hampshire","RHO  Rhode Island and Providence Plantations","MIC  Michigan","MIN  Minnesota","MIS  Mississippi","WIS  Wisconsin","OKA  Oklahoma","ALA  Alabama","FLA  Florida","MLD  Maryland","ALK  Alaska","ILL  Illinois","NMX  New Mexico","IND  Indiana","MOE  Missouri","COL  Colorado","CON  Connecticut","MON  Montana","LOU  Louisiana","IOW  Iowa","ORE  Oregon","ARK  Arkansas","ARZ  Arizona","UTH  Utah","KTY  Kentucky","WVG  West Virginia","NWJ  New Jersey","NYK  New York","WYO  Wyoming"};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return data;
  }
 
 private RSortingStrandsort(){return;}
 }
