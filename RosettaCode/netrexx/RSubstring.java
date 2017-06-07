/* Generated from 'RSubstring.nrx' 22 Aug 2011 16:57:06 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>Substring</h3>
 *
 * <p>
 * In this task display a substring:
 * </p>
 * <ul>
 * <li>starting from <code>n</code> characters in and of <code>m</code> length;</li>
 * <li>starting from <code>n</code> characters in, up to the end of the string;</li>
 * <li>whole string minus last character;</li>
 * <li>starting from a known character within the string and of <code>m</code> length;</li>
 * <li>starting from a known substring within the string and of <code>m</code> length.</li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Substring">http://rosettacode.org/wiki/Substring</a> 
 */


public class RSubstring{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RSubstring.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx m;
  s=netrexx.lang.Rexx.toRexx("abcdefghijk");
  n=new netrexx.lang.Rexx((byte)4);
  m=new netrexx.lang.Rexx((byte)3);
  
  netrexx.lang.RexxIO.Say(s);
  netrexx.lang.RexxIO.Say(s.substr(n,m));
  netrexx.lang.RexxIO.Say(s.substr(n));
  netrexx.lang.RexxIO.Say(s.substr(new netrexx.lang.Rexx((byte)1),(s.length()).OpSub(null,$01)));
  netrexx.lang.RexxIO.Say(s.substr(s.pos(netrexx.lang.Rexx.toRexx("def")),m));
  netrexx.lang.RexxIO.Say(s.substr(s.pos(new netrexx.lang.Rexx('g')),m));
  
  return;
  }
 
 private RSubstring(){return;}
 }
