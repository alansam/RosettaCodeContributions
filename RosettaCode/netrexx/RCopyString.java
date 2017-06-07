/* Generated from 'RCopyString.nrx' 2 Jan 2013 21:54:49 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCopyString{
 private static final java.lang.String $0="RCopyString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s1;
  netrexx.lang.Rexx s2;
  s1=netrexx.lang.Rexx.toRexx("This is a Rexx string");
  s2=s1;
  
  s2=s2.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('_'));
  
  netrexx.lang.RexxIO.Say(s1);
  netrexx.lang.RexxIO.Say(s2);
  return;}
 
 private RCopyString(){return;}
 }
