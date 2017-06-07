/* Generated from 'RStringIsNumeric.nrx' 26 Aug 2012 13:06:10 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RStringIsNumeric{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("Java method RStringIsNumeric.nrx");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("NetRexx 3.01 23 Aug 2012");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((short)200);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RStringIsNumeric.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx vv=null;
  netrexx.lang.Rexx nv;
  netrexx.lang.Rexx zzz;
  netrexx.lang.Rexx i_;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$2);
  ss=$2[0];}
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($03,$02,$3);
  vv=$3[0];}
  netrexx.lang.RexxIO.Say(ss);
  netrexx.lang.RexxIO.Say(vv);
  
  $1.setDigits($04);
  nv=netrexx.lang.Rexx.toRexx("Not numeric");
  nv.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("Numeric");
  zzz=new netrexx.lang.Rexx('?');
  i_=new netrexx.lang.Rexx((byte)0);
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" -123.78 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("-123.78");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=new netrexx.lang.Rexx('2');
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=new netrexx.lang.Rexx('2');
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=new netrexx.lang.Rexx((byte)2);
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("000000000004");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("+5");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" +6 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" + 7 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" - 8 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" - .9");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("- 19.");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(".7");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("2e+3");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=new netrexx.lang.Rexx("47e+567");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("2e-3");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("1.2e+1");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" .2E+6");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" 2.e+5 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("       +1.2E+0002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("       +1.2e+002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" +0000001.200e+002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" - 000001.200e+002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" - 000008.201e-00000000000000002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx(" - 000008.201e-000000002 ");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("NaN");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  zzz.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("infinity");
  i_=i_.OpAdd($1,$05);
  zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  
  {netrexx.lang.Rexx $4=zzz.getnode(new netrexx.lang.Rexx((byte)0)).leaf;i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq($1,$4);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((zzz.getnode(i_).leaf.right(new netrexx.lang.Rexx((byte)36))).OpCcblank($1,nv.getnode(zzz.getnode(i_).leaf.datatype(new netrexx.lang.Rexx('N'))).leaf));
   }
  }/*i_*/
  return;}
 
 private RStringIsNumeric(){return;}
 }
