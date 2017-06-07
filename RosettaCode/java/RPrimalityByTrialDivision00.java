
public class RPrimalityByTrialDivision00 {

  public RPrimalityByTrialDivision00() {
    return;
  }

  public static boolean isPrime(long a) {
    boolean pstate;
    if (a == 2) {
      pstate = true;
    }
    else if (a <= 1 || a % 2 == 0) {
      pstate = false;
    }
    else {
      long max = (long) Math.sqrt(a);
      pstate = true;
      for (long n = 3; n <= max; n += 2) {
        if(a % n == 0) {
          pstate = false;
        }
      }
    }
    return pstate;
  }

  public static boolean isPrimeRegx(int n) {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
  }

  public static void main(String[] args) {
    long prime;
    if (args.length <= 0) {
      prime = 131;
    }
    else {
      prime = Integer.decode(args[0]).intValue();
    }

    System.out.printf("%25d: %b\n", prime, isPrime(prime));
    System.out.printf("%25d: %b\n", prime, isPrimeRegx((int) prime));

    return;
  }
}

