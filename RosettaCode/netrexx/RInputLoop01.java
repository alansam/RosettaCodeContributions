/* Generated from 'RInputLoop01.nrx' 9 Nov 2012 13:09:32 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// Read from default input stream (console) until end of data or input is the string '.*'

public class RInputLoop01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RInputLoop01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx lines;
  netrexx.lang.Rexx lineNo;
  netrexx.lang.Rexx EODAD;
  netrexx.lang.Rexx inLine=null;
  netrexx.lang.Rexx l_=null;
  lines=netrexx.lang.Rexx.toRexx("");
  lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  lineNo=new netrexx.lang.Rexx((byte)0);
  EODAD=netrexx.lang.Rexx.toRexx(".*");
  
  {ioloop:for(;;){
   inLine=netrexx.lang.RexxIO.Ask();
   if (inLine==null) 
    break ioloop; // stop on EOF
   if (inLine.OpEqS(null,EODAD)) 
    break ioloop; // stop if input line is EODAD
   lineNo=lineNo.OpAdd(null,$01);
   lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=lineNo;
   lines.getnode(lineNo).leaf=inLine;
   }
  }/*ioloop*/
  
  {netrexx.lang.Rexx $1=lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$1);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((l_.right(new netrexx.lang.Rexx((byte)4))).OpCc(null,$02)).OpCcblank(null,lines.getnode(l_).leaf));
   }
  }/*l_*/
  
  return;
  }
 
 private RInputLoop01(){return;}
 }
