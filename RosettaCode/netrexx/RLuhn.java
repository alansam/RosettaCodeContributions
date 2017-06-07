/* Generated from 'RLuhn.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * The Luhn test is used by some credit card companies to distinguish valid credit card numbers from what
 * could be a random selection of digits.
 * <p>
 * Those companies using credit card numbers that can be validated by the Luhn test have numbers
 * that pass the following test:
 * <ol>
 * <li>Reverse the order of the digits in the number.</li>
 * <li>Take the first, third, ... and every other odd digit in the reversed digits and sum them to form the partial sum s1</li>
 * <li>Taking the second, fourth ... and every other even digit in the reversed digits:
 * <ol>
 * <li>Multiply each digit by two and sum the digits if the answer is greater than nine to form partial sums for the even digits</li>
 * <li>Sum the partial sums of the even digits to form s2</li>
 * </ol>
 * <li>If s1 + s2 ends in zero then the original number is in the form of a valid credit card number as verified by the Luhn test.</li>
 * </ol>
 * <p>
 * For example, if the trial number is 49927398716:
 * </p>
 * <pre>
 * Reverse the digits:
 *   61789372994
 * Sum the odd digits:
 *   6 + 7 + 9 + 7 + 9 + 4 = 42 = s1
 * The even digits:
 *     1,  8,  3,  2,  9
 *  Two times each even digit:
 *     2, 16,  6,  4, 18
 *  Sum the digits of each multiplication:
 *     2,  7,  6,  4,  9
 *  Sum the last:
 *     2 + 7 + 6 + 4 + 9 = 28 = s2
 *
 * s1 + s2 = 70 which ends in zero which means that 49927398716 passes the Luhn test
 * </pre>
 * <p>
 * The task is to write a function/method/procedure/subroutine that will validate a number with the Luhn test, and use
 * it to validate the following numbers:
 * </p>
 * <p style="padding-left: 50px;">
 * 49927398716
 * <br />
 * 49927398717
 * <br />
 * 1234567812345678
 * <br />
 * 1234567812345670
 * </p>
 * <p>
 * Cf. <a href="http://rosettacode.org/wiki/SEDOLs">SEDOL</a>
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Luhn_test_of_credit_card_numbers">rosettacode.org/wiki/Luhn_test_of_credit_card_numbers</a>
 */


public class RLuhn{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("passed");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("failed");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('0');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(9);
 private static final java.lang.String $0="RLuhn.nrx";

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx cc;
  int k_=0;
  netrexx.lang.Rexx r_=null;
  cc=new netrexx.lang.Rexx((byte)0);
  cc.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("49927398716");
  cc.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("49927398717");
  cc.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("1234567812345678");
  cc.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("1234567812345670");
  
  {k_=1;k_:for(;;k_++){if(!(cc.getnode(new netrexx.lang.Rexx(k_)).leaf).OpNotEq(null,$01))break;
   r_=checksum(cc.getnode(new netrexx.lang.Rexx(k_)).leaf);
   if (r_.OpEqS(null,$01)) 
    netrexx.lang.RexxIO.Say((cc.getnode(new netrexx.lang.Rexx(k_)).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$02));
   else 
    netrexx.lang.RexxIO.Say((cc.getnode(new netrexx.lang.Rexx(k_)).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$03));
   }
  }/*k_*/
  
  return;
  }

 // Luhn algorithm checksum for credit card numbers
 
 public static netrexx.lang.Rexx checksum(netrexx.lang.Rexx t_){
  int s_;
  int j_=0;
  netrexx.lang.Rexx q_=null;
  if ((t_.length()).OpRem(null,$04).toboolean()) 
   t_=$05.OpCc(null,t_); //pad # on left with 0
  t_=t_.reverse();
  s_=0;
  
  {int $1=(t_.length()).OpSub(null,$06).toint();int $2=2;j_=1;j_:for(;j_<=$1;j_=j_+$2){
   q_=$04.OpMult(null,t_.substr(new netrexx.lang.Rexx(j_+1),new netrexx.lang.Rexx((byte)1)));
   if (q_.OpGt(null,$07)) 
    q_=(q_.left(new netrexx.lang.Rexx((byte)1))).OpAdd(null,q_.right(new netrexx.lang.Rexx((byte)1)));
   s_=new netrexx.lang.Rexx(s_).OpAdd(null,t_.substr(new netrexx.lang.Rexx(j_),new netrexx.lang.Rexx((byte)1))).OpAdd(null,q_).toint();
   }
  }/*j_*/
  
  return new netrexx.lang.Rexx((s_%10)!=0);
  }
 
 private RLuhn(){return;}
 }
