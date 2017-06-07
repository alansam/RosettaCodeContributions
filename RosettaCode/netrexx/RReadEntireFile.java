/* Generated from 'RReadEntireFile.nrx' 9 Nov 2012 09:43:13 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadEntireFile{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RReadEntireFile.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx inFileName=null;
  netrexx.lang.Rexx fileContents;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  inFileName=$1[0];}
  
  if (inFileName.OpEq(null,$02)|inFileName.OpEq(null,$03)) 
   inFileName=netrexx.lang.Rexx.toRexx("./data/dwarfs.json");
  fileContents=slurp(inFileName);
  netrexx.lang.RexxIO.Say(fileContents);
  
  return;
  }

 // Slurp a file and return contents as a Rexx string
 
 public static netrexx.lang.Rexx slurp(netrexx.lang.Rexx inFileName){
  netrexx.lang.Rexx slurped;
  java.lang.StringBuilder slurpStr;
  byte ioBuffer[];
  int inBytes;
  java.io.File inFile=null;
  java.io.BufferedInputStream inFileIS=null;
  java.io.FileNotFoundException exFNF=null;
  java.io.IOException exIO=null;
  java.io.IOException ex=null;
  
  slurped=(netrexx.lang.Rexx)null;
  slurpStr=new java.lang.StringBuilder();
  ioBuffer=new byte[1024];
  inBytes=new netrexx.lang.Rexx(0).toint();
  
  {try{
   inFile=new java.io.File(netrexx.lang.Rexx.toString(inFileName));
   inFileIS=new java.io.BufferedInputStream((java.io.InputStream)(new java.io.FileInputStream(inFile)));
   
   {boolean $2=true;ioLoop:for(;;){if($2){$2=false;}else{if(new netrexx.lang.Rexx(inBytes).OpEq(null,$04.OpMinus(null)))break;}
    slurpStr.append(new java.lang.String(ioBuffer,0,inBytes));
    inBytes=inFileIS.read(ioBuffer);
    }
   }/*ioLoop*/
  }
  catch (java.io.FileNotFoundException $3){exFNF=$3;
   exFNF.printStackTrace();
  }
  catch (java.io.IOException $4){exIO=$4;
   exIO.printStackTrace();
  }
  finally{
   {try{
    inFileIS.close();
   }
   catch (java.io.IOException $5){ex=$5;
    ex.printStackTrace();
   }}
  }}
  
  slurped=new netrexx.lang.Rexx(slurpStr.toString());
  
  return slurped;
  }
 
 private RReadEntireFile(){return;}
 }
