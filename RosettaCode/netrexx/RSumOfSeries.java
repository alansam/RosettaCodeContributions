/* Generated from 'RSumOfSeries.nrx' 23 Nov 2012 11:17:54 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RSumOfSeries{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)200);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("is");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RSumOfSeries.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nStart=null;
  netrexx.lang.Rexx nEnd=null;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  nStart=$2[0];nEnd=$2[1];}
  
  if (nStart.OpEq($1,$03)) 
   nStart=new netrexx.lang.Rexx((byte)1);
  if (nEnd.OpEq($1,$03)) 
   nEnd=new netrexx.lang.Rexx((short)1000);
  
  sum=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $3=nEnd;x=nStart.OpPlus($1);x:for(;x.OpLtEq($1,$3);x=x.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd($1,S(x));
   }
  }/*x*/
  
  netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Sum of S(x) from").OpCcblank($1,nStart)).OpCcblank($1,$04)).OpCcblank($1,nEnd)).OpCcblank($1,$05)).OpCcblank($1,sum));
  
  return;
  }

 // =============================================================================
 
 public static netrexx.lang.Rexx S(netrexx.lang.Rexx x){
  return $07.OpDiv($1,x.OpPow($1,$06));
  }
 
 private RSumOfSeries(){return;}
 }
