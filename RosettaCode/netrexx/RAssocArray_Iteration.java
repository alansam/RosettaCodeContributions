/* Generated from 'RAssocArray_Iteration.nrx' 8 Jul 2011 22:24:12 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Show how to iterate over the key-value pairs of an associative array, and print each pair out.
 * Also show how to iterate just over the keys, or the values, if there is a separate way to do that in your language.
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Associative_arrays/Iteration">rosettacode.org/wiki/Associative_arrays/Iteration</a>
 */


public class RAssocArray_Iteration{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RAssocArray_Iteration.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx surname;
  netrexx.lang.Rexx $try;
  netrexx.lang.Rexx fn=null;
  surname=netrexx.lang.Rexx.toRexx("Unknown"); // default value
  surname.getnode(netrexx.lang.Rexx.toRexx("Fred")).leaf=netrexx.lang.Rexx.toRexx("Bloggs");
  surname.getnode(netrexx.lang.Rexx.toRexx("Davy")).leaf=netrexx.lang.Rexx.toRexx("Jones");
  
  $try=netrexx.lang.Rexx.toRexx("Fred");
  netrexx.lang.RexxIO.Say((surname.getnode($try).leaf).OpCcblank(null,surname.getnode(netrexx.lang.Rexx.toRexx("Bert")).leaf));
  
  // extract the keys
  {int $3=0;java.util.Vector $2=new java.util.Vector(100,0);synchronized(surname){java.util.Enumeration $1=surname.keys();for(;;){if(!$1.hasMoreElements())break;$2.addElement($1.nextElement());if(!surname.testnode((netrexx.lang.Rexx)($2.elementAt($3)))){$2.removeElementAt($3);continue;}$3++;}}fn:for(;;){if(--$3<0)break;fn=(netrexx.lang.Rexx)$2.elementAt($3);
   netrexx.lang.RexxIO.Say(((fn.right(new netrexx.lang.Rexx((byte)10))).OpCcblank(null,$01)).OpCcblank(null,surname.getnode(fn).leaf));
   }
  }/*fn*/
  return;}
 
 private RAssocArray_Iteration(){return;}
 }
