/* Generated from 'RHashFromTwoArrays01.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RHashFromTwoArrays01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RHashFromTwoArrays01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx vals[];
  netrexx.lang.Rexx keys[];
  netrexx.lang.Rexx hash1=null;
  java.util.Map hash2=null;
  vals=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("zero"),netrexx.lang.Rexx.toRexx("one"),netrexx.lang.Rexx.toRexx("two"),netrexx.lang.Rexx.toRexx("three"),netrexx.lang.Rexx.toRexx("four"),netrexx.lang.Rexx.toRexx("five")};
  keys=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("k0"),netrexx.lang.Rexx.toRexx("k1"),netrexx.lang.Rexx.toRexx("k2"),netrexx.lang.Rexx.toRexx("k3"),netrexx.lang.Rexx.toRexx("k4"),netrexx.lang.Rexx.toRexx("k5")};
  
  
  
  hash1=netrexx.lang.Rexx.toRexx("");
  hash2=(java.util.Map)(new java.util.HashMap());
  makeHash(hash1,keys,vals);
  makeHash(hash2,keys,vals);
  
  return;
  }

 // Using the default Rexx object as a hash (associative array)
 
 public static void makeHash(netrexx.lang.Rexx hash,netrexx.lang.Rexx keys[],netrexx.lang.Rexx vals[]){
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx key=null;
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(keys.length).OpSub(null,$01);k_=new netrexx.lang.Rexx((byte)0);k_:for(;k_.OpLtEq(null,$1);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   hash.getnode(keys[k_.toint()]).leaf=vals[k_.toint()];
   }
  }/*k_*/
  
  {int $4=0;java.util.Vector $3=new java.util.Vector(100,0);synchronized(hash){java.util.Enumeration $2=hash.keys();for(;;){if(!$2.hasMoreElements())break;$3.addElement($2.nextElement());if(!hash.testnode((netrexx.lang.Rexx)($3.elementAt($4)))){$3.removeElementAt($4);continue;}$4++;}}key:for(;;){if(--$4<0)break;key=(netrexx.lang.Rexx)$3.elementAt($4);
   netrexx.lang.RexxIO.Say(((key.right(new netrexx.lang.Rexx((byte)8))).OpCc(null,$02)).OpCcblank(null,hash.getnode(key).leaf));
   }
  }/*key*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 // Using a Java collection object
 
 public static void makeHash(java.util.Map hash,netrexx.lang.Rexx keys[],netrexx.lang.Rexx vals[]){
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx key=null;
  {netrexx.lang.Rexx $5=new netrexx.lang.Rexx(keys.length).OpSub(null,$01);k_=new netrexx.lang.Rexx((byte)0);k_:for(;k_.OpLtEq(null,$5);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   hash.put((java.lang.Object)(keys[k_.toint()]),(java.lang.Object)(vals[k_.toint()]));
   }
  }/*k_*/
  
  
  {java.util.Set $9=hash.keySet();int $8=0;java.lang.Object[] $7=new java.lang.Object[$9.size()];synchronized($9){java.util.Iterator $6=$9.iterator();for(;;){if($8==$7.length)break;$7[$8]=$6.next();$8++;}}key:for(;;){if(--$8<0)break;key=(netrexx.lang.Rexx)((java.lang.Object)$7[$8]);
   netrexx.lang.RexxIO.Say(((key.right(new netrexx.lang.Rexx((byte)8))).OpCc(null,$02)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(hash.get((java.lang.Object)key)))));
   }
  }/*key*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RHashFromTwoArrays01(){return;}
 }
