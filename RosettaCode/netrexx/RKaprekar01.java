/* Generated from 'RKaprekar01.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RKaprekar01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('s');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final char[] $05={8,1,10,1,0,1,10,2,2,3,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('(');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(')');
 private static final java.lang.String $0="RKaprekar01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties constant */
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=(1!=1);

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx limit;
  long t1;
  long t2;
  netrexx.lang.Rexx t0;
  netrexx.lang.Rexx ts;
  
  limit=new netrexx.lang.Rexx((short)10000);
  t1=java.lang.System.nanoTime();
  kaprekar(limit);
  t2=java.lang.System.nanoTime();
  t0=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  ts=t0.OpDiv($1,$02);
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Elapsed time for").OpCcblank($1,limit)).OpCcblank($1,netrexx.lang.Rexx.toRexx("iterations:"))).OpCcblank($1,ts)).OpCc($1,$03));
  
  netrexx.lang.RexxIO.Say($04.copies(new netrexx.lang.Rexx((byte)80)));
  limit=new netrexx.lang.Rexx(1000000);
  t1=java.lang.System.nanoTime();
  kaprekar(limit,isTrue);
  t2=java.lang.System.nanoTime();
  t0=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  ts=t0.OpDiv($1,$02);
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Elapsed time for").OpCcblank($1,limit)).OpCcblank($1,netrexx.lang.Rexx.toRexx("iterations:"))).OpCcblank($1,ts)).OpCc($1,$03));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 public static void kaprekar(netrexx.lang.Rexx limit){
  kaprekar(limit,isTrue);return;
  }
 public static void kaprekar(netrexx.lang.Rexx limit,boolean listAll){
  netrexx.lang.Rexx kCount;
  netrexx.lang.Rexx kn=null;
  netrexx.lang.Rexx kSq=null;
  netrexx.lang.Rexx splt=null;
  netrexx.lang.Rexx kl=null;
  netrexx.lang.Rexx kr=null;
  netrexx.lang.Rexx kNum=null;
  netrexx.lang.Rexx ll=null;
  netrexx.lang.Rexx lx=null;
  
  kCount=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=limit;kn=new netrexx.lang.Rexx((byte)1);kn:for(;kn.OpLtEq($1,$2);kn=kn.OpAdd($1,new netrexx.lang.Rexx(1))){
   kSq=kn.OpMult($1,kn);
   {netrexx.lang.Rexx $3=kSq.length();splt=new netrexx.lang.Rexx((byte)1);splt:for(;splt.OpLtEq($1,$3);splt=splt.OpAdd($1,new netrexx.lang.Rexx(1))){
    {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[4];
    $4[1]=splt;
    netrexx.lang.RexxParse.parse(kSq,$05,$4);
    kl=$4[0];kr=$4[2];}
    if (kr.OpEq($1,$06)) 
     break splt;
    if (kr.OpEq($1,$07)) 
     kr=new netrexx.lang.Rexx((byte)0);
    kNum=netrexx.lang.Rexx.toRexx("");
    if (kl.OpAdd($1,kr).OpEq($1,kn)) 
     {
      kNum=kn;
      kCount=kCount.OpAdd($1,$08);
      if (listAll) 
       {
        ll=(limit.length()).OpAdd($1,$08);
        lx=(limit.OpMult($1,limit)).length();
        netrexx.lang.RexxIO.Say((((((((((kNum.right(ll)).OpCcblank($1,$09)).OpCcblank($1,kSq.right(lx))).OpCcblank($1,$010)).OpCc($1,kl.right(lx))).OpCcblank($1,$011)).OpCcblank($1,kr.right(lx))).OpCcblank($1,$012)).OpCcblank($1,(kl.OpAdd($1,kr)).right(lx))).OpCc($1,$013));
       }
     }
    if (kNum.OpNotEq($1,$07)) 
     break splt;
    }
   }/*splt*/
   }
  }/*kn*/
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(((kCount.right(new netrexx.lang.Rexx((byte)10))).OpCcblank($1,netrexx.lang.Rexx.toRexx("Kaprekar numbers <"))).OpCcblank($1,limit));
  
  return;
  }
 
 private RKaprekar01(){return;}
 }
