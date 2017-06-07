/* Generated from 'RArrayConcat.nrx' 29 Apr 2013 10:58:34 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RArrayConcat{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RArrayConcat.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx cymru[];
  netrexx.lang.Rexx dlm;
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx yorks[];
  netrexx.lang.Rexx y_=null;
  java.util.ArrayList merge;
  java.lang.Object merged[];
  netrexx.lang.Rexx m_=null;
  cymru=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Ogof Ffynnon Ddu"),netrexx.lang.Rexx.toRexx("Ogof Draenen")};
  
  dlm=$01.copies(new netrexx.lang.Rexx((byte)40));
  
  netrexx.lang.RexxIO.Say(dlm);
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(cymru.length).OpSub(null,$02);c_=new netrexx.lang.Rexx((byte)0);c_:for(;c_.OpLtEq(null,$1);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(c_.OpCcblank(null,cymru[c_.toint()]));
   }
  }/*c_*/
  
  yorks=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Malham Tarn Pot"),netrexx.lang.Rexx.toRexx("Greygill Hole")};
  
  netrexx.lang.RexxIO.Say(dlm);
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(yorks.length).OpSub(null,$02);y_=new netrexx.lang.Rexx((byte)0);y_:for(;y_.OpLtEq(null,$2);y_=y_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(y_.OpCcblank(null,yorks[y_.toint()]));
   }
  }/*y_*/
  
  merge=new java.util.ArrayList();
  merge.addAll((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])cymru)));
  merge.addAll((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])yorks)));
  
  netrexx.lang.RexxIO.Say(dlm);
  merged=merge.toArray();
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(merged.length).OpSub(null,$02);m_=new netrexx.lang.Rexx((byte)0);m_:for(;m_.OpLtEq(null,$3);m_=m_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(m_.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(merged[m_.toint()]))));
   }
  }/*m_*/
  return;}
 
 private RArrayConcat(){return;}
 }
