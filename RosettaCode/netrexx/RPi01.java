/* Generated from 'RPi01.nrx' 2 Apr 2013 11:38:24 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RPi01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RPi01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx places=null;
  java.math.BigInteger TWO;
  java.math.BigInteger THREE;
  java.math.BigInteger FOUR;
  java.math.BigInteger SEVEN;
  java.math.BigInteger q_;
  java.math.BigInteger r_;
  java.math.BigInteger t_;
  java.math.BigInteger k_;
  java.math.BigInteger n_;
  java.math.BigInteger l_;
  java.math.BigInteger nn=null;
  java.math.BigInteger nr=null;
  boolean first;
  int digitCt;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  places=$1[0];}
  if (places.OpEq(null,$02)) 
   places=new netrexx.lang.Rexx((byte)-1);
  
  TWO=java.math.BigInteger.valueOf(2);
  THREE=java.math.BigInteger.valueOf(3);
  FOUR=java.math.BigInteger.valueOf(4);
  SEVEN=java.math.BigInteger.valueOf(7);
  
  q_=java.math.BigInteger.ONE;
  r_=java.math.BigInteger.ZERO;
  t_=java.math.BigInteger.ONE;
  k_=java.math.BigInteger.ONE;
  n_=java.math.BigInteger.valueOf(3);
  l_=java.math.BigInteger.valueOf(3);
  
  
  
  
  first=isTrue();
  digitCt=0;
  {$2:for(;;){
   if ((FOUR.multiply(q_).add(r_).subtract(t_).compareTo(n_.multiply(t_)))==(-1)) 
    {
     digitCt++;
     if (places.OpGt(null,$03)&new netrexx.lang.Rexx(digitCt-1).OpGt(null,places)) 
      break $2;
     netrexx.lang.RexxIO.Say(n_.toString()+"\000");
     if (first) 
      {
       netrexx.lang.RexxIO.Say(".\000");
       first=isFalse();
      }
     nr=java.math.BigInteger.TEN.multiply(r_.subtract(n_.multiply(t_)));
     n_=java.math.BigInteger.TEN.multiply(THREE.multiply(q_).add(r_)).divide(t_).subtract(java.math.BigInteger.TEN.multiply(n_));
     q_=q_.multiply(java.math.BigInteger.TEN);
     r_=nr;
    }
   else 
    {
     nr=TWO.multiply(q_).add(r_).multiply(l_);
     nn=q_.multiply((SEVEN.multiply(k_))).add(TWO).add(r_.multiply(l_)).divide(t_.multiply(l_));
     q_=q_.multiply(k_);
     t_=t_.multiply(l_);
     l_=l_.add(TWO);
     k_=k_.add(java.math.BigInteger.ONE);
     n_=nn;
     r_=nr;
    }
   }
  }
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 private static boolean isTrue(){
  return (1==1);
  }
 
 private static boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RPi01(){return;}
 }
