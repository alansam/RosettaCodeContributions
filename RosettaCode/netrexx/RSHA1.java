/* Generated from 'RSHA1.nrx' 29 Nov 2012 18:56:36 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.security.MessageDigest;

/* NetRexx */





public class RSHA1{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("<Message>");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("</Message>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("</");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("</Verify>");
 private static final java.lang.String $0="RSHA1.nrx";
 
 public static void main(java.lang.String $0s[]){
  SHA1(netrexx.lang.Rexx.toRexx("Rosetta Code"),netrexx.lang.Rexx.toRexx("48c98f7e5a6e736d790ab740dfc3f51a61abe2b5"));
  
  return;
  }

 
 public static void SHA1(netrexx.lang.Rexx messageText,netrexx.lang.Rexx verifyCheck){
  java.lang.String algorithm;
  netrexx.lang.Rexx digestSum;
  
  algorithm="SHA-1";
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
 
 private RSHA1(){return;}
 }
