/* Generated from 'RRandomNumberGen_Device.nrx' 25 Aug 2012 21:37:55 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RRandomNumberGen_Device{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("0x");
 private static final java.lang.String $0="RRandomNumberGen_Device.nrx";
 /* properties constant */
 protected static final java.lang.String randomDevName="/dev/random";
 /* properties indirect */
 private java.io.InputStream randomDevIStream;

 
 public java.math.BigInteger getRandomLong() throws java.io.FileNotFoundException,java.io.IOException{
  byte randomBytes[];
  java.math.BigInteger randomNum;
  if ((getRandomDevIStream())==null) 
   initialize();
  randomBytes=new byte[8];
  getRandomDevIStream().read(randomBytes,0,randomBytes.length);
  randomNum=new java.math.BigInteger(randomBytes);
  return randomNum;
  }
 
 protected void initialize() throws java.io.FileNotFoundException{
  setRandomDevIStream((java.io.InputStream)(new java.io.BufferedInputStream((java.io.InputStream)(new java.io.FileInputStream(new java.io.File(randomDevName))))));
  return;
  }
 
 protected void finalize() throws java.io.IOException{
  if ((getRandomDevIStream())!=null) 
   {
    getRandomDevIStream().close();
    setRandomDevIStream((java.io.InputStream)null);
   }
  return;
  }
 
 public static void main(java.lang.String args[]){
  RRandomNumberGen_Device lcl=null;
  java.math.BigInteger randomNum=null;
  java.io.IOException ex=null;
  {try{
   lcl=new RRandomNumberGen_Device();
   {int $1=10;for(;$1>0;$1--){
    randomNum=lcl.getRandomLong();
    netrexx.lang.RexxIO.Say((((new netrexx.lang.Rexx(randomNum.longValue())).right(new netrexx.lang.Rexx((byte)24))).OpCcblank(null,$01)).OpCc(null,(new netrexx.lang.Rexx(java.lang.Long.toHexString(randomNum.longValue()))).right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
    }
   }
  }
  catch (java.io.IOException $2){ex=$2;
   ex.printStackTrace();
  }}
  return;
  }
 
 public java.io.InputStream getRandomDevIStream(){return randomDevIStream;}
 
 public void setRandomDevIStream(java.io.InputStream $3){randomDevIStream=$3;return;}
 
 public RRandomNumberGen_Device(){return;}
 }
