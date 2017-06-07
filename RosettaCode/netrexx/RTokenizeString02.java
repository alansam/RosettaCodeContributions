/* Generated from 'RTokenizeString02.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RTokenizeString02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx(".\000");
 private static final java.lang.String $0="RTokenizeString02.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String inStringArray[];
  java.lang.String aWord=null;
  inStringArray=(new java.lang.String("Hello,How,Are,You,Today")).split(",");
  {int $3=0;java.lang.String[] $2=new java.lang.String[inStringArray.length];synchronized(inStringArray){for(;;){if($3==$2.length)break;$2[$3]=inStringArray[inStringArray.length-1-$3];$3++;}}aWord:for(;;){if(--$3<0)break;aWord=(java.lang.String)$2[$3];
   netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(aWord)).strip()).OpCc(null,$01));
   }
  }/*aWord*/
  netrexx.lang.RexxIO.Say("");
  return;}
 
 private RTokenizeString02(){return;}
 }
