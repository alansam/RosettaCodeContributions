/* Generated from 'RPrimalityByTrialDivision.nrx' 7 Nov 2013 19:53:38 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RPrimalityByTrialDivision{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx((byte)6);
 private static final char[] $08={1,10,1,0,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("");
 private static final char[] $010={2,1,44,10,1,0,1,10,1,1,0};
 private static final char[] $011={2,1,58,10,1,0,1,10,2,1,2,0};
 private static final char[] $012={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RPrimalityByTrialDivision.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isPrime(netrexx.lang.Rexx val){
  boolean btrue;
  boolean bfalse;
  boolean valIsPrime=false;
  netrexx.lang.Rexx kv=null;
  btrue=(1==1);
  bfalse=new netrexx.lang.Rexx(btrue).OpNot(null);
  
  {/*select*/
  if (val.OpLtEq(null,$01))
   valIsPrime=bfalse;
  else if (val.OpEq(null,$02)||val.OpEq(null,$03)||val.OpEq(null,$04)||val.OpEq(null,$05))
   valIsPrime=btrue;
  else if (val.OpRem(null,$02).OpEq(null,$06)||val.OpRem(null,$03).OpEq(null,$06)||val.OpRem(null,$04).OpEq(null,$06)||val.OpRem(null,$05).OpEq(null,$06))
   valIsPrime=bfalse;
  else{
   {
    valIsPrime=btrue;
    {netrexx.lang.Rexx $1=$07;kv=new netrexx.lang.Rexx((byte)5);boolean $2=true;kv:for(;;){if($2){$2=false;}else{if(kv.OpPow(null,$02).OpGt(null,val))break;kv=kv.OpAdd(null,$1);}
     if (val.OpRem(null,kv).OpEq(null,$06)|val.OpRem(null,(kv.OpAdd(null,$02))).OpEq(null,$06)) 
      {
       valIsPrime=bfalse;
       break kv;
      }
     }
    }/*kv*/
   }
  }
  }
  
  return valIsPrime;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samples=null;
  netrexx.lang.Rexx lrv=null;
  netrexx.lang.Rexx pair=null;
  netrexx.lang.Rexx lv=null;
  netrexx.lang.Rexx rv=null;
  netrexx.lang.Rexx pt=null;
  netrexx.lang.Rexx ip=null;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$08,$3);
  samples=$3[0];}
  if (samples.OpEq(null,$09)) 
   samples=netrexx.lang.Rexx.toRexx("0:11, 89:101, 1000:1020, 10000:10040");
  {for(;;){if(!samples.OpNotEq(null,$09))break;
   lrv=new netrexx.lang.Rexx((byte)0);
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(samples,$010,$4);
   pair=$4[0];samples=$4[1];}
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(pair,$011,$5);
   lv=$5[0];rv=$5[1];}
   if (rv.OpEq(null,$09)) 
    rv=lv;
   if (lv.OpGt(null,rv)) 
    {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse((lv.OpCcblank(null,rv)),$012,$6);
    rv=$6[0];lv=$6[1];} // left > right so swap the order
   if (new netrexx.lang.Rexx(((lv.datatype(new netrexx.lang.Rexx('w'))).OpAnd(null,rv.datatype(new netrexx.lang.Rexx('w'))))).OpNot(null)) 
    throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx("Values must be whole numbers:").OpCcblank(null,lv)).OpCcblank(null,rv)));
   if (rv.OpEq(null,$09)|rv.OpEq(null,$013)) 
    rv=lv;
   lrv=lrv.max(rv.strip().length());
   {netrexx.lang.Rexx $7=rv;pt=lv.OpPlus(null);pt:for(;pt.OpLtEq(null,$7);pt=pt.OpAdd(null,new netrexx.lang.Rexx(1))){
    if (isPrime(pt)) 
     ip=netrexx.lang.Rexx.toRexx("<prime>");
    else 
     ip=netrexx.lang.Rexx.toRexx(RPrimeDecomposition.decompose(pt).toString());
    netrexx.lang.RexxIO.Say(((pt.right(lrv)).OpCc(null,$014)).OpCcblank(null,ip));
    }
   }/*pt*/
   netrexx.lang.RexxIO.Say("");
   }
  }
  return;
  }
 
 private RPrimalityByTrialDivision(){return;}
 }
