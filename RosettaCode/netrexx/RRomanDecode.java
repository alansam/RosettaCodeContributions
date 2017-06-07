/* Generated from 'RRomanDecode.nrx' 12 Jul 2011 23:32:28 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer.
 * You don't need to validate the form of the Roman numeral.
 * <p>
 * Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately,
 * starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC)
 * and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in
 * descending order.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Roman_numerals/Decode">rosettacode.org/wiki/Roman_numerals/Decode</a>
 */

/* 1449    1944    1954   1990  2008   1066  1666    1966    1999    2011 */

public class RRomanDecode{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final char[] $05={4,1,1,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RRomanDecode.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx years;
  int y_=0;
  years=new netrexx.lang.Rexx("MCDXLIX MCMXLIV MCMLIV MCMXC MMVIII MLXVI MDCLXVI MCMLXVI MCMXCIX MMXI");
  
  {int $1=(years.words()).toint();y_=1;y_:for(;y_<=$1;y_++){
   netrexx.lang.RexxIO.Say(((years.word(new netrexx.lang.Rexx(y_)).right(new netrexx.lang.Rexx((byte)10))).OpCc(null,$01)).OpCcblank(null,new netrexx.lang.Rexx(decode(years.word(new netrexx.lang.Rexx(y_))))));
   }
  }/*y_*/
  
  return;
  }

 
 public static int decode(netrexx.lang.Rexx arg) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx roman=null;
  int decnum;
  int d_=0;
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg.upper(),$02,$2);
  roman=$2[0];}
  if ((roman.verify(netrexx.lang.Rexx.toRexx("MDCLXVI"))).OpNotEq(null,$03)) 
   throw new java.lang.IllegalArgumentException();
  
  // always insert the value of the least significant numeral
  decnum=rchar(roman.substr(roman.length(),new netrexx.lang.Rexx((byte)1)));
  {int $3=(roman.length()).OpSub(null,$04).toint();d_=1;d_:for(;d_<=$3;d_++){
   if ((rchar(roman.substr(new netrexx.lang.Rexx(d_),new netrexx.lang.Rexx((byte)1))))<(rchar(roman.substr(new netrexx.lang.Rexx(d_+1),new netrexx.lang.Rexx((byte)1))))) 
    {
     // Handle cases where numerals are not in descending order
     //   subtract the value of the numeral
     decnum=decnum-(rchar(roman.substr(new netrexx.lang.Rexx(d_),new netrexx.lang.Rexx((byte)1))));
    }
   else 
    {
     // Normal case
     //   add the value of the numeral
     decnum=decnum+(rchar(roman.substr(new netrexx.lang.Rexx(d_),new netrexx.lang.Rexx((byte)1))));
    }
   }
  }/*d_*/
  
  return decnum;
  }

 
 public static int rchar(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ch=null;
  int digit=0;
  
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg.upper(),$05,$4);
  ch=$4[0];}
  {/*select*/
  if (ch.OpEqS(null,new netrexx.lang.Rexx('M')))
   digit=1000;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('D')))
   digit=500;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('C')))
   digit=100;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('L')))
   digit=50;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('X')))
   digit=10;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('V')))
   digit=5;
  else if (ch.OpEqS(null,new netrexx.lang.Rexx('I')))
   digit=1;
  else{
   digit=0;
  }
  }
  
  return digit;
  }
 
 private RRomanDecode(){return;}
 }
