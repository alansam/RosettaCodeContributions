/* Generated from 'RRandomNumberGen_Device02.nrx' 26 Aug 2012 13:06:10 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RRandomNumberGen_Device02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("0x");
 private static final java.lang.String $0="RRandomNumberGen_Device02.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.io.File randomDevNameFile=null;
  java.lang.String randomDevNameList[];
  java.io.InputStream randomDevIStream=null;
  int dn=0;
  byte randomBytes[]=null;
  java.math.BigInteger randomNum=null;
  java.io.IOException ex=null;
  randomDevNameList=new java.lang.String[]{"/dev/random","/dev/urandom"}; // list of random data source devices
  
  {try{
   {int $1=randomDevNameList.length-1;dn=0;dn:for(;dn<=$1;dn++){
    randomDevNameFile=new java.io.File(randomDevNameList[dn]);
    if (randomDevNameFile.exists()) 
     break dn; // We're done! Use this device
    randomDevNameFile=(java.io.File)null; // ensure we don't use a non-existant device
    }
   }/*dn*/
   if (randomDevNameFile==null) 
    throw new java.io.FileNotFoundException("Cannot locate a random data source device on this system");
   
   // read 8 bytes from the random data source device, convert it into a BigInteger then display the result
   randomBytes=new byte[8];
   randomDevIStream=(java.io.InputStream)(new java.io.BufferedInputStream((java.io.InputStream)(new java.io.FileInputStream(randomDevNameFile))));
   randomDevIStream.read(randomBytes,0,randomBytes.length);
   randomDevIStream.close();
   randomNum=new java.math.BigInteger(randomBytes);
   netrexx.lang.RexxIO.Say((((new netrexx.lang.Rexx(randomNum.longValue())).right(new netrexx.lang.Rexx((byte)24))).OpCcblank(null,$01)).OpCc(null,(new netrexx.lang.Rexx(java.lang.Long.toHexString(randomNum.longValue()))).right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  }
  catch (java.io.IOException $2){ex=$2;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RRandomNumberGen_Device02(){return;}
 }
/*
To run the program in a loop 10 times from a bash shell prompt use:
for ((i=0; i<10; ++i)); do java <program_name>; done # Shell loop to run the command 10 times
*/

