/* Generated from 'RSeiveOfEratosthenes01_Wheel02.nrx' 23 Jul 2012 14:28:38 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RSeiveOfEratosthenes01_Wheel02{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RSeiveOfEratosthenes01_Wheel02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx loWatermark=null;
  netrexx.lang.Rexx hiWatermark=null;
  long beginProc=0;
  netrexx.lang.Rexx seive=null;
  long endProc=0;
  java.util.Vector primes=null;
  long runTime=0;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  loWatermark=$1[0];hiWatermark=$1[1];}
  if (loWatermark.OpEq(null,$02)|loWatermark.OpEq(null,$03)) 
   loWatermark=new netrexx.lang.Rexx((byte)1);
  if (hiWatermark.OpEq(null,$02)|hiWatermark.OpEq(null,$03)) 
   hiWatermark=new netrexx.lang.Rexx((short)200);
  
  {try{
   if ((loWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)|(hiWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
    throw new java.lang.NumberFormatException("arguments must be whole numbers");
   if (loWatermark.OpGt(null,hiWatermark)) 
    throw new java.lang.IllegalArgumentException("the start value must be less than the end value");
   
   beginProc=java.lang.System.nanoTime();
   seive=sieveOfEratosthenes_Rexx(hiWatermark.toint());
   endProc=java.lang.System.nanoTime();
   primes=getPrimes(seive,loWatermark.toint(),hiWatermark.toint());
   runTime=endProc-beginProc;
   reporter(primes,loWatermark,hiWatermark,new netrexx.lang.Rexx(runTime));
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static final void reporter(java.util.Vector primes,netrexx.lang.Rexx loWatermark,netrexx.lang.Rexx hiWatermark,netrexx.lang.Rexx runTime){
  
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank(null,loWatermark)).OpCcblank(null,$04)).OpCcblank(null,hiWatermark)).OpCcblank(null,netrexx.lang.Rexx.toRexx("via a \"Sieve of Eratosthenes\" algorithm:")));
  netrexx.lang.RexxIO.Say("  "+primes.toString());
  netrexx.lang.RexxIO.Say("  Count of primes:"+" "+(primes.size()));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank(null,(runTime.OpDiv(null,$05)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc(null,$06));
  
  return;
  }

 
 public static netrexx.lang.Rexx sieveOfEratosthenes_Rexx(int hn){
  netrexx.lang.Rexx sv;
  int ix=0;
  int jx=0;
  
  sv=new netrexx.lang.Rexx((byte)1);
  sv.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)0); // one is not prime
  
  
  
  {int $3=hn;int $4=2;ix=3;ix:for(;ix<=$3;ix=ix+$4){if(!((ix*ix)<=hn))break;
   if ((sv.getnode(new netrexx.lang.Rexx(ix)).leaf).toboolean()) 
    {int $5=hn;int $6=ix+ix;boolean $7=$6>=0;jx=ix*3;jx:for(;$7?jx<=$5:jx>=$5;jx=jx+$6){
     sv.getnode(new netrexx.lang.Rexx(jx)).leaf=new netrexx.lang.Rexx((byte)0);
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 private static final java.util.Vector getPrimes(netrexx.lang.Rexx seive,int lo,int hi){
  java.util.Vector primes;
  int p_=0;
  
  primes=new java.util.Vector();
  if (lo<=2) 
   primes.add((java.lang.Object)(new java.lang.Long(2)));
  {int $8=hi;int $9=2;p_=3;p_:for(;p_<=$8;p_=p_+$9){
   if (p_<lo) 
    continue p_;
   if ((seive.getnode(new netrexx.lang.Rexx(p_)).leaf).OpNot(null)) 
    continue p_;
   primes.add((java.lang.Object)(new java.lang.Long(p_)));
   }
  }/*p_*/
  
  return primes;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RSeiveOfEratosthenes01_Wheel02(){return;}
 }
