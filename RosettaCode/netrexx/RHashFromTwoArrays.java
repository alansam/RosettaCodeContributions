/* Generated from 'RHashFromTwoArrays.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/**
 * <h3>Hash from two arrays</h3>
 * <p>
 * Using two Arrays of equal length, create a Hash object where the elements from one array (the keys) are linked to the elements of the other (the values)
 * </p>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hash_from_two_arrays">rosettacode.org/wiki/Hash_from_two_arrays</a>
 */


public class RHashFromTwoArrays{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("hash[");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RHashFromTwoArrays.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx keysArray[];
  netrexx.lang.Rexx valsArray[];
  keysArray=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("one"),netrexx.lang.Rexx.toRexx("two"),netrexx.lang.Rexx.toRexx("three")};
  valsArray=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3)};
  
  hashBuiltin(keysArray,valsArray);
  hashExternal(keysArray,valsArray);
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void hashBuiltin(netrexx.lang.Rexx keys[],netrexx.lang.Rexx vals[]){
  netrexx.lang.Rexx hash;
  netrexx.lang.Rexx x_=null;
  netrexx.lang.Rexx key=null;
  netrexx.lang.Rexx val=null;
  
  hash=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(keys.length).OpSub(null,$01);x_=new netrexx.lang.Rexx((byte)0);x_:for(;x_.OpLtEq(null,$1);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   key=keys[x_.toint()];
   val=vals[x_.toint()];
   hash.getnode(key).leaf=val;
   }
  }/*x_*/
  
  
  {int $4=0;java.util.Vector $3=new java.util.Vector(100,0);synchronized(hash){java.util.Enumeration $2=hash.keys();for(;;){if(!$2.hasMoreElements())break;$3.addElement($2.nextElement());if(!hash.testnode((netrexx.lang.Rexx)($3.elementAt($4)))){$3.removeElementAt($4);continue;}$4++;}}x_:for(;;){if(--$4<0)break;x_=(netrexx.lang.Rexx)$3.elementAt($4);
   netrexx.lang.RexxIO.Say((((($02.OpCc(null,x_)).OpCc(null,$03)).right(new netrexx.lang.Rexx((byte)20))).OpCc(null,$04)).OpCcblank(null,hash.getnode(x_).leaf));
   }
  }/*x_*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void hashExternal(netrexx.lang.Rexx keys[],netrexx.lang.Rexx vals[]){
  java.util.Map hash=null;
  netrexx.lang.Rexx x_=null;
  netrexx.lang.Rexx key=null;
  netrexx.lang.Rexx val=null;
  java.util.Iterator iter;
  java.lang.Object k_=null;
  java.lang.Object v_=null;
  
  
  hash=(java.util.Map)(new java.util.HashMap());
  {netrexx.lang.Rexx $5=new netrexx.lang.Rexx(keys.length).OpSub(null,$01);x_=new netrexx.lang.Rexx((byte)0);x_:for(;x_.OpLtEq(null,$5);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   key=keys[x_.toint()];
   val=vals[x_.toint()];
   hash.put((java.lang.Object)key,(java.lang.Object)val);
   }
  }/*x_*/
  netrexx.lang.RexxIO.Say("");
  
  iter=hash.keySet().iterator();
  {x_:for(;;){if(!(iter.hasNext()))break;
   k_=iter.next();
   v_=hash.get(k_);
   netrexx.lang.RexxIO.Say((((($02.OpCc(null,new netrexx.lang.Rexx(java.lang.String.valueOf(k_)))).OpCc(null,$03)).right(new netrexx.lang.Rexx((byte)20))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(v_))));
   }
  }/*x_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RHashFromTwoArrays(){return;}
 }
