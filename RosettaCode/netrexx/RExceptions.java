/* Generated from 'RExceptions.nrx' 26 Jan 2013 19:40:06 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// =============================================================================

public class RExceptions{
 private static final java.lang.String $0="RExceptions.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void test() throws RExceptions.TakeException{
  if ((1==1)) 
   throw new RExceptions.TakeException();
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  java.lang.Exception ex=null;
  {try{
   (new RExceptions()).test();
  }
  catch (java.lang.Exception $1){ex=$1;
   netrexx.lang.RexxIO.Say(ex.toString());
  }}
  
  return;
  }
 
 public RExceptions(){return;}

// =============================================================================
 
 public static class TakeException extends java.lang.Exception{
  private final transient java.lang.String $0="RExceptions.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public TakeException(){
   super("I resent that!");
   return;
   }
 }}
