/* Generated from 'RExtremeFloats.nrx' 29 May 2013 11:20:24 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RExtremeFloats{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('|');
 private static final java.lang.String $0="RExtremeFloats.nrx";
 
 public static void main(java.lang.String $0s[]){
  double negInf;
  double knegInf;
  double inf;
  double kinf;
  double nan;
  double knan;
  double negZero;
  double knegZero;
  negInf=(double)(float)-(1.0F/0.0F);
  knegInf=java.lang.Double.NEGATIVE_INFINITY;
  inf=(double)1.0F/0.0F;
  kinf=java.lang.Double.POSITIVE_INFINITY;
  nan=(double)0.0F/0.0F;
  knan=java.lang.Double.NaN;
  negZero=(double)-(2.0D/inf);
  knegZero=(-2.0F)/java.lang.Double.POSITIVE_INFINITY;
  
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Negative inf: ").OpCcblank(null,(new netrexx.lang.Rexx(negInf)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx(knegInf)));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Positive inf: ").OpCcblank(null,(new netrexx.lang.Rexx(inf)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx(kinf)));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("NaN:          ").OpCcblank(null,(new netrexx.lang.Rexx(nan)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx(knan)));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Negative 0:   ").OpCcblank(null,(new netrexx.lang.Rexx(negZero)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx(knegZero)));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("inf + -inf:   ").OpCcblank(null,(new netrexx.lang.Rexx(inf+negInf)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx((kinf+knegInf))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("0 * NaN:      ").OpCcblank(null,(new netrexx.lang.Rexx(((double)0)*nan)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx((((double)0)*knan))));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("NaN == NaN:   ").OpCcblank(null,(new netrexx.lang.Rexx(nan==nan)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,$01)).OpCcblank(null,new netrexx.lang.Rexx((knan==knan))));
  
  return;
  }
 
 private RExtremeFloats(){return;}
 }
