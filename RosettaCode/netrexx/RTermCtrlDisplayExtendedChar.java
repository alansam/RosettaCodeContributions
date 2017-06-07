/* Generated from 'RTermCtrlDisplayExtendedChar.nrx' 19 Nov 2013 18:41:03 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RTermCtrlDisplayExtendedChar{
 private static final java.lang.String $0="RTermCtrlDisplayExtendedChar.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.lang.String GBP;
  GBP="\u00a3"; // unicode code point
  netrexx.lang.RexxIO.Say(GBP);
  GBP="\u00A3"; // if the editor's up to it
  netrexx.lang.RexxIO.Say(GBP);
  GBP=java.lang.String.valueOf((short)163); // yet another way 
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(GBP)).d2c());
  return;
  }
 
 private RTermCtrlDisplayExtendedChar(){return;}
 }
