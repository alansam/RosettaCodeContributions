/* Generated from 'RSeiveOfEratosthenesRexx.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/*REXX program, generate primes via sieve of Eratosthenes algorithm*/


public class RSeiveOfEratosthenesRexx{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1000);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("is");
 private static final java.lang.String $0="RSeiveOfEratosthenesRexx.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx highItem;
  netrexx.lang.Rexx widthH;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx np;
  netrexx.lang.Rexx q=null;
  highItem=new netrexx.lang.Rexx((short)200);/*define ten score of #'s.  */
  widthH=highItem.length();/*width of biggest element#.*/
  a=new netrexx.lang.Rexx((byte)1);/*assume all numbers prime. */
  a.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)0);/*special case for unity, by*/
  /*definition, 1 isn't prime.*/
  
  {netrexx.lang.Rexx $1=highItem;j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq(null,$1);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/*starting @ 2, strike mult.*/
   if (j.OpMult(null,j).OpGt(null,highItem)) 
    break j;/*process up to �(highItem).*/
   if ((a.getnode(j).leaf).OpNot(null)) 
    continue j;/*this number isn't prime,  */
   /*it was marked as not prime*/
   
   {netrexx.lang.Rexx $2=highItem;netrexx.lang.Rexx $3=j;boolean $4=$3.OpGtEq(null,$01);k=j.OpAdd(null,j).OpPlus(null);k:for(;$4?k.OpLtEq(null,$2):k.OpGtEq(null,$2);k=k.OpAdd(null,$3)){/*start with next multiple. */
    a.getnode(k).leaf=new netrexx.lang.Rexx((byte)0);/*mark J multiple not prime.*/
    }
   }/*k*//*k*/
   
   }
  }/*j*//*j*/
  
  np=new netrexx.lang.Rexx((byte)0);/*number of primes so far.  */
  
  {int $5=highItem.OpPlus(null).toint();q=new netrexx.lang.Rexx((byte)1);q:for(;$5>0;$5--,q=q.OpAdd(null,new netrexx.lang.Rexx(1))){/*list all the primes found.*/
   if ((a.getnode(q).leaf).toboolean()) 
    {
     np=np.OpAdd(null,$02);/*bump the prime count.     */
     if (np.OpGt(null,$03)) 
      continue q;/*only list up to 1k primes.*/
     netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("prime number").OpCcblank(null,np.right(widthH))).OpCcblank(null,$04)).OpCcblank(null,q.right(widthH)));
     if (np.OpEqS(null,$03)) 
      netrexx.lang.RexxIO.Say("Prime number listing truncated.");
    }
   }
  }/*q*//*q*/
  
  netrexx.lang.RexxIO.Say((np.OpCcblank(null,netrexx.lang.Rexx.toRexx("prime numbers found up to"))).OpCcblank(null,highItem));
  return;}
 
 private RSeiveOfEratosthenesRexx(){return;}
 }
