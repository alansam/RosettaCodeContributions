
public class RSierpinskiTriangle01 {

  public static void triangle(int n) {
    n = 1 << n;
    StringBuilder line= new StringBuilder(); // use a "mutable String"
    char filler = 'A';
    char t = 0;
    char u = 0; // avoid warnings

    for (int i = 0;i <= 2 * n; ++i) {
      line.append(" "); //start empty
    }

    line.setCharAt(n, filler); //with the top point of the triangle
    for (int i = 0; i < n; ++i) {
      System.out.println(line);
      u = filler;
      for (int j = n - i;j < n + i + 1; ++j) {
        t = (line.charAt(j - 1) == line.charAt(j + 1) ? ' ' : filler);
        line.setCharAt(j - 1, u);
        u = t;
      }
      line.setCharAt(n + i, t);
      line.setCharAt(n + i + 1, filler);
    }
    return;
  }

  public static void main(String[] args) {
    int order;

    if (args.length <= 0) {
      order = 4;
    }
    else {
      order = Integer.parseInt(args[0]);
    }
    triangle(order);

    return;
  }
}

