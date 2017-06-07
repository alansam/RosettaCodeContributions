/* Generated from 'RAlignColumns.nrx' 9 Aug 2013 15:33:11 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAlignColumns{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final char[] $03={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RAlignColumns.nrx";
 
 /* properties constant */
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=(1==0);
 protected static final netrexx.lang.Rexx FNAME_=netrexx.lang.Rexx.toRexx("data/aligncolums.txt");
 
 /* properties private */
 private java.lang.String indataName="";
 private java.util.Scanner indataScanner=(java.util.Scanner)null;
 private netrexx.lang.Rexx indataLine;

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RAlignColumns(){
  this(FNAME_);return;
  }
 public RAlignColumns(netrexx.lang.Rexx fnam){super();
  indataName=netrexx.lang.Rexx.toString(fnam);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx getColumnMetadata() throws java.io.FileNotFoundException{
  netrexx.lang.Rexx metadata;
  netrexx.lang.Rexx gstate;
  netrexx.lang.Rexx lCt=null;
  metadata=netrexx.lang.Rexx.toRexx("");
  gstate=new netrexx.lang.Rexx((byte)1);
  {lCt=new netrexx.lang.Rexx((byte)1);lCt:for(;;lCt=lCt.OpAdd(null,new netrexx.lang.Rexx(1))){if(!new netrexx.lang.Rexx((gstate.OpEq(null,getLine()))).OpEq(null,$01))break;
   netrexx.lang.RexxIO.Say(((lCt.right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$02)).OpCcblank(null,indataLine));
   }
  }/*lCt*/
  return metadata;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx getLine() throws java.io.FileNotFoundException{
  netrexx.lang.Rexx gstate;
  java.io.File indataFile=null;
  gstate=$01.OpMinus(null);
  if (indataScanner==null) 
   {
    indataFile=new java.io.File(indataName);
    indataScanner=new java.util.Scanner(indataFile);
   }
  
  if (indataScanner.hasNext()) 
   {
    indataLine=netrexx.lang.Rexx.toRexx(indataScanner.nextLine());
    gstate=new netrexx.lang.Rexx((byte)1);
   }
  else 
   {
    gstate=new netrexx.lang.Rexx((byte)0);
   }
  return gstate;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg) throws java.io.FileNotFoundException{
  netrexx.lang.Rexx fnam=null;
  RAlignColumns lcl;
  netrexx.lang.Rexx colMetadata;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$03,$1);
  fnam=$1[0];}
  if (fnam.OpEq(null,$04)) 
   fnam=FNAME_;
  lcl=new RAlignColumns(fnam);
  colMetadata=lcl.getColumnMetadata();
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]) throws java.io.FileNotFoundException{
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }
 }
