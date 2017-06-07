/* Generated from 'RQueueUsage.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



// Queue Usage Demonstration Program -------------------------------------------

public class RQueueUsage{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('\000');
 private static final java.lang.String $0="RQueueUsage.nrx";
 
 public static final void main(java.lang.String args[]){
  RQueueImpl kew;
  java.lang.IndexOutOfBoundsException ex=null;
  netrexx.lang.Rexx melancholyDane;
  netrexx.lang.Rexx p_=null;
  netrexx.lang.Rexx popped=null;
  netrexx.lang.Rexx md;
  netrexx.lang.Rexx l_=null;
  kew=new RQueueImpl();
  {try{
   netrexx.lang.RexxIO.Say(kew.pop());
  }
  catch (java.lang.IndexOutOfBoundsException $1){ex=$1;
   netrexx.lang.RexxIO.Say(ex.getMessage());
   netrexx.lang.RexxIO.Say("");
  }}
  
  melancholyDane=netrexx.lang.Rexx.toRexx("");
  melancholyDane.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)4);
  melancholyDane.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("To be");
  melancholyDane.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("or");
  melancholyDane.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("not to be?");
  melancholyDane.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("That is the question.");
  
  {netrexx.lang.Rexx $2=$02.OpMinus(null);boolean $3=$2.OpGtEq(null,$03);p_=(melancholyDane.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpPlus(null);p_:for(;$3?p_.OpLtEq(null,$01):p_.OpGtEq(null,$01);p_=p_.OpAdd(null,$2)){
   kew.push(melancholyDane.getnode(p_).leaf);
   }
  }/*p_*/
  
  {for(;;){if(!new netrexx.lang.Rexx(kew.empty()).OpNot(null))break;
   popped=kew.pop();
   netrexx.lang.RexxIO.Say(popped.OpCcblank(null,$04));
   }
  }
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("");
  
  // demonstrate stowing something other than a text string in the queue
  kew.push(melancholyDane);
  md=kew.pop();
  {netrexx.lang.Rexx $4=md.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$4);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((md.getnode(l_).leaf).OpCcblank(null,$04));
   }
  }/*l_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RQueueUsage(){return;}
 }

 // Queue implementation --------------------------------------------------------

class RQueueImpl{
 private static final java.lang.String $0="RQueueUsage.nrx";
 /* properties private */
 private java.util.Deque qqq;

 
 
 public RQueueImpl(){super();
  qqq=(java.util.Deque)(new java.util.ArrayDeque());
  return;
  }

 
 public void push(netrexx.lang.Rexx stuff){
  qqq.push((java.lang.Object)stuff);
  return;
  }

 
 public netrexx.lang.Rexx pop() throws java.lang.IndexOutOfBoundsException{
  if (qqq.isEmpty()) 
   throw new java.lang.IndexOutOfBoundsException("The queue is empty");
  return (netrexx.lang.Rexx)(qqq.pop());
  }

 
 public boolean empty(){
  return qqq.isEmpty();
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 }
