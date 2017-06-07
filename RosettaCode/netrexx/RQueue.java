/* Generated from 'RQueue.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>Queue/Definition</h3>
 * <p>
 * Implement a FIFO queue. Elements are added at one side and popped from the other in the order of insertion.
 * </p>
 * <p>
 * Operations:
 * <ul>
 * <li>push (aka enqueue) - add element</li>
 * <li>pop (aka dequeue) - pop first element</li>
 * <li>empty - return truth value when empty</li>
 * </ul>
 * <p>
 * Errors:
 * <ul>
 * <li>handle the error of trying to pop from an empty queue (behavior depends on the language and platform)</li>
 * </ul>
 * See <a href="http://rosettacode.org/wiki/FIFO_(usage)">FIFO (usage)</a> for the built-in FIFO or queue of your
 * language or standard library.
 * </p>
 * <h5>Example</h5>
 * <p>
 * The encoded string "http%3A%2F%2Ffoo%20bar%2F" should be reverted to the unencoded form "http://foo bar/".
 * </p>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Queue/Definition">rosettacode.org/wiki/Queue/Definition</a>
 */


public class RQueue{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final char[] $03={1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("There are");
 private static final java.lang.String $0="RQueue.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.util.ArrayDeque mqueue;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx q_=null;
  netrexx.lang.Rexx line=null;
  mqueue=new java.util.ArrayDeque();
  
  viewQueue((java.util.Deque)mqueue);
  
  a=netrexx.lang.Rexx.toRexx("Fred");
  mqueue.push((java.lang.Object)"");/* Puts an empty line onto the queue */
  mqueue.push((java.lang.Object)(a.OpCcblank(null,$01)));/* Puts "Fred 2" onto the queue */
  viewQueue((java.util.Deque)mqueue);
  
  a=netrexx.lang.Rexx.toRexx("Toft");
  mqueue.add((java.lang.Object)(a.OpCcblank(null,$01)));/* Enqueues "Toft 2" */
  mqueue.add((java.lang.Object)"");/* Enqueues an empty line behind the last */
  viewQueue((java.util.Deque)mqueue);
  
  {q_=new netrexx.lang.Rexx((byte)1);q_:for(;;q_=q_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!new netrexx.lang.Rexx(mqueue.size()).OpGt(null,$02))break;
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
   netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx(mqueue.pop().toString()),$03,$1);
   line=$1[0];}
   netrexx.lang.RexxIO.Say(((q_.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$04)).OpCcblank(null,line));
   }
  }/*q_*/
  viewQueue((java.util.Deque)mqueue);
  
  return;
  }

 
 private static void viewQueue(java.util.Deque mqueue){
  
  if (new netrexx.lang.Rexx(mqueue.size()).OpEq(null,$02)) 
   {
    netrexx.lang.RexxIO.Say("Queue is empty");
   }
  else 
   {
    netrexx.lang.RexxIO.Say(($05.OpCcblank(null,new netrexx.lang.Rexx(mqueue.size()))).OpCcblank(null,netrexx.lang.Rexx.toRexx("elements in the queue")));
   }
  
  return;
  }
 
 private RQueue(){return;}
 }
