/* Generated from 'RSortingBeadsort02.nrx' 8 Mar 2013 17:42:59 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RSortingBeadsort02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1024);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(666);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortingBeadsort02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] bead_sort(netrexx.lang.Rexx harry[]){
  java.util.TreeMap beads;
  netrexx.lang.Rexx val=null;
  java.math.BigDecimal kval=null;
  netrexx.lang.Rexx bead=null;
  netrexx.lang.Rexx harry_sorted[];
  int bi;
  java.math.BigDecimal xx=null;
  beads=new java.util.TreeMap();
  
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[harry.length];synchronized(harry){for(;;){if($3==$2.length)break;$2[$3]=harry[harry.length-1-$3];$3++;}}val:for(;;){if(--$3<0)break;val=(netrexx.lang.Rexx)$2[$3];
   // collect occurences of beads in TreeMap indexed on value
   kval=new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(val));
   bead=(netrexx.lang.Rexx)(beads.get((java.lang.Object)kval));
   if ((beads.get((java.lang.Object)kval))==null) 
    beads.put((java.lang.Object)kval,(java.lang.Object)(new netrexx.lang.Rexx((byte)1)));
   else 
    beads.put((java.lang.Object)kval,(java.lang.Object)(new netrexx.lang.Rexx(bead.OpAdd(null,$01))));
   }
  }/*val*/
  
  harry_sorted=new netrexx.lang.Rexx[harry.length];
  bi=0;
  
  {java.util.Set $7=beads.keySet();int $6=0;java.lang.Object[] $5=new java.lang.Object[$7.size()];synchronized($7){java.util.Iterator $4=$7.iterator();for(;;){if($6==$5.length)break;$5[$6]=$4.next();$6++;}}xx:for(;;){if(--$6<0)break;xx=(java.math.BigDecimal)((java.lang.Object)$5[$6]);
   // extract beads in value order and insert in result array
   {int $8=((netrexx.lang.Rexx)(beads.get((java.lang.Object)xx))).OpPlus(null).toint();for(;$8>0;$8--){
    harry_sorted[bi]=new netrexx.lang.Rexx(java.lang.String.valueOf(xx));
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
  unsorted=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((short)734),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx((short)324),$02.OpMinus(null),$03.OpMinus(null),$01.OpMinus(null),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((short)324),new netrexx.lang.Rexx((byte)32),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx(999999999),new netrexx.lang.Rexx((short)432),new netrexx.lang.Rexx((byte)42),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1)};
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
  {int $11=0;netrexx.lang.Rexx[] $10=new netrexx.lang.Rexx[harry.length];synchronized(harry){for(;;){if($11==$10.length)break;$10[$11]=harry[harry.length-1-$11];$11++;}}vv:for(;;){if(--$11<0)break;vv=(netrexx.lang.Rexx)$10[$11];
   list=list.OpCcblank(null,vv);
   }
  }/*vv*/
  return ($04.OpCc(null,list.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCc(null,$05);
  }
 
 private RSortingBeadsort02(){return;}
 }
