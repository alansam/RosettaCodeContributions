/* Generated from 'RHappyNumbers.nrx' 7 Jul 2011 14:10:56 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/*NetRexx program to display the 1st 8 (or specified arg) happy numbers*/

/* binary */

/**
 * From Wikipedia, the free encyclopedia:
 * <p style="margin-left: 5.0em">
 * A <a href="http://en.wikipedia.org/wiki/Happy_number">happy number</a> is defined by the following process.
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat
 * the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not
 * include 1. Those numbers for which this process ends in 1 are happy numbers, while those that do not end
 * in 1 are unhappy numbers.
 * </p>
 * <p>
 * Task: Find and print the first 8 happy numbers.
 * </p>
 *
 * @author <a href="http://rosettacode.org/wiki/User:Rvjansen">Rvjansen</a>
 * @version 1.0
 */


public class RHappyNumbers{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RHappyNumbers.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx limit;
  netrexx.lang.Rexx haps;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx q=null;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx sum=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  limit=arg.getnode(new netrexx.lang.Rexx((byte)0)).leaf;/*get argument for  LIMIT.        */
  netrexx.lang.RexxIO.Say(limit);
  if ((limit==null)||limit.OpEq(null,$01)) 
   limit=new netrexx.lang.Rexx((byte)8);/*if not specified, set LIMIT to 8*/
  haps=new netrexx.lang.Rexx((byte)0);/*count of happy numbers so far.  */
  
  {n=new netrexx.lang.Rexx((byte)1);n:for(;;n=n.OpAdd(null,new netrexx.lang.Rexx(1))){if(!haps.OpLt(null,limit))break;/*search integers starting at one.*/
   q=n;/*Q may or may not be "happy".    */
   a=new netrexx.lang.Rexx((byte)0);
   
   {for(;;){/*see if  Q  is a happy number.   */
    if (q.OpEqS(null,$02)) 
     {/*if  Q  is unity, then it's happy*/
      haps=haps.OpAdd(null,$02);/*bump the count of happy numbers.*/
      netrexx.lang.RexxIO.Say(n);/*display the number.             */
      continue n;/*and then keep looking for more. */
     }
    
    sum=new netrexx.lang.Rexx((byte)0);/*initialize sum to zero.         */
    
    {int $1=(q.length()).OpPlus(null).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$1>0;$1--,j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/*add the squares of the numerals.*/
     sum=sum.OpAdd(null,(q.substr(j,new netrexx.lang.Rexx((byte)1))).OpPow(null,$03));
     }
    }/*j*/
    
    if ((a.getnode(sum).leaf).toboolean()) 
     continue n;/*if already summed, Q is unhappy.*/
    a.getnode(sum).leaf=new netrexx.lang.Rexx((byte)1);/*mark the sum as being found.    */
    q=sum;/*now, lets try the  Q  sum.      */
    }
   }
   }
  }/*n*/
  return;}
 
 private RHappyNumbers(){return;}
 }
