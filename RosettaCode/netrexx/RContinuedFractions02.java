/* Generated from 'RContinuedFractions02.nrx' 24 Sep 2012 14:47:23 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* REXX ***************************************************************
* Derived from REXX ... Derived from PL/I with a little "massage"
* SQRT2=  1.41421356237309505              <- PL/I Result
*         1.41421356237309504880168872421  <- NetRexx Result 30 digits
* NAPIER= 2.71828182845904524
*         2.71828182845904523536028747135
* PI=     3.14159262280484695
*         3.14159262280484694855146925223
* 07.09.2012 Walter Pachl
* 08.09.2012 Walter Pachl simplified (with the help of a friend)
**********************************************************************/





public class RContinuedFractions02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)1);
 private static final java.lang.String $0="RContinuedFractions02.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties static */
 protected static netrexx.lang.Rexx Sqrt2=new netrexx.lang.Rexx((byte)1);
 protected static netrexx.lang.Rexx napier=new netrexx.lang.Rexx((byte)2);
 protected static netrexx.lang.Rexx pi=new netrexx.lang.Rexx((byte)3);
 protected static netrexx.lang.Rexx a=new netrexx.lang.Rexx((byte)0);
 protected static netrexx.lang.Rexx b=new netrexx.lang.Rexx((byte)0);

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("SQRT2=").left(new netrexx.lang.Rexx((byte)7)).OpCcblank($1,calc(Sqrt2,new netrexx.lang.Rexx((short)200))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("NAPIER=").left(new netrexx.lang.Rexx((byte)7)).OpCcblank($1,calc(napier,new netrexx.lang.Rexx((short)200))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("PI=").left(new netrexx.lang.Rexx((byte)7)).OpCcblank($1,calc(pi,new netrexx.lang.Rexx((short)200))));
  return;
  }

 
 public static void get_Coeffs(netrexx.lang.Rexx form,netrexx.lang.Rexx n){
  {/*select*/
  if (form.OpEq($1,Sqrt2))
   {
    if (n.OpGt($1,$02)) 
     a=new netrexx.lang.Rexx((byte)2);
    else 
     a=new netrexx.lang.Rexx((byte)1);
    b=new netrexx.lang.Rexx((byte)1);
   }
  else if (form.OpEq($1,napier))
   {
    if (n.OpGt($1,$02)) 
     a=n;
    else 
     a=new netrexx.lang.Rexx((byte)2);
    if (n.OpGt($1,$03)) 
     b=n.OpSub($1,$03);
    else 
     b=new netrexx.lang.Rexx((byte)1);
   }
  else if (form.OpEq($1,pi))
   {
    if (n.OpGt($1,$02)) 
     a=new netrexx.lang.Rexx((byte)6);
    else 
     a=new netrexx.lang.Rexx((byte)3);
    b=(($04.OpMult($1,n).OpSub($1,$03))).OpPow($1,$04);
   }
  
  else{throw new netrexx.lang.NoOtherwiseException();}
  }
  return;
  }

 
 public static netrexx.lang.Rexx calc(netrexx.lang.Rexx form,netrexx.lang.Rexx n){
  netrexx.lang.Rexx temp;
  netrexx.lang.Rexx ni=null;
  temp=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=$03.OpMinus($1);boolean $3=$2.OpGtEq($1,$02);ni=n.OpPlus($1);ni:for(;$3?ni.OpLtEq($1,$05):ni.OpGtEq($1,$05);ni=ni.OpAdd($1,$2)){
   get_Coeffs(form,ni);
   temp=b.OpDiv($1,(a.OpAdd($1,temp)));
   }
  }/*ni*/
  get_Coeffs(form,new netrexx.lang.Rexx((byte)0));
  return (a.OpAdd($1,temp));
  }
 
 private RContinuedFractions02(){return;}
 }
/*
Who could help me make a,b,sqrt2,napier,pi global (public) variables? This would simplify the solution:-)
I got this help and simplified the program.
However, I am told that 'my' value of pi is incorrect. I will investigate!
Apparently the coefficients given in the task description are only good for an approxunation. One should, therefore, not SHOW more that 15 digits. See http://de.wikipedia.org/wiki/Kreiszahl
*/
