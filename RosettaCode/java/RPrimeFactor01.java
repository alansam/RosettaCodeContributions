
import java.math.BigInteger;
import java.util.List;
import java.util.LinkedList;

/**
 * @author RosettaCode
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Prime_decomposition#Java">RosettaCode Prime_decomposition &ndash; Java</a>
 */
public class RPrimeFactor01 {

  private static final BigInteger TWO;

  static {
    TWO = BigInteger.valueOf(2L);
  }

  /**
   * @param a
   */
  public static List<BigInteger> primeFactorBig(BigInteger a) {
    List<BigInteger> ans = new LinkedList<BigInteger>();
    //loop until we test the number itself or the number is 1
    for (BigInteger i = BigInteger.valueOf(2); i.compareTo(a) <= 0 && !a.equals(BigInteger.ONE); i = i.add(BigInteger.ONE)) {
      while (a.remainder(i).equals(BigInteger.ZERO) && prime(i)) { //if we have a prime factor
        ans.add(i); //put it in the list
        a = a.divide(i); //factor it out of the number
      }
    }
    return ans;
  }

  /**
   * @param a
   */
  public static boolean isPrime(BigInteger a) {
    boolean aPrime;
    BigInteger startAt = a.subtract(BigInteger.ONE);
    if (startAt.compareTo(BigInteger.ZERO) < 0) {
      aPrime = false;
    }
    else {
      BigInteger nextPrime = startAt.nextProbablePrime();
      aPrime = nextPrime.compareTo(a) == 0 ? true : false;
    }
    return aPrime;
  }

  /**
   * @param a
   */
  public static boolean prime(BigInteger a) {
    return isPrime(a);
  }

  /**
   * @param start
   * @param finish
   */
  public static void showPrimes(BigInteger start, BigInteger finish) {

    BigInteger i_ = start;
    long fl;
    fl = finish.toString().length() + 2;
    fl = fl >= 6 ? fl : 6;
    String fmt = String.format("%%%ds %%s%%n", fl);
    while (i_.compareTo(finish) <= 0) {
      if (prime(i_)) {
        System.out.printf(fmt, i_.toString(), "[prime]");
      }
      else {
        System.out.printf(fmt, i_.toString(), primeFactorBig(i_));
      }
      i_ = i_.add(BigInteger.ONE);
    }

    return;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    BigInteger start;
    BigInteger finish;
    if (args.length == 0) {
      start  = BigInteger.ONE;
      finish = BigInteger.TEN;
    }
    else if (args.length == 1) {
      start  = new BigInteger(args[0]);
      finish = new BigInteger(args[0]).add(BigInteger.TEN);
    }
    else {
      start  = new BigInteger(args[0]);
      finish = new BigInteger(args[1]);
    }

    showPrimes(start, finish);

    return;
  }
}

