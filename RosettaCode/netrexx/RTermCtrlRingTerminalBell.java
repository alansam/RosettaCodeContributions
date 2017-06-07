/* Generated from 'RTermCtrlRingTerminalBell.nrx' 19 Nov 2013 18:24:03 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RTermCtrlRingTerminalBell{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("Bing!");
 private static final java.lang.String $0="RTermCtrlRingTerminalBell.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  int BEL=0;
  java.awt.Toolkit jtk=null;
  java.lang.Exception ex=null;
  {try{
   BEL=7;
   jtk=java.awt.Toolkit.getDefaultToolkit();
   netrexx.lang.RexxIO.Say($01.OpCc(null,(new netrexx.lang.Rexx(BEL)).d2c()));
   java.lang.Thread.sleep(500);
   netrexx.lang.RexxIO.Say("Ding\007-ding\u0007!");
   java.lang.Thread.sleep(500);
   netrexx.lang.RexxIO.Say("Beep!");
   jtk.beep();
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RTermCtrlRingTerminalBell(){return;}
 }
