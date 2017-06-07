/* Generated from 'RFindLimitOfRecursion.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RFindLimitOfRecursion{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="RFindLimitOfRecursion.nrx";
 
 public static void main(java.lang.String $0s[]){
  memoryInfo();
  digDeeper(0);
  return;}

 /**
  * Just keep digging
  * @param level depth gauge
  */
 
 private static void digDeeper(int level){
  java.lang.Error ex=null;
  {try{
   digDeeper(level+1);
  }
  catch (java.lang.Error $1){ex=$1;
   java.lang.System.out.println("Recursion got"+" "+level+" "+"levels deep on this system.");
   java.lang.System.out.println("Recursion stopped by"+" "+ex.getClass().getName());
  }}
  return;
  }

 /**
  * Display some memory usage from the JVM
  * @see ManagementFactory
  * @see MemoryMXBean
  * @see MemoryUsage
  */
 
 private static void memoryInfo(){
  java.lang.management.MemoryMXBean mxBean;
  java.lang.management.MemoryUsage hmMemoryUsage;
  java.lang.management.MemoryUsage nmMemoryUsage;
  mxBean=java.lang.management.ManagementFactory.getMemoryMXBean(); // get the MemoryMXBean
  hmMemoryUsage=mxBean.getHeapMemoryUsage(); // get the heap MemoryUsage object
  nmMemoryUsage=mxBean.getNonHeapMemoryUsage(); // get the non-heap MemoryUsage object
  netrexx.lang.RexxIO.Say("JVM Memory Information:");
  netrexx.lang.RexxIO.Say("      Heap:"+" "+hmMemoryUsage.toString());
  netrexx.lang.RexxIO.Say("  Non-Heap:"+" "+nmMemoryUsage.toString());
  netrexx.lang.RexxIO.Say($01.left(new netrexx.lang.Rexx((byte)120),new netrexx.lang.Rexx('-')));
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RFindLimitOfRecursion(){return;}
 }
