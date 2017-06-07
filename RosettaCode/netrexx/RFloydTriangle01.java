/* Generated from 'RFloydTriangle01.nrx' 18 Jul 2012 18:04:44 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */

/* REXX ***************************************************************
* 12.07.2012 Walter Pachl  - translated from Python
**********************************************************************/

public class RFloydTriangle01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Rows:");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RFloydTriangle01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rowcount=null;
  int col;
  netrexx.lang.Rexx len;
  java.lang.String ll;
  netrexx.lang.Rexx j=null;
  int i=0;
  java.lang.String ol=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  rowcount=$1[0];}
  if ((rowcount.length()).OpEqS(null,$02)) 
   rowcount=new netrexx.lang.Rexx((byte)1);
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,rowcount));
  netrexx.lang.RexxIO.Say("");
  col=0;
  len=netrexx.lang.Rexx.toRexx("");
  ll=""; // last line of triangle
  {netrexx.lang.Rexx $2=rowcount.OpMult(null,(rowcount.OpAdd(null,$04))).OpDiv(null,$05);j=rowcount.OpMult(null,(rowcount.OpSub(null,$04))).OpDiv(null,$05).OpAdd(null,$04).OpPlus(null);j:for(;j.OpLtEq(null,$2);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   col++; // column number
   ll=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(ll).OpCcblank(null,j)); // build last line
   len.getnode(new netrexx.lang.Rexx(col)).leaf=j.length(); // remember length of column
   }
  }/*j*/
  {int $3=rowcount.OpSub(null,$04).toint();i=1;i:for(;i<=$3;i++){ // now do and output the rest
   ol="";
   col=0;
   {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(((float)(i*((i+1))))/((float)2));j=new netrexx.lang.Rexx((((float)(i*((i-1))))/((float)2))+((float)1));j:for(;j.OpLtEq(null,$4);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){ // elements of line i
    col++;
    ol=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(ol).OpCcblank(null,j.right(len.getnode(new netrexx.lang.Rexx(col)).leaf))); // element in proper length
    }
   }/*j*/
   netrexx.lang.RexxIO.Say(ol); // output ith line
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(ll); // output last line
  return;}
 
 private RFloydTriangle01(){return;}
 }
