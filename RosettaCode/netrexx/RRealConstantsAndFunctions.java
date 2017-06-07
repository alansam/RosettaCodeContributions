/* Generated from 'RRealConstantsAndFunctions.nrx' 5 Nov 2012 18:04:08 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RRealConstantsAndFunctions{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("  Abs of");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("  Floor of");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('x');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("  Max of");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('&');
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("  Min of");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("  Sign of");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("  Truncate");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("by");
 private static final java.lang.String $0="RRealConstantsAndFunctions.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx y;
  netrexx.lang.Rexx pad;
  x=new netrexx.lang.Rexx("2.5");
  y=new netrexx.lang.Rexx((byte)3);
  pad=new netrexx.lang.Rexx((byte)40);
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Java Math constants & functions:");
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx("  Euler\'s number (e):")).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.E)));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx("  Pi:")).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.PI)));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Square root of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.sqrt(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Log(e) of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.log(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx("  Log(e) of e:")).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.log(java.lang.Math.E))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Log(10) of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.log10(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx("  Log(10) of 10:")).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.log10((double)((byte)10)))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Exponential (e**x) of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.exp(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Exponential (e**x) of log(e)").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.exp(java.lang.Math.log(x.todouble())))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($03.OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.abs(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($03.OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.abs((x.OpMinus($1)).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($04.OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.floor(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($04.OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.floor(((x.OpMinus($1))).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Ceiling of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.ceil(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Ceiling of").OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.ceil(((x.OpMinus($1))).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($05.OpCcblank($1,x)).OpCcblank($1,netrexx.lang.Rexx.toRexx("to the power of"))).OpCcblank($1,y)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.pow(x.todouble(),y.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($05.OpCcblank($1,x)).OpCcblank($1,netrexx.lang.Rexx.toRexx("to the power of"))).OpCcblank($1,$06.OpDiv($1,y))).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.pow(x.todouble(),$06.OpDiv($1,y).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  10 to the power of log10").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.pow((double)((byte)10),java.lang.Math.log10(x.todouble())))));
  
  // Extras
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Cube root of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.cbrt(x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((((netrexx.lang.Rexx.toRexx("  Hypotenuse of").OpCcblank($1,$07)).OpCcblank($1,$08)).OpCcblank($1,$09)).OpCcblank($1,netrexx.lang.Rexx.toRexx("right triangle:")))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.hypot((double)((byte)3),(double)((byte)4)))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($010.OpCcblank($1,(x.OpMinus($1)))).OpCcblank($1,$011)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.max((x.OpMinus($1)).todouble(),x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($012.OpCcblank($1,(x.OpMinus($1)))).OpCcblank($1,$011)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.min((x.OpMinus($1)).todouble(),x.todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Signum of").OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.signum((x).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((((netrexx.lang.Rexx.toRexx("  Signum of").OpCcblank($1,x)).OpCcblank($1,$013)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.signum((x.OpSub($1,x)).todouble()))));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((netrexx.lang.Rexx.toRexx("  Signum of").OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,new netrexx.lang.Rexx(java.lang.Math.signum((x.OpMinus($1)).todouble()))));
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("NetRexx built-in support for numeric data:");
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($03.OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,x.abs()));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($03.OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,(x.OpMinus($1)).abs()));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($014.OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,x.sign()));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($014.OpCcblank($1,x)).OpCcblank($1,$013)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,(x.OpSub($1,x)).sign()));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(($014.OpCcblank($1,(x.OpMinus($1)))).OpCc($1,$02))).left(pad)).OpCcblank($1,(x.OpMinus($1)).sign()));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($010.OpCcblank($1,(x.OpMinus($1)))).OpCcblank($1,$011)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,(x.OpMinus($1)).max(x)));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($012.OpCcblank($1,(x.OpMinus($1)))).OpCcblank($1,$011)).OpCcblank($1,x)).OpCc($1,$02))).left(pad)).OpCcblank($1,(x.OpMinus($1)).min(x)));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(((($015.OpCcblank($1,x)).OpCcblank($1,$016)).OpCcblank($1,y)).OpCc($1,$02))).left(pad)).OpCcblank($1,x.trunc(y)));
  netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx((((netrexx.lang.Rexx.toRexx("  Format (with rounding)").OpCcblank($1,x)).OpCcblank($1,$016)).OpCcblank($1,y)).OpCc($1,$02))).left(pad)).OpCcblank($1,x.format(y,new netrexx.lang.Rexx((byte)0))));
  return;}
 
 private RRealConstantsAndFunctions(){return;}
 }
