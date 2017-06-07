
public class RFibonacciSequence {

  /**
   * Iterative
   */
  public static long itFibN(int n) {
    if (n < 2) {
      return n;
    }
    long ans = 0;
    long n1 = 0;
    long n2 = 1;
    for (n--; n > 0; n--) {
      ans = n1 + n2;
      n1 = n2;
      n2 = ans;
    }
    return ans;
  }

  /**
   * Recursive
   */
  public static long recFibN(final int n) {
    return (n < 2) ? n : recFibN(n - 1) + recFibN(n - 2);
  }

  /**
   * Analytic
   */
  public static long anFibN(final long n) {
    double p = (1 + Math.sqrt(5)) / 2;
    double q = 1 / p;
    return (long) ((Math.pow(p, n) + Math.pow(q, n)) / Math.sqrt(5));
  }

  /**
   * Tail-recursive
   */
  public static long fibTailRec(final int n) {
    return fibInner(0, 1, n);
  }

  /**
   * Tail-recursive inner method
   */
  private static long fibInner(final long a, final long b, final int n) {
    return n < 1 ? a : n == 1 ?  b : fibInner(b, a + b, n - 1);
  }

  /**
   * Driver
   */
  public static void main(String[] args) {
    String fmt = "Fibonacci number %d == %d%n  and took %fs to calculate.%n%n";
    long etime;
    double esecs;
    int nf = 21;
    long nr;

    System.out.println("Iterative");
    etime = System.nanoTime();
    nr = itFibN(nf);
    etime = System.nanoTime() - etime;
    esecs = ((double) etime) * 1e-9;
    System.out.printf(fmt, nf, nr, esecs);

    System.out.println("Recursive");
    etime = System.nanoTime();
    nr = recFibN(nf);
    etime = System.nanoTime() - etime;
    esecs = ((double) etime) * 1e-9;
    System.out.printf(fmt, nf, nr, esecs);

    System.out.println("Analytic");
    etime = System.nanoTime();
    nr = anFibN(nf);
    etime = System.nanoTime() - etime;
    esecs = ((double) etime) * 1e-9;
    System.out.printf(fmt, nf, nr, esecs);

    System.out.println("Tail-recursive");
    etime = System.nanoTime();
    nr = fibTailRec(nf);
    etime = System.nanoTime() - etime;
    esecs = ((double) etime) * 1e-9;
    System.out.printf(fmt, nf, nr, esecs);

    return;
  }
}

