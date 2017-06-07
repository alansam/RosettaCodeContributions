/* Generated from 'RAbstractType.nrx' 22 Sep 2011 09:15:33 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



// -----------------------------------------------------------------------------

public final class RAbstractType{
 private static final java.lang.String $0="RAbstractType.nrx";

 
 
 public static final void main(java.lang.String args[]){
  RAbstractType.Concrete conk;
  
  netrexx.lang.RexxIO.Say("  Testing"+" "+RAbstractType.class.getSimpleName());
  netrexx.lang.RexxIO.Say("  Creating an object of type:"+" "+RAbstractType.Concrete.class.getSimpleName());
  conk=new RAbstractType.Concrete();
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("getClassName:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.getClassName())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("getIfaceName:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.getIfaceName())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("mustImplement:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.mustImplement())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("canOverride1:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.canOverride1())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("canOverride2:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.canOverride2())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("callOverridden2:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,netrexx.lang.Rexx.toRexx(conk.callOverridden2())));
  
  return;
  }
 
 private RAbstractType(){return;}

// -----------------------------------------------------------------------------
 
 static interface Iface{
  final java.lang.String $0="RAbstractType.nrx";
 
  public static final java.lang.String ifaceName=RAbstractType.Iface.class.getSimpleName();

 
  
  public abstract java.lang.String getIfaceName();

  
  public abstract java.lang.String canOverride1();

  
  public abstract java.lang.String canOverride2();
  }

 // -----------------------------------------------------------------------------
 
 static abstract class Abstraction implements RAbstractType.Iface{
  private final transient java.lang.String $0="RAbstractType.nrx";
 
  /* properties inheritable */
  protected java.lang.String className;

 
  
  public Abstraction(){super();
   this.setClassName(this.getClass().getSimpleName());
   return;
   }

  
  public abstract java.lang.String mustImplement();

 
  
  public java.lang.String getClassName(){
   return className;
   }

  
  public void setClassName(java.lang.String nm){
   className=nm;
   return;
   }

  
  public java.lang.String getIfaceName(){
   return RAbstractType.Iface.ifaceName;
   }

  
  public java.lang.String canOverride1(){
   return "In"+" "+RAbstractType.Abstraction.class.getSimpleName()+".canOverride1";
   }

  
  public java.lang.String canOverride2(){
   return "In"+" "+RAbstractType.Abstraction.class.getSimpleName()+".canOverride2";
   }
  }

 // -----------------------------------------------------------------------------
 
 static class Concrete extends RAbstractType.Abstraction{
  private final transient java.lang.String $0="RAbstractType.nrx";

 
  
  public Concrete(){
   super();
   return;
   }

  
  public java.lang.String mustImplement(){
   return "In"+" "+RAbstractType.Concrete.class.getSimpleName()+".mustImplement";
   }

  
  public java.lang.String canOverride2(){
   return "In"+" "+RAbstractType.Concrete.class.getSimpleName()+".canOverride2";
   }

  
  public java.lang.String callOverridden2(){
   return super.canOverride2();
   }
 }}
