/* Generated from 'RCountInFactors.nrx' 8 Nov 2013 13:32:39 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCountInFactors{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final char[] $06={1,10,1,0,0};
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final char[] $08={2,1,44,10,1,0,1,10,1,1,0};
 private static final char[] $09={2,1,58,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("to");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RCountInFactors.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx factor(netrexx.lang.Rexx val){
  netrexx.lang.Rexx rv;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx m_=null;
  rv=new netrexx.lang.Rexx((byte)1);
  if (val.OpGt(null,$01)) 
   {
    rv=netrexx.lang.Rexx.toRexx("");
    {n_=val.OpPlus(null);boolean $1=true;n_:for(;;){if($1){$1=false;}else{if(n_.OpEq(null,$01))break;n_=n_.OpAdd(null,new netrexx.lang.Rexx(1));}
     {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(checkFactor(2,n_.tolong(),rv),$02,$2);
     n_=$2[0];rv=$2[1];}
     if (n_.OpEq(null,$01)) 
      break n_;
     {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(checkFactor(3,n_.tolong(),rv),$02,$3);
     n_=$3[0];rv=$3[1];}
     if (n_.OpEq(null,$01)) 
      break n_;
     {netrexx.lang.Rexx $4=n_;netrexx.lang.Rexx $5=$03;m_=new netrexx.lang.Rexx((byte)5);boolean $6=true;m_:for(;;){if($6){$6=false;}else{if(n_.OpEq(null,$01))break;m_=m_.OpAdd(null,$5);if(!(m_.OpLtEq(null,$4)))break;}
      if (m_.OpRem(null,$04).OpEq(null,$05)) 
       continue m_;
      {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[2];
      netrexx.lang.RexxParse.parse(checkFactor(m_.tolong(),n_.tolong(),rv),$02,$7);
      n_=$7[0];rv=$7[1];}
      }
     }/*m_*/
     }
    }/*n_*/
   }
  return rv;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx checkFactor(long mult,long n_,netrexx.lang.Rexx fac){
  java.lang.String msym;
  msym="x";
  {for(;;){if(!((n_%mult)==0))break;
   fac=(fac.OpCcblank(null,netrexx.lang.Rexx.toRexx(msym))).OpCcblank(null,new netrexx.lang.Rexx(mult));
   n_=n_/mult;
   }
  }
  fac=(fac.strip()).strip(new netrexx.lang.Rexx('l'),netrexx.lang.Rexx.toRexx(msym)).space();
  return new netrexx.lang.Rexx(n_).OpCcblank(null,fac);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tests=null;
  netrexx.lang.Rexx pair=null;
  netrexx.lang.Rexx lv=null;
  netrexx.lang.Rexx rv=null;
  netrexx.lang.Rexx fv=null;
  netrexx.lang.Rexx fac=null;
  netrexx.lang.Rexx pv=null;
  // input is a list of pairs of numbers - no checking is done
  // pairs of numbers, each number in the pair separated by a colon, each pair separated by a comma
  {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$06,$8);
  tests=$8[0];}
  if (tests.OpEq(null,$07)) 
   tests=netrexx.lang.Rexx.toRexx("1:11,    89:101,    1000:1020,    10000:10010");
  {for(;;){if(!tests.OpNotEq(null,$07))break;
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(tests,$08,$9);
   pair=$9[0];tests=$9[1];}
   {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(pair,$09,$10);
   lv=$10[0];rv=$10[2];}
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say($010.copies(new netrexx.lang.Rexx((byte)60)));
   netrexx.lang.RexxIO.Say(((lv.right(new netrexx.lang.Rexx((byte)8))).OpCcblank(null,$011)).OpCcblank(null,rv));
   netrexx.lang.RexxIO.Say($010.copies(new netrexx.lang.Rexx((byte)60)));
   {netrexx.lang.Rexx $11=rv;fv=lv.OpPlus(null);fv:for(;fv.OpLtEq(null,$11);fv=fv.OpAdd(null,new netrexx.lang.Rexx(1))){
    fac=factor(fv);
    pv=netrexx.lang.Rexx.toRexx("");
    if ((fac.words()).OpEq(null,$01)&fac.OpNotEq(null,$01)) 
     pv=netrexx.lang.Rexx.toRexx("<prime>");
    netrexx.lang.RexxIO.Say((((fv.right(new netrexx.lang.Rexx((byte)8))).OpCcblank(null,$012)).OpCcblank(null,fac)).OpCcblank(null,pv));
    }
   }/*fv*/
   }
  }
  return;
  }
 
 private RCountInFactors(){return;}
 }
