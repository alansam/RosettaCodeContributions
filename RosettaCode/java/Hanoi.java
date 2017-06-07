/* http://sorarogar.blogspot.com/2009/11/iterative-algorithm-for-tower-of-hanoi.html */

import java.lang.Math;
import java.lang.*;
import javax.swing.*;

public class Hanoi {

  public static void main (String[] args) {

    String num = JOptionPane.showInputDialog("Enter number of disks");
    int num1 = Integer.parseInt(num);

    int limit = (1 << num1) - 1;

    for (int i_ = 0; i_ < limit; i_++) {
      int d_ = disk(i_);
      int movements = ((i_ >> d_) + 1) >> 1;
      int direction = 2 - (num1 + d_) % 2;
      int source = (movements * direction) % 3;
      int dest = (source + direction) % 3;

      String dMsg = "Moving disk " + d_ + " from tower " + source + " to tower " + dest;
      String dTitle = "Tower of Hanoi";
      JOptionPane.showMessageDialog(null, dMsg, dTitle, JOptionPane.PLAIN_MESSAGE);
    }
  }

  //disk that will be moved in step i_
  static int disk(int i_) {
    int g_;
    int x_ = i_ + 1;
    for (g_ = 0; x_ % 2 == 0; g_++) {
      x_ /= 2;
    }
    return g_;
  }
}

