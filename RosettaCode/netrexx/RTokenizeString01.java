/* Generated from 'RTokenizeString01.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/*NetRexx program *****************************************************
* 20.08.2012 Walter Pachl derived from REXX Version 3
**********************************************************************/

public class RTokenizeString01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RTokenizeString01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx sss;
  netrexx.lang.Rexx ss;
  netrexx.lang.Rexx i=null;
  sss=netrexx.lang.Rexx.toRexx("Hello,How,Are,You,Today");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("input string=").OpCc(null,sss));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Words in the string:");
  ss=sss.translate(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','));
  {netrexx.lang.Rexx $1=ss.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((ss.word(i)).OpCc(null,$01));
   }
  }/*i*/
  netrexx.lang.RexxIO.Say("End-of-list.");
  return;}
 
 private RTokenizeString01(){return;}
 }
