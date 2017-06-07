/* Generated from 'RSingleton.nrx' 12 Jun 2012 15:53:17 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RSingleton{
 private static final java.lang.String $0="RSingleton.nrx";
  private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
  private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('@');

 
 
 public static void main(java.lang.String args[]){
  RSingleton.Testcase.main(args);
  return;
  }
 
 private RSingleton(){return;}

// ---------------------------------------------------------------------------
 
 public static class Instance{
  private final transient java.lang.String $0="RSingleton.nrx";
 
  /* properties private static */
  private static RSingleton.Instance _instance=new RSingleton.Instance();
  private static int _refCount=0;
  private static java.util.Random _random=new java.util.Random();

 
  
  private Instance(){super();
   return;
   }

  
  public static RSingleton.Instance getInstance(){
   return _instance;
   }

  
  public java.util.Random getRandom(){
   return _random;
   }

  
  public synchronized void addRef(){
   _refCount++;
   return;
   }

  
  public synchronized void release(){
   if (_refCount>0) 
    _refCount--;
   return;
   }

  
  public synchronized int getRefCount(){
   return _refCount;
   }
  }

 // ---------------------------------------------------------------------------
 
 public static class Testcase implements java.lang.Runnable{
  private final transient java.lang.String $0="RSingleton.nrx";
 
  /* properties private */
  private RSingleton.Instance _instance;

 
  
  public void run(){
   java.lang.Thread thud;
   java.lang.InterruptedException ex=null;
   netrexx.lang.RexxIO.Say(threadInfo()+"|-");
   thud=java.lang.Thread.currentThread();
   _instance=RSingleton.Instance.getInstance();
   thud.yield();
   _instance.addRef();
   netrexx.lang.RexxIO.Say(threadInfo()+"|"+(_instance.getRefCount()));
   thud.yield();
   {try{
    thud.sleep(_instance.getRandom().nextInt(1000));
   }
   catch (java.lang.InterruptedException $1){ex=$1;
    ex.printStackTrace();
   }}
   _instance.release();
   netrexx.lang.RexxIO.Say(threadInfo()+"|"+(_instance.getRefCount()));
   return;
   }

  
  public static void main(java.lang.String args[]){
   java.lang.Thread threads[];
   RSingleton.Testcase mn;
   java.lang.Object tr=null;
   java.lang.InterruptedException ex=null;
   threads=new java.lang.Thread[]{new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RSingleton.Testcase()))};
  
  
   netrexx.lang.RexxIO.Say(threadInfo()+"|-");
   mn=new RSingleton.Testcase();
   mn._instance=RSingleton.Instance.getInstance();
   netrexx.lang.RexxIO.Say(mn.threadInfo()+"|"+(mn._instance.getRefCount()));
   mn._instance.addRef();
   netrexx.lang.RexxIO.Say(mn.threadInfo()+"|"+(mn._instance.getRefCount()));
   {try{
    {int $4=0;java.lang.Object[] $3=new java.lang.Object[threads.length];synchronized(threads){for(;;){if($4==$3.length)break;$3[$4]=threads[threads.length-1-$4];$4++;}}tr:for(;;){if(--$4<0)break;tr=(java.lang.Object)$3[$4];
     ((java.lang.Thread)tr).start();
     }
    }/*tr*/
    java.lang.Thread.sleep(400);
   }
   catch (java.lang.InterruptedException $5){ex=$5;
    ex.printStackTrace();
   }}
   mn._instance.release();
   netrexx.lang.RexxIO.Say(mn.threadInfo()+"|"+(mn._instance.getRefCount()));
   return;
   }

  
  public static java.lang.String threadInfo(){
   java.lang.Thread trd;
   long tid;
   int hc;
   netrexx.lang.Rexx info;
   trd=java.lang.Thread.currentThread();
   tid=trd.getId();
   hc=trd.hashCode();
   info=((((((new netrexx.lang.Rexx(trd.getName())).left(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx('_'))).OpCc(null,$01)).OpCc(null,(new netrexx.lang.Rexx(java.lang.Long.toString(tid))).right(new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)0)))).OpCc(null,$01)).OpCc(null,$02)).OpCc(null,(new netrexx.lang.Rexx(java.lang.Integer.toHexString(hc))).right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
  
  
   return netrexx.lang.Rexx.toString(info);
   }
  
  public Testcase(){return;}
 }}
