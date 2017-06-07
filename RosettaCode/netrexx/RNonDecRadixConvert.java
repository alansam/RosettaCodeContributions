/* Generated from 'RNonDecRadixConvert.nrx' 18 Feb 2013 21:23:21 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */







public class RNonDecRadixConvert{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)200);
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final char[] $05={2,1,44,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("]:");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("[10] ==");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx(", radix:");
 private static final java.lang.String $0="RNonDecRadixConvert.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx input=null;
  netrexx.lang.Rexx inputs[];
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx in=null;
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx radix=null;
  netrexx.lang.Rexx valB=null;
  netrexx.lang.Rexx valD=null;
  java.lang.NumberFormatException nx=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  input=$2[0];} // input should be val, radix; no input results in using default test data
  // test data - number pairs where 1st is value and 2nd is target radix
  inputs=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("1234,         10"),netrexx.lang.Rexx.toRexx("01234,  8"),netrexx.lang.Rexx.toRexx("fe,  16"),netrexx.lang.Rexx.toRexx("f0e,   16"),netrexx.lang.Rexx.toRexx("0,            10"),netrexx.lang.Rexx.toRexx("00,     2"),netrexx.lang.Rexx.toRexx("11,   2"),netrexx.lang.Rexx.toRexx("070,    8"),netrexx.lang.Rexx.toRexx("77,            8"),netrexx.lang.Rexx.toRexx("f0e,   16"),netrexx.lang.Rexx.toRexx("070, 16"),netrexx.lang.Rexx.toRexx("0xf0e, 36"),netrexx.lang.Rexx.toRexx("000999ABCXYZ, 36"),netrexx.lang.Rexx.toRexx("ff,    36"),netrexx.lang.Rexx.toRexx("f,   16"),netrexx.lang.Rexx.toRexx("z,     37")};
  
  
  
  
  
  if ((input.length()).OpGt($1,$03)) 
   inputs=new netrexx.lang.Rexx[]{input}; // replace test data with user input
  
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(inputs.length).OpSub($1,$04);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq($1,$3);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   {try{
    in=inputs[i_.toint()];
    {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
    netrexx.lang.RexxParse.parse(in,$05,$4);
    val=$4[0];radix=$4[2];}
    valB=toDecimal(netrexx.lang.Rexx.toString(val),radix.toint()); // NetRexx default is to store digits as Rexx strings
    valD=fromDecimal(netrexx.lang.Rexx.toString(valB.OpAdd($1,$03)),radix.toint()); // Add zero just to prove the result treated as a number
    netrexx.lang.RexxIO.Say((((((((((val.right(new netrexx.lang.Rexx((byte)16))).OpCc($1,$06)).OpCc($1,radix.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$07)).OpCcblank($1,valB.right(new netrexx.lang.Rexx((byte)16)))).OpCc($1,$08)).OpCcblank($1,valD.right(new netrexx.lang.Rexx((byte)16)))).OpCc($1,$06)).OpCc($1,radix.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$09));
   }
   catch (java.lang.NumberFormatException $5){nx=$5;
    netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Error -- Input:").OpCcblank($1,val)).OpCc($1,$010)).OpCcblank($1,radix));
    nx.printStackTrace();
   }}
   }
  }/*i_*/
  
  return;
  }

 
 public static netrexx.lang.Rexx toDecimal(java.lang.String val){
  return toDecimal(val,new netrexx.lang.Rexx(10).toint());
  }
 public static netrexx.lang.Rexx toDecimal(java.lang.String val,int radix){
  java.math.BigInteger bi;
  bi=new java.math.BigInteger(val,radix);
  return netrexx.lang.Rexx.toRexx(bi.toString());
  }

 
 public static netrexx.lang.Rexx fromDecimal(java.lang.String val){
  return fromDecimal(val,new netrexx.lang.Rexx(10).toint());
  }
 public static netrexx.lang.Rexx fromDecimal(java.lang.String val,int radix){
  java.math.BigInteger bi;
  bi=new java.math.BigInteger(val.toString(),10);
  return netrexx.lang.Rexx.toRexx(bi.toString(radix));
  }
 
 private RNonDecRadixConvert(){return;}
 }
