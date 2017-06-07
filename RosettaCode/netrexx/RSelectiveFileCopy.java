/* Generated from 'RSelectiveFileCopy.nrx' 6 Nov 2015 23:59:02 [v3.04] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */
// nrc -keepasjava -savelog copys



public class RSelectiveFileCopy{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final char[] $03={4,1,5,10,1,0,4,1,5,10,1,1,4,1,4,10,1,2,1,10,1,1,0};
 private static final java.lang.String $0="RSelectiveFileCopy.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx ddname_IN=null;
  netrexx.lang.Rexx ddname_OUT=null;
  java.io.File dd_IN=null;
  java.io.File dd_OUT=null;
  java.util.Scanner scanner_IN=null;
  java.io.BufferedWriter writer_OUT=null;
  netrexx.lang.Rexx x=null;
  java.lang.String data_IN=null;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx cc=null;
  netrexx.lang.Rexx data_OUT=null;
  java.io.IOException ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  ddname_IN=$1[0];ddname_OUT=$1[1];}
  {try{
   if ((ddname_IN.length()).OpEq(null,$02)) 
    ddname_IN=netrexx.lang.Rexx.toRexx("copys.in.txt");
   if ((ddname_OUT.length()).OpEq(null,$02)) 
    ddname_OUT=netrexx.lang.Rexx.toRexx("copys.out.txt");
   
   dd_IN=new java.io.File(netrexx.lang.Rexx.toString(ddname_IN));
   dd_OUT=new java.io.File(netrexx.lang.Rexx.toString(ddname_OUT));
   scanner_IN=new java.util.Scanner(dd_IN);
   writer_OUT=new java.io.BufferedWriter((java.io.Writer)(new java.io.FileWriter(dd_OUT)));
   
   x=netrexx.lang.Rexx.toRexx("XXXXX");
   {for(;;){if(!(scanner_IN.hasNextLine()))break;
    data_IN=scanner_IN.nextLine();
    {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
    netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx(data_IN),$03,$2);
    a=$2[0];c=$2[2];}/* b *//* d */
    cc=c.left(new netrexx.lang.Rexx((byte)1)).c2x();
    data_OUT=(a.OpCc(null,cc.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,x);
    writer_OUT.write(netrexx.lang.Rexx.tochararray(data_OUT));
    writer_OUT.newLine();
    }
   }
  }
  catch (java.io.IOException $3){ex=$3;
   ex.printStackTrace();
  }
  finally{
   {try{
    if (scanner_IN!=null) 
     scanner_IN.close();
    if (writer_OUT!=null) 
     writer_OUT.close();
   }
   catch (java.io.IOException $4){ex=$4;
    ex.printStackTrace();
   }}
  }}
  return;}
 
 private RSelectiveFileCopy(){return;}
 }
