
import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TEN;

public class RPi {
  final BigInteger TWO   = BigInteger.valueOf(2);
  final BigInteger THREE = BigInteger.valueOf(3);
  final BigInteger FOUR  = BigInteger.valueOf(4);
  final BigInteger SEVEN = BigInteger.valueOf(7);

  BigInteger q_ = ONE;
  BigInteger r_ = ZERO;
  BigInteger t_ = ONE;
  BigInteger k_ = ONE;
  BigInteger n_ = THREE; //BigInteger.valueOf(3);
  BigInteger l_ = THREE; //BigInteger.valueOf(3);

  public void calcPiDigits() {
    BigInteger nn, nr;
    boolean first = true;
    while (true) {
      if (FOUR.multiply(q_).add(r_).subtract(t_).compareTo(n_.multiply(t_)) == -1) {
        System.out.print(n_);
        if (first) {System.out.print("."); first = false;}
        nr = TEN.multiply(r_.subtract(n_.multiply(t_)));
        n_ = TEN.multiply(THREE.multiply(q_).add(r_)).divide(t_).subtract(BigInteger.TEN.multiply(n_));
        q_ = q_.multiply(TEN);
        r_ = nr;
        System.out.flush();
      }
      else {
        nr = TWO.multiply(q_).add(r_).multiply(l_);
        nn = q_.multiply((SEVEN.multiply(k_))).add(TWO).add(r_.multiply(l_)).divide(t_.multiply(l_));
        q_ = q_.multiply(k_);
        t_ = t_.multiply(l_);
        l_ = l_.add(TWO);
        k_ = k_.add(ONE);
        n_ = nn;
        r_ = nr;
      }
    }
  }

  public static void main(String[] args) {
    RPi pi = new RPi();
    pi.calcPiDigits();
  }
}

