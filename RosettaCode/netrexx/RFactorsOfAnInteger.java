/* Generated from 'RFactorsOfAnInteger.nrx' 24 Apr 2013 23:57:58 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ***********************************************************
* 21.04.2013 Walter Pachl
* 21.04.2013 add method main to accept argument(s)
*********************************************************************/

//class divl
//class RFactorsOfAnInteger

public class RFactorsOfAnInteger{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx("Java method RFactorsOfAnInteger.nrx");
 private static final char[] $03={2,1,46,10,3,0,0,1,1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("java");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("->");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RFactorsOfAnInteger.nrx";
 
 public static void main(java.lang.String argwords[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx b=null;
  netrexx.lang.Rexx pgmName=null;
  netrexx.lang.Rexx x=null;
  arg=new netrexx.lang.Rexx(argwords);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  a=$1[0];b=$1[1];}
  netrexx.lang.RexxIO.Say(a.OpCcblank(null,b));
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse($02,$03,$2);
  pgmName=$2[1];}
  if (a.OpEq(null,$04)) 
   {
    //help='java divl low [high] shows'
    //help=help||' divisors of all numbers between low and high'
    //Say help
    netrexx.lang.RexxIO.Say((($05.OpCcblank(null,pgmName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("low [high] shows"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("divisors of all numbers between low and high")));
    
    return;
   }
  if (b.OpEq(null,$04)) 
   b=a;
  {netrexx.lang.Rexx $3=b;x=a.OpPlus(null);x:for(;x.OpLtEq(null,$3);x=x.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((x.OpCcblank(null,$06)).OpCcblank(null,divs(x)));
   }
  }/*x*/
  return;}

 
 public static netrexx.lang.Rexx divs(netrexx.lang.Rexx x){
  netrexx.lang.Rexx lo;
  netrexx.lang.Rexx hi;
  netrexx.lang.Rexx odd;
  netrexx.lang.Rexx j=null;
  if (x.OpEqS(null,$07)) 
   return new netrexx.lang.Rexx((byte)1);/*handle special case of 1     */
  lo=new netrexx.lang.Rexx((byte)1);
  hi=x;
  odd=x.OpRem(null,$08);/* 1 if x is odd               */
  {netrexx.lang.Rexx $4=$07.OpAdd(null,odd);j=$08.OpAdd(null,odd).OpPlus(null);j:for(;;j=j.OpAdd(null,$4)){if(!j.OpMult(null,j).OpLt(null,x))break;/*divide by numbers<sqrt(x)    */
   if (x.OpRem(null,j).OpEqS(null,$09)) 
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
 
 private RFactorsOfAnInteger(){return;}
 }
