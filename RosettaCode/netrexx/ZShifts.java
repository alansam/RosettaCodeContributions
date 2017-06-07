/* Generated from 'ZShifts.nrx' 6 Mar 2013 01:12:57 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class ZShifts{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="ZShifts.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  int d;
  netrexx.lang.Rexx d1;
  netrexx.lang.Rexx d2;
  netrexx.lang.Rexx d3;
  netrexx.lang.Rexx d4;
  d=new netrexx.lang.Rexx(5).toint();
  
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(d)).right(new netrexx.lang.Rexx((byte)8))).OpCcblank(null,(new netrexx.lang.Rexx(d)).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0))));
  
  d1=shiftleft(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)1));
  d2=shiftleft(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)2));
  d3=shiftleft(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)3));
  d4=shiftleft(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)4));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("left 1").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d1).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d1).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d1).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("left 2").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d2).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d2).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d2).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("left 3").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d3).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d3).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d3).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("left 4").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d4).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d4).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d4).right(new netrexx.lang.Rexx((byte)3))));
  
  d=(shiftleft(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)4))).toint();
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(d)).right(new netrexx.lang.Rexx((byte)8))).OpCcblank(null,(new netrexx.lang.Rexx(d)).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0))));
  
  d1=shiftright(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)1));
  d2=shiftright(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)2));
  d3=shiftright(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)3));
  d4=shiftright(new netrexx.lang.Rexx(d),new netrexx.lang.Rexx((byte)4));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("right 1").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d1).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d1).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d1).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("right 2").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d2).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d2).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d2).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("right 3").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d3).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d3).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d3).right(new netrexx.lang.Rexx((byte)3))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("right 4").right(new netrexx.lang.Rexx((byte)8)).OpCcblank(null,(d4).d2x().x2b().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d4).d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,(d4).right(new netrexx.lang.Rexx((byte)3))));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx shiftleft(netrexx.lang.Rexx d,netrexx.lang.Rexx s){
  return d.OpMult(null,($01.OpPow(null,s)));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx shiftright(netrexx.lang.Rexx d,netrexx.lang.Rexx s){
  return d.OpDivI(null,($01.OpPow(null,s)));
  }
 
 private ZShifts(){return;}
 }
