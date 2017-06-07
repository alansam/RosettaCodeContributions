/* Generated from 'RSortingStoogesortArray.nrx' 21 Sep 2011 12:15:05 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RSortingStoogesortArray{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortingStoogesortArray.nrx";
 
 public static void main(java.lang.String $0s[]){
  int iList[];
  int sList[];
  int lists[][];
  int ln=0;
  int cl[]=null;
  netrexx.lang.Rexx rpt=null;
  int ct=0;
  iList=new int[]{1,4,5,3,-6,3,7,10,-2,-5,7,5,9,-3,7};
  sList=java.util.Arrays.copyOf(iList,iList.length);
  
  sList=stoogeSort(sList);
  
  lists=new int[][]{iList,sList};
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   rpt=new netrexx.lang.Rexx("");
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    rpt=rpt.OpCcblank(null,new netrexx.lang.Rexx(cl[ct]));
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say(($01.OpCc(null,rpt.strip().changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(',')))).OpCc(null,$02));
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
  int Lt=0;
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
  
  if (L_[j_]<L_[i_]) 
   {
    Lt=L_[i_];
    L_[i_]=L_[j_];
    L_[j_]=Lt;
   }
  if ((j_-i_)>1) 
   {
    t_=(((j_-i_)+1))/3;
    L_=stoogeSort(L_,i_,j_-t_);
    L_=stoogeSort(L_,i_+t_,j_);
    L_=stoogeSort(L_,i_,j_-t_);
   }
  
  return L_;
  }
 
 private RSortingStoogesortArray(){return;}
 }
