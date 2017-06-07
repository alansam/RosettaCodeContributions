/* Generated from 'RAvgMode.nrx' 2 Jan 2013 17:18:55 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAvgMode{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Vector:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx(", Mode(s):");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("11e+2");
 private static final java.lang.String $0="RAvgMode.nrx";
 
 public static void main(java.lang.String $0s[]){
  run_samples();
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List mode(java.util.List lvector){
  netrexx.lang.Rexx seen;
  netrexx.lang.Rexx modes;
  netrexx.lang.Rexx modeMax;
  netrexx.lang.Rexx v_=null;
  netrexx.lang.Rexx mv=null;
  netrexx.lang.Rexx nx=null;
  java.util.ArrayList modeList;
  netrexx.lang.Rexx val=null;
  seen=new netrexx.lang.Rexx((byte)0);
  modes=netrexx.lang.Rexx.toRexx("");
  modeMax=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(lvector.size()).OpSub(null,$01);v_=new netrexx.lang.Rexx((byte)0);v_:for(;v_.OpLtEq(null,$1);v_=v_.OpAdd(null,new netrexx.lang.Rexx(1))){
   mv=(netrexx.lang.Rexx)(lvector.get(v_.toint()));
   seen.getnode(mv).leaf=(seen.getnode(mv).leaf).OpAdd(null,$01);
   {/*select*/
   if ((seen.getnode(mv).leaf).OpGt(null,modeMax))
    {
     modeMax=seen.getnode(mv).leaf;
     modes=netrexx.lang.Rexx.toRexx("");
     nx=new netrexx.lang.Rexx((byte)1);
     modes.getnode(new netrexx.lang.Rexx((byte)0)).leaf=nx;
     modes.getnode(nx).leaf=mv;
    }
   else if ((seen.getnode(mv).leaf).OpEq(null,modeMax))
    {
     nx=(modes.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
     modes.getnode(new netrexx.lang.Rexx((byte)0)).leaf=nx;
     modes.getnode(nx).leaf=mv;
    }
   else{
    {
     ;
    }
   }
   }
   }
  }/*v_*/
  
  modeList=new java.util.ArrayList((modes.getnode(new netrexx.lang.Rexx((byte)0)).leaf).toint());
  {netrexx.lang.Rexx $2=modes.getnode(new netrexx.lang.Rexx((byte)0)).leaf;v_=new netrexx.lang.Rexx((byte)1);v_:for(;v_.OpLtEq(null,$2);v_=v_.OpAdd(null,new netrexx.lang.Rexx(1))){
   val=modes.getnode(v_).leaf;
   modeList.add((java.lang.Object)val);
   }
  }/*v_*/
  
  return (java.util.List)modeList;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List mode(netrexx.lang.Rexx rvector[]){
  return mode((java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])rvector)))));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List show_mode(java.util.List lvector){
  java.util.List modes;
  modes=mode(lvector);
  netrexx.lang.RexxIO.Say((($02.OpCcblank(null,(new netrexx.lang.Rexx(java.lang.String.valueOf(lvector))).space(new netrexx.lang.Rexx((byte)0)))).OpCc(null,$03)).OpCcblank(null,(new netrexx.lang.Rexx(java.lang.String.valueOf(modes))).space(new netrexx.lang.Rexx((byte)0))));
  return modes;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List show_mode(netrexx.lang.Rexx rvector[]){
  return show_mode((java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])rvector)))));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void run_samples(){
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(10),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1)}); // 10 9 8 7 6 5 4 3 2 1
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(10),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx("0.11")}); // 0
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(30),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((byte)30),new netrexx.lang.Rexx((byte)40),new netrexx.lang.Rexx((byte)50),$04.OpMinus(null),new netrexx.lang.Rexx("4.7"),$05.OpMinus(null)}); // 30
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(30),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((byte)30),new netrexx.lang.Rexx((byte)40),new netrexx.lang.Rexx((byte)50),$04.OpMinus(null),new netrexx.lang.Rexx("4.7"),$05.OpMinus(null),$05.OpMinus(null)}); // 30 -11e2
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)9)}); // 9
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)11)}); // 1 2 3 4 5 6 7 8 9 10 11
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(8),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2)}); // 8 2
  show_mode(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("cat"),netrexx.lang.Rexx.toRexx("kat"),netrexx.lang.Rexx.toRexx("Cat"),netrexx.lang.Rexx.toRexx("emu"),netrexx.lang.Rexx.toRexx("emu"),netrexx.lang.Rexx.toRexx("Kat")}); // emu
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(0),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0)}); // 4
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(2),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)2)}); // 2
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(2),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)8)}); // 8 2
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('n'),new netrexx.lang.Rexx('z'),new netrexx.lang.Rexx('y'),new netrexx.lang.Rexx('k'),new netrexx.lang.Rexx('l'),new netrexx.lang.Rexx('o'),new netrexx.lang.Rexx('p'),new netrexx.lang.Rexx('\u00E4'),new netrexx.lang.Rexx('d'),new netrexx.lang.Rexx('i'),new netrexx.lang.Rexx('e')}); // E n z y k l o p ä d i e
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('n'),new netrexx.lang.Rexx('z'),new netrexx.lang.Rexx('y'),new netrexx.lang.Rexx('k'),new netrexx.lang.Rexx('l'),new netrexx.lang.Rexx('o'),new netrexx.lang.Rexx('p'),new netrexx.lang.Rexx('\u00E4'),new netrexx.lang.Rexx('d'),new netrexx.lang.Rexx('i'),new netrexx.lang.Rexx('e'),new netrexx.lang.Rexx('\u00E4')}); // ä
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6)}); // 1
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)}); // 3, 1
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)12),new netrexx.lang.Rexx((byte)12),new netrexx.lang.Rexx((byte)17)}); // 6
  show_mode(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)4)}); // 4 1
  return;
  }
 
 private RAvgMode(){return;}
 }
