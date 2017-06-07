/* Generated from 'RStripWhitespace.nrx' 22 Sep 2011 13:42:50 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * The task is to demonstrate how to strip leading and trailing whitespace from a string.
 * The solution should demonstrate how to achieve the following three results:
 * <ul>
 * <li>String with leading whitespace removed</li>
 * <li>String with trailing whitespace removed</li>
 * <li>String with both leading and trailing whitespace removed</li>
 * </ul>
 * <p>
 * For the purposes of this task whitespace includes non printable characters such as the space character,
 * the tab character, and other such characters that have no corresponding graphical representation.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Strip_whitespace_from_a_string/Top_and_tail">rosettacode.org/wiki/Strip_whitespace_from_a_string/Top_and_tail</a> 
 */

//    ----+----1----+----2----+----3----+----4----+

public class RStripWhitespace{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('|');
 private static final java.lang.String $0="RStripWhitespace.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx ss;
  ss=netrexx.lang.Rexx.toRexx(" \t \r \n String with spaces  \t  \r  \n \000  ");
  
  netrexx.lang.RexxIO.Say((((ss.length()).OpCcblank(null,$01)).OpCc(null,ss)).OpCc(null,$01));
  netrexx.lang.RexxIO.Say((((ss.strip().length()).OpCcblank(null,$01)).OpCc(null,ss.strip())).OpCc(null,$01));
  
  return;
  }
 
 private RStripWhitespace(){return;}
 }
