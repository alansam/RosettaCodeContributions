/* Generated from 'RCommandLineArgs01.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


// sample arguments: -c "alpha beta" -h "gamma"

public class RCommandLineArgs01{
 private static final java.lang.String $0="RCommandLineArgs01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("program arguments:").OpCcblank(null,arg));
  return;}
 
 private RCommandLineArgs01(){return;}
 }
