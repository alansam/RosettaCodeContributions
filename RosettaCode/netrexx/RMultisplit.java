/* Generated from 'RMultisplit.nrx' 22 Jul 2011 00:54:08 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// "a" (!=) "" (==) "b" (=) "" (!=) "c"

public class RMultisplit{
 private static final char[] $01={2,2,33,61,10,1,0,2,2,61,61,10,1,1,2,1,61,10,1,2,2,2,33,61,10,1,3,1,10,1,4,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("<p>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("</p> <p>");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("</p>");
 private static final java.lang.String $0="RMultisplit.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx teststring;
  netrexx.lang.Rexx p1=null;
  netrexx.lang.Rexx p2=null;
  netrexx.lang.Rexx p3=null;
  netrexx.lang.Rexx p4=null;
  netrexx.lang.Rexx p5=null;
  teststring=netrexx.lang.Rexx.toRexx("a!===b=!=c");
  
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[5];
  netrexx.lang.RexxParse.parse(teststring,$01,$1);
  p1=$1[0];p2=$1[1];p3=$1[2];p4=$1[3];p5=$1[4];}
  
  netrexx.lang.RexxIO.Say(((((((((($02.OpCc(null,p1)).OpCc(null,$03)).OpCc(null,p2)).OpCc(null,$03)).OpCc(null,p3)).OpCc(null,$03)).OpCc(null,p4)).OpCc(null,$03)).OpCc(null,p5)).OpCc(null,$04));
  return;}
 
 private RMultisplit(){return;}
 }
