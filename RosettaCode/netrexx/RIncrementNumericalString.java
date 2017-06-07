/* Generated from 'RIncrementNumericalString.nrx' 10 Sep 2011 16:53:57 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RIncrementNumericalString{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RIncrementNumericalString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx numbers;
  numbers=netrexx.lang.Rexx.toRexx("12345");
  netrexx.lang.RexxIO.Say(numbers);
  numbers=numbers.OpAdd(null,$01);
  netrexx.lang.RexxIO.Say(numbers);
  
  return;
  }
 
 private RIncrementNumericalString(){return;}
 }
