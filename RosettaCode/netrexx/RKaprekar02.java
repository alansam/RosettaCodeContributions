/* Generated from 'RKaprekar02.nrx' 8 Oct 2012 14:54:49 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RKaprekar02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)40);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("numbers (");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("):");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('s');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(9);
 private static final char[] $010={8,1,10,1,0,1,10,2,2,3,0};
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx('(');
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(')');
 private static final java.lang.String $0="RKaprekar02.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties constant */
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=(1!=1);

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx maxLimit=null;
  netrexx.lang.Rexx listAll=null;
  netrexx.lang.Rexx maxLim=null;
  boolean details=false;
  netrexx.lang.Rexx limit;
  
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  maxLimit=$2[0];listAll=$2[1];}
  {/*select*/
  if (new netrexx.lang.Rexx(maxLimit.OpNotEq($1,$03)).OpAnd($1,maxLimit.datatype(new netrexx.lang.Rexx('w'))))
   maxLim=maxLimit;
  else{
   maxLim=new netrexx.lang.Rexx(1000000);
  }
  }
  {/*select*/
  if (netrexx.lang.Rexx.toRexx("TRUE").abbrev(listAll.upper(),new netrexx.lang.Rexx((byte)1)).toboolean())
   details=isTrue;
  else if (netrexx.lang.Rexx.toRexx("FALSE").abbrev(listAll.upper(),new netrexx.lang.Rexx((byte)1)).toboolean())
   details=isFalse;
  else{
   details=isTrue;
  }
  }
  
  limit=new netrexx.lang.Rexx((short)10000);
  timings(limit,details);
  timings(limit,details,isTrue);
  
  limit=maxLim;
  timings(limit,details);
  timings(limit,details,isTrue);
  
  return;
  }

 
 public static void timings(netrexx.lang.Rexx limit){
  timings(limit,isTrue,isFalse);return;
  }
 public static void timings(netrexx.lang.Rexx limit,boolean listAll){
  timings(limit,listAll,isFalse);return;
  }
 public static void timings(netrexx.lang.Rexx limit,boolean listAll,boolean optimize){
  long t1;
  long t2;
  netrexx.lang.Rexx t0;
  netrexx.lang.Rexx ts;
  netrexx.lang.Rexx om=null;
  
  netrexx.lang.RexxIO.Say($04.copies(new netrexx.lang.Rexx((byte)80)));
  t1=java.lang.System.nanoTime();
  kaprekar(limit,listAll,optimize);
  t2=java.lang.System.nanoTime();
  t0=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  ts=t0.OpDiv($1,$05);
  if (optimize) 
   om=netrexx.lang.Rexx.toRexx("optimized");
  else 
   om=netrexx.lang.Rexx.toRexx("unoptimized");
  netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx.toRexx("Elapsed time to scan").OpCcblank($1,limit)).OpCcblank($1,$06)).OpCc($1,om)).OpCc($1,$07)).OpCcblank($1,ts)).OpCc($1,$08));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 public static void kaprekar(netrexx.lang.Rexx limit){
  kaprekar(limit,isTrue,isFalse);return;
  }
 public static void kaprekar(netrexx.lang.Rexx limit,boolean listAll){
  kaprekar(limit,listAll,isFalse);return;
  }
 public static void kaprekar(netrexx.lang.Rexx limit,boolean listAll,boolean optimize){
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
  {netrexx.lang.Rexx $3=limit;kn=new netrexx.lang.Rexx((byte)1);kn:for(;kn.OpLtEq($1,$3);kn=kn.OpAdd($1,new netrexx.lang.Rexx(1))){
   kSq=kn.OpMult($1,kn);
   
   if (optimize) 
    if (kSq.OpRem($1,$09).OpNotEqS($1,kn.OpRem($1,$09))) 
     continue kn; // cast out nines
   
   {netrexx.lang.Rexx $4=kSq.length();splt=new netrexx.lang.Rexx((byte)1);splt:for(;splt.OpLtEq($1,$4);splt=splt.OpAdd($1,new netrexx.lang.Rexx(1))){
    {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[4];
    $5[1]=splt;
    netrexx.lang.RexxParse.parse(kSq,$010,$5);
    kl=$5[0];kr=$5[2];}
    if (kr.OpEq($1,$011)) 
     break splt;
    if (kr.OpEq($1,$03)) 
     kr=new netrexx.lang.Rexx((byte)0);
    kNum=netrexx.lang.Rexx.toRexx("");
    if (kl.OpAdd($1,kr).OpEq($1,kn)) 
     {
      kNum=kn;
      kCount=kCount.OpAdd($1,$012);
      if (listAll) 
       {
        ll=(limit.length()).OpAdd($1,$012);
        lx=(limit.OpMult($1,limit)).length();
        netrexx.lang.RexxIO.Say((((((((((((kCount.right(new netrexx.lang.Rexx((byte)5))).OpCc($1,$013)).OpCcblank($1,kNum.right(ll))).OpCcblank($1,$013)).OpCcblank($1,kSq.right(lx))).OpCcblank($1,$014)).OpCc($1,kl.right(lx))).OpCcblank($1,$015)).OpCcblank($1,kr.right(lx))).OpCcblank($1,$016)).OpCcblank($1,(kl.OpAdd($1,kr)).right(lx))).OpCc($1,$017));
       }
     }
    if (kNum.OpNotEq($1,$03)) 
     break splt;
    }
   }/*splt*/
   }
  }/*kn*/
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(((kCount.right(new netrexx.lang.Rexx((byte)10))).OpCcblank($1,netrexx.lang.Rexx.toRexx("Kaprekar numbers <"))).OpCcblank($1,limit));
  
  return;
  }
 
 private RKaprekar02(){return;}
 }
