/* Generated from 'RStringAppendPrepend.nrx' 8 Oct 2013 20:33:25 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RStringAppendPrepend{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("world!");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Hello");
 private static final java.lang.String $0="RStringAppendPrepend.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s_;
  s_=netrexx.lang.Rexx.toRexx("Hello");
  s_=s_.OpCcblank(null,$01);
  netrexx.lang.RexxIO.Say(s_);
  
  s_=netrexx.lang.Rexx.toRexx("world!");
  s_=$02.OpCcblank(null,s_);
  netrexx.lang.RexxIO.Say(s_);
  return;}
 
 private RStringAppendPrepend(){return;}
 }
