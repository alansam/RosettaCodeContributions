/* Generated from 'RFloydTriangle02.nrx' 17 Jul 2012 16:25:44 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */

/*REXX program constructs & displays Floyd's triangle for any H of rows.*/

public class RFloydTriangle02{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RFloydTriangle02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rows=null;
  netrexx.lang.Rexx mV;
  int H;
  int r=0;
  int i=0;
  java.lang.String _=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  rows=$1[0];}
  if (rows.OpEqS(null,$02)) 
   rows=new netrexx.lang.Rexx((byte)1);/*assume 1 row is not given*/
  mV=rows.OpMult(null,(rows.OpAdd(null,$03))).OpDivI(null,$04);/*calculate the max value. */
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("displaying a").OpCcblank(null,rows)).OpCcblank(null,netrexx.lang.Rexx.toRexx("row Floyd\'s triangle:")));
  netrexx.lang.RexxIO.Say("");
  H=1;
  {int $2=rows.OpPlus(null).toint();r=1;r:for(;$2>0;$2--,r++){
   i=0;
   _="";
   {int $3=r;H:for(;$3>0;$3--,H++){
    i++;
    _=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(_).OpCcblank(null,sright(new netrexx.lang.Rexx(H),slength(mV.OpSub(null,rows).OpAdd(null,new netrexx.lang.Rexx(i))))));
    }
   }/*H*/
   netrexx.lang.RexxIO.Say(_);
   }
  }/*r*/
  return;}
 
 private static netrexx.lang.Rexx sright(netrexx.lang.Rexx strng,netrexx.lang.Rexx len){
  return sright(strng,len,netrexx.lang.Rexx.toRexx(" "));
  }
 private static netrexx.lang.Rexx sright(netrexx.lang.Rexx strng,netrexx.lang.Rexx len,netrexx.lang.Rexx pad){
  return strng.right(len,pad);
  }
 
 private static netrexx.lang.Rexx slength(netrexx.lang.Rexx strng){
  return strng.length();
  }
 
 private RFloydTriangle02(){return;}
 }
