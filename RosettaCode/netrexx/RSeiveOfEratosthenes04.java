/* Generated from 'RSeiveOfEratosthenes04.nrx' 23 Jul 2012 11:09:55 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/*REXX program generates primes via sieve of Eratosthenes algorithm.
* 21.07.2012 Walter Pachl derived from above Rexx version
*                       avoid symbols @ and # (not supported by ooRexx)
*                       avoid negations (think positive)
**********************************************************************/




public class RSeiveOfEratosthenes04{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('s');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx(" --> ");
 private static final java.lang.String $0="RSeiveOfEratosthenes04.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx highest=null;
  long beginProc;
  netrexx.lang.Rexx is_prime;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx jm=null;
  long endProc;
  netrexx.lang.Rexx duration;
  netrexx.lang.Rexx np;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  highest=$2[0];}
  if (highest.OpEq($1,$03)) 
   highest=new netrexx.lang.Rexx((short)200);/*define highest number to use.  */
  beginProc=java.lang.System.nanoTime();
  is_prime=new netrexx.lang.Rexx((byte)1);/*assume all numbers are prime.  */
  w=highest.length();/*width of the biggest number,   */
  /*  it's used for aligned output.*/
  {netrexx.lang.Rexx $3=highest;netrexx.lang.Rexx $4=$04;j=new netrexx.lang.Rexx((byte)3);j:for(;j.OpLtEq($1,$3);j=j.OpAdd($1,$4)){if(!j.OpMult($1,j).OpLtEq($1,highest))break;/*strike multiples of odd ints.  */
   /* up to sqrt(highest)           */
   if ((is_prime.getnode(j).leaf).toboolean()) 
    {
     {netrexx.lang.Rexx $5=highest;netrexx.lang.Rexx $6=j.OpAdd($1,j);boolean $7=$6.OpGtEq($1,$06);jm=j.OpMult($1,$05).OpPlus($1);jm:for(;$7?jm.OpLtEq($1,$5):jm.OpGtEq($1,$5);jm=jm.OpAdd($1,$6)){/*start with next odd mult. of J */
      is_prime.getnode(jm).leaf=new netrexx.lang.Rexx((byte)0);/*mark odd mult. of J not prime. */
      }
     }/*jm*/
    }
   }
  }/*j*/
  endProc=java.lang.System.nanoTime();
  duration=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
  np=new netrexx.lang.Rexx((byte)0);/*number of primes shown         */
  np=tell(new netrexx.lang.Rexx((byte)2),w,np);
  {netrexx.lang.Rexx $8=highest;netrexx.lang.Rexx $9=$04;n=new netrexx.lang.Rexx((byte)3);n:for(;n.OpLtEq($1,$8);n=n.OpAdd($1,$9)){/*list all the primes found.     */
   if ((is_prime.getnode(n).leaf).toboolean()) 
    {
     np=tell(n,w,np);
    }
   }
  }/*n*/
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank($1,(duration.OpDiv($1,$07)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc($1,$08));
  {System.exit(0);return;}
  }
 
 private static netrexx.lang.Rexx tell(netrexx.lang.Rexx prime,netrexx.lang.Rexx w,netrexx.lang.Rexx np){
  np=np.OpAdd($1,$09);
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("           prime number").OpCcblank($1,np.right(w))).OpCcblank($1,$010)).OpCcblank($1,prime.right(w)));
  return np;
  }
 
 private RSeiveOfEratosthenes04(){return;}
 }
