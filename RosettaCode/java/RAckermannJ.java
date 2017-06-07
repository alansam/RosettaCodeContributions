
import java.math.BigInteger;

/**
 *
 */
class RAckermannJ {

  /**
   *
   */
  public static void main(String[] args) {

    double nanoFactor = Math.pow(10, 9);
    long t1 = System.nanoTime();
    for (int m_ = 0; m_ <= 4; ++m_) {
      for (int n_ = 0; n_ <= 10; ++n_) {
        BigInteger gack = ack(BigInteger.valueOf((long) m_), BigInteger.valueOf((long) n_));
        System.out.printf("ack(%02d, %02d): %s\n", m_, n_, gack.toString());
      }
      System.out.println();
    }
    long t2 = System.nanoTime();
    double td = t2 - t1;
    System.out.println("Run time in seconds:" + String.valueOf(td / nanoFactor));

    return;
  }

  /**
   *
   */
  public static BigInteger ack(BigInteger m, BigInteger n) {

    BigInteger gack = m.equals(BigInteger.ZERO) ?
      n.add(BigInteger.ONE) :
      ack(m.subtract(BigInteger.ONE), n.equals(BigInteger.ZERO) ?
        BigInteger.ONE : ack(m, n.subtract(BigInteger.ONE)));

    return gack;
  }
}
