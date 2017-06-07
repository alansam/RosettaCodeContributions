/* Generated from 'RCountInOctal01.nrx' 19 Jul 2012 16:36:10 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




// allow an option to change the output radix.

public class RCountInOctal01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RCountInOctal01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx radix=null;
  java.math.BigInteger k_=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  radix=$1[0];}
  if ((radix.length()).OpEqS(null,$02)) 
   radix=new netrexx.lang.Rexx((byte)8);
  
  k_=java.math.BigInteger.ZERO;
  
  {for(;;){
   netrexx.lang.RexxIO.Say(k_.toString(radix.toint()));
   k_=k_.add(java.math.BigInteger.ONE);
   }
  }
  }
 
 private RCountInOctal01(){return;}
 }
