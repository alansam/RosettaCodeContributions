/* Generated from 'RLetterFrequency.nrx' 22 May 2013 17:24:59 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* 22.05.2013 Walter Pachl  translated from REXX
**********************************************************************/



public class RLetterFrequency{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('<');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("file -----");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("----- has");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("records.");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx((short)255);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("count:");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(255);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("   ");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("letters.");
 private static final java.lang.String $0="RLetterFrequency.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dsn=null;
  netrexx.lang.Rexx cnt;
  netrexx.lang.Rexx totChars;
  netrexx.lang.Rexx totLetters;
  netrexx.lang.Rexx indent;
  netrexx.lang.Rexx lines;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx L=null;
  netrexx.lang.Rexx other;
  netrexx.lang.Rexx m=null;
  netrexx.lang.Rexx y=null;
  netrexx.lang.Rexx _=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  dsn=$1[0];}
  if (dsn.OpEq(null,$02)) 
   dsn=netrexx.lang.Rexx.toRexx("data/input.txt");
  cnt=new netrexx.lang.Rexx((byte)0);
  totChars=new netrexx.lang.Rexx((byte)0);/*count of the total num of chars*/
  totLetters=new netrexx.lang.Rexx((byte)0);/*count of the total num letters.*/
  indent=new netrexx.lang.Rexx(' ').left(new netrexx.lang.Rexx((byte)20));/*used for indentation of output.*/
  lines=scanFile(dsn);
  {netrexx.lang.Rexx $2=lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$2);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   line=lines.getnode(l_).leaf;
   
   netrexx.lang.RexxIO.Say((($03.OpCc(null,line)).OpCc(null,$04)).OpCcblank(null,line.length()));/* that's in test.txt            */
   /*
   lrx=left_right(line)
   Parse lrx leftx rightx
   Say ' 'leftx
   Say ' 'rightx
   */
   {int $3=(line.length()).OpPlus(null).toint();k=new netrexx.lang.Rexx((byte)1);k:for(;$3>0;$3--,k=k.OpAdd(null,new netrexx.lang.Rexx(1))){/*loop over characters           */
    totChars=totChars.OpAdd(null,$05);/*Increment total number of chars*/
    c=line.substr(k,new netrexx.lang.Rexx((byte)1));/*get character number k         */
    cnt.getnode(c).leaf=(cnt.getnode(c).leaf).OpAdd(null,$05);/*increment the character's count*/
    }
   }/*k*/
   }
  }/*l_*/
  
  w=totChars.length();/*used for right-aligning counts.*/
  netrexx.lang.RexxIO.Say(((($06.OpCcblank(null,dsn)).OpCcblank(null,$07)).OpCcblank(null,lines.getnode(new netrexx.lang.Rexx((byte)0)).leaf)).OpCcblank(null,$08));
  netrexx.lang.RexxIO.Say(((($06.OpCcblank(null,dsn)).OpCcblank(null,$07)).OpCcblank(null,totChars)).OpCcblank(null,netrexx.lang.Rexx.toRexx("characters.")));
  {L=new netrexx.lang.Rexx((byte)0);L:for(;L.OpLtEq(null,$09);L=L.OpAdd(null,new netrexx.lang.Rexx(1))){/* display nonzero letter counts */
   c=L.d2c();/* the character in question     */
   if ((cnt.getnode(c).leaf).OpGt(null,$010)&(c.datatype(new netrexx.lang.Rexx('M'))).OpGt(null,$010)) 
    {/* was found in the file  */
     /* and is a latin letter         */
     netrexx.lang.RexxIO.Say((((indent.OpCcblank(null,netrexx.lang.Rexx.toRexx("(Latin) letter "))).OpCcblank(null,c)).OpCcblank(null,$011)).OpCcblank(null,cnt.getnode(c).leaf.right(w)));/* tell */
     totLetters=totLetters.OpAdd(null,cnt.getnode(c).leaf);/* increment number of letters   */
    }
   }
  }/*L*/
  
  netrexx.lang.RexxIO.Say(((($06.OpCcblank(null,dsn)).OpCcblank(null,$07)).OpCcblank(null,totLetters)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(Latin) letters.")));
  netrexx.lang.RexxIO.Say("                           other characters follow");
  other=new netrexx.lang.Rexx((byte)0);
  {m=new netrexx.lang.Rexx((byte)0);m:for(;m.OpLtEq(null,$09);m=m.OpAdd(null,new netrexx.lang.Rexx(1))){/* now for non-letters           */
   c=m.d2c();/* the character in question     */
   y=c.c2x();/* the hex representation        */
   if ((cnt.getnode(c).leaf).OpGt(null,$010)&(c.datatype(new netrexx.lang.Rexx('M'))).OpEq(null,$010)) 
    {/* was found in the file  */
     /* and is not a latin letter     */
     other=other.OpAdd(null,cnt.getnode(c).leaf);/* increment count               */
     _=cnt.getnode(c).leaf.right(w);/* prepare output of count       */
     {/*select*//*make the character viewable.   */
     if (c.OpLtS(null,$012)|m.OpEqS(null,$013))
      netrexx.lang.RexxIO.Say((((indent.OpCcblank(null,$014)).OpCc(null,y)).OpCc(null,netrexx.lang.Rexx.toRexx("\'x character count:"))).OpCcblank(null,_));
     else if (c.OpEqS(null,$012))
      netrexx.lang.RexxIO.Say((indent.OpCcblank(null,netrexx.lang.Rexx.toRexx("blank character count:"))).OpCcblank(null,_));
     else{
      netrexx.lang.RexxIO.Say((((indent.OpCcblank(null,$015)).OpCcblank(null,c)).OpCcblank(null,netrexx.lang.Rexx.toRexx("character count:"))).OpCcblank(null,_));
     }
     }
    }
   }
  }/*m*/
  netrexx.lang.RexxIO.Say(((($06.OpCcblank(null,dsn)).OpCcblank(null,$07)).OpCcblank(null,other)).OpCcblank(null,netrexx.lang.Rexx.toRexx("other characters.")));
  netrexx.lang.RexxIO.Say(((($06.OpCcblank(null,dsn)).OpCcblank(null,$07)).OpCcblank(null,totLetters)).OpCcblank(null,$016));
  return;}

 // Read a file and return contents as a Rexx indexed string
 
 public static netrexx.lang.Rexx scanFile(netrexx.lang.Rexx dsn){
  netrexx.lang.Rexx fileLines;
  java.io.File inFile=null;
  java.util.Scanner inFileScanner=null;
  netrexx.lang.Rexx l_=null;
  java.io.FileNotFoundException ex=null;
  
  fileLines=netrexx.lang.Rexx.toRexx("");
  {try{
   inFile=new java.io.File(netrexx.lang.Rexx.toString(dsn));
   inFileScanner=new java.util.Scanner(inFile);
   {l_=new netrexx.lang.Rexx((byte)1);l_:for(;;l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(inFileScanner.hasNext()))break;
    fileLines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=l_;
    fileLines.getnode(l_).leaf=netrexx.lang.Rexx.toRexx(inFileScanner.nextLine());
    }
   }/*l_*/
   inFileScanner.close();
  }
  catch (java.io.FileNotFoundException $4){ex=$4;
   ex.printStackTrace();
  }}
  
  return fileLines;
  }
 
 private RLetterFrequency(){return;}
 }
