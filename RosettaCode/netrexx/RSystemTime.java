/* Generated from 'RSystemTime.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Output the system time (any units will do as long as they are noted) either by a system command or one
 * built into the language. The system time can be used for debugging, network information, random number
 * seeds, or something as simple as program performance.
 * <h5>See also</h5>
 * <ul>
 * <li><a href="http://rosettacode.org/wiki/Date_format">Date format</a></li>
 * <li><a href="http://en.wikipedia.org/wiki/Time_(computing)#Retrieving_system_time">Retrieving system time (wiki)</a></li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/System_time">rosettacode.org/wiki/System_time</a>
 */




public class RSystemTime{
 private static final java.lang.String $0="RSystemTime.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new java.text.SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS")).format(new java.util.Date()));
  return;}
 
 private RSystemTime(){return;}
 }
