/* Generated from 'RArithmatic.nrx' 22 Aug 2011 16:57:06 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RArithmatic{
 private static final char[] $01={1,10,2,0,1,0};
 private static final java.lang.String $0="RArithmatic.nrx";
 
 public static void main(java.lang.String $0s[]){
  int a=0;
  int b=0;
  
  
  netrexx.lang.RexxIO.Say("enter 2 integer values separated by blanks");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  a=$1[0].toint();b=$1[1].toint();}
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(a)+" "+"+"+" "+b+" "+"="+" "+(a+b));
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(a)+" "+"-"+" "+b+" "+"="+" "+(a-b));
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(a)+" "+"*"+" "+b+" "+"="+" "+(a*b));
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(a)+" "+"/"+" "+b+" "+"="+" "+(a/b)+" "+"remaining"+" "+(a%b)+" "+"(sign from first operand)");
  netrexx.lang.RexxIO.Say(java.lang.String.valueOf(a)+" "+"^"+" "+b+" "+"="+" "+netrexx.lang.RexxUtil.floatPow((double)a,(int)b));
  
  return;
  }
 
 private RArithmatic(){return;}
 }
