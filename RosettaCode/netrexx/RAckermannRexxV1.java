/* Generated from 'RAckermannRexxV1.nrx' 12 Feb 2013 18:42:41 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RAckermannRexxV1{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)66);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RAckermannRexxV1.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx j_=null;
  netrexx.lang.Rexx k_=null;
  int m_=0;
  int n_=0;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  j_=$2[0];k_=$2[1];}
  if ((j_.OpEq($1,$03)|j_.OpEq($1,$04))|(j_.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)) 
   j_=new netrexx.lang.Rexx((byte)3);
  if ((k_.OpEq($1,$03)|k_.OpEq($1,$04))|(k_.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)) 
   k_=new netrexx.lang.Rexx((byte)5);
  
  {int $3=j_.toint();m_=0;m_:for(;m_<=$3;m_++){
   netrexx.lang.RexxIO.Say("");
   {int $4=k_.toint();n_=0;n_:for(;n_<=$4;n_++){
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("ackermann("+m_+","+n_+") =").OpCcblank($1,ackermann(new netrexx.lang.Rexx(m_),new netrexx.lang.Rexx(n_)).right(new netrexx.lang.Rexx((byte)5))));
    }
   }/*n_*/
   }
  }/*m_*/
  return;
  }

 
 public static netrexx.lang.Rexx ackermann(netrexx.lang.Rexx m,netrexx.lang.Rexx n){
  netrexx.lang.Rexx rval=null;
  {/*select*/
  if (m.OpEq($1,$05))
   rval=n.OpAdd($1,$06);
  else if (n.OpEq($1,$05))
   rval=ackermann(m.OpSub($1,$06),new netrexx.lang.Rexx((byte)1));
  else{
   rval=ackermann(m.OpSub($1,$06),ackermann(m,n.OpSub($1,$06)));
  }
  }
  return rval;
  }
 
 private RAckermannRexxV1(){return;}
 }
