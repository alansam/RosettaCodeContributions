/* Generated from 'RIntegerSequence02.nrx' 19 Jul 2012 16:36:10 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RIntegerSequence02{
 private static final java.lang.String $0="RIntegerSequence02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx k_=null;
  int bigDigits;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  bigDigits=999999999; // Maximum setting for digits allowed by NetRexx
  $1.setDigits(new netrexx.lang.Rexx(bigDigits));
  
  {k_=new netrexx.lang.Rexx((byte)0);k_:for(;;k_=k_.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(k_);
   }
  }/*k_*/
  }
 
 private RIntegerSequence02(){return;}
 }
