/* Generated from 'RSeiveOfEratosthenes07.nrx' 23 Jul 2012 14:28:38 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSeiveOfEratosthenes07{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RSeiveOfEratosthenes07.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx loWatermark=null;
  netrexx.lang.Rexx hiWatermark=null;
  long beginProc=0;
  boolean seiveBits[]=null;
  long seiveProc=0;
  java.util.Vector primes=null;
  long endProc=0;
  long seiveTime=0;
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
   seiveBits=sieveOfEratosthenes_BitSet(hiWatermark.toint());
   seiveProc=java.lang.System.nanoTime();
   primes=getPrimes(seiveBits,loWatermark.toint(),hiWatermark.toint());
   endProc=java.lang.System.nanoTime();
   seiveTime=seiveProc-beginProc;
   runTime=endProc-beginProc;
   netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank(null,loWatermark)).OpCcblank(null,$04)).OpCcblank(null,hiWatermark)).OpCcblank(null,netrexx.lang.Rexx.toRexx("via a \"Sieve of Eratosthenes\" algorithm:")));
   netrexx.lang.RexxIO.Say("  "+primes.toString());
   netrexx.lang.RexxIO.Say("  Count of primes:"+" "+(primes.size()));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Time in seive:").OpCcblank(null,(new netrexx.lang.Rexx(((double)seiveTime)/((double)1000000000))).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc(null,$05));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank(null,(new netrexx.lang.Rexx(((double)runTime)/((double)1000000000))).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc(null,$05));
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static boolean[] sieveOfEratosthenes_BitSet(int hn){
  boolean sv[];
  int ix=0;
  int jx=0;
  int ex=0;
  
  sv=new boolean[hn+1]; // An array of boolean where for each boolean: FALSE indicates its index is a prime
  
  
  sv[0]=isTrue(); // zero is not prime
  sv[1]=isTrue(); // one is not prime
  
  {int $3=hn;int $4=2;ex=2*2;ex:for(;ex<=$3;ex=ex+$4){
   sv[ex]=isTrue();
   }
  }/*ex*/
  
  {int $5=hn;int $6=2;ix=3;ix:for(;ix<=$5;ix=ix+$6){if(!((ix*ix)<=hn))break;
   if ((!sv[ix])) 
    {int $7=hn;int $8=ix+ix;boolean $9=$8>=0;jx=ix*3;jx:for(;$9?jx<=$7:jx>=$7;jx=jx+$8){
     sv[jx]=isTrue();
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 private static final java.util.Vector getPrimes(boolean seive[],int lo,int hi){
  java.util.Vector primes;
  int p_=0;
  
  primes=new java.util.Vector();
  {int $10=hi;p_=lo;p_:for(;p_<=$10;p_++){
   if (seive[p_]) 
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
 
 private RSeiveOfEratosthenes07(){return;}
 }
