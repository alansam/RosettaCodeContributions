/* 
 * The authors of this work have released all rights to it and placed it
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
public class MillerRabin32 {

  /**
   * @param base
   * @param power
   * @param modulus
   * @return
   */
  private static int modular_exponent_32(int base, int power, int modulus) {
    long result = 1;
    for (int i = 31; i >= 0; i--) {
      result = (result*result) % modulus;
      if ((power & (1 << i)) != 0) {
        result = (result*base) % modulus;
      }
    }
    return (int)result; // Will not truncate since modulus is an int
  }

  /**
   * @param a
   * @param n
   * @return
   */
  private static boolean miller_rabin_pass_32(int a, int n) {
    int d = n - 1;
    int s = Integer.numberOfTrailingZeros(d);
    d >>= s;
    int a_to_power = modular_exponent_32(a, d, n);
    if (a_to_power == 1) {
      return true;
    }
    for (int i = 0; i < s - 1; i++) {
      if (a_to_power == n - 1) {
        return true;
      }
      a_to_power = modular_exponent_32(a_to_power, 2, n);
    }
    if (a_to_power == n - 1) {
      return true;
    }
    return false;
  }

  /**
   * @param a
   * @param n
   * @return
   */
  public static boolean miller_rabin_32(int n) {
    if (n <= 1) {
      return false;
    }
    else if (n == 2) {
      return true;
    }
    else if (miller_rabin_pass_32(2, n) && (n <= 7 || miller_rabin_pass_32(7, n)) && (n <= 61 || miller_rabin_pass_32(61, n))) {
      return true;
    }
    else {
      return false;
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(miller_rabin_32(n) ? "PRIME" : "COMPOSITE");
    return;
  }
}
