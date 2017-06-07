/* Generated from 'RSortingCyclesort002.nrx' 21 Jun 2014 11:39:39 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* Rexx */



public class RSortingCyclesort002{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx("3.14");
 private static final java.lang.String $0="RSortingCyclesort002.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Sort an array in place and return the number of writes.
 
 public static netrexx.lang.Rexx cycleSort(netrexx.lang.Rexx array[]){
  netrexx.lang.Rexx writes;
  netrexx.lang.Rexx cycleStart=null;
  netrexx.lang.Rexx item=null;
  netrexx.lang.Rexx pos=null;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx swap_tmp=null;
  writes=new netrexx.lang.Rexx((byte)0);
  
  // Loop through the array to find cycles to rotate.
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(array.length).OpSub(null,$01).OpSub(null,$01);cycleStart=new netrexx.lang.Rexx((byte)0);cycleStart:for(;cycleStart.OpLtEq(null,$1);cycleStart=cycleStart.OpAdd(null,new netrexx.lang.Rexx(1))){
   item=array[cycleStart.toint()];
   
   // Find where to put the item.
   pos=cycleStart;
   {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(array.length).OpSub(null,$01);i=cycleStart.OpAdd(null,$01).OpPlus(null);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
    if ((array[i.toint()]).OpLt(null,item)) 
     pos=pos.OpAdd(null,$01);
    }
   }/*i*/
   
   // If the item is already there, this is not a cycle.
   if (pos.OpEqS(null,cycleStart)) 
    continue cycleStart;
   
   // Otherwise, put the item there or right after any duplicates.
   {for(;;){if(!item.OpEqS(null,array[pos.toint()]))break;
    pos=pos.OpAdd(null,$01);
    }
   }
   swap_tmp=array[pos.toint()];
   array[pos.toint()]=item;
   item=swap_tmp;
   writes=writes.OpAdd(null,$01);
   
   // Rotate the rest of the cycle.
   {for(;;){if(!pos.OpNotEq(null,cycleStart))break;
    
    // Find where to put the item.
    pos=cycleStart;
    {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(array.length).OpSub(null,$01);i=cycleStart.OpAdd(null,$01).OpPlus(null);i:for(;i.OpLtEq(null,$3);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     if ((array[i.toint()]).OpLt(null,item)) 
      pos=pos.OpAdd(null,$01);
     }
    }/*i*/
    
    // Put the item there or right after any duplicates.
    {for(;;){if(!item.OpEqS(null,array[pos.toint()]))break;
     pos=pos.OpAdd(null,$01);
     }
    }
    swap_tmp=array[pos.toint()];
    array[pos.toint()]=item;
    item=swap_tmp;
    writes=writes.OpAdd(null,$01);
    
    }
   }
   
   }
  }/*cycleStart*/
  return writes;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  java.util.ArrayList samples;
  netrexx.lang.Rexx list[]=null;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx writes=null;
  samples=new java.util.ArrayList();
  samples.add((java.lang.Object)(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)2)}));
  samples.add((java.lang.Object)(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)6)}));
  samples.add((java.lang.Object)(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Greygill Hole"),netrexx.lang.Rexx.toRexx("Ogof Draenen"),netrexx.lang.Rexx.toRexx("Ogof Ffynnon Ddu"),netrexx.lang.Rexx.toRexx("Malham Tarn Pot")}));
  samples.add((java.lang.Object)(new netrexx.lang.Rexx[]{$02.OpMinus(null),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)4)}));
  samples.add((java.lang.Object)(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("George Washington: Virginia"),netrexx.lang.Rexx.toRexx("John Adams: Massachusetts"),netrexx.lang.Rexx.toRexx("Thomas Jefferson: Virginia"),netrexx.lang.Rexx.toRexx("James Madison: Virginia"),netrexx.lang.Rexx.toRexx("James Monroe: Virginia")}));
  
  
  {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(samples.size()).OpSub(null,$01);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$4);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   list=(netrexx.lang.Rexx[])(samples.get(i_.toint()));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input list ").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(java.util.Arrays.asList((java.lang.Object[])list)))));
   writes=cycleSort(list);
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Sorted list").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(java.util.Arrays.asList((java.lang.Object[])list)))));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Total number of writes:").OpCcblank(null,writes));
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  return;
  }
 
 private RSortingCyclesort002(){return;}
 }
