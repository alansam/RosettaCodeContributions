/* Generated from 'RLogicalOps.nrx' 3 Mar 2013 21:29:03 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RLogicalOps{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("AND");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("OR ");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("XOR");
 private static final java.lang.String $0="RLogicalOps.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void logicalOperation(boolean xL,boolean xR){
  netrexx.lang.RexxIO.Say(((((showBool(xL)).OpCcblank(null,$01)).OpCcblank(null,showBool(xR))).OpCcblank(null,$02)).OpCcblank(null,showBool(xL&xR))); // AND
  netrexx.lang.RexxIO.Say(((((showBool(xL)).OpCcblank(null,$03)).OpCcblank(null,showBool(xR))).OpCcblank(null,$02)).OpCcblank(null,showBool(xL|xR))); // OR
  netrexx.lang.RexxIO.Say(((((showBool(xL)).OpCcblank(null,$04)).OpCcblank(null,showBool(xR))).OpCcblank(null,$02)).OpCcblank(null,showBool(xL^xR))); // XOR
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("     "+" "+"NOT").OpCcblank(null,showBool(xL))).OpCcblank(null,$02)).OpCcblank(null,showBool((!xL)))); // NOT
  netrexx.lang.RexxIO.Say("");
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx showBool(boolean bb){
  java.lang.String bt=null;
  if (bb) 
   bt="true ";
  else 
   bt="false";
  return netrexx.lang.Rexx.toRexx(bt);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  boolean TRUE_;
  boolean FALSE_;
  boolean lpairs[][];
  int lx=0;
  boolean lpair[]=null;
  TRUE_=(1==1);
  FALSE_=(!TRUE_);
  lpairs=new boolean[][]{new boolean[]{TRUE_,TRUE_},new boolean[]{TRUE_,FALSE_},new boolean[]{FALSE_,TRUE_},new boolean[]{FALSE_,FALSE_}};
  
  
  
  
  
  {int $1=lpairs.length-1;lx=0;lx:for(;lx<=$1;lx++){
   lpair=lpairs[lx];
   //say showBool(lpair[0]) showBool(lpair[1])
   logicalOperation(lpair[0],lpair[1]);
   }
  }/*lx*/
  return;
  }
 
 private RLogicalOps(){return;}
 }
