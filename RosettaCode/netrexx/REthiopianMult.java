/* Generated from 'REthiopianMult.nrx' 12 Jun 2012 21:18:14 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/*REXX program multiplies 2 integers by Ethiopian/Russian peasant method*/
/*handle extremely large integers.     */
/*handles zeroes and negative integers.*/
/*A & B  should be checked if integers.*/

public class REthiopianMult{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("a=");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("b=");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("product=");
 private static final char[] $07={3,1,1,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="REthiopianMult.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx b=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  a=$2[0];b=$2[1];}
  if ((a.length()).OpEq($1,$03)) 
   a=new netrexx.lang.Rexx((byte)17);
  if ((b.length()).OpEq($1,$03)) 
   b=new netrexx.lang.Rexx((byte)34);
  netrexx.lang.RexxIO.Say($04.OpCcblank($1,a));
  netrexx.lang.RexxIO.Say($05.OpCcblank($1,b));
  netrexx.lang.RexxIO.Say($06.OpCcblank($1,emult(a,b)));
  return;
  }

 
 private static netrexx.lang.Rexx emult(netrexx.lang.Rexx x,netrexx.lang.Rexx y){
  netrexx.lang.Rexx ox=null;
  netrexx.lang.Rexx prod;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(x,$07,$3);
  x=$3[0];ox=$3[1];}
  prod=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!x.OpNotEqS($1,$03))break;
   if ((iseven(x)).OpNot($1)) 
    prod=prod.OpAdd($1,y);
   x=halve(x);
   y=dubble(y);
   }
  }
  return prod.OpMult($1,ox.sign());
  }

 
 private static netrexx.lang.Rexx halve(netrexx.lang.Rexx x){
  return x.OpDivI($1,$08);
  }

 
 private static netrexx.lang.Rexx dubble(netrexx.lang.Rexx x){
  return x.OpAdd($1,x);
  }

 
 private static netrexx.lang.Rexx iseven(netrexx.lang.Rexx x){
  return new netrexx.lang.Rexx(x.OpRem($1,$08).OpEqS($1,$03));
  }
 
 private REthiopianMult(){return;}
 }
