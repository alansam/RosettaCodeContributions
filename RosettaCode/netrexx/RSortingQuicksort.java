/* Generated from 'RSortingQuicksort.nrx' 27 Sep 2011 08:56:01 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





//trace methods;nop


public class RSortingQuicksort{
 private static final java.lang.String $0="RSortingQuicksort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String riverData[];
  java.lang.String stateData[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  //sortedList = quickSortSimple(String[] Arrays.copyOf(placesList, placesList.length))
  //sortedInplace = quickSortInplace(String[] Arrays.copyOf(placesList, placesList.length))
  riverData=riverData();
  stateData=stateData();
  lists=new java.lang.String[][]{placesList,quickSortSimple((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),quickSortInplace((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,quickSortSimple((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),quickSortInplace((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,quickSortSimple((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length))),quickSortInplace((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
  
  
  
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

 
 public static final java.lang.String[] quickSortSimple(java.lang.String array[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[array.length];
  al=(java.util.List)(quickSortSimple(java.util.Arrays.asList((java.lang.Object[])array)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList quickSortSimple(java.util.List array){
  java.util.ArrayList less=null;
  java.util.ArrayList equal=null;
  java.util.ArrayList greater=null;
  java.lang.Object pivot=null;
  int x_=0;
  java.util.ArrayList out=null;
  
  /*
   * <pre>
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
   * </pre>
   */
  
  if ((array.size())>1) 
   {
    less=new java.util.ArrayList();
    equal=new java.util.ArrayList();
    greater=new java.util.ArrayList();
    
    pivot=array.get((new java.util.Random()).nextInt((array.size())-1));
    {int $3=(array.size())-1;x_=0;x_:for(;x_<=$3;x_++){
     if ((((java.lang.Comparable)(array.get(x_))).compareTo((java.lang.Object)((java.lang.Comparable)pivot)))<0) 
      less.add(array.get(x_));
     if ((((java.lang.Comparable)(array.get(x_))).compareTo((java.lang.Object)((java.lang.Comparable)pivot)))==0) 
      equal.add(array.get(x_));
     if ((((java.lang.Comparable)(array.get(x_))).compareTo((java.lang.Object)((java.lang.Comparable)pivot)))>0) 
      greater.add(array.get(x_));
     }
    }/*x_*/
    less=quickSortSimple((java.util.List)less);
    greater=quickSortSimple((java.util.List)greater);
    out=new java.util.ArrayList(array.size());
    out.addAll((java.util.Collection)less);
    out.addAll((java.util.Collection)equal);
    out.addAll((java.util.Collection)greater);
    
    array=(java.util.List)out;
   }
  
  return (java.util.ArrayList)array;
  }

 
 public static final java.lang.String[] quickSortInplace(java.lang.String array[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[array.length];
  al=(java.util.List)(quickSortInplace(java.util.Arrays.asList((java.lang.Object[])array)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList quickSortInplace(java.util.List array){
  return quickSortInplace(array,0,(array.size())-1);
  }
 public static final java.util.ArrayList quickSortInplace(java.util.List array,int ixL){
  return quickSortInplace(array,ixL,(array.size())-1);
  }
 public static final java.util.ArrayList quickSortInplace(java.util.List array,int ixL,int ixR){
  int ixP=0;
  /*
  function quicksort(array, 'left', 'right')
  
    // If the list has 2 or more items
    if 'left' < 'right'
  
      // See "Choice of pivot" section below for possible choices
      choose any 'pivotIndex' such that 'left' <= 'pivotIndex' <= 'right'
  
       // Get lists of bigger and smaller items and final position of pivot
      'pivotNewIndex' := partition(array, 'left', 'right', 'pivotIndex')
  
      // Recursively sort elements smaller than the pivot
       quicksort(array, 'left', 'pivotNewIndex' - 1)
  
      // Recursively sort elements at least as big as the pivot
      quicksort(array, 'pivotNewIndex' + 1, 'right')
   */
  
  //trace var ixP ixL ixR i_ ixStore;nop
  //trace var pivotValue lValue rValue iValue storeValue;nop
  
  if (ixL<ixR) 
   {
    //ixP = array.get(Random().nextInt(ixR))
    ixP=ixL+(((ixR-ixL))/2);
    ixP=quickSortInplacePartition(array,ixL,ixR,ixP);
    quickSortInplace(array,ixL,ixP-1);
    quickSortInplace(array,ixP+1,ixR);
   }
  
  array=(java.util.List)(new java.util.ArrayList((java.util.Collection)array));
  return (java.util.ArrayList)array;
  }

 
 public static final int quickSortInplacePartition(java.util.List array,int ixL,int ixR,int ixP){
  java.lang.Object pivotValue;
  java.lang.Object rValue;
  int ixStore;
  int i_=0;
  java.lang.Object iValue=null;
  java.lang.Object storeValue=null;
  
  /*
  // left is the index of the leftmost element of the array
  // right is the index of the rightmost element of the array (inclusive)
  //   number of elements in subarray = right-left+1
  function partition(array, 'left', 'right', 'pivotIndex')
    'pivotValue' := array['pivotIndex']
    swap array['pivotIndex'] and array['right']  // Move pivot to end
    'storeIndex' := 'left'
    for 'i' from 'left' to 'right' - 1  // left <= i < right
      if array['i'] < 'pivotValue'
        swap array['i'] and array['storeIndex']
        'storeIndex' := 'storeIndex' + 1
    swap array['storeIndex'] and array['right']  // Move pivot to its final place
    return 'storeIndex'
   */
  
  //trace var ixP ixL ixR i_ ixStore;nop
  //trace var pivotValue lValue rValue iValue storeValue;nop
  
  pivotValue=array.get(ixP);
  //lValue     = array.get(ixL)
  rValue=array.get(ixR);
  array.set(ixP,rValue);
  array.set(ixR,pivotValue);
  ixStore=ixL;
  {int $4=ixR-1;i_=ixL;i_:for(;i_<=$4;i_++){
   iValue=array.get(i_);
   if ((((java.lang.Comparable)iValue).compareTo((java.lang.Object)((java.lang.Comparable)pivotValue)))<0) 
    {
     storeValue=array.get(ixStore);
     array.set(i_,storeValue);
     array.set(ixStore,iValue);
     ixStore++;
    }
   }
  }/*i_*/
  storeValue=array.get(ixStore);
  rValue=array.get(ixR);
  array.set(ixStore,rValue);
  array.set(ixR,storeValue);
  
  return ixStore;
  }

 
 public static final java.util.ArrayList quickSortInplaceHasErrors(java.util.List array){
  java.lang.Object pivot=null;
  int left=0;
  int right=0;
  java.lang.Object valLeft=null;
  java.lang.Object valRight=null;
  java.util.ArrayList al=null;
  java.util.ArrayList ar=null;
  java.util.ArrayList out=null;
  
  /*
   * <pre>
   * function quicksort(array)
   * if length(array) > 1
   *   pivot := select any element of array
   *   left := first index of array
   *   right := last index of array
   *   while left <= right
   *     while array[left] < pivot
   *       left := left + 1
   *     while array[right] > pivot
   *       right := right - 1
   *     if left <= right
   *       swap array[left] with array[right]
   *       left := left + 1
   *       right := right - 1
   *   quicksort(array from first index to right)
   *   quicksort(array from left to last index)
   * </pre>
   */
  
  //trace var pivot left right valLeft valRight;nop
  
  if ((array.size())>1) 
   {
    pivot=array.get((new java.util.Random()).nextInt((array.size())-1));
    left=0;
    right=(array.size())-1;
    {lr:for(;;){if(!(left<=right))break;
     valLeft=array.get(left);
     {p1:for(;;){if(!((((java.lang.Comparable)valLeft).compareTo((java.lang.Object)((java.lang.Comparable)pivot)))<0))break;
      left++;
      valLeft=array.get(left);
      }
     }/*p1*/
     valRight=array.get(right);
     {p2:for(;;){if(!((((java.lang.Comparable)valRight).compareTo((java.lang.Object)((java.lang.Comparable)pivot)))>0))break;
      right--;
      valRight=array.get(right);
      }
     }/*p2*/
     if (left<=right) 
      {
       valLeft=array.get(left);
       valRight=array.get(right);
       array.set(left,valRight);
       array.set(right,valLeft);
       left++;
       right--;
      }
     }
    }/*lr*/
    al=new java.util.ArrayList((java.util.Collection)(array.subList(0,right)));
    ar=new java.util.ArrayList((java.util.Collection)(array.subList(left,array.size())));
    out=new java.util.ArrayList(array.size());
    al=quickSortInplace((java.util.List)al);
    ar=quickSortInplace((java.util.List)ar);
    out.addAll((java.util.Collection)al);
    out.addAll((java.util.Collection)ar);
    
    array=(java.util.List)out;
   }
  
  return (java.util.ArrayList)array;
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
 
 private RSortingQuicksort(){return;}
 }
