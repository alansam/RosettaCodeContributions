
import java.util.BitSet;

public class ZPrimesSieveOfEratosthenes {

  private BitSet sieve;
  private static final int defaultSieveLen;

  static {
    defaultSieveLen = 1024;
  }

  /**
   *
   */
  public ZPrimesSieveOfEratosthenes(int initLen) {
    setSieve(null);
    makeSieve(initLen);
    return;
  }

  /**
   *
   */
  public ZPrimesSieveOfEratosthenes() {
    this(defaultSieveLen);
    return;
  }

  /**
   * @param val
   * @return 
   */
  public boolean isPrime(int val) {
    if (getSieve() == null || getSieve().size() < val) {
      int initSize = val > defaultSieveLen ? val + defaultSieveLen : defaultSieveLen;
      makeSieve(initSize);
    }

    return getSieve().get(val);
  }

  /**
   *
   */
  public void makeSieve(int initLen) {
    initLen = (initLen < Integer.MAX_VALUE - 1 ? initLen + 1 : Integer.MAX_VALUE);
    setSieve(new BitSet(initLen));
    getSieve().set(0, initLen);
    getSieve().clear(0);
    getSieve().clear(1);
    for (int i_ = 2; i_ <= initLen; ++i_) {
      if (i_ * i_ > initLen) {
        break; // only process up to square root of initLen
        }
      if (getSieve().get(i_)) {
        for (int j_ = i_ * i_; j_ <= initLen; j_ += i_) {
          getSieve().clear(j_);
        }
      }
    }
    return;  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    ZPrimesSieveOfEratosthenes sv;
    sv = new ZPrimesSieveOfEratosthenes(101);
    BitSet sieve = sv.getSieve();
    System.out.printf("Number of primes: %d%n", sieve.cardinality());
    int prime = -1;
/*    while (++prime < sieve.size()) {
      prime = sieve.nextSetBit(prime);
      System.out.println(prime);
    }
*/    return;
  }

  /**
   *
   */
  protected void setSieve(BitSet sieve) {
    this.sieve = sieve;
    return;
  }

  /**
   *
   */
  public BitSet getSieve() {
    if (sieve == null) {
      makeSieve(defaultSieveLen);
    }

    return sieve;
  }
}

