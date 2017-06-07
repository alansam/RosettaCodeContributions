/* Generated from 'RCSingleton.nrx' 12 Jun 2012 20:11:34 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RCSingleton{
 private static final java.lang.String $0="RCSingleton.nrx";
  private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
  private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('@');

 
 
 public static void main(java.lang.String args[]){
  RCSingleton.Testcase.main(args);
  return;
  }
 
 private RCSingleton(){return;}

// ---------------------------------------------------------------------------
 
 public static class Instance{
  private final transient java.lang.String $0="RCSingleton.nrx";
 
  /* properties private static */
  private static RCSingleton.Instance _instance=new RCSingleton.Instance();
 
  /* properties private */
  private int _refCount;
  private java.util.Random _random;

 
  
  private Instance(){super();
   this._refCount=0;
   this._random=new java.util.Random();
   return;
   }

  
  public static RCSingleton.Instance getInstance(){
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
  private final transient java.lang.String $0="RCSingleton.nrx";
 
  /* properties private */
  private RCSingleton.Instance _instance;

 
  
  public void run(){
   java.lang.Thread thud;
   java.lang.InterruptedException ex=null;
   netrexx.lang.RexxIO.Say(threadInfo()+"|-");
   thud=java.lang.Thread.currentThread();
   _instance=RCSingleton.Instance.getInstance();
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
   RCSingleton.Testcase mn;
   java.lang.Object tr=null;
   java.lang.InterruptedException ex=null;
   threads=new java.lang.Thread[]{new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase())),new java.lang.Thread((java.lang.Runnable)(new RCSingleton.Testcase()))};
  
  
   netrexx.lang.RexxIO.Say(threadInfo()+"|-");
   mn=new RCSingleton.Testcase();
   mn._instance=RCSingleton.Instance.getInstance();
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
