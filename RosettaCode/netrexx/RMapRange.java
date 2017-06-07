/* Generated from 'RMapRange.nrx' 17 Oct 2012 11:55:33 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RMapRange{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("1.0");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Mapping [");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("] to [");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("  f(");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx(") =");
 private static final java.lang.String $0="RMapRange.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx A[];
  netrexx.lang.Rexx B[];
  netrexx.lang.Rexx incr;
  netrexx.lang.Rexx sVal=null;
  A=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.0"),new netrexx.lang.Rexx("10.0")};
  B=new netrexx.lang.Rexx[]{$01.OpMinus(null),new netrexx.lang.Rexx("0.0")};
  incr=new netrexx.lang.Rexx("1.0");
  
  netrexx.lang.RexxIO.Say(((((((((($02.OpCc(null,A[0])).OpCc(null,$03)).OpCcblank(null,A[1])).OpCc(null,$04)).OpCc(null,B[0])).OpCc(null,$03)).OpCcblank(null,B[1])).OpCc(null,netrexx.lang.Rexx.toRexx("] in increments of"))).OpCcblank(null,incr)).OpCc(null,$05));
  {netrexx.lang.Rexx $1=A[1];netrexx.lang.Rexx $2=incr;boolean $3=$2.OpGtEq(null,$06);sVal=A[0].OpPlus(null);sVal:for(;$3?sVal.OpLtEq(null,$1):sVal.OpGtEq(null,$1);sVal=sVal.OpAdd(null,$2)){
   netrexx.lang.RexxIO.Say((($07.OpCc(null,sVal.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$08)).OpCcblank(null,mapRange(A,B,sVal).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3))));
   }
  }/*sVal*/
  
  return;
  }

 
 public static netrexx.lang.Rexx mapRange(netrexx.lang.Rexx a[],netrexx.lang.Rexx b[],netrexx.lang.Rexx s_){
  return mapRange(a[0],a[1],b[0],b[1],s_);
  }

 
 public static netrexx.lang.Rexx mapRange(netrexx.lang.Rexx a1,netrexx.lang.Rexx a2,netrexx.lang.Rexx b1,netrexx.lang.Rexx b2,netrexx.lang.Rexx s_){
  netrexx.lang.Rexx t_;
  t_=b1.OpAdd(null,(((s_.OpSub(null,a1))).OpMult(null,(b2.OpSub(null,b1))).OpDiv(null,(a2.OpSub(null,a1)))));
  return t_;
  }
 
 private RMapRange(){return;}
 }
