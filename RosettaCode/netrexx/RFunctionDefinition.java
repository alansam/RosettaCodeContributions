/* Generated from 'RFunctionDefinition.nrx' 13 Jul 2011 18:08:44 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Function definition</h3>
 * <p>
 * A function is a body of code that returns a value. The value returned may depend on arguments provided to the function.
 * <br />
 * Write a definition of a function called "multiply" that takes two arguments and returns their product.
 * <br />
 * (Argument types should be chosen so as not to distract from showing how functions are created and values returned).
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hello_world/Standard_error">rosettacode.org/wiki/Hello_world/Standard_error</a>
 */


public class RFunctionDefinition{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("sq. yds");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("metres");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("m radius:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("m**2");
 private static final java.lang.String $0="RFunctionDefinition.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx pi;
  int radiusY;
  int in2ft;
  int ft2yds;
  float in2mm;
  float mm2m;
  netrexx.lang.Rexx radiusM;
  pi=new netrexx.lang.Rexx("3.14159265358979323846264338327950");
  radiusY=10;
  in2ft=12;
  ft2yds=3;
  in2mm=25.4F;
  mm2m=((float)1)/((float)1000);
  radiusM=multiply(multiply(new netrexx.lang.Rexx(radiusY),multiply(multiply(new netrexx.lang.Rexx(ft2yds),new netrexx.lang.Rexx(in2ft)),new netrexx.lang.Rexx(in2mm))),new netrexx.lang.Rexx(mm2m));
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Area of a circle"+" "+radiusY+" "+"yds radius: ").OpCcblank(null,multiply(multiply(new netrexx.lang.Rexx(radiusY),new netrexx.lang.Rexx(radiusY)),pi).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCcblank(null,$01));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(java.lang.String.valueOf(radiusY)+" "+"yds =").OpCcblank(null,radiusM.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCcblank(null,$02));
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Area of a circle").OpCcblank(null,radiusM.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$03)).OpCcblank(null,multiply(multiply(radiusM,radiusM),pi).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$04));
  return;}

 /**
  * Multiplication function
  *
  * @param multiplicand
  * @param multiplier
  * @return product
  */
 
 public static netrexx.lang.Rexx multiply(netrexx.lang.Rexx multiplicand,netrexx.lang.Rexx multiplier){
  netrexx.lang.Rexx product;
  
  product=multiplicand.OpMult(null,multiplier);
  return product;
  }
 
 private RFunctionDefinition(){return;}
 }
