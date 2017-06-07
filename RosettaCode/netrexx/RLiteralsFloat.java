/* Generated from 'RLiteralsFloat.nrx' 5 Aug 2012 16:18:54 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


// make lots of space for big numbers
// set output form for exponential notation


public class RLiteralsFloat{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)40);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("scientific");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("==");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx("1.5");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RLiteralsFloat.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 private static final netrexx.lang.RexxSet $2=new netrexx.lang.RexxSet($1);
 static{$2.setForm($02);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx fv;
  float ff=0;
  double fd=0;
  netrexx.lang.RexxIO.Say("Sample using objects of type \"Rexx\" (default):");
  fv=new netrexx.lang.Rexx("1.5");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("1.5").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //            1.5
  fv=$04.OpMinus($2);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("-1.5").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //           -1.5
  fv=new netrexx.lang.Rexx("15e-1");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("15e-1").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //            1.5
  fv=new netrexx.lang.Rexx("3e-12");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("3e-12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //          3E-12
  fv=new netrexx.lang.Rexx("3e+12");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("3e+12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //  3000000000000
  fv=new netrexx.lang.Rexx("17.3E-12");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E-12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //       1.73E-11
  fv=new netrexx.lang.Rexx("17.3E+12");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E+12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); // 17300000000000
  fv=new netrexx.lang.Rexx("17.3E+40");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E+40").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //       1.73E+41
  fv=new netrexx.lang.Rexx("0.033e+9");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033e+9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //       33000000
  fv=new netrexx.lang.Rexx("0.033e-9");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033e-9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(fv).right(new netrexx.lang.Rexx((byte)20)))); //        3.3E-11
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say("Sample using primitive type \"float\":");
  
  ff=15e-1F;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("15e-1").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(ff)).right(new netrexx.lang.Rexx((byte)20)))); //            1.5
  ff=17.3E-12F;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E-12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(ff)).right(new netrexx.lang.Rexx((byte)20)))); //       1.73E-11
  ff=17.3E+12F;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E+12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(ff)).right(new netrexx.lang.Rexx((byte)20)))); // 17300000000000
  ff=0.033E+9F;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033E+9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(ff)).right(new netrexx.lang.Rexx((byte)20)))); //       33000000
  ff=0.033E-9F;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033E-9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(ff)).right(new netrexx.lang.Rexx((byte)20)))); //        3.3E-11
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say("Sample using primitive type \"double\":");
  
  fd=15e-1D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("15e-1").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); //            1.5
  fd=17.3E-12D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E-12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); //       1.73E-11
  fd=17.3E+12D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E+12").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); // 17300000000000
  fd=17.3E+40D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("17.3E+40").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); //       1.73E+41
  fd=0.033E+9D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033E+9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); //       33000000
  fd=0.033E-9D;
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0.033E-9").right(new netrexx.lang.Rexx((byte)20)).OpCcblank($2,$03)).OpCcblank($2,normalize(new netrexx.lang.Rexx(fd)).right(new netrexx.lang.Rexx((byte)20)))); //        3.3E-11
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /**
  * Convert input to a Rexx object and add zero to the value which forces NetRexx to change its internal representation
  *
  * @param fv a Rexx object containing the floating point value
  * @return a Rexx object which allows NetRexx string manipulation methods to act on it
  */
 
 private static final netrexx.lang.Rexx normalize(netrexx.lang.Rexx fv){
  return fv.OpAdd($2,$05);
  }
 
 private RLiteralsFloat(){return;}
 }
