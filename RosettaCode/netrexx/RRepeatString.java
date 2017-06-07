/* Generated from 'RRepeatString.nrx' 1 Apr 2013 12:29:22 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RRepeatString{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("   COPIES:");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("CHANGESTR:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("     LEFT:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("    RIGHT:");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("   CENTRE:");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("  OVERLAY:");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("   SUBSTR:");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("TRANSLATE:");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx((byte)5);
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("     LOOP:");
 private static final java.lang.String $0="RRepeatString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx sampleStr;
  netrexx.lang.Rexx sampleChr;
  netrexx.lang.Rexx rs;
  sampleStr=netrexx.lang.Rexx.toRexx("ha");
  sampleChr=new netrexx.lang.Rexx('*');
  netrexx.lang.RexxIO.Say($01.OpCcblank(null,sampleStr.copies(new netrexx.lang.Rexx((byte)5))));
  netrexx.lang.RexxIO.Say($02.OpCcblank(null,netrexx.lang.Rexx.toRexx(".....").changestr(new netrexx.lang.Rexx('.'),sampleStr)));
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,sampleChr.left(new netrexx.lang.Rexx((byte)5),sampleChr)));
  netrexx.lang.RexxIO.Say($04.OpCcblank(null,sampleChr.right(new netrexx.lang.Rexx((byte)5),sampleChr)));
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,sampleChr.centre(new netrexx.lang.Rexx((byte)5),sampleChr)));
  netrexx.lang.RexxIO.Say($06.OpCcblank(null,sampleChr.overlay(sampleChr,new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),sampleChr)));
  netrexx.lang.RexxIO.Say($08.OpCcblank(null,$07.substr(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),sampleChr)));
  netrexx.lang.RexxIO.Say($09.OpCcblank(null,netrexx.lang.Rexx.toRexx(".....").translate(sampleChr,new netrexx.lang.Rexx('.'))));
  
  rs=netrexx.lang.Rexx.toRexx("");
  {int $1=$010.OpPlus(null).toint();for(;$1>0;$1--){
   rs=rs.OpCc(null,sampleStr);
   }
  }
  netrexx.lang.RexxIO.Say($011.OpCcblank(null,rs));
  return;
  }
 
 private RRepeatString(){return;}
 }
