/* Generated from 'RCompoundDataType.nrx' 14 Aug 2012 21:07:09 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RCompoundDataType{
 private static final java.lang.String $0="RCompoundDataType.nrx";
  private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("X=");
  private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx(",Y=");

 
 public static void main(java.lang.String args[]){
  RCompoundDataType.Point pp;
  pp=new RCompoundDataType.Point(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)4));
  netrexx.lang.RexxIO.Say(pp);
  return;
  }
 
 private RCompoundDataType(){return;}

 
 static class Point{
  private final transient java.lang.String $0="RCompoundDataType.nrx"; // inner class "Point"
  /* properties indirect */ // have NetRexx create getters & setters
  private java.lang.Integer x;
  private java.lang.Integer y;

 
  
  public Point(){
   this(new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0));return;
   }
  public Point(netrexx.lang.Rexx x_){
   this(x_,new netrexx.lang.Rexx((byte)0));return;
   }
  public Point(netrexx.lang.Rexx x_,netrexx.lang.Rexx y_){super(); // providing default values for x_ & y_ lets NetRexx generate intermediate constructors Point() & Point(x_)
   this.x=new java.lang.Integer(netrexx.lang.Rexx.toString(x_));
   this.y=new java.lang.Integer(netrexx.lang.Rexx.toString(y_));
   return;
   }

  
  public java.lang.String toString(){
   netrexx.lang.Rexx res;
   res=(($01.OpCc(null,new netrexx.lang.Rexx(java.lang.String.valueOf(this.getX())))).OpCc(null,$02)).OpCc(null,new netrexx.lang.Rexx(java.lang.String.valueOf(this.getY())));
   return netrexx.lang.Rexx.toString(res);
   }
  
  public java.lang.Integer getX(){return x;}
  
  public void setX(java.lang.Integer $1){x=$1;return;}
  
  public java.lang.Integer getY(){return y;}
  
  public void setY(java.lang.Integer $2){y=$2;return;}
 }}
