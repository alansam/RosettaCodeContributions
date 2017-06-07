/* Generated from 'RAssocArray_Create.nrx' 3 Jul 2011 02:09:30 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * In this task, the goal is to create an <a href="http://rosettacode.org/wiki/Associative_array">associative array</a>
 * (also known as a dictionary, map, or hash).
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Associative_arrays/Creation">rosettacode.org/wiki/Associative_arrays/Creation</a>
 */


public class RAssocArray_Create{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("\" />");
 private static final java.lang.String $0="RAssocArray_Create.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx key0;
  netrexx.lang.Rexx key1;
  netrexx.lang.Rexx hash;
  key0=new netrexx.lang.Rexx('0');
  key1=netrexx.lang.Rexx.toRexx("key0");
  
  hash=new netrexx.lang.Rexx('.'); // Initialize the associative array 'hash' to '.'
  hash.getnode(key1).leaf=netrexx.lang.Rexx.toRexx("value0"); // Set a specific key/value pair
  
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("<hash key=\"").OpCc(null,key0)).OpCc(null,netrexx.lang.Rexx.toRexx("\" value=\""))).OpCc(null,hash.getnode(key0).leaf)).OpCc(null,$01)); // Display a value for a key that wasn't set
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("<hash key=\"").OpCc(null,key1)).OpCc(null,netrexx.lang.Rexx.toRexx("\" value=\""))).OpCc(null,hash.getnode(key1).leaf)).OpCc(null,$01)); // Display a value for a key that was set
  return;}
 
 private RAssocArray_Create(){return;}
 }
