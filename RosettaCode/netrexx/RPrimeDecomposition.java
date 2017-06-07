/* Generated from 'RPrimeDecomposition.nrx' 7 Nov 2013 19:53:38 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RPrimeDecomposition{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final char[] $07={1,10,1,0,0};
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("");
 private static final char[] $09={2,1,44,10,1,0,1,10,1,1,0};
 private static final char[] $010={2,1,58,10,1,0,1,10,2,1,2,0};
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RPrimeDecomposition.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List decompose(netrexx.lang.Rexx val){
  java.util.ArrayList dc;
  netrexx.lang.Rexx rv=null;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx m_=null;
  netrexx.lang.Rexx w_=null;
  dc=new java.util.ArrayList();
  {/*select*/
  if (new netrexx.lang.Rexx(val.OpGt($1,$02)).OpAnd($1,val.datatype(new netrexx.lang.Rexx('w'))))
   {
    rv=netrexx.lang.Rexx.toRexx("");
    {n_=val.OpPlus($1);boolean $2=true;n_:for(;;){if($2){$2=false;}else{if(n_.OpEq($1,$02))break;n_=n_.OpAdd($1,new netrexx.lang.Rexx(1));}
     {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(checkFactor(new netrexx.lang.Rexx((byte)2),n_,rv),$03,$3);
     n_=$3[0];rv=$3[1];}
     if (n_.OpEq($1,$02)) 
      break n_;
     {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(checkFactor(new netrexx.lang.Rexx((byte)3),n_,rv),$03,$4);
     n_=$4[0];rv=$4[1];}
     if (n_.OpEq($1,$02)) 
      break n_;
     {netrexx.lang.Rexx $5=n_;netrexx.lang.Rexx $6=$04;m_=new netrexx.lang.Rexx((byte)5);boolean $7=true;m_:for(;;){if($7){$7=false;}else{if(n_.OpEq($1,$02))break;m_=m_.OpAdd($1,$6);if(!(m_.OpLtEq($1,$5)))break;}
      if (m_.OpRem($1,$05).OpEq($1,$06)) 
       continue m_;
      {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[2];
      netrexx.lang.RexxParse.parse(checkFactor(m_,n_,rv),$03,$8);
      n_=$8[0];rv=$8[1];}
      }
     }/*m_*/
     }
    }/*n_*/
    dc=new java.util.ArrayList();
    {netrexx.lang.Rexx $9=rv.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq($1,$9);w_=w_.OpAdd($1,new netrexx.lang.Rexx(1))){
     dc.add((java.lang.Object)(rv.word(w_)));
     }
    }/*w_*/
   }
  else if (val.OpEq($1,$06)||val.OpEq($1,$02))
   {
    dc.add((java.lang.Object)val);
   }
  else{
   {
    throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx("Argument is expected to be a +ve integer.  Argument provided was").OpCcblank($1,val)));
   }
  }
  }
  return (java.util.List)dc;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx checkFactor(netrexx.lang.Rexx mult,netrexx.lang.Rexx n_,netrexx.lang.Rexx fac){
  {for(;;){if(!n_.OpRem($1,mult).OpEq($1,$06))break;
   fac=fac.OpCcblank($1,mult);
   n_=n_.OpDivI($1,mult);
   }
  }
  fac=fac.space();
  return n_.OpCcblank($1,fac);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samples=null;
  netrexx.lang.Rexx pair=null;
  netrexx.lang.Rexx lv=null;
  netrexx.lang.Rexx rv=null;
  netrexx.lang.Rexx rvl=null;
  netrexx.lang.Rexx fv=null;
  java.util.List dc=null;
  netrexx.lang.Rexx pv=null;
  {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$07,$10);
  samples=$10[0];}
  if (samples.OpEq($1,$08)) 
   samples=netrexx.lang.Rexx.toRexx("1:11, 89:101, 1000:1020, 10000:10040");
  {for(;;){if(!samples.OpNotEq($1,$08))break;
   {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(samples,$09,$11);
   pair=$11[0];samples=$11[1];}
   {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(pair,$010,$12);
   lv=$12[0];rv=$12[1];}
   if (rv.OpEq($1,$08)|rv.OpEq($1,$011)) 
    rv=lv;
   rvl=rv.length();
   if (rvl.OpLt($1,$012)) 
    rvl=new netrexx.lang.Rexx((byte)6);
   rvl=rvl.OpAdd($1,$013);
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say($014.copies(new netrexx.lang.Rexx((byte)60)));
   netrexx.lang.RexxIO.Say(((lv.right(rvl)).OpCcblank($1,$015)).OpCcblank($1,rv));
   netrexx.lang.RexxIO.Say($014.copies(new netrexx.lang.Rexx((byte)60)));
   {netrexx.lang.Rexx $13=rv;fv=lv.OpPlus($1);fv:for(;fv.OpLtEq($1,$13);fv=fv.OpAdd($1,new netrexx.lang.Rexx(1))){
    dc=decompose(fv);
    pv=netrexx.lang.Rexx.toRexx("");
    if (new netrexx.lang.Rexx(dc.size()).OpEq($1,$02)&(((netrexx.lang.Rexx)(dc.get(0)))).OpNotEq($1,$02)) 
     pv=netrexx.lang.Rexx.toRexx("<prime>");
    netrexx.lang.RexxIO.Say((((fv.right(rvl)).OpCcblank($1,$016)).OpCcblank($1,netrexx.lang.Rexx.toRexx(dc.toString()))).OpCcblank($1,pv));
    }
   }/*fv*/
   }
  }
  return;
  }
 
 private RPrimeDecomposition(){return;}
 }
