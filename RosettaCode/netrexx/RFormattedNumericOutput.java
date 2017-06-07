/* Generated from 'RFormattedNumericOutput.nrx' 10 Sep 2011 16:53:57 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RFormattedNumericOutput{
 private static final java.lang.String $0="RFormattedNumericOutput.nrx";
 
 public static void main(java.lang.String $0s[]){
  double sevenPointOneTwoFive;
  sevenPointOneTwoFive=new netrexx.lang.Rexx("7.125").todouble();
  
  // using NetRexx Built-In Functions (BIFs)
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(sevenPointOneTwoFive)).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)3)).changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('0')));
  
  // using Java library constructs
  java.lang.System.out.printf("%09.3f\n",(java.lang.Object[])(new java.lang.Double[]{new java.lang.Double(sevenPointOneTwoFive)}));
  netrexx.lang.RexxIO.Say(java.text.MessageFormat.format("{0,number,#00000.###}",(java.lang.Object[])(new java.lang.Double[]{new java.lang.Double(sevenPointOneTwoFive)})));
  
  return;
  }
 
 private RFormattedNumericOutput(){return;}
 }
