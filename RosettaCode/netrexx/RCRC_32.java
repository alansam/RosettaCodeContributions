/* Generated from 'RCRC_32.nrx' 24 Sep 2012 14:47:23 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RCRC_32{
 private static final java.lang.String $0="RCRC_32.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String toBeEncoded;
  java.util.zip.CRC32 myCRC;
  toBeEncoded=new java.lang.String("The quick brown fox jumps over the lazy dog");
  myCRC=new java.util.zip.CRC32();
  myCRC.update(toBeEncoded.getBytes());
  netrexx.lang.RexxIO.Say("The CRC-32 value is :"+" "+java.lang.Long.toHexString(myCRC.getValue())+" "+"!");
  
  return;
  }
 
 private RCRC_32(){return;}
 }
