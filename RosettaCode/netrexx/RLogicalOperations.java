/* Generated from 'RLogicalOperations.nrx' 4 Jan 2013 17:13:26 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RLogicalOperations{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)32);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("shift:");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("]:");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RLogicalOperations.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx num=null;
  netrexx.lang.Rexx shift=null;
  netrexx.lang.Rexx sl=null;
  netrexx.lang.Rexx sr=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  num=$1[0];shift=$1[1];}
  if (num.OpEq(null,$02)|num.OpEq(null,$03)) 
   num=new netrexx.lang.Rexx((byte)1);
  if (shift.OpEq(null,$02)|shift.OpEq(null,$03)) 
   shift=new netrexx.lang.Rexx((byte)2);
  
  {shift=new netrexx.lang.Rexx((byte)0);shift:for(;shift.OpLtEq(null,$04);shift=shift.OpAdd(null,new netrexx.lang.Rexx(1))){
   sl=SLA(num,shift);
   sr=SRA(num,shift);
   netrexx.lang.RexxIO.Say($05.OpCcblank(null,shift));
   netrexx.lang.RexxIO.Say((((((((num.format(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6))).OpCcblank(null,$06)).OpCc(null,num.d2x())).OpCc(null,$07)).OpCcblank(null,sl.format(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,$06)).OpCc(null,sl.d2x())).OpCc(null,$08));
   netrexx.lang.RexxIO.Say((((((((num.format(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6))).OpCcblank(null,$06)).OpCc(null,num.d2x())).OpCc(null,$07)).OpCcblank(null,sr.format(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,$06)).OpCc(null,sr.d2x())).OpCc(null,$08));
   }
  }/*shift*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx SLA(netrexx.lang.Rexx num,netrexx.lang.Rexx shift){
  return num.OpMult(null,$09.OpPow(null,shift));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx SRA(netrexx.lang.Rexx num,netrexx.lang.Rexx shift){
  return num.OpDivI(null,$09.OpPow(null,shift));
  }
 
 private RLogicalOperations(){return;}
 }
