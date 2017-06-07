/* Generated from 'RArithmaticInteger.nrx' 7 Jan 2013 21:36:58 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RArithmaticInteger{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("  sum of");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("and");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx(":       ");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx(":         ");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("divided by");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx(": ");
 private static final java.lang.String $0="RArithmaticInteger.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx numL;
  netrexx.lang.Rexx numR;
  numL=new netrexx.lang.Rexx((byte)0);
  numR=new netrexx.lang.Rexx((byte)0);
  {running:for(;;){
   netrexx.lang.RexxIO.Say("Provide two integers [or anything else to stop]:");
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
   numL=$1[0];numR=$1[1];}
   if ((numL.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)|(numR.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
    break running;
   netrexx.lang.RexxIO.Say((((($02.OpCcblank(null,numL)).OpCcblank(null,$03)).OpCcblank(null,numR)).OpCc(null,netrexx.lang.Rexx.toRexx(":              "))).OpCcblank(null,numL.OpAdd(null,numR)));
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("  difference of").OpCcblank(null,numL)).OpCcblank(null,$03)).OpCcblank(null,numR)).OpCc(null,$04)).OpCcblank(null,numL.OpSub(null,numR)));
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("  product of").OpCcblank(null,numL)).OpCcblank(null,$03)).OpCcblank(null,numR)).OpCc(null,netrexx.lang.Rexx.toRexx(":          "))).OpCcblank(null,numL.OpMult(null,numR))); // rounds towards zero
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("  quotient of").OpCcblank(null,numL)).OpCcblank(null,$03)).OpCcblank(null,numR)).OpCc(null,$05)).OpCcblank(null,numL.OpDivI(null,numR))); // sign taken from left hand operand
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("  remainder of").OpCcblank(null,numL)).OpCcblank(null,$06)).OpCcblank(null,numR)).OpCc(null,$07)).OpCcblank(null,numL.OpRem(null,numR)));
   }
  }/*running*/
  
  return;
  }
 
 private RArithmaticInteger(){return;}
 }
