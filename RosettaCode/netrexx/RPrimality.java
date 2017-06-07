/* Generated from 'RPrimality.nrx' 4 Jan 2013 03:07:37 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RPrimality{
 private static final char[] $01={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("is prime");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx((byte)2);
 private static final java.lang.String $0="RPrimality.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nbr=null;
  netrexx.lang.Rexx rangeBegin=null;
  netrexx.lang.Rexx rangeEnd=null;
  netrexx.lang.Rexx direction=null;
  netrexx.lang.Rexx primes=null;
  netrexx.lang.Rexx nn=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  nbr=$1[0];rangeBegin=$1[1];rangeEnd=$1[2];}
  
  if (nbr.OpEq(null,$02)|nbr.OpEq(null,$03)) 
   {
    if (rangeBegin.OpEq(null,$02)|rangeBegin.OpEq(null,$03)) 
     rangeBegin=new netrexx.lang.Rexx((byte)1);
    if (rangeEnd.OpEq(null,$02)|rangeEnd.OpEq(null,$03)) 
     rangeEnd=new netrexx.lang.Rexx((byte)100);
    if (rangeEnd.OpGt(null,rangeBegin)) 
     direction=new netrexx.lang.Rexx((byte)1);
    else 
     direction=$04.OpMinus(null);
    
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("List of prime numbers from").OpCcblank(null,rangeBegin)).OpCcblank(null,$05)).OpCcblank(null,rangeEnd)).OpCc(null,$06));
    primes=netrexx.lang.Rexx.toRexx("");
    {netrexx.lang.Rexx $2=rangeEnd;netrexx.lang.Rexx $3=direction;boolean $4=$3.OpGtEq(null,$07);nn=rangeBegin.OpPlus(null);nn:for(;$4?nn.OpLtEq(null,$2):nn.OpGtEq(null,$2);nn=nn.OpAdd(null,$3)){
     if (isPrime(nn)) 
      primes=primes.OpCcblank(null,nn);
     }
    }/*nn*/
    primes=primes.strip();
    netrexx.lang.RexxIO.Say($08.OpCc(null,primes.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Total number of primes:").OpCcblank(null,primes.words()));
   }
  else 
   {
    if (isPrime(nbr)) 
     netrexx.lang.RexxIO.Say((nbr.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$09));
    else 
     netrexx.lang.RexxIO.Say((nbr.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,netrexx.lang.Rexx.toRexx("is not prime")));
   }
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(byte nbr){
  return isPrime(new netrexx.lang.Rexx(nbr));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(java.lang.Byte nbr){
  return isPrime(new netrexx.lang.Rexx(nbr.intValue()));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(int nbr){
  return isPrime(new netrexx.lang.Rexx(nbr));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(long nbr){
  return isPrime(new netrexx.lang.Rexx(nbr));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(java.lang.Integer nbr){
  return isPrime(new netrexx.lang.Rexx(nbr.intValue()));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(java.lang.Long nbr){
  return isPrime(new netrexx.lang.Rexx(nbr.longValue()));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(java.lang.String nbr){
  return isPrime(new netrexx.lang.Rexx(nbr));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(netrexx.lang.Rexx nbr){
  boolean ip=false;
  netrexx.lang.Rexx nnStartTerm=null;
  netrexx.lang.Rexx nnEndTerm=null;
  netrexx.lang.Rexx nn=null;
  
  
  
  {/*select*/
  if (nbr.OpLt(null,$010))
   {
    ip=isFalse();
   }
  else if (netrexx.lang.Rexx.toRexx("2 3 5 7").wordpos(new netrexx.lang.Rexx(nbr)).OpNotEq(null,$07))
   {
    // crude shortcut ripped from the Rexx example
    ip=isTrue();
   }
  else if (nbr.OpRem(null,$010).OpEqS(null,$07)|nbr.OpRem(null,$011).OpEqS(null,$07))
   {
    // another shortcut permitted by the one above
    ip=isFalse();
   }
  else{
   {
    nnStartTerm=new netrexx.lang.Rexx((byte)3); // a reasonable start term - nn <= 2 is never prime
    nnEndTerm=new netrexx.lang.Rexx(java.lang.Math.ceil(java.lang.Math.sqrt(nbr.todouble()))); // a reasonable end term
    ip=isTrue(); // prime the pump (pun intended)
    {netrexx.lang.Rexx $5=nnEndTerm;netrexx.lang.Rexx $6=$012;nn=nnStartTerm.OpPlus(null);nn:for(;nn.OpLtEq(null,$5);nn=nn.OpAdd(null,$6)){
     // Note: in Rexx and NetRexx "//" is the 'remainder of division operator' (which is not the same as modulo)
     if (nbr.OpRem(null,nn).OpEq(null,$07)) 
      {
       ip=isFalse();
       break nn;
      }
     }
    }/*nn*/
   }
  }
  }
  
  return ip;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isTrue(){
  return 1==1;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RPrimality(){return;}
 }
