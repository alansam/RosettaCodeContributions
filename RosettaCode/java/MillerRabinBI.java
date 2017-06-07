/* The authors of this work have released all rights to it and placed it
 * in the public domain under the Creative Commons CC0 1.0 waiver
 * (http://creativecommons.org/publicdomain/zero/1.0/).
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Retrieved from: http://en.literateprograms.org/Miller-Rabin_primality_test_(Java)?oldid=17585
 */

import java.math.BigInteger;
import java.util.Random;

/**
 * <h2>Miller-Rabin primality test</h2>
 * <p>
 * The <a href="http://en.wikipedia.org/wiki/Miller-Rabin_primality_test">Miller-Rabin primality test</a> is
 * a simple probabilistic algorithm for determining whether a number is prime or composite that is easy to
 * implement. It proves compositeness of a number using the following formulas:
 * </p>
 * <p>
 * Suppose 0 < a < n is coprime to n (this is easy to test using the GCD). Write the number n−1 as 2^s \cdot d,
 * where d is odd. Then, provided that all of the following formulas hold, n is composite:
 * </p>
 * <pre>
 * a^{d} \not\equiv 1\pmod{n}
 * a^{2^rd} \not\equiv -1\pmod{n} for all 0 \le r \le s-1
 * </pre>
 * <p>
 * If a is chosen uniformly at random and n is prime, these formulas hold with probability 1/4. Thus, repeating
 * the test for k random choices of a gives a probability of 1 − 1 / 4k that the number is prime. Moreover, Jaeschke
 * showed that any 32-bit number can be deterministically tested for primality by trying only a=2, 7, and 61.
 * </p>
 *
 * @author Literal Programs
 * @version 1
 * @see <a href="http://en.literateprograms.org/Miller-Rabin_primality_test_(Java)">http://en.literateprograms.org/Miller-Rabin_primality_test_(Java)</a>
 */
public class MillerRabinBI {

  private static final Random rnd = new Random();

  /**
   * @param a
   * @param n
   * @return
   */
  private static boolean miller_rabin_pass(BigInteger a, BigInteger n) {

    BigInteger n_minus_one = n.subtract(BigInteger.ONE);
    BigInteger d = n_minus_one;
    int s = d.getLowestSetBit();
    d = d.shiftRight(s);
    BigInteger a_to_power = a.modPow(d, n);

    if (a_to_power.equals(BigInteger.ONE)) {
      return true;
    }

    for (int i = 0; i < s - 1; i++) {
      if (a_to_power.equals(n_minus_one)) {
        return true;
      }
      a_to_power = a_to_power.multiply(a_to_power).mod(n);
    }

    if (a_to_power.equals(n_minus_one)) {
      return true;
    }

    return false;
  }

  /**
   * @param n
   * @return
   */
  public static boolean miller_rabin(BigInteger n) {

    for (int repeat = 0; repeat < 20; repeat++) {
      BigInteger a;

      do {
        a = new BigInteger(n.bitLength(), rnd);
      } while (a.equals(BigInteger.ZERO));

      if (!miller_rabin_pass(a, n)) {
        return false;
      }
    }
    return true;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {

    if (args[0].equals("test")) {
      BigInteger n = new BigInteger(args[1]);
      System.out.println(n.toString() + "  " + (miller_rabin(n) ? "PRIME" : "COMPOSITE"));
    }
    else if (args[0].equals("genprime")) {
      int nbits = Integer.parseInt(args[1]);
      BigInteger p;
      do {
        p = new BigInteger(nbits, rnd);
        if (p.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) { continue; }
        if (p.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) { continue; }
        if (p.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO)) { continue; }
        if (p.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO)) { continue; }
      } while (!miller_rabin(p));
      System.out.println(p);
    }

    return;
  }
}

