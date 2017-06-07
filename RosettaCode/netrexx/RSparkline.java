/* Generated from 'RSparkline.nrx' 3 Sep 2013 20:55:42 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSparkline{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(8);
 private static final char[] $012={2,1,33,10,1,0,1,10,1,1,0};
 private static final char[] $013={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx((byte)40);
 private static final char[] $015={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(',');
 private static final java.lang.String $0="RSparkline.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  netrexx.lang.RexxIO.Say($01.copies(new netrexx.lang.Rexx((byte)80)));
  netrexx.lang.RexxIO.Say("");
  runSample2(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx sparkline(netrexx.lang.Rexx spark){
  netrexx.lang.Rexx bars;
  netrexx.lang.Rexx barK;
  netrexx.lang.Rexx nmin;
  netrexx.lang.Rexx nmax;
  netrexx.lang.Rexx iw=null;
  netrexx.lang.Rexx nval=null;
  netrexx.lang.Rexx range;
  netrexx.lang.Rexx slope;
  double point=0;
  spark=spark.changestr(new netrexx.lang.Rexx(','),new netrexx.lang.Rexx(' '));
  bars=netrexx.lang.Rexx.toRexx("\u2581 \u2582 \u2583 \u2584 \u2585 \u2586 \u2587 \u2588");
  barK=bars.words();
  nmin=spark.word(new netrexx.lang.Rexx((byte)1));
  nmax=nmin;
  // get min & max values
  {netrexx.lang.Rexx $1=spark.words();iw=new netrexx.lang.Rexx((byte)1);iw:for(;iw.OpLtEq(null,$1);iw=iw.OpAdd(null,new netrexx.lang.Rexx(1))){
   nval=spark.word(iw);
   nmin=nval.min(nmin);
   nmax=nval.max(nmax);
   }
  }/*iw*/
  range=nmax.OpSub(null,nmin).OpAdd(null,$02);
  slope=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=spark.words();iw=new netrexx.lang.Rexx((byte)1);iw:for(;iw.OpLtEq(null,$2);iw=iw.OpAdd(null,new netrexx.lang.Rexx(1))){
   point=java.lang.Math.ceil((((spark.word(iw)).OpSub(null,nmin).OpAdd(null,$02))).OpDiv(null,range).OpMult(null,barK).todouble());
   slope=slope.OpCc(null,bars.word(new netrexx.lang.Rexx(point)));
   }
  }/*iw*/
  return ((slope.OpCcblank(null,nmin)).OpCcblank(null,nmax)).OpCcblank(null,range);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx vals=null;
  netrexx.lang.Rexx sparks;
  netrexx.lang.Rexx si=null;
  netrexx.lang.Rexx lst=null;
  netrexx.lang.Rexx slope=null;
  // sample data setup
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$03,$3);
  vals=$3[0];}
  sparks=new netrexx.lang.Rexx((byte)0);
  sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  if (vals.OpEq(null,$04)) 
   {
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=((((((((((((($02.OpCcblank(null,$05)).OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$010)).OpCcblank(null,$011)).OpCcblank(null,$010)).OpCcblank(null,$09)).OpCcblank(null,$08)).OpCcblank(null,$07)).OpCcblank(null,$06)).OpCcblank(null,$05)).OpCcblank(null,$02);
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=netrexx.lang.Rexx.toRexx("1.5, 0.5 3.5, 2.5 5.5, 4.5 7.5, 6.5");
   }
  else 
   {
    {boolean $4=true;for(;;){if($4){$4=false;}else{if(vals.OpEq(null,$04))break;}
     // split input on a ! character
     {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(vals,$012,$5);
     lst=$5[0];vals=$5[1];}
     si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
     sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
     sparks.getnode(si).leaf=lst;
     }
    }
   }
  // run the samples
  {netrexx.lang.Rexx $6=sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf;si=new netrexx.lang.Rexx((byte)1);si:for(;si.OpLtEq(null,$6);si=si.OpAdd(null,new netrexx.lang.Rexx(1))){
   vals=sparks.getnode(si).leaf;
   {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(sparkline(vals),$013,$7);
   slope=$7[0];}
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input:        ").OpCcblank(null,vals));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Sparkline:    ").OpCcblank(null,slope));
   netrexx.lang.RexxIO.Say("");
   }
  }/*si*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample2(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx vals=null;
  netrexx.lang.Rexx sparks;
  java.util.Random rg;
  netrexx.lang.Rexx rspark=null;
  netrexx.lang.Rexx ispark=null;
  netrexx.lang.Rexx si=null;
  netrexx.lang.Rexx lst=null;
  netrexx.lang.Rexx slope=null;
  netrexx.lang.Rexx nmin=null;
  netrexx.lang.Rexx nmax=null;
  netrexx.lang.Rexx range=null;
  // sample data setup
  {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$03,$8);
  vals=$8[0];}
  sparks=new netrexx.lang.Rexx((byte)0);
  sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  rg=new java.util.Random(2718281828L);
  if (vals.OpEq(null,$04)) 
   {
    rspark=netrexx.lang.Rexx.toRexx("");
    ispark=netrexx.lang.Rexx.toRexx("");
    {int $9=$014.OpPlus(null).toint();for(;$9>0;$9--){
     rspark=rspark.OpCcblank(null,(new netrexx.lang.Rexx(rg.nextGaussian())).format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3)));
     ispark=ispark.OpCcblank(null,(new netrexx.lang.Rexx(rg.nextInt(100))));
     }
    }
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=((((((((((((($02.OpCcblank(null,$05)).OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$010)).OpCcblank(null,$011)).OpCcblank(null,$010)).OpCcblank(null,$09)).OpCcblank(null,$08)).OpCcblank(null,$07)).OpCcblank(null,$06)).OpCcblank(null,$05)).OpCcblank(null,$02);
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=netrexx.lang.Rexx.toRexx("1.5, 0.5 3.5, 2.5 5.5, 4.5 7.5, 6.5");
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=rspark;
    si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
    sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
    sparks.getnode(si).leaf=ispark;
   }
  else 
   {
    {boolean $10=true;for(;;){if($10){$10=false;}else{if(vals.OpEq(null,$04))break;}
     // split input on a ! character
     {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(vals,$012,$11);
     lst=$11[0];vals=$11[1];}
     si=(sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$02);
     sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=si;
     sparks.getnode(si).leaf=lst;
     }
    }
   }
  // run the samples
  {netrexx.lang.Rexx $12=sparks.getnode(new netrexx.lang.Rexx((byte)0)).leaf;si=new netrexx.lang.Rexx((byte)1);si:for(;si.OpLtEq(null,$12);si=si.OpAdd(null,new netrexx.lang.Rexx(1))){
   vals=sparks.getnode(si).leaf.space();
   {netrexx.lang.Rexx $13[]=new netrexx.lang.Rexx[4];
   netrexx.lang.RexxParse.parse(sparkline(vals),$015,$13);
   slope=$13[0];nmin=$13[1];nmax=$13[2];range=$13[3];}
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input:        ").OpCcblank(null,vals));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Sparkline:    ").OpCcblank(null,slope));
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Min,Max,Range:").OpCcblank(null,nmin)).OpCc(null,$016)).OpCc(null,nmax)).OpCc(null,$016)).OpCc(null,range));
   netrexx.lang.RexxIO.Say("");
   }
  }/*si*/
  
  return;
  }
 
 private RSparkline(){return;}
 }
