/* Generated from 'RAvgArithmetic.nrx' 29 Dec 2012 12:43:41 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAvgArithmetic{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RAvgArithmetic.nrx";
 
 public static void main(java.lang.String $0s[]){
  launchSample();
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx arithmeticMean(java.util.Vector vv) throws netrexx.lang.DivideException{
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx mean;
  sum=new netrexx.lang.Rexx((byte)0);
  
  {int $3=0;java.lang.Object[] $2=new java.lang.Object[vv.size()];synchronized(vv){java.util.Iterator $1=vv.iterator();for(;;){if($3==$2.length)break;$2[$3]=$1.next();$3++;}}n_:for(;;){if(--$3<0)break;n_=(netrexx.lang.Rexx)((java.lang.Object)$2[$3]);
   sum=sum.OpAdd(null,n_);
   }
  }/*n_*/
  mean=sum.OpDiv(null,new netrexx.lang.Rexx(vv.size()));
  
  return mean;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void launchSample(){
  boolean TRUE_;
  boolean FALSE_;
  boolean tracing;
  java.util.Vector vectors[];
  netrexx.lang.Rexx v_=null;
  netrexx.lang.DivideException dex=null;
  java.lang.RuntimeException xex=null;
  TRUE_=1==1;
  FALSE_=new netrexx.lang.Rexx(TRUE_).OpNot(null);
  tracing=FALSE_;
  vectors=getSampleData();
  {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(vectors.length).OpSub(null,$01);v_=new netrexx.lang.Rexx((byte)0);v_:for(;v_.OpLtEq(null,$4);v_=v_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Average of:").OpCcblank(null,netrexx.lang.Rexx.toRexx(vectors[v_.toint()].toString())));
   {try{
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("          =").OpCcblank(null,arithmeticMean(vectors[v_.toint()])));
   }
   catch (netrexx.lang.DivideException $5){dex=$5;
    netrexx.lang.RexxIO.Say("Caught \"Divide By Zero\"; bypassing...");
    if (tracing) 
     dex.printStackTrace();
   }
   catch (java.lang.RuntimeException $6){xex=$6;
    netrexx.lang.RexxIO.Say("Caught unspecified run-time exception; bypassing...");
    if (tracing) 
     xex.printStackTrace();
   }}
   netrexx.lang.RexxIO.Say("");
   }
  }/*v_*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.Vector[] getSampleData(){
  netrexx.lang.Rexx seed;
  java.util.Random rng;
  java.util.Vector vectors[];
  seed=new netrexx.lang.Rexx((short)1066);
  rng=new java.util.Random(seed.tolong());
  vectors=new java.util.Vector[]{new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)10)})))),new java.util.Vector(),new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(rng.nextInt(seed.toint())),new netrexx.lang.Rexx(rng.nextInt(seed.toint())),new netrexx.lang.Rexx(rng.nextInt(seed.toint())),new netrexx.lang.Rexx(rng.nextInt(seed.toint())),new netrexx.lang.Rexx(rng.nextInt(seed.toint())),new netrexx.lang.Rexx(rng.nextInt(seed.toint()))})))),new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble()),new netrexx.lang.Rexx(rng.nextDouble())})))),new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("1.0"),netrexx.lang.Rexx.toRexx("2.0"),new netrexx.lang.Rexx("3.0")})))),new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("1.0"),netrexx.lang.Rexx.toRexx("not a number"),new netrexx.lang.Rexx("3.0")}))))};
  
  
  
  
  
  
  
  return vectors;
  }
 
 private RAvgArithmetic(){return;}
 }
