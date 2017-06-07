/* Generated from 'RPermutationGenerator.nrx' 24 Apr 2013 22:19:19 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// =============================================================================

public class RPermutationGenerator{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(',');
 private static final char[] $05={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RPermutationGenerator.nrx";
 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /* properties private */
 private int array[];
 private boolean isTrue=(1==1);
 private boolean isFalse=($01.OpNotEq(null,$01));
 private boolean firstReady=isFalse;

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RPermutationGenerator(){
  this(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1));return;
  }
 public RPermutationGenerator(netrexx.lang.Rexx n_){
  this(n_,new netrexx.lang.Rexx((byte)1));return;
  }
 public RPermutationGenerator(netrexx.lang.Rexx n_,netrexx.lang.Rexx firstNum_){super();
  if (n_.OpLt(null,$02)) 
   n_=new netrexx.lang.Rexx((byte)3);
  if (firstNum_.OpLt(null,$02)) 
   firstNum_=new netrexx.lang.Rexx((byte)1);
  array=new int[n_.toint()];
  reset(firstNum_);
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RPermutationGenerator(int ary[]){super();
  array=ary;
  firstReady=isFalse;
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private void reset(netrexx.lang.Rexx firstNum){
  netrexx.lang.Rexx i_=null;
  {i_=new netrexx.lang.Rexx((byte)0);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,new netrexx.lang.Rexx(array.length)))break;
   array[i_.toint()]=i_.OpAdd(null,firstNum).toint();
   }
  }/*i_*/
  firstReady=isFalse;
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public boolean hasNext(){
  boolean end_;
  netrexx.lang.Rexx i_=null;
  end_=firstReady;
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,new netrexx.lang.Rexx(array.length)))break;
   end_=end_&((new netrexx.lang.Rexx(array[i_.toint()]).OpLt(null,new netrexx.lang.Rexx(array[i_.OpSub(null,$01).toint()]))));
   }
  }/*i_*/
  return new netrexx.lang.Rexx(end_).OpNot(null);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public int[] next(){
  netrexx.lang.Rexx j_=null;
  netrexx.lang.Rexx k_=null;
  int temp=0;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx s_=null;
  if (new netrexx.lang.Rexx(firstReady).OpNot(null)) 
   {
    firstReady=isTrue;
   }
  else 
   {
    j_=new netrexx.lang.Rexx(array.length).OpSub(null,$03);
    k_=new netrexx.lang.Rexx(array.length).OpSub(null,$01);
    
    // Find largest index j_ with a[j_] < a[j_+1]
    {for(;;){if(!new netrexx.lang.Rexx(array[j_.toint()]).OpGt(null,new netrexx.lang.Rexx(array[j_.OpAdd(null,$01).toint()])))break;
     j_=j_.OpSub(null,$01);
     }
    }
    
    // Find index k_ such that a[k_] is smallest integer greater than a[j_] to the right of a[j_]
    {for(;;){if(!new netrexx.lang.Rexx(array[j_.toint()]).OpGt(null,new netrexx.lang.Rexx(array[k_.toint()])))break;
     k_=k_.OpSub(null,$01);
     }
    }
    
    // Interchange a[j] and a[k]
    temp=array[k_.toint()];
    array[k_.toint()]=array[j_.toint()];
    array[j_.toint()]=temp;
    
    // Put tail end of permutation after jth position in increasing order
    r_=new netrexx.lang.Rexx(array.length).OpSub(null,$01);
    s_=j_.OpAdd(null,$01);
    
    {for(;;){if(!r_.OpGt(null,s_))break;
     temp=array[s_.toint()];
     array[s_.toint()]=array[r_.toint()];
     s_=s_.OpAdd(null,$01);
     array[r_.toint()]=temp;
     r_=r_.OpSub(null,$01);
     }
    }
   }
  return array;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void display(){
  int row[]=null;
  netrexx.lang.Rexx display=null;
  netrexx.lang.Rexx i_=null;
  {for(;;){if(!(hasNext()))break;
   row=next();
   display=netrexx.lang.Rexx.toRexx("");
   {i_=new netrexx.lang.Rexx((byte)0);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,new netrexx.lang.Rexx(row.length)))break;
    display=(display.OpCc(null,$04)).OpCc(null,new netrexx.lang.Rexx(row[i_.toint()]));
    }
   }/*i_*/
   netrexx.lang.RexxIO.Say(display.strip(new netrexx.lang.Rexx('l'),new netrexx.lang.Rexx(',')));
   }
  }
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx rows=null;
  netrexx.lang.Rexx num1=null;
  RPermutationGenerator pg;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$05,$1);
  rows=$1[0];num1=$1[1];}
  if (rows.OpEq(null,$06)) 
   rows=new netrexx.lang.Rexx((byte)3);
  if (num1.OpEq(null,$06)) 
   num1=new netrexx.lang.Rexx((byte)1);
  pg=new RPermutationGenerator(rows,num1);
  pg.display();
  pg=new RPermutationGenerator(new int[]{new netrexx.lang.Rexx(3).toint(),2,1});
  pg.display();
  return;
  }
 }
