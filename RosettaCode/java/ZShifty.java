
public class ZShifty {

  public static void main(String[] args) {
    int a0, a1, a2, a3, sv;
    if (args.length <= 0) {
      sv = 2;
    }
    else {
      sv = Integer.parseInt(args[0]);
    }

    a0 = 1;                 report("a0", a0);
    a0 = 1 << sv;           report("a0", a0);
    a0 = 1 * ((int) Math.pow(2, sv)); report("a0", a0); //<<
    a0 = 1  >> sv; report("a0", a0);
    a1 = (int) Math.floor(1 / Math.pow(2, sv)); report("a0", a0); //>>
    a1 = 1 >>> sv; report("a0", a0);
    System.out.println();

    a1 = 0x00030003;        report("a1", a1);
    a1 = 0x00030003  << sv; report("a1", a1);
    a1 = 0x00030003  * ((int) Math.pow(2, sv)); report("a1", a1); //<<
    a1 = 0x00030003  >> sv; report("a1", a1);
    a1 = (int) Math.floor(0x00030003 / Math.pow(2, sv)); report("a1", a1); //>>
    a1 = 0x00030003 >>> sv; report("a1", a1);
    System.out.println();

    a2 = 0x80080003;        report("a2", a2);
    a2 = 0x80080003  << sv; report("a2", a2);
    a2 = 0x80080003  * ((int) Math.pow(2, sv)); report("a2", a2); //<<
    a2 = 0x80080003  >> sv; report("a2", a2);
    a2 = (int) Math.floor(0x80080003 / Math.pow(2, sv)); report("a2", a2); //>>
    a2 = 0x80080003 >>> sv; report("a2", a2);
    System.out.println();

    a3 = 0x40030003;       report("a3", a3);
    a3 = 0x40030003  << sv; report("a3", a3);
    a3 = 0x40030003  * ((int) Math.pow(2, sv)); report("a3", a3); //<<
    a3 = 0x40030003  >> sv; report("a3", a3);
    a3 = (int) Math.floor(0x40030003 / Math.pow(2, sv)); report("a3", a3); //>>
    a3 = 0x40030003 >>> sv; report("a3", a3);
    System.out.println();

    return;
  }

  public static void report(String vn, int iv) {
    System.out.printf("%1$s: %2$08x, %2$b, %2$16d%n", vn, iv);
    return;
  }
}

