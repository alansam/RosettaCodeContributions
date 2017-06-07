/* Generated from 'RFizzBuzz.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead
 * of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three
 * and five print "FizzBuzz". <a href="http://weblog.raganwald.com/2007/01/dont-overthink-fizzbuzz.html">[1]</a>
 * <p>
 * FizzBuzz was presented as the lowest level of comprehension required to illustrate adequacy.
 * <a href="http://www.codinghorror.com/blog/archives/000804.html">[2]</a>
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Date_format">rosettacode.org/wiki/Date_format</a>
 * @see <a href="http://weblog.raganwald.com/2007/01/dont-overthink-fizzbuzz.html">weblog.raganwald.com/2007/01/dont-overthink-fizzbuzz.html</a>
 * @see <a href="http://www.codinghorror.com/blog/archives/000804.html">www.codinghorror.com/blog/archives/000804.html</a>
 */


public class RFizzBuzz{
 private static final java.lang.String $0="RFizzBuzz.nrx";
 
 public static void main(java.lang.String $0s[]){
  int j_=0;
  {int $1=100;j_=1;j_:for(;$1>0;$1--,j_++){
   {/*select*/
   if ((j_%15)==0)
    netrexx.lang.RexxIO.Say("FizzBuzz");
   else if ((j_%5)==0)
    netrexx.lang.RexxIO.Say("Buzz");
   else if ((j_%3)==0)
    netrexx.lang.RexxIO.Say("Fizz");
   else{
    netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(j_)).right(new netrexx.lang.Rexx((byte)4)));
   }
   }
   }
  }/*j_*/
  return;}
 
 private RFizzBuzz(){return;}
 }
