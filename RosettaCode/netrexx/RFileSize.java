/* Generated from 'RFileSize.nrx' 5 Aug 2013 20:06:27 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RFileSize{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final char[] $04={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("bytes.");
 private static final java.lang.String $0="RFileSize.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
 
 public static double fileSize(netrexx.lang.Rexx fn){
  java.io.File ff;
  long fSize;
  ff=new java.io.File(netrexx.lang.Rexx.toString(fn));
  fSize=ff.length();
  return (double)fSize;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx files=null;
  netrexx.lang.Rexx fn=null;
  netrexx.lang.Rexx ft=null;
  double sz=0;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  files=$1[0];}
  if (files.OpEq(null,$02)) 
   files=netrexx.lang.Rexx.toRexx("input.txt F docs D /input.txt F /docs D");
  {for(;;){if(!(files.length()).OpGt(null,$03))break;
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(files,$04,$2);
   fn=$2[0];ft=$2[1];files=$2[2];}
   {/*select*/netrexx.lang.Rexx $3=(ft.upper());
   if ($3.OpEqS(null,new netrexx.lang.Rexx('F')))
    {
     ft=netrexx.lang.Rexx.toRexx("File");
    }
   else if ($3.OpEqS(null,new netrexx.lang.Rexx('D')))
    {
     ft=netrexx.lang.Rexx.toRexx("Directory");
    }
   else{
    {
     ft=netrexx.lang.Rexx.toRexx("File");
    }
   }
   }
   sz=fileSize(fn);
   netrexx.lang.RexxIO.Say(((((ft.OpCcblank(null,$05)).OpCc(null,fn)).OpCc(null,$05)).OpCcblank(null,new netrexx.lang.Rexx(sz))).OpCcblank(null,$06));
   }
  }
  
  return;
  }
 
 private RFileSize(){return;}
 }
