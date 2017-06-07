/* Generated from 'RRot13.nrx' 18 Jul 2011 15:37:40 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Rot-13</h3>
 * <p>
 * Implement a "rot-13" function (or procedure, class, subroutine, or other "callable" object as appropriate to
 * your programming environment). Optionally wrap this function in a utility program which acts like a common
 * <a href="http://rosettacode.org/wiki/UNIX">UNIX</a> utility, performing a line-by-line rot-13 encoding of
 * every line of input contained in each file listed on its command line, or (if no filenames are passed thereon)
 * acting as a filter on its "standard input."
 * (A number of UNIX scripting languages and utilities, such as awk and sed either default to processing files
 * in this way or have command line switches or modules to easily implement these wrapper semantics,  e.g.,
 * <a href="http://rosettacode.org/wiki/Perl">Perl</a> and <a href="http://rosettacode.org/wiki/Python">Python</a>).
 * </p>
 * <p>
 * The "rot-13" encoding is commonly known from the early days of Usenet "Netnews" as a way of obfuscating text to
 * prevent casual reading of <a href="http://en.wikipedia.org/wiki/Spoiler_(media)">spoiler</a> or potentially
 * offensive material. Many news reader and mail user agent programs have built-in "rot-13" encoder/decoders or
 * have the ability to feed a message through any external utility script for performing this (or other) actions.
 * </p>
 * <p>
 * The definition of the rot-13 function is to simply replace every letter of the ASCII alphabet with the letter
 * which is "rotated" 13 characters "around" the 26 letter alphabet from its normal cardinal position (wrapping
 * around from "z" to "a" as necessary). Thus the letters "abc" become "nop" and so on. Technically rot-13 is a
 * "monoalphabetic substitution cipher" with a trivial "key". A proper implementation should work on upper and lower
 * case letters, preserve case, and pass all non-alphabetic characters in the input stream through without alteration.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Rot-13">rosettacode.org/wiki/Rot-13</a>
 */


public class RRot13{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(25);
 private static final char[] $05={8,1,10,1,0,1,10,1,2,0};
 private static final java.lang.String $0="RRot13.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx fileNames=null;
  java.io.BufferedReader rdr=null;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx fileName=null;
  java.io.IOException ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  fileNames=$1[0];}
  
  
  
  {try{
   if ((fileNames.length()).OpGt(null,$02)) 
    {
     {int $2=(fileNames.words()).OpPlus(null).toint();n_=new netrexx.lang.Rexx((byte)1);n_:for(;$2>0;$2--,n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
      fileName=fileNames.word(n_);
      rdr=new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(new java.io.File(netrexx.lang.Rexx.toString(fileName)))));
      encipher(rdr);
      }
     }/*n_*/
    }
   else 
    {
     rdr=new java.io.BufferedReader((java.io.Reader)(new java.io.InputStreamReader(java.lang.System.in)));
     encipher(rdr);
    }
  }
  catch (java.io.IOException $3){ex=$3;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static void encipher(java.io.BufferedReader rdr) throws java.io.IOException{
  java.lang.String line=null;
  
  {l_:for(;;){
   line=rdr.readLine();
   if (line==null) 
    break l_;
   netrexx.lang.RexxIO.Say(rot13(netrexx.lang.Rexx.toRexx(line)));
   }
  }/*l_*/
  return;
  }

 
 
 public static netrexx.lang.Rexx caesar_encipher(netrexx.lang.Rexx input,int idx,boolean caps) throws java.lang.IllegalArgumentException{
  
  return caesar(input,idx,caps);
  }

 
 public static netrexx.lang.Rexx caesar_decipher(netrexx.lang.Rexx input,int idx,boolean caps) throws java.lang.IllegalArgumentException{
  
  return caesar(input,new netrexx.lang.Rexx((int)((byte)26)).OpSub(null,new netrexx.lang.Rexx(idx)).toint(),isFalse());
  }

 
 public static netrexx.lang.Rexx caesar_encipher(netrexx.lang.Rexx input,int idx) throws java.lang.IllegalArgumentException{
  
  return caesar(input,idx,isFalse());
  }

 
 public static netrexx.lang.Rexx caesar_decipher(netrexx.lang.Rexx input,int idx) throws java.lang.IllegalArgumentException{
  
  return caesar(input,new netrexx.lang.Rexx((int)((byte)26)).OpSub(null,new netrexx.lang.Rexx(idx)).toint(),isFalse());
  }

 
 public static netrexx.lang.Rexx caesar_encipher(netrexx.lang.Rexx input,int idx,netrexx.lang.Rexx opt) throws java.lang.IllegalArgumentException{
  
  return caesar(input,idx,opt);
  }

 
 public static netrexx.lang.Rexx caesar_decipher(netrexx.lang.Rexx input,int idx,netrexx.lang.Rexx opt) throws java.lang.IllegalArgumentException{
  
  return caesar(input,new netrexx.lang.Rexx((int)((byte)26)).OpSub(null,new netrexx.lang.Rexx(idx)).toint(),opt);
  }

 
 public static netrexx.lang.Rexx caesar(netrexx.lang.Rexx input,int idx,netrexx.lang.Rexx opt) throws java.lang.IllegalArgumentException{
  boolean caps=false;
  
  if ((opt.upper().abbrev(new netrexx.lang.Rexx('U'))).OpGtEq(null,$03)) 
   caps=isTrue();
  else 
   caps=isFalse();
  
  return caesar(input,idx,caps);
  }

 
 public static netrexx.lang.Rexx caesar(netrexx.lang.Rexx input,int idx) throws java.lang.IllegalArgumentException{
  
  return caesar(input,idx,isFalse());
  }

 
 public static netrexx.lang.Rexx caesar(netrexx.lang.Rexx input,int idx,boolean caps) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx itab;
  netrexx.lang.Rexx shift;
  netrexx.lang.Rexx tl=null;
  netrexx.lang.Rexx tr=null;
  netrexx.lang.Rexx otab;
  netrexx.lang.Rexx cipher;
  
  if (new netrexx.lang.Rexx(idx).OpLt(null,$03)|new netrexx.lang.Rexx(idx).OpGt(null,$04)) 
   throw new java.lang.IllegalArgumentException();
  
  //      12345678901234567890123456
  itab=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  shift=(itab.length()).OpSub(null,new netrexx.lang.Rexx(idx));
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
  $4[1]=shift;
  netrexx.lang.RexxParse.parse(itab,$05,$4);
  tl=$4[0];tr=$4[2];}
  otab=tr.OpCc(null,tl);
  
  if (caps) 
   input=input.upper();
  
  cipher=input.translate(itab.OpCc(null,itab.lower()),otab.OpCc(null,otab.lower()));
  
  return cipher;
  }

 
 public static netrexx.lang.Rexx rot13(netrexx.lang.Rexx input) throws java.lang.IllegalArgumentException{
  
  return caesar(input,13,isFalse());
  }

 
 public static boolean isTrue(){
  return (1==1);
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RRot13(){return;}
 }
