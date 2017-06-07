/* Generated from 'RArbitraryPrecision.nrx' 3 Jul 2011 10:21:44 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Using the in-built capabilities of your language, calculate the integer value of:
 * <br />
 * &nbsp;&nbsp;5<sup>4<sup>3<sup>2</sup></sup></sup>
 * <ul>
 * <li>Confirm that the first and last twenty digits of the answer are: <code>62060698786608744707...92256259918212890625</code></li>
 * <li>Find and show the number of decimal digits in the answer.</li>
 * </ul>
 * <p>
 * C.F. <a href="http://rosettacode.org/wiki/Long_multiplication">Long multiplication</a>
 * <h5>Note:</h5>
 * <ul>
 * <li>
 * Do not submit an implementation of <a href="http://en.wikipedia.org/wiki/arbitrary_precision_arithmetic">arbitrary precision arithmetic</a>.
 * The intention is to show the capabilities of the language as supplied. If a language has a
 * <a href="http://rosettacode.org/wiki/Talk:Arbitrary-precision_integers_(included)#Use_of_external_libraries"single, overwhelming, library</a>
 * of varied modules that is endorsed by its home site Ð such as
 * <a href="http://rosettacode.org/mw/index.php?title=CPAN&action=edit&redlink=1">CPAN</a>
 * for Perl or <a href="http://rosettacode.org/wiki/Boost">Boost</a> for C++ Ð then that may be used instead.
 * </li>
 * <li>
 * Strictly speaking, this should not be solved by fixed-precision numeric libraries where the precision has
 * to be manually set to a large value; although if this is the <strong>only</strong> recourse then it may be
 * used with a note explaining that the precision must be set manually to a large enough value.
 * </li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Arbitrary-precision_integers_(included)">rosettacode.org/wiki/Arbitrary-precision_integers_(included)</a>
 */








public class RArbitraryPrecision{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("...");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("digits:");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(200000);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(5);
 private static final java.lang.String $0="RArbitraryPrecision.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nanoFactor;
  netrexx.lang.Rexx dlm;
  long t1;
  long t2;
  netrexx.lang.Rexx td;
  nanoFactor=$02.OpPow($1,$03);
  dlm=$04.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-'));
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("useBigInteger:");
  t1=java.lang.System.nanoTime();
  useBigInteger();
  t2=java.lang.System.nanoTime();
  td=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Run time in seconds:").OpCcblank($1,td.OpDiv($1,nanoFactor)));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("useBigDecimal:");
  t1=java.lang.System.nanoTime();
  useBigDecimal();
  t2=java.lang.System.nanoTime();
  td=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Run time in seconds:").OpCcblank($1,td.OpDiv($1,nanoFactor)));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("useBuiltinMath:");
  t1=java.lang.System.nanoTime();
  useBuiltinMath();
  t2=java.lang.System.nanoTime();
  td=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Run time in seconds:").OpCcblank($1,td.OpDiv($1,nanoFactor)));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void useBigInteger(){
  java.math.BigInteger x;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx check;
  netrexx.lang.Rexx sample;
  
  x=java.math.BigInteger.valueOf(5);
  x=x.pow(java.math.BigInteger.valueOf(4).pow(java.math.BigInteger.valueOf(3).pow(2).intValue()).intValue());
  n=new netrexx.lang.Rexx(x.toString());
  
  check=netrexx.lang.Rexx.toRexx("62060698786608744707...92256259918212890625");
  sample=((n.left(new netrexx.lang.Rexx((byte)20))).OpCc($1,$05)).OpCc($1,n.right(new netrexx.lang.Rexx((byte)20)));
  
  netrexx.lang.RexxIO.Say("Expected result:");
  netrexx.lang.RexxIO.Say(check);
  netrexx.lang.RexxIO.Say("Actual result:");
  netrexx.lang.RexxIO.Say(sample);
  netrexx.lang.RexxIO.Say($06.OpCcblank($1,n.length()));
  netrexx.lang.RexxIO.Say("");
  
  if (check.OpEq($1,sample)) 
   
   netrexx.lang.RexxIO.Say("Result confirmed");
  else 
   netrexx.lang.RexxIO.Say("Result does not satisfy test");
  
  return;
  }

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void useBigDecimal(){
  java.math.BigDecimal x;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx check;
  netrexx.lang.Rexx sample;
  
  x=java.math.BigDecimal.valueOf(5);
  x=x.pow(java.math.BigDecimal.valueOf(4).pow(java.math.BigDecimal.valueOf(3).pow(2).intValue(),java.math.MathContext.UNLIMITED).intValue(),java.math.MathContext.UNLIMITED);
  n=new netrexx.lang.Rexx(x.toString());
  
  check=netrexx.lang.Rexx.toRexx("62060698786608744707...92256259918212890625");
  sample=((n.left(new netrexx.lang.Rexx((byte)20))).OpCc($1,$05)).OpCc($1,n.right(new netrexx.lang.Rexx((byte)20)));
  
  netrexx.lang.RexxIO.Say("Expected result:");
  netrexx.lang.RexxIO.Say(check);
  netrexx.lang.RexxIO.Say("Actual result:");
  netrexx.lang.RexxIO.Say(sample);
  netrexx.lang.RexxIO.Say($06.OpCcblank($1,n.length()));
  netrexx.lang.RexxIO.Say("");
  
  if (check.OpEq($1,sample)) 
   
   netrexx.lang.RexxIO.Say("Result confirmed");
  else 
   netrexx.lang.RexxIO.Say("Result does not satisfy test");
  
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /**
  * Classic method using built-in capabilities of Rexx
  */
 
 private static void useBuiltinMath(){
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx check;
  netrexx.lang.Rexx sample;
  netrexx.lang.RexxSet $2=new netrexx.lang.RexxSet($1);
  /* precision must be set manually */
  $2.setDigits($07);
  
  n=$011.OpPow($2,($010.OpPow($2,($08.OpPow($2,$09)))));
  
  check=netrexx.lang.Rexx.toRexx("62060698786608744707...92256259918212890625");
  sample=((n.left(new netrexx.lang.Rexx((byte)20))).OpCc($2,$05)).OpCc($2,n.right(new netrexx.lang.Rexx((byte)20)));
  
  netrexx.lang.RexxIO.Say("Expected result:");
  netrexx.lang.RexxIO.Say(check);
  netrexx.lang.RexxIO.Say("Actual result:");
  netrexx.lang.RexxIO.Say(sample);
  netrexx.lang.RexxIO.Say($06.OpCcblank($2,n.length()));
  netrexx.lang.RexxIO.Say("");
  
  if (check.OpEq($2,sample)) 
   
   netrexx.lang.RexxIO.Say("Result confirmed");
  else 
   netrexx.lang.RexxIO.Say("Result does not satisfy test");
  return;}
 
 private RArbitraryPrecision(){return;}
 }
/*

Result:

digits: 183231
62060698786608744707...92256259918212890625

Expected result:
62060698786608744707...92256259918212890625

 */

