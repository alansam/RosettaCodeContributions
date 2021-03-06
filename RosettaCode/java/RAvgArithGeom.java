/*
 
        Arithmetic-Geometric Mean of 1 & 1/sqrt(2)
 
        Brendan Shaklovitz
        5/29/12
 
*/

public class RAvgArithGeom {
  public static double agm(double a, double g) {
    double a1 = a;
    double g1 = g;
    while (Math.abs(a1 - g1) >= Math.pow(10, -14)){
      double aTemp = (a1 + g1) / 2.0;
      g1 = Math.sqrt(a1 * g1);
      a1 = aTemp;
    }
    return a1;
  }
  
  public static void main(String[] args) {
    System.out.println(agm(1, 1 /Math.sqrt(2)));
    return;
  }
}

