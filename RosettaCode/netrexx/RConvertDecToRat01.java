/* Generated from 'RConvertDecToRat01.nrx' 14 Aug 2012 21:07:09 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RConvertDecToRat01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("  ");
 private static final char[] $03={2,1,47,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("> ");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('/');
 private static final java.lang.String $0="RConvertDecToRat01.nrx";
 
 public static void main(java.lang.String args[]){
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  $1.setDigits($01);/* use "only" 10 digs of precision */
  test(netrexx.lang.Rexx.toRexx("0.9054054054"),netrexx.lang.Rexx.toRexx("67/74"));
  test(netrexx.lang.Rexx.toRexx("0.5185185185"),netrexx.lang.Rexx.toRexx("14/27"));
  test(netrexx.lang.Rexx.toRexx("0.75"),netrexx.lang.Rexx.toRexx("3/4"));
  test(netrexx.lang.Rexx.toRexx("0.905405400"),netrexx.lang.Rexx.toRexx(" 693627417/766095958"));
  test(netrexx.lang.Rexx.toRexx("0.9054054054"),netrexx.lang.Rexx.toRexx("67/74"));
  test(netrexx.lang.Rexx.toRexx("0.1428571428"),netrexx.lang.Rexx.toRexx("1/7"));
  test(netrexx.lang.Rexx.toRexx("35.000"),netrexx.lang.Rexx.toRexx("35"));
  test(netrexx.lang.Rexx.toRexx("35.001"),netrexx.lang.Rexx.toRexx("35001/1000"));
  test(netrexx.lang.Rexx.toRexx("0.00000000001"),new netrexx.lang.Rexx('?'));
  test(netrexx.lang.Rexx.toRexx("0.000001000001"),netrexx.lang.Rexx.toRexx("1/999999"));
  
  return;
  }

 
 public static void test(netrexx.lang.Rexx decNumber,netrexx.lang.Rexx fs){
  netrexx.lang.Rexx fh;
  netrexx.lang.Rexx xn=null;
  netrexx.lang.Rexx xd=null;
  netrexx.lang.Rexx x;
  fh=rat(decNumber);/* convert number to fraction   */
  netrexx.lang.RexxIO.Say(($02.OpCc(null,decNumber)).OpCcblank(null,fh));
  if (fh.OpNotEq(null,fs)) 
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("                   not=").OpCc(null,fs));
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(fh,$03,$2);
  xn=$2[0];xd=$2[2];}
  x=xn.OpDiv(null,xd);/* compute value of fraction    */
  if (x.OpNotEq(null,decNumber)) /* not exactly equal to number  */
   netrexx.lang.RexxIO.Say(($04.OpCc(null,x)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is different")));
  netrexx.lang.RexxIO.Say(' ');
  return;
  }

 
 public static netrexx.lang.Rexx rat(netrexx.lang.Rexx in){
  return rat(in,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx rat(netrexx.lang.Rexx in,netrexx.lang.Rexx high){
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx nom;
  netrexx.lang.Rexx den;
  netrexx.lang.Rexx tnom;
  netrexx.lang.Rexx tden;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx z=null;
  netrexx.lang.Rexx frac;
  /**********************************************************************
  * rat(number<,high) returns a fraction or an integer that is equal to
  * or approximately equal to number.
  * Nominator and denominator must not have more than high digits
  * 16.08.2012 Walter Pachl derived from Rexx Version 2
  *       Help is needed to translate the other parts of that Rexx code
  **********************************************************************/
  
  if (high.OpEqS(null,$05)) 
   high=$07.OpPow(null,(((new netrexx.lang.Rexx(9))).OpSub(null,$06)));/* maximum nominator/denominator */
  x=in;/* working copy               */
  nom=new netrexx.lang.Rexx((byte)0);/* start values nominator     */
  den=new netrexx.lang.Rexx((byte)1);/*              denominator   */
  tnom=new netrexx.lang.Rexx((byte)1);/*         temp nominator     */
  tden=new netrexx.lang.Rexx((byte)0);/*         temp denominator   */
  {$3:for(;;){if(!(tnom.OpLtEq(null,high)&tden.OpLtEq(null,high)))break;/* nominator... not too large */
   n=x.trunc();/* take integer part of x     */
   z=tnom;/* save temp nominator        */
   tnom=n.OpMult(null,tnom).OpAdd(null,nom);/* compute new temp nominator */
   nom=z;/* assign nominator           */
   z=tden;/* save temp denominator      */
   tden=n.OpMult(null,tden).OpAdd(null,den);/* compute new temp denominato*/
   den=z;/* assign denominator         */
   if (n.OpEq(null,x)|tnom.OpDiv(null,tden).OpEq(null,in)) 
    {
     if (tnom.OpGt(null,high)|tden.OpGt(null,high)) /* temp value(s) too large    */
      break $3;/* don't use them             */
     nom=tnom;/* otherwise take them as     */
     den=tden;/* final values               */
     break $3;/* and end the loop           */
    }
   x=$06.OpDiv(null,(x.OpSub(null,n)));/* compute x for next round   */
   }
  }
  frac=(nom.OpCc(null,$08)).OpCc(null,den);/* otherwise a fraction       */
  return frac;
  }
 
 private RConvertDecToRat01(){return;}
 }
