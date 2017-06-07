
public class RUnbiasedRandom01 {
  private static final java.util.Random rng = new java.util.Random(666);
  public static boolean biased(int n) {
    return rng.nextDouble() < 1.0 / n;
//    return Math.random() < 1.0 / n;
  }
  public static boolean unbiased(int n) {
    boolean a;
    boolean b;
    do {
      a = biased(n);
      b = biased(n);
    } while (a == b);
    return a;
  }
  public static void main(String[] args) {
    final int M = 50_000;
    for (int n = 3; n < 7; ++n) {
      int c1 = 0;
      int c2 = 0;
      for (int i = 0; i < M; ++i) {
        c1 += biased(n)   ? 1 : 0;
        c2 += unbiased(n) ? 1 : 0;
      }
      System.out.printf("%3d: %5.2f%%  %5.2f%%%n", n, 100.0 * c1 / M, 100.0 * c2 / M);
    }
  }
}

