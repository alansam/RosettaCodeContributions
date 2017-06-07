/* Generated from 'RVig01.nrx' 30 Jul 2011 09:19:33 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>Vigen�re cipher</h3>
 * <p>
 * Implement a <a href="http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher">Vigen�re cipher</a>, both encryption
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


public class RVig01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(' ');
 private static final char[] $05={1,10,13,0,1,2,3,4,5,6,7,8,9,10,11,12,0};
 private static final java.lang.String $0="RVig01.nrx";
 
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
  
  return;
  }

 
 public static netrexx.lang.Rexx vigenere_encipher(netrexx.lang.Rexx key,netrexx.lang.Rexx plaintext){
  netrexx.lang.Rexx alpha;
  netrexx.lang.Rexx ciphertext;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx M=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx K=null;
  netrexx.lang.Rexx C=null;
  
  alpha=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  
  plaintext=stringscrubber(plaintext);
  key=stringscrubber(key);
  ciphertext=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=plaintext.length();l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$1);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   M=(alpha.pos(plaintext.substr(l_,new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   k_=((l_.OpSub(null,$01))).OpRem(null,key.length());
   K=(alpha.pos(key.substr(k_.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   C=mod(((M.OpAdd(null,K))).toint(),(alpha.length()).toint());
   C=alpha.substr(C.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1));
   ciphertext=ciphertext.OpCc(null,C);
   }
  }/*l_*/
  
  return ciphertext;
  }

 
 public static netrexx.lang.Rexx vigenere_decipher(netrexx.lang.Rexx key,netrexx.lang.Rexx ciphertext){
  netrexx.lang.Rexx alpha;
  netrexx.lang.Rexx plaintext;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx C=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx K=null;
  netrexx.lang.Rexx D=null;
  
  alpha=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  
  ciphertext=stringscrubber(ciphertext);
  key=stringscrubber(key);
  plaintext=netrexx.lang.Rexx.toRexx("");
  
  {netrexx.lang.Rexx $2=ciphertext.length();l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$2);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   C=(alpha.pos(ciphertext.substr(l_,new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   k_=((l_.OpSub(null,$01))).OpRem(null,key.length());
   K=(alpha.pos(key.substr(k_.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1)))).OpSub(null,$01);
   D=mod(((C.OpSub(null,K))).toint(),(alpha.length()).toint());
   D=alpha.substr(D.OpAdd(null,$01),new netrexx.lang.Rexx((byte)1));
   plaintext=plaintext.OpCc(null,D);
   }
  }/*l_*/
  
  return plaintext;
  }

 
 private static netrexx.lang.Rexx mod(int N,int D){
  
  return ((new netrexx.lang.Rexx(D).OpAdd(null,(new netrexx.lang.Rexx(N).OpRem(null,new netrexx.lang.Rexx(D)))))).OpRem(null,new netrexx.lang.Rexx(D));
  }

 
 private static netrexx.lang.Rexx stringscrubber(netrexx.lang.Rexx cleanup){
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

 
 private static void test(netrexx.lang.Rexx key,netrexx.lang.Rexx pt){
  netrexx.lang.Rexx ct;
  netrexx.lang.Rexx dt;
  
  ct=vigenere_encipher(key,pt);
  display(ct);
  dt=vigenere_decipher(key,ct);
  display(dt);
  
  return;
  }

 
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
  {netrexx.lang.Rexx $3=text.length();c_=new netrexx.lang.Rexx((byte)1);c_:for(;c_.OpLtEq(null,$3);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   b_=o_.OpRem(null,$03);
   o_=o_.OpAdd(null,$01);
   if (b_.OpEq(null,$02)) 
    line=line.OpCc(null,$04);
   line=line.OpCc(null,text.substr(c_,new netrexx.lang.Rexx((byte)1)));
   }
  }/*c_*/
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("....+....|").copies(new netrexx.lang.Rexx((byte)8)));
  {l_:for(;;){
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[13];
   netrexx.lang.RexxParse.parse(line,$05,$4);
   w1=$4[0];w2=$4[1];w3=$4[2];w4=$4[3];w5=$4[4];w6=$4[5];W7=$4[6];w8=$4[7];w9=$4[8];w10=$4[9];w11=$4[10];w12=$4[11];line=$4[12];}
   pline=((((((((((w1.OpCcblank(null,w2)).OpCcblank(null,w3)).OpCcblank(null,w4)).OpCcblank(null,w5)).OpCcblank(null,w6)).OpCcblank(null,W7)).OpCcblank(null,w8)).OpCcblank(null,w9)).OpCcblank(null,w10)).OpCcblank(null,w11)).OpCcblank(null,w12);
   netrexx.lang.RexxIO.Say(pline.strip());
   if ((line.strip().length()).OpEq(null,$02)) 
    break l_;
   }
  }/*l_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 private static netrexx.lang.Rexx sampledata(){
  char NL;
  netrexx.lang.Rexx antic_disposition[]=null;
  netrexx.lang.Rexx melancholy_dane;
  netrexx.lang.Rexx l_=null;
  
  NL='\n';
  
  
  antic_disposition=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("To be, or not to be--that is the question:"),new netrexx.lang.Rexx("Whether \'tis nobler in the mind to suffer"),new netrexx.lang.Rexx("The slings and arrows of outrageous fortune"),new netrexx.lang.Rexx("Or to take arms against a sea of troubles"),new netrexx.lang.Rexx("And by opposing end them. To die, to sleep--"),new netrexx.lang.Rexx("No more--and by a sleep to say we end"),new netrexx.lang.Rexx("The heartache, and the thousand natural shocks"),new netrexx.lang.Rexx("That flesh is heir to. \'Tis a consummation"),new netrexx.lang.Rexx("Devoutly to be wished. To die, to sleep--"),new netrexx.lang.Rexx("To sleep--perchance to dream: ay, there\'s the rub,"),new netrexx.lang.Rexx("For in that sleep of death what dreams may come"),new netrexx.lang.Rexx("When we have shuffled off this mortal coil,"),new netrexx.lang.Rexx("Must give us pause. There\'s the respect"),new netrexx.lang.Rexx("That makes calamity of so long life."),new netrexx.lang.Rexx("For who would bear the whips and scorns of time,"),new netrexx.lang.Rexx("Th\' oppressor\'s wrong, the proud man\'s contumely"),new netrexx.lang.Rexx("The pangs of despised love, the law\'s delay,"),new netrexx.lang.Rexx("The insolence of office, and the spurns"),new netrexx.lang.Rexx("That patient merit of th\' unworthy takes,"),new netrexx.lang.Rexx("When he himself might his quietus make"),new netrexx.lang.Rexx("With a bare bodkin? Who would fardels bear,"),new netrexx.lang.Rexx("To grunt and sweat under a weary life,"),new netrexx.lang.Rexx("But that the dread of something after death,"),new netrexx.lang.Rexx("The undiscovered country, from whose bourn"),new netrexx.lang.Rexx("No traveller returns, puzzles the will,"),new netrexx.lang.Rexx("And makes us rather bear those ills we have"),new netrexx.lang.Rexx("Than fly to others that we know not of?"),new netrexx.lang.Rexx("Thus conscience does make cowards of us all,"),new netrexx.lang.Rexx("And thus the native hue of resolution"),new netrexx.lang.Rexx("Is sicklied o\'er with the pale cast of thought,"),new netrexx.lang.Rexx("And enterprise of great pith and moment"),new netrexx.lang.Rexx("With this regard their currents turn awry"),new netrexx.lang.Rexx("And lose the name of action. -- Soft you now,"),new netrexx.lang.Rexx("The fair Ophelia! -- Nymph, in thy orisons"),new netrexx.lang.Rexx("Be all my sins remembered.")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  melancholy_dane=new netrexx.lang.Rexx("");
  {int $5=new netrexx.lang.Rexx(antic_disposition.length).OpPlus(null).toint();l_=new netrexx.lang.Rexx((byte)0);l_:for(;$5>0;$5--,l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   melancholy_dane=(melancholy_dane.OpCc(null,antic_disposition[l_.toint()])).OpCc(null,new netrexx.lang.Rexx(NL));
   }
  }/*l_*/
  
  return melancholy_dane;
  }
 
 private RVig01(){return;}
 }
