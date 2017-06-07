
import java.io.Console;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

/**
 *
 * @author Alan Sampson
 * @version 0.1
 */
class TxConsole {

  private static final String FMT_001;
  private static final String FMT_002;

  private Console console;

  static {
    FMT_001 = "Give me the diameter of the circle (e.g. %.6f): ";
    FMT_002 = "A circle of diameter %.6f has an area of %.6f%n";
  }

  /**
   *
   */
  public TxConsole() {
    setConsole(System.console());
    return;
  }

  public void runSample(String[] args) {
    if (getConsole() != null) {
      double diameter = 10.0;
      double area;
      diameter = Double.parseDouble(getConsole().readLine(FMT_001, diameter));
      area = PI * pow(diameter / 2, 2);
      getConsole().format(FMT_002, diameter, area);
    }
    return;
  }

  /**
   * Getter bean for console
   * @return cons
   */
  public Console getConsole() {
    return console;
  }
  /**
   * Setter bean for console
   * @param cons
   */
  public void setConsole(Console console) {
    this.console = console;
    return;
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    (new TxConsole()).runSample(args);
    return;
  }
}

