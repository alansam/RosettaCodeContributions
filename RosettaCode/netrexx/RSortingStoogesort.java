/* Generated from 'RSortingStoogesort.nrx' 21 Sep 2011 12:15:05 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingStoogesort{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortingStoogesort.nrx";
 
 public static void main(java.lang.String $0s[]){
  int iList[];
  int sList[];
  java.lang.String placesList[];
  java.lang.String sortedList[];
  int iLists[][];
  int ln=0;
  int icl[]=null;
  netrexx.lang.Rexx rpt=null;
  int ct=0;
  java.lang.String sLists[][];
  java.lang.String scl[]=null;
  iList=new int[]{1,4,5,3,-6,3,7,10,-2,-5,7,5,9,-3,7};
  sList=java.util.Arrays.copyOf(iList,iList.length);
  
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  
  sList=stoogeSort(sList);
  sortedList=stoogeSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)));
  
  iLists=new int[][]{iList,sList};
  {int $1=iLists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   icl=iLists[ln];
   rpt=new netrexx.lang.Rexx("");
   {int $2=icl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    rpt=rpt.OpCcblank(null,new netrexx.lang.Rexx(icl[ct]));
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say(($01.OpCc(null,rpt.strip().changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(',')))).OpCc(null,$02));
   }
  }/*ln*/
  
  netrexx.lang.RexxIO.Say("");
  sLists=new java.lang.String[][]{placesList,sortedList};
  {int $3=sLists.length-1;ln=0;ln:for(;ln<=$3;ln++){
   scl=sLists[ln];
   {int $4=scl.length-1;ct=0;ct:for(;ct<=$4;ct++){
    netrexx.lang.RexxIO.Say(scl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  return;
  }

 
 public static int[] stoogeSort(int L_[]){
  return stoogeSort(L_,0,L_.length-1);
  }
 public static int[] stoogeSort(int L_[],int i_){
  return stoogeSort(L_,i_,L_.length-1);
  }
 public static int[] stoogeSort(int L_[],int i_,int j_){
  int rl[];
  java.util.ArrayList al;
  int x_=0;
  
  rl=new int[L_.length];
  al=new java.util.ArrayList(L_.length);
  {int $5=L_.length-1;x_=0;x_:for(;x_<=$5;x_++){
   al.add((java.lang.Object)(new java.lang.Integer(L_[x_])));
   }
  }/*x_*/
  al=stoogeSort((java.util.List)al);
  {int $6=(al.size())-1;x_=0;x_:for(;x_<=$6;x_++){
   rl[x_]=((java.lang.Integer)(al.get(x_))).intValue();
   }
  }/*x_*/
  
  return rl;
  }

 
 public static java.lang.String[] stoogeSort(java.lang.String L_[]){
  return stoogeSort(L_,0,L_.length-1);
  }
 public static java.lang.String[] stoogeSort(java.lang.String L_[],int i_){
  return stoogeSort(L_,i_,L_.length-1);
  }
 public static java.lang.String[] stoogeSort(java.lang.String L_[],int i_,int j_){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[L_.length];
  al=(java.util.List)(stoogeSort(java.util.Arrays.asList((java.lang.Object[])L_)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static java.util.ArrayList stoogeSort(java.util.List L_){
  return stoogeSort(L_,0,(L_.size())-1);
  }
 public static java.util.ArrayList stoogeSort(java.util.List L_,int i_){
  return stoogeSort(L_,i_,(L_.size())-1);
  }
 public static java.util.ArrayList stoogeSort(java.util.List L_,int i_,int j_){
  java.util.ArrayList rL_;
  java.lang.Object Lt=null;
  int t_=0;
  
  /*
   * <pre>
   * algorithm stoogesort(array L, i = 0, j = length(L)-1)
   *   if L[j] < L[i] then
   *     L[i] <-> L[j]
   *   if j - i > 1 then
   *     t := (j - i + 1)/3
   *     stoogesort(L, i  , j-t)
   *     stoogesort(L, i+t, j  )
   *     stoogesort(L, i  , j-t)
   *   return L
   * </pre>
   */
  
  rL_=new java.util.ArrayList((java.util.Collection)L_);
  if ((((java.lang.Comparable)(rL_.get(j_))).compareTo((java.lang.Object)((java.lang.Comparable)(rL_.get(i_)))))<0) 
   {
    Lt=rL_.get(i_);
    rL_.set(i_,rL_.get(j_));
    rL_.set(j_,Lt);
   }
  if ((j_-i_)>1) 
   {
    t_=(((j_-i_)+1))/3;
    rL_=stoogeSort((java.util.List)rL_,i_,j_-t_);
    rL_=stoogeSort((java.util.List)rL_,i_+t_,j_);
    rL_=stoogeSort((java.util.List)rL_,i_,j_-t_);
   }
  
  return rL_;
  }
 
 private RSortingStoogesort(){return;}
 }
