
import java.util.List;
import java.util.Arrays;

public class RSortingPancakesort01 {

  public static List<Integer> sort(List<Integer> list) {

    if (list.size() > 1) {
      int max_num_pos;
      for (int i = list.size(); i > 1; --i) {
        max_num_pos = 0;
        for (int a = 0; a < i; ++a) {
          if (list.get(a).compareTo(list.get(max_num_pos)) > 0) {
            max_num_pos = a;
          }
        }
        if (max_num_pos == i - 1) {
          continue;
        }
        if (max_num_pos > 0) {
          flip(list, list.size(), max_num_pos + 1);
        }
        flip(list, list.size(), i);
      }
    }

    return list;
  }

  private static List<Integer> flip(List<Integer> list, int pos) {
    for (int i = 0; i < --pos; ++i) {
      Integer temp = list.get(i);
      list.set(i, list.get(pos));
      list.set(pos, temp);
    }
    return list;
  }

  public static void main(String[] args) {

    @SuppressWarnings("unchecked")
    List<Integer>[] lists = new List[] {
      Arrays.asList(52, 26, 73, 73, 66, 7, 59, 54, 20),
      Arrays.asList(10, -9, 8, -7, 6, -5, 4, -3, 2, -1, 0, -10, 9, -8, 7, -6, 5, -4, 3, -2, 1),
    };

    for (List<Integer> sample : lists) {
      System.out.println(sample);
      System.out.println(sort(sample));
    }

    return;
  }
}


