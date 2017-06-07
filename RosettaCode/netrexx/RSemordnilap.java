/* Generated from 'RSemordnilap.nrx' 10 Sep 2012 20:28:07 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* REXX ***************************************************************
* 07.09.2012 Walter Pachl
**********************************************************************/

public class RSemordnilap{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("words in");
 private static final java.lang.String $0="RSemordnilap.nrx";
 
 public static void main(java.lang.String $0s[]) throws java.io.FileNotFoundException,java.io.IOException{
  netrexx.lang.Rexx fid;
  java.io.File ifi;
  java.io.BufferedReader ifr;
  netrexx.lang.Rexx have;
  netrexx.lang.Rexx pi;
  java.lang.String line=null;
  netrexx.lang.Rexx w=null;
  netrexx.lang.Rexx r=null;
  fid=netrexx.lang.Rexx.toRexx("unixdict.txt");/* the test dictionary        */
  ifi=new java.io.File(netrexx.lang.Rexx.toString(fid));
  ifr=new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(ifi)));
  have=netrexx.lang.Rexx.toRexx("");/* words encountered          */
  pi=new netrexx.lang.Rexx((byte)0);/* number of palindromes      */
  {j_:for(;;){/* as long there is input     */
   line=ifr.readLine();/* read a line                */
   if (line==null) 
    break j_;
   w=new netrexx.lang.Rexx(line);
   if (w.OpGt(null,$01)) 
    {/* not a blank line           */
     r=w.reverse();/* reverse it                 */
     if ((have.getnode(r).leaf).OpGt(null,$01)) 
      {/* was already encountered    */
       pi=pi.OpAdd(null,$02);/* increment number of pal's  */
       if (pi.OpLtEq(null,$03)) /* the first 5 are listed     */
        netrexx.lang.RexxIO.Say((have.getnode(r).leaf).OpCcblank(null,w));
      }
     have.getnode(w).leaf=w;/* remember the word          */
    }
   }
  }/*j_*/
  ifr.close();
  
  netrexx.lang.RexxIO.Say(((pi.OpCcblank(null,$04)).OpCcblank(null,fid)).OpCcblank(null,netrexx.lang.Rexx.toRexx("have a palindrome")));/* total number found      */
  return;
  }
 
 private RSemordnilap(){return;}
 }
/*
Output:

ac ca
bad dab
avid diva
and dna
bard drab
158 words in unixdict.txt have a palindrome
*/

