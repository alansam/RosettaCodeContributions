/* Generated from 'RSortingRadixsort.nrx' 2 May 2013 18:28:58 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSortingRadixsort{
 private static final char[] $01={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final char[] $05={7,1,10,1,0,4,1,1,10,1,2,1,10,1,0,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx((byte)9);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(802);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(90);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx(19);
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx(18);
 private static final netrexx.lang.Rexx $020=new netrexx.lang.Rexx(17);
 private static final netrexx.lang.Rexx $021=new netrexx.lang.Rexx(15);
 private static final netrexx.lang.Rexx $022=new netrexx.lang.Rexx(14);
 private static final netrexx.lang.Rexx $023=new netrexx.lang.Rexx(13);
 private static final netrexx.lang.Rexx $024=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx(11);
 private static final netrexx.lang.Rexx $026=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $027=netrexx.lang.Rexx.toRexx(" Input:");
 private static final netrexx.lang.Rexx $028=netrexx.lang.Rexx.toRexx("Output:");
 private static final java.lang.String $0="RSortingRadixsort.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] radixSort(netrexx.lang.Rexx tlist[]){
  netrexx.lang.Rexx maxn=null;
  netrexx.lang.Rexx minn=null;
  netrexx.lang.Rexx maxl=null;
  netrexx.lang.Rexx px=null;
  netrexx.lang.Rexx bukits=null;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx cval=null;
  netrexx.lang.Rexx digit=null;
  netrexx.lang.Rexx intermediates=null;
  netrexx.lang.Rexx bi=null;
  netrexx.lang.Rexx iw=null;
  
  // scale the array to start at zero to allow handling of -ve values
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(getLimits(tlist),$01,$1);
  maxn=$1[0];minn=$1[1];maxl=$1[2];}
  tlist=rescale(tlist,minn);
  
  {netrexx.lang.Rexx $2=$03.OpMinus(null);boolean $3=$2.OpGtEq(null,$04);px=maxl.OpPlus(null);px:for(;$3?px.OpLtEq(null,$02):px.OpGtEq(null,$02);px=px.OpAdd(null,$2)){
   bukits=netrexx.lang.Rexx.toRexx("");
   {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(tlist.length).OpSub(null,$03);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$4);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
    cval=tlist[ix.toint()].right(maxl,new netrexx.lang.Rexx((byte)0));
    {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
    $5[1]=px;
    netrexx.lang.RexxParse.parse(cval,$05,$5);
    digit=$5[2];}
    bukits.getnode(digit).leaf=(bukits.getnode(digit).leaf).OpCcblank(null,(cval.OpAdd(null,$04))); // simulates a stack
    }
   }/*ix*/
   intermediates=netrexx.lang.Rexx.toRexx("");
   {bi=new netrexx.lang.Rexx((byte)0);bi:for(;bi.OpLtEq(null,$06);bi=bi.OpAdd(null,new netrexx.lang.Rexx(1))){
    intermediates=intermediates.OpCcblank(null,bukits.getnode(bi).leaf); // sumulates unstack
    }
   }/*bi*/
   // reload array
   {netrexx.lang.Rexx $6=intermediates.words();iw=new netrexx.lang.Rexx((byte)1);iw:for(;iw.OpLtEq(null,$6);iw=iw.OpAdd(null,new netrexx.lang.Rexx(1))){
    tlist[iw.OpSub(null,$03).toint()]=intermediates.word(iw);
    }
   }/*iw*/
   }
  }/*px*/
  
  // restore the array to original scale
  tlist=rescale(tlist,minn.OpMinus(null));
  return tlist;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx[] rescale(netrexx.lang.Rexx arry[],netrexx.lang.Rexx newbase){
  netrexx.lang.Rexx ix=null;
  {netrexx.lang.Rexx $7=new netrexx.lang.Rexx(arry.length).OpSub(null,$03);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$7);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   arry[ix.toint()]=(arry[ix.toint()]).OpSub(null,newbase);
   }
  }/*ix*/
  return arry;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getLimits(netrexx.lang.Rexx arry[]){
  netrexx.lang.Rexx maxn;
  netrexx.lang.Rexx minn;
  netrexx.lang.Rexx maxl;
  netrexx.lang.Rexx i_=null;
  maxn=new netrexx.lang.Rexx((byte)0);
  minn=new netrexx.lang.Rexx((byte)0);
  maxl=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $8=new netrexx.lang.Rexx(arry.length).OpSub(null,$03);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$8);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   maxn=maxn.max(arry[i_.toint()]);
   minn=minn.min(arry[i_.toint()]);
   }
  }/*i_*/
  maxl=(maxn.OpSub(null,minn)).length();
  return (maxn.OpCcblank(null,minn)).OpCcblank(null,maxl);
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx lists[][];
  netrexx.lang.Rexx il=null;
  netrexx.lang.Rexx tlist[]=null;
  lists=new netrexx.lang.Rexx[][]{new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx((byte)45),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)66),new netrexx.lang.Rexx((byte)75),new netrexx.lang.Rexx((short)170),$07.OpMinus(null),$08.OpMinus(null),new netrexx.lang.Rexx((short)1066),new netrexx.lang.Rexx((short)666)},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((short)170),new netrexx.lang.Rexx((byte)45),new netrexx.lang.Rexx((byte)75),new netrexx.lang.Rexx((byte)90),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx((short)802),new netrexx.lang.Rexx((byte)66)},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0)},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)10)},new netrexx.lang.Rexx[]{$09.OpMinus(null),$010.OpMinus(null),$011.OpMinus(null),$012.OpMinus(null),$011.OpMinus(null),$013.OpMinus(null),$014.OpMinus(null),$015.OpMinus(null),$016.OpMinus(null),$03.OpMinus(null),$04.OpMinus(null)},new netrexx.lang.Rexx[]{$04.OpMinus(null),$03.OpMinus(null),$016.OpMinus(null),$015.OpMinus(null),$014.OpMinus(null),$013.OpMinus(null),$017.OpMinus(null),$012.OpMinus(null),$011.OpMinus(null),$010.OpMinus(null),$09.OpMinus(null)},new netrexx.lang.Rexx[]{$09.OpMinus(null),$018.OpMinus(null),$019.OpMinus(null),$020.OpMinus(null),$019.OpMinus(null),$021.OpMinus(null),$022.OpMinus(null),$023.OpMinus(null),$024.OpMinus(null),$025.OpMinus(null),$026.OpMinus(null)},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0),$04.OpMinus(null),$03.OpMinus(null),$016.OpMinus(null),$015.OpMinus(null),$014.OpMinus(null),$013.OpMinus(null),$017.OpMinus(null),$012.OpMinus(null),$011.OpMinus(null),$010.OpMinus(null),$09.OpMinus(null)},new netrexx.lang.Rexx[]{$09.OpMinus(null),$010.OpMinus(null),$011.OpMinus(null),$012.OpMinus(null),$011.OpMinus(null),$013.OpMinus(null),$014.OpMinus(null),$015.OpMinus(null),$016.OpMinus(null),$03.OpMinus(null),$04.OpMinus(null),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)10)}};
  
  
  
  
  
  
  
  
  
  
  
  {netrexx.lang.Rexx $9=new netrexx.lang.Rexx(lists.length).OpSub(null,$03);il=new netrexx.lang.Rexx((byte)0);il:for(;il.OpLtEq(null,$9);il=il.OpAdd(null,new netrexx.lang.Rexx(1))){
   tlist=lists[il.toint()];
   netrexx.lang.RexxIO.Say($027.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(java.util.Arrays.asList((java.lang.Object[])tlist)))));
   netrexx.lang.RexxIO.Say($028.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(java.util.Arrays.asList((java.lang.Object[])(radixSort(tlist)))))));
   netrexx.lang.RexxIO.Say("");
   }
  }/*il*/
  return;
  }
 
 private RSortingRadixsort(){return;}
 }
