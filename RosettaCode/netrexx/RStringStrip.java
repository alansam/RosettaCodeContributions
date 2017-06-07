/* Generated from 'RStringStrip.nrx' 22 Aug 2011 12:43:20 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RStringStrip{
 private static final java.lang.String $0="RStringStrip.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say(stripchars(netrexx.lang.Rexx.toRexx("She was a soul stripper. She took my heart!"),netrexx.lang.Rexx.toRexx("aei")));
  
  return;
  }

 
 public static netrexx.lang.Rexx stripchars(netrexx.lang.Rexx haystack,netrexx.lang.Rexx chs){
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx needle=null;
  
  {netrexx.lang.Rexx $1=chs.length();c_=new netrexx.lang.Rexx((byte)1);c_:for(;c_.OpLtEq(null,$1);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   needle=chs.substr(c_,new netrexx.lang.Rexx((byte)1));
   haystack=haystack.changestr(needle,netrexx.lang.Rexx.toRexx(""));
   }
  }/*c_*/
  
  return haystack;
  }
 
 private RStringStrip(){return;}
 }
