/* Generated from 'RHelloWorld_Stderr.nrx' 7 Jul 2011 14:10:56 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * A common practice in computing is to send error messages to a different output stream than normal
 * text console messages. The normal messages print to what is called "standard output" or "standard out".
 * The error messages print to "standard error". This separation can be used to redirect error messages to
 * a different place than normal messages.
 * <p>
 * Show how to print a message to standard error by printing "Goodbye, World!" on that stream.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hello_world/Standard_error">rosettacode.org/wiki/Hello_world/Standard_error</a>
 */



public class RHelloWorld_Stderr{
 private static final java.lang.String $0="RHelloWorld_Stderr.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.System.err.println("Goodbye, World!");
  return;}
 
 private RHelloWorld_Stderr(){return;}
 }
