/* Generated from 'RPermutationIterator.nrx' 24 Apr 2013 23:35:41 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





// =============================================================================
/**
 * Permutation Iterator
 * <br />
 * <br />
 * Algorithm by E. W. Dijkstra, "A Discipline of Programming", Prentice-Hall, 1976, p.71
 */

public class RPermutationIterator implements java.util.Iterator{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("! =");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RPermutationIterator.nrx";
 
 // ---------------------------------------------------------------------------
 /* properties indirect */
 private java.util.List perms;
 private int permOrders[];
 private netrexx.lang.Rexx maxN;
 private netrexx.lang.Rexx currentN;
 private boolean first;
 
 // ---------------------------------------------------------------------------
 /* properties constant */
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=($01.OpNotEq(null,$01));

 
 // ---------------------------------------------------------------------------
 
 public RPermutationIterator(java.util.List initial){super();
  setUp(initial);
  return;
  }

 // ---------------------------------------------------------------------------
 
 public RPermutationIterator(java.lang.Object initial[]){super();
  java.util.ArrayList init;
  java.lang.Object elmt=null;
  init=new java.util.ArrayList(initial.length);
  {int $3=0;java.lang.Object[] $2=new java.lang.Object[initial.length];synchronized(initial){for(;;){if($3==$2.length)break;$2[$3]=initial[initial.length-1-$3];$3++;}}elmt:for(;;){if(--$3<0)break;elmt=(java.lang.Object)$2[$3];
   init.add(elmt);
   }
  }/*elmt*/
  setUp((java.util.List)init);
  return;
  }

 // ---------------------------------------------------------------------------
 
 public RPermutationIterator(netrexx.lang.Rexx initial[]){super();
  java.util.ArrayList init;
  netrexx.lang.Rexx elmt=null;
  init=new java.util.ArrayList(initial.length);
  {int $6=0;netrexx.lang.Rexx[] $5=new netrexx.lang.Rexx[initial.length];synchronized(initial){for(;;){if($6==$5.length)break;$5[$6]=initial[initial.length-1-$6];$6++;}}elmt:for(;;){if(--$6<0)break;elmt=(netrexx.lang.Rexx)$5[$6];
   init.add((java.lang.Object)elmt);
   }
  }/*elmt*/
  setUp((java.util.List)init);
  return;
  }

 // ---------------------------------------------------------------------------
 
 private void setUp(java.util.List initial){
  int po[];
  netrexx.lang.Rexx i_=null;
  setFirst(isTrue);
  setPerms(initial);
  setPermOrders(new int[getPerms().size()]);
  setMaxN(new netrexx.lang.Rexx(getPermOrders().length));
  setCurrentN(new netrexx.lang.Rexx((byte)0));
  po=getPermOrders();
  {i_=new netrexx.lang.Rexx((byte)0);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,new netrexx.lang.Rexx(po.length)))break;
   po[i_.toint()]=i_.toint();
   }
  }/*i_*/
  return;
  }

 // ---------------------------------------------------------------------------
 
 public boolean hasNext(){
  boolean status;
  status=isTrue;
  if ((getCurrentN()).OpEqS(null,factorial(getMaxN()))) 
   status=isFalse;
  setCurrentN((getCurrentN()).OpAdd(null,$01));
  return status;
  }

 // ---------------------------------------------------------------------------
 
 public java.lang.Object next(){
  int po[]=null;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx j_=null;
  if (isFirst()) 
   setFirst(isFalse);
  else 
   {
    po=getPermOrders();
    i_=(getMaxN()).OpSub(null,$01);
    {for(;;){if(!new netrexx.lang.Rexx(po[i_.OpSub(null,$01).toint()]).OpGtEq(null,new netrexx.lang.Rexx(po[i_.toint()])))break;
     i_=i_.OpSub(null,$01);
     }
    }
    
    j_=getMaxN();
    {for(;;){if(!new netrexx.lang.Rexx(po[j_.OpSub(null,$01).toint()]).OpLtEq(null,new netrexx.lang.Rexx(po[i_.OpSub(null,$01).toint()])))break;
     j_=j_.OpSub(null,$01);
     }
    }
    
    swap(i_.OpSub(null,$01),j_.OpSub(null,$01));
    
    i_=i_.OpAdd(null,$01);
    j_=getMaxN();
    {for(;;){if(!i_.OpLt(null,j_))break;
     swap(i_.OpSub(null,$01),j_.OpSub(null,$01));
     i_=i_.OpAdd(null,$01);
     j_=j_.OpSub(null,$01);
     }
    }
   }
  return (java.lang.Object)(reorder());
  }

 // ---------------------------------------------------------------------------
 
 public void remove() throws java.lang.UnsupportedOperationException{
  throw new java.lang.UnsupportedOperationException();
  }

 // ---------------------------------------------------------------------------
 
 private void swap(netrexx.lang.Rexx i_,netrexx.lang.Rexx j_){
  int po[];
  int save;
  po=getPermOrders();
  save=po[i_.toint()];
  po[i_.toint()]=po[j_.toint()];
  po[j_.toint()]=save;
  return;
  }

 // ---------------------------------------------------------------------------
 
 private java.util.List reorder(){
  java.util.ArrayList result;
  int ix=0;
  result=new java.util.ArrayList(getPerms().size());
  {int[] $10=getPermOrders();int $9=0;int[] $8=new int[$10.length];synchronized($10){for(;;){if($9==$8.length)break;$8[$9]=$10[$10.length-1-$9];$9++;}}ix:for(;;){if(--$9<0)break;ix=(int)$8[$9];
   result.add(getPerms().get(ix));
   }
  }/*ix*/
  return (java.util.List)result;
  }

 // ---------------------------------------------------------------------------
 /**
  * Calculate n factorial: {@code n! = 1 * 2 * 3 .. * n}
  * @param n
  * @return n!
  */
 
 public static netrexx.lang.Rexx factorial(netrexx.lang.Rexx n){
  netrexx.lang.Rexx fact;
  netrexx.lang.Rexx i=null;
  fact=new netrexx.lang.Rexx((byte)1);
  if (n.OpGt(null,$01)) 
   {i=new netrexx.lang.Rexx((byte)1);i:for(;;i=i.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i.OpLtEq(null,n))break;
    fact=fact.OpMult(null,i);
    }
   }/*i*/
  return fact;
  }

 // ---------------------------------------------------------------------------
 
 public static void main(java.lang.String args[]){
  RPermutationIterator thing02;
  RPermutationIterator thing03;
  RPermutationIterator thing04;
  RPermutationIterator things[];
  RPermutationIterator thing=null;
  netrexx.lang.Rexx N=null;
  netrexx.lang.Rexx lineCount=null;
  java.lang.Object prm=null;
  thing02=new RPermutationIterator(new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("alpha"),netrexx.lang.Rexx.toRexx("omega")});
  thing03=new RPermutationIterator((java.lang.Object[])(new java.lang.String[]{"one","two","three"}));
  thing04=new RPermutationIterator(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(3),new java.lang.Integer(4)})));
  things=new RPermutationIterator[]{thing02,thing03,thing04};
  {int $13=0;RPermutationIterator[] $12=new RPermutationIterator[things.length];synchronized(things){for(;;){if($13==$12.length)break;$12[$13]=things[things.length-1-$13];$13++;}}thing:for(;;){if(--$13<0)break;thing=(RPermutationIterator)$12[$13];
   N=thing.getMaxN();
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Permutations:").OpCcblank(null,N)).OpCc(null,$02)).OpCcblank(null,factorial(N)));
   {lineCount=new netrexx.lang.Rexx((byte)1);lineCount:for(;;lineCount=lineCount.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(thing.hasNext()))break;
    prm=thing.next();
    netrexx.lang.RexxIO.Say(((lineCount.right(new netrexx.lang.Rexx((byte)8))).OpCc(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx(prm.toString())));
    }
   }/*lineCount*/
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Permutations:").OpCcblank(null,N)).OpCc(null,$02)).OpCcblank(null,factorial(N)));
   netrexx.lang.RexxIO.Say("");
   }
  }/*thing*/
  return;
  }
 
 public java.util.List getPerms(){return perms;}
 
 public void setPerms(java.util.List $14){perms=$14;return;}
 
 public int[] getPermOrders(){return permOrders;}
 
 public void setPermOrders(int[] $15){permOrders=$15;return;}
 
 public int getPermOrders(int $16){return permOrders[$16];}
 
 public void setPermOrders(int $17,int $18){permOrders[$17]=$18;return;}
 
 public netrexx.lang.Rexx getMaxN(){return maxN;}
 
 public void setMaxN(netrexx.lang.Rexx $19){maxN=$19;return;}
 
 public netrexx.lang.Rexx getCurrentN(){return currentN;}
 
 public void setCurrentN(netrexx.lang.Rexx $20){currentN=$20;return;}
 
 public boolean isFirst(){return first;}
 
 public void setFirst(boolean $21){first=$21;return;}
 }
