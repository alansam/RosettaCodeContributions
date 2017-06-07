
import java.util.*;

/**
 * @author Chris Kerekes
 * @version 2013-01-07
 * @see http://stackoverflow.com/questions/14122977/any-easier-way-of-finding-prime-numbers-than-this
 */
public class ZPrimeNumberTestGenerator implements Iterable<Long> {
  private Long limit;
  private ZPrimeNumberTest tester;

  /**
   * @param tester
   * @param limit
   */
  public ZPrimeNumberTestGenerator(ZPrimeNumberTest tester, Long limit) {
    this.tester = tester;
    this.limit = limit;
  }

  /**
   * @author Chris Kerekes
   * @version 2013-01-07
   * @see http://stackoverflow.com/questions/14122977/any-easier-way-of-finding-prime-numbers-than-this
   */
  private class ZPrimeNumberIterator implements Iterator<Long> {
    private Long next;

    /**
     *
     */
    public ZPrimeNumberIterator() {
      return;
    }

    /**
     * @return next element
     */
    public boolean hasNext() {
      return next.longValue() < limit;
    }

    /**
     * @return next element
     */
    public Long next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }

      long result = next;

      do {
        next++;
      } while(hasNext() && !tester.isPrime(next));

      return result;
    }

    /**
     *
     */
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  /**
   * @return the iterator
   */
  public Iterator<Long> iterator() {
    return new ZPrimeNumberIterator();
  }

  /**
   * Interactive driver
   *
   * @param args
   */
  public static void main(String[] args) {

    long max;
    switch (args.length) {
    case 0:
      max = 100;
      break;
    case 1:
    default:
      max = Long.parseLong(args[0]);
      break;
    }

    //Identify how prime numbers will be tested
    Iterable<Long> primes = new ZPrimeNumberTestGenerator(new ZPrimeNumberBruteForceTester(), max);

    //Print the prime numbers
    for (Long prime : primes) {
      System.out.println(prime);
    }

    return;
  }

  /**
   * Interactive driver
   *
   * @param args
   */
  public static void chatty_main(String[] args) {
    //Determine the range of prime numbers to print
    Scanner scan = new Scanner(System.in);
    System.out.print("Primes smaller than what number should be printed?: ");
    long max = Long.parseLong(scan.nextLine());

    //Identify how prime numbers will be tested
    Iterable<Long> primes = new ZPrimeNumberTestGenerator(new ZPrimeNumberBruteForceTester(), max);

    //Print the prime numbers
    for (Long prime : primes) {
      System.out.println(prime);
    }

    return;
  }
}

