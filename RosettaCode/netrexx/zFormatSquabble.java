/* Generated from 'zFormatSquabble.nrx' 26 Aug 2012 13:06:10 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class zFormatSquabble{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("Java method zFormatSquabble.nrx");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("NetRexx 3.01 23 Aug 2012");
 private static final java.lang.String $0="zFormatSquabble.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx vv=null;
  netrexx.lang.Rexx something;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  ss=$1[0];}
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($03,$02,$2);
  vv=$2[0];}
  netrexx.lang.RexxIO.Say(ss);
  netrexx.lang.RexxIO.Say(vv);
  
  something=netrexx.lang.Rexx.toRexx("");
  something.getnode(netrexx.lang.Rexx.toRexx("!I")).leaf=new netrexx.lang.Rexx((byte)3);
  something.getnode(netrexx.lang.Rexx.toRexx("!F")).leaf=new netrexx.lang.Rexx("3.0");
  
  netrexx.lang.RexxIO.Say(something.getnode(netrexx.lang.Rexx.toRexx("!I")).leaf.format((netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)0)));
  netrexx.lang.RexxIO.Say(something.getnode(netrexx.lang.Rexx.toRexx("!F")).leaf.format((netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)0)));
  return;}
 
 private zFormatSquabble(){return;}
 }

