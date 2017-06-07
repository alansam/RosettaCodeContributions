/* Generated from 'RHornersRuleForPolynomialEval.nrx' 6 Nov 2015 23:00:56 [v3.04] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RHornersRuleForPolynomialEval{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(19);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(7);
 private static final java.lang.String $0="RHornersRuleForPolynomialEval.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx c[];
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx r;
  netrexx.lang.Rexx i=null;
  c=new netrexx.lang.Rexx[]{$01.OpMinus(null),new netrexx.lang.Rexx((byte)7),$02.OpMinus(null),new netrexx.lang.Rexx((byte)6)}; // # list coefficients of all x^0..x^n in order
  n=new netrexx.lang.Rexx((byte)3);
  x=new netrexx.lang.Rexx((byte)3);
  r=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $1=$04.OpMinus(null);boolean $2=$1.OpGtEq(null,$05);i=n.OpPlus(null);i:for(;$2?i.OpLtEq(null,$03):i.OpGtEq(null,$03);i=i.OpAdd(null,$1)){
   r=r.OpMult(null,x).OpAdd(null,c[i.toint()]);
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(r);
  netrexx.lang.RexxIO.Say($07.OpMult(null,x.OpPow(null,$06)).OpSub(null,$02.OpMult(null,x.OpPow(null,$08))).OpAdd(null,$09.OpMult(null,x)).OpSub(null,$01));
  return;}
 
 private RHornersRuleForPolynomialEval(){return;}
 }
