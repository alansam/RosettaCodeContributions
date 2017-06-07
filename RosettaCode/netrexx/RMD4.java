/* Generated from 'RMD4.nrx' 15 Aug 2013 22:33:48 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




// RFC 1320 MD4 test suite:

public class RMD4{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("<Message>");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("</Message>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("</");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("</Verify>");
 private static final java.lang.String $0="RMD4.nrx";
 
 public static void main(java.lang.String $0s[]){
  MD4(netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("31d6cfe0d16ae931b73c59d7e0c089c0"));
  MD4(new netrexx.lang.Rexx('a'),netrexx.lang.Rexx.toRexx("bde52cb31de33e46245e05fbdbd6fb24"));
  MD4(netrexx.lang.Rexx.toRexx("abc"),netrexx.lang.Rexx.toRexx("a448017aaf21d8525fc10ae87aa6729d"));
  MD4(netrexx.lang.Rexx.toRexx("message digest"),netrexx.lang.Rexx.toRexx("d9130a8164549fe818874806e1c7014b"));
  MD4(netrexx.lang.Rexx.toRexx("abcdefghijklmnopqrstuvwxyz"),netrexx.lang.Rexx.toRexx("d79e1c308aa5bbcdeea8ed63df412da9"));
  MD4(netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"),netrexx.lang.Rexx.toRexx("043f8582f241db351ce627e153e7f0e4"));
  MD4(netrexx.lang.Rexx.toRexx("12345678901234567890123456789012345678901234567890123456789012345678901234567890"),netrexx.lang.Rexx.toRexx("e33b4ddc9c38f2199c3e7b164fcc0536"));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void MD4(netrexx.lang.Rexx messageText,netrexx.lang.Rexx verifyCheck){
  java.lang.String algorithm;
  netrexx.lang.Rexx digestSum;
  
  algorithm="MD4";
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
  return getDigest(messageText,netrexx.lang.Rexx.toRexx("MD4"),netrexx.lang.Rexx.toRexx("UTF-8"),true);
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
   md=java.security.MessageDigest.getInstance(netrexx.lang.Rexx.toString(algorithm));
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
 
 private RMD4(){return;}
 }
