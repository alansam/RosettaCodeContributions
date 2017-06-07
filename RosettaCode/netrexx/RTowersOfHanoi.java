/* Generated from 'RTowersOfHanoi.nrx' 23 Sep 2011 00:58:54 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RTowersOfHanoi{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("to column");
 private static final java.lang.String $0="RTowersOfHanoi.nrx";
 
 /* properties private */
 private netrexx.lang.Rexx moves;

 
 
 public RTowersOfHanoi(){super();
  moves=new netrexx.lang.Rexx((byte)0);
  return;
  }

 
 public void move(netrexx.lang.Rexx nrDisks,netrexx.lang.Rexx colFrom,netrexx.lang.Rexx colTo,netrexx.lang.Rexx colVia){
  if (nrDisks.OpEq(null,$01)) 
   {
    moves=moves.OpAdd(null,$01);
    netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Move number:").OpCcblank(null,moves.right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,netrexx.lang.Rexx.toRexx(": Move disk from column"))).OpCcblank(null,colFrom)).OpCcblank(null,$02)).OpCcblank(null,colTo));
   }
  else 
   {
    move(nrDisks.OpSub(null,$01),colFrom,colVia,colTo);
    move(new netrexx.lang.Rexx((byte)1),colFrom,colTo,colVia);
    move(nrDisks.OpSub(null,$01),colVia,colTo,colFrom);
   }
  
  return;
  }

 
 public static void main(java.lang.String args[]){
  RTowersOfHanoi lcl;
  lcl=new RTowersOfHanoi();
  lcl.move(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3));
  
  return;
  }
 }
