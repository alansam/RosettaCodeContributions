/* Generated from 'RLeastCommonMultiple.nrx' 21 Nov 2013 18:19:27 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RLeastCommonMultiple{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)3000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final char[] $03={1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("18 12");
 private static final char[] $07={2,1,124,10,1,0,1,10,1,1,0};
 private static final char[] $08={2,1,61,10,1,0,1,10,2,1,2,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("15");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("lcm of");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("is");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("5");
 private static final java.lang.String $0="RLeastCommonMultiple.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static netrexx.lang.Rexx lcm(netrexx.lang.Rexx m_,netrexx.lang.Rexx n_){
  netrexx.lang.Rexx L_;
  L_=m_.OpMult($1,n_).OpDivI($1,gcd(m_,n_));
  return L_;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 // Euclid's algorithm - iterative implementation
 
 public static netrexx.lang.Rexx gcd(netrexx.lang.Rexx m_,netrexx.lang.Rexx n_){
  netrexx.lang.Rexx c_=null;
  {for(;;){if(!n_.OpGt($1,$02))break;
   c_=m_.OpRem($1,n_);
   m_=n_;
   n_=c_;
   }
  }
  return m_;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samples=null;
  netrexx.lang.Rexx sample=null;
  netrexx.lang.Rexx mnvals=null;
  netrexx.lang.Rexx chk=null;
  netrexx.lang.Rexx mv=null;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx nv=null;
  netrexx.lang.Rexx lv=null;
  netrexx.lang.Rexx state=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$03,$2);
  samples=$2[0];}
  if (samples.OpEq($1,$04)|samples.OpEq($1,$05)) 
   samples=((((((((((((((((netrexx.lang.Rexx.toRexx("-6 14 =    42 |").OpCcblank($1,netrexx.lang.Rexx.toRexx("3  4 =    12 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("18 12 =    36 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("2  0 =     0 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("0 85 =     0 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("12 18 =    36 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("5 12 =    60 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("12 22 =   132 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("7 31 =   217 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("117 18 =   234 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("38 46 =   874 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("18 12 -5 =   180 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("-5 18 12 =   180 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("12 -5 18 =   180 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("18 12 -5 97 = 17460 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("30 42 =   210 |"))).OpCcblank($1,netrexx.lang.Rexx.toRexx("30 42 =     . |"))).OpCcblank($1,$06);
  
  
  
  
  
  
  
  
  
  
  
  // confirm that other permutations work
  
  
  
  // 210; no verification requested
  // 36
  
  {for(;;){if(!samples.OpNotEq($1,$04))break;
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(samples,$07,$3);
   sample=$3[0];samples=$3[1];}
   {for(;;){if(!sample.OpNotEq($1,$04))break;
    {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
    netrexx.lang.RexxParse.parse(sample,$08,$4);
    mnvals=$4[0];chk=$4[1];sample=$4[2];}
    if (chk.OpEq($1,$04)) 
     chk=new netrexx.lang.Rexx('.');
    mv=mnvals.word(new netrexx.lang.Rexx((byte)1));
    {netrexx.lang.Rexx $5=(mnvals.words()).OpCcblank($1,mnvals);w_=new netrexx.lang.Rexx((byte)2);w_:for(;w_.OpLtEq($1,$5);w_=w_.OpAdd($1,new netrexx.lang.Rexx(1))){
     nv=mnvals.word(w_);
     mv=mv.abs();
     nv=nv.abs();
     mv=lcm(mv,nv);
     }
    }/*w_*/
    lv=mv;
    {/*select*/
    if (chk.OpEqS($1,new netrexx.lang.Rexx('.')))
     state=netrexx.lang.Rexx.toRexx("");
    else if (chk.OpEqS($1,lv))
     state=netrexx.lang.Rexx.toRexx("(verified)");
    else{
     state=netrexx.lang.Rexx.toRexx("(failed)");
    }
    }
    mnvals=mnvals.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", "));
    netrexx.lang.RexxIO.Say(((($010.OpCcblank($1,mnvals.right($09.max(mnvals.length())))).OpCcblank($1,$011)).OpCcblank($1,lv.right($012.max(lv.length())))).OpCcblank($1,state));
    }
   }
   }
  }
  
  return;
  }
 
 private RLeastCommonMultiple(){return;}
 }
