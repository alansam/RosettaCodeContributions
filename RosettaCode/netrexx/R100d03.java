/* Generated from 'R100d03.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class R100d03{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("is open\n");
 private static final java.lang.String $0="R100d03.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String resultstring;
  int i_=0;
  resultstring="";
  
  {i_=1;i_:for(;i_<=10;i_++){
   resultstring=netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx(resultstring+"Door Nr.").OpCcblank(null,(new netrexx.lang.Rexx(i_*i_)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$01));
   }
  }/*i_*/
  
  netrexx.lang.RexxIO.Say(resultstring);
  return;}
 
 private R100d03(){return;}
 }
