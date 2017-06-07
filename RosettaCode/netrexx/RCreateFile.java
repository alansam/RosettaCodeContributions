/* Generated from 'RCreateFile.nrx' 10 Jan 2013 10:19:07 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCreateFile{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("output.txt");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("..");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("docs");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("File");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("Directory");
 private static final java.lang.String $0="RCreateFile.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx fName;
  netrexx.lang.Rexx dName;
  netrexx.lang.Rexx i_=null;
  boolean fc=false;
  boolean dc=false;
  java.io.IOException iox=null;
  fName=netrexx.lang.Rexx.toRexx("");
  fName.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)2);
  fName.getnode(new netrexx.lang.Rexx((byte)1)).leaf=($01.OpCc(null,netrexx.lang.Rexx.toRexx(java.io.File.separator))).OpCc(null,$02);
  fName.getnode(new netrexx.lang.Rexx((byte)2)).leaf=($03.OpCc(null,netrexx.lang.Rexx.toRexx(java.io.File.separator))).OpCc(null,$02);
  dName=netrexx.lang.Rexx.toRexx("");
  dName.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)2);
  dName.getnode(new netrexx.lang.Rexx((byte)1)).leaf=($01.OpCc(null,netrexx.lang.Rexx.toRexx(java.io.File.separator))).OpCc(null,$04);
  dName.getnode(new netrexx.lang.Rexx((byte)2)).leaf=($03.OpCc(null,netrexx.lang.Rexx.toRexx(java.io.File.separator))).OpCc(null,$04);
  
  {try{
   {netrexx.lang.Rexx $1=fName.getnode(new netrexx.lang.Rexx((byte)0)).leaf;i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(fName.getnode(i_).leaf);
    fc=(new java.io.File(netrexx.lang.Rexx.toString(fName.getnode(i_).leaf))).createNewFile();
    if (fc) 
     netrexx.lang.RexxIO.Say(($05.OpCcblank(null,fName.getnode(i_).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("created successfully.")));
    else 
     netrexx.lang.RexxIO.Say(($05.OpCcblank(null,fName.getnode(i_).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("aleady exists.")));
    }
   }/*i_*/
   
   {netrexx.lang.Rexx $2=dName.getnode(new netrexx.lang.Rexx((byte)0)).leaf;i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$2);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(dName.getnode(i_).leaf);
    dc=(new java.io.File(netrexx.lang.Rexx.toString(dName.getnode(i_).leaf))).mkdir();
    if (dc) 
     netrexx.lang.RexxIO.Say(($06.OpCcblank(null,dName.getnode(i_).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("created successfully.")));
    else 
     netrexx.lang.RexxIO.Say(($06.OpCcblank(null,dName.getnode(i_).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("aleady exists.")));
    }
   }/*i_*/
  }
  catch (java.io.IOException $3){iox=$3;
   iox.printStackTrace();
  }}
  
  return;
  }
 
 private RCreateFile(){return;}
 }
