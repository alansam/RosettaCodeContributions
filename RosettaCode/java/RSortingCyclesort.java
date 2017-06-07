
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import netrexx.lang.Rexx;

/**
 * A cycle sort.
 * For more information on cycle sorting, see the <a href="http://en.wikipedia.org/wiki/Cycle_sort">Wikipedia</a> entry.
 * @author Rosetta Code
 * @version 1.0
 * @since 1.5
 * @see <a href="http://en.wikipedia.org/wiki/Cycle_sort">en.wikipedia.org/wiki/Cycle_sort</a>
 *
 */
public class RSortingCyclesort {

  private Comparable[] list;

  /**
   * Constructor
   * @param list an array of {@link Comparable} objects
   */
  public RSortingCyclesort(Comparable[] list) {
    this.list = list;
    return;
  }

  /**
   * Sort an array in place and return the number of writes.
   * @return the number of write operations.
   */
  public int cycleSort() {
    int writes;
    writes = 0;

    // Loop through the array to find cycles to rotate.
    cycle: for (int cycleStart = 0; cycleStart < list.length - 1; ++cycleStart) {
      int pos;
      Comparable item;
      Comparable swap_tmp;

      item = list[cycleStart];

      // Find where to put the item.
      pos = cycleStart;
      for (int i = cycleStart + 1; i < list.length; ++i) {
        if (list[i].compareTo(item) < 0) {
          ++pos;
        }
      }

      // If the item is already there, this is not a cycle.
      if (pos == cycleStart) {
        continue cycle;
      }

      // Otherwise, put the item there or right after any duplicates.
      while (item.compareTo(list[pos]) == 0) {
        ++pos;
      }
      swap_tmp = list[pos];
      list[pos] = item;
      item = swap_tmp;
      ++writes;

      // Rotate the rest of the cycle.
      while (pos != cycleStart) {

        // Find where to put the item.
        pos = cycleStart;
        for (int i = cycleStart + 1; i < list.length; ++i) {
          if (list[i].compareTo(item) < 0) {
            ++pos;
          }
        }

        // Put the item there or right after any duplicates.
        while (item.compareTo(list[pos]) == 0) {
          ++pos;
        }
        swap_tmp = list[pos];
        list[pos] = item;
        item = swap_tmp;
        ++writes;
      }
    }

    return writes;
  }

  /**
   * Driver
   * @param args
   * @since 1.5
   */
  public static void main(String[] args) {

    RSortingCyclesort local;
    List<Comparable[]> samples;
    int writes;

    samples = new ArrayList<>();
    samples.add(new Integer[] { 1, 9, 3, 5, 8, 4, 7, 0, 6, 2, });
    samples.add(new Short[] { 0, 1, 2, 2, 2, 2, 1, 9, 3, 5, 5, 8, 4, 7, 0, 6, });
    samples.add(new Long[] { 5L, 0L, 1L, 2L, 2L, 3L, 5L, 1L, 1L, 0L, 5L, 6L, 9L, 8L, 0L, 1L, });
    samples.add(new String[] { "Greygill Hole", "Ogof Draenen", "Ogof Ffynnon Ddu", "Malham Tarn Pot", });
    samples.add(new BigDecimal[] {
        BigDecimal.valueOf(-3.14),
        BigDecimal.valueOf(3), BigDecimal.valueOf(1), BigDecimal.valueOf(4), BigDecimal.valueOf(1), BigDecimal.valueOf(5),
        BigDecimal.valueOf(9), BigDecimal.valueOf(2), BigDecimal.valueOf(6), BigDecimal.valueOf(5), BigDecimal.valueOf(3),
        BigDecimal.valueOf(5), BigDecimal.valueOf(8), BigDecimal.valueOf(9), BigDecimal.valueOf(7), BigDecimal.valueOf(9),
        BigDecimal.valueOf(3), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(8), BigDecimal.valueOf(4),
        BigDecimal.valueOf(6), BigDecimal.valueOf(2), BigDecimal.valueOf(6), BigDecimal.valueOf(4), BigDecimal.valueOf(3),
        BigDecimal.valueOf(3), BigDecimal.valueOf(8), BigDecimal.valueOf(3), BigDecimal.valueOf(2), BigDecimal.valueOf(7),
        BigDecimal.valueOf(9), BigDecimal.valueOf(5), BigDecimal.valueOf(0), BigDecimal.valueOf(2), BigDecimal.valueOf(8),
        BigDecimal.valueOf(8), BigDecimal.valueOf(4), 
        });
    samples.add(new Rexx[] {
        new Rexx("George Washington: Virginia"),
        new Rexx("John Adams: Massachusetts"),
        new Rexx("Thomas Jefferson: Virginia"),
        new Rexx("James Madison: Virginia"),
        new Rexx("James Monroe: Virginia"),
        });

    for (Comparable[] array : samples) {
      local = new RSortingCyclesort(array);
      System.out.printf("Input list  %s%n", Arrays.asList(local.list).toString());
      writes = local.cycleSort();
      System.out.printf("Sorted list %s%n", Arrays.asList(local.list).toString());
      System.out.printf("Total number of writes: %d%n%n", writes);
    }

    return;
  }
}

