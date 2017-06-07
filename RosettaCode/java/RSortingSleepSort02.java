
import java.util.concurrent.CountDownLatch;
 
public class RSortingSleepSort02 {

  public static void sleepSortAndPrint(int[] nums) {

    final CountDownLatch doneSignal = new CountDownLatch(nums.length);

    for (final int num : nums) {
      final int tnum = num;
      new Thread(new RSortingSleepSort02.MyRunnable()).start();
    }

    return;
  }

  public static void main(String[] args) {

    int[] nums = new int[args.length];

    for (int i_ = 0; i_ < args.length; i_++) {
      nums[i_] = Integer.parseInt(args[i_]);
    }

    sleepSortAndPrint(nums);

    return;
  }

  private static class MyRunnable implements Runnable {

    public void run() {

      doneSignal.countDown();

      try {
        doneSignal.await();

        //using straight milliseconds produces unpredictable
        //results with small numbers
        //using 1000 here gives a nifty demonstration
        Thread.sleep(tnum * 100);
        System.out.println(tnum);
      }
      catch (InterruptedException ex) {
        ex.printStackTrace();
      }

      return;
    }
  }
}
