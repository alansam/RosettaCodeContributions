/* Generated from 'RWalkDir_Iter.nrx' 7 May 2013 21:44:47 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RWalkDir_Iter{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Search of");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("\" found");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("files.");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RWalkDir_Iter.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List getFileNames(netrexx.lang.Rexx dirname,netrexx.lang.Rexx pattern){
  java.io.File dir;
  java.lang.String contents[];
  java.util.ArrayList fileNames;
  java.lang.String fname=null;
  dir=new java.io.File(netrexx.lang.Rexx.toString(dirname));
  contents=dir.list();
  fileNames=new java.util.ArrayList();
  {int $3=0;java.lang.String[] $2=new java.lang.String[contents.length];synchronized(contents){for(;;){if($3==$2.length)break;$2[$3]=contents[contents.length-1-$3];$3++;}}fname:for(;;){if(--$3<0)break;fname=(java.lang.String)$2[$3];
   if (fname.matches(netrexx.lang.Rexx.toString(pattern))) 
    {
     fileNames.add((java.lang.Object)fname);
    }
   }
  }/*fname*/
  java.util.Collections.sort((java.util.List)fileNames);
  return (java.util.List)fileNames;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx dirname=null;
  netrexx.lang.Rexx pattern=null;
  java.util.List fileNames;
  netrexx.lang.Rexx fn=null;
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$4);
  dirname=$4[0];pattern=$4[1];}
  if (dirname.OpEq(null,$02)) 
   dirname=netrexx.lang.Rexx.toRexx(java.lang.System.getProperty("user.dir"));
  if (pattern.OpEq(null,$02)) 
   pattern=netrexx.lang.Rexx.toRexx("^RW.*\\.nrx$");
  
  fileNames=getFileNames(dirname,pattern);
  netrexx.lang.RexxIO.Say(((((($03.OpCcblank(null,dirname)).OpCcblank(null,netrexx.lang.Rexx.toRexx("for files matching pattern \""))).OpCc(null,pattern)).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(fileNames.size()))).OpCcblank(null,$05));
  {fn=new netrexx.lang.Rexx((byte)0);fn:for(;;fn=fn.OpAdd(null,new netrexx.lang.Rexx(1))){if(!fn.OpLt(null,new netrexx.lang.Rexx(fileNames.size())))break;
   netrexx.lang.RexxIO.Say((((fn.OpAdd(null,$06)).right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$07)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(fileNames.get(fn.toint())))));
   }
  }/*fn*/
  
  return;
  }
 
 private RWalkDir_Iter(){return;}
 }
