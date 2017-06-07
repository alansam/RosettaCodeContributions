/* Generated from 'RSortingSelectionsort.nrx' 28 Jun 2013 13:45:24 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RSortingSelectionsort{
 private static final java.lang.String $0="RSortingSelectionsort.nrx";
 
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
  lists=new java.lang.String[][]{placesList,selectionSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,selectionSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,selectionSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
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

 
 public static final java.lang.String[] selectionSort(java.lang.String a[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(selectionSort(java.util.Arrays.asList((java.lang.Object[])a)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList selectionSort(java.util.List a){
  java.util.ArrayList ra;
  int n;
  int iPos=0;
  int iMin=0;
  int i_=0;
  java.lang.Object swap=null;
  
  //  /* a[0] to a[n-1] is the array to sort */
  //
  //  int iPos;
  //  int iMin;
  //   
  //  /* advance the position through the entire array */
  //  /*   (could do iPos < n-1 because single element is also min element) */
  //  for (iPos = 0; iPos < n; iPos++) {
  //    /* find the min element in the unsorted a[iPos .. n-1] */
  //   
  //    /* assume the min is the first element */
  //    iMin = iPos;
  //    /* test against all other elements */
  //    for (i = iPos+1; i < n; i++) {
  //      /* if this element is less, then it is the new minimum */  
  //      if (a[i] < a[iMin]) {
  //          /* found new minimum; remember its index */
  //          iMin = i;
  //      }
  //    }
  //   
  //    /* iMin is the index of the minimum element. Swap it with the current position */
  //    if ( iMin != iPos ) {
  //      swap(a, iPos, iMin);
  //    }
  //  }
  
  ra=new java.util.ArrayList((java.util.Collection)a);
  n=ra.size();
  
  
  
  
  {int $3=n-1;iPos=0;iPos:for(;iPos<=$3;iPos++){
   iMin=iPos;
   {int $4=n-1;i_=iPos+1;i_:for(;i_<=$4;i_++){
    if ((((java.lang.Comparable)(ra.get(i_))).compareTo((java.lang.Object)((java.lang.Comparable)(ra.get(iMin)))))<0) 
     {
      iMin=i_;
     }
    }
   }/*i_*/
   if (iMin!=iPos) 
    {
     swap=ra.get(iPos);
     ra.set(iPos,ra.get(iMin));
     ra.set(iMin,swap);
    }
   }
  }/*iPos*/
  
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
 
 private RSortingSelectionsort(){return;}
 }
