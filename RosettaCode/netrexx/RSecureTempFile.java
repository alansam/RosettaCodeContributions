/* Generated from 'RSecureTempFile.nrx' 6 Aug 2013 13:05:18 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSecureTempFile{
 private static final java.lang.String $0="RSecureTempFile.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
 
 public static java.io.File makeTempFile(java.lang.String prefix) throws java.io.IOException{
  return makeTempFile(prefix,(java.lang.String)null,(java.lang.String)null);
  }
 public static java.io.File makeTempFile(java.lang.String prefix,java.lang.String suffix) throws java.io.IOException{
  return makeTempFile(prefix,suffix,(java.lang.String)null);
  }
 public static java.io.File makeTempFile(java.lang.String prefix,java.lang.String suffix,java.lang.String startDir) throws java.io.IOException{
  java.io.File fStartDir=null;
  java.io.File ff;
  
  if (startDir!=null) 
   fStartDir=new java.io.File(startDir);
  else 
   fStartDir=(java.io.File)null;
  ff=java.io.File.createTempFile(prefix,suffix,fStartDir);
  ff.deleteOnExit(); // make sure the file is deleted at termination
  return ff;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.io.File tempFiles[]=null;
  java.io.File fFile=null;
  java.lang.String fName=null;
  java.io.IOException ex=null;
  {try{
   tempFiles=new java.io.File[]{makeTempFile("rexx"),makeTempFile("rexx",".rex"),makeTempFile("rexx",(java.lang.String)null,"./tmp")};
   
   
   
   
   {int $3=0;java.io.File[] $2=new java.io.File[tempFiles.length];synchronized(tempFiles){for(;;){if($3==$2.length)break;$2[$3]=tempFiles[tempFiles.length-1-$3];$3++;}}fFile:for(;;){if(--$3<0)break;fFile=(java.io.File)$2[$3];
    fName=fFile.getCanonicalPath();
    netrexx.lang.RexxIO.Say("Temporary file:"+" "+fName);
    }
   }/*fFile*/
  }
  catch (java.io.IOException $4){ex=$4;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RSecureTempFile(){return;}
 }
