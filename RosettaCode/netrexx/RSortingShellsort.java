/* Generated from 'RSortingShellsort.nrx' 21 Sep 2011 12:15:05 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingShellsort{
 private static final java.lang.String $0="RSortingShellsort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String riverData[];
  java.lang.String stateData[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  
  riverData=riverData();
  stateData=stateData();
  lists=new java.lang.String[][]{placesList,shellSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,shellSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,shellSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
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

 
 public static final java.lang.String[] shellSort(java.lang.String a[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(shellSort(java.util.Arrays.asList((java.lang.Object[])a)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList shellSort(java.util.List a){
  java.util.ArrayList ra;
  int n;
  int inc;
  int i_=0;
  java.lang.Object temp=null;
  int j_=0;
  
  /*
   * input: an array a of length n with array elements numbered 0 to n ? 1
   * <pre>
   * inc <- round(n/2)
   * while inc > 0 do:
   *   for i = inc .. n - 1 do:
   *     temp <- a[i]
   *     j <- i
   *     while j >= inc and a[j ? inc] > temp do:
   *       a[j] <- a[j - inc]
   *       j <- j ? inc
   *     a[j] <- temp
   *   inc <- round(inc / 2.2)
   * </pre>
   */
  
  ra=new java.util.ArrayList((java.util.Collection)a);
  n=ra.size();
  inc=(int)(java.lang.Math.round((double)((float)n)/2.0F));
  {inc:for(;;){if(!(inc>0))break;
   {int $3=n-1;i_=inc;i_:for(;i_<=$3;i_++){
    temp=ra.get(i_);
    j_=i_;
    {j_:for(;;){if(!(j_>=inc))break;
     if ((!(((((java.lang.Comparable)(ra.get(j_-inc))).compareTo((java.lang.Object)((java.lang.Comparable)temp)))>0)))) 
      break j_;
     ra.set(j_,ra.get(j_-inc));
     j_=j_-inc;
     }
    }/*j_*/
    ra.set(j_,temp);
    }
   }/*i_*/
   inc=(int)(java.lang.Math.round((double)((float)inc)/2.2F));
   }
  }/*inc*/
  
  return ra;
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
 
 private RSortingShellsort(){return;}
 }
