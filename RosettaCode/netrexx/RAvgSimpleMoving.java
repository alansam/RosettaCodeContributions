/* Generated from 'RAvgSimpleMoving.nrx' 2 Jan 2013 21:37:59 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RAvgSimpleMoving{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx(", SMA =");
 private static final java.lang.String $0="RAvgSimpleMoving.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties private */
 private java.util.Queue window;
 private netrexx.lang.Rexx period;
 private netrexx.lang.Rexx sum;
 
 /* properties constant */
 protected static final netrexx.lang.Rexx exMsg=netrexx.lang.Rexx.toRexx("Period must be a positive integer");

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RAvgSimpleMoving(netrexx.lang.Rexx period_){super();
  if ((period_.datatype(new netrexx.lang.Rexx('w'))).OpNot($1)) 
   throw new java.lang.RuntimeException(netrexx.lang.Rexx.toString(exMsg));
  if (period_.OpLtEq($1,$02)) 
   throw new java.lang.RuntimeException(netrexx.lang.Rexx.toString(exMsg));
  window=(java.util.Queue)(new java.util.LinkedList());
  period=period_;
  sum=new netrexx.lang.Rexx((byte)0);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void newNum(netrexx.lang.Rexx num){
  netrexx.lang.Rexx rmv=null;
  sum=sum.OpAdd($1,num);
  window.add((java.lang.Object)num);
  if (new netrexx.lang.Rexx(window.size()).OpGt($1,period)) 
   {
    rmv=((netrexx.lang.Rexx)(window.remove()));
    sum=sum.OpSub($1,rmv);
   }
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx getAvg(){
  netrexx.lang.Rexx avg=null;
  if (window.isEmpty()) 
   {
    avg=new netrexx.lang.Rexx((byte)0);
   }
  else 
   {
    avg=sum.OpDiv($1,new netrexx.lang.Rexx(window.size()));
   }
  return avg;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void run_samples(java.lang.String args[]){
  netrexx.lang.Rexx testData[];
  netrexx.lang.Rexx windowSizes[];
  netrexx.lang.Rexx windSize=null;
  RAvgSimpleMoving ma=null;
  netrexx.lang.Rexx xVal=null;
  testData=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1)};
  windowSizes=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(3),new netrexx.lang.Rexx((byte)5)};
  {int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[windowSizes.length];synchronized(windowSizes){for(;;){if($4==$3.length)break;$3[$4]=windowSizes[windowSizes.length-1-$4];$4++;}}windSize:for(;;){if(--$4<0)break;windSize=(netrexx.lang.Rexx)$3[$4];
   ma=new RAvgSimpleMoving(windSize);
   {int $7=0;netrexx.lang.Rexx[] $6=new netrexx.lang.Rexx[testData.length];synchronized(testData){for(;;){if($7==$6.length)break;$6[$7]=testData[testData.length-1-$7];$7++;}}xVal:for(;;){if(--$7<0)break;xVal=(netrexx.lang.Rexx)$6[$7];
    ma.newNum(xVal);
    netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Next number =").OpCcblank($1,xVal.right(new netrexx.lang.Rexx((byte)5)))).OpCc($1,$03)).OpCcblank($1,ma.getAvg().format(new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)9))));
    }
   }/*xVal*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*windSize*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  run_samples(args);
  return;
  }
 }
