/* Generated from 'RSortingSleepsort.nrx' 28 Mar 2013 21:54:10 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



// =============================================================================

public class RSortingSleepsort{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx(" unsorted:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("   sorted:");
 private static final java.lang.String $0="RSortingSleepsort.nrx";
  private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(250);
 /* properties constant private */
 private static final netrexx.lang.Rexx dflt=netrexx.lang.Rexx.toRexx("-6 3 1 4 5 2 3 -7 1 6 001 3 -9 2 5 -009 -8 4 6 1 9 8 7 6 5 -7 3 4 5 2 0 -2 -1 -5 -4 -3 -0 000 0");
 /* properties indirect */
 private java.util.concurrent.CountDownLatch startLatch;
 private java.util.concurrent.CountDownLatch doneLatch;
 private netrexx.lang.Rexx floor=new netrexx.lang.Rexx((byte)0);
 private netrexx.lang.Rexx sorted=netrexx.lang.Rexx.toRexx("");

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  if (arg.OpEq(null,$01)) 
   arg=dflt;
  netrexx.lang.RexxIO.Say($02.OpCcblank(null,arg));
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,(new RSortingSleepsort()).sleepSort(arg)));
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx sleepSort(netrexx.lang.Rexx iArg){
  netrexx.lang.Rexx mn=null;
  java.lang.InterruptedException ix=null;
  setStartLatch(new java.util.concurrent.CountDownLatch(1)); // used to put all threads on hold until we're ready to run
  setDoneLatch(new java.util.concurrent.CountDownLatch((iArg.words()).toint())); // used to indicate all work is done
  {netrexx.lang.Rexx $1=iArg.words();mn=new netrexx.lang.Rexx((byte)1);mn:for(;mn.OpLtEq(null,$1);mn=mn.OpAdd(null,new netrexx.lang.Rexx(1))){
   setFloor(getFloor().min(iArg.word(mn))); // save smallest -ve number so we can use it as a scale for sleep
   (new java.lang.Thread((java.lang.Runnable)(new RSortingSleepsort.SortThread(iArg.word(mn))))).start(); // loop through input and create a thread for each element
   }
  }/*mn*/
  getStartLatch().countDown(); // cry 'Havoc', and let slip the dogs of war.
  {try{
   getDoneLatch().await(); // wait for worker threads to complete
  }
  catch (java.lang.InterruptedException $2){ix=$2;
   ix.printStackTrace();
  }}
  return getSorted();
  }
 
 public java.util.concurrent.CountDownLatch getStartLatch(){return startLatch;}
 
 public void setStartLatch(java.util.concurrent.CountDownLatch $3){startLatch=$3;return;}
 
 public java.util.concurrent.CountDownLatch getDoneLatch(){return doneLatch;}
 
 public void setDoneLatch(java.util.concurrent.CountDownLatch $4){doneLatch=$4;return;}
 
 public netrexx.lang.Rexx getFloor(){return floor;}
 
 public void setFloor(netrexx.lang.Rexx $5){floor=$5;return;}
 
 public netrexx.lang.Rexx getSorted(){return sorted;}
 
 public void setSorted(netrexx.lang.Rexx $6){sorted=$6;return;}
 
 public RSortingSleepsort(){return;}

// =============================================================================
 
 class SortThread implements java.lang.Runnable{
  private final transient java.lang.String $0="RSortingSleepsort.nrx";
  /* properties indirect */
  private netrexx.lang.Rexx num;

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public SortThread(netrexx.lang.Rexx nm){super();
   this.setNum(nm);
   return;
   }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public void run(){
   netrexx.lang.Rexx sleepTime=null;
   java.lang.InterruptedException ie=null;
   {try{
    RSortingSleepsort.this.getStartLatch().await(); // wait until all threads are constructed
    sleepTime=(this.getNum()).OpAdd(null,RSortingSleepsort.this.getFloor().abs()); // shifted by value of smallest number (permits numbers < 0)
    sleepTime=sleepTime.OpMult(null,$04); // scale up; milliseconds are not granular enough
    java.lang.Thread.sleep(sleepTime.tolong()); // wait for this number's turn to run
   }
   catch (java.lang.InterruptedException $1){ie=$1;
    ie.printStackTrace();
   }}
   synchronized(RSortingSleepsort.this){{ // lock the parent to prevent collisions
    RSortingSleepsort.this.setSorted(((RSortingSleepsort.this.getSorted()).OpCcblank(null,num)).strip()); // stow the number in the results List
   }}
   RSortingSleepsort.this.getDoneLatch().countDown(); // this one's done; decrement the latch
   return;
   }
  
  public netrexx.lang.Rexx getNum(){return num;}
  
  public void setNum(netrexx.lang.Rexx $2){num=$2;return;}
 }}
