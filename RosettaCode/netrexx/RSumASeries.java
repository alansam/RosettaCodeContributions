/* Generated from 'RSumASeries.nrx' 22 Aug 2011 11:20:15 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSumASeries{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((short)1000);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RSumASeries.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx s_=null;
  sum=new netrexx.lang.Rexx("0.0");
  {s_=new netrexx.lang.Rexx((byte)1);s_:for(;s_.OpLtEq($1,$02);s_=s_.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd($1,f(s_));
   }
  }/*s_*/
  
  netrexx.lang.RexxIO.Say(sum);
  
  return;
  }

 
 public static netrexx.lang.Rexx f(netrexx.lang.Rexx x){
  
  return $04.OpDiv($1,x.OpPow($1,$03));
  }
 
 private RSumASeries(){return;}
 }
