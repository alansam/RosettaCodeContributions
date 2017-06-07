/* Generated from 'RMeanTimeOfDay.nrx' 1 Jul 2014 20:16:29 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* REXX ---------------------------------------------------------------
* 25.06.2014 Walter Pachl
*--------------------------------------------------------------------*/

public class RMeanTimeOfDay{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(360);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final char[] $07={2,1,58,10,1,0,2,1,58,10,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2);
 private static final char[] $09={1,10,2,0,1,0};
 private static final java.lang.String $0="RMeanTimeOfDay.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx times=null;
  netrexx.lang.Rexx day;
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx y;
  netrexx.lang.Rexx time;
  netrexx.lang.Rexx alpha;
  netrexx.lang.Rexx i=null;
  double ww;
  netrexx.lang.Rexx ss;
  netrexx.lang.Rexx m;
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  times=$1[0];}
  if (times.OpEq(null,$02)) 
   times=netrexx.lang.Rexx.toRexx("23:00:17 23:40:20 00:12:45 00:17:19");
  //  sum = 0
  day=new netrexx.lang.Rexx(86400);
  x=new netrexx.lang.Rexx((byte)0);
  y=new netrexx.lang.Rexx((byte)0);
  time=netrexx.lang.Rexx.toRexx("");
  alpha=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=times.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over times            */
   time.getnode(i).leaf=times.word(i);/* pick a time                */
   alpha.getnode(i).leaf=t2a(time.getnode(i).leaf);/* convert to angle (degrees) */
   netrexx.lang.RexxIO.Say((time.getnode(i).leaf).OpCcblank(null,alpha.getnode(i).leaf.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)9))));
   x=x.OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.sin((alpha.getnode(i).leaf).todouble())));/* accumulate sines           */
   y=y.OpAdd(null,new netrexx.lang.Rexx(java.lang.Math.cos((alpha.getnode(i).leaf).todouble())));/* accumulate cosines         */
   }
  }/*i*/
  ww=java.lang.Math.atan(x.OpDiv(null,y).todouble());/* compute average angle      */
  ss=new netrexx.lang.Rexx(ww).OpMult(null,day).OpDiv(null,$03);/* convert to seconds         */
  if (ss.OpLt(null,$04)) 
   ss=ss.OpAdd(null,day);/* avoid negative value       */
  m=ss.OpDivI(null,$05);/* split into hh mm ss        */
  s=ss.OpSub(null,m.OpMult(null,$05));
  h=m.OpDivI(null,$05);
  m=m.OpSub(null,h.OpMult(null,$05));
  netrexx.lang.RexxIO.Say(((((f2(h)).OpCc(null,$06)).OpCc(null,f2(m))).OpCc(null,$06)).OpCc(null,f2(s)));/* show the mean time         */
  {System.exit(0);return;}
  }

 
 public static netrexx.lang.Rexx t2a(netrexx.lang.Rexx Arg){
  netrexx.lang.Rexx day;
  netrexx.lang.Rexx hh=null;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx sec;
  netrexx.lang.Rexx a;
  //Procedure Expose day                /* convert time to angle      */
  day=new netrexx.lang.Rexx(86400);
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(Arg,$07,$3);
  hh=$3[0];mm=$3[1];ss=$3[2];}
  sec=((hh.OpMult(null,$05).OpAdd(null,mm))).OpMult(null,$05).OpAdd(null,ss);
  if (sec.OpGt(null,(day.OpDiv(null,$08)))) 
   sec=sec.OpSub(null,day);
  a=$03.OpMult(null,sec).OpDiv(null,day);
  return a;
  }

 
 public static netrexx.lang.Rexx f2(netrexx.lang.Rexx Arg){
  netrexx.lang.Rexx agg=null;
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(Arg,$09,$4);
  agg=$4[0];}
  netrexx.lang.RexxIO.Say(agg);
  return agg.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0));
  }
 
 private RMeanTimeOfDay(){return;}
 }
