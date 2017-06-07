
public class RSortingPancakesort00 {

  private int[] heap;

  RSortingPancakesort00(int[] numbers) {
    heap = numbers;
    sort(numbers.length, 1);

    return;
  }

  public void flip(int n_) {
    for (int i_ = 0; i_ < (n_ + 1) / 2; ++i_) {
      int tmp       = heap[i_];
      heap[i_]      = heap[n_ - i_];
      heap[n_ - i_] = tmp;
    }
    System.out.printf("flip(000..%03d): %s%n", n_, toString());

    return;
  }

  public int[] minmax(int n_) {
    int xMin, xMax;
    xMin = xMax = heap[0];
    int posMin = 0, posMax = 0;

    for (int i_ = 1; i_ < n_; ++i_) {
      if (heap[i_] < xMin) {
        xMin = heap[i_];
        posMin = i_;
      }
      else if (heap[i_] > xMax) {
        xMax = heap[i_];
        posMax = i_;
      }
    }

    return new int[] { posMin, posMax, };
  }

  public void sort(int n_, int dir) {
    if (n_ == 0) { return; }

    int[] mM = minmax(n_);
    int bestXPos = mM[dir];
    int altXPos = mM[1 - dir];
    boolean flipped = false;

    if (bestXPos == n_ - 1) {
      --n_;
    }
    else if (bestXPos == 0) {
      flip(n_ - 1);
      --n_;
    }
    else if (altXPos == n_ - 1) {
      dir = 1 - dir;
      --n_;
      flipped = true;
    }
    else {
      flip(bestXPos);
    }

    sort(n_, dir);

    if (flipped) {
      flip(n_);
    }

    return;
  }

  public String toString() {
    String info = "";
    for (int x_ : heap) {
      info += x_ + " ";
    }
    return info;
  }

  public static void main(String[] args) {
    int[] numbers = new int[args.length];
    for (int i_ = 0; i_ < args.length; ++i_)
      numbers[i_] = Integer.valueOf(args[i_]);

    RSortingPancakesort00 pancakes = new RSortingPancakesort00(numbers);
    System.out.println(pancakes);

    return;
  }
}

