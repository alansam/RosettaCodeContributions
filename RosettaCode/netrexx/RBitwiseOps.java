/* Generated from 'RBitwiseOps.nrx' 6 Apr 2015 15:50:41 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/*
 Write a routine to perform a bitwise AND, OR, and XOR on two integers,
 a bitwise NOT on the first integer, a left shift, right shift,
 right arithmetic shift, left rotate, and right rotate.
 All shifts and rotates should be done on the first integer with a
 shift/rotate amount of the second integer. If any operation is not
 available in your language, note it.
 */


public class RBitwiseOps{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("AND:");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("OR:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("XOR:");
 private static final java.lang.String $0="RBitwiseOps.nrx";
 
 public static void main(java.lang.String $0s[]){
  bitwise(255,4080);
  bitwise(-1,-65536);
  bitwise(16777215,16776960);
  bitwise(65535,65280);
  return;
  }

 
 public static void bitwise(int iL,int iR){
  int iA;
  int iO;
  int iX;
  
  netrexx.lang.RexxIO.Say((pX(new netrexx.lang.Rexx(iL))).OpCcblank(null,pX(new netrexx.lang.Rexx(iR))));
  iA=iL&iR;
  iO=iL|iR;
  iX=iL^iR;
  netrexx.lang.RexxIO.Say((((($01.OpCcblank(null,pX(new netrexx.lang.Rexx(iA)))).OpCcblank(null,$02)).OpCcblank(null,pX(new netrexx.lang.Rexx(iO)))).OpCcblank(null,$03)).OpCcblank(null,pX(new netrexx.lang.Rexx(iX))));
  netrexx.lang.RexxIO.Say("");
  return;
  }

 
 public static netrexx.lang.Rexx pX(netrexx.lang.Rexx xv){
  return (new netrexx.lang.Rexx(xv)).d2x(new netrexx.lang.Rexx((byte)8));
  }
 
 private RBitwiseOps(){return;}
 }
