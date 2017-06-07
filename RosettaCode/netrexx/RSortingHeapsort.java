/* Generated from 'RSortingHeapsort.nrx' 21 Sep 2011 12:15:05 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingHeapsort{
 private static final java.lang.String $0="RSortingHeapsort.nrx";
 
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
  lists=new java.lang.String[][]{placesList,heapSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length))),riverData,heapSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])riverData,riverData.length))),stateData,heapSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])stateData,stateData.length)))};
  
  
  
  
  
  
  
  
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

 
 public static final java.lang.String[] heapSort(java.lang.String a[]){
  return heapSort(a,a.length);
  }
 public static final java.lang.String[] heapSort(java.lang.String a[],int count){
  java.lang.String rl[];
  java.util.List al;
  
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(heapSort(java.util.Arrays.asList((java.lang.Object[])a),count));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList heapSort(java.util.List a){
  return heapSort(a,a.size());
  }
 public static final java.util.ArrayList heapSort(java.util.List a,int count){
  int iend;
  java.lang.Object swap=null;
  
  /*
   * function heapSort(a, count) is
   *   input: an unordered array a of length count
   *
   *   (first place a in max-heap order)
   *   heapify(a, count)
   *
   *   end := count - 1
   *   while end > 0 do
   *     (swap the root(maximum value) of the heap with the last element of the heap)
   *     swap(a[end], a[0])
   *     (put the heap back in max-heap order)
   *     siftDown(a, 0, end-1)
   *     (decrement the size of the heap so that the previous max value will stay in its proper place)
   *     end := end - 1
   */
  
  a=heapify(a,count);
  
  iend=count-1;
  {iend:for(;;){if(!(iend>0))break;
   swap=a.get(0);
   a.set(0,a.get(iend));
   a.set(iend,swap);
   a=siftDown(a,0,iend-1);
   iend--;
   }
  }/*iend*/
  
  return new java.util.ArrayList((java.util.Collection)a);
  }

 
 public static final java.util.List heapify(java.util.List a,int count){
  int start;
  
  /*
   * function heapify(a, count) is
   *    (start is assigned the index in a of the last parent node)
   *    start := (count - 2) / 2
   * 
   *    while start >= 0 do
   *       (sift down the node at index start to the proper place
   *        such that all nodes below the start index are in heap
   *        order)
   *       siftDown(a, start, count-1)
   *       start := start - 1
   *    (after sifting down the root all nodes/elements are in heap order)
   */
  
  start=((count-2))/2;
  
  {strt:for(;;){if(!(start>=0))break;
   a=siftDown(a,start,count-1);
   start--;
   }
  }/*strt*/
  
  return a;
  }

 
 public static final java.util.List siftDown(java.util.List a,int istart,int iend){
  int root;
  int child=0;
  java.lang.Object swap=null;
  
  /*
   * function siftDown(a, start, end) is
   *   (end represents the limit of how far down the heap to sift)
   *   root := start
   * 
   *   while root * 2 + 1 <= end do       (While the root has at least one child)
   *     child := root * 2 + 1           (root*2+1 points to the left child)
   *     (If the child has a sibling and the child's value is less than its sibling's...)
   *     if child + 1 <= end and a[child] < a[child + 1] then
   *       child := child + 1           (... then point to the right child instead)
   *     if a[root] < a[child] then     (out of max-heap order)
   *       swap(a[root], a[child])
   *       root := child                (repeat to continue sifting down the child now)
   *     else
   *       return
   */
  
  root=istart;
  
  {root:for(;;){if(!(((root*2)+1)<=iend))break;
   child=(root*2)+1;
   if ((child+1)<=iend) 
    {
     if ((((java.lang.Comparable)(a.get(child))).compareTo((java.lang.Object)((java.lang.Comparable)(a.get(child+1)))))<0) 
      {
       child++;
      }
    }
   if ((((java.lang.Comparable)(a.get(root))).compareTo((java.lang.Object)((java.lang.Comparable)(a.get(child)))))<0) 
    {
     swap=a.get(root);
     a.set(root,a.get(child));
     a.set(child,swap);
     root=child;
    }
   else 
    {
     break root;
    }
   }
  }/*root*/
  
  return a;
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
 
 private RSortingHeapsort(){return;}
 }
