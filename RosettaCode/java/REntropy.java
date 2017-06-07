
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashMap;

public class REntropy {

  public REntropy() {
    return;
  }

  @SuppressWarnings("boxing")
  public double getShannonEntropy(String s) {
    double e = 0.0D;
    int n = 0;
    Character cx;
    StringBuilder chars = new StringBuilder("");
    String charx;
    Map<Character, Integer> occ = new HashMap<>();
    Map<Character, Double> p = new HashMap<>();

    for (int c_ = 0; c_ < s.length(); ++c_) {
      cx = s.charAt(c_);
      if (!chars.toString().contains(cx.toString())) {
        chars.append(cx);
      }
      if (occ.containsKey(cx)) {
        occ.put(cx, occ.get(cx) + 1);
      }
      else {
        occ.put(cx, 1);
      }
      ++n;
    }

    charx = chars.toString();
    for (int ci = 0; ci < charx.length(); ++ci) {
      cx = charx.charAt(ci);
      p.put(cx, (double) occ.get(cx) / n);
    }

    for (int ci = 0; ci < charx.length(); ++ci) {
      double pl;
      cx = charx.charAt(ci);
      pl = log2(p.get(cx));
      e += p.get(cx) * pl;
    }
    return -e;
  }

  private static double log2(double a) {
    return Math.log(a) / Math.log(2);
  }
  public static void main(String[] args) {
    REntropy that = new REntropy();
    String[] sstr = {
      "1223334444",
      "1223334444555555555", 
      "122333", 
      "1227774444",
      "aaBBcccDDDD",
      "1234567890abcdefghijklmnopqrstuvwxyz",
      "Rosetta Code",
    };

    for (String ss : sstr) {
      double entropy = that.getShannonEntropy(ss);
      System.out.printf("Shannon entropy of %40s: %.12f%n", "\"" + ss + "\"", entropy);
    }
    return;
  }
}

