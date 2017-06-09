/* Generated from 'RSleep.nrx' 8 Jun 2017 20:53:01 [v3.05] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSleep{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('s');
 private static final char[] $05={1,10,2,0,1,0};
 private static final java.lang.String $0="RSleep.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void sleep(netrexx.lang.Rexx secs){
  netrexx.lang.Rexx ms;
  java.lang.InterruptedException ix=null;
  ms=(secs.OpMult(null,$01)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)0)); // milliseconds, rounded to nearest integer
  netrexx.lang.RexxIO.Say("Sleeping...");
  {try{
   java.lang.Thread.sleep(ms.tolong());
  }
  catch (java.lang.InterruptedException $1){ix=$1;
   netrexx.lang.RexxIO.Say("Sleep interrupted!");
   ix.printStackTrace();
  }}
  netrexx.lang.RexxIO.Say("Awake!");
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx secs;
  secs=$02.OpMinus(null);
  {boolean $2=true;for(;;){if($2){$2=false;}else{if((secs.datatype(new netrexx.lang.Rexx('N'))).OpNot(null))break;}
   if (secs.OpGt(null,$03)) 
    {
     netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Napping for").OpCcblank(null,secs)).OpCc(null,$04));
     netrexx.lang.RexxIO.Say("");
     sleep(secs);
    }
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say("How many seconds do you want me to sleep? (enter something non-numeric to terminate)\000");
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$05,$3);
   secs=$3[0];}
   netrexx.lang.RexxIO.Say("");
   }
  }
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Goodbye...");
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RSleep(){return;}
 }
