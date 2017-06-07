/* Generated from 'RHostIntrospection.nrx' 13 Jul 2011 11:57:29 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Host introspection</h3>
 * <p>
 * Print the <a href="http://en.wikipedia.org/wiki/Word_size#Word_size_choice">word size</a>
 * and <a href="http://en.wikipedia.org/wiki/Endianness">endianness</a> of the host machine.
 * </p>
 * <p>
 * See also: <a href="http://rosettacode.org/wiki/Variable_size/Get">Variable size/Get</a>
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Host_introspection">rosettacode.org/wiki/Host_introspection</a>
 */


public class RHostIntrospection{
 private static final java.lang.String $0="RHostIntrospection.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String wordSize;
  java.lang.String endian;
  wordSize=java.lang.System.getProperty("sun.arch.data.model");
  endian=java.lang.System.getProperty("sun.cpu.endian");
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(" word size:").OpCcblank(null,netrexx.lang.Rexx.toRexx(wordSize)));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("endianness:").OpCcblank(null,netrexx.lang.Rexx.toRexx(endian)));
  return;}
 
 private RHostIntrospection(){return;}
 }
