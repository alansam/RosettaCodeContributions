
import java.util.Collections;
import java.util.LinkedList;

public class RCombinations {

  public static void main(String[] args) {
    System.out.println(comb(3, 5));
    return;
  }

  public static String bitprint(int uu) {
    String ss = "";
    for (int nx = 0; uu > 0; ++nx, uu >>= 1) {
      if ((uu & 1) > 0) {
        ss += nx + " ";
      }
    }
    return ss;
  }

  public static int bitcount(int uu) {
    int nx;
    for (nx = 0; uu > 0; ++nx, uu &= (uu - 1)); //Turn the last set bit to a 0
    return nx;
  }

  public static LinkedList<String> comb(int mm, int nn) {
    LinkedList<String> ss = new LinkedList<String>();
    for (int ux = 0; ux < 1 << nn; ux++) {
      if (bitcount(ux) == mm) ss.push(bitprint(ux));
    }
    Collections.sort(ss);
    return ss;
  }
}

