/* Generated from 'RUnicodeVarName.nrx' 11 Mar 2013 20:09:20 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RUnicodeVarName{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("= \000");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx(".Lower =");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx(".Upper =");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)12);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("\u03A0 =");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx(", area =");
 private static final java.lang.String $0="RUnicodeVarName.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx upper\u0394;
  netrexx.lang.Rexx \u0394upper;
  netrexx.lang.Rexx lower\u03B4;
  netrexx.lang.Rexx \u03B4lower;
  netrexx.lang.Rexx \u03A5\u03C0\u03C0\u03B5\u03C1;
  netrexx.lang.Rexx \u039B\u03BF\u03C9\u03B5\u03C1;
  netrexx.lang.Rexx \u03B4;
  double \u03C0;
  netrexx.lang.Rexx \u03B8;
  netrexx.lang.Rexx \u03C3;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  upper\u0394=new netrexx.lang.Rexx((byte)1);
  \u0394upper=upper\u0394;
  lower\u03B4=new netrexx.lang.Rexx((byte)2);
  \u03B4lower=lower\u03B4;
  
  netrexx.lang.RexxIO.Say((((upper\u0394).OpCcblank($1,$01)).OpCcblank($1,\u0394upper)).OpCcblank($1,$02));
  upper\u0394=(upper\u0394).OpAdd($1,\u0394upper);
  netrexx.lang.RexxIO.Say(upper\u0394);
  
  netrexx.lang.RexxIO.Say((((lower\u03B4).OpCcblank($1,$01)).OpCcblank($1,\u03B4lower)).OpCcblank($1,$02));
  lower\u03B4=(lower\u03B4).OpAdd($1,\u03B4lower);
  netrexx.lang.RexxIO.Say(lower\u03B4);
  netrexx.lang.RexxIO.Say("");
  
  // Unicode works with the NetRexx built-in functions
  \u03A5\u03C0\u03C0\u03B5\u03C1=new netrexx.lang.Rexx('\u0391').sequence(new netrexx.lang.Rexx('\u03a1')).OpCc($1,new netrexx.lang.Rexx('\u03a3').sequence(new netrexx.lang.Rexx('\u03a9'))); // ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ
  \u039B\u03BF\u03C9\u03B5\u03C1=new netrexx.lang.Rexx('\u03b1').sequence(new netrexx.lang.Rexx('\u03c1')).OpCc($1,new netrexx.lang.Rexx('\u03c3').sequence(new netrexx.lang.Rexx('\u03c9'))); // αβγδεζηθικλμνξοπρστυφχψω
  netrexx.lang.RexxIO.Say(((\u03A5\u03C0\u03C0\u03B5\u03C1).OpCc($1,$03)).OpCcblank($1,\u03A5\u03C0\u03C0\u03B5\u03C1.lower()));
  netrexx.lang.RexxIO.Say(((\u039B\u03BF\u03C9\u03B5\u03C1).OpCc($1,$04)).OpCcblank($1,\u039B\u03BF\u03C9\u03B5\u03C1.upper()));
  netrexx.lang.RexxIO.Say("");
  
  // Note: Even with unicode characters NetRexx variables are case-insensitive
  $1.setDigits($05);
  \u03B4=new netrexx.lang.Rexx("20.0");
  \u03C0=java.lang.Math.PI;
  \u03B8=new netrexx.lang.Rexx(\u03C0).OpMult($1,\u03B4);
  \u03C3=(\u03B8).OpPow($1,$06).OpDiv($1,(new netrexx.lang.Rexx(\u03C0).OpMult($1,$07)));
  netrexx.lang.RexxIO.Say((((((($08.OpCcblank($1,new netrexx.lang.Rexx(\u03C0))).OpCc($1,netrexx.lang.Rexx.toRexx(", diameter ="))).OpCcblank($1,\u03B4)).OpCc($1,netrexx.lang.Rexx.toRexx(", circumference ="))).OpCcblank($1,\u03B8)).OpCc($1,$09)).OpCcblank($1,\u03C3));
  
  return;
  }
 
 private RUnicodeVarName(){return;}
 }
