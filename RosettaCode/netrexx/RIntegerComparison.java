/* Generated from 'RIntegerComparison.nrx' 7 Jan 2013 21:09:14 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RIntegerComparison{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final java.lang.String $0="RIntegerComparison.nrx";
 
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
   if (numL.OpLt(null,numR)) 
    netrexx.lang.RexxIO.Say((numL.OpCcblank(null,netrexx.lang.Rexx.toRexx("is less than"))).OpCcblank(null,numR));
   if (numL.OpEq(null,numR)) 
    netrexx.lang.RexxIO.Say((numL.OpCcblank(null,netrexx.lang.Rexx.toRexx("is equal to"))).OpCcblank(null,numR));
   if (numL.OpGt(null,numR)) 
    netrexx.lang.RexxIO.Say((numL.OpCcblank(null,netrexx.lang.Rexx.toRexx("is greater than"))).OpCcblank(null,numR));
   }
  }/*running*/
  
  return;
  }
 
 private RIntegerComparison(){return;}
 }
