/* http://wiki.answers.com/Q/Iterative_Algorithm_for_towers_of_hanoi */

public class RTowersOfHanoi {

  public static void main(String[] args) {
    int discs;
    if (args.length > 0) {
      try {
        discs = Integer.parseInt(args[0]);
      }
      catch (NumberFormatException nx) {
        discs = 4;
      }
    }
    else {
      discs = 4;
    }

    new RTowersOfHanoi().start(discs);

    return;
  }

  public void start() {
    start(4);
    return;
  }

  public void start(int discs) {
    String[] tOH = showSteps(discs);
    System.out.println("Towers of Hanoi step by step!");

    for (int k_ = 0; k_ < tOH.length; k_++) {
      System.out.printf("Step %5d: Move a disk from %c to %c%n", (k_ + 1), tOH[k_].charAt(0), tOH[k_].charAt(1));
    }

    return;
  }

  public String[] changeString(String[] array, char a_, char b_){
    for (int i_ = 0; i_ < array.length; i_++) {
      for (int j_ = 0; j_ < array[i_].length(); j_++) {
        if (array[i_].charAt(j_) == b_) {
          array[i_] = array[i_].substring(0, j_) + a_ + array[i_].substring(j_ + 1);
        }
        else if (array[i_].charAt(j_) == a_) {
          array[i_] = array[i_].substring(0, j_) + b_ + array[i_].substring(j_ + 1);
        }
      }
    }

    return array;
  }

  public String[] showSteps(int discs) { //how many disks are there?
    String[] data = { "A", "B", "C", };
    String[] Array = new String[(int) (Math.pow(2, discs)) - 1];

    for (int i_ = 1; i_ <= Array.length; i_ = i_ * 2 + 1) {
      int middle = (i_ - 1) / 2;
      Array[middle] = "AC";
      String[] tempArray;

      tempArray = new String[middle];
      for (int left = 0; left < middle; left++) {
        tempArray[left] = Array[left];
      }

      tempArray = changeString(tempArray, 'C', 'B');
      for (int o_ = 0; o_ < middle; o_++) {
        Array[o_] = tempArray[o_];
      }

      tempArray = changeString(tempArray, 'B', 'A');
      tempArray = changeString(tempArray, 'A', 'C');
      for (int o_ = middle + 1; o_ < i_; o_++) {
        Array[o_] = tempArray[o_ - middle - 1];
      }
    }

    return Array;
  }
}

