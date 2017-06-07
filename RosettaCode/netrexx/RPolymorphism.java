/* Generated from 'RPolymorphism.nrx' 16 Sep 2011 22:19:32 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



// -----------------------------------------------------------------------------

public final class RPolymorphism{
 private static final java.lang.String $0="RPolymorphism.nrx";
  private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('@');
  private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
  private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(',');
  private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(')');

 
 
 public static final void main(java.lang.String args[]){
  RPolymorphism.Point parry[];
  int pp=0;
  
  parry=new RPolymorphism.Point[]{new RPolymorphism.Point(),new RPolymorphism.Point(1.0D),new RPolymorphism.Point(1.0D,2.0D),new RPolymorphism.Point(new RPolymorphism.Point(0.3D,0.2D)),(RPolymorphism.Point)(new RPolymorphism.Circle()),(RPolymorphism.Point)(new RPolymorphism.Circle(2.0D,2.0D)),(RPolymorphism.Point)(new RPolymorphism.Circle(5.0D,6.0D,7.0D)),(RPolymorphism.Point)(new RPolymorphism.Circle(new RPolymorphism.Point(8.0D,9.0D))),(RPolymorphism.Point)(new RPolymorphism.Circle(new RPolymorphism.Point(8.0D,9.0D),4.0D)),(RPolymorphism.Point)(new RPolymorphism.Circle(new RPolymorphism.Circle(1.5D,1.4D,1.3D)))};
  
  
  
  
  
  
  
  
  
  
  
  
  {int $1=parry.length-1;pp=0;pp:for(;pp<=$1;pp++){
   parry[pp].print();
   }
  }/*pp*/
  
  return;
  }
 
 private RPolymorphism(){return;}

// -----------------------------------------------------------------------------
 
 public static class Point{
  private final transient java.lang.String $0="RPolymorphism.nrx";
 
  /* properties private */
  private double x;
  private double y;
  private java.lang.String className=RPolymorphism.Point.class.getSimpleName();

 
  
  public Point(){
   this((double)0.0D,(double)0.0D);return;
   }
  public Point(double x_){
   this(x_,(double)0.0D);return;
   }
  public Point(double x_,double y_){super();
   this.setX(x_);
   this.setY(y_);
   return;
   }

  
  public Point(RPolymorphism.Point p){
   this(p.getX(),p.getY());
   return;
   }

  
  public java.lang.String display(){
   netrexx.lang.Rexx hx;
   netrexx.lang.Rexx str;
   hx=$01.OpCc(null,(new netrexx.lang.Rexx(java.lang.Integer.toHexString(this.hashCode()))).right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
   str=((((((((new netrexx.lang.Rexx(className)).left(new netrexx.lang.Rexx((byte)10))).OpCc(null,$02)).OpCc(null,hx)).OpCc(null,netrexx.lang.Rexx.toRexx(": (x,y) = ("))).OpCc(null,(new netrexx.lang.Rexx(this.getX())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3)))).OpCc(null,$03)).OpCcblank(null,(new netrexx.lang.Rexx(this.getY())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3)))).OpCc(null,$04);
  
  
   return netrexx.lang.Rexx.toString(str);
   }

  
  public double getX(){
   return x;
   }

  
  public double getY(){
   return y;
   }

  
  protected void setX(){
   setX((double)0.0D);return;
   }
  protected void setX(double x_){
   x=x_;
   return;
   }

  
  protected void setY(){
   setY((double)0.0D);return;
   }
  protected void setY(double y_){
   y=y_;
   return;
   }

  
  protected void print(){
   netrexx.lang.RexxIO.Say(display());
   return;
   }
  }

 // -----------------------------------------------------------------------------
 
 public static class Circle extends RPolymorphism.Point{
  private final transient java.lang.String $0="RPolymorphism.nrx";
 
  /* properties private */
  private double r;
  private java.lang.String className=RPolymorphism.Circle.class.getSimpleName();

 
  
  public Circle(){
   this((double)0.0D,(double)0.0D,(double)0.0D);return;
   }
  public Circle(double x_){
   this(x_,(double)0.0D,(double)0.0D);return;
   }
  public Circle(double x_,double y_){
   this(x_,y_,(double)0.0D);return;
   }
  public Circle(double x_,double y_,double r_){
   super(x_,y_);
   this.setR(r_);
   return;
   }

  
  public Circle(RPolymorphism.Point p_){
   this(p_,(double)0.0D);return;
   }
  public Circle(RPolymorphism.Point p_,double r_){
   this(p_.getX(),p_.getY(),r_);
   return;
   }

  
  public Circle(RPolymorphism.Circle c_){
   this(c_.getX(),c_.getY(),c_.getR());
   return;
   }

  
  public double getR(){
   return r;
   }

  
  protected void setR(){
   setR((double)0.0D);return;
   }
  protected void setR(double r_){
   r=r_;
   return;
   }

  
  public java.lang.String display(){
   netrexx.lang.Rexx hx;
   netrexx.lang.Rexx str;
   hx=$01.OpCc(null,(new netrexx.lang.Rexx(java.lang.Integer.toHexString(this.hashCode()))).right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
   str=((((((((((new netrexx.lang.Rexx(className)).left(new netrexx.lang.Rexx((byte)10))).OpCc(null,$02)).OpCc(null,hx)).OpCc(null,netrexx.lang.Rexx.toRexx(": (x,y,r) = ("))).OpCc(null,(new netrexx.lang.Rexx(this.getX())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3)))).OpCc(null,$03)).OpCcblank(null,(new netrexx.lang.Rexx(this.getY())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3)))).OpCc(null,$03)).OpCcblank(null,(new netrexx.lang.Rexx(this.getR())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3)))).OpCc(null,$04);
  
  
  
   return netrexx.lang.Rexx.toString(str);
   }
 }}
