/* Generated from 'RSumOfSquares.nrx' 23 Nov 2012 11:18:32 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RSumOfSquares{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)200);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)7);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("10.0");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("] is");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RSumOfSquares.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  java.util.Random R;
  netrexx.lang.Rexx nums;
  netrexx.lang.Rexx nl[];
  netrexx.lang.Rexx nv=null;
  netrexx.lang.Rexx sum=null;
  netrexx.lang.Rexx nm=null;
  R=new java.util.Random();
  nums=netrexx.lang.Rexx.toRexx("");
  nums.getnode(new netrexx.lang.Rexx((byte)0)).leaf=netrexx.lang.Rexx.toRexx("");
  nums.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("1.2 3.4 5.6 7.8 9.10 11.12");
  nums.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("-0.5 -0.4 -0.3 -0.2 -0.1 0.0 0.1 0.2 0.3 0.4 0.5");
  {int $2=$02.OpPlus($1).toint();for(;$2>0;$2--){
   nums.getnode(new netrexx.lang.Rexx((byte)3)).leaf=(nums.getnode(new netrexx.lang.Rexx((byte)3)).leaf).OpCcblank($1,getR(R,new netrexx.lang.Rexx("100.0"),new netrexx.lang.Rexx("1000.0")));
   nums.getnode(new netrexx.lang.Rexx((byte)4)).leaf=(nums.getnode(new netrexx.lang.Rexx((byte)4)).leaf).OpCcblank($1,getR(R));
   nums.getnode(new netrexx.lang.Rexx((byte)5)).leaf=(nums.getnode(new netrexx.lang.Rexx((byte)5)).leaf).OpCcblank($1,getR(R,$03.OpMinus($1),new netrexx.lang.Rexx("0.0")));
   }
  }
  
  nl=new netrexx.lang.Rexx[]{nums.getnode(new netrexx.lang.Rexx((byte)0)).leaf,nums.getnode(new netrexx.lang.Rexx((byte)1)).leaf,nums.getnode(new netrexx.lang.Rexx((byte)2)).leaf,nums.getnode(new netrexx.lang.Rexx((byte)3)).leaf,nums.getnode(new netrexx.lang.Rexx((byte)4)).leaf,nums.getnode(new netrexx.lang.Rexx((byte)5)).leaf};
  
  {int $5=0;netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[nl.length];synchronized(nl){for(;;){if($5==$4.length)break;$4[$5]=nl[nl.length-1-$5];$5++;}}nv:for(;;){if(--$5<0)break;nv=(netrexx.lang.Rexx)$4[$5];
   sum=SoS(nv);
   nm=mean(nv);
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("The sum of squares of [").OpCc($1,nv.strip())).OpCc($1,$04)).OpCcblank($1,sum.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("The mean of [").OpCc($1,nv.strip())).OpCc($1,$04)).OpCcblank($1,nm.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   }
  }/*nv*/
  
  return;
  }

 // =============================================================================
 
 public static netrexx.lang.Rexx SoS(netrexx.lang.Rexx nums){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx num=null;
  sum=new netrexx.lang.Rexx((byte)0);
  if (nums.OpNotEq($1,$05)) 
   {
    {netrexx.lang.Rexx $6=nums.words();n_=new netrexx.lang.Rexx((byte)1);n_:for(;n_.OpLtEq($1,$6);n_=n_.OpAdd($1,new netrexx.lang.Rexx(1))){
     num=nums.word(n_);
     sum=sum.OpAdd($1,num.OpPow($1,$06));
     }
    }/*n_*/
   }
  
  return sum;
  }

 // =============================================================================
 
 public static netrexx.lang.Rexx mean(netrexx.lang.Rexx nums){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx num=null;
  sum=new netrexx.lang.Rexx((byte)0);
  if (nums.OpNotEq($1,$05)) 
   {
    {netrexx.lang.Rexx $7=nums.words();n_=new netrexx.lang.Rexx((byte)1);n_:for(;n_.OpLtEq($1,$7);n_=n_.OpAdd($1,new netrexx.lang.Rexx(1))){
     num=nums.word(n_);
     sum=sum.OpAdd($1,num);
     }
    }/*n_*/
    sum=sum.OpDiv($1,nums.words());
   }
  
  return sum;
  }

 // =============================================================================
 
 protected static netrexx.lang.Rexx getR(java.util.Random R){
  return getR(R,new netrexx.lang.Rexx("0.0"),new netrexx.lang.Rexx("1.0"));
  }
 protected static netrexx.lang.Rexx getR(java.util.Random R,netrexx.lang.Rexx rMin){
  return getR(R,rMin,new netrexx.lang.Rexx("1.0"));
  }
 protected static netrexx.lang.Rexx getR(java.util.Random R,netrexx.lang.Rexx rMin,netrexx.lang.Rexx rMax){
  return (rMin.OpAdd($1,((rMax.OpSub($1,rMin))).OpMult($1,new netrexx.lang.Rexx(R.nextDouble())))).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6));
  }
 
 private RSumOfSquares(){return;}
 }
