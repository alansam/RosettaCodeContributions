/* Generated from 'RStringCompare01.nrx' 27 Mar 2013 18:04:25 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Trace2 Verbose3 */


public class RStringCompare01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("cat");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("  cat  ");
 private static final java.lang.String $0="RStringCompare01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx animal;
  animal=netrexx.lang.Rexx.toRexx("dog");
  if (animal.OpEq(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is lexically equal to cat")));
  if (animal.OpNotEq(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not lexically equal cat")));
  if (animal.OpGt(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is lexically higher than cat")));
  if (animal.OpLt(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is lexically lower than cat")));
  if (animal.OpGtEq(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not lexically lower than cat")));
  if (animal.OpLtEq(null,$01)) 
   netrexx.lang.RexxIO.Say(animal.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not lexically higher than cat")));
  /* The above comparative operators do not consider
     leading and trailing whitespace when making comparisons. */
  if ($02.OpEq(null,$01)) 
   netrexx.lang.RexxIO.Say("this will print because whitespace is stripped");
  
  /* To consider all whitespace in a comparison
     we need to use strict comparative operators */
  
  if (("  cat  ").equals("cat")) 
   netrexx.lang.RexxIO.Say("this will not print because comparison is strict");
  return;}
 
 private RStringCompare01(){return;}
 }
