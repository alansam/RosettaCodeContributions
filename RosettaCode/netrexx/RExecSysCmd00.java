/* Generated from 'RExecSysCmd00.nrx' 2 Aug 2013 09:05:26 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RExecSysCmd00{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RExecSysCmd00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx command=null;
  java.lang.Process jprocess=null;
  java.util.Scanner jscanner=null;
  java.io.IOException ex=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  command=$1[0];}
  if (command.OpEq(null,$02)) 
   command=netrexx.lang.Rexx.toRexx("ls -oa"); // for Windows change to: dir /s 
  {try{
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Executing command:").OpCcblank(null,command));
   jprocess=java.lang.Runtime.getRuntime().exec(netrexx.lang.Rexx.toString(command));
   jscanner=new java.util.Scanner(jprocess.getInputStream());
   {scanning:for(;;){if(!(jscanner.hasNext()))break;
    netrexx.lang.RexxIO.Say(jscanner.nextLine());
    }
   }/*scanning*/
  }
  catch (java.io.IOException $2){ex=$2;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RExecSysCmd00(){return;}
 }
