/* Generated from 'RStripControls.nrx' 23 Feb 2013 10:53:12 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RStripControls{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx(": <seq>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("</seq>");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)32);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((short)255);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx((byte)16);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(15);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RStripControls.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx stripControls(netrexx.lang.Rexx sstring){
  netrexx.lang.Rexx controls;
  netrexx.lang.Rexx extended;
  netrexx.lang.Rexx asciichr;
  netrexx.lang.Rexx rx=null;
  netrexx.lang.Rexx ix=null;
  controls=new netrexx.lang.Rexx('\000').sequence(new netrexx.lang.Rexx('\037'));
  extended=new netrexx.lang.Rexx('\177').sequence(new netrexx.lang.Rexx('\377'));
  asciichr=new netrexx.lang.Rexx('\040').sequence(new netrexx.lang.Rexx('\176'));
  sstring=asciichr;
  {netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[]{controls,extended,asciichr};int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[$4.length];synchronized($4){for(;;){if($3==$2.length)break;$2[$3]=$4[$4.length-1-$3];$3++;}}rx:for(;;){if(--$3<0)break;rx=(netrexx.lang.Rexx)$2[$3];
   netrexx.lang.RexxIO.Say((rx.length().right(new netrexx.lang.Rexx((byte)3))).OpCc(null,netrexx.lang.Rexx.toRexx(": <seq>\000")));
   {netrexx.lang.Rexx $5=rx.length();ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$5);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((rx.substr(ix,new netrexx.lang.Rexx((byte)1)).c2x()).OpCc(null,$01));
    }
   }/*ix*/
   netrexx.lang.RexxIO.Say("</seq>");
   }
  }/*rx*/
  netrexx.lang.RexxIO.Say((((asciichr.length().right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$02)).OpCc(null,asciichr)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say((((extended.length().right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$02)).OpCc(null,extended)).OpCc(null,$03));
  return sstring;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sss;
  netrexx.lang.Rexx ll=null;
  sss=netrexx.lang.Rexx.toRexx("");
  sss=stripControls(sss);
  sss=netrexx.lang.Rexx.toRexx("\040\200\u20ac\333\176");
  netrexx.lang.RexxIO.Say((((sss.length().right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$02)).OpCc(null,sss)).OpCc(null,$03));
  sss=new netrexx.lang.Rexx('\360').sequence(new netrexx.lang.Rexx('\377'));
  netrexx.lang.RexxIO.Say((((sss.length().right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$02)).OpCc(null,sss)).OpCc(null,$03));
  
  {netrexx.lang.Rexx $6=$06;ll=$04.OpPlus(null);ll:for(;ll.OpLtEq(null,$05);ll=ll.OpAdd(null,$6)){
   netrexx.lang.RexxIO.Say(((((ll.d2x()).OpCc(null,$07)).OpCc(null,(ll.OpAdd(null,$08)).d2x())).OpCc(null,$09)).OpCcblank(null,(ll.d2c()).sequence((ll.OpAdd(null,$08)).d2c())));
   }
  }/*ll*/
  return;
  }
 
 private RStripControls(){return;}
 }
