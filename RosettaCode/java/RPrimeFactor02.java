
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

/**
 * @author RosettaCode
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Prime_decomposition#Java">RosettaCode Prime_decomposition &ndash; Java</a>
 */
public class RPrimeFactor02 {

  private static final BigInteger TWO;

  static {
    TWO = BigInteger.valueOf(2L);
  }

  /**
   * @param a
   */
  public static List<BigInteger> primeDecomp(BigInteger a) {
    // impossible for values lower than 2
    if (a.compareTo(TWO) < 0) {
      return null; 
    }

    //quickly handle even values
    List<BigInteger> result = new ArrayList<BigInteger>();
    while (a.and(BigInteger.ONE).equals(BigInteger.ZERO)) {
      a = a.shiftRight(1);
      result.add(TWO);
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
        b = b.add(TWO);
      }
      result.add(b); //b will always be prime here...
    }
    return result;
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
        System.out.printf(fmt, i_.toString(), primeDecomp(i_));
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

