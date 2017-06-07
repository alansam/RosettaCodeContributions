/* Generated from 'RSumDigitsOfInt02.nrx' 20 Jul 2012 12:38:18 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RSumDigitsOfInt02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(',');
 private static final char[] $04={4,1,1,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RSumDigitsOfInt02.nrx";
 
 public static void main(java.lang.String $0s[]){
  int inputs[][];
  int i_=0;
  int in=0;
  int ib=0;
  netrexx.lang.Rexx dSum=null;
  inputs=new int[][]{new int[]{1234,10},new int[]{octal("01234"),8},new int[]{254,16},new int[]{3854,16},new int[]{0,2},new int[]{172,2},new int[]{octal("077"),8}}; // test data
  {int $1=inputs.length-1;i_=0;i_:for(;i_<=$1;i_++){
   in=inputs[i_][0];
   ib=inputs[i_][1];
   dSum=sumDigits(in,ib);
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Sum of digits for integer \""+java.lang.Integer.toString(in,ib)+"\" for a given base of \""+ib+"\":").OpCcblank(null,dSum)).OpCc(null,$01));
   // Carry the exercise to it's logical conclusion and sum the results to give a single digit in range 0-9
   {for(;;){if(!new netrexx.lang.Rexx((dSum.length()).OpGt(null,$02)).OpAnd(null,dSum.datatype(new netrexx.lang.Rexx('n'))))break;
    dSum=sumDigits(dSum.toint(),10);
    netrexx.lang.RexxIO.Say(($03.OpCcblank(null,dSum)).OpCc(null,$01));
    }
   }
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  return;}

 // Sum digits of an integer
 
 public static netrexx.lang.Rexx sumDigits(int val){
  return sumDigits(val,10);
  }
 public static netrexx.lang.Rexx sumDigits(int val,int base){
  netrexx.lang.Rexx rVal;
  netrexx.lang.Rexx sVal;
  netrexx.lang.Rexx dv=null;
  java.lang.NumberFormatException ex=null;
  rVal=new netrexx.lang.Rexx(0);
  sVal=new netrexx.lang.Rexx(java.lang.Integer.toString(val,base));
  {int $2=(sVal.length()).OpPlus(null).toint();digs:for(;$2>0;$2--){
   // loop to extract digits from input and sum them
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(sVal,$04,$3);
   dv=$3[0];sVal=$3[1];}
   {try{
    rVal=rVal.OpAdd(null,new netrexx.lang.Rexx(java.lang.Integer.valueOf(dv.toString(),base).intValue()));
   }
   catch (java.lang.NumberFormatException $4){ex=$4;
    rVal=netrexx.lang.Rexx.toRexx("NumberFormatException:"+" "+ex.getMessage());
    break digs;
   }}
   }
  }/*digs*/
  return rVal;
  }

 // if there's a way to insert octal constants into an int in NetRexx I don't remember it
 
 private static final int octal(java.lang.String oVal) throws java.lang.NumberFormatException{
  int iVal;
  iVal=java.lang.Integer.valueOf(oVal,8).intValue();
  return iVal;
  }
 
 private RSumDigitsOfInt02(){return;}
 }
