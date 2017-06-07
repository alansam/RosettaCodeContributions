/* Generated from 'RVariableSizeGet.nrx' 13 Jul 2011 11:57:29 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Variable size/Get</h3>
 * <p>
 * Demonstrate how to get the size of a variable.
 * </p>
 * <p>
 * See also: <a href="http://rosettacode.org/wiki/Host_introspection">Host introspection</a>
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Variable_size/Get">rosettacode.org/wiki/Variable_size/Get</a>
 */


public class RVariableSizeGet{
 private static final java.lang.String $0="RVariableSizeGet.nrx";
 
 public static void main(java.lang.String $0s[]){
  boolean b1;
  byte x1;
  char c1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;
  b1=isFalse();
  x1=(byte)0;
  c1='0';
  s1=(short)((byte)0);
  i1=(int)((byte)0);
  l1=(long)((byte)0);
  f1=0.0F;
  d1=(double)(0.0F);
  
  netrexx.lang.RexxIO.Say("boolean:"+" "+(b1?"1":"0")+" "+"-"); //b1.length
  netrexx.lang.RexxIO.Say("   byte:"+" "+x1+" "+"-"); //x1.length
  netrexx.lang.RexxIO.Say("   char:"+" "+java.lang.String.valueOf(c1)+" "+"-"); //c1.length
  netrexx.lang.RexxIO.Say("  short:"+" "+s1+" "+"-"); //s1.length
  netrexx.lang.RexxIO.Say("    int:"+" "+i1+" "+"-"); //i1.length
  netrexx.lang.RexxIO.Say("   long:"+" "+l1+" "+"-"); //l1.length
  netrexx.lang.RexxIO.Say("  float:"+" "+f1+" "+"-"); //f1.length
  netrexx.lang.RexxIO.Say(" double:"+" "+d1+" "+"-"); //d1.length
  return;}

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RVariableSizeGet(){return;}
 }
