/* Generated from 'RReadSpecifiedLineSkipping.nrx' 26 Nov 2012 14:50:04 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadSpecifiedLineSkipping{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("\">");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(50);
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("File");
 private static final java.lang.String $0="RReadSpecifiedLineSkipping.nrx";
 
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
   inFileName=netrexx.lang.Rexx.toRexx("/Users/alansampson/apache/logging/apache-log4j/site/manual.html");
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
 // the simple solution is to iterate through file but we can use mark and skip on a
 // buffered reader to home in on the required record.
 
 public static netrexx.lang.Rexx readLine(netrexx.lang.Rexx inFileName,netrexx.lang.Rexx lineNr) throws java.io.IOException,java.io.FileNotFoundException{
  netrexx.lang.Rexx K1;
  netrexx.lang.Rexx K4;
  netrexx.lang.Rexx avgLL;
  netrexx.lang.Rexx skip;
  netrexx.lang.Rexx skipK;
  netrexx.lang.Rexx lnt;
  netrexx.lang.Rexx lnr;
  netrexx.lang.Rexx chskip;
  boolean rangeLocated;
  java.io.LineNumberReader lineReader;
  boolean notFound;
  netrexx.lang.Rexx lineTxt;
  java.lang.String line=null;
  
  K1=new netrexx.lang.Rexx((short)1024);
  K4=K1.OpMult(null,$05);
  avgLL=new netrexx.lang.Rexx((byte)60);
  skip=lineNr.OpMult(null,avgLL); // guess initial position
  skipK=skip.OpMult(null,$06);
  lnt=netrexx.lang.Rexx.toRexx("");
  lnr=$07.OpMinus(null);
  chskip=new netrexx.lang.Rexx((byte)0);
  rangeLocated=isFalse();
  
  lineReader=new java.io.LineNumberReader((java.io.Reader)(new java.io.FileReader(new java.io.File(netrexx.lang.Rexx.toString(inFileName)))),K4.toint());
  
  lineReader.mark(skipK.toint()); // mark begining of file
  {boolean $3=true;for(;;){if($3){$3=false;}else{if(rangeLocated)break;}
   lnt=netrexx.lang.Rexx.toRexx(lineReader.readLine());
   lnr=new netrexx.lang.Rexx(lineReader.getLineNumber());
   {/*select*/
   if (lnt==null)
    {
     lnt=netrexx.lang.Rexx.toRexx("EOF");
     lineReader.reset();
     skip=skip.OpSub(null,($08.OpMult(null,avgLL))); // have another guess
    }
   else if (lnr.OpGt(null,lineNr))
    {
     lineReader.reset();
     skip=skip.OpSub(null,($08.OpMult(null,avgLL))); // have another guess
     if (skip.OpLt(null,$09)) 
      skip=avgLL;
     lineReader.mark(skipK.toint());
    }
   else if (lnr.OpLtEq(null,lineNr)&lineNr.OpSub(null,lnr).OpLt(null,$08))
    {
     rangeLocated=isTrue();
     lineReader.reset();
     skip=new netrexx.lang.Rexx((byte)0);
    }
   else{
    {
     lineReader.reset();
     skip=skip.OpAdd(null,($010.OpMult(null,avgLL))); // have another guess
     if (skip.OpLt(null,$09)) 
      skip=avgLL;
     lineReader.mark(skipK.toint());
    }
   }
   }
   netrexx.lang.RexxIO.Say((((skip.right(new netrexx.lang.Rexx((byte)6))).OpCcblank(null,chskip.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,lnr.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,lnt));
   chskip=new netrexx.lang.Rexx(lineReader.skip(skip.tolong()));
   }
  }
  
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
   throw new java.lang.RuntimeException(netrexx.lang.Rexx.toString((($011.OpCcblank(null,inFileName)).OpCcblank(null,netrexx.lang.Rexx.toRexx("does not contain line"))).OpCcblank(null,lineNr.right(new netrexx.lang.Rexx((byte)5)))));
  
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
 
 private RReadSpecifiedLineSkipping(){return;}
 }
