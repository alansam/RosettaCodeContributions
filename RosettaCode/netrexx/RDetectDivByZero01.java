/* Generated from 'RDetectDivByZero01.nrx' 19 Jul 2012 16:36:10 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RDetectDivByZero01{
 private static final char[] $01={2,1,44,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('/');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RDetectDivByZero01.nrx";
 
 public static final netrexx.lang.Rexx divide(netrexx.lang.Rexx dividend,netrexx.lang.Rexx divisor){
  netrexx.lang.Rexx quotient=null;
  netrexx.lang.DivideException exu=null;
  java.lang.RuntimeException exr=null;
  {try{
   quotient=dividend.OpDiv(null,divisor);
  }
  catch (netrexx.lang.DivideException $1){exu=$1;
   exu.printStackTrace();
   quotient=netrexx.lang.Rexx.toRexx("undefined");
  }
  catch (java.lang.RuntimeException $2){exr=$2;
   exr.printStackTrace();
   quotient=netrexx.lang.Rexx.toRexx("error");
  }}
  return quotient;
  }

 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx dividend=null;
  netrexx.lang.Rexx divisor=null;
  // process input arguments and set sensible defaults
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$3);
  dividend=$3[0];divisor=$3[2];}
  if ((dividend.length()).OpEq(null,$02)) 
   dividend=new netrexx.lang.Rexx((byte)1);
  if ((divisor.length()).OpEq(null,$02)) 
   divisor=new netrexx.lang.Rexx((byte)0);
  netrexx.lang.RexxIO.Say((((dividend.OpCcblank(null,$03)).OpCcblank(null,divisor)).OpCcblank(null,$04)).OpCcblank(null,divide(dividend,divisor)));
  return;
  }
 
 private RDetectDivByZero01(){return;}
 }
