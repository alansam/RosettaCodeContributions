/* Generated from 'RInputLoop02.nrx' 9 Nov 2012 13:08:52 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// Read from default input stream (console) until end of data or input is the string '.*'

public class RInputLoop02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RInputLoop02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx lines;
  netrexx.lang.Rexx EODAD;
  java.util.Scanner inScanner;
  netrexx.lang.Rexx l_=null;
  java.lang.String inLine=null;
  lines=netrexx.lang.Rexx.toRexx("");
  lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  EODAD=netrexx.lang.Rexx.toRexx(".*");
  
  inScanner=new java.util.Scanner(java.lang.System.in);
  {l_=new netrexx.lang.Rexx((byte)1);l_:for(;;l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(inScanner.hasNext()))break;
   inLine=inScanner.nextLine();
   if (netrexx.lang.Rexx.toRexx(inLine).OpEqS(null,EODAD)) 
    break l_;
   lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=l_;
   lines.getnode(l_).leaf=netrexx.lang.Rexx.toRexx(inLine);
   }
  }/*l_*/
  inScanner.close();
  
  {netrexx.lang.Rexx $1=lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$1);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((l_.right(new netrexx.lang.Rexx((byte)4))).OpCc(null,$01)).OpCcblank(null,lines.getnode(l_).leaf));
   }
  }/*l_*/
  
  return;
  }
 
 private RInputLoop02(){return;}
 }
