/* Generated from 'RMiddle3Digits.nrx' 9 Feb 2013 10:36:09 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RMiddle3Digits{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Middle");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("characters");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("digits");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RMiddle3Digits.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx sl;
  netrexx.lang.Rexx digsL=null;
  netrexx.lang.Rexx digsR=null;
  netrexx.lang.Rexx dc=null;
  netrexx.lang.Rexx nn=null;
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  sl=(netrexx.lang.Rexx.toRexx("123 12345 1234567 987654321 10001 -10001 -123 -100 100 -12345").OpCcblank(null,netrexx.lang.Rexx.toRexx("1 2 -1 -10 2002 -2002 0"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("abc 1e3 -17e-3 4004.5 12345678 9876543210"));
  
  // extras
  
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  digsL=$1[0];digsR=$1[1];}
  if ((digsL.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
   digsL=new netrexx.lang.Rexx((byte)3);
  if ((digsR.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
   digsR=digsL;
  if (digsL.OpGt(null,digsR)) 
   digsR=digsL;
  
  {netrexx.lang.Rexx $2=digsR;dc=digsL.OpPlus(null);dc:for(;dc.OpLtEq(null,$2);dc=dc.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(($02.OpCcblank(null,dc)).OpCcblank(null,$03));
   {netrexx.lang.Rexx $3=sl.words();nn=new netrexx.lang.Rexx((byte)1);nn:for(;nn.OpLtEq(null,$3);nn=nn.OpAdd(null,new netrexx.lang.Rexx(1))){
    val=sl.word(nn);
    netrexx.lang.RexxIO.Say(middleDigits(dc,val));
    }
   }/*nn*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*dc*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static final netrexx.lang.Rexx middle3Digits(netrexx.lang.Rexx val){
  return middleDigits(new netrexx.lang.Rexx((byte)3),val);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static final netrexx.lang.Rexx middleDigits(netrexx.lang.Rexx digitCt,netrexx.lang.Rexx val){
  netrexx.lang.Rexx text;
  boolean even;
  netrexx.lang.Rexx valL=null;
  netrexx.lang.Rexx cutP=null;
  text=(val.right(new netrexx.lang.Rexx((byte)15))).OpCc(null,$04);
  even=digitCt.OpRem(null,$05).OpEqS(null,$06); // odd or even?
  {try{/*select*/
  if (digitCt.OpLtEq(null,$06))
   text=netrexx.lang.Rexx.toRexx("digit selection size must be >= 1");
  else if ((val.datatype(new netrexx.lang.Rexx('w'))).OpNot(null))
   text=text.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not a whole number"));
  else if ((val.abs().length()).OpLt(null,digitCt))
   text=((text.OpCcblank(null,netrexx.lang.Rexx.toRexx("has less than"))).OpCcblank(null,digitCt)).OpCcblank(null,$07);
  else if (new netrexx.lang.Rexx(even).OpNot(null)&(val.abs().length()).OpRem(null,$05).OpEqS(null,$06))
   text=text.OpCcblank(null,netrexx.lang.Rexx.toRexx("does not have an odd number of digits"));
  else if (even&(val.abs().length()).OpRem(null,$05).OpNotEq(null,$06))
   text=text.OpCcblank(null,netrexx.lang.Rexx.toRexx("does not have an even number of digits"));
  else{
   {
    val=val.abs();
    valL=val.length();
    cutP=((valL.OpSub(null,digitCt))).OpDivI(null,$05);
    text=text.OpCcblank(null,val.substr(cutP.OpAdd(null,$08),digitCt));
   }
  }
  }
  catch (java.lang.NumberFormatException $4){
   text=val.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not numeric"));
  }}
  return text;
  }
 
 private RMiddle3Digits(){return;}
 }
