/* Generated from 'RHostName.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * Find the name of the host on which the routine is running.
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hostname">rosettacode.org/wiki/Hostname</a>
 */


public class RHostName{
 private static final java.lang.String $0="RHostName.nrx";
 
 public static void main(java.lang.String $0s[]) throws java.net.UnknownHostException{
  netrexx.lang.RexxIO.Say(java.net.InetAddress.getLocalHost().getHostName());
  return;}
 
 private RHostName(){return;}
 }
