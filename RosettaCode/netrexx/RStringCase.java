/* Generated from 'RStringCase.nrx' 22 Aug 2011 12:43:20 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>String case</h3>
 *
 * <p>
 * Take the string "alphaBETA", and demonstrate how to convert it to UPPER-CASE and lower-case.
 * Use the default encoding of a string literal or plain ASCII if there is no string literal in your language.
 * Show any additional case conversion functions (e.g. swapping case, capitalizing the first letter, etc.)
 * that may be included in the library of your language.
 * </p>
 */


public class RStringCase{
 private static final java.lang.String $0="RStringCase.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx abc;
  abc=netrexx.lang.Rexx.toRexx("alphaBETA");
  
  netrexx.lang.RexxIO.Say(abc.upper());
  netrexx.lang.RexxIO.Say(abc.lower());
  netrexx.lang.RexxIO.Say(abc.upper(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1))); // capitalize 1st character
  return;}
 
 private RStringCase(){return;}
 }
