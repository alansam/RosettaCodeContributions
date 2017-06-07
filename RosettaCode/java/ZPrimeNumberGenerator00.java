
public class ZPrimeNumberGenerator00 {

  private static boolean isPrime(int val) {
    // test for LE 1
    if (val <= 1) {
      return false;
    }
    // test for 2, 3, 5
    if (val == 2 || val == 3 || val == 5) {
      return true;
    }
    //test for all multiples of 2, 3, 5
    if ((val % 2) == 0 || (val % 3) == 0 || (val % 5) == 0) {
      return false;
    }

    //otherwise test all odd numbers, but we are checking only for probable prime numbers of the
    // form 6K+1/6K-1 k>1;
    for (int j = 6; (j * j) <= val; j += 6) {
      if (val % (j - 1) == 0) {
        return false;
      }
      if ( val % (j + 1) == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    int limit;
    switch (args.length) {
    case 0:
      limit = 100;
      break;
    case 1:
    default:
      limit = Integer.parseInt(args[0]);
      break;
    }

    char[] sep = {' ', ','};
    int a_ = 0;
    int pk = 0;
    for (int v_ = 0; v_ <= limit; ++v_) {
      if (isPrime(v_)) {
        pk++;
        System.out.printf("%c%d", sep[a_], v_);
        a_ = 1;
      }
    }
    System.out.printf("%nFound %d primes to limit %d%n", pk, limit);

    return;
  }
}

