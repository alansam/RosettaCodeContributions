/* Generated from 'RRemoveDuplicateElements01.nrx' 28 Nov 2012 21:17:20 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// Note: Task requirement is to process "arrays".  The following converts an array into a simple list of words:
//       Putting the resulting list back into arrays is left as an exercise for the reader.

public class RRemoveDuplicateElements01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("100.2");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(11);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RRemoveDuplicateElements01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a1[];
  netrexx.lang.Rexx a2[];
  netrexx.lang.Rexx a3[];
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx lists;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx nodups_list=null;
  a1=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)11),new netrexx.lang.Rexx((byte)13),new netrexx.lang.Rexx((byte)17),new netrexx.lang.Rexx((byte)19),netrexx.lang.Rexx.toRexx("cats"),new netrexx.lang.Rexx((short)222),$01.OpMinus(null),$02.OpPlus(null),new netrexx.lang.Rexx("1.1"),$03.OpPlus(null),netrexx.lang.Rexx.toRexx("7."),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx("4.4"),new netrexx.lang.Rexx((byte)2)};
  a2=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx('a'),new netrexx.lang.Rexx('b'),new netrexx.lang.Rexx('c'),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx('b'),new netrexx.lang.Rexx('c'),new netrexx.lang.Rexx('d')};
  a3=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Now"),netrexx.lang.Rexx.toRexx("is"),netrexx.lang.Rexx.toRexx("the"),netrexx.lang.Rexx.toRexx("time"),netrexx.lang.Rexx.toRexx("for"),netrexx.lang.Rexx.toRexx("all"),netrexx.lang.Rexx.toRexx("good"),netrexx.lang.Rexx.toRexx("men"),netrexx.lang.Rexx.toRexx("to"),netrexx.lang.Rexx.toRexx("come"),netrexx.lang.Rexx.toRexx("to"),netrexx.lang.Rexx.toRexx("the"),netrexx.lang.Rexx.toRexx("aid"),netrexx.lang.Rexx.toRexx("of"),netrexx.lang.Rexx.toRexx("the"),netrexx.lang.Rexx.toRexx("party.")};
  x=new netrexx.lang.Rexx((byte)0);
  lists=netrexx.lang.Rexx.toRexx("");
  x=x.OpAdd(null,$04);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  lists.getnode(x).leaf=array2wordlist(a1);
  x=x.OpAdd(null,$04);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  lists.getnode(x).leaf=array2wordlist(a2);
  x=x.OpAdd(null,$04);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  lists.getnode(x).leaf=array2wordlist(a3);
  
  {netrexx.lang.Rexx $1=lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$1);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   nodups_list=remove_dups(lists.getnode(ix).leaf);
   netrexx.lang.RexxIO.Say(((ix.right(new netrexx.lang.Rexx((byte)4))).OpCc(null,$05)).OpCcblank(null,lists.getnode(ix).leaf));
   netrexx.lang.RexxIO.Say(($06.right(new netrexx.lang.Rexx((byte)4)).OpCc(null,$05)).OpCcblank(null,nodups_list));
   netrexx.lang.RexxIO.Say("");
   }
  }/*ix*/
  
  return;
  }

 // =============================================================================
 
 public static netrexx.lang.Rexx remove_dups(netrexx.lang.Rexx list){
  netrexx.lang.Rexx newlist;
  netrexx.lang.Rexx nodups;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx k_=null;
  
  newlist=netrexx.lang.Rexx.toRexx("");
  nodups=new netrexx.lang.Rexx('0');
  {netrexx.lang.Rexx $2=list.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$2);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   ix=list.word(w_);
   nodups.getnode(ix).leaf=(nodups.getnode(ix).leaf).OpAdd(null,$04); // we can even collect a count of dups if we want
   }
  }/*w_*/
  {int $5=0;java.util.Vector $4=new java.util.Vector(100,0);synchronized(nodups){java.util.Enumeration $3=nodups.keys();for(;;){if(!$3.hasMoreElements())break;$4.addElement($3.nextElement());if(!nodups.testnode((netrexx.lang.Rexx)($4.elementAt($5)))){$4.removeElementAt($5);continue;}$5++;}}k_:for(;;){if(--$5<0)break;k_=(netrexx.lang.Rexx)$4.elementAt($5);
   newlist=newlist.OpCcblank(null,k_);
   }
  }/*k_*/
  
  return newlist.space();
  }

 // =============================================================================
 
 public static netrexx.lang.Rexx array2wordlist(netrexx.lang.Rexx ra[]){
  netrexx.lang.Rexx wordlist;
  netrexx.lang.Rexx r_=null;
  
  wordlist=netrexx.lang.Rexx.toRexx("");
  {int $8=0;netrexx.lang.Rexx[] $7=new netrexx.lang.Rexx[ra.length];synchronized(ra){for(;;){if($8==$7.length)break;$7[$8]=ra[ra.length-1-$8];$8++;}}r_:for(;;){if(--$8<0)break;r_=(netrexx.lang.Rexx)$7[$8];
   wordlist=wordlist.OpCcblank(null,r_);
   }
  }/*r_*/
  
  return wordlist.space();
  }
 
 private RRemoveDuplicateElements01(){return;}
 }
