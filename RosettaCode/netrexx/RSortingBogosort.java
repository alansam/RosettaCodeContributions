/* Generated from 'RSortingBogosort.nrx' 20 Sep 2011 10:53:47 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingBogosort{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("unsorted:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("sorted:  ");
 private static final java.lang.String $0="RSortingBogosort.nrx";
 
 private static boolean isSorted(java.util.List list){
  java.util.Iterator it;
  java.lang.Comparable last;
  java.lang.Comparable current=null;
  
  if (list.isEmpty()) 
   return isTrue();
  
  it=list.iterator();
  last=(java.lang.Comparable)(it.next());
  {i_:for(;;){if(!(it.hasNext()))break;
   current=(java.lang.Comparable)(it.next());
   if (new netrexx.lang.Rexx(last.compareTo((java.lang.Object)current)).OpGt(null,$01)) 
    return isFalse();
   last=current;
   }
  }/*i_*/
  
  return isTrue();
  }

 
 private static void bogoSort(java.util.List list){
  
  /*
   * Pseudocode:
   * <pre>
   * while not InOrder(list) do
   *   Shuffle(list)
   * done
   * </pre>
   */
  
  {s_:for(;;){if(!new netrexx.lang.Rexx(isSorted(list)).OpNot(null))break;
   java.util.Collections.shuffle(list);
   }
  }/*s_*/
  
  return;
  }

 
 public static final void main(java.lang.String args[]){
  int samples[];
  java.util.ArrayList alst;
  netrexx.lang.Rexx iv=null;
  //unsorted: [31 41 59 26 53 58 97 93 23 84]
  //sorted:   [23 26 31 41 53 58 59 84 93 97]
  samples=new int[]{new netrexx.lang.Rexx(31).toint(),41,59,26,53,58,97,93,23,84};
  alst=new java.util.ArrayList(samples.length);
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(samples.length).OpSub(null,$02);iv=new netrexx.lang.Rexx((byte)0);iv:for(;iv.OpLtEq(null,$1);iv=iv.OpAdd(null,new netrexx.lang.Rexx(1))){
   alst.add((java.lang.Object)(new java.lang.Integer(samples[iv.toint()])));
   }
  }/*iv*/
  
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,netrexx.lang.Rexx.toRexx(alst.toString())));
  bogoSort((java.util.List)alst);
  netrexx.lang.RexxIO.Say($04.OpCcblank(null,netrexx.lang.Rexx.toRexx(alst.toString())));
  
  return;
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RSortingBogosort(){return;}
 }
