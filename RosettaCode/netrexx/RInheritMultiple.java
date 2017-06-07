/* Generated from 'RInheritMultiple.nrx' 8 Jul 2013 19:46:47 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RInheritMultiple{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("Object");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("is a");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('@');
 private static final java.lang.String $0="RInheritMultiple.nrx";

 
 public static void main(java.lang.String args[]){
  RInheritMultiple_CameraPhone iPhone;
  iPhone=new RInheritMultiple_CameraPhone();
  if ((iPhone instanceof RInheritMultiple_Camera)) 
   netrexx.lang.RexxIO.Say(((((($01.OpCcblank(null,hashToString((java.lang.Object)iPhone))).OpCcblank(null,$02)).OpCc(null,netrexx.lang.Rexx.toRexx(iPhone.getClass().getSimpleName()))).OpCc(null,$03)).OpCcblank(null,$04)).OpCcblank(null,netrexx.lang.Rexx.toRexx(RInheritMultiple_Camera.class.getSimpleName())));
  
  
  if ((iPhone instanceof RInheritMultiple_MobilePhone)) 
   netrexx.lang.RexxIO.Say(((((($01.OpCcblank(null,hashToString((java.lang.Object)iPhone))).OpCcblank(null,$02)).OpCc(null,netrexx.lang.Rexx.toRexx(iPhone.getClass().getSimpleName()))).OpCc(null,$03)).OpCcblank(null,$04)).OpCcblank(null,netrexx.lang.Rexx.toRexx(RInheritMultiple_MobilePhone.class.getSimpleName())));
  
  
  netrexx.lang.RexxIO.Say(iPhone.snap());
  netrexx.lang.RexxIO.Say(iPhone.call());
  return;
  }
 
 public static netrexx.lang.Rexx hashToString(java.lang.Object that){
  return $05.OpCc(null,(new netrexx.lang.Rexx(that.hashCode())).d2x().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
  }
 
 private RInheritMultiple(){return;}
 }


interface RInheritMultiple_Camera{
 static final java.lang.String $0="RInheritMultiple.nrx";
 // properties follow...
 public static final java.lang.String shutter="click...";

 // method prototypes follow
 
 public abstract netrexx.lang.Rexx snap();
 }


interface RInheritMultiple_MobilePhone{
 static final java.lang.String $0="RInheritMultiple.nrx";
 // properties follow...
 public static final java.lang.String ringTone="ring...";

 // method prototypes follow
 
 public abstract netrexx.lang.Rexx call();
 }


class RInheritMultiple_CameraPhone implements RInheritMultiple_Camera,RInheritMultiple_MobilePhone{
 private static final java.lang.String $0="RInheritMultiple.nrx";

 
 
 
 
 
 
 
 public RInheritMultiple_CameraPhone(){super();
  return;
  }
 // method implementations follow 
 
 public netrexx.lang.Rexx snap(){
  return netrexx.lang.Rexx.toRexx(RInheritMultiple_Camera.shutter);
  }
 
 public netrexx.lang.Rexx call(){
  return netrexx.lang.Rexx.toRexx(RInheritMultiple_MobilePhone.ringTone);
  }
 }
