/* Generated from 'RFileIO01.nrx' 16 Nov 2012 19:56:34 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RFileIO01{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RFileIO01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx infileName=null;
  netrexx.lang.Rexx outfileName=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  infileName=$1[0];outfileName=$1[1];}
  
  if (infileName.OpEq(null,$02)|(infileName.length()).OpEq(null,$03)) 
   infileName=netrexx.lang.Rexx.toRexx("data/input.txt");
  if (outfileName.OpEq(null,$02)|(outfileName.length()).OpEq(null,$03)) 
   outfileName=netrexx.lang.Rexx.toRexx("data/output.txt");
  
  binaryCopy(infileName,outfileName);
  
  return;
  }

 
 public static void binaryCopy(netrexx.lang.Rexx infileName,netrexx.lang.Rexx outfileName){
  java.nio.file.Path infile=null;
  java.nio.file.Path outfile=null;
  byte fileOctets[]=null;
  java.io.IOException ioex=null;
  
  {try{
   infile=java.nio.file.Paths.get(".",new java.lang.String[]{netrexx.lang.Rexx.toString(infileName)});
   outfile=java.nio.file.Paths.get(".",new java.lang.String[]{netrexx.lang.Rexx.toString(outfileName)});
   fileOctets=java.nio.file.Files.readAllBytes(infile);
   java.nio.file.Files.write(outfile,fileOctets,(java.nio.file.OpenOption[])(new java.nio.file.StandardOpenOption[]{java.nio.file.StandardOpenOption.WRITE,java.nio.file.StandardOpenOption.CREATE}));
  }
  catch (java.io.IOException $2){ioex=$2;
   ioex.printStackTrace();
  }}
  
  return;
  }
 
 private RFileIO01(){return;}
 }
