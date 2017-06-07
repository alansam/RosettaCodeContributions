/* Generated from 'RFactorsOfAnInteger01.nrx' 7 Jan 2013 22:13:14 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/* REXX ***************************************************************
 * Program to calculate and show divisors of positive integer(s).
 * 03.08.2012 Walter Pachl
 **********************************************************************/

public class RFactorsOfAnInteger01{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("   n = ");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('1');
 private static final char[] $05={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RFactorsOfAnInteger01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx numL;
  netrexx.lang.Rexx numH;
  netrexx.lang.Rexx j_=null;
  numL=new netrexx.lang.Rexx((byte)0);
  numH=new netrexx.lang.Rexx((byte)0);
  {running:for(;;){
   netrexx.lang.RexxIO.Say("Provide two integers [or anything else to stop]:");
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
   numL=$1[0];numH=$1[1];}
   if ((numL.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)|(numH.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
    break running;
   {netrexx.lang.Rexx $2=numH;j_=numL.OpPlus(null);j_:for(;j_.OpLtEq(null,$2);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((($02.OpCcblank(null,j_.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   divisors = "))).OpCcblank(null,divs(j_)));
    }
   }/*j_*/
   }
  }/*running*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx divs(netrexx.lang.Rexx x){
  netrexx.lang.Rexx LoHi;
  netrexx.lang.Rexx lo=null;
  netrexx.lang.Rexx hi=null;
  netrexx.lang.Rexx odd;
  netrexx.lang.Rexx j=null;
  if (x.OpEqS(null,$03)) 
   return new netrexx.lang.Rexx((byte)1);/*handle special case of 1     */
  LoHi=$04.OpCcblank(null,x);
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(LoHi,$05,$3);
  lo=$3[0];hi=$3[1];}/*initialize lists: lo=1 hi=x  */
  odd=x.OpRem(null,$06);/* 1 if x is odd               */
  {netrexx.lang.Rexx $4=$03.OpAdd(null,odd);j=$06.OpAdd(null,odd).OpPlus(null);j:for(;;j=j.OpAdd(null,$4)){if(!j.OpMult(null,j).OpLt(null,x))break;/*divide by numbers<sqrt(x)    */
   if (x.OpRem(null,j).OpEqS(null,$07)) 
    {/*Divisible?  Add two divisors:*/
     lo=lo.OpCcblank(null,j);/* list low divisors           */
     hi=x.OpDivI(null,j).OpCcblank(null,hi);/* list high divisors          */
    }
   }
  }/*j*/
  if (j.OpMult(null,j).OpEq(null,x)) /*for a square number as input */
   lo=lo.OpCcblank(null,j);/* add its square root         */
  return lo.OpCcblank(null,hi);/* return both lists           */
  }
 
 private RFactorsOfAnInteger01(){return;}
 }
