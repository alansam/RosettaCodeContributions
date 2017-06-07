/* Generated from 'RRandomNumber.nrx' 5 Nov 2012 17:43:24 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.math.MathContext;

/* NetRexx */





// prologue


// get input, set defaults

public class RRandomNumber{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,5,0,1,2,3,4,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RRandomNumber.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dp=null;
  netrexx.lang.Rexx mu=null;
  netrexx.lang.Rexx sigma=null;
  netrexx.lang.Rexx ec=null;
  netrexx.lang.Rexx mean=null;
  netrexx.lang.Rexx stdDeviation=null;
  netrexx.lang.Rexx displayPrecision=null;
  netrexx.lang.Rexx elements=null;
  java.util.Random RNG;
  java.util.List numberList=null;
  netrexx.lang.Rexx rn=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[5];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  dp=$2[0];mu=$2[1];sigma=$2[2];ec=$2[3];}
  if (mu.OpEq($1,$03)|mu.OpEq($1,$04)) 
   mean=new netrexx.lang.Rexx("1.0");
  else 
   mean=mu;
  if (sigma.OpEq($1,$03)|sigma.OpEq($1,$04)) 
   stdDeviation=new netrexx.lang.Rexx("0.5");
  else 
   stdDeviation=sigma;
  if (dp.OpEq($1,$03)|dp.OpEq($1,$04)) 
   displayPrecision=new netrexx.lang.Rexx((byte)1);
  else 
   displayPrecision=dp;
  if (ec.OpEq($1,$03)|ec.OpEq($1,$04)) 
   elements=new netrexx.lang.Rexx((short)1000);
  else 
   elements=ec;
  
  // set up
  RNG=new java.util.Random();
  
  numberList=(java.util.List)(new java.util.ArrayList());
  
  // generate list of random numbers
  {int $3=elements.OpPlus($1).toint();for(;$3>0;$3--){
   rn=mean.OpAdd($1,stdDeviation.OpMult($1,new netrexx.lang.Rexx(RNG.nextGaussian())));
   numberList.add((java.lang.Object)(new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(rn),MathContext.DECIMAL128)));
   }
  }
  
  // report
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Mean:              ").OpCcblank($1,mean));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Standard Deviation:").OpCcblank($1,stdDeviation));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Precision:         ").OpCcblank($1,displayPrecision));
  netrexx.lang.RexxIO.Say("");
  drawBellCurve(numberList,displayPrecision);
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static void drawBellCurve(java.util.List numberList,netrexx.lang.Rexx precision){
  java.math.BigDecimal val=null;
  netrexx.lang.Rexx lastN;
  netrexx.lang.Rexx nextN;
  java.util.Collections.sort(numberList);
  
  lastN=netrexx.lang.Rexx.toRexx("");
  nextN=netrexx.lang.Rexx.toRexx("");
  {int $6=0;java.lang.Object[] $5=new java.lang.Object[numberList.size()];synchronized(numberList){java.util.Iterator $4=numberList.iterator();for(;;){if($6==$5.length)break;$5[$6]=$4.next();$6++;}}val:for(;;){if(--$6<0)break;val=(java.math.BigDecimal)((java.lang.Object)$5[$6]);
   nextN=(new netrexx.lang.Rexx(val.toPlainString())).format(new netrexx.lang.Rexx((byte)5),precision);
   {/*select*/
   if (lastN.OpEq($1,$03))
    ;
   else if (lastN.OpNotEq($1,nextN))
    netrexx.lang.RexxIO.Say(lastN);
   else{
    ;
   }
   }
   netrexx.lang.RexxIO.Say("*\000");
   lastN=nextN;
   }
  }/*val*/
  netrexx.lang.RexxIO.Say(lastN);
  
  return;
  }
 
 private RRandomNumber(){return;}
 }
