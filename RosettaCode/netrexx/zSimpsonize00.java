/* Generated from 'zSimpsonize00.nrx' 3 Jan 2013 09:39:12 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class zSimpsonize00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(4);
 private static final java.lang.String $0="zSimpsonize00.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a_=null;
  netrexx.lang.Rexx b_=null;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  a_=$2[0];b_=$2[1];n_=$2[2];}
  if (a_.OpEq($1,$03)|a_.OpEq($1,$04)) 
   a_=new netrexx.lang.Rexx((byte)2);
  if (b_.OpEq($1,$03)|b_.OpEq($1,$04)) 
   b_=new netrexx.lang.Rexx((byte)6);
  if (n_.OpEq($1,$03)|n_.OpEq($1,$04)) 
   n_=new netrexx.lang.Rexx((byte)2);
  
  netrexx.lang.RexxIO.Say(simpson1(a_,b_,n_));
  return;
  }

 /*
  * h := (b - a) / n
  * sum1 := f(a + h/2)
  * sum2 := 0
  *
  * loop on i from 1 to (n - 1)
  *     sum1 := sum1 + f(a + h * i + h/2)
  *     sum2 := sum2 + f(a + h * i)
  * 
  * answer := (h / 6) * (f(a) + f(b) + 4*sum1 + 2*sum2)
  */
 
 public static netrexx.lang.Rexx simpson1(netrexx.lang.Rexx a_,netrexx.lang.Rexx b_,netrexx.lang.Rexx n_){
  netrexx.lang.Rexx area;
  netrexx.lang.Rexx h_;
  netrexx.lang.Rexx sum1;
  netrexx.lang.Rexx sum2;
  netrexx.lang.Rexx i_=null;
  area=new netrexx.lang.Rexx((byte)0);
  h_=((b_.OpSub($1,a_))).OpDiv($1,n_);
  sum1=f(a_.OpAdd($1,h_.OpDiv($1,$05)));
  sum2=new netrexx.lang.Rexx((byte)0);
  
  {netrexx.lang.Rexx $3=n_.OpSub($1,$06);i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq($1,$3);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum1=sum1.OpAdd($1,f(a_.OpAdd($1,h_.OpMult($1,i_)).OpAdd($1,h_.OpDiv($1,$05))));
   sum2=sum2.OpAdd($1,f(a_.OpAdd($1,h_.OpMult($1,i_))));
   }
  }/*i_*/
  area=((h_.OpDiv($1,$07))).OpMult($1,((f(a_)).OpAdd($1,f(b_)).OpAdd($1,$08.OpMult($1,sum1)).OpAdd($1,$05.OpMult($1,sum2))));
  return area;
  }

 
 public static netrexx.lang.Rexx f(netrexx.lang.Rexx n){
  return n;
  }
 
 private zSimpsonize00(){return;}
 }
