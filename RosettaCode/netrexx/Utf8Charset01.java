/*
 */

import java.io.UnsupportedEncodingException;

/**
 * <h3>Core Java Technologies Tech Tips</h3>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://blogs.oracle.com/CoreJavaTechTips/entry/the_overhaul_of_java_utf">http://blogs.oracle.com/CoreJavaTechTips/entry/the_overhaul_of_java_utf</a>
 */
class Utf8Charset01 {

  /**
   * Driver
   *
   * @param args
   */
  public static void main(String[] args) {

    try { 
      nonShortestTwoByteForm();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

    return;
  }

  /**
   * @throws UnsupportedEncodingException
   */
  protected static void nonShortestTwoByteForm() throws UnsupportedEncodingException {

    byte[] bb = new byte[2];
    for (int b1 = 0xc0; b1 < 0xc2; b1++) {
      for (int b2 = 0x80; b2 < 0xc0; b2++) {
        bb[0] = (byte) b1;
        bb[1] = (byte) b2;
        String cstr = new String(bb, "UTF8");
        System.out.println("<char>" + cstr + "</char>");
        char c_ = cstr.toCharArray()[0];

        System.out.printf("[%02x, %02x] -> U+%04x [%s]%n", b1, b2, c_ & 0xffff, (c_ >= 0x20) ? cstr : "ctrl");
      }
    }

    return;
  }
}

