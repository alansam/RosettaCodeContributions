/* Generated from 'RFileModificationTime.nrx' 24 May 2013 18:21:12 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RFileModificationTime{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("File");
 private static final java.lang.String $0="RFileModificationTime.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx fileName=null;
  java.io.File mfile;
  long mtime;
  java.lang.String dtime;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  fileName=$1[0];}
  if (fileName.OpEq(null,$02)) 
   fileName=netrexx.lang.Rexx.toRexx("data/tempfile01");
  mfile=new java.io.File(netrexx.lang.Rexx.toString(fileName));
  mtime=mfile.lastModified();
  dtime=(new java.util.Date(mtime)).toString();
  netrexx.lang.RexxIO.Say((($03.OpCcblank(null,fileName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("last modified at"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(dtime)));
  netrexx.lang.RexxIO.Say("");
  if (mfile.setLastModified(0)) 
   {
    dtime=(new java.util.Date(mfile.lastModified())).toString();
    netrexx.lang.RexxIO.Say("File modification time altered...");
    netrexx.lang.RexxIO.Say((($03.OpCcblank(null,fileName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("now last modified at"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(dtime)));
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say("Resetting...");
    mfile.setLastModified(mtime);
    dtime=(new java.util.Date(mfile.lastModified())).toString();
    netrexx.lang.RexxIO.Say((($03.OpCcblank(null,fileName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("reset to last modified at"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(dtime)));
   }
  else 
   {
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Unable to modify time for file").OpCcblank(null,fileName));
   }
  return;
  }
 
 private RFileModificationTime(){return;}
 }
