/* Generated from 'RReadFileLineByLine01.nrx' 9 Nov 2012 10:24:45 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadFileLineByLine01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RReadFileLineByLine01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx inFileName=null;
  netrexx.lang.Rexx lines;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  inFileName=$1[0];}
  
  if (inFileName.OpEq(null,$02)|inFileName.OpEq(null,$03)) 
   inFileName=netrexx.lang.Rexx.toRexx("./data/dwarfs.json");
  lines=scanFile(inFileName);
  {netrexx.lang.Rexx $2=lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$2);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((l_.right(new netrexx.lang.Rexx((byte)4))).OpCc(null,$04)).OpCcblank(null,lines.getnode(l_).leaf));
   }
  }/*l_*/
  
  return;
  }

 // Read a file and return contents as a Rexx indexed string
 
 public static netrexx.lang.Rexx scanFile(netrexx.lang.Rexx inFileName){
  netrexx.lang.Rexx fileLines;
  java.io.File inFile=null;
  java.util.Scanner inFileScanner=null;
  netrexx.lang.Rexx l_=null;
  java.io.FileNotFoundException ex=null;
  
  fileLines=netrexx.lang.Rexx.toRexx("");
  {try{
   inFile=new java.io.File(netrexx.lang.Rexx.toString(inFileName));
   inFileScanner=new java.util.Scanner(inFile);
   {l_=new netrexx.lang.Rexx((byte)1);l_:for(;;l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(inFileScanner.hasNext()))break;
    fileLines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=l_;
    fileLines.getnode(l_).leaf=netrexx.lang.Rexx.toRexx(inFileScanner.nextLine());
    }
   }/*l_*/
   inFileScanner.close();
  }
  catch (java.io.FileNotFoundException $3){ex=$3;
   ex.printStackTrace();
  }}
  
  return fileLines;
  }
 
 private RReadFileLineByLine01(){return;}
 }
