/* Generated from 'RDateFormat.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Display the current date in the formats of "2007-11-10" and "Sunday, November 10, 2007".
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Date_format">rosettacode.org/wiki/Date_format</a>
 */




public class RDateFormat{
 private static final java.lang.String $0="RDateFormat.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new java.text.SimpleDateFormat("yyyy-MM-dd")).format(new java.util.Date()));
  netrexx.lang.RexxIO.Say((new java.text.SimpleDateFormat("EEEE, MMMM dd, yyyy")).format(new java.util.Date()));
  return;}
 
 private RDateFormat(){return;}
 }
