/* Generated from 'RSortingBubblesort02.nrx' 20 Sep 2011 10:53:47 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingBubblesort02{
 private static final java.lang.String $0="RSortingBubblesort02.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String sortedList[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  sortedList=bubbleSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)));
  
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

 
 public static final java.lang.String[] bubbleSort(java.lang.String item[]){
  java.lang.String rl[];
  java.util.ArrayList al;
  
  rl=new java.lang.String[item.length];
  al=bubbleSort(java.util.Arrays.asList((java.lang.Object[])item));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList bubbleSort(java.util.List item){
  boolean hasChanged=false;
  int itemCount;
  java.util.ArrayList ritem;
  int index=0;
  java.lang.Object swap=null;
  
  /*
    This can be expressed in pseudocode as follows (assuming 1-based indexing):
  
    repeat
      hasChanged := false
      decrement itemCount
      repeat with index from 1 to itemCount
        if (item at index) > (item at (index + 1))
          swap (item at index) with (item at (index + 1))
          hasChanged := true
    until hasChanged = false
  
   */
  
  // adjusted for 0-based indexing
  
  
  itemCount=item.size();
  ritem=new java.util.ArrayList((java.util.Collection)item);
  {boolean $3=true;h_:for(;;){if($3){$3=false;}else{if((!hasChanged))break;}
   hasChanged=isFalse();
   itemCount--;
   {int $4=itemCount-1;index=0;index:for(;index<=$4;index++){
    if ((((java.lang.Comparable)(ritem.get(index))).compareTo((java.lang.Object)((java.lang.Comparable)(ritem.get(index+1)))))>0) 
     {
      swap=ritem.get(index);
      ritem.set(index,ritem.get(index+1));
      ritem.set(index+1,swap);
      hasChanged=isTrue();
     }
    }
   }/*index*/
   }
  }/*h_*/
  
  return ritem;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RSortingBubblesort02(){return;}
 }
