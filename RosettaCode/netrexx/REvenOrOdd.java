/* Generated from 'REvenOrOdd.nrx' 24 Jan 2013 19:04:57 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class REvenOrOdd{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("---");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(15);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)15);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)3);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("13579");
 private static final java.lang.String $0="REvenOrOdd.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nn=null;
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Val").right(new netrexx.lang.Rexx((byte)5)).OpCc(null,netrexx.lang.Rexx.toRexx(": mod  - ver  - pos  - bits")));
  netrexx.lang.RexxIO.Say($01.right(new netrexx.lang.Rexx((byte)5)).OpCc(null,netrexx.lang.Rexx.toRexx(": ---- + ---- + ---- + ----")));
  {netrexx.lang.Rexx $1=$04;nn=$02.OpMinus(null).OpPlus(null);nn:for(;nn.OpLtEq(null,$03);nn=nn.OpAdd(null,$1)){
   netrexx.lang.RexxIO.Say(((((((((nn.right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$05)).OpCcblank(null,eo(isEven(nn)))).OpCcblank(null,$06)).OpCcblank(null,eo(isEven(nn,new netrexx.lang.Rexx('v'))))).OpCcblank(null,$06)).OpCcblank(null,eo(isEven(nn,new netrexx.lang.Rexx('p'))))).OpCcblank(null,$06)).OpCcblank(null,eo(isEven(nn,new netrexx.lang.Rexx('b')))));
   }
  }/*nn*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Overloaded method.  Default is to use the remainder specialization below
 
 public static boolean isEven(netrexx.lang.Rexx anInt){
  return isEven(anInt,new netrexx.lang.Rexx('R'));
  }
 public static boolean isEven(netrexx.lang.Rexx anInt,netrexx.lang.Rexx meth){
  boolean eo=false;
  {/*select*/netrexx.lang.Rexx $2=meth.upper().left(new netrexx.lang.Rexx((byte)1));
  if ($2.OpEqS(null,new netrexx.lang.Rexx('R')))
   eo=isEvenRemainder(anInt);
  else if ($2.OpEqS(null,new netrexx.lang.Rexx('V')))
   eo=isEvenVerify(anInt);
  else if ($2.OpEqS(null,new netrexx.lang.Rexx('P')))
   eo=isEvenPos(anInt);
  else if ($2.OpEqS(null,new netrexx.lang.Rexx('B')))
   eo=isEvenBits(anInt);
  else{
   eo=isEvenRemainder(anInt); // default
  }
  }
  return eo;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isEvenRemainder(netrexx.lang.Rexx anInt){
  return anInt.OpRem(null,$07).OpEqS(null,$08);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isEvenVerify(netrexx.lang.Rexx anInt){
  return (anInt.right(new netrexx.lang.Rexx((byte)1)).verify(netrexx.lang.Rexx.toRexx("02468"))).OpEqS(null,$08);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isEvenPos(netrexx.lang.Rexx anInt){
  return $09.pos(anInt.right(new netrexx.lang.Rexx((byte)1))).OpEqS(null,$08);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isEvenBits(netrexx.lang.Rexx anInt){
  return ((anInt.d2x(new netrexx.lang.Rexx((byte)1)).x2b().right(new netrexx.lang.Rexx((byte)1)))).OpNot(null);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx eo(boolean state){
  netrexx.lang.Rexx sv=null;
  if (state) 
   sv=netrexx.lang.Rexx.toRexx("Even");
  else 
   sv=netrexx.lang.Rexx.toRexx("Odd");
  return sv.left(new netrexx.lang.Rexx((byte)4));
  }
 
 private REvenOrOdd(){return;}
 }
