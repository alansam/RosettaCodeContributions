/* Generated from 'RFloydTriangle03.nrx' 18 Jul 2012 10:57:34 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */

/*REXX program constructs & displays Floyd's triangle for any number of rows.*/

public class RFloydTriangle03{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RFloydTriangle03.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx numRows=null;
  netrexx.lang.Rexx maxVal;
  int digit;
  int row=0;
  int col=0;
  java.lang.String output=null;
  netrexx.lang.Rexx colMaxDigit=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  numRows=$1[0];}
  if (numRows.OpEqS(null,$02)) 
   numRows=new netrexx.lang.Rexx((byte)1); // assume 1 row is not given
  maxVal=numRows.OpMult(null,(numRows.OpAdd(null,$03))).OpDivI(null,$04); // calculate the max value.
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("displaying a").OpCcblank(null,numRows)).OpCcblank(null,netrexx.lang.Rexx.toRexx("row Floyd\'s triangle:")));
  netrexx.lang.RexxIO.Say("");
  digit=1;
  {int $2=numRows.OpPlus(null).toint();row=1;row:for(;$2>0;$2--,row++){
   col=0;
   output="";
   {int $3=row;digit:for(;$3>0;$3--,digit++){
    col++;
    colMaxDigit=maxVal.OpSub(null,numRows).OpAdd(null,new netrexx.lang.Rexx(col));
    output=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(output).OpCcblank(null,(new netrexx.lang.Rexx(digit)).right(colMaxDigit.length())));
    }
   }/*digit*/
   netrexx.lang.RexxIO.Say(output);
   }
  }/*row*/
  return;}
 
 private RFloydTriangle03(){return;}
 }
