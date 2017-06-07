/* Generated from 'RStringConcatenation.nrx' 28 Nov 2013 12:56:11 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>String concatenation</h3>
 *
 * <p>
 * Create a string variable equal to any text value. Create another string variable whose value is the original
 * variable concatenated with another string literal.
 * </p>
 * <p>
 * To illustrate the operation, show the content of the variables.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/String_concatenation">rosettacode.org/wiki/String_concatenation</a>
 */

public class RStringConcatenation{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("s1:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("s2:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("s3:");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("s4:");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("s5:");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("s6:");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("s7:");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("s8:");
 private static final java.lang.String $0="RStringConcatenation.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s1;
  netrexx.lang.Rexx s2;
  netrexx.lang.Rexx s3;
  netrexx.lang.Rexx s4;
  netrexx.lang.Rexx s5;
  netrexx.lang.Rexx s6;
  netrexx.lang.Rexx s7;
  netrexx.lang.Rexx s8;
  s1=netrexx.lang.Rexx.toRexx("any text value");
  s2=netrexx.lang.Rexx.toRexx("another string literal");
  s3=s1.OpCcblank(null,s2); // concatenate variables with blank space (note that only one blank space is added)
  s4=s1.OpCc(null,s2); // concatenate variables with abuttal (here, no blank spaces are added)
  s5=s1.OpCcblank(null,netrexx.lang.Rexx.toRexx("another string literal")); // concatenate a variable and a literal with blank space
  s6=s1.OpCc(null,netrexx.lang.Rexx.toRexx("another string literal")); // concatenate a variable and a literal using abuttal
  s7=s1.OpCc(null,netrexx.lang.Rexx.toRexx("another string literal")); // ditto
  s8=(s1.OpCc(null,$01)).OpCc(null,s2); // concatenate variables with abbutal via an empty string
  
  netrexx.lang.RexxIO.Say($02.OpCcblank(null,s1)); // concatenation with blank space is employed here too
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,s2));
  netrexx.lang.RexxIO.Say($04.OpCcblank(null,s3));
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,s4));
  netrexx.lang.RexxIO.Say($06.OpCcblank(null,s5));
  netrexx.lang.RexxIO.Say($07.OpCcblank(null,s6));
  netrexx.lang.RexxIO.Say($08.OpCcblank(null,s7));
  netrexx.lang.RexxIO.Say($09.OpCcblank(null,s8));
  return;}
 
 private RStringConcatenation(){return;}
 }
