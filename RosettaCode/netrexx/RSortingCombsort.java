/* Generated from 'RSortingCombsort.nrx' 27 Sep 2011 13:10:32 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingCombsort{
 private static final java.lang.String $0="RSortingCombsort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String sortedList[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  sortedList=combSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)));
  
  lists=new java.lang.String[][]{placesList,sortedList};
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

 
 public static final java.lang.String[] combSort(java.lang.String input[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[input.length];
  al=(java.util.List)(combSort(java.util.Arrays.asList((java.lang.Object[])input)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList combSort(java.util.List input){
  java.util.ArrayList rinput;
  boolean swaps;
  int gap;
  int i_=0;
  java.lang.Object iVal=null;
  java.lang.Object gapVal=null;
  
  /*
   * <pre>
   * function combsort(array input)
   *   gap := input.size //initialize gap size
   *   loop until gap = 1 and swaps = 0
   *     //update the gap value for a next comb. Below is an example
   *     gap := int(gap / 1.25)
   *     if gap < 1
   *       //minimum gap is 1
   *       gap := 1
   *     end if
   *     i := 0
   *     swaps := 0 //see Bubble Sort for an explanation
   *     //a single "comb" over the input list
   *     loop until i + gap >= input.size //see Shell sort for similar idea
   *       if input[i] > input[i+gap]
   *         swap(input[i], input[i+gap])
   *         swaps := 1 // Flag a swap has occurred, so the
   *                    // list is not guaranteed sorted
   *       end if
   *       i := i + 1
   *     end loop
   *   end loop
   * end function
   * </pre>
   */
  
  rinput=new java.util.ArrayList((java.util.Collection)input);
  swaps=isTrue();
  gap=rinput.size();
  {boolean $3=true;comb:for(;;){if($3){$3=false;}else{if((gap==1)&((!swaps)))break;}
   gap=(int)(((float)gap)/1.25F);
   if (gap<1) 
    gap=1;
   i_=0;
   swaps=isFalse();
   {boolean $4=true;swaps:for(;;){if($4){$4=false;}else{if(((i_+gap))>=(rinput.size()))break;}
    iVal=rinput.get(i_);
    gapVal=rinput.get(i_+gap);
    if ((((java.lang.Comparable)iVal).compareTo((java.lang.Object)((java.lang.Comparable)gapVal)))>0) 
     {
      rinput.set(i_,gapVal);
      rinput.set(i_+gap,iVal);
      swaps=isTrue();
     }
    i_++;
    }
   }/*swaps*/
   }
  }/*comb*/
  
  input=(java.util.List)(new java.util.ArrayList((java.util.Collection)rinput));
  return (java.util.ArrayList)input;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RSortingCombsort(){return;}
 }
