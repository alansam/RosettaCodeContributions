/* Generated from 'RNullObject.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RNullObject{
 private static final java.lang.String $0="RNullObject.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx robject=null; // create an object for which the value is undefined
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf((java.lang.Object)robject)); // will report the text "null"
  if (robject==null) 
   netrexx.lang.RexxIO.Say("Really, it\'s \"null\"!");
  return;}
 
 private RNullObject(){return;}
 }
