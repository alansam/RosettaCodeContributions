/* Generated from 'RSeiveOfEratosthenesTests.nrx' 4 Jan 2013 14:30:44 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.Vector;

/* NetRexx */







public class RSeiveOfEratosthenesTests{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("is");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RSeiveOfEratosthenesTests.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx loWatermark=null;
  netrexx.lang.Rexx hiWatermark=null;
  netrexx.lang.Rexx testForPrime=null;
  long beginProc=0;
  netrexx.lang.Rexx seiveR=null;
  long endProc=0;
  java.util.Vector primes=null;
  netrexx.lang.Rexx runTime=null;
  netrexx.lang.Rexx prime=null;
  java.util.BitSet seiveB=null;
  boolean seiveBA[]=null;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  loWatermark=$2[0];hiWatermark=$2[1];testForPrime=$2[2];}
  if (loWatermark.OpEq($1,$03)|loWatermark.OpEq($1,$04)) 
   loWatermark=new netrexx.lang.Rexx((byte)1);
  if (hiWatermark.OpEq($1,$03)|hiWatermark.OpEq($1,$04)) 
   hiWatermark=new netrexx.lang.Rexx((short)200);
  if (testForPrime.OpEq($1,$03)|testForPrime.OpEq($1,$04)) 
   testForPrime=new netrexx.lang.Rexx((short)313);
  
  {try{
   if ((loWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)|(hiWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)) 
    throw new java.lang.NumberFormatException("arguments must be whole numbers");
   if (loWatermark.OpGt($1,hiWatermark)) 
    throw new java.lang.IllegalArgumentException("the start value must be less than the end value");
   
   beginProc=java.lang.System.nanoTime();
   seiveR=sieveOfEratosthenes_Rexx(hiWatermark);
   endProc=java.lang.System.nanoTime();
   primes=getPrimes(seiveR,loWatermark,hiWatermark);
   runTime=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
   reporter(primes,loWatermark,hiWatermark,runTime);
   if (isPrime(testForPrime,sieveOfEratosthenes_Rexx(testForPrime))) 
    prime=netrexx.lang.Rexx.toRexx("prime");
   else 
    prime=netrexx.lang.Rexx.toRexx("not prime");
   netrexx.lang.RexxIO.Say(((testForPrime.right(new netrexx.lang.Rexx((byte)20))).OpCcblank($1,$05)).OpCcblank($1,prime));
   
   beginProc=java.lang.System.nanoTime();
   seiveB=sieveOfEratosthenes_BitSet(hiWatermark.toint());
   endProc=java.lang.System.nanoTime();
   primes=getPrimes(seiveB,loWatermark.toint(),hiWatermark.toint());
   runTime=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
   reporter(primes,loWatermark,hiWatermark,runTime);
   if (isPrime(testForPrime,sieveOfEratosthenes_BitSet(testForPrime.toint()))) 
    prime=netrexx.lang.Rexx.toRexx("prime");
   else 
    prime=netrexx.lang.Rexx.toRexx("not prime");
   netrexx.lang.RexxIO.Say(((testForPrime.right(new netrexx.lang.Rexx((byte)20))).OpCcblank($1,$05)).OpCcblank($1,prime));
   
   beginProc=java.lang.System.nanoTime();
   seiveBA=sieveOfEratosthenes_BooleanArray(hiWatermark.toint());
   endProc=java.lang.System.nanoTime();
   primes=getPrimes(seiveBA,loWatermark.toint(),hiWatermark.toint());
   runTime=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
   reporter(primes,loWatermark,hiWatermark,runTime);
   if (isPrime(testForPrime,sieveOfEratosthenes_BooleanArray(testForPrime.toint()))) 
    prime=netrexx.lang.Rexx.toRexx("prime");
   else 
    prime=netrexx.lang.Rexx.toRexx("not prime");
   netrexx.lang.RexxIO.Say(((testForPrime.right(new netrexx.lang.Rexx((byte)20))).OpCcblank($1,$05)).OpCcblank($1,prime));
  }
  catch (java.lang.Exception $3){ex=$3;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static final void reporter(java.util.Vector primes,netrexx.lang.Rexx loWatermark,netrexx.lang.Rexx hiWatermark,netrexx.lang.Rexx runTime){
  
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank($1,loWatermark)).OpCcblank($1,$06)).OpCcblank($1,hiWatermark)).OpCcblank($1,netrexx.lang.Rexx.toRexx("via a \"Sieve of Eratosthenes\" algorithm:")));
  netrexx.lang.RexxIO.Say($07.OpCc($1,netrexx.lang.Rexx.toRexx(primes.toString())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Count of primes:").OpCcblank($1,new netrexx.lang.Rexx(primes.size())));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank($1,(runTime.OpDiv($1,$08)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc($1,$09));
  
  return;
  }

 
 public static netrexx.lang.Rexx sieveOfEratosthenes_Rexx(netrexx.lang.Rexx hn){
  netrexx.lang.Rexx sv;
  int ix=0;
  int jx=0;
  
  sv=new netrexx.lang.Rexx(isTrue());
  sv.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx(isFalse()); // one is not prime
  
  {ix=2;ix:for(;;ix++){if(!new netrexx.lang.Rexx(ix*ix).OpLtEq($1,hn))break;
   if ((sv.getnode(new netrexx.lang.Rexx(ix)).leaf).toboolean()) 
    {int $4=ix;jx=ix*ix;jx:for(;;jx=jx+$4){if(!new netrexx.lang.Rexx(jx).OpLtEq($1,hn))break;
     sv.getnode(new netrexx.lang.Rexx(jx)).leaf=new netrexx.lang.Rexx(isFalse());
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 public static java.util.BitSet sieveOfEratosthenes_BitSet(int hn){
  java.util.BitSet sv;
  int ix=0;
  int jx=0;
  
  sv=new java.util.BitSet(hn+1); // A vector of bits where for each bit: FALSE indicates its index is a prime
  
  
  sv.set(0); // zero is not prime
  sv.set(1); // one is not prime
  
  {ix=2;ix:for(;;ix++){if(!((ix*ix)<=hn))break;
   if ((!(sv.get(ix)))) 
    {int $5=ix;jx=ix*ix;jx:for(;;jx=jx+$5){if(!(jx<=hn))break;
     sv.set(jx);
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 public static boolean[] sieveOfEratosthenes_BooleanArray(int hn){
  boolean sv[];
  int ix=0;
  int jx=0;
  int ex=0;
  
  sv=new boolean[hn+1]; // An array of boolean where for each boolean: FALSE indicates its index is a prime
  
  
  sv[0]=isTrue(); // zero is not prime
  sv[1]=isTrue(); // one is not prime
  
  {int $6=hn;int $7=2;ex=2*2;ex:for(;ex<=$6;ex=ex+$7){
   sv[ex]=isTrue();
   }
  }/*ex*/
  
  {int $8=hn;int $9=2;ix=3;ix:for(;ix<=$8;ix=ix+$9){if(!((ix*ix)<=hn))break;
   if ((!sv[ix])) 
    {int $10=hn;int $11=ix+ix;boolean $12=$11>=0;jx=ix*3;jx:for(;$12?jx<=$10:jx>=$10;jx=jx+$11){
     sv[jx]=isTrue();
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 private static final java.util.Vector getPrimes(netrexx.lang.Rexx seive,netrexx.lang.Rexx lo,netrexx.lang.Rexx hi){
  java.util.Vector primes;
  netrexx.lang.Rexx p_=null;
  
  primes=new Vector();
  {netrexx.lang.Rexx $13=hi;p_=lo.OpPlus($1);p_:for(;p_.OpLtEq($1,$13);p_=p_.OpAdd($1,new netrexx.lang.Rexx(1))){
   if ((seive.getnode(p_).leaf).OpNot($1)) 
    continue p_;
   primes.add((java.lang.Object)p_);
   }
  }/*p_*/
  
  return primes;
  }

 
 private static final java.util.Vector getPrimes(java.util.BitSet seive,int lo,int hi){
  java.util.Vector primes;
  int p_=0;
  
  primes=new Vector();
  {int $14=hi;p_=lo;p_:for(;p_<=$14;p_++){
   if (seive.get(p_)) 
    continue p_;
   primes.add((java.lang.Object)(new java.lang.Integer(p_)));
   }
  }/*p_*/
  
  return primes;
  }

 
 private static final java.util.Vector getPrimes(boolean seive[],int lo,int hi){
  java.util.Vector primes;
  int p_=0;
  
  primes=new Vector();
  {int $15=hi;p_=lo;p_:for(;p_<=$15;p_++){
   if (seive[p_]) 
    continue p_;
   primes.add((java.lang.Object)(new java.lang.Long(p_)));
   }
  }/*p_*/
  
  return primes;
  }

 
 public static final boolean isPrime(netrexx.lang.Rexx num,netrexx.lang.Rexx seive){
  return (seive.getnode(num).leaf).toboolean();
  }

 
 public static final boolean isPrime(netrexx.lang.Rexx num,java.util.BitSet seive){
  return (!(seive.get(num.toint())));
  }

 
 public static final boolean isPrime(netrexx.lang.Rexx num,boolean seive[]){
  return (!(seive[num.toint()]));
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RSeiveOfEratosthenesTests(){return;}
 }
