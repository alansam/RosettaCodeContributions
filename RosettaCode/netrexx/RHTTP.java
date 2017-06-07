/* Generated from 'RHTTP.nrx' 7 Jul 2011 14:10:56 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */






/**
 * Print a URL's content (source code) to the console. There is a separate task for
 * <a href="http://rosettacode.org/wiki/HTTPS_Request">HTTPS Requests</a>.
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/HTTP">rosettacode.org/wiki/HTTP</a>
 */


public class RHTTP{
 private static final java.lang.String $0="RHTTP.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String rosettaUrl=null;
  java.util.Scanner sc=null;
  java.lang.Exception ex=null;
  {try{
   rosettaUrl="http://www.rosettacode.org";
   
   sc=new java.util.Scanner((new java.net.URL(rosettaUrl)).openStream());
   {for(;;){if(!(sc.hasNext()))break;
    netrexx.lang.RexxIO.Say(sc.nextLine());
    }
   }
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 private RHTTP(){return;}
 }
