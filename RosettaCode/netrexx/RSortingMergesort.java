/* Generated from 'RSortingMergesort.nrx' 27 Sep 2011 08:56:01 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingMergesort{
 private static final java.lang.String $0="RSortingMergesort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String riverData[];
  java.lang.String stateData[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  //sortedList = mergeSort(String[] Arrays.copyOf(placesList, placesList.length))
  riverData=riverData();
  stateData=stateData();
  lists=new java.lang.String[][]{placesList,mergeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,mergeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,mergeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    netrexx.lang.RexxIO.Say(cl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  return;
  }

 
 public static final java.lang.String[] mergeSort(java.lang.String m[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[m.length];
  al=(java.util.List)(mergeSort(java.util.Arrays.asList((java.lang.Object[])m)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList mergeSort(java.util.List m){
  java.util.ArrayList result;
  java.util.ArrayList left;
  java.util.ArrayList right;
  int middle=0;
  int x_=0;
  
  /*
   * <pre>
   * function mergesort(m)
   *   var list left, right, result
   *   if length(m) <= 1
   *     return m
   *   else
   *     var middle = length(m) / 2
   *     for each x in m up to middle - 1
   *       add x to left
   *     for each x in m at and after middle
   *       add x to right
   *     left = mergesort(left)
   *     right = mergesort(right)
   *     if last(left) <= first(right) 
   *       append right to left
   *       return left
   *     result = merge(left, right)
   *     return result
   * </pre>
   */
  
  result=new java.util.ArrayList(m.size());
  left=new java.util.ArrayList();
  right=new java.util.ArrayList();
  if ((m.size())>1) 
   {
    middle=(m.size())/2;
    {int $3=middle-1;x_=0;x_:for(;x_<=$3;x_++){
     left.add(m.get(x_));
     }
    }/*x_*/
    {int $4=(m.size())-1;x_=middle;x_:for(;x_<=$4;x_++){
     right.add(m.get(x_));
     }
    }/*x_*/
    left=mergeSort((java.util.List)left);
    right=mergeSort((java.util.List)right);
    if ((((java.lang.Comparable)(left.get((left.size())-1))).compareTo((java.lang.Object)((java.lang.Comparable)(right.get(0)))))<=0) 
     {
      left.addAll((java.util.Collection)right);
      result.addAll((java.util.Collection)m);
     }
    else 
     {
      result=merge((java.util.List)left,(java.util.List)right);
     }
   }
  else 
   {
    result.addAll((java.util.Collection)m);
   }
  
  return result;
  }

 
 public static final java.util.ArrayList merge(java.util.List left,java.util.List right){
  java.util.ArrayList result;
  
  /*
   * <pre>
   * function merge(left,right)
   *   var list result
   *   while length(left) > 0 and length(right) > 0
   *     if first(left) <= first(right)
   *       append first(left) to result
   *       left = rest(left)
   *     else
   *       append first(right) to result
   *       right = rest(right)
   *   if length(left) > 0 
   *     append rest(left) to result
   *   if length(right) > 0 
   *     append rest(right) to result
   *   return result
   * </pre>
   */
  
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
 
 private RSortingMergesort(){return;}
 }
