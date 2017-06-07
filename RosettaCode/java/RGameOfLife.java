
public class RGameOfLife {

  public static void main(String[] args) {
    String[] dish = {
      "-#-",
      "-#-",
      "-#-",
    };
    int gens = 3;
    for (int i_ = 0; i_ < gens; i_++) {
      System.out.println("Generation " + i_ + ":");
      print(dish);
      dish = life(dish);
    }
    return;
  }

  public static String[] life(String[] dish) {
    String[] newGen = new String[dish.length];
    for (int row = 0; row < dish.length; row++) { //each row
      newGen[row] = "";
      for (int i_ = 0; i_ < dish[row].length(); i_++) { //each char in the row
        String above = ""; //neighbors above
        String same  = ""; //neighbors in the same row
        String below = ""; //neighbors below
        if (i_ == 0) { //all the way on the left
          //no one above if on the top row
          //otherwise grab the neighbors from above
          above = (row == 0) ? null : dish[row - 1].substring(i_, i_ + 2);
          same  = dish[row].substring(i_ + 1, i_ + 2);
          //no one below if on the bottom row
          //otherwise grab the neighbors from below
          below = (row == dish.length - 1) ? null : dish[row + 1].substring(i_, i_ + 2);
        }
        else if (i_ == dish[row].length() - 1) { //right
          //no one above if on the top row
          //otherwise grab the neighbors from above
          above = (row == 0) ? null : dish[row - 1].substring(i_ - 1, i_ + 1);
          same= dish[row].substring(i_ - 1, i_);
          //no one below if on the bottom row
          //otherwise grab the neighbors from below
          below= (row == dish.length - 1) ? null : dish[row + 1].substring(i_ - 1, i_ + 1);
        }
        else { //anywhere else
          //no one above if on the top row
          //otherwise grab the neighbors from above
          above = (row == 0) ? null : dish[row - 1].substring(i_ - 1, i_ + 2);
          same  = dish[row].substring(i_ - 1, i_) + dish[row].substring(i_ + 1, i_ + 2);
          //no one below if on the bottom row
          //otherwise grab the neighbors from below
          below = (row == dish.length - 1) ? null : dish[row + 1].substring(i_ - 1, i_ + 2);
        }
        int neighbors = getNeighbors(above, same, below);
        if (neighbors < 2 || neighbors > 3) {
          newGen[row] += "-"; //<2 or >3 neighbors -> die
        }
        else if (neighbors == 3) {
          newGen[row] += "#"; //3 neighbors -> spawn/live
        }
        else {
          newGen[row] += dish[row].charAt(i_); //2 neighbors -> stay
        }
      }
    }
    return newGen;
  }

  public static int getNeighbors(String above, String same, String below) {
    int ans = 0;
    if (above != null) { //no one above
      for (char x_: above.toCharArray()) { //each neighbor from above
        if (x_ == '#') {
          ans++; //count it if someone is here
        }
      }
    }
    for (char x_ : same.toCharArray()) { //two on either side
      if (x_ == '#') {
        ans++; //count it if someone is here
      }
    }
    if (below != null) { //no one below
      for(char x_ : below.toCharArray()){ //each neighbor below
        if (x_ == '#') {
          ans++; //count it if someone is here
        }
      }
    }
    return ans;
  }

  public static void print(String[] dish) {
    for (String s_: dish) {
      System.out.println(s_);
    }
    return;
  }
}

/*
Output:
Generation 0:
-#-
-#-
-#-
Generation 1:
---
###
---
Generation 2:
-#-
-#-
-#-
*/

