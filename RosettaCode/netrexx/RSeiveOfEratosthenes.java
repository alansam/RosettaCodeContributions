/* Generated from 'RSeiveOfEratosthenes.nrx' 23 Jul 2012 11:09:55 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RSeiveOfEratosthenes{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("  ");
 private static final java.lang.String $0="RSeiveOfEratosthenes.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx loWatermark=null;
  netrexx.lang.Rexx hiWatermark=null;
  netrexx.lang.Rexx seive=null;
  netrexx.lang.Rexx primes=null;
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
   
   seive=sieveOfEratosthenes(hiWatermark.tolong());
   primes=getPrimes(seive,loWatermark.tolong(),hiWatermark.tolong()).strip();
   
   netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank(null,loWatermark)).OpCcblank(null,$04)).OpCcblank(null,hiWatermark)).OpCcblank(null,netrexx.lang.Rexx.toRexx("via a \"Sieve of Eratosthenes\" algorithm:")));
   netrexx.lang.RexxIO.Say($05.OpCc(null,primes.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Count of primes:").OpCcblank(null,primes.words()));
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static netrexx.lang.Rexx sieveOfEratosthenes(long hn){
  netrexx.lang.Rexx sv;
  long ix=0;
  long jx=0;
  
  sv=new netrexx.lang.Rexx(isTrue());
  sv.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx(isFalse());
  
  
  
  {ix=2;ix:for(;;ix=ix+1){if(!((ix*ix)<=hn))break;
   if ((sv.getnode(new netrexx.lang.Rexx(ix)).leaf).toboolean()) 
    {long $3=ix;jx=ix*ix;jx:for(;;jx=jx+$3){if(!(jx<=hn))break;
     sv.getnode(new netrexx.lang.Rexx(jx)).leaf=new netrexx.lang.Rexx(isFalse());
     }
    }/*jx*/
   }
  }/*ix*/
  
  return sv;
  }

 
 private static final netrexx.lang.Rexx getPrimes(netrexx.lang.Rexx seive,long lo,long hi){
  netrexx.lang.Rexx primes;
  long p_=0;
  
  primes=new netrexx.lang.Rexx("");
  {long $4=hi;p_=lo;p_:for(;p_<=$4;p_=p_+1){
   if ((seive.getnode(new netrexx.lang.Rexx(p_)).leaf).OpNot(null)) 
    continue p_;
   primes=primes.OpCcblank(null,new netrexx.lang.Rexx(p_));
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
 
 private RSeiveOfEratosthenes(){return;}
 }
