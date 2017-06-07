/* Generated from 'RConvertDecimalToRational.nrx' 2 Jan 2013 18:42:17 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/*NetRexx program to convert decimal numbers to fractions *************
* 16.08.2012 Walter Pachl derived from Rexx Version 2
**********************************************************************/

/* use "only" 10 digs of precision */

public class RConvertDecimalToRational{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("->");
 private static final char[] $04={2,1,47,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("> ");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('/');
 private static final java.lang.String $0="RConvertDecimalToRational.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  ratt(netrexx.lang.Rexx.toRexx("0.9054054054"),netrexx.lang.Rexx.toRexx("67/74"));
  ratt(netrexx.lang.Rexx.toRexx("0.5185185185"),netrexx.lang.Rexx.toRexx("14/27"));
  ratt(netrexx.lang.Rexx.toRexx("0.75"),netrexx.lang.Rexx.toRexx("3/4"));
  ratt(netrexx.lang.Rexx.toRexx("0.905405400"),netrexx.lang.Rexx.toRexx(" 693627417/766095958"));
  ratt(netrexx.lang.Rexx.toRexx("0.9054054054"),netrexx.lang.Rexx.toRexx("67/74"));
  ratt(netrexx.lang.Rexx.toRexx("0.1428571428"),netrexx.lang.Rexx.toRexx("1/7"));
  ratt(netrexx.lang.Rexx.toRexx("35.000"),netrexx.lang.Rexx.toRexx("35"));
  ratt(netrexx.lang.Rexx.toRexx("35.001"),netrexx.lang.Rexx.toRexx("35001/1000"));
  ratt(netrexx.lang.Rexx.toRexx("0.00000000001"),new netrexx.lang.Rexx('?'));
  ratt(netrexx.lang.Rexx.toRexx("0.000001000001"),netrexx.lang.Rexx.toRexx("1/999999"));
  
  ratt(new netrexx.lang.Rexx("0.9054054054"),netrexx.lang.Rexx.toRexx("1/3"));
  return;}

 
 
 public static void ratt(netrexx.lang.Rexx d,netrexx.lang.Rexx fs){
  netrexx.lang.Rexx fract;
  netrexx.lang.Rexx no=null;
  netrexx.lang.Rexx de=null;
  netrexx.lang.Rexx x=null;
  fract=rat(d);
  netrexx.lang.RexxIO.Say((($02.OpCc($1,d)).OpCcblank($1,$03)).OpCcblank($1,fract));
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(fract,$04,$2);
  no=$2[0];de=$2[1];}
  if (de.OpEq($1,$05)) 
   x=no;
  else 
   x=no.OpDiv($1,de);
  if (x.OpNotEq($1,d)) 
   netrexx.lang.RexxIO.Say(($06.OpCc($1,x)).OpCcblank($1,netrexx.lang.Rexx.toRexx("is different")));
  return;}

 
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
  /* ********************************************************************
   * rat(number<,high) returns a fraction or an integer that is equal to
   * or approximately equal to number.
   * Nominator and denominator must not have more than high digits
   * 16.08.2012 Walter Pachl derived from Rexx Version 2
   * *******************************************************************/
  if (high.OpEqS($1,$05)) 
   high=$08.OpPow($1,(((new netrexx.lang.Rexx($1.digits))).OpSub($1,$07)));/* maximum nominator/denominator */
  x=in;/* working copy               */
  nom=new netrexx.lang.Rexx((byte)0);/* start values nominator     */
  den=new netrexx.lang.Rexx((byte)1);/*              denominator   */
  tnom=new netrexx.lang.Rexx((byte)1);/*         temp nominator     */
  tden=new netrexx.lang.Rexx((byte)0);/*         temp denominator   */
  {$3:for(;;){if(!(tnom.OpLtEq($1,high)&tden.OpLtEq($1,high)))break;/* nominator... not too large */
   n=x.trunc();/* take integer part of x     */
   z=tnom;/* save temp nominator        */
   tnom=n.OpMult($1,tnom).OpAdd($1,nom);/* compute new temp nominator */
   nom=z;/* assign nominator           */
   z=tden;/* save temp denominator      */
   tden=n.OpMult($1,tden).OpAdd($1,den);/* compute new temp denominato*/
   den=z;/* assign denominator         */
   if (n.OpEq($1,x)|tnom.OpDiv($1,tden).OpEq($1,in)) 
    {
     if (tnom.OpGt($1,high)|tden.OpGt($1,high)) /* temp value(s) too large    */
      break $3;/* don't use them             */
     nom=tnom;/* otherwise take them as     */
     den=tden;/* final values               */
     break $3;/* and end the loop           */
    }
   x=$07.OpDiv($1,(x.OpSub($1,n)));/* compute x for next round   */
   }
  }
  if (den.OpEq($1,$07)) 
   return nom;/* an integer                 */
  else 
   return (nom.OpCc($1,$09)).OpCc($1,den);/* otherwise a fraction       */
  }
 
 private RConvertDecimalToRational(){return;}
 }
