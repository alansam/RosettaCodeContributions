
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// =============================================================================
public class RReturnMultipleVals {

  public static final String K_lipsum = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
  public static final Long   K_1024   = new Long("1024");
  public static final String L        = "L";
  public static final String R        = "R";

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public RReturnMultipleVals() {
    return;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Long nv_;
    String sv_;
    switch (args.length) {
      case 0:
        nv_ = K_1024;
        sv_ = K_lipsum;
        break;
      case 1:
        nv_ = new Long(args[0]);
        sv_ = K_lipsum;
        break;
      case 2:
        nv_ = new Long(args[0]);
        sv_ = args[1];
        break;
      default:
        nv_ = new Long(args[0]);
        sv_ = args[1];
        for (int ix = 2; ix < args.length; ++ix) {
          sv_ = sv_ + " " + args[ix];
        }
        break;
    }

    RReturnMultipleVals lcl;
    Pair<Long, String> rvp;
    Pair<String, Long> pvr;
    List<Object> rvl;
    Map<String, Object> rvm;

    lcl = new RReturnMultipleVals();

    rvp = lcl.getPairFromPair(nv_, sv_); // values returned in a bespoke object
    System.out.println("Results extracted from a composite object:");
    System.out.printf("%s, %s%n%n", rvp.getLeftVal().toString(), rvp.getRightVal().toString());
    pvr = lcl.getPairFromPair(sv_, nv_); // values returned in a bespoke object
    System.out.println("Results extracted from a composite object:");
    System.out.printf("%s, %s%n%n", pvr.getLeftVal().toString(), pvr.getRightVal().toString());

    rvl = lcl.getPairFromList(nv_, sv_); // values returned in a Java Collection object
    System.out.println("Results extracted from a Java Colections \"List\" object:");
    System.out.printf("%s, %s%n%n", rvl.get(0).toString(), rvl.get(1).toString());

    rvm = lcl.getPairFromMap(nv_, sv_); // values returned in a Java Collection object
    System.out.println("Results extracted from a Java Colections \"Map\" object:");
    System.out.printf("%s, %s%n%n", rvm.get(L).toString(), rvm.get(R).toString());

    return;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Return a bespoke object.
  // Permits any number and type of value to be returned
  public <T, U> Pair<T, U> getPairFromPair(T vl_, U vr_) {
    Pair<T, U> rset;
    rset = new Pair<T, U>(vl_, vr_);
    return rset;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Exploit Java Collections classes to assemble a collection of results.
  // This example uses java.util.List
  public List<Object> getPairFromList(Object nv_, Object sv_) {
    List<Object> rset;
    rset = new ArrayList<Object>();
    rset.add(nv_);
    rset.add(sv_);
    return rset;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Exploit Java Collections classes to assemble a collection of results.
  // This example uses java.util.Map
  public Map<String, Object> getPairFromMap(Object nv_, Object sv_) {
    Map<String, Object> rset;
    rset = new HashMap<String, Object>();
    rset.put(L, nv_);
    rset.put(R, sv_);
    return rset;
  }

  // ===========================================================================
  private class Pair<L, R> {

    private L leftVal;
    private R rightVal;

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Pair(L nv_, R sv_) {
      setLeftVal(nv_);
      setRightVal(sv_);
      return;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // disable default constructor
    private Pair() {
      return;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void setLeftVal(L nv_) {
      leftVal = nv_;
      return;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public L getLeftVal() {
      return leftVal;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void setRightVal(R sv_) {
      rightVal = sv_;
      return;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public R getRightVal() {
      return rightVal;
    }
  }
}

