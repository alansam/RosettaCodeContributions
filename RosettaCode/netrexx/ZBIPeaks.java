/* Generated from 'ZBIPeaks.nrx' 21 May 2013 23:15:37 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class ZBIPeaks{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final char[] $03={2,1,124,2,2,91,91,10,1,0,2,2,93,93,10,1,1,2,2,124,124,10,1,0,2,2,124,124,10,1,2,2,1,109,10,1,3,1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx("1000.0");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("25.4");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(12);
 private static final java.lang.String $0="ZBIPeaks.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx getPeaks(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx peaks;
  netrexx.lang.Rexx _NAME;
  netrexx.lang.Rexx _STATE;
  netrexx.lang.Rexx _HEIGHT;
  netrexx.lang.Rexx BIPeaksFileName=null;
  java.util.Scanner BIPeaksScanner=null;
  netrexx.lang.Rexx lineNr=null;
  java.lang.String peak=null;
  netrexx.lang.Rexx name=null;
  netrexx.lang.Rexx state=null;
  netrexx.lang.Rexx height=null;
  java.io.FileNotFoundException ex=null;
  peaks=netrexx.lang.Rexx.toRexx("");
  _NAME=netrexx.lang.Rexx.toRexx("NAME");
  _STATE=netrexx.lang.Rexx.toRexx("STATE");
  _HEIGHT=netrexx.lang.Rexx.toRexx("HEIGHT");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  BIPeaksFileName=$1[0];}
  {try{
   BIPeaksScanner=new java.util.Scanner(new java.io.File(netrexx.lang.Rexx.toString(BIPeaksFileName)));
   {lineNr=new netrexx.lang.Rexx((byte)1);lineNr:for(;;lineNr=lineNr.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(BIPeaksScanner.hasNextLine()))break;
    peak=BIPeaksScanner.nextLine();
    if (netrexx.lang.Rexx.toRexx(peak).OpEq(null,$02)) 
     continue lineNr;
    {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
    netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx(peak),$03,$2);
    name=$2[1];state=$2[2];height=$2[3];}
    peaks.getnode(new netrexx.lang.Rexx((byte)0)).leaf=lineNr;
    peaks.getnode(lineNr).leaf.getnode(_NAME).leaf=name.strip();
    peaks.getnode(lineNr).leaf.getnode(_STATE).leaf=state.strip();
    peaks.getnode(lineNr).leaf.getnode(_HEIGHT).leaf=height.OpAdd(null,$04);
    }
   }/*lineNr*/
   BIPeaksScanner.close();
  }
  catch (java.io.FileNotFoundException $3){ex=$3;
   ex.printStackTrace();
  }}
  return peaks;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx BIPeaksFileName;
  netrexx.lang.Rexx _NAME;
  netrexx.lang.Rexx _STATE;
  netrexx.lang.Rexx _HEIGHT;
  netrexx.lang.Rexx peaklist;
  netrexx.lang.Rexx peak=null;
  netrexx.lang.Rexx name=null;
  netrexx.lang.Rexx state=null;
  netrexx.lang.Rexx height=null;
  BIPeaksFileName=netrexx.lang.Rexx.toRexx("ZBIPeaks.txt");
  _NAME=netrexx.lang.Rexx.toRexx("NAME");
  _STATE=netrexx.lang.Rexx.toRexx("STATE");
  _HEIGHT=netrexx.lang.Rexx.toRexx("HEIGHT");
  peaklist=getPeaks(BIPeaksFileName);
  {netrexx.lang.Rexx $4=peaklist.getnode(new netrexx.lang.Rexx((byte)0)).leaf;peak=new netrexx.lang.Rexx((byte)1);peak:for(;peak.OpLtEq(null,$4);peak=peak.OpAdd(null,new netrexx.lang.Rexx(1))){
   name=peaklist.getnode(peak).leaf.getnode(_NAME).leaf;
   state=peaklist.getnode(peak).leaf.getnode(_STATE).leaf;
   height=peaklist.getnode(peak).leaf.getnode(_HEIGHT).leaf;
   netrexx.lang.RexxIO.Say(((((((((peak.right(new netrexx.lang.Rexx((byte)6))).OpCc(null,$05)).OpCcblank(null,name)).OpCcblank(null,$05)).OpCcblank(null,state)).OpCcblank(null,$05)).OpCcblank(null,height)).OpCcblank(null,$05)).OpCcblank(null,(height.OpMult(null,$06).OpDiv(null,$07).OpDiv(null,$08)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)0))));
   }
  }/*peak*/
  return;
  }
 
 private ZBIPeaks(){return;}
 }
