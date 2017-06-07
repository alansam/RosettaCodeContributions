/* Generated from 'RTestAFunction.nrx' 10 Sep 2011 16:53:57 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */
import RPalindrome;
import junit.framework.TestCase;

/* NetRexx */







public final class RTestAFunction extends junit.framework.TestCase{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("1000.0");
 private static final java.lang.String $0="RTestAFunction.nrx";

 
 
 public void setUp(){
  return;
  }

 
 public void tearDown(){
  return;
  }

 
 public void testIsPal() throws java.lang.AssertionError{
  
  assertTrue((RPalindrome.isPal(netrexx.lang.Rexx.toRexx("abcba"))).toboolean());
  assertTrue((RPalindrome.isPal(netrexx.lang.Rexx.toRexx("aa"))).toboolean());
  assertTrue((RPalindrome.isPal(netrexx.lang.Rexx.toRexx("a"))).toboolean());
  assertTrue((RPalindrome.isPal(netrexx.lang.Rexx.toRexx(""))).toboolean());
  assertFalse((RPalindrome.isPal(netrexx.lang.Rexx.toRexx("ab"))).toboolean());
  assertFalse((RPalindrome.isPal(netrexx.lang.Rexx.toRexx("abcdba"))).toboolean());
  
  //assertTrue(RPalindrome.isPal(Rexx 'ab'))
  //assertFalse(RPalindrome.isPal(Rexx 'aa'))
  
  return;
  }

 
 public void except() throws java.lang.RuntimeException{
  throw new java.lang.RuntimeException();
  }

 
 public static final void main(java.lang.String args[]){
  org.junit.runner.Result testResult;
  netrexx.lang.Rexx millisecs;
  netrexx.lang.Rexx secs;
  
  testResult=org.junit.runner.JUnitCore.runClasses(new java.lang.Class[]{RTestAFunction.class});
  
  millisecs=new netrexx.lang.Rexx(testResult.getRunTime());
  secs=millisecs.OpDiv(null,$01);
  
  if (testResult.wasSuccessful()) 
   netrexx.lang.RexxIO.Say("Tests successful");
  else 
   netrexx.lang.RexxIO.Say("Tests failed");
  netrexx.lang.RexxIO.Say("  failure count:"+" "+(testResult.getFailureCount()));
  netrexx.lang.RexxIO.Say("   ignore count:"+" "+(testResult.getIgnoreCount()));
  netrexx.lang.RexxIO.Say("      run count:"+" "+(testResult.getRunCount()));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("       run time:").OpCcblank(null,secs.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)3))));
  
  return;
  }
 
 public RTestAFunction(){return;}
 }
