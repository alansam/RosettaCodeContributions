
import java.util.Scanner;

/**
 * @author Chris Kerekes
 * @version 2013-01-07
 * @see http://stackoverflow.com/questions/14122977/any-easier-way-of-finding-prime-numbers-than-this
 */
public class ZPrimeNumberBruteForceTester implements ZPrimeNumberTest {

  private static boolean optimized;

  static {
    setOptimized(true);
  }

  /**
   * @param value
   * @return indication that {@code value} is prime
   */
  public boolean isPrime(long value) {
    return isOptimized() ? isPrime_opimized(value) : isPrime_unopimized(value);
  }

  /**
   * @param value
   * @return indication that {@code value} is prime
   */
  public boolean isPrime_opimized(long value) {
    boolean isPrime = true;
    if (value < 2) {
      isPrime = false;
    }
    else if (value > 2) {
      isPrime = true;
      if (value % 2 == 0) {
        isPrime = false;
      }
      else {
        for (int i_ = 3; isPrime && i_ < value; i_ += 2) {
          if (value % i_ == 0) {
            isPrime = false;
          }
        }
      }
    }
    else { // 2
      isPrime = true;
    }
    return isPrime;
  }

  /**
   * @param value
   * @return indication that {@code value} is prime
   */
  public boolean isPrime_unopimized(long value) {
    boolean isPrime = true;

    for (int i = 2; isPrime && i < value; i++) {
      if (value % i == 0) {
        isPrime = false;
      }
    }

    return isPrime;
  }

  /**
   * Driver
   *
   * @param args
   */
  public static void main(String[] args) {

    int max;
    switch (args.length) {
    case 0:
      max = 100;
      break;
    case 1:
      max = Integer.parseInt(args[0]);
      break;
    default:
      setOptimized(args[0].equalsIgnoreCase("-o") || args[0].equalsIgnoreCase("--optimized") ? true : false);
      max = Integer.parseInt(args[1]);
      break;
    }

    //Identify how prime numbers will be tested
    ZPrimeNumberTest test = new ZPrimeNumberBruteForceTester();

    //Uncomment the line below if you want to include the number 1. Favour adding it here so that you may
    //use re-use your prime number test elsewhere that atually needs to know if a number is prime.
    //System.out.println(1);

    //Print the prime numbers
    int totals = 0;
    for (long i_ = 2l; i_ <= max; i_++) {
      if (test.isPrime(i_)) {
        ++totals;
        if (i_ == 2l) {
          System.out.print("2");
        }
        else {
          System.out.printf(", %d", i_);
        }
      }
    }
    System.out.printf("%n%nFound %d primes between 2 and %d%n", totals, max);

    return;
  }

  /**
   * Interactive driver
   *
   * @param args
   */
  public static void chatty_main(String[] args)
  {
    //Determine the range of prime numbers to print
    Scanner scan = new Scanner(System.in);
    System.out.print("Primes smaller than what number should be printed?: ");
    int max = Integer.parseInt(scan.nextLine());

    //Identify how prime numbers will be tested
    ZPrimeNumberTest test = new ZPrimeNumberBruteForceTester();

    //Uncomment the line below if you want to include the number 1. Favour adding it here so that you may
    //use re-use your prime number test elsewhere that atually needs to know if a number is prime.
    //System.out.println(1);

    //Print the prime numbers
    for (int i = 2; i < max ; i++) {
      if (test.isPrime(i)) {
        System.out.println(i);
      }
    }
  }

  /**
   * @return
   */
  public static boolean isOptimized() {
    return optimized;
  }

  /**
   * @param 
   */
  protected static void setOptimized(boolean opt_) {
    optimized = opt_;
    return;
  }
}

