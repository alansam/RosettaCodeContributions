/* Generated from 'RSumDigitsOfInt01.nrx' 20 Jul 2012 12:38:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RSumDigitsOfInt01{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("0,2");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('1');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("77, 8");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("0xf0e, 10");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final char[] $08={2,1,44,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("\":");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(',');
 private static final char[] $012={1,10,3,0,1,2,0};
 private static final char[] $013={4,1,1,10,1,0,1,10,1,1,0};
 private static final char[] $014={4,1,2,10,1,0,3,0,10,1,1,4,1,1,10,1,2,3,0,10,1,1,2,2,48,120,10,1,1,2,1,44,10,2,3,1,3,0,10,1,1,2,1,48,10,1,1,2,1,44,10,2,4,1,3,0,10,1,1,1,10,2,5,1,0};
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("0x");
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx('0');
 private static final java.lang.String $0="RSumDigitsOfInt01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx input=null;
  netrexx.lang.Rexx inputs[];
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx in=null;
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx base=null;
  netrexx.lang.Rexx dSum=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  input=$1[0];}
  inputs=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("1234"),netrexx.lang.Rexx.toRexx("01234"),netrexx.lang.Rexx.toRexx("0xfe"),netrexx.lang.Rexx.toRexx("0xf0e"),new netrexx.lang.Rexx('0'),netrexx.lang.Rexx.toRexx("00"),$02.OpCcblank(null,$03),netrexx.lang.Rexx.toRexx("070"),$04.OpCcblank(null,$05),netrexx.lang.Rexx.toRexx("070, 16"),netrexx.lang.Rexx.toRexx("0xf0e, 36"),netrexx.lang.Rexx.toRexx("000999ABCXYZ, 36"),netrexx.lang.Rexx.toRexx("ff, 16"),netrexx.lang.Rexx.toRexx("f, 10"),netrexx.lang.Rexx.toRexx("z, 37")}; // test data
  if ((input.length()).OpGt(null,$06)) 
   inputs=new netrexx.lang.Rexx[]{input}; // replace test data with user input
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(inputs.length).OpSub(null,$07);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$2);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   in=inputs[i_.toint()];
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(in,$08,$3);
   val=$3[0];base=$3[2];}
   dSum=sumDigits(val,base);
   netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx.toRexx("Sum of digits for integer \"").OpCc(null,val)).OpCc(null,netrexx.lang.Rexx.toRexx("\" for a given base of \""))).OpCc(null,base)).OpCc(null,$09)).OpCcblank(null,dSum)).OpCc(null,$010));
   // Carry the exercise to it's logical conclusion and sum the results to give a single digit in range 0-9
   {for(;;){if(!new netrexx.lang.Rexx((dSum.length()).OpGt(null,$07)).OpAnd(null,dSum.datatype(new netrexx.lang.Rexx('n'))))break;
    dSum=sumDigits(dSum,new netrexx.lang.Rexx((byte)10));
    netrexx.lang.RexxIO.Say(($011.OpCcblank(null,dSum)).OpCc(null,$010));
    }
   }
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  return;}

 // Sum digits of an integer
 
 public static netrexx.lang.Rexx sumDigits(netrexx.lang.Rexx val){
  return sumDigits(val,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx sumDigits(netrexx.lang.Rexx val,netrexx.lang.Rexx base){
  netrexx.lang.Rexx rVal;
  netrexx.lang.Rexx dv=null;
  java.lang.NumberFormatException ex=null;
  
  rVal=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(normalizeValue(val,base),$012,$4);
  val=$4[0];base=$4[1];}
  {int $5=(val.length()).OpPlus(null).toint();digs:for(;$5>0;$5--){
   // loop to extract digits from input and sum them
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(val,$013,$6);
   dv=$6[0];val=$6[1];}
   {try{
    rVal=rVal.OpAdd(null,new netrexx.lang.Rexx(java.lang.Integer.valueOf(dv.toString(),base.toint()).intValue()));
   }
   catch (java.lang.NumberFormatException $7){ex=$7;
    rVal=netrexx.lang.Rexx.toRexx("NumberFormatException:").OpCcblank(null,netrexx.lang.Rexx.toRexx(ex.getMessage()));
    break digs;
   }}
   }
  }/*digs*/
  return rVal;
  }

 // Clean up the input, normalize the data and determine which base to use
 
 private static netrexx.lang.Rexx normalizeValue(netrexx.lang.Rexx inV){
  return normalizeValue(inV,netrexx.lang.Rexx.toRexx(""));
  }
 private static netrexx.lang.Rexx normalizeValue(netrexx.lang.Rexx inV,netrexx.lang.Rexx base){
  netrexx.lang.Rexx xpref=null;
  netrexx.lang.Rexx opref=null;
  netrexx.lang.Rexx xval=null;
  netrexx.lang.Rexx oval=null;
  netrexx.lang.Rexx dval=null;
  netrexx.lang.Rexx inval=null;
  netrexx.lang.Rexx rVal;
  inV=inV.strip(new netrexx.lang.Rexx('l'));
  base=base.strip();
  {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[6];
  netrexx.lang.RexxParse.parse(inV,$014,$8);
  xpref=$8[0];opref=$8[2];xval=$8[3];oval=$8[4];dval=$8[5];}
  
  
  
  
  
  {/*select*/
  if (xpref.OpEq(null,$015)&(base.length()).OpEq(null,$06))
   {
    // value starts with '0x' and no base supplied.  Assign hex as base
    inval=xval;
    base=new netrexx.lang.Rexx((byte)16);
   }
  else if (opref.OpEq(null,$016)&(base.length()).OpEq(null,$06))
   {
    // value starts with '0' and no base supplied.  Assign octal as base
    inval=oval;
    base=new netrexx.lang.Rexx((byte)8);
   }
  else{
   {
    inval=dval;
   }
  }
  }
  if ((base.length()).OpEq(null,$06)) 
   base=new netrexx.lang.Rexx((byte)10); // base not set.  Assign decimal as base
  if ((inval.length()).OpLtEq(null,$06)) 
   inval=new netrexx.lang.Rexx((byte)0); // boundary condition.  Invalid input or a single zero
  rVal=inval.OpCcblank(null,base);
  
  return rVal;
  }
 
 private RSumDigitsOfInt01(){return;}
 }
