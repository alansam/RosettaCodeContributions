/* Generated from 'RSortingSleepsort00.nrx' 28 Mar 2013 16:00:12 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





// =============================================================================

public class RSortingSleepsort00{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={1,10,2,0,1,0};
 private static final java.lang.String $0="RSortingSleepsort00.nrx";
  private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(250);
 /* properties constant */
 protected static final netrexx.lang.Rexx dflt=netrexx.lang.Rexx.toRexx("-6 3 1 4 5 2 3 -7 1 6 001 3 -9 2 5 -009 -8 4 6 1 9 8 7 6 5 -7 3 4 5 2 0 -2 -1 -5 -4 -3 -0 000 0");
 /* properties indirect */
 private java.util.concurrent.CountDownLatch startLatch;
 private java.util.concurrent.CountDownLatch doneLatch;
 private netrexx.lang.Rexx floor=new netrexx.lang.Rexx((byte)0);
 private java.util.List sorted;

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx iHarry[];
  netrexx.lang.Rexx oHarry[];
  arg=new netrexx.lang.Rexx(args);
  if (arg.OpEq(null,$01)) 
   arg=dflt;
  iHarry=list2array(arg);
  netrexx.lang.RexxIO.Say(array2list(iHarry));
  oHarry=(new RSortingSleepsort00()).sleepSort(iHarry);
  netrexx.lang.RexxIO.Say(array2list(oHarry));
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private netrexx.lang.Rexx[] sleepSort(netrexx.lang.Rexx iHarry[]){
  netrexx.lang.Rexx oHarry[];
  netrexx.lang.Rexx mn=null;
  netrexx.lang.Rexx nn=null;
  java.lang.InterruptedException ix=null;
  netrexx.lang.Rexx sn=null;
  oHarry=new netrexx.lang.Rexx[iHarry.length];
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[iHarry.length];synchronized(iHarry){for(;;){if($3==$2.length)break;$2[$3]=iHarry[iHarry.length-1-$3];$3++;}}mn:for(;;){if(--$3<0)break;mn=(netrexx.lang.Rexx)$2[$3];
   setFloor(getFloor().min(mn)); // save smallest -ve number so we can use it as a scale
   }
  }/*mn*/
  setStartLatch(new java.util.concurrent.CountDownLatch(1)); // used to put all threads on hold until we're ready to start
  setDoneLatch(new java.util.concurrent.CountDownLatch(iHarry.length)); // used to indicate all work is done
  {int $6=0;netrexx.lang.Rexx[] $5=new netrexx.lang.Rexx[iHarry.length];synchronized(iHarry){for(;;){if($6==$5.length)break;$5[$6]=iHarry[iHarry.length-1-$6];$6++;}}nn:for(;;){if(--$6<0)break;nn=(netrexx.lang.Rexx)$5[$6];
   (new java.lang.Thread((java.lang.Runnable)(new RSortingSleepsort00.SortThread(nn)))).start(); // loop through input and create a thread for each element
   }
  }/*nn*/
  getStartLatch().countDown(); // cry 'Havoc', and let slip the dogs of war.
  {try{
   getDoneLatch().await(); // wait for worker threads to complete
  }
  catch (java.lang.InterruptedException $7){ix=$7;
   ix.printStackTrace();
  }}
  {netrexx.lang.Rexx $8=new netrexx.lang.Rexx(getSorted().size()).OpSub(null,$02);sn=new netrexx.lang.Rexx((byte)0);sn:for(;sn.OpLtEq(null,$8);sn=sn.OpAdd(null,new netrexx.lang.Rexx(1))){
   oHarry[sn.toint()]=(netrexx.lang.Rexx)(getSorted().get(sn.toint())); // collect results
   }
  }/*sn*/
  return oHarry;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx[] list2array(netrexx.lang.Rexx lst){
  netrexx.lang.Rexx harry[];
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx nm=null;
  harry=new netrexx.lang.Rexx[(lst.words()).toint()];
  {ix=new netrexx.lang.Rexx((byte)0);ix:for(;;ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){if(!lst.OpNotEq(null,$01))break;
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(lst,$03,$9);
   nm=$9[0];lst=$9[1];}
   harry[ix.toint()]=nm;
   }
  }/*ix*/
  return harry;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx array2list(netrexx.lang.Rexx arry[]){
  netrexx.lang.Rexx lst;
  netrexx.lang.Rexx nn=null;
  lst=netrexx.lang.Rexx.toRexx("");
  {int $12=0;netrexx.lang.Rexx[] $11=new netrexx.lang.Rexx[arry.length];synchronized(arry){for(;;){if($12==$11.length)break;$11[$12]=arry[arry.length-1-$12];$12++;}}nn:for(;;){if(--$12<0)break;nn=(netrexx.lang.Rexx)$11[$12];
   lst=lst.OpCcblank(null,nn);
   }
  }/*nn*/
  return lst.strip();
  }
 
 public java.util.concurrent.CountDownLatch getStartLatch(){return startLatch;}
 
 public void setStartLatch(java.util.concurrent.CountDownLatch $13){startLatch=$13;return;}
 
 public java.util.concurrent.CountDownLatch getDoneLatch(){return doneLatch;}
 
 public void setDoneLatch(java.util.concurrent.CountDownLatch $14){doneLatch=$14;return;}
 
 public netrexx.lang.Rexx getFloor(){return floor;}
 
 public void setFloor(netrexx.lang.Rexx $15){floor=$15;return;}
 
 public java.util.List getSorted(){return sorted;}
 
 public void setSorted(java.util.List $16){sorted=$16;return;}
 
 public RSortingSleepsort00(){return;}

// =============================================================================
 
 class SortThread implements java.lang.Runnable{
  private final transient java.lang.String $0="RSortingSleepsort00.nrx";
  /* properties indirect */
  private netrexx.lang.Rexx num;

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public SortThread(netrexx.lang.Rexx nm){super();
   this.setNum(nm);
   return;
   }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public void run(){
   netrexx.lang.Rexx wait=null;
   java.lang.InterruptedException ie=null;
   if ((RSortingSleepsort00.this.getSorted())==null) 
    RSortingSleepsort00.this.setSorted((java.util.List)(new java.util.concurrent.CopyOnWriteArrayList()));
   {try{
    RSortingSleepsort00.this.getStartLatch().await(); // wait until all threads are constructed
    wait=(this.getNum()).OpAdd(null,RSortingSleepsort00.this.getFloor().abs()); // shifted by value of smallest -ve (allows -ve values to be sorted)
    wait=wait.OpMult(null,$04); // scale up; milliseconds are not granular enough
    java.lang.Thread.sleep(wait.tolong()); // wait for this number's turn to run
    RSortingSleepsort00.this.getSorted().add((java.lang.Object)num); // stow the number in the results List
    RSortingSleepsort00.this.getDoneLatch().countDown(); // this one's done; decrement the latch
   }
   catch (java.lang.InterruptedException $1){ie=$1;
    ie.printStackTrace();
   }}
   return;
   }
  
  public netrexx.lang.Rexx getNum(){return num;}
  
  public void setNum(netrexx.lang.Rexx $2){num=$2;return;}
 }}
