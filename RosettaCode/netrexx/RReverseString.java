/* Generated from 'RReverseString.nrx' 10 Sep 2011 16:53:57 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RReverseString{
 private static final java.lang.String $0="RReverseString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx reverseThis;
  netrexx.lang.Rexx sihTesrever;
  reverseThis=netrexx.lang.Rexx.toRexx("asdf");
  sihTesrever=reverseThis.reverse();
  
  netrexx.lang.RexxIO.Say(reverseThis);
  netrexx.lang.RexxIO.Say(sihTesrever);
  
  return;
  }
 
 private RReverseString(){return;}
 }
