/* Generated from 'RBenfordsLaw01.nrx' 22 May 2013 01:09:57 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RBenfordsLaw01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)9);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('%');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx("1000.0");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx("25.4");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx((byte)6);
 private static final char[] $015={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RBenfordsLaw01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void brenfordDeveation(netrexx.lang.Rexx nlist[]){
  netrexx.lang.Rexx actuals;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx d1=null;
  netrexx.lang.Rexx actual=null;
  netrexx.lang.Rexx expect=null;
  netrexx.lang.Rexx deviat=null;
  actuals=new netrexx.lang.Rexx((byte)0);
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[nlist.length];synchronized(nlist){for(;;){if($3==$2.length)break;$2[$3]=nlist[nlist.length-1-$3];$3++;}}n_:for(;;){if(--$3<0)break;n_=(netrexx.lang.Rexx)$2[$3];
   d1=n_.left(new netrexx.lang.Rexx((byte)1));
   if (d1.OpEq(null,$01)) 
    continue n_;
   actuals.getnode(d1).leaf=(actuals.getnode(d1).leaf).OpAdd(null,$02);
   }
  }/*n_*/
  {n_=new netrexx.lang.Rexx((byte)1);n_:for(;n_.OpLtEq(null,$03);n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
   actual=((actuals.getnode(n_).leaf).OpDiv(null,(new netrexx.lang.Rexx(nlist.length).OpSub(null,$02))));
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
 
 public static netrexx.lang.Rexx[] peaksOfTheBritishIsles(){
  return peaksOfTheBritishIsles(new netrexx.lang.Rexx('M'));
  }
 public static netrexx.lang.Rexx[] peaksOfTheBritishIsles(netrexx.lang.Rexx units){
  netrexx.lang.Rexx ufactor=null;
  netrexx.lang.Rexx BIPeaksFileName;
  netrexx.lang.Rexx _HEIGHT;
  netrexx.lang.Rexx peaklist;
  netrexx.lang.Rexx peakheights[];
  netrexx.lang.Rexx peak=null;
  netrexx.lang.Rexx height=null;
  units=units.upper();
  {/*select*/
  if (units.OpEqS(null,new netrexx.lang.Rexx('M')))
   ufactor=new netrexx.lang.Rexx((byte)1);
  else if (units.OpEqS(null,new netrexx.lang.Rexx('F')))
   ufactor=$08.OpDiv(null,$09).OpDiv(null,$010);
  else{
   ufactor=new netrexx.lang.Rexx((byte)1);
  }
  }
  BIPeaksFileName=netrexx.lang.Rexx.toRexx("ZBIPeaks.txt");
  _HEIGHT=netrexx.lang.Rexx.toRexx("HEIGHT");
  peaklist=ZBIPeaks.getPeaks(BIPeaksFileName);
  peakheights=new netrexx.lang.Rexx[(peaklist.getnode(new netrexx.lang.Rexx((byte)0)).leaf).toint()];
  {netrexx.lang.Rexx $5=peaklist.getnode(new netrexx.lang.Rexx((byte)0)).leaf;peak=new netrexx.lang.Rexx((byte)1);peak:for(;peak.OpLtEq(null,$5);peak=peak.OpAdd(null,new netrexx.lang.Rexx(1))){
   height=peaklist.getnode(peak).leaf.getnode(_HEIGHT).leaf;
   peakheights[peak.OpSub(null,$02).toint()]=height.OpMult(null,ufactor);
   }
  }/*peak*/
  return peakheights;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] primeNumbers(){
  return primeNumbers(new netrexx.lang.Rexx((short)1000));
  }
 public static netrexx.lang.Rexx[] primeNumbers(netrexx.lang.Rexx size){
  netrexx.lang.Rexx pn[];
  netrexx.lang.Rexx ix;
  netrexx.lang.Rexx iv=null;
  netrexx.lang.Rexx n_=null;
  pn=new netrexx.lang.Rexx[size.toint()];
  ix=new netrexx.lang.Rexx((byte)0);
  {iv=new netrexx.lang.Rexx((byte)2);boolean $6=true;iv:for(;;){if($6){$6=false;}else{if(ix.OpEq(null,size))break;iv=iv.OpAdd(null,new netrexx.lang.Rexx(1));}
   if (new netrexx.lang.Rexx(isPrime(iv)).OpNot(null)) 
    continue iv;
   pn[ix.toint()]=iv;
   ix=ix.OpAdd(null,$02);
   }
  }/*iv*/
  {n_=new netrexx.lang.Rexx((byte)0);n_:for(;;n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!n_.OpLt(null,new netrexx.lang.Rexx(pn.length)))break;
   netrexx.lang.RexxIO.Say(((n_.OpAdd(null,$02)).right(new netrexx.lang.Rexx((byte)5))).OpCcblank(null,pn[n_.toint()].right(new netrexx.lang.Rexx((byte)8))));
   }
  }/*n_*/
  return pn;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(netrexx.lang.Rexx x){
  boolean _true;
  boolean _false;
  boolean pv=false;
  netrexx.lang.Rexx j=null;
  _true=(1==1);
  _false=new netrexx.lang.Rexx(_true).OpNot(null);
  {/*select*/
  if (x.OpEqS(null,$01))
   pv=_false;
  else if (x.OpEqS(null,$02))
   pv=_false;
  else if (x.OpEqS(null,$07))
   pv=_true;
  else if (x.OpEqS(null,$011))
   pv=_true;
  else if (x.OpEqS(null,$012))
   pv=_true;
  else if (x.OpEqS(null,$013))
   pv=_true;
  else if (x.OpRem(null,$07).OpEqS(null,$01))
   pv=_false;
  else if (x.OpRem(null,$011).OpEqS(null,$01))
   pv=_false;
  else{
   {netrexx.lang.Rexx $7=$014;j=new netrexx.lang.Rexx((byte)5);boolean $8=true;j:for(;;){if($8){$8=false;}else{if(j.OpMult(null,j).OpGt(null,x))break;j=j.OpAdd(null,$7);}
    {/*select*/
    if (x.OpRem(null,j).OpEqS(null,$01))
     {
      pv=_false;
      break j;
     }
    else if (x.OpRem(null,(j.OpAdd(null,$07))).OpEqS(null,$01))
     {
      pv=_false;
      break j;
     }
    else{
     pv=_true;
    }
    }
    }
   }/*j*/
  }
  }
  return pv;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx fibList[];
  netrexx.lang.Rexx metres[];
  netrexx.lang.Rexx feet[];
  netrexx.lang.Rexx primes[];
  {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$015,$9);
  n_=$9[0];}
  if (n_.OpEq(null,$016)) 
   n_=new netrexx.lang.Rexx((short)1000);
  fibList=fibonacciList(n_);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Fibonacci sequence to").OpCcblank(null,n_));
  brenfordDeveation(fibList);
  metres=peaksOfTheBritishIsles();
  netrexx.lang.RexxIO.Say("Peak heights in metres");
  brenfordDeveation(metres);
  feet=peaksOfTheBritishIsles(new netrexx.lang.Rexx('f'));
  netrexx.lang.RexxIO.Say("Peak heights in feet");
  brenfordDeveation(feet);
  netrexx.lang.RexxIO.Say("Prime numbers");
  primes=primeNumbers();
  brenfordDeveation(primes);
  return;
  }
 
 private RBenfordsLaw01(){return;}
 }
