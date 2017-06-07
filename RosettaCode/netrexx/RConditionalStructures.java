/* Generated from 'RConditionalStructures.nrx' 25 Jan 2013 11:38:36 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// IF-THEN-ELSE


public class RConditionalStructures{
 private static final java.lang.String $0="RConditionalStructures.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx logicalCondition;
  netrexx.lang.NoOtherwiseException ex1=null;
  java.lang.String cc;
  java.lang.RuntimeException exs=null;
  logicalCondition=new netrexx.lang.Rexx((1==1));
  logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((1==1));
  logicalCondition.getnode(new netrexx.lang.Rexx((byte)2)).leaf=new netrexx.lang.Rexx((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).OpNot(null));
  logicalCondition.getnode(new netrexx.lang.Rexx((byte)3)).leaf=new netrexx.lang.Rexx((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).OpNot(null));
  
  // simple construct
  if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).toboolean()) 
   conditionWasTrue();
  else 
   conditionWasFalse();
  // multi-line is ok too
  if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).toboolean()) 
   
   conditionWasTrue();
  else 
   conditionWasFalse();
  
  // using block stuctures
  if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).toboolean()) 
   {
    conditionWasTrue();
   }
  else 
   {
    conditionWasFalse();
   }
  
  // if/else if...
  if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)1)).leaf).toboolean()) 
   {
    conditionWasTrue();
   }
  else 
   if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)2)).leaf).toboolean()) 
    {
     conditionWasTrue();
    }
   else 
    {
     conditionWasFalse();
    }
  
  // SELECT
  // Notes:
  //   block structures (DO-END) can be used here too
  //   OTHERWISE is optional but may result in run-time errors (netrexx.lang.NoOtherwiseException) if it isn't provided
  {/*select*/
  if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)2)).leaf).toboolean())
   conditionWasTrue();
  else if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)3)).leaf).toboolean())
   conditionWasTrue();
  else{
   conditionWasFalse();
  }
  }
  
  {try{
   {/*select*/
   if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)2)).leaf).toboolean())
    conditionWasTrue();
   else if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)3)).leaf).toboolean())
    conditionWasTrue();
   
   else{throw new netrexx.lang.NoOtherwiseException();}
   }
  }
  catch (netrexx.lang.NoOtherwiseException $1){ex1=$1;
   ex1.printStackTrace();
  }}
  
  // SELECT-CASE
  cc="A";
  {/*select*/
  if (cc.equals("A"))
   netrexx.lang.RexxIO.Say("the case is A");
  else if (cc.equals("B"))
   netrexx.lang.RexxIO.Say("the case is B");
  else{
   netrexx.lang.RexxIO.Say("selection not recognized");
  }
  }
  // Functionally equivalent to:
  // select
  //   when cc == 'A' then ...
  //   when cc == 'B' then ...
  // ...
  
  // SELECT has optional features (CATCH & FINALLY)
  // and options (LABEL, PROTECT & CASE)
  // CATCH and FINALLY are used for handling exceptions thrown from inside the select group
  // CASE see SELECT-CASE above
  // LABEL provides a target for any LEAVE instructions and can aid in code self-documentation
  // PROTECT is used for program concurrency & synchonization in multi-threaded programs
  synchronized(cc){try{sl:do{/*select*/
  if (cc.equals("A"))
   {
    netrexx.lang.RexxIO.Say("the case is A");
    if ((logicalCondition.getnode(new netrexx.lang.Rexx((byte)2)).leaf).toboolean()) 
     break sl; // just to use the lable
    netrexx.lang.RexxIO.Say("...");
   }
  else if (cc.equals("B"))
   {
    netrexx.lang.RexxIO.Say("the case is B");
    netrexx.lang.RexxIO.Say("...");
   }
  else{
   netrexx.lang.RexxIO.Say("selection not recognized");
   netrexx.lang.RexxIO.Say("...");
  }
  }while(false);}
  catch (java.lang.RuntimeException $2){exs=$2;
   netrexx.lang.RexxIO.Say("Gronk!");
   exs.printStackTrace();
  }
  finally{
   netrexx.lang.RexxIO.Say("selection done");
   netrexx.lang.RexxIO.Say("TTFN");
  }}/*sl*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void conditionWasTrue(){
  netrexx.lang.RexxIO.Say("True");
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void conditionWasFalse(){
  netrexx.lang.RexxIO.Say("False");
  return;
  }
 
 private RConditionalStructures(){return;}
 }
