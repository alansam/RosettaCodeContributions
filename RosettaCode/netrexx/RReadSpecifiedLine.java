/* Generated from 'RReadSpecifiedLine.nrx' 26 Nov 2012 12:05:12 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadSpecifiedLine{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("\">");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("File");
 private static final java.lang.String $0="RReadSpecifiedLine.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx inFileName=null;
  netrexx.lang.Rexx lineNr=null;
  netrexx.lang.Rexx lineTxt=null;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  inFileName=$1[0];lineNr=$1[1];}
  
  if (inFileName.OpEq(null,$02)|inFileName.OpEq(null,$03)) 
   inFileName=netrexx.lang.Rexx.toRexx("./data/input.txt");
  if (lineNr.OpEq(null,$02)|lineNr.OpEq(null,$03)) 
   lineNr=new netrexx.lang.Rexx((byte)7);
  
  {try{
   lineTxt=readLine(inFileName,lineNr);
   netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("<textline number=\"").OpCc(null,lineNr.right(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)0)))).OpCc(null,$04)).OpCc(null,lineTxt)).OpCc(null,netrexx.lang.Rexx.toRexx("</textline>")));
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 // =============================================================================
 // NetRexx/Java programs don't have a special mechanism to seek to a specified line number
 // the simple solution is to iterate through file. (Costly for very large files)
 
 public static netrexx.lang.Rexx readLine(netrexx.lang.Rexx inFileName,netrexx.lang.Rexx lineNr) throws java.io.IOException,java.io.FileNotFoundException{
  java.io.LineNumberReader lineReader;
  boolean notFound;
  netrexx.lang.Rexx lineTxt;
  java.lang.String line=null;
  
  lineReader=new java.io.LineNumberReader((java.io.Reader)(new java.io.FileReader(new java.io.File(netrexx.lang.Rexx.toString(inFileName)))));
  notFound=isTrue();
  lineTxt=netrexx.lang.Rexx.toRexx("");
  {try{reading:for(;;){
   line=lineReader.readLine();
   {/*select*/
   if (new netrexx.lang.Rexx(lineReader.getLineNumber()).OpEq(null,lineNr))
    {
     lineTxt=netrexx.lang.Rexx.toRexx(line);
     notFound=isFalse();
     break reading; // terminate I/O loop
    }
   else if (line==null)
    {
     break reading; // terminate I/O loop
    }
   else{
    ;
   }
   }
   }
  }
  finally{
   lineReader.close();
  }}/*reading*/
  
  if (notFound) 
   throw new java.lang.RuntimeException(netrexx.lang.Rexx.toString((($05.OpCcblank(null,inFileName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("does not contain line"))).OpCcblank(null,lineNr.right(new netrexx.lang.Rexx((byte)5)))));
  
  return lineTxt;
  }

 // =============================================================================
 
 public static boolean isTrue(){
  return 1==1;
  }
 // =============================================================================
 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx((1==1)).OpNot(null);
  }
 
 private RReadSpecifiedLine(){return;}
 }
