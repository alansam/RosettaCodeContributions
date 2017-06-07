
import java.math.BigInteger;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;

public class RPrimeDecomposition01 {

  public RPrimeDecomposition01() {
    return;
  }

  public static List<BigInteger> primeFactorBig(BigInteger a) {
    List<BigInteger> ans = new LinkedList<BigInteger>();
    //loop until we test the number itself or the number is 1
    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(a) <= 0 && !a.equals(BigInteger.ONE); i = i.add(BigInteger.ONE)) {
      while (a.remainder(i).equals(BigInteger.ZERO) && prime(i)) {
        //if we have a prime factor
        ans.add(i); //put it in the list
        a = a.divide(i); //factor it out of the number
      }
    }

    return ans;
  }

  public static List<BigInteger> primeDecomp(BigInteger a) {

    //private static final BigInteger two = BigInteger.valueOf(2);
    final BigInteger two = new BigInteger("2");

    // impossible for values lower than 2
    if (a.compareTo(two) < 0) {
//      return null;
      return new ArrayList<BigInteger>();
    }
 
    //quickly handle even values
    List<BigInteger> result = new ArrayList<BigInteger>();
    while (a.and(BigInteger.ONE).equals(BigInteger.ZERO)) {
      a = a.shiftRight(1);
      result.add(two);
    }
 
    //left with odd values
    if (!a.equals(BigInteger.ONE)) {
      BigInteger b = BigInteger.valueOf(3);
      while (b.compareTo(a) < 0) {
        if (b.isProbablePrime(10)) {
          BigInteger[] dr = a.divideAndRemainder(b);
          if (dr[1].equals(BigInteger.ZERO)) {
            result.add(b);
            a = dr[0];
          }
        }
        b = b.add(two);
      }
      result.add(b); //b will always be prime here...
    }
    return result;
  }

  public static List<BigInteger> primeFactorBigCSharp(BigInteger a) {
    List<BigInteger> ans = new LinkedList<BigInteger>();
 
    for(BigInteger divisor = BigInteger.valueOf(2); a.compareTo(ONE) > 0; divisor = divisor.add(ONE)) {
      while(a.mod(divisor).compareTo(ZERO) == 0) {
        ans.add(divisor);
        a = a.divide(divisor);
      }
    }
    return ans;
  }

  /**
   * This regex basically does a trial division of a number in unary.
   * It has been mentioned in Perl many times; you can see it explained on many sites
   * e.g. <a href="http://stackoverflow.com/questions/3329766/">stackoverflow.com/questions/3329766</a>,
   * <a href="http://www.noulakaz.net/weblog/2007/03/18/a-regular-expression-to-check-for-prime-numbers/">noulakaz.net/weblog/2007/03/18&elips;</a>
   * The only difference in Java is 1) .matches() matches the entire string, so you
   * don't need ^ and $, and 2) instead of repeating 1s (which is hard in Java), I
   * create a string of all null characters (by creating a string with a new char
   * array), and then match them with .
   *
   * @see <a href="http://stackoverflow.com/questions/2385909/most-elegant-way-to-write-isprime-in-java">stackoverflow &ndash; Most Elegant Way to write isPrime in java</a>
   */
  public static boolean isPrime(int n) {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
  }

  public static boolean isPrime(BigInteger n) {
    return isPrime(n.intValue());
  }

  public static boolean prime(BigInteger n) {
    return isPrime(n.intValue());
  }

  public static void main(String[] args) {

    int i1 = 2;
    int i2 = 25;

    if (args.length == 2) {
      i1 = Integer.valueOf(args[0]).intValue();
      i2 = Integer.valueOf(args[1]).intValue();
    }

    for (int n_ = i1; n_ <= i2; ++n_) {
      System.out.printf("%10d: %s%n", n_, primeFactorBig(new BigInteger(Integer.toString(n_))));
      System.out.printf("%10d: %s%n", n_, primeDecomp(new BigInteger(Integer.toString(n_))));
      System.out.printf("%10d: %s%n", n_, primeFactorBigCSharp(new BigInteger(Integer.toString(n_))));
    }

    return;
  }
}

