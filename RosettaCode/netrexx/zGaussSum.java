/* Generated from 'zGaussSum.nrx' 7 Jan 2013 20:56:57 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// From Carl Friedrich Gauss: (N + 1) * N / 2
// See: http://mathforum.org/library/drmath/view/57919.html


public class zGaussSum{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="zGaussSum.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx N=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  N=$1[0];}
  if (N.OpEq(null,$02)|N.OpEq(null,$03)) 
   N=new netrexx.lang.Rexx((byte)100);
  
  netrexx.lang.RexxIO.Say(sumToN(N));
  
  netrexx.lang.RexxIO.Say("");
  {N=new netrexx.lang.Rexx((byte)1);N:for(;N.OpLtEq(null,$04);N=N.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((N.right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$05)).OpCcblank(null,sumToN(N).right(new netrexx.lang.Rexx((byte)7))));
   }
  }/*N*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx sumToN(netrexx.lang.Rexx N){
  netrexx.lang.Rexx sum;
  sum=((N.OpAdd(null,$06))).OpMult(null,N).OpDiv(null,$07);
  return sum;
  }
 
 private zGaussSum(){return;}
 }
