/* Generated from 'termpgm_main.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

public class termpgm_main{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)5);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="termpgm_main.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx i_=null;
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq($1,$02);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((i_.right(new netrexx.lang.Rexx((byte)3))).OpCc($1,$03)).OpCcblank($1,termpgm.term(i_)));
   }
  }/*i_*/
  return;
  }
 
 private termpgm_main(){return;}
 }