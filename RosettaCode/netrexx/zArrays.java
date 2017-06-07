/* Generated from 'zArrays.nrx' 14 Aug 2012 21:07:09 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class zArrays{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("arry[");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("]=");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx(", \000");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("stem[");
 private static final java.lang.String $0="zArrays.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nums;
  netrexx.lang.Rexx arry[];
  netrexx.lang.Rexx stem;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx x=null;
  nums=netrexx.lang.Rexx.toRexx("90 47 58 29 22 32 55 5 55 73");
  arry=new netrexx.lang.Rexx[(nums.words()).OpAdd(null,$01).toint()]; // define a zero based array
  stem=netrexx.lang.Rexx.toRexx(""); // initialize a Rexx indexed string
  
  {netrexx.lang.Rexx $1=nums.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   arry[i.toint()]=nums.word(i);
   stem.getnode(i).leaf=nums.word(i);
   }
  }/*i*/
  netrexx.lang.RexxIO.Say("");
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(arry.length).OpSub(null,$01);x=new netrexx.lang.Rexx((byte)0);x:for(;x.OpLtEq(null,$2);x=x.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((($02.OpCc(null,x)).OpCc(null,$03)).OpCc(null,netrexx.lang.Rexx.toRexx(java.lang.String.valueOf((java.lang.Object)(arry[x.toint()]))))).OpCc(null,$04));
   }
  }/*x*/
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("");
  {netrexx.lang.Rexx $3=nums.words();x=new netrexx.lang.Rexx((byte)1);x:for(;x.OpLtEq(null,$3);x=x.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((($05.OpCc(null,x)).OpCc(null,$03)).OpCc(null,stem.getnode(x).leaf)).OpCc(null,$04));
   }
  }/*x*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private zArrays(){return;}
 }
