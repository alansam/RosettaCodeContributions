/* Generated from 'RMillerRabinPrimalityTest.nrx' 20 Feb 2014 16:16:55 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RMillerRabinPrimalityTest{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)200);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("20");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("2000");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1000);
 private static final char[] $09={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="RMillerRabinPrimalityTest.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isProbablePrime(netrexx.lang.Rexx n,netrexx.lang.Rexx k){
  boolean isTrue;
  boolean isFalse;
  netrexx.lang.Rexx d;
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx x=null;
  
  isTrue=(1==1);
  isFalse=new netrexx.lang.Rexx(isTrue).OpNot($1);
  
  if (n.OpEq($1,$02)) 
   return isTrue;
  if (n.OpLt($1,$02)|n.OpRem($1,$02).OpEq($1,$03)) 
   return isFalse;
  
  d=n.OpSub($1,$04);
  s=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!d.OpRem($1,$02).OpEq($1,$03))break;
   d=d.OpDivI($1,$02);
   s=s.OpAdd($1,$04);
   }
  }
  
  {int $2=k.OpPlus($1).toint();L00P:for(;$2>0;$2--){
   a=$02.OpAdd($1,irandom(n));
   //x = (a ** d) // n
   x=new netrexx.lang.Rexx((new java.math.BigInteger(netrexx.lang.Rexx.toString(a))).modPow(new java.math.BigInteger(netrexx.lang.Rexx.toString(d)),new java.math.BigInteger(netrexx.lang.Rexx.toString(n))).toString());
   if (x.OpEq($1,$04)|x.OpEq($1,n.OpSub($1,$04))) 
    continue L00P;
   {int $3=s.OpSub($1,$04).OpPlus($1).toint();for(;$3>0;$3--){
    //x = (x * x) // n
    x=new netrexx.lang.Rexx((new java.math.BigInteger(netrexx.lang.Rexx.toString(x))).modPow(new java.math.BigInteger(java.lang.String.valueOf((byte)2)),new java.math.BigInteger(netrexx.lang.Rexx.toString(n))).toString());
    if (x.OpEq($1,$04)) 
     return isFalse;
    if (x.OpEq($1,n.OpSub($1,$04))) 
     continue L00P;
    }
   }
   return isFalse;
   }
  }/*L00P*/
  
  return isTrue;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private static netrexx.lang.Rexx irandom(netrexx.lang.Rexx vmax){
  java.util.Random rg;
  rg=new java.util.Random();
  return new netrexx.lang.Rexx(new netrexx.lang.Rexx(rg.nextInt(vmax.toint())).OpAdd($1,$04));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isProbablePrime2(netrexx.lang.Rexx n,netrexx.lang.Rexx k){
  boolean isTrue;
  boolean isFalse;
  netrexx.lang.Rexx limit;
  boolean isProbablePrime;
  netrexx.lang.Rexx d=null;
  netrexx.lang.Rexx s=null;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx x=null;
  netrexx.lang.RexxSet $4=new netrexx.lang.RexxSet($1);
  isTrue=(1==1);
  isFalse=new netrexx.lang.Rexx(isTrue).OpNot($4);
  
  limit=$05.max(k);
  $4.setDigits($06.max($02.OpMult($4,limit)));
  
  isProbablePrime=isFalse;
  if (n.OpEq($4,$02)) 
   isProbablePrime=isTrue; // the only even number that is prime
  if (n.OpGt($4,$02)&n.OpRem($4,$02).OpNotEq($4,$03)) 
   { // ensure n is odd
    d=n.OpSub($4,$04);
    s=new netrexx.lang.Rexx((byte)0);
    
    {for(;;){if(!d.OpRem($4,$02).OpEq($4,$03))break;
     s=s.OpAdd($4,$04);
     d=d.OpDivI($4,$02);
     }
    }
    
    {int $5=k.OpPlus($4).toint();L00P:for(;$5>0;$5--){
     isProbablePrime=isTrue;
     a=randomInt(new netrexx.lang.Rexx((byte)2),n);
     x=((a.OpPow($4,d))).OpRem($4,n);
     if (x.OpEq($4,$04)|x.OpEq($4,n.OpSub($4,$04))) 
      continue L00P;
     {int $6=s.OpSub($4,$04).OpPlus($4).toint();lel:for(;$6>0;$6--){
      x=((x.OpMult($4,x))).OpRem($4,n);
      if (x.OpEq($4,$04)) 
       {
        isProbablePrime=isFalse;
        break L00P;
       }
      if (x.OpEq($4,n.OpSub($4,$04))) 
       {
        continue L00P;
       }
      }
     }/*lel*/
     isProbablePrime=isFalse;
     }
    }/*L00P*/
   }
  return isProbablePrime;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // The Miller-Rabin primality test is part of the standard library (java.math.BigInteger)
 
 public static boolean isProbablePrimeBuiltIn(netrexx.lang.Rexx n,netrexx.lang.Rexx k){
  java.math.BigInteger bigN;
  int certainty;
  boolean isProbablePrime;
  bigN=new java.math.BigInteger(n.toString());
  certainty=k.toint();
  isProbablePrime=bigN.isProbablePrime(certainty);
  
  return isProbablePrime;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private static netrexx.lang.Rexx randomInt(netrexx.lang.Rexx vmin,netrexx.lang.Rexx vmax){
  java.util.Random rg;
  rg=new java.util.Random();
  return new netrexx.lang.Rexx(new netrexx.lang.Rexx(rg.nextInt(vmax.OpSub($1,vmin).toint())).OpAdd($1,vmin));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ranges;
  netrexx.lang.Rexx v1=null;
  netrexx.lang.Rexx v2=null;
  netrexx.lang.Rexx probablePrimes=null;
  netrexx.lang.Rexx probablePrimesBuiltIn=null;
  netrexx.lang.Rexx n=null;
  ranges=(($03.OpCcblank($1,$07)).OpCcblank($1,$03)).OpCcblank($1,$08);
  {for(;;){if(!(ranges.words()).OpGt($1,$03))break;
   {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(ranges,$09,$7);
   v1=$7[0];v2=$7[1];ranges=$7[2];}
   probablePrimes=netrexx.lang.Rexx.toRexx("");
   probablePrimesBuiltIn=netrexx.lang.Rexx.toRexx("");
   {netrexx.lang.Rexx $8=v2;n=v1.OpPlus($1);n:for(;n.OpLtEq($1,$8);n=n.OpAdd($1,new netrexx.lang.Rexx(1))){
    if (isProbablePrime(n,new netrexx.lang.Rexx((byte)10))) 
     {
      probablePrimes=probablePrimes.OpCcblank($1,n);
     }
    if (isProbablePrimeBuiltIn(n,new netrexx.lang.Rexx(100000))) 
     {
      probablePrimesBuiltIn=probablePrimesBuiltIn.OpCcblank($1,n);
     }
    }
   }/*n*/
   probablePrimes=probablePrimes.space();
   probablePrimesBuiltIn=probablePrimesBuiltIn.space();
   
   if (probablePrimesBuiltIn.OpEqS($1,probablePrimes)) 
    netrexx.lang.RexxIO.Say("OK!");
   else 
    netrexx.lang.RexxIO.Say("Gronk!");
   
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Derived method found").OpCcblank($1,probablePrimes.words())).OpCcblank($1,netrexx.lang.Rexx.toRexx("probable primes in the range"))).OpCcblank($1,v1)).OpCc($1,$010)).OpCc($1,v2));
   netrexx.lang.RexxIO.Say(probablePrimes.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", ")));
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Built-in method found").OpCcblank($1,probablePrimesBuiltIn.words())).OpCcblank($1,netrexx.lang.Rexx.toRexx("probable primes in the range"))).OpCcblank($1,v1)).OpCc($1,$010)).OpCc($1,v2));
   netrexx.lang.RexxIO.Say(probablePrimesBuiltIn.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", ")));
   netrexx.lang.RexxIO.Say("");
   }
  }
  return;
  }
 
 private RMillerRabinPrimalityTest(){return;}
 }
