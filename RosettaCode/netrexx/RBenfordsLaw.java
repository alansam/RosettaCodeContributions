/* Generated from 'RBenfordsLaw.nrx' 22 May 2013 01:18:56 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RBenfordsLaw{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)9);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('%');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final char[] $08={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RBenfordsLaw.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void brenfordDeveation(netrexx.lang.Rexx nlist[]){
  netrexx.lang.Rexx observed;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx d1=null;
  netrexx.lang.Rexx actual=null;
  netrexx.lang.Rexx expect=null;
  netrexx.lang.Rexx deviat=null;
  observed=new netrexx.lang.Rexx((byte)0);
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[nlist.length];synchronized(nlist){for(;;){if($3==$2.length)break;$2[$3]=nlist[nlist.length-1-$3];$3++;}}n_:for(;;){if(--$3<0)break;n_=(netrexx.lang.Rexx)$2[$3];
   d1=n_.left(new netrexx.lang.Rexx((byte)1));
   if (d1.OpEq(null,$01)) 
    continue n_;
   observed.getnode(d1).leaf=(observed.getnode(d1).leaf).OpAdd(null,$02);
   }
  }/*n_*/
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(' ').right(new netrexx.lang.Rexx((byte)4)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Observed").right(new netrexx.lang.Rexx((byte)11)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Expected").right(new netrexx.lang.Rexx((byte)11)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Deviation").right(new netrexx.lang.Rexx((byte)11))));
  {n_=new netrexx.lang.Rexx((byte)1);n_:for(;n_.OpLtEq(null,$03);n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
   actual=((observed.getnode(n_).leaf).OpDiv(null,(new netrexx.lang.Rexx(nlist.length).OpSub(null,$02))));
   expect=new netrexx.lang.Rexx(java.lang.Math.log10($02.OpAdd(null,$02.OpDiv(null,n_)).todouble()));
   deviat=expect.OpSub(null,actual);
   netrexx.lang.RexxIO.Say((((((((n_.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$04)).OpCcblank(null,(actual.OpMult(null,$05)).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6)))).OpCc(null,$06)).OpCcblank(null,(expect.OpMult(null,$05)).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6)))).OpCc(null,$06)).OpCcblank(null,(deviat.OpMult(null,$05)).abs().format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6)))).OpCc(null,$06));
   }
  }/*n_*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] fibonacciList(){
  return fibonacciList(new netrexx.lang.Rexx((short)1000));
  }
 public static netrexx.lang.Rexx[] fibonacciList(netrexx.lang.Rexx size){
  netrexx.lang.Rexx fibs[];
  netrexx.lang.Rexx n_=null;
  fibs=new netrexx.lang.Rexx[size.OpAdd(null,$02).toint()];
  fibs[0]=new netrexx.lang.Rexx((byte)0);
  fibs[1]=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $4=size;n_=new netrexx.lang.Rexx((byte)2);n_:for(;n_.OpLtEq(null,$4);n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
   fibs[n_.toint()]=(fibs[n_.OpSub(null,$02).toint()]).OpAdd(null,fibs[n_.OpSub(null,$07).toint()]);
   }
  }/*n_*/
  return fibs;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx fibList[];
  {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$08,$5);
  n_=$5[0];}
  if (n_.OpEq(null,$09)) 
   n_=new netrexx.lang.Rexx((short)1000);
  fibList=fibonacciList(n_);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Fibonacci sequence to").OpCcblank(null,n_));
  brenfordDeveation(fibList);
  return;
  }
 
 private RBenfordsLaw(){return;}
 }
