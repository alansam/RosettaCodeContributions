/* Generated from 'RVig02.nrx' 30 Jul 2011 12:41:05 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>Vigenère cipher</h3>
 * <p>
 * Implement a <a href="http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher">Vigenère cipher</a>, both encryption
 * and decryption. The program should handle keys and text of unequal length, and should capitalize everything
 * and discard non-alphabetic characters. (If your program handles non-alphabetic characters in another way,
 * make a note of it.)
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Vigen%C3%A8re_cipher">rosettacode.org/wiki/Vigen%C3%A8re_cipher</a>
 * @see <a href="http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher">http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher</a>
 * @see <a href="http://rosettacode.org/wiki/Vigen%C3%A8re_Cipher/Cryptanalysis">rosettacode.org/wiki/Vigen%C3%A8re_Cipher/Cryptanalysis</a>
 */


public class RVig02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(' ');
 private static final char[] $05={1,10,13,0,1,2,3,4,5,6,7,8,9,10,11,12,0};
 private static final java.lang.String $0="RVig02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx pt;
  netrexx.lang.Rexx key;
  pt=netrexx.lang.Rexx.toRexx("Attack at dawn!");
  key=netrexx.lang.Rexx.toRexx("LEMON");
  test(key,pt);
  
  key=new netrexx.lang.Rexx('N'); // rot-13
  test(key,pt);
  
  key=new netrexx.lang.Rexx('B'); // Caesar
  test(key,pt);
  
  pt=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  key=new netrexx.lang.Rexx('A');
  test(key,pt);
  
  pt=sampledata();
  key=netrexx.lang.Rexx.toRexx("Hamlet; Prince of Denmark");
  test(key,pt);
  
  pt=sampledata(netrexx.lang.Rexx.toRexx("Jab"));
  key=netrexx.lang.Rexx.toRexx("Through the Looking-Glass and What Alice Found There");
  test(key,pt);
  
  return;
  }

 /**
  * The encipher algorithm for a Vigenère cipher.
  * <p>
  * Note: Encipherment nd decipherment differ only in the <strong>sign</strong> of the encipherment key
  * being applied to the text.  The <code>meth</code> parameter is examined to determine if encipher or
  * decipher is requested and sets up a factor to be applied to the key character to set it's sign
  * appropriately.
  * </p>
  *
  * @param meth the type of process; encipher of decipher
  * @param key the cipher key
  * @param text the text to encode/decode
  * @return the input text as manipulated by the algorithm
  */
 
 public static netrexx.lang.Rexx vigenere(netrexx.lang.Rexx meth,netrexx.lang.Rexx key,netrexx.lang.Rexx text) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx df=null;
  netrexx.lang.Rexx alpha;
  netrexx.lang.Rexx code;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx M=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx K=null;
  netrexx.lang.Rexx C=null;
  
  {/*select*/
  if (netrexx.lang.Rexx.toRexx("encipher").abbrev(meth.lower(),new netrexx.lang.Rexx((byte)1)).toboolean())
   df=new netrexx.lang.Rexx((byte)1);
  else if (netrexx.lang.Rexx.toRexx("decipher").abbrev(meth.lower(),new netrexx.lang.Rexx((byte)1)).toboolean())
   df=$01.OpMinus(null);
  else{
   throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString(meth.OpCcblank(null,netrexx.lang.Rexx.toRexx("must be \"encipher\" or \"decipher\""))));
  }
  }
  
  alpha=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  
  text=stringscrubber(text); // Clean up the text
  key=stringscrubber(key); // Clean up the key
  code=netrexx.lang.Rexx.toRexx("");
  
  // This is the algorithm
  {netrexx.lang.Rexx $1=text.length();l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$1);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   M=(alpha.pos(text.substr(l_,new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   k_=((l_.OpSub(null,$01))).OpRem(null,key.length());
   K=(alpha.pos(key.substr(k_.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   C=mod(((M.OpAdd(null,K.OpMult(null,df)))).toint(),(alpha.length()).toint());
   C=alpha.substr(C.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1));
   code=code.OpCc(null,C);
   }
  }/*l_*/
  
  return code;
  }

 /**
  * Helper function - encipher
  *
  * @param key the cipher key
  * @param plaintext the text to encode
  * @return the cipher
  */
 
 public static netrexx.lang.Rexx vigenere_encipher(netrexx.lang.Rexx key,netrexx.lang.Rexx plaintext) throws java.lang.IllegalArgumentException{
  
  return vigenere(netrexx.lang.Rexx.toRexx("encipher"),key,plaintext);
  }

 /**
  * Helper function - encipher
  *
  * @param key the cipher key
  * @param ciphertext the cipher to decode
  * @return the deciphered text
  */
 
 public static netrexx.lang.Rexx vigenere_decipher(netrexx.lang.Rexx key,netrexx.lang.Rexx ciphertext){
  
  return vigenere(netrexx.lang.Rexx.toRexx("decipher"),key,ciphertext);
  }

 
 private static netrexx.lang.Rexx mod(int N,int D){
  
  return ((new netrexx.lang.Rexx(D).OpAdd(null,(new netrexx.lang.Rexx(N).OpRem(null,new netrexx.lang.Rexx(D)))))).OpRem(null,new netrexx.lang.Rexx(D));
  }

 /**
  * Normalize the input to the text to ensure that it only contains characters that can be passed
  * to the cipher algorithm.
  * <p>
  * The algorithm only accepts the basic 26 alphabetic characters A-Z.  This method removes all spaces,
  * numerals, punctuation and special characters.
  * </p>
  *
  * @param cleanup a text string
  * @return a version of the text suitable for input into the cipher algorithm
  */
 
 private static netrexx.lang.Rexx stringscrubber(netrexx.lang.Rexx cleanup) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx alpha;
  netrexx.lang.Rexx x_=null;
  
  alpha=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  
  cleanup=cleanup.upper().space(new netrexx.lang.Rexx((byte)0));
  {f_:for(;;){
   x_=cleanup.verify(alpha);
   if (x_.OpEq(null,$02)) 
    break f_;
   cleanup=cleanup.changestr(cleanup.substr(x_,new netrexx.lang.Rexx((byte)1)),netrexx.lang.Rexx.toRexx(""));
   }
  }/*f_*/
  
  return cleanup;
  }

 /**
  * Testing
  *
  * @param key the key to use for this test
  * @param pt the text to run through the test
  */
 
 private static void test(netrexx.lang.Rexx key,netrexx.lang.Rexx pt){
  netrexx.lang.Rexx ct;
  netrexx.lang.Rexx dt;
  
  ct=vigenere_encipher(key,pt);
  display(ct);
  dt=vigenere_decipher(key,ct);
  display(dt);
  
  return;
  }

 /**
  * Present the result set in a readable form.
  * <p>
  * Formats the input as blocks of 5 characters, 12 blocks per line.  e.g:
  * </p>
  * <pre>
  * TOBEO RNOTT OBETH ATIST HEQUE STION WHETH ERTIS NOBLE RINTH EMIND TOSUF
  * FERTH ESLIN GSAND ARROW ...
  * </pre>
  *
  * @param text a message to format
  */
 
 public static void display(netrexx.lang.Rexx text){
  netrexx.lang.Rexx line;
  netrexx.lang.Rexx o_;
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx b_=null;
  netrexx.lang.Rexx w1=null;
  netrexx.lang.Rexx w2=null;
  netrexx.lang.Rexx w3=null;
  netrexx.lang.Rexx w4=null;
  netrexx.lang.Rexx w5=null;
  netrexx.lang.Rexx w6=null;
  netrexx.lang.Rexx W7=null;
  netrexx.lang.Rexx w8=null;
  netrexx.lang.Rexx w9=null;
  netrexx.lang.Rexx w10=null;
  netrexx.lang.Rexx w11=null;
  netrexx.lang.Rexx w12=null;
  netrexx.lang.Rexx pline=null;
  
  line=netrexx.lang.Rexx.toRexx("");
  o_=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=text.length();c_=new netrexx.lang.Rexx((byte)1);c_:for(;c_.OpLtEq(null,$2);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   b_=o_.OpRem(null,$03);
   o_=o_.OpAdd(null,$01);
   if (b_.OpEq(null,$02)) 
    line=line.OpCc(null,$04);
   line=line.OpCc(null,text.substr(c_,new netrexx.lang.Rexx((byte)1)));
   }
  }/*c_*/
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("....+....|").copies(new netrexx.lang.Rexx((byte)8)));
  {l_:for(;;){
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[13];
   netrexx.lang.RexxParse.parse(line,$05,$3);
   w1=$3[0];w2=$3[1];w3=$3[2];w4=$3[3];w5=$3[4];w6=$3[5];W7=$3[6];w8=$3[7];w9=$3[8];w10=$3[9];w11=$3[10];w12=$3[11];line=$3[12];}
   pline=((((((((((w1.OpCcblank(null,w2)).OpCcblank(null,w3)).OpCcblank(null,w4)).OpCcblank(null,w5)).OpCcblank(null,w6)).OpCcblank(null,W7)).OpCcblank(null,w8)).OpCcblank(null,w9)).OpCcblank(null,w10)).OpCcblank(null,w11)).OpCcblank(null,w12);
   netrexx.lang.RexxIO.Say(pline.strip());
   if ((line.strip().length()).OpEq(null,$02)) 
    break l_;
   }
  }/*l_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /**
  * Set up some sample data to make a realistic test.
  * <ol>
  * <li>
  * (The soliloquy from Hamlet, Act 3 Scene 1)
  * </li>
  * <li>
  * (Jabberwocky, by Lewis Carroll from Through the Looking-Glass and What Alice Found There, 1872)
  * </li>
  * </ol>
  *
  * @param what which text to return ("jabberwocky" or "hamlet")
  * @return a block of sample data
  */
 
 private static netrexx.lang.Rexx sampledata(netrexx.lang.Rexx what){
  char NL;
  netrexx.lang.Rexx antic_disposition[]=null;
  netrexx.lang.Rexx jabberwocky[];
  netrexx.lang.Rexx melancholy_dane;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx looking_glass;
  netrexx.lang.Rexx text=null;
  
  NL='\n';
  
  
  antic_disposition=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("To be, or not to be--that is the question:"),new netrexx.lang.Rexx("Whether \'tis nobler in the mind to suffer"),new netrexx.lang.Rexx("The slings and arrows of outrageous fortune"),new netrexx.lang.Rexx("Or to take arms against a sea of troubles"),new netrexx.lang.Rexx("And by opposing end them. To die, to sleep--"),new netrexx.lang.Rexx("No more--and by a sleep to say we end"),new netrexx.lang.Rexx("The heartache, and the thousand natural shocks"),new netrexx.lang.Rexx("That flesh is heir to. \'Tis a consummation"),new netrexx.lang.Rexx("Devoutly to be wished. To die, to sleep--"),new netrexx.lang.Rexx("To sleep--perchance to dream: ay, there\'s the rub,"),new netrexx.lang.Rexx("For in that sleep of death what dreams may come"),new netrexx.lang.Rexx("When we have shuffled off this mortal coil,"),new netrexx.lang.Rexx("Must give us pause. There\'s the respect"),new netrexx.lang.Rexx("That makes calamity of so long life."),new netrexx.lang.Rexx("For who would bear the whips and scorns of time,"),new netrexx.lang.Rexx("Th\' oppressor\'s wrong, the proud man\'s contumely"),new netrexx.lang.Rexx("The pangs of despised love, the law\'s delay,"),new netrexx.lang.Rexx("The insolence of office, and the spurns"),new netrexx.lang.Rexx("That patient merit of th\' unworthy takes,"),new netrexx.lang.Rexx("When he himself might his quietus make"),new netrexx.lang.Rexx("With a bare bodkin? Who would fardels bear,"),new netrexx.lang.Rexx("To grunt and sweat under a weary life,"),new netrexx.lang.Rexx("But that the dread of something after death,"),new netrexx.lang.Rexx("The undiscovered country, from whose bourn"),new netrexx.lang.Rexx("No traveller returns, puzzles the will,"),new netrexx.lang.Rexx("And makes us rather bear those ills we have"),new netrexx.lang.Rexx("Than fly to others that we know not of?"),new netrexx.lang.Rexx("Thus conscience does make cowards of us all,"),new netrexx.lang.Rexx("And thus the native hue of resolution"),new netrexx.lang.Rexx("Is sicklied o\'er with the pale cast of thought,"),new netrexx.lang.Rexx("And enterprise of great pith and moment"),new netrexx.lang.Rexx("With this regard their currents turn awry"),new netrexx.lang.Rexx("And lose the name of action. -- Soft you now,"),new netrexx.lang.Rexx("The fair Ophelia! -- Nymph, in thy orisons"),new netrexx.lang.Rexx("Be all my sins remembered.")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  jabberwocky=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("Twas brillig, and the slithy toves"),new netrexx.lang.Rexx("Did gyre and gimble in the wabe:"),new netrexx.lang.Rexx("All mimsy were the borogoves,"),new netrexx.lang.Rexx("And the mome raths outgrabe."),new netrexx.lang.Rexx("\"Beware the Jabberwock, my son!"),new netrexx.lang.Rexx("The jaws that bite, the claws that catch!"),new netrexx.lang.Rexx("Beware the Jubjub bird, and shun"),new netrexx.lang.Rexx("The frumious Bandersnatch!\""),new netrexx.lang.Rexx("He took his vorpal sword in hand:"),new netrexx.lang.Rexx("Long time the manxome foe he sought --"),new netrexx.lang.Rexx("So rested he by the Tumtum tree,"),new netrexx.lang.Rexx("And stood awhile in thought."),new netrexx.lang.Rexx("And, as in uffish thought he stood,"),new netrexx.lang.Rexx("The Jabberwock, with eyes of flame,"),new netrexx.lang.Rexx("Came whiffling through the tulgey wood,"),new netrexx.lang.Rexx("And burbled as it came!"),new netrexx.lang.Rexx("One, two! One, two! And through and through"),new netrexx.lang.Rexx("The vorpal blade went snicker-snack!"),new netrexx.lang.Rexx("He left it dead, and with its head"),new netrexx.lang.Rexx("He went galumphing back."),new netrexx.lang.Rexx("\"And, has thou slain the Jabberwock?"),new netrexx.lang.Rexx("Come to my arms, my beamish boy!"),new netrexx.lang.Rexx("O frabjous day! Callooh! Callay!\""),new netrexx.lang.Rexx("He chortled in his joy."),new netrexx.lang.Rexx("Twas brillig, and the slithy toves"),new netrexx.lang.Rexx("Did gyre and gimble in the wabe;"),new netrexx.lang.Rexx("All mimsy were the borogoves,"),new netrexx.lang.Rexx("And the mome raths outgrabe.")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  melancholy_dane=new netrexx.lang.Rexx("");
  {int $4=new netrexx.lang.Rexx(antic_disposition.length).OpPlus(null).toint();l_=new netrexx.lang.Rexx((byte)0);l_:for(;$4>0;$4--,l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   melancholy_dane=(melancholy_dane.OpCc(null,antic_disposition[l_.toint()])).OpCc(null,new netrexx.lang.Rexx(NL));
   }
  }/*l_*/
  
  looking_glass=new netrexx.lang.Rexx("");
  {int $5=new netrexx.lang.Rexx(jabberwocky.length).OpPlus(null).toint();l_=new netrexx.lang.Rexx((byte)0);l_:for(;$5>0;$5--,l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   looking_glass=(looking_glass.OpCc(null,jabberwocky[l_.toint()])).OpCc(null,new netrexx.lang.Rexx(NL));
   }
  }/*l_*/
  
  {/*select*/
  if (netrexx.lang.Rexx.toRexx("hamlet").abbrev(what.lower(),new netrexx.lang.Rexx((byte)1)).toboolean())
   text=melancholy_dane;
  else if (netrexx.lang.Rexx.toRexx("jabberwocky").abbrev(what.lower(),new netrexx.lang.Rexx((byte)1)).toboolean())
   text=looking_glass;
  else{
   text=melancholy_dane;
  }
  }
  
  return text;
  }

 /**
  * Get the default sample data
  *
  * @return a block of sample data
  */
 
 private static netrexx.lang.Rexx sampledata(){
  
  return sampledata(new netrexx.lang.Rexx('H'));
  }
 
 private RVig02(){return;}
 }
