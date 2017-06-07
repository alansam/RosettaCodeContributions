
public class RFindLimitOfRecursionJ {

  private static boolean ALIVE = true;

  private RFindLimitOfRecursionJ() {
    return;
  }

  public static void main(String[] args) {
    memoryInfo();
    digDeeper(0);
    return;
  }

  private static synchronized void digDeeper(int level) {

    if (ALIVE) {
      try {
        digDeeper(level + 1);
      }
      catch (java.lang.Error ex) {
        System.out.println("Recursion got " + level + " levels deep on this system.");
        System.out.println(ex.getClass().getName());
        ALIVE = false;
      }
    }
    return;
  }

  private static void memoryInfo(){
    java.lang.management.MemoryMXBean mxBean;
    java.lang.management.MemoryUsage hmBean;
    java.lang.management.MemoryUsage nmBean;
  
    mxBean=java.lang.management.ManagementFactory.getMemoryMXBean();
    hmBean=mxBean.getHeapMemoryUsage();
    nmBean=mxBean.getNonHeapMemoryUsage();
  
    System.out.println("    Heap: " + hmBean.toString());
    System.out.println("Non-Heap: " + nmBean.toString());
    System.out.println();
  
    return;
  }
}

