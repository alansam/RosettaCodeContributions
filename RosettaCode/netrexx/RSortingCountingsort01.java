/* Generated from 'RSortingCountingsort01.nrx' 14 May 2013 10:04:15 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSortingCountingsort01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final char[] $04={1,10,1,0,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RSortingCountingsort01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static final netrexx.lang.Rexx countingSort(netrexx.lang.Rexx icounts){
  netrexx.lang.Rexx amin=null;
  netrexx.lang.Rexx amax=null;
  netrexx.lang.Rexx array;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx iw=null;
  netrexx.lang.Rexx ocounts;
  
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(getMinMax(icounts),$01,$1);
  amin=$1[0];amax=$1[1];}
  array=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=icounts.words();ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$2);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   iw=(icounts.word(ix)).OpAdd(null,$02);
   array.getnode(iw).leaf=(array.getnode(iw).leaf).OpAdd(null,$03);
   }
  }/*ix*/
  ocounts=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $3=amax;ix=amin.OpPlus(null);ix:for(;ix.OpLtEq(null,$3);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   if ((array.getnode(ix).leaf).OpEq(null,$02)) 
    continue ix;
   {int $4=(array.getnode(ix).leaf).OpPlus(null).toint();for(;$4>0;$4--){
    ocounts=ocounts.OpCcblank(null,ix);
    }
   }
   }
  }/*ix*/
  return ocounts.space();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static final netrexx.lang.Rexx getMinMax(netrexx.lang.Rexx icounts){
  long amin;
  long amax;
  netrexx.lang.Rexx x_=null;
  
  amin=java.lang.Long.MAX_VALUE;
  amax=java.lang.Long.MIN_VALUE;
  {netrexx.lang.Rexx $5=icounts.words();x_=new netrexx.lang.Rexx((byte)1);x_:for(;x_.OpLtEq(null,$5);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   amin=(icounts.word(x_).min(new netrexx.lang.Rexx(amin))).tolong();
   amax=(icounts.word(x_).max(new netrexx.lang.Rexx(amax))).tolong();
   }
  }/*x_*/
  
  return new netrexx.lang.Rexx(amin).OpCcblank(null,new netrexx.lang.Rexx(amax));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx icounts=null;
  {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$04,$6);
  icounts=$6[0];}
  if (icounts.OpEq(null,$05)) 
   icounts=(netrexx.lang.Rexx.toRexx(" 1    3   6   2   7  13  20  12  21  11  22  10  23   9  24   8  25  43  62  42").OpCcblank(null,netrexx.lang.Rexx.toRexx("63   41  18  42  17  43  16  44  15  45  14  46  79 113  78 114  77  39  78  38"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(" 0 -200  -6 -10  -0"));
  
  
  
  
  netrexx.lang.RexxIO.Say(icounts.space());
  netrexx.lang.RexxIO.Say(countingSort(icounts));
  
  return;
  }
 
 private RSortingCountingsort01(){return;}
 }
