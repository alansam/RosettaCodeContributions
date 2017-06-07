/* Generated from 'RCollections.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RCollections{
 private static final java.lang.String $0="RCollections.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx myVals[];
  java.util.Set mySet=null;
  netrexx.lang.Rexx val=null;
  myVals=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("zero"),netrexx.lang.Rexx.toRexx("one"),netrexx.lang.Rexx.toRexx("two"),netrexx.lang.Rexx.toRexx("three"),netrexx.lang.Rexx.toRexx("four"),netrexx.lang.Rexx.toRexx("five")};
  
  mySet=(java.util.Set)(new java.util.HashSet());
  
  {int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[myVals.length];synchronized(myVals){for(;;){if($3==$2.length)break;$2[$3]=myVals[myVals.length-1-$3];$3++;}}val:for(;;){if(--$3<0)break;val=(netrexx.lang.Rexx)$2[$3];
   mySet.add((java.lang.Object)val);
   }
  }/*val*/
  
  {int $6=0;java.lang.Object[] $5=new java.lang.Object[mySet.size()];synchronized(mySet){java.util.Iterator $4=mySet.iterator();for(;;){if($6==$5.length)break;$5[$6]=$4.next();$6++;}}val:for(;;){if(--$6<0)break;val=(netrexx.lang.Rexx)((java.lang.Object)$5[$6]);
   netrexx.lang.RexxIO.Say(val);
   }
  }/*val*/
  
  return;
  }
 
 private RCollections(){return;}
 }
