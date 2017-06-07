/* Generated from 'RRenameFile.nrx' 6 Aug 2013 18:15:51 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RRenameFile{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final char[] $04={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("to");
 private static final java.lang.String $0="RRenameFile.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
 
 public static boolean isFileRenamed(netrexx.lang.Rexx oldFile,netrexx.lang.Rexx newFile){
  java.io.File fo;
  java.io.File fn;
  boolean fRenamed;
  fo=new java.io.File(netrexx.lang.Rexx.toString(oldFile));
  fn=new java.io.File(netrexx.lang.Rexx.toString(newFile));
  fRenamed=fo.renameTo(fn);
  return fRenamed;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx files=null;
  netrexx.lang.Rexx of=null;
  netrexx.lang.Rexx nf=null;
  netrexx.lang.Rexx ft=null;
  java.lang.String dl=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  files=$1[0];}
  if (files.OpEq(null,$02)) 
   files=netrexx.lang.Rexx.toRexx("input.txt output.txt F docs mydocs D /input.txt /output.txt F /docs /mydocs D");
  {for(;;){if(!(files.length()).OpGt(null,$03))break;
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
   netrexx.lang.RexxParse.parse(files,$04,$2);
   of=$2[0];nf=$2[1];ft=$2[2];files=$2[3];}
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
   if (isFileRenamed(of,nf)) 
    dl="renamed";
   else 
    dl="not renamed";
   netrexx.lang.RexxIO.Say((((((ft.OpCcblank(null,$05)).OpCc(null,of)).OpCc(null,$05)).OpCcblank(null,netrexx.lang.Rexx.toRexx(dl))).OpCcblank(null,$06)).OpCcblank(null,nf));
   }
  }
  
  return;
  }
 
 private RRenameFile(){return;}
 }
