
import java.util.*;
 
public class RAvgMode {
  public static <T> List<T> mode(List<? extends T> coll) {
    Map<T, Integer> seen = new HashMap<T, Integer>();
    int max = 0;
    List<T> maxElems = new ArrayList<T>();
    for (T value : coll) {
      if (seen.containsKey(value))
        seen.put(value, seen.get(value) + 1);
      else
        seen.put(value, 1);
      if (seen.get(value) > max) {
        max = seen.get(value);
        maxElems.clear();
        maxElems.add(value);
      } else if (seen.get(value) == max) {
        maxElems.add(value);
      }
    }
    return maxElems;
  }
  
  public static void main(String[] args) {
    System.out.println(mode(Arrays.asList(1, 3, 6, 6, 6, 6, 7, 7, 12, 12, 17))); // prints [6]
    System.out.println(mode(Arrays.asList(1, 1, 2, 4, 4))); // prints [1, 4]
    System.out.println(mode(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1))); // prints [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    System.out.println(mode(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, .11))); // prints [0]
    System.out.println(mode(Arrays.asList(30, 10, 20, 30, 40, 50, -100, 4.7, -11e2))); // prints [30]
    System.out.println(mode(Arrays.asList(30, 10, 20, 30, 40, 50, -100, 4.7, -11e2, -11e2))); // prints [30, -11e2]
    System.out.println(mode(Arrays.asList(1, 8, 6, 0, 1, 9, 4, 6, 1, 9, 9, 9))); // prints [9]
    System.out.println(mode(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11))); // prints [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    System.out.println(mode(Arrays.asList(8, 8, 8, 2, 2, 2))); // prints [8, 2]
    System.out.println(mode(Arrays.asList("cat", "kat", "Cat", "emu", "emu", "Kat"))); // prints [emu]
    System.out.println(mode(Arrays.asList(0, 1, 2, 3, 3, 3, 4, 4, 4, 4, 1, 0))); // prints [4]
    System.out.println(mode(Arrays.asList(2, 7, 1, 8, 2))); // prints [2]
    System.out.println(mode(Arrays.asList(2, 7, 1, 8, 2, 8))); // prints [8, 2]
    System.out.println(mode(Arrays.asList('E', 'n', 'z', 'y', 'k', 'l', 'o', 'p', 'ä', 'd', 'i', 'e'))); // prints [E, n, z, y, k, l, o, p, ä, d, i, e]
    System.out.println(mode(Arrays.asList('E', 'n', 'z', 'y', 'k', 'l', 'o', 'p', 'ä', 'd', 'i', 'e', 'ä'))); // prints [ä]
    System.out.println(mode(Arrays.asList(3, 1, 4, 1, 5, 9, 7, 6))); // prints [1]
    System.out.println(mode(Arrays.asList(3, 1, 4, 1, 5, 9, 7, 6, 3))); // prints [3, 1]
    return;
  }
}
