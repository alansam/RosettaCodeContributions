/* Generated from 'RMD5.nrx' 29 Nov 2012 18:50:22 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.security.MessageDigest;

/* NetRexx */






public class RMD5{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("<Message>");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("</Message>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("</");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("</Verify>");
 private static final java.lang.String $0="RMD5.nrx";
 
 public static void main(java.lang.String $0s[]){
  MD5(netrexx.lang.Rexx.toRexx("The quick brown fox jumps over the lazy dog"),netrexx.lang.Rexx.toRexx("9e107d9d372bb6826bd81d3542a419d6"));
  // RFC 1321 MD5 test suite:
  MD5(netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("d41d8cd98f00b204e9800998ecf8427e"));
  MD5(new netrexx.lang.Rexx('a'),netrexx.lang.Rexx.toRexx("0cc175b9c0f1b6a831c399e269772661"));
  MD5(netrexx.lang.Rexx.toRexx("abc"),netrexx.lang.Rexx.toRexx("900150983cd24fb0d6963f7d28e17f72"));
  MD5(netrexx.lang.Rexx.toRexx("message digest"),netrexx.lang.Rexx.toRexx("f96b697d7cb7938d525a2f31aaf161d0"));
  MD5(netrexx.lang.Rexx.toRexx("abcdefghijklmnopqrstuvwxyz"),netrexx.lang.Rexx.toRexx("c3fcd3d76192e4007dfb496cca67e13b"));
  MD5(netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"),netrexx.lang.Rexx.toRexx("d174ab98d277d9f5a5611c2c9f419d9f"));
  MD5(netrexx.lang.Rexx.toRexx("12345678901234567890123456789012345678901234567890123456789012345678901234567890"),netrexx.lang.Rexx.toRexx("57edf4a22be3c955ac49da2e2107b67a"));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void MD5(netrexx.lang.Rexx messageText,netrexx.lang.Rexx verifyCheck){
  java.lang.String algorithm;
  netrexx.lang.Rexx digestSum;
  
  algorithm="MD5";
  digestSum=getDigest(messageText,netrexx.lang.Rexx.toRexx(algorithm));
  
  netrexx.lang.RexxIO.Say(($01.OpCc(null,messageText)).OpCc(null,$02));
  netrexx.lang.RexxIO.Say((((((new netrexx.lang.Rexx("<"+algorithm+">")).right(new netrexx.lang.Rexx((byte)12))).OpCc(null,digestSum)).OpCc(null,$03)).OpCc(null,netrexx.lang.Rexx.toRexx(algorithm))).OpCc(null,$04));
  netrexx.lang.RexxIO.Say((((new netrexx.lang.Rexx("<Verify>")).right(new netrexx.lang.Rexx((byte)12))).OpCc(null,verifyCheck)).OpCc(null,$05));
  if (digestSum.OpEqS(null,verifyCheck)) 
   netrexx.lang.RexxIO.Say(algorithm+" "+"Confirmed");
  else 
   netrexx.lang.RexxIO.Say(algorithm+" "+"Failed");
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx getDigest(netrexx.lang.Rexx messageText){
  return getDigest(messageText,netrexx.lang.Rexx.toRexx("MD5"),netrexx.lang.Rexx.toRexx("UTF-8"),true);
  }
 public static netrexx.lang.Rexx getDigest(netrexx.lang.Rexx messageText,netrexx.lang.Rexx algorithm){
  return getDigest(messageText,algorithm,netrexx.lang.Rexx.toRexx("UTF-8"),true);
  }
 public static netrexx.lang.Rexx getDigest(netrexx.lang.Rexx messageText,netrexx.lang.Rexx algorithm,netrexx.lang.Rexx encoding){
  return getDigest(messageText,algorithm,encoding,true);
  }
 public static netrexx.lang.Rexx getDigest(netrexx.lang.Rexx messageText,netrexx.lang.Rexx algorithm,netrexx.lang.Rexx encoding,boolean lowercase){
  java.lang.String message;
  byte messageBytes[]=null;
  byte digestBytes[]=null;
  netrexx.lang.Rexx digestSum;
  java.security.MessageDigest md=null;
  int b_=0;
  netrexx.lang.Rexx bb=null;
  java.lang.Exception ex=null;
  
  algorithm=algorithm.upper();
  encoding=encoding.upper();
  
  message=new java.lang.String(netrexx.lang.Rexx.tochararray(messageText));
  
  
  digestSum=netrexx.lang.Rexx.toRexx("");
  
  {try{
   messageBytes=message.getBytes(netrexx.lang.Rexx.toString(encoding));
   md=MessageDigest.getInstance(netrexx.lang.Rexx.toString(algorithm));
   md.update(messageBytes);
   digestBytes=md.digest();
   
   {int $1=digestBytes.length-1;b_=0;b_:for(;b_<=$1;b_++){
    bb=(new netrexx.lang.Rexx(digestBytes[b_])).d2x(new netrexx.lang.Rexx((byte)2));
    if (lowercase) 
     digestSum=digestSum.OpCc(null,bb.lower());
    else 
     digestSum=digestSum.OpCc(null,bb.upper());
    }
   }/*b_*/
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return digestSum;
  }
 
 private RMD5(){return;}
 }
