/* Generated from 'RAvgMeanTOD01.nrx' 29 Jul 2014 13:51:21 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RAvgMeanTOD01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(24);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3600);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(':');
 private static final char[] $08={2,1,58,10,1,0,2,1,58,10,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(360);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RAvgMeanTOD01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx avgMTD(netrexx.lang.Rexx times){
  netrexx.lang.Rexx day;
  netrexx.lang.Rexx c_;
  double x;
  double y;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx timex=null;
  double alpha=0;
  netrexx.lang.Rexx p_;
  netrexx.lang.Rexx hh;
  netrexx.lang.Rexx mm;
  netrexx.lang.Rexx ss;
  day=$01.OpMult(null,$02).OpMult(null,$02); // 86400 == seconds in a day
  c_=new netrexx.lang.Rexx(java.lang.Math.PI).OpDiv(null,(day.OpDiv(null,$03)));/* Math.atan2(0.0, -1.0) */
  x=new netrexx.lang.Rexx("0.0").todouble();
  y=new netrexx.lang.Rexx("0.0").todouble();
  
  {netrexx.lang.Rexx $1=times.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$1);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   timex=times.word(w_);
   alpha=time2angle(timex);
   x=new netrexx.lang.Rexx(x).OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.sin(java.lang.Math.toRadians(alpha)))).todouble(); // accumulate sines
   y=new netrexx.lang.Rexx(y).OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.cos(java.lang.Math.toRadians(alpha)))).todouble(); // accumulate cosines
   }
  }/*w_*/
  p_=new netrexx.lang.Rexx(java.lang.Math.atan2(x,y)).OpDiv(null,c_); // compute average angle
  if (p_.OpLt(null,$04)) 
   p_=p_.OpAdd(null,day); // avoid negative value
  hh=(p_.OpDivI(null,$05)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  p_=p_.OpRem(null,$05);
  mm=(p_.OpDivI(null,$02)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  p_=p_.OpRem(null,$02);
  ss=(p_.OpDivI(null,$06)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  
  return (((hh.OpCc(null,$07)).OpCc(null,mm)).OpCc(null,$07)).OpCc(null,ss);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static double time2angle(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx day;
  netrexx.lang.Rexx hh=null;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx sec;
  netrexx.lang.Rexx angle;
  day=$01.OpMult(null,$02).OpMult(null,$02); // 86400 == seconds in a day
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$08,$2);
  hh=$2[0];mm=$2[1];ss=$2[2];}
  sec=((hh.OpMult(null,$02).OpAdd(null,mm))).OpMult(null,$02).OpAdd(null,ss);
  if (sec.OpGt(null,(day.OpDiv(null,$03)))) 
   sec=sec.OpSub(null,day);
  angle=$09.OpMult(null,sec).OpDiv(null,day);
  
  netrexx.lang.RexxIO.Say(arg.OpCcblank(null,angle.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)9))));
  return angle.todouble();
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
 
 private RAvgMeanTOD01(){return;}
 }
