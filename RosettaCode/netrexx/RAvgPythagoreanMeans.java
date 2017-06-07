/* Generated from 'RAvgPythagoreanMeans.nrx' 19 Jun 2014 22:06:14 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RAvgPythagoreanMeans{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RAvgPythagoreanMeans.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  java.util.ArrayList a1;
  a1=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("1.0"),new netrexx.lang.Rexx("2.0"),new netrexx.lang.Rexx("3.0"),new netrexx.lang.Rexx("4.0"),new netrexx.lang.Rexx("5.0"),new netrexx.lang.Rexx("6.0"),new netrexx.lang.Rexx("7.0"),new netrexx.lang.Rexx("8.0"),new netrexx.lang.Rexx("9.0"),new netrexx.lang.Rexx("10.0")}))));
  netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Arithmetic =").OpCcblank($1,arithmeticMean((java.util.List)a1))).OpCc($1,netrexx.lang.Rexx.toRexx(", Geometric ="))).OpCcblank($1,geometricMean((java.util.List)a1))).OpCc($1,netrexx.lang.Rexx.toRexx(", Harmonic ="))).OpCcblank($1,harmonicMean((java.util.List)a1)));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx arithmeticMean(java.util.List numbers){
  netrexx.lang.Rexx mean;
  netrexx.lang.Rexx number=null;
  // somewhat arbitrary return for ooRexx
  if (numbers.isEmpty()) 
   return netrexx.lang.Rexx.toRexx("NaN");
  
  mean=new netrexx.lang.Rexx((byte)0);
  
  {int $4=0;java.lang.Object[] $3=new java.lang.Object[numbers.size()];synchronized(numbers){java.util.Iterator $2=numbers.iterator();for(;;){if($4==$3.length)break;$3[$4]=$2.next();$4++;}}number:for(;;){if(--$4<0)break;number=(netrexx.lang.Rexx)((java.lang.Object)$3[$4]);
   mean=mean.OpAdd($1,number);
   }
  }/*number*/
  return mean.OpDiv($1,new netrexx.lang.Rexx(numbers.size()));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx geometricMean(java.util.List numbers){
  netrexx.lang.Rexx mean;
  netrexx.lang.Rexx number=null;
  // somewhat arbitrary return for ooRexx
  if (numbers.isEmpty()) 
   return netrexx.lang.Rexx.toRexx("NaN");
  
  mean=new netrexx.lang.Rexx((byte)1);
  
  {int $7=0;java.lang.Object[] $6=new java.lang.Object[numbers.size()];synchronized(numbers){java.util.Iterator $5=numbers.iterator();for(;;){if($7==$6.length)break;$6[$7]=$5.next();$7++;}}number:for(;;){if(--$7<0)break;number=(netrexx.lang.Rexx)((java.lang.Object)$6[$7]);
   mean=mean.OpMult($1,number);
   }
  }/*number*/
  return new netrexx.lang.Rexx(java.lang.Math.pow(mean.todouble(),$02.OpDiv($1,new netrexx.lang.Rexx(numbers.size())).todouble()));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx harmonicMean(java.util.List numbers){
  netrexx.lang.Rexx mean;
  netrexx.lang.Rexx number=null;
  // somewhat arbitrary return for ooRexx
  if (numbers.isEmpty()) 
   return netrexx.lang.Rexx.toRexx("NaN");
  
  mean=new netrexx.lang.Rexx((byte)0);
  
  {int $10=0;java.lang.Object[] $9=new java.lang.Object[numbers.size()];synchronized(numbers){java.util.Iterator $8=numbers.iterator();for(;;){if($10==$9.length)break;$9[$10]=$8.next();$10++;}}number:for(;;){if(--$10<0)break;number=(netrexx.lang.Rexx)((java.lang.Object)$9[$10]);
   if (number.OpEq($1,$03)) 
    return netrexx.lang.Rexx.toRexx("Nan");
   mean=mean.OpAdd($1,($02.OpDiv($1,number)));
   }
  }/*number*/
  
  // problem here...
  return new netrexx.lang.Rexx(numbers.size()).OpDiv($1,mean);
  }
 
 private RAvgPythagoreanMeans(){return;}
 }
