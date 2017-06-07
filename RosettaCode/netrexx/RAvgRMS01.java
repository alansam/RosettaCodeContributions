/* Generated from 'RAvgRMS01.nrx' 29 Dec 2012 11:21:16 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RAvgRMS01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)90);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx((byte)11);
 private static final char[] $09={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx((byte)0);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(11);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx("0.5");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("scientific");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("E0");
 private static final char[] $019={2,1,69,10,1,0,1,10,2,1,2,0};
 private static final netrexx.lang.Rexx $020=new netrexx.lang.Rexx('E');
 private static final java.lang.String $0="RAvgRMS01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx maxV=null;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx nr=null;
  netrexx.lang.Rexx rmsD;
  netrexx.lang.Rexx rmsR;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  maxV=$2[0];}
  if (maxV.OpEq($1,$03)|maxV.OpEq($1,$04)) 
   maxV=new netrexx.lang.Rexx((byte)10);
  
  sum=new netrexx.lang.Rexx((byte)0);
  {int $3=maxV.OpPlus($1).toint();nr=new netrexx.lang.Rexx((byte)1);nr:for(;$3>0;$3--,nr=nr.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd($1,nr.OpPow($1,$05));
   }
  }/*nr*/
  rmsD=new netrexx.lang.Rexx(java.lang.Math.sqrt(sum.OpDiv($1,maxV).todouble()));
  rmsR=sqrt(sum.OpDiv($1,maxV));
  
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("RMS of values from 1 to").OpCcblank($1,maxV)).OpCc($1,$06)).OpCcblank($1,rmsD));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("RMS of values from 1 to").OpCcblank($1,maxV)).OpCc($1,$06)).OpCcblank($1,rmsR));
  
  return;
  }

 /*──────────────────────────────────SQRT subroutine─────────────────────────*/
 
 public static netrexx.lang.Rexx sqrt(netrexx.lang.Rexx x){
  netrexx.lang.Rexx d;
  netrexx.lang.Rexx m;
  netrexx.lang.Rexx g=null;
  netrexx.lang.Rexx p=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.RexxSet $4=new netrexx.lang.RexxSet($1);
  if (x.OpEq($4,$07)) 
   return new netrexx.lang.Rexx((byte)0);
  d=(new netrexx.lang.Rexx($4.digits));
  $4.setDigits($08);
  m=new netrexx.lang.Rexx((byte)11);
  {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(sqrtGuess(x,m,d),$09,$5);
  g=$5[0];p=$5[1];}
  {j=new netrexx.lang.Rexx((byte)0);j:for(;;j=j.OpAdd($4,new netrexx.lang.Rexx(1))){if(!p.OpGt($4,$010))break;
   m.getnode(j).leaf=p;
   p=p.OpDivI($4,$05).OpAdd($4,$011);
   }
  }/*j*/
  {netrexx.lang.Rexx $6=$011.OpMinus($4);boolean $7=$6.OpGtEq($4,$07);k=j.OpAdd($4,$012).OpPlus($4);k:for(;$7?k.OpLtEq($4,$013):k.OpGtEq($4,$013);k=k.OpAdd($4,$6)){
   if ((m.getnode(k).leaf).OpGt($4,$014)) 
    $4.setDigits(m.getnode(k).leaf);
   g=$015.OpMult($4,(g.OpAdd($4,x.OpDiv($4,g))));
   }
  }/*k*/
  $4.setDigits(d);
  return g.OpDiv($4,$011);
  }

 
 private static netrexx.lang.Rexx sqrtGuess(netrexx.lang.Rexx x,netrexx.lang.Rexx m,netrexx.lang.Rexx d){
  netrexx.lang.Rexx p;
  netrexx.lang.Rexx xVal;
  netrexx.lang.Rexx g=null;
  netrexx.lang.Rexx _=null;
  netrexx.lang.RexxSet $8=new netrexx.lang.RexxSet($1);
  if (x.OpLt($8,$07)) 
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("negative number").OpCcblank($8,x));
  $8.setForm($016);
  p=d.OpAdd($8,d.OpDivI($8,$017)).OpAdd($8,$05);
  xVal=(x.format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),(netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)0))).OpCcblank($8,$018);
  {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(xVal,$019,$9);
  g=$9[0];_=$9[1];}
  _=($015.OpCc($8,$020)).OpCc($8,_);
  g=g.OpMult($8,_).OpDivI($8,$05);
  g=g.OpAdd($8,$07);
  return g.OpCcblank($8,p);
  }
 
 private RAvgRMS01(){return;}
 }
