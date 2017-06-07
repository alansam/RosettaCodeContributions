// ZPrimesSieveOfAtkin00.java

import java.util.Arrays;

/**
 * Sieve of Atkin
 *
 * @version 2012-08-22
 * @author James Lind
 * @see http://stackoverflow.com/users/1516042/jim
 * @see http://www.linkedin.com/in/jameslind
 * @see http://stackoverflow.com/questions/10580159/sieve-of-atkin-explanation-and-java-example
 * @see http://stackoverflow.com/questions/1023768/sieve-of-atkin-explanation
 * @see http://en.wikipedia.org/wiki/Sieve_of_atkin
 */
public class ZPrimesSieveOfAtkin00 {

  private int limit;
  private boolean[] sieve;

  /**
   * @param limit
   */
  public ZPrimesSieveOfAtkin00(int limit) {
    setLimit(limit);
    setSieve(new boolean[getLimit() + 1]);
    return;
  }

  /**
   * @param limit
   */
  public ZPrimesSieveOfAtkin00() {
    this(1000);
    return;
  }

  /**
   * Driver
   *
   * @param args
   */
  public static void main(String[] args) {

    int inLim;
    boolean quiet = false;
    switch (args.length) {
    case 0:
      inLim = 1000;
      break;
    case 1:
      inLim = Integer.parseInt(args[0]);
    case 2:
    default:
      quiet = args[0].equalsIgnoreCase("-q") || args[0].equalsIgnoreCase("--quiet") ? true : false;
      inLim = Integer.parseInt(args[1]);
      break;
    }

    ZPrimesSieveOfAtkin00 primes;
    primes = new ZPrimesSieveOfAtkin00(inLim);

    primes.seive();

    int pt = 0;
    // put the results to the System.out device in 10x10 blocks
    for (int i_ = 0, j_ = 0; i_ <= primes.getLimit(); i_++) {
      if (primes.getSieve()[i_]) {
        pt++;
        if (!quiet) {
          System.out.printf("%,10d", i_);
        }
        if (++j_ % 10 == 0) {
          if (!quiet) {
            System.out.println();
          }
        } // end if
        if (j_ % 100 == 0) {
          if (!quiet) {
            System.out.println();
          }
        } // end if
      } // end if
    } // end for
    System.out.printf("%nFound %d primes below the limit %d%n", pt, primes.getLimit());
    
    return;
  }
  /**
   *
   */
  public void seive() {
    // there may be more efficient data structure arrangements than this (there are!) but this is the algorithm in Wikipedia
    // initialize results array
    Arrays.fill(sieve, false);
    // the sieve works only for integers > 3, so set these trivially to their proper values
    sieve[0] = false;
    sieve[1] = false;
    sieve[2] = true;
    sieve[3] = true;

    // loop through all possible integer values for x and y up to the square root of the max prime for the sieve
    // we don't need any larger values for x or y since the max value for x or y will be the square root of n
    // in the quadratics
    // the theorem showed that the quadratics will produce all primes that also satisfy their wheel factorizations, so
    // we can produce the value of n from the quadratic first and then filter n through the wheel quadratic 
    // there may be more efficient ways to do this, but this is the design in the Wikipedia article
    // loop through all integers for x and y for calculating the quadratics
    for (int x_ = 1; x_ <= getLimitSqrt(); x_++) {
      for (int y_ = 1; y_ <= getLimitSqrt(); y_++) {
        // first quadratic using m = 12 and r in R1 = {r : 1, 5}
        int n_ = (4 * x_ * x_) + (y_ * y_);
        if (n_ <= getLimit() && (n_ % 12 == 1 || n_ % 12 == 5)) {
          sieve[n_] = !sieve[n_];
        }
        // second quadratic using m = 12 and r in R2 = {r : 7}
        n_ = (3 * x_ * x_) + (y_ * y_);
        if (n_ <= getLimit() && (n_ % 12 == 7)) {
          sieve[n_] = !sieve[n_];
        }
        // third quadratic using m = 12 and r in R3 = {r : 11}
        n_ = (3 * x_ * x_) - (y_ * y_);
        if (x_ > y_ && n_ <= getLimit() && (n_ % 12 == 11)) {
          sieve[n_] = !sieve[n_];
        } // end if
        // note that R1 union R2 union R3 is the set R
        // R = {r : 1, 5, 7, 11}
        // which is all values 0 < r < 12 where r is a relative prime of 12
        // Thus all primes become candidates
      } // end for
    } // end for

    // remove all perfect squares since the quadratic wheel factorization filter removes only some of them
    for (int n_ = 5; n_ <= getLimitSqrt(); n_++) {
      if (sieve[n_]) {
        int x_ = n_ * n_;
        for (int i_ = x_; i_ <= getLimit(); i_ += x_) {
          sieve[i_] = false;
        } // end for
      } // end if
    } // end for
      
    return;
  } // end main

  /**
   * @param limit
   */
  protected int getLimit() {
  return limit;
  }

  /**
   * @return the limit
   */
  protected void setLimit(int limit) {
    this.limit = limit;
  }

  /**
   * @return the square root of the limit
   */
  public int getLimitSqrt() {
    return (int) Math.sqrt((double) this.getLimit());
  }

  /**
   * @return the seive
   */
  protected void setSieve(boolean[] seive) {
    this.sieve = seive;
    return;
  }

  /**
   * @return the seive
   */
  public boolean[] getSieve() {
    return sieve;
  }
} // end class ZPrimesSieveOfAtkin00

