/* Generated from 'RArray.nrx' 15 Jul 2011 12:10:41 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * This task is about arrays. For hashes or associative arrays, please see
 * <a href="http://rosettacode.org/wiki/Creating_an_Associative_Array">Creating an Associative Array</a>.
 * <p>
 * In this task, the goal is to show basic array syntax in your language. Basically, create an array,
 * assign a value to it, and retrieve an element. (if available, show both fixed-length arrays and
 * dynamic arrays, pushing a value into it.)
 * </p>
 * <p>
 * Please discuss at Village Pump: <a href="http://rosettacode.org/wiki/Rosetta_Code:Village_Pump/Arrays">Arrays</a>.
 * Please merge code in from obsolete tasks <a href="http://rosettacode.org/wiki/Creating_an_Array">Creating an Array</a>,
 * <a href="http://rosettacode.org/wiki/Assigning_Values_to_an_Array">Assigning Values to an Array</a>,
 * and <a href="http://rosettacode.org/wiki/Retrieving_an_Element_of_an_Array">Retrieving an Element of an Array</a>.
 * </p>
 * <h4>See also</h4>
 * <ul>
 * <li><a href="http://rosettacode.org/wiki/Collections">Collections</a></li>
 * <li><a href="http://rosettacode.org/wiki/Two-dimensional_array_(runtime)">Two-dimensional array (runtime)</a></li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Arrays">rosettacode.org/wiki/Arrays</a>
 */


public class RArray{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RArray.nrx";
 
 public static void main(java.lang.String $0s[]){
  int array[];
  netrexx.lang.Rexx words[];
  java.util.ArrayList splk;
  netrexx.lang.Rexx cymru;
  netrexx.lang.Rexx x_=null;
  array=new int[10];
  array[0]=42;
  
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(array[0]).OpCcblank(null,new netrexx.lang.Rexx(array[3])));
  netrexx.lang.RexxIO.Say("");
  
  words=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Ogof"),netrexx.lang.Rexx.toRexx("Ffynnon"),netrexx.lang.Rexx.toRexx("Ddu")};
  
  netrexx.lang.RexxIO.Say((words[0].OpCcblank(null,words[1])).OpCcblank(null,words[2]));
  netrexx.lang.RexxIO.Say("");
  
  // Dynamic arrays can be simulated via the Java Collections package
  splk=new java.util.ArrayList();
  splk.add((java.lang.Object)words[0]);
  splk.add((java.lang.Object)words[1]);
  splk.add((java.lang.Object)words[2]);
  splk.add((java.lang.Object)"Draenen");
  
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(0))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(3)))));
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(0))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(1))))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(2)))));
  netrexx.lang.RexxIO.Say("");
  
  // or by using NetRexx "indexed strings" (associative arrays)
  cymru=netrexx.lang.Rexx.toRexx("");
  cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
  cymru.getnode(cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf).leaf=(new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(0))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(1))))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(2))));
  cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
  cymru.getnode(cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf).leaf=new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(0))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(splk.get(3))));
  
  {netrexx.lang.Rexx $1=cymru.getnode(new netrexx.lang.Rexx((byte)0)).leaf;x_=new netrexx.lang.Rexx((byte)1);x_:for(;x_.OpLtEq(null,$1);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((x_.OpCc(null,$03)).OpCcblank(null,cymru.getnode(x_).leaf));
   }
  }/*x_*/
  return;}
 
 private RArray(){return;}
 }
