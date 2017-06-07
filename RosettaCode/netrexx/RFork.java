/* Generated from 'RFork.nrx' 10 Sep 2013 20:51:16 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RFork{
 private static final java.lang.String $0="RFork.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.lang.ProcessBuilder pb=null;
  java.util.Map env=null;
  java.lang.String currentuser=null;
  java.util.List command=null;
  java.lang.Process pp=null;
  java.io.BufferedReader ir=null;
  java.lang.String line=null;
  java.io.IOException iox=null;
  
  {try{
   pb=new java.lang.ProcessBuilder(new java.lang.String[]{""});
   env=pb.environment();
   currentuser=(java.lang.String)(env.get((java.lang.Object)"USER"));
   command=java.util.Arrays.asList((java.lang.Object[])(new java.lang.String[]{"ps","-f","-U",currentuser}));
   pb.command(command);
   pp=pb.start();
   ir=new java.io.BufferedReader((java.io.Reader)(new java.io.InputStreamReader(pp.getInputStream())));
   line="Output of running"+" "+command.toString()+" "+"is:";
   {boolean $1=true;w_:for(;;){if($1){$1=false;}else{if(line==null)break;}
    netrexx.lang.RexxIO.Say(line);
    line=ir.readLine();
    }
   }/*w_*/
  }
  catch (java.io.IOException $2){iox=$2;
   iox.printStackTrace();
  }}
  
  return;
  }
 
 private RFork(){return;}
 }
/*
Output of running [ps, -f, -U, nrxuser] is: 
  UID   PID  PPID   C STIME   TTY           TIME CMD 
  501   277     1   0 21Aug13 ??         0:32.05 /sbin/launchd
  ...
    0   366   291   0 21Aug13 ttys001    0:00.02 login -pfl nrxuser /bin/bash -c exec -la bash /bin/bash
  501   368   366   0 21Aug13 ttys001    0:00.16 -bash
  501 72276   368   0  6:28PM ttys001    0:00.23 /usr/bin/java -cp .:.. RFork
  501 72277   368   0  6:28PM ttys001    0:00.00 tee data/RFork.log
    0 72278 72276   0  6:28PM ttys001    0:00.00 ps -f -U nrxuser
    0   380   291   0 21Aug13 ttys002    0:00.02 login -pfl nrxuser /bin/bash -c exec -la bash /bin/bash
  ...
 */

