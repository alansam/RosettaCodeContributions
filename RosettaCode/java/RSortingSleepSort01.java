
import java.util.concurrent.CountDownLatch;

public class RSortingSleepSort01 {

  public static void sleepSortAndPrint(int[] nums) {

    final CountDownLatch doneSignal = new CountDownLatch(nums.length);

    for (final int num : nums) {
      new Thread(new Runnable() {
        public void run() {
          doneSignal.countDown();
          try {
            doneSignal.await();
  
            //using straight milliseconds produces unpredictable
            //results with small numbers
            //using 1000 here gives a nifty demonstration
            Thread.sleep(num * 100);
            System.out.println(num);
          }
          catch (InterruptedException ex) {
            ex.printStackTrace();
          }

          return;
        }
      }).start();
    }

    return;
  }

  public static void main(String[] args) {

    int[] nums = new int[args.length];

    for (int i_ = 0; i_ < args.length; i_++)
      nums[i_] = Integer.parseInt(args[i_]);
    sleepSortAndPrint(nums);

    return;
  }
}
