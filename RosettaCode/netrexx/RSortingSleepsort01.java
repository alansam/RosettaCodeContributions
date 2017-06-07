/* Generated from 'RSortingSleepsort01.nrx' 28 Mar 2013 16:11:10 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



// =============================================================================

public class RSortingSleepsort01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RSortingSleepsort01.nrx";
  private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(250);
 /* properties constant */
 protected static final netrexx.lang.Rexx dflt=netrexx.lang.Rexx.toRexx("-6 3 1 4 5 2 3 -7 1 6 001 3 -9 2 5 -009 -8 4 6 1 9 8 7 6 5 -7 3 4 5 2 0 -2 -1 -5 -4 -3 -0 000 0");
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
  netrexx.lang.RexxIO.Say(arg);
  netrexx.lang.RexxIO.Say((new RSortingSleepsort01()).sleepSort(arg));
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx sleepSort(netrexx.lang.Rexx iArg){
  netrexx.lang.Rexx mn=null;
  netrexx.lang.Rexx nn=null;
  java.lang.InterruptedException ix=null;
  {netrexx.lang.Rexx $1=iArg.words();mn=new netrexx.lang.Rexx((byte)1);mn:for(;mn.OpLtEq(null,$1);mn=mn.OpAdd(null,new netrexx.lang.Rexx(1))){
   nn=iArg.word(mn);
   setFloor(getFloor().min(nn)); // save smallest -ve number so we can use it as a scale
   }
  }/*mn*/
  setStartLatch(new java.util.concurrent.CountDownLatch(1)); // used to put all threads on hold until we're ready to start
  setDoneLatch(new java.util.concurrent.CountDownLatch((iArg.words()).toint())); // used to indicate all work is done
  {netrexx.lang.Rexx $2=iArg.words();mn=new netrexx.lang.Rexx((byte)1);mn:for(;mn.OpLtEq(null,$2);mn=mn.OpAdd(null,new netrexx.lang.Rexx(1))){
   nn=iArg.word(mn);
   (new java.lang.Thread((java.lang.Runnable)(new RSortingSleepsort01.SortThread(nn)))).start(); // loop through input and create a thread for each element
   }
  }/*mn*/
  getStartLatch().countDown(); // cry 'Havoc', and let slip the dogs of war.
  {try{
   getDoneLatch().await(); // wait for worker threads to complete
  }
  catch (java.lang.InterruptedException $3){ix=$3;
   ix.printStackTrace();
  }}
  return getSorted().strip();
  }
 
 public java.util.concurrent.CountDownLatch getStartLatch(){return startLatch;}
 
 public void setStartLatch(java.util.concurrent.CountDownLatch $4){startLatch=$4;return;}
 
 public java.util.concurrent.CountDownLatch getDoneLatch(){return doneLatch;}
 
 public void setDoneLatch(java.util.concurrent.CountDownLatch $5){doneLatch=$5;return;}
 
 public netrexx.lang.Rexx getFloor(){return floor;}
 
 public void setFloor(netrexx.lang.Rexx $6){floor=$6;return;}
 
 public netrexx.lang.Rexx getSorted(){return sorted;}
 
 public void setSorted(netrexx.lang.Rexx $7){sorted=$7;return;}
 
 public RSortingSleepsort01(){return;}

// =============================================================================
 
 class SortThread implements java.lang.Runnable{
  private final transient java.lang.String $0="RSortingSleepsort01.nrx";
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
   {try{
    RSortingSleepsort01.this.getStartLatch().await(); // wait until all threads are constructed
    wait=(this.getNum()).OpAdd(null,RSortingSleepsort01.this.getFloor().abs()); // shifted by value of smallest -ve (allows -ve values to be sorted)
    wait=wait.OpMult(null,$02); // scale up; milliseconds are not granular enough
    java.lang.Thread.sleep(wait.tolong()); // wait for this number's turn to run
    synchronized(RSortingSleepsort01.this){{ // lock the parent to prevent collisions
     RSortingSleepsort01.this.setSorted((RSortingSleepsort01.this.getSorted()).OpCcblank(null,num)); // stow the number in the results List
    }}
    RSortingSleepsort01.this.getDoneLatch().countDown(); // this one's done; decrement the latch
   }
   catch (java.lang.InterruptedException $1){ie=$1;
    ie.printStackTrace();
   }}
   return;
   }
  
  public netrexx.lang.Rexx getNum(){return num;}
  
  public void setNum(netrexx.lang.Rexx $2){num=$2;return;}
 }}
