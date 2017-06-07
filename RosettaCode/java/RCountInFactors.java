
/**
 * @version 
 * @author 
 */
public class RCountInFactors {

  /**
   * @param args
   */
  public static void main(String[] args) {

    for (int i = 1; i<= 10; i++) {
      System.out.println(i + " = "+ countInFactors(i));
    }

    for (int i = 9991; i <= 10000; i++) {
      System.out.println(i + " = "+ countInFactors(i));
    }

    return;
  }

  /**
   * @param n 
   * @return
   */
  private static String countInFactors(int n) {

    String factor;
    if (n == 1) {
      //return "1";
      factor = "1";
    }
    else {
      StringBuilder sb = new StringBuilder();

      n = checkFactor(2, n, sb);
      if (n == 1) {
        factor = sb.toString();
      }
      else {
        n = checkFactor(3, n, sb);
        if (n == 1) {
          factor = sb.toString();
        }
        else {
          for (int i = 5; i <= n; i += 2) {
            if (i % 3 == 0) {
              continue;
            }
            n = checkFactor(i, n, sb);
            if (n == 1) {
              break;
            }
          }
          factor = sb.toString();
        }
      }
    }

    return factor;
  }

  /**
   * @param mult
   * @param n 
   * @param sb
   * @return
   */
  private static int checkFactor(int mult, int n, StringBuilder sb) {

    while (n % mult == 0 ) {
      if (sb.length() > 0) {
        sb.append(" x ");
      }
      sb.append(mult);
      n /= mult;
    }

    return n;
  }
}

