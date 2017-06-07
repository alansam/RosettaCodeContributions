/* Generated from 'RPolymorphicCopy.nrx' 16 Sep 2011 22:19:32 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



// -----------------------------------------------------------------------------

public class RPolymorphicCopy{
 private static final java.lang.String $0="RPolymorphicCopy.nrx";

 
 
 public static RPolymorphicCopy.T copier(RPolymorphicCopy.T x){
  return x.copy();
  }

 
 public static final void main(java.lang.String args[]){
  RPolymorphicCopy.T obj1;
  RPolymorphicCopy.S obj2;
  obj1=new RPolymorphicCopy.T();
  obj2=new RPolymorphicCopy.S();
  java.lang.System.out.println(copier(obj1).name()); // prints "T"
  java.lang.System.out.println(copier((RPolymorphicCopy.T)obj2).name()); // prints "S"
  return;
  }
 
 private RPolymorphicCopy(){return;}

// -----------------------------------------------------------------------------
 
 public static class T implements java.lang.Cloneable{
  private final transient java.lang.String $0="RPolymorphicCopy.nrx";

 
  
  public java.lang.String name(){
   return RPolymorphicCopy.T.class.getSimpleName();
   }

  
  public RPolymorphicCopy.T copy(){
   RPolymorphicCopy.T dup=null;
   java.lang.CloneNotSupportedException ex=null;
  
  
   {try{
    dup=(RPolymorphicCopy.T)(super.clone());
   }
   catch (java.lang.CloneNotSupportedException $1){ex=$1;
    ex.printStackTrace();
   }}
  
   return dup;
   }
  
  public T(){return;}
  }

 // -----------------------------------------------------------------------------
 
 public static class S extends RPolymorphicCopy.T{
  private final transient java.lang.String $0="RPolymorphicCopy.nrx";

 
  
  public java.lang.String name(){
   return RPolymorphicCopy.S.class.getSimpleName();
   }
  
  public S(){return;}
 }}
