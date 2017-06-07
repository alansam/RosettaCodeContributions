/* Generated from 'ninetynineBottles.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

public class ninetynineBottles{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(99);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)98);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("bottle");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("No more");
 private static final java.lang.String $0="ninetynineBottles.nrx";
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx beer;
  netrexx.lang.Rexx removeOne;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx lastCall;
  beer=netrexx.lang.Rexx.toRexx("bottles of beer on the wall");
  removeOne=netrexx.lang.Rexx.toRexx("Take one down, pass it arround,");
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,beer)).OpCc(null,$02));
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,beer.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
  {netrexx.lang.Rexx $1=$05.OpMinus(null);boolean $2=$1.OpGtEq(null,$06);i=$03.OpPlus(null);i:for(;$2?i.OpLtEq(null,$04):i.OpGtEq(null,$04);i=i.OpAdd(null,$1)){
   netrexx.lang.RexxIO.Say(removeOne);
   netrexx.lang.RexxIO.Say((i.OpCcblank(null,beer)).OpCc(null,$07));
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say((i.OpCcblank(null,beer)).OpCc(null,$02));
   netrexx.lang.RexxIO.Say((i.OpCcblank(null,beer.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
   }
  }/*i*/
  lastCall=$08.OpCcblank(null,beer.delword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1)));
  netrexx.lang.RexxIO.Say(removeOne);
  netrexx.lang.RexxIO.Say((i.OpCcblank(null,lastCall)).OpCc(null,$07));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say((i.OpCcblank(null,lastCall)).OpCc(null,$02));
  netrexx.lang.RexxIO.Say((i.OpCcblank(null,lastCall.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
  netrexx.lang.RexxIO.Say(removeOne);
  netrexx.lang.RexxIO.Say($09.OpCcblank(null,beer));
  return;}
 
 private ninetynineBottles(){return;}
 }