/* Generated from 'RAckermann.nrx' 14 May 2012 14:06:57 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




/**
 * @author alansamps@gmail.com
 * @version 1.0
 */

public class RAckermann{
 private static final java.lang.String $0="RAckermann.nrx";

 
 /**
  * @param m
  * @param n
  * @return
  */
 
 public static java.math.BigInteger ackermann(java.math.BigInteger m,java.math.BigInteger n){
  java.math.BigInteger ar=null;
  
  
  if (m.equals((java.lang.Object)java.math.BigInteger.ZERO)) 
   {
    ar=n.add(java.math.BigInteger.ONE);
   }
  else 
   if (n.equals((java.lang.Object)java.math.BigInteger.ZERO)) 
    {
     ar=ackermann(m.subtract(java.math.BigInteger.ONE),java.math.BigInteger.ONE);
    }
   else 
    {
     ar=ackermann(m.subtract(java.math.BigInteger.ONE),ackermann(m,n.subtract(java.math.BigInteger.ONE)));
    }
  
  return ar;
  }

 /**
  * @param args
  */
 
 public static void main(java.lang.String args[]){
  int j=0;
  int k=0;
  netrexx.lang.Rexx ack=null;
  
  {j=0;j:for(;j<=4;j++){
   netrexx.lang.RexxIO.Say("");
   {k=0;k:for(;k<=10;k++){
    ack=new netrexx.lang.Rexx(ackermann(new java.math.BigInteger(java.lang.String.valueOf(j)),new java.math.BigInteger(java.lang.String.valueOf(k))).toString());
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("ackermann("+j+","+k+") =").OpCcblank(null,ack.right(new netrexx.lang.Rexx((byte)5))));
    }
   }/*k*/
   }
  }/*j*/
  
  return;
  }
 
 private RAckermann(){return;}
 }
