/* Generated from 'RCSingleton00.nrx' 12 Jun 2012 20:11:34 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RCSingleton00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('@');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RCSingleton00.nrx";
  private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('!');
 
 /* properties private */
 private netrexx.lang.Rexx _id=$01.OpCc(null,(new netrexx.lang.Rexx(java.lang.Integer.toHexString(this.hashCode()))).right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
 private RCSingleton00.Instance _instance;

 
 
 public RCSingleton00(){super();
  _instance=RCSingleton00.Instance.getInstance();
  return;
  }

 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx HT;
  RCSingleton00 mn1;
  RCSingleton00 mn2;
  
  HT=netrexx.lang.Rexx.toRexx("\t");
  mn1=new RCSingleton00();
  mn2=new RCSingleton00();
  
  netrexx.lang.RexxIO.Say(((HT.OpCc(null,mn1.squeak())).OpCc(null,HT)).OpCc(null,mn2.squeak()));
  mn1._instance.addRef();
  netrexx.lang.RexxIO.Say(((HT.OpCc(null,mn1.squeak())).OpCc(null,HT)).OpCc(null,mn2.squeak()));
  mn1._instance.addRef(); // Note: mn1 again
  netrexx.lang.RexxIO.Say(((HT.OpCc(null,mn1.squeak())).OpCc(null,HT)).OpCc(null,mn2.squeak()));
  mn1._instance.release();
  netrexx.lang.RexxIO.Say(((HT.OpCc(null,mn1.squeak())).OpCc(null,HT)).OpCc(null,mn2.squeak()));
  mn1._instance.release(); // Note: mn1 again
  netrexx.lang.RexxIO.Say(((HT.OpCc(null,mn1.squeak())).OpCc(null,HT)).OpCc(null,mn2.squeak()));
  return;
  }

 
 public netrexx.lang.Rexx squeak(){
  netrexx.lang.Rexx rs;
  rs=((((_id.OpCc(null,$02)).OpCc(null,netrexx.lang.Rexx.toRexx(_instance.getId()))).OpCc(null,$03)).OpCc(null,$04)).OpCc(null,(new netrexx.lang.Rexx(_instance.getRefCount())).right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0)));
  return rs;
  }

// ---------------------------------------------------------------------------
 
 public static class Instance{
  private final transient java.lang.String $0="RCSingleton00.nrx";
 
  /* properties private static */
  private static RCSingleton00.Instance _instance;
  private static int _refCount=0;
 
  /* properties private */
  private netrexx.lang.Rexx _id=$05.OpCc(null,(new netrexx.lang.Rexx(java.lang.Integer.toHexString(this.hashCode()))).right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));

 
  
  private Instance(){super();
   return;
   }

  
  public static synchronized RCSingleton00.Instance getInstance(){
   if (null==_instance) 
    {
     _instance=new RCSingleton00.Instance();
    }
   return _instance;
   }

  
  public synchronized java.lang.String getId(){
   return netrexx.lang.Rexx.toString(_id);
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
 }}

