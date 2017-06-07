/* Generated from 'RAvgMeanTOD00.nrx' 29 Jul 2014 12:01:18 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RAvgMeanTOD00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("1.0");
 private static final char[] $04={2,1,58,10,1,0,2,1,58,10,1,1,1,10,2,2,3,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3600);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RAvgMeanTOD00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx avgMTD(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tk;
  double pi;
  netrexx.lang.Rexx c_;
  netrexx.lang.Rexx x_;
  netrexx.lang.Rexx y_;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx times=null;
  netrexx.lang.Rexx hh=null;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx t_=null;
  netrexx.lang.Rexx p_=null;
  
  tk=$01.OpMult(null,$02).OpMult(null,$02);
  pi=java.lang.Math.atan2(0.0D,$03.OpMinus(null).todouble());
  pi=java.lang.Math.PI;
  c_=new netrexx.lang.Rexx(pi).OpDiv(null,tk);
  x_=new netrexx.lang.Rexx("0.0");
  y_=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $1=arg.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$1);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   times=arg.word(w_);
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
   netrexx.lang.RexxParse.parse(times,$04,$2);
   hh=$2[0];mm=$2[1];ss=$2[2];}
   t_=hh.OpMult(null,$05).OpAdd(null,mm.OpMult(null,$02)).OpAdd(null,ss);
   p_=t_.OpMult(null,c_);
   netrexx.lang.RexxIO.Say(times.OpCcblank(null,p_.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)9))));
   x_=x_.OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.sin(p_.todouble())));
   y_=y_.OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.cos(p_.todouble())));
   }
  }/*w_*/
  p_=new netrexx.lang.Rexx(java.lang.Math.atan2(x_.todouble(),y_.todouble())).OpDiv(null,c_);
  if (p_.OpLt(null,$06)) 
   p_=p_.OpAdd(null,tk.OpMult(null,$07));
  hh=(p_.OpDivI(null,$05)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  p_=p_.OpRem(null,$05);
  mm=(p_.OpDivI(null,$02)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  p_=p_.OpRem(null,$02);
  ss=(p_.OpDivI(null,$08)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  
  return (((hh.OpCc(null,$09)).OpCc(null,mm)).OpCc(null,$09)).OpCc(null,ss);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx avgTime;
  if (arg.OpEq(null,$010)) 
   arg=netrexx.lang.Rexx.toRexx("23:00:17 23:40:20 00:12:45 00:17:19");
  avgTime=avgMTD(arg);
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Average time of day of:").OpCcblank(null,arg.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", ")))).OpCcblank(null,$011)).OpCcblank(null,avgTime));
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RAvgMeanTOD00(){return;}
 }
