/* Generated from 'RSortingGnomesort.nrx' 21 Sep 2011 20:44:12 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingGnomesort{
 private static final java.lang.String $0="RSortingGnomesort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String riverData[];
  java.lang.String stateData[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  java.util.ArrayList i1;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  
  riverData=riverData();
  stateData=stateData();
  lists=new java.lang.String[][]{placesList,gnomeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,gnomeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,gnomeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    netrexx.lang.RexxIO.Say(cl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  i1=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(3),new java.lang.Integer(3),new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(4),new java.lang.Integer(3),new java.lang.Integer(5),new java.lang.Integer(6)}))));
  netrexx.lang.RexxIO.Say(i1.toString());
  netrexx.lang.RexxIO.Say(gnomeSort((java.util.List)i1).toString());
  
  return;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }

 
 public static final java.lang.String[] gnomeSort(java.lang.String a[]){
  return gnomeSort(a,isTrue());
  }
 public static final java.lang.String[] gnomeSort(java.lang.String a[],boolean sAsc){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(gnomeSort(java.util.Arrays.asList((java.lang.Object[])a),sAsc));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList gnomeSort(java.util.List a){
  return gnomeSort(a,isTrue());
  }
 public static final java.util.ArrayList gnomeSort(java.util.List a,boolean sAsc){
  boolean sDsc;
  java.util.ArrayList ra;
  int i_;
  int j_;
  int ctx=0;
  java.lang.Object swap=null;
  
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
  
  sDsc=(!sAsc); // Ascending/descending switches
  ra=new java.util.ArrayList((java.util.Collection)a);
  i_=1;
  j_=2;
  {i_:for(;;){if(!(i_<(ra.size())))break;
   ctx=((java.lang.Comparable)(ra.get(i_-1))).compareTo((java.lang.Object)((java.lang.Comparable)(ra.get(i_))));
   if (((sAsc&(ctx<=0)))|((sDsc&(ctx>=0)))) 
    {
     i_=j_;
     j_++;
    }
   else 
    {
     swap=ra.get(i_);
     ra.set(i_,ra.get(i_-1));
     ra.set(i_-1,swap);
     i_--;
     if (i_==0) 
      {
       i_=j_;
       j_++;
      }
    }
   }
  }/*i_*/
  
  return ra;
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
 
 private RSortingGnomesort(){return;}
 }
