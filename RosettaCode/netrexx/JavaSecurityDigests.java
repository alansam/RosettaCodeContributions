/* Generated from 'JavaSecurityDigests.nrx' 14 Jan 2013 10:46:52 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class JavaSecurityDigests{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("  ");
 private static final java.lang.String $0="JavaSecurityDigests.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx algorithms;
  java.lang.String message;
  int w_=0;
  netrexx.lang.Rexx algorithm=null;
  netrexx.lang.Rexx digest=null;
  algorithms=netrexx.lang.Rexx.toRexx("MD2 MD5 SHA SHA1 SHA-1 SHA-256 SHA-384 SHA-512 MD4 RIPEMD-160");
  message="Rosetta Code";
  
  {int $1=(algorithms.words()).toint();w_=1;w_:for(;w_<=$1;w_++){
   algorithm=algorithms.word(new netrexx.lang.Rexx(w_));
   digest=getDigest(netrexx.lang.Rexx.toRexx(message),algorithm);
   netrexx.lang.RexxIO.Say(algorithm);
   netrexx.lang.RexxIO.Say("  "+message);
   netrexx.lang.RexxIO.Say($01.OpCc(null,digest));
   netrexx.lang.RexxIO.Say("");
   }
  }/*w_*/
  return;}

 
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
   md=java.security.MessageDigest.getInstance(netrexx.lang.Rexx.toString(algorithm));
   md.update(messageBytes);
   digestBytes=md.digest();
   
   {int $2=digestBytes.length-1;b_=0;b_:for(;b_<=$2;b_++){
    bb=(new netrexx.lang.Rexx(digestBytes[b_])).d2x(new netrexx.lang.Rexx((byte)2));
    if (lowercase) 
     digestSum=digestSum.OpCc(null,bb.lower());
    else 
     digestSum=digestSum.OpCc(null,bb.upper());
    }
   }/*b_*/
  }
  catch (java.lang.Exception $3){ex=$3;
   ex.printStackTrace();
  }}
  
  return digestSum;
  }
 
 private JavaSecurityDigests(){return;}
 }
