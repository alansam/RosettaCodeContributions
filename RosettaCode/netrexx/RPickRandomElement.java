/* Generated from 'RPickRandomElement.nrx' 17 Oct 2012 11:55:33 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RPickRandomElement{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RPickRandomElement.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx iArray[];
  java.util.List iList;
  netrexx.lang.Rexx iWords;
  netrexx.lang.Rexx v1=null;
  java.lang.Object v2=null;
  netrexx.lang.Rexx v3=null;
  iArray=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5)}; // a traditional array
  iList=java.util.Arrays.asList((java.lang.Object[])iArray); // a Java Collection "List" object
  iWords=netrexx.lang.Rexx.toRexx("1 2 3 4 5"); // a list as a string
  
  {int $1=$01.OpPlus(null).toint();for(;$1>0;$1--){
   v1=iArray[(new java.util.Random()).nextInt(iArray.length)];
   v2=iList.get((new java.util.Random()).nextInt(iList.size()));
   v3=iWords.word(new netrexx.lang.Rexx((new java.util.Random()).nextInt((iWords.words()).toint())).OpAdd(null,$02)); // the index for word() starts at one 
   
   netrexx.lang.RexxIO.Say((v1.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(v2)))).OpCcblank(null,v3));
   }
  }
  return;}
 
 private RPickRandomElement(){return;}
 }
