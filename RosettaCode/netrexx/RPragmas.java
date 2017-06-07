/* Generated from 'RPragmas.nrx' 5 Mar 2013 12:24:43 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */
/* default options */





/* local ovverides */


/* default numeric settings */



/* default trace settings */

/*off*/




public class RPragmas{
 private static final java.lang.String[] $01={"arg"};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)9);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("scientific");
 private static final java.lang.String $04="runSample(arg)";
 private static final java.lang.String $05="return";
 private static final java.lang.String $06="method runSample(arg) private static";
 private static final java.lang.String $07="  return";
 private static final java.lang.String $0="RPragmas.nrx";
 private static final netrexx.lang.RexxTrace $1=new netrexx.lang.RexxTrace(27,System.err,"RPragmas.nrx");
 static{$1.newlevel(3);}
 static{$1.modnames($01,null);}
 private static final netrexx.lang.RexxSet $2=new netrexx.lang.RexxSet();
 static{$2.setDigits($02);}
 private static final netrexx.lang.RexxSet $3=new netrexx.lang.RexxSet($2);
 static{$3.setForm($03);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  $1.traceclause(21,$04);
  runSample(arg);
  $1.traceclause(22,$05);return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  $1.traceclause(25,$06,2);
  $1.traceRexx(25,arg,'m',2,"arg");
  $1.traceclause(26,$07);return;
  }
 
 private RPragmas(){return;}
 }
