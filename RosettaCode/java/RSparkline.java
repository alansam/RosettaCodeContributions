
/**
 *
 */
public class RSparkline {

  String bars = "\u2581\u2582\u2583\u2584\u2585\u2586\u2587\u2588"; //"▁▂▃▄▅▆▇█";

  /**
   * @param args
   */
  public static void main(String[] args) {

    RSparkline now = new RSparkline();
    float[][] numbers = {
      { 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1, },
      { 1.5f, 0.5f, 3.5f, 2.5f, 5.5f, 4.5f, 7.5f, 6.5f, },
    };
    for (float[] nums : numbers) {
      now.runsparkLine(nums);
    }
    return;
  }

  /**
   * @param nums
   */
  public void runsparkLine(float[] nums) {
    display1D(nums);
    System.out.println(getSparkline(nums));
    return;
  }

  /**
   * @param arr
   */
  public void display1D(float[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    return;
  }

  /**
   * @param arr
   */
  public String getSparkline(float[] arr) {
    float min = Integer.MAX_VALUE;
    float max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min=arr[i];
      }
      if (arr[i] > max) {
        max=arr[i];
      }
    }
    float range = max - min;
    int num = bars.length() - 1;
    String line = "";
    for (int i = 0; i < arr.length; i++) {
      line += bars.charAt((int) Math.ceil(((arr[i] - min) / range * num)));
    }
    return line;
  }
}

/*
1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 7.0 6.0 5.0 4.0 3.0 2.0 1.0 
▁▂▃▄▅▆▇█▇▆▅▄▃▂▁
1.5 0.5 3.5 2.5 5.5 4.5 7.5 6.5 
▂▁▄▃▆▅█▇
 */

