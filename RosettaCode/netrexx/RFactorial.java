/* Generated from 'RFactorial.nrx' 7 Sep 2011 16:16:49 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



// switch to exponential format when numbers become larger than 64 digits


public class RFactorial{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)64);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("! =");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("Sorry, but");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('R');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RFactorial.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  long n_=0;
  java.lang.Exception ex=null;
  netrexx.lang.RexxIO.Say("Input a number: \000");
  netrexx.lang.RexxIO.Say("");
  {try{
   n_=(netrexx.lang.RexxIO.Ask()).tolong(); // Gets the number, must be an integer
   
   netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(n_).OpCc($1,$02)).OpCcblank($1,factorial(n_))).OpCcblank($1,netrexx.lang.Rexx.toRexx("(using iteration)")));
   netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(n_).OpCc($1,$02)).OpCcblank($1,factorial(n_,new netrexx.lang.Rexx('r')))).OpCcblank($1,netrexx.lang.Rexx.toRexx("(using recursion)")));
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static netrexx.lang.Rexx factorial(long n_) throws java.lang.IllegalArgumentException{
  return factorial(n_,new netrexx.lang.Rexx('I'));
  }
 public static netrexx.lang.Rexx factorial(long n_,netrexx.lang.Rexx fmethod) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx fact=null;
  
  if (new netrexx.lang.Rexx(n_).OpLt($1,$03)) 
   throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString(($04.OpCcblank($1,new netrexx.lang.Rexx(n_))).OpCcblank($1,netrexx.lang.Rexx.toRexx("is not a positive integer"))));
  
  {/*select*/
  if ((fmethod.upper()).OpEq($1,$05))
   fact=factorialRecursive(n_);
  else{
   fact=factorialIterative(n_);
  }
  }
  
  return fact;
  }

 
 private static netrexx.lang.Rexx factorialIterative(long n_){
  netrexx.lang.Rexx fact;
  netrexx.lang.Rexx i_=null;
  
  fact=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(n_);i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq($1,$3);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   fact=fact.OpMult($1,i_);
   }
  }/*i_*/
  
  return fact;
  }

 
 private static netrexx.lang.Rexx factorialRecursive(long n_){
  netrexx.lang.Rexx fact=null;
  
  if (new netrexx.lang.Rexx(n_).OpGt($1,$06)) 
   fact=new netrexx.lang.Rexx(n_).OpMult($1,factorialRecursive(new netrexx.lang.Rexx(n_).OpSub($1,$06).tolong()));
  else 
   fact=new netrexx.lang.Rexx((byte)1);
  
  return fact;
  }
 
 private RFactorial(){return;}
 }
