/* Generated from 'RFibonacciList.nrx' 21 May 2013 17:16:37 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RFibonacciList{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)5000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(']');
 private static final char[] $06={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RFibonacciList.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx[] fibonacciList(netrexx.lang.Rexx size){
  netrexx.lang.Rexx fibs[];
  netrexx.lang.Rexx n_=null;
  fibs=new netrexx.lang.Rexx[size.OpAdd($1,$02).toint()];
  fibs[0]=new netrexx.lang.Rexx((byte)0);
  fibs[1]=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $2=size;n_=new netrexx.lang.Rexx((byte)2);n_:for(;n_.OpLtEq($1,$2);n_=n_.OpAdd($1,new netrexx.lang.Rexx(1))){
   fibs[n_.toint()]=(fibs[n_.OpSub($1,$02).toint()]).OpAdd($1,fibs[n_.OpSub($1,$03).toint()]);
   }
  }/*n_*/
  return fibs;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx showList(netrexx.lang.Rexx fibList[]){
  netrexx.lang.Rexx as;
  netrexx.lang.Rexx v_=null;
  as=netrexx.lang.Rexx.toRexx("");
  {int $5=0;netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[fibList.length];synchronized(fibList){for(;;){if($5==$4.length)break;$4[$5]=fibList[fibList.length-1-$5];$5++;}}v_:for(;;){if(--$5<0)break;v_=(netrexx.lang.Rexx)$4[$5];
   as=as.OpCcblank($1,v_);
   }
  }/*v_*/
  return ($04.OpCc($1,(as.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','))).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", ")))).OpCc($1,$05);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx fibList[];
  {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$06,$6);
  n_=$6[0];}
  if (n_.OpEq($1,$07)) 
   n_=new netrexx.lang.Rexx((byte)100);
  fibList=fibonacciList(n_);
  netrexx.lang.RexxIO.Say(showList(fibList));
  return;
  }
 
 private RFibonacciList(){return;}
 }
