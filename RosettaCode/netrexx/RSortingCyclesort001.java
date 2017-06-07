/* Generated from 'RSortingCyclesort001.nrx' 19 Jun 2014 21:39:57 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* REXX ***************************************************************
* 12.06.2014 Walter Pachl translated from Wikipedia's code
**********************************************************************/


public class RSortingCyclesort001{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("writes=");
 private static final char[] $03={1,10,2,0,1,0};
 private static final java.lang.String $0="RSortingCyclesort001.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx array;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx writes;
  netrexx.lang.Rexx ol;
  list=netrexx.lang.Rexx.toRexx("1 9 3 5 8 4 7 0 6 2");
  n=list.words();
  array=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=n.OpSub(null,$01);i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   array.getnode(i).leaf=list.word(i.OpAdd(null,$01));
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(list);
  writes=cycleSort(array,n);
  netrexx.lang.RexxIO.Say($02.OpCc(null,writes));
  ol=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=n.OpSub(null,$01);i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   ol=ol.OpCcblank(null,array.getnode(i).leaf);
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(ol.strip());
  {System.exit(0);return;}
  }

 
 public static netrexx.lang.Rexx cycleSort(netrexx.lang.Rexx array,netrexx.lang.Rexx n){
  netrexx.lang.Rexx writes;
  netrexx.lang.Rexx cycleStart=null;
  netrexx.lang.Rexx item=null;
  netrexx.lang.Rexx pos=null;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx array_pos=null;
  writes=new netrexx.lang.Rexx((byte)0);
  
  // Loop through the array to find cycles to rotate.
  {netrexx.lang.Rexx $3=n.OpSub(null,$01).OpSub(null,$01);cycleStart=new netrexx.lang.Rexx((byte)0);cycleStart:for(;cycleStart.OpLtEq(null,$3);cycleStart=cycleStart.OpAdd(null,new netrexx.lang.Rexx(1))){
   item=array.getnode(cycleStart).leaf;
   
   // Find where to put the item.
   pos=cycleStart;
   {netrexx.lang.Rexx $4=n.OpSub(null,$01);i=cycleStart.OpAdd(null,$01).OpPlus(null);i:for(;i.OpLtEq(null,$4);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
    if ((array.getnode(i).leaf).OpLt(null,item)) 
     pos=pos.OpAdd(null,$01);
    }
   }/*i*/
   
   // If the item is already there, this is not a cycle.
   if (pos.OpEqS(null,cycleStart)) 
    continue cycleStart;
   
   // Otherwise, put the item there or right after any duplicates.
   {for(;;){if(!item.OpEqS(null,array.getnode(pos).leaf))break;
    pos=pos.OpAdd(null,$01);
    }
   }
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(((array.getnode(pos).leaf).OpCcblank(null,item)),$03,$5);
   item=$5[0];array_pos=$5[1];}
   array.getnode(pos).leaf=array_pos;
   writes=writes.OpAdd(null,$01);
   
   // Rotate the rest of the cycle.
   {for(;;){if(!pos.OpNotEq(null,cycleStart))break;
    
    // Find where to put the item.
    pos=cycleStart;
    {netrexx.lang.Rexx $6=n.OpSub(null,$01);i=cycleStart.OpAdd(null,$01).OpPlus(null);i:for(;i.OpLtEq(null,$6);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     if ((array.getnode(i).leaf).OpLt(null,item)) 
      pos=pos.OpAdd(null,$01);
     }
    }/*i*/
    
    // Put the item there or right after any duplicates.
    {for(;;){if(!item.OpEqS(null,array.getnode(pos).leaf))break;
     pos=pos.OpAdd(null,$01);
     }
    }
    {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(((array.getnode(pos).leaf).OpCcblank(null,item)),$03,$7);
    item=$7[0];array_pos=$7[1];}
    array.getnode(pos).leaf=array_pos;
    writes=writes.OpAdd(null,$01);
    }
   }
   }
  }/*cycleStart*/
  return writes;
  }
 
 private RSortingCyclesort001(){return;}
 }
