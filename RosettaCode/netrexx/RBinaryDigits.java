/* Generated from 'RBinaryDigits.nrx' 10 May 2013 17:43:05 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RBinaryDigits{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RBinaryDigits.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 
 public static netrexx.lang.Rexx getBinaryDigits(netrexx.lang.Rexx nr){
  netrexx.lang.Rexx bd;
  bd=nr.d2x().x2b().strip(new netrexx.lang.Rexx('L'),new netrexx.lang.Rexx((byte)0));
  //bd = bd.insert(0, 0, bd.length() = 0)
  if ((bd.length()).OpEq(null,$01)) 
   bd=new netrexx.lang.Rexx((byte)0);
  return bd;
  }

 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx list=null;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx w_=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$02,$1);
  list=$1[0];}
  if (list.OpEq(null,$03)) 
   list=netrexx.lang.Rexx.toRexx("0 5 50 9000");
  {netrexx.lang.Rexx $2=list.words();n_=new netrexx.lang.Rexx((byte)1);n_:for(;n_.OpLtEq(null,$2);n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
   w_=list.word(n_);
   netrexx.lang.RexxIO.Say(((w_.right(new netrexx.lang.Rexx((byte)20))).OpCc(null,$04)).OpCcblank(null,getBinaryDigits(w_)));
   }
  }/*n_*/
  return;
  }
 
 private RBinaryDigits(){return;}
 }
