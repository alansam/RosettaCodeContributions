/* Generated from 'RZeroPowZero.nrx' 7 Nov 2015 00:47:52 [v3.04] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RZeroPowZero{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("0**0=");
 private static final java.lang.String $0="RZeroPowZero.nrx";
 
 public static void main(java.lang.String $0s[]){
  sampleRexx();
  sampleJava();
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void sampleRexx(){
  netrexx.lang.Rexx x;
  x=new netrexx.lang.Rexx((byte)0);
  netrexx.lang.RexxIO.Say($01.OpCc(null,x.OpPow(null,x)));
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void sampleJava(){
  netrexx.lang.RexxIO.Say("Math.pow(0,0)="+(java.lang.Math.pow((double)((byte)0),(double)((byte)0))));
  return;
  }
 
 private RZeroPowZero(){return;}
 }
