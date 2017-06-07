/* Generated from 'RPalindrome.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 *
 * Write at least one function/method (or whatever it is called in your preferred language) to check if a
 * sequence of characters (or bytes) is a <a href="http://en.wikipedia.org/wiki/Palindrome">palindrome</a> or not.
 * The function must return a boolean value (or something that can be used as boolean value, like an integer).
 * <p>
 * It is not mandatory to write also an example code that uses the <i>function</i>, unless its usage could be not
 * clear (e.g. the provided recursive C solution needs explanation on how to call the function).
 * </p>
 * <p>
 * It is not mandatory to handle properly encodings
 * (see <a href="http://rosettacode.org/wiki/String_length">String length</a>),
 * i.e. it is admissible that the function does not recognize 'salˆlas' as palindrome.
 * </p>
 * <p>
 * The function must not ignore spaces and punctuations. The compliance to the aforementioned, strict or not,
 * requirements completes the task.
 * </p>
 * <h4>Example</h4>
 * <p>
 * An example of a Latin palindrome is the sentence <i>"In girum imus nocte et consumimur igni"</i>,
 * roughly translated as: we walk around in the night and we are burnt by the fire (of love). To do your
 * test with it, you must make it all the same case and strip spaces.
 * </p>
 * <h4>Notes</h4>
 * <ul>
 * <li>
 * It might be useful for this task to know how to
 * <a href="http://rosettacode.org/wiki/Reversing_a_string">reverse a string</a>.
 * </li>
 * <li>
 * This task's entries might also form the subjects of the task
 * <a href="http://rosettacode.org/wiki/Test_a_function">Test a function</a>.
 * </li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Palindrome_detection">rosettacode.org/wiki/Palindrome_detection</a>
 */


public class RPalindrome{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RPalindrome.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String y_;
  netrexx.lang.Rexx pal;
  y_="In girum imus nocte et consumimur igni";
  
  // translation: We walk around in the night and
  // we are burnt by the fire (of love)
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("string = "+y_);
  netrexx.lang.RexxIO.Say("");
  
  pal=isPal(netrexx.lang.Rexx.toRexx(y_));
  
  if (pal.OpEqS(null,$01)) 
   netrexx.lang.RexxIO.Say("The string isn\'t palindromic.");
  else 
   netrexx.lang.RexxIO.Say("The string is palindromic.");
  return;}

 
 public static netrexx.lang.Rexx isPal(netrexx.lang.Rexx x_){
  x_=x_.upper().space(new netrexx.lang.Rexx((byte)0));/* removes all blanks (spaces).         */
  
  return new netrexx.lang.Rexx(x_.OpEqS(null,x_.reverse()));/* returns  1  if exactly equal,        */
  }
 
 private RPalindrome(){return;}
 }
