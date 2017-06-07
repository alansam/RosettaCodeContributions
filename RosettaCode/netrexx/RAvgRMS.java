/* Generated from 'RAvgRMS.nrx' 29 Dec 2012 11:26:53 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAvgRMS{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RAvgRMS.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx maxV=null;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx nr=null;
  double rmsD;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  maxV=$1[0];}
  if (maxV.OpEq(null,$02)|maxV.OpEq(null,$03)) 
   maxV=new netrexx.lang.Rexx((byte)10);
  
  sum=new netrexx.lang.Rexx((byte)0);
  {int $2=maxV.OpPlus(null).toint();nr=new netrexx.lang.Rexx((byte)1);nr:for(;$2>0;$2--,nr=nr.OpAdd(null,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd(null,nr.OpPow(null,$04));
   }
  }/*nr*/
  rmsD=java.lang.Math.sqrt(sum.OpDiv(null,maxV).todouble());
  
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("RMS of values from 1 to").OpCcblank(null,maxV)).OpCc(null,$05)).OpCcblank(null,new netrexx.lang.Rexx(rmsD)));
  
  return;
  }
 
 private RAvgRMS(){return;}
 }
