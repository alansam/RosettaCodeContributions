/* Generated from 'RCaesar.nrx' 18 Jul 2011 23:09:38 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Caesar cipher</h3>
 * <p>
 * Implement a <a href="http://en.wikipedia.org/wiki/Caesar_cipher">Caesar</a> cipher, both encryption and decryption.
 * The key is an integer from 1 to 25. This cipher rotates the letters of the alphabet (A to Z).
 * The encryption replaces each letter with the 1st to 25th next letter in the alphabet (wrapping Z to A).
 * So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".
 * This simple "monoalphabetic substitution cipher" provides almost no security, because an attacker who has the
 * encrypted message can either use frequency analysis to guess the key, or just try all 25 keys.
 * </p>
 * <p>
 * Caesar cipher is identical to <a href="http://rosettacode.org/wiki/Vigen%C3%A8re_cipher">Vigen�re</a> cipher
 * with key of length 1. Also, <a href="http://rosettacode.org/wiki/Rot-13">Rot-13</a> is identical to
 * Caesar cipher with key 13.
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Caesar_cipher">http://rosettacode.org/wiki/Caesar_cipher</a>
 */


public class RCaesar{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(25);
 private static final char[] $03={8,1,10,1,0,1,10,1,2,0};
 private static final java.lang.String $0="RCaesar.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx messages[];
  netrexx.lang.Rexx keys[];
  netrexx.lang.Rexx m_=null;
  netrexx.lang.Rexx in=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx ec=null;
  netrexx.lang.Rexx dc=null;
  messages=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("The five boxing wizards jump quickly"),netrexx.lang.Rexx.toRexx("Attack at dawn!"),netrexx.lang.Rexx.toRexx("HI")};
  
  
  
  keys=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((byte)25),new netrexx.lang.Rexx((byte)13)};
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(messages.length).OpSub(null,$01);m_=new netrexx.lang.Rexx((byte)0);m_:for(;m_.OpLtEq(null,$1);m_=m_.OpAdd(null,new netrexx.lang.Rexx(1))){
   in=messages[m_.toint()];
   {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(keys.length).OpSub(null,$01);k_=new netrexx.lang.Rexx((byte)0);k_:for(;k_.OpLtEq(null,$2);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Caesar cipher, key:").OpCcblank(null,keys[k_.toint()].right(new netrexx.lang.Rexx((byte)3))));
    ec=caesar_encipher(in,(keys[k_.toint()]).toint());
    dc=caesar_decipher(ec,(keys[k_.toint()]).toint());
    netrexx.lang.RexxIO.Say(in);
    netrexx.lang.RexxIO.Say(ec);
    netrexx.lang.RexxIO.Say(dc);
    netrexx.lang.RexxIO.Say("");
    }
   }/*k_*/
   netrexx.lang.RexxIO.Say("Rot-13:");
   ec=rot13(in);
   dc=rot13(ec);
   netrexx.lang.RexxIO.Say(in);
   netrexx.lang.RexxIO.Say(ec);
   netrexx.lang.RexxIO.Say(dc);
   netrexx.lang.RexxIO.Say("");
   }
  }/*m_*/
  
  return;
  }

 
 public static netrexx.lang.Rexx rot13(netrexx.lang.Rexx input) throws java.lang.IllegalArgumentException{
  
  return caesar(input,13,isFalse());
  }

 
 public static netrexx.lang.Rexx caesar(netrexx.lang.Rexx input,int idx,boolean caps) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx itab;
  netrexx.lang.Rexx shift;
  netrexx.lang.Rexx tl=null;
  netrexx.lang.Rexx tr=null;
  netrexx.lang.Rexx otab;
  netrexx.lang.Rexx cipher;
  
  if (new netrexx.lang.Rexx(idx).OpLt(null,$01)|new netrexx.lang.Rexx(idx).OpGt(null,$02)) 
   throw new java.lang.IllegalArgumentException();
  
  //      12345678901234567890123456
  itab=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  shift=(itab.length()).OpSub(null,new netrexx.lang.Rexx(idx));
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
  $3[1]=shift;
  netrexx.lang.RexxParse.parse(itab,$03,$3);
  tl=$3[0];tr=$3[2];}
  otab=tr.OpCc(null,tl);
  
  if (caps) 
   input=input.upper();
  
  cipher=input.translate(itab.OpCc(null,itab.lower()),otab.OpCc(null,otab.lower()));
  
  return cipher;
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
  
  if ((opt.upper().abbrev(new netrexx.lang.Rexx('U'))).OpGtEq(null,$01)) 
   caps=isTrue();
  else 
   caps=isFalse();
  
  return caesar(input,idx,caps);
  }

 
 public static netrexx.lang.Rexx caesar(netrexx.lang.Rexx input,int idx) throws java.lang.IllegalArgumentException{
  
  return caesar(input,idx,isFalse());
  }

 
 public static boolean isTrue(){
  return (1==1);
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RCaesar(){return;}
 }
