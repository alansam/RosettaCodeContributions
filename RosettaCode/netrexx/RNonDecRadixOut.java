/* Generated from 'RNonDecRadixOut.nrx' 18 Feb 2013 19:23:20 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.Formatter;

/* NetRexx */





public class RNonDecRadixOut{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)3);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((short)20000);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((short)2131);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("[Base 16=");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx(",Base 10=");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx(",Base 8=");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx(",Base 2=");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RNonDecRadixOut.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx n_=null;
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$01);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $1=$04;n_=$02.OpPlus(null);n_:for(;n_.OpLtEq(null,$03);n_=n_.OpAdd(null,$1)){
    {/*select*/
    if (i_.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
     netrexx.lang.RexxIO.Say(useBif(n_));
    else if (i_.OpEqS(null,new netrexx.lang.Rexx((byte)2)))
     netrexx.lang.RexxIO.Say(useJavaFormat(n_));
    else if (i_.OpEqS(null,new netrexx.lang.Rexx((byte)3)))
     netrexx.lang.RexxIO.Say(useJavaNumber(n_));
    else{
     ;
    }
    }
    }
   }/*n_*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  
  return;
  }

 // NetRexx deosn't have a decimal to octal conversion
 
 public static netrexx.lang.Rexx useBif(netrexx.lang.Rexx n_){
  netrexx.lang.Rexx d_;
  d_=new netrexx.lang.Rexx('_');
  return ((((((($05.OpCc(null,n_.d2x().right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$06)).OpCc(null,n_.right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$07)).OpCc(null,d_.right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$08)).OpCc(null,n_.d2x().x2b().right(new netrexx.lang.Rexx((byte)20)))).OpCc(null,$09);
  }

 // Some of Java's java.lang.Number classes have conversion methods
 
 public static netrexx.lang.Rexx useJavaNumber(netrexx.lang.Rexx n_){
  java.lang.String nx;
  java.lang.String nd;
  java.lang.String no;
  java.lang.String nb;
  nx=java.lang.Long.toHexString(n_.tolong());
  nd=java.lang.Long.toString(n_.tolong());
  no=java.lang.Long.toOctalString(n_.tolong());
  nb=java.lang.Long.toBinaryString(n_.tolong());
  return ((((((($05.OpCc(null,(new netrexx.lang.Rexx(nx)).right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$06)).OpCc(null,(new netrexx.lang.Rexx(nd)).right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$07)).OpCc(null,(new netrexx.lang.Rexx(no)).right(new netrexx.lang.Rexx((byte)8)))).OpCc(null,$08)).OpCc(null,(new netrexx.lang.Rexx(nb)).right(new netrexx.lang.Rexx((byte)20)))).OpCc(null,$09);
  }

 // Java Formatter doesn't have a decimal to binary conversion
 
 public static netrexx.lang.Rexx useJavaFormat(netrexx.lang.Rexx n_){
  java.lang.StringBuilder fb;
  java.util.Formatter fm;
  fb=new java.lang.StringBuilder();
  fm=new Formatter((java.lang.Appendable)fb);
  fm.format("[Base 16=%1$8x,Base 10=%1$8d,Base 8=%1$8o,Base 2=%2$20s]",new java.lang.Object[]{(java.lang.Object)(new java.lang.Long(netrexx.lang.Rexx.toString(n_))),(java.lang.Object)(new java.lang.String("_"))});
  return netrexx.lang.Rexx.toRexx(fb.toString());
  }
 
 private RNonDecRadixOut(){return;}
 }
