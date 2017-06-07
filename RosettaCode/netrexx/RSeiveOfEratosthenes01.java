/* Generated from 'RSeiveOfEratosthenes01.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */
import java.util.Vector;

/* NetRexx */







public class RSeiveOfEratosthenes01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RSeiveOfEratosthenes01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx loWatermark=null;
  netrexx.lang.Rexx hiWatermark=null;
  long beginProc=0;
  netrexx.lang.Rexx seive=null;
  long endProc=0;
  java.util.Vector primes=null;
  netrexx.lang.Rexx runTime=null;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  loWatermark=$2[0];hiWatermark=$2[1];}
  if (loWatermark.OpEq($1,$03)|loWatermark.OpEq($1,$04)) 
   loWatermark=new netrexx.lang.Rexx((byte)1);
  if (hiWatermark.OpEq($1,$03)|hiWatermark.OpEq($1,$04)) 
   hiWatermark=new netrexx.lang.Rexx((short)200);
  
  {try{
   if ((loWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)|(hiWatermark.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)) 
    throw new java.lang.NumberFormatException("arguments must be whole numbers");
   if (loWatermark.OpGt($1,hiWatermark)) 
    throw new java.lang.IllegalArgumentException("the start value must be less than the end value");
   
   beginProc=java.lang.System.nanoTime();
   seive=sieveOfEratosthenes_Rexx(hiWatermark);
   endProc=java.lang.System.nanoTime();
   primes=getPrimes(seive,loWatermark,hiWatermark);
   runTime=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
   reporter(primes,loWatermark,hiWatermark,runTime);
  }
  catch (java.lang.Exception $3){ex=$3;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static final void reporter(java.util.Vector primes,netrexx.lang.Rexx loWatermark,netrexx.lang.Rexx hiWatermark,netrexx.lang.Rexx runTime){
  
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank($1,loWatermark)).OpCcblank($1,$05)).OpCcblank($1,hiWatermark)).OpCcblank($1,netrexx.lang.Rexx.toRexx("via a \"Sieve of Eratosthenes\" algorithm:")));
  netrexx.lang.RexxIO.Say($06.OpCc($1,netrexx.lang.Rexx.toRexx(primes.toString())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Count of primes:").OpCcblank($1,new netrexx.lang.Rexx(primes.size())));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank($1,(runTime.OpDiv($1,$07)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc($1,$08));
  
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

 
 private static final java.util.Vector getPrimes(netrexx.lang.Rexx seive,netrexx.lang.Rexx lo,netrexx.lang.Rexx hi){
  java.util.Vector primes;
  netrexx.lang.Rexx p_=null;
  
  primes=new Vector();
  {netrexx.lang.Rexx $5=hi;p_=lo.OpPlus($1);p_:for(;p_.OpLtEq($1,$5);p_=p_.OpAdd($1,new netrexx.lang.Rexx(1))){
   if ((seive.getnode(p_).leaf).OpNot($1)) 
    continue p_;
   primes.add((java.lang.Object)p_);
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
 
 private RSeiveOfEratosthenes01(){return;}
 }
