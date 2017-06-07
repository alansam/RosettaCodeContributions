
import java.util.Set;
import java.util.TreeSet;

public class RFactorsOfAnInteger02 {

  public RFactorsOfAnInteger02() {
    return;
  }

  public static TreeSet<Long> factors(long n) {
    TreeSet<Long> factors = new TreeSet<Long>();
    factors.add(n);
    factors.add(1L);
    for (long test = n - 1; test >= Math.sqrt(n); test--) {
      if (n % test == 0) {
        factors.add(test);
        factors.add(n / test);
      }
    }
    return factors;
  }

  public static void main(String[] args) {
    long num;
    if (args.length > 0) {
      num = Long.parseLong(args[0]);
    }
    else {
      num = 10L;
    }

    for (long j_ = 1; j_ <= num; ++j_) {
      System.out.printf("n = %6d    divisors =  %s\n", j_, factors(j_));
    }

    return;
  }
}

