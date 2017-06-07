/* Generated from 'RUnbiasedRandom.nrx' 6 Mar 2013 00:10:23 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RUnbiasedRandom{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('%');
 private static final java.lang.String $0="RUnbiasedRandom.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean biased(int n){
  return (java.lang.Math.random())<(1.0F/((float)n));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean unbiased(int n){
  boolean a=false;
  boolean b=false;
  
  
  {boolean $1=true;for(;;){if($1){$1=false;}else{if((a?1:0)!=(b?1:0))break;}
   a=biased(n);
   b=biased(n);
   }
  }
  return a;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx Mx=null;
  int M;
  int n=0;
  int c1=0;
  int c2=0;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$2);
  Mx=$2[0];}
  if ((Mx.length()).OpLtEq(null,$02)) 
   Mx=new netrexx.lang.Rexx(50000);
  M=Mx.toint();
  {n=3;n:for(;n<=6;n++){
   c1=0;
   c2=0;
   {int $3=M;for(;$3>0;$3--){
    if (biased(n)) 
     c1++;
    if (unbiased(n)) 
     c2++;
    }
   }
   netrexx.lang.RexxIO.Say(((((((new netrexx.lang.Rexx(n)).right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$03)).OpCcblank(null,(new netrexx.lang.Rexx((100.0F*((float)c1))/((float)M))).format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)2)))).OpCc(null,$04)).OpCcblank(null,(new netrexx.lang.Rexx((100.0F*((float)c2))/((float)M))).format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)2)))).OpCc(null,$04));
   }
  }/*n*/
  return;
  }
 
 private RUnbiasedRandom(){return;}
 }
