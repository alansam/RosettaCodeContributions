/* Generated from 'REntropy.nrx' 24 May 2013 14:10:05 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class REntropy{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final char[] $04={1,10,1,0,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("1223334444");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("1223334444555555555");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("122333");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("1227774444");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx("0.5");
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx("1.5");
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx((byte)1);
 private static final java.lang.String $0="REntropy.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /* REXX ***************************************************************
  * 28.02.2013 Walter Pachl
  **********************************************************************/
 
 public static netrexx.lang.Rexx getShannonEntropy(){
  return getShannonEntropy(netrexx.lang.Rexx.toRexx("1223334444"));
  }
 public static netrexx.lang.Rexx getShannonEntropy(netrexx.lang.Rexx s){
  netrexx.lang.Rexx occ;
  netrexx.lang.Rexx chars;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx cn;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx p;
  netrexx.lang.Rexx ci=null;
  netrexx.lang.Rexx e;
  double pl=0;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  //trace var occ c chars n cn i e p pl
  $1.setDigits($01);
  occ=new netrexx.lang.Rexx((byte)0);
  chars=netrexx.lang.Rexx.toRexx("");
  n=new netrexx.lang.Rexx((byte)0);
  cn=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=s.length();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq($1,$2);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   c=s.substr(i,new netrexx.lang.Rexx((byte)1));
   if ((chars.pos(c)).OpEq($1,$02)) 
    {
     cn=cn.OpAdd($1,$03);
     chars=chars.OpCc($1,c);
    }
   occ.getnode(c).leaf=(occ.getnode(c).leaf).OpAdd($1,$03);
   n=n.OpAdd($1,$03);
   }
  }/*i*/
  p=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $3=cn;ci=new netrexx.lang.Rexx((byte)1);ci:for(;ci.OpLtEq($1,$3);ci=ci.OpAdd($1,new netrexx.lang.Rexx(1))){
   c=chars.substr(ci,new netrexx.lang.Rexx((byte)1));
   p.getnode(c).leaf=(occ.getnode(c).leaf).OpDiv($1,n);
   }
  }/*ci*/
  e=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $4=cn;ci=new netrexx.lang.Rexx((byte)1);ci:for(;ci.OpLtEq($1,$4);ci=ci.OpAdd($1,new netrexx.lang.Rexx(1))){
   c=chars.substr(ci,new netrexx.lang.Rexx((byte)1));
   pl=log2((p.getnode(c).leaf).todouble());/*log(p[c], 30, 2)*/
   e=e.OpAdd($1,(p.getnode(c).leaf).OpMult($1,new netrexx.lang.Rexx(pl)));
   }
  }/*ci*/
  return e.OpMinus($1);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static double log2(double a){
  return (java.lang.Math.log(a))/(java.lang.Math.log((double)((byte)2)));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx Arg){
  netrexx.lang.Rexx sstr=null;
  netrexx.lang.Rexx entropies;
  netrexx.lang.Rexx ssMax;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx ss_=null;
  netrexx.lang.Rexx entropy=null;
  netrexx.lang.Rexx report=null;
  {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(Arg,$04,$5);
  sstr=$5[0];}
  if (sstr.OpEq(null,$05)) 
   sstr=((((($06.OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,netrexx.lang.Rexx.toRexx("aaBBcccDDDD"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("1234567890abcdefghijklmnopqrstuvwxyz"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Rosetta_Code"));
  
  
  
  
  
  
  netrexx.lang.RexxIO.Say("Calculating Shannon\'s entropy for the following list:");
  netrexx.lang.RexxIO.Say(($010.OpCc(null,(sstr.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','))).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", ")))).OpCc(null,$011));
  netrexx.lang.RexxIO.Say("");
  entropies=new netrexx.lang.Rexx((byte)0);
  ssMax=new netrexx.lang.Rexx((byte)0);
  // This crude sample substitutes a '_' character for a space in the input strings
  {netrexx.lang.Rexx $6=sstr.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$6);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   ss=sstr.word(w_);
   ssMax=ssMax.max(ss.length());
   ss_=ss.changestr(new netrexx.lang.Rexx('_'),new netrexx.lang.Rexx(' '));
   entropy=getShannonEntropy(ss_);
   entropies.getnode(ss).leaf=entropy;
   }
  }/*w_*/
  {netrexx.lang.Rexx $7=sstr.words();report=new netrexx.lang.Rexx((byte)1);report:for(;report.OpLtEq(null,$7);report=report.OpAdd(null,new netrexx.lang.Rexx(1))){
   ss=sstr.word(report);
   ss_=ss.changestr(new netrexx.lang.Rexx('_'),new netrexx.lang.Rexx(' '));
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Shannon entropy of").OpCcblank(null,(($012.OpCc(null,ss_)).OpCc(null,$012)).right(ssMax.OpAdd(null,$013)))).OpCc(null,$014)).OpCcblank(null,entropies.getnode(ss).leaf.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)12))));
   }
  }/*report*/
  return;
  }

 
 /* **********************************************************************
  * Return log(x) -- with specified precision and a specified base
  * Three different series are used for the ranges  0 to 0.5
  *                                                 0.5 to 1.5
  *                                                 1.5 to infinity
  * 03.09.1992 Walter Pachl
  ***********************************************************************/
 
 public static netrexx.lang.Rexx log(netrexx.lang.Rexx x){
  return log(x,netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx log(netrexx.lang.Rexx x,netrexx.lang.Rexx prec){
  return log(x,prec,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx log(netrexx.lang.Rexx x,netrexx.lang.Rexx prec,netrexx.lang.Rexx b){
  netrexx.lang.Rexx r=null;
  netrexx.lang.Rexx z=null;
  netrexx.lang.Rexx o=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx ra=null;
  netrexx.lang.RexxSet $8=new netrexx.lang.RexxSet();
  if (prec.OpEq($8,$05)) 
   prec=new netrexx.lang.Rexx((byte)9);
  $8.setDigits(($013.OpMult($8,prec)));
  //Numeric Fuzz   3
  {/*select*/
  if (x.OpLtEq($8,$02))
   r=netrexx.lang.Rexx.toRexx("*** invalid argument ***");
  else if (x.OpLt($8,$015))
   {
    z=((x.OpSub($8,$03))).OpDiv($8,(x.OpAdd($8,$03)));
    o=z;
    r=z;
    k=new netrexx.lang.Rexx((byte)1);
    {netrexx.lang.Rexx $9=$016;i=new netrexx.lang.Rexx((byte)3);i:for(;;i=i.OpAdd($8,$9)){
     ra=r;
     k=k.OpAdd($8,$03);
     o=o.OpMult($8,z).OpMult($8,z);
     r=r.OpAdd($8,o.OpDiv($8,i));
     if (r.OpEq($8,ra)) 
      break i;
     }
    }/*i*/
    r=$013.OpMult($8,r);
   }
  else if (x.OpLt($8,$017))
   {
    z=(x.OpSub($8,$03));
    o=z;
    r=z;
    k=new netrexx.lang.Rexx((byte)1);
    {i=new netrexx.lang.Rexx((byte)2);i:for(;;i=i.OpAdd($8,new netrexx.lang.Rexx(1))){
     ra=r;
     k=k.OpAdd($8,$03);
     o=o.OpMinus($8).OpMult($8,z);
     r=r.OpAdd($8,o.OpDiv($8,i));
     if (r.OpEq($8,ra)) 
      break i;
     }
    }/*i*/
   }
  else{
   {/* 1.5<=x */
    z=((x.OpAdd($8,$03))).OpDiv($8,(x.OpSub($8,$03)));
    o=$03.OpDiv($8,z);
    r=o;
    k=new netrexx.lang.Rexx((byte)1);
    {netrexx.lang.Rexx $10=$016;i=new netrexx.lang.Rexx((byte)3);i:for(;;i=i.OpAdd($8,$10)){
     ra=r;
     k=k.OpAdd($8,$03);
     o=o.OpDiv($8,(z.OpMult($8,z)));
     r=r.OpAdd($8,o.OpDiv($8,i));
     if (r.OpEq($8,ra)) 
      break i;
     }
    }/*i*/
    r=$013.OpMult($8,r);
   }
  }
  }
  if (b.OpNotEq($8,$05)) 
   r=r.OpDiv($8,log(b));
  $8.setDigits((prec));
  r=r.OpAdd($8,$02);
  return r;
  }
 
 private REntropy(){return;}
 }
