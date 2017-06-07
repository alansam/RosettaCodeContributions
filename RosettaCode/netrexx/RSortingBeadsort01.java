/* Generated from 'RSortingBeadsort01.nrx' 8 Mar 2013 18:23:39 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSortingBeadsort01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1024);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(666);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortingBeadsort01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] bead_sort(netrexx.lang.Rexx harry[]){
  java.lang.String MIN_;
  java.lang.String MAX_;
  netrexx.lang.Rexx beads;
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx harry_sorted[];
  int bi;
  netrexx.lang.Rexx xx=null;
  MIN_="MIN";
  MAX_="MAX";
  beads=new netrexx.lang.Rexx(0);
  beads.getnode(netrexx.lang.Rexx.toRexx(MIN_)).leaf=new netrexx.lang.Rexx((byte)0);
  beads.getnode(netrexx.lang.Rexx.toRexx(MAX_)).leaf=new netrexx.lang.Rexx((byte)0);
  
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[harry.length];synchronized(harry){for(;;){if($3==$2.length)break;$2[$3]=harry[harry.length-1-$3];$3++;}}val:for(;;){if(--$3<0)break;val=(netrexx.lang.Rexx)$2[$3];
   // collect occurences of beads in indexed string indexed on value
   if (val.OpLt(null,beads.getnode(netrexx.lang.Rexx.toRexx(MIN_)).leaf)) 
    beads.getnode(netrexx.lang.Rexx.toRexx(MIN_)).leaf=val; // keep track of min value
   if (val.OpGt(null,beads.getnode(netrexx.lang.Rexx.toRexx(MAX_)).leaf)) 
    beads.getnode(netrexx.lang.Rexx.toRexx(MAX_)).leaf=val; // keep track of max value
   beads.getnode(val).leaf=(beads.getnode(val).leaf).OpAdd(null,$01);
   }
  }/*val*/
  
  harry_sorted=new netrexx.lang.Rexx[harry.length];
  bi=0;
  {netrexx.lang.Rexx $4=beads.getnode(netrexx.lang.Rexx.toRexx(MAX_)).leaf;xx=(beads.getnode(netrexx.lang.Rexx.toRexx(MIN_)).leaf).OpPlus(null);xx:for(;xx.OpLtEq(null,$4);xx=xx.OpAdd(null,new netrexx.lang.Rexx(1))){
   // extract beads in value order and insert in result array
   if ((beads.getnode(xx).leaf).OpEqS(null,$02)) 
    continue xx;
   {int $5=(beads.getnode(xx).leaf).OpPlus(null).toint();for(;$5>0;$5--){
    harry_sorted[bi]=xx;
    bi++;
    }
   }
   }
  }/*xx*/
  
  return harry_sorted;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx unsorted[];
  netrexx.lang.Rexx sorted[];
  unsorted=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((short)734),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx((short)324),$03.OpMinus(null),$04.OpMinus(null),$01.OpMinus(null),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((short)324),new netrexx.lang.Rexx((byte)32),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((short)432),new netrexx.lang.Rexx((byte)42),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1)};
  sorted=bead_sort(unsorted);
  netrexx.lang.RexxIO.Say(arrayToString(unsorted));
  netrexx.lang.RexxIO.Say(arrayToString(sorted));
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx arrayToString(netrexx.lang.Rexx harry[]){
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx vv=null;
  list=netrexx.lang.Rexx.toRexx("");
  {int $8=0;netrexx.lang.Rexx[] $7=new netrexx.lang.Rexx[harry.length];synchronized(harry){for(;;){if($8==$7.length)break;$7[$8]=harry[harry.length-1-$8];$8++;}}vv:for(;;){if(--$8<0)break;vv=(netrexx.lang.Rexx)$7[$8];
   list=list.OpCcblank(null,vv);
   }
  }/*vv*/
  return ($05.OpCc(null,list.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCc(null,$06);
  }
 
 private RSortingBeadsort01(){return;}
 }
