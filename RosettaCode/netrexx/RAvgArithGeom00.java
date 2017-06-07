/* Generated from 'RAvgArithGeom00.nrx' 29 Dec 2012 19:05:31 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RAvgArithGeom00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)18);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(14);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RAvgArithGeom00.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a_=null;
  netrexx.lang.Rexx g_=null;
  netrexx.lang.Rexx a0=null;
  netrexx.lang.Rexx g0=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  a_=$2[0];g_=$2[1];}
  if (a_.OpEq($1,$03)|a_.OpEq($1,$04)) 
   a0=new netrexx.lang.Rexx((byte)1);
  else 
   a0=a_;
  if (g_.OpEq($1,$03)|g_.OpEq($1,$04)) 
   g0=$05.OpDiv($1,new netrexx.lang.Rexx(java.lang.Math.sqrt((double)((byte)2))));
  else 
   g0=g_;
  
  netrexx.lang.RexxIO.Say(agm(a0,g0));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx agm(netrexx.lang.Rexx a0,netrexx.lang.Rexx g0){
  netrexx.lang.Rexx a1;
  netrexx.lang.Rexx g1;
  netrexx.lang.Rexx temp=null;
  a1=a0;
  g1=g0;
  {for(;;){if(!((a1.OpSub($1,g1)).abs()).OpGtEq($1,new netrexx.lang.Rexx(java.lang.Math.pow((double)((byte)10),$06.OpMinus($1).todouble()))))break;
   temp=((a1.OpAdd($1,g1))).OpDiv($1,$07);
   g1=new netrexx.lang.Rexx(java.lang.Math.sqrt(a1.OpMult($1,g1).todouble()));
   a1=temp;
   }
  }
  return a1.OpAdd($1,$08);
  }
 
 private RAvgArithGeom00(){return;}
 }
