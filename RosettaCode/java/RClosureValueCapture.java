
import java.util.function.Supplier;
import java.util.ArrayList;

/**
 * <h2>Closures/Value capture</h2>
 * <p>
 * Task: Create a list of 10 functions, in the simplest manner possible (anonymous functions are encouraged),
 * such that the function at index i (you may choose to start i from either 0 or 1), when run, should return
 * the square of the index, that is, i2. Display the result of running any but the last function, to demonstrate
 * that the function indeed remembers its value.
 * </p>
 * <p>
 * Goal: To demonstrate how to create a series of independent closures based on the same template but maintain
 * separate copies of the variable closed over. In imperative languages, one would generally use a loop with
 * a mutable counter variable. For each function to maintain the correct number, it has to capture the value
 * of the variable at the time it was created, rather than just a reference to the variable, which would have
 * a different value by the time the function was run.
 * </p>
 *
 * @see http://rosettacode.org/wiki/Closures/Value_capture#Java
 * @author Rosetta Code
 * @version 1.0
 */
public class RClosureValueCapture {

  /**
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<Supplier<Integer>> funcs = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      int j = i;
      funcs.add(() -> j * j);
    }
   
    Supplier<Integer> foo = funcs.get(3);
    System.out.println(foo.get()); // prints "9"

    return;
  }
}

