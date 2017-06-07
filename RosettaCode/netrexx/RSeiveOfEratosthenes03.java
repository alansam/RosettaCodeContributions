/* Generated from 'RSeiveOfEratosthenes03.nrx' 23 Jul 2012 11:09:55 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/*REXX program generates primes via  sieve of Eratosthenes  algorithm.  */




public class RSeiveOfEratosthenes03{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx(" --> ");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("1000000000");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RSeiveOfEratosthenes03.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx highest=null;
  long beginProc;
  netrexx.lang.Rexx primes;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx m=null;
  long endProc;
  netrexx.lang.Rexx duration;
  netrexx.lang.Rexx primeCount;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  highest=$2[0];}
  if (highest.OpEq($1,$03)) 
   highest=new netrexx.lang.Rexx((short)200);/*define highest number to use.  */
  beginProc=java.lang.System.nanoTime();
  primes=new netrexx.lang.Rexx((byte)1);/*assume all numbers are prime.  */
  w=highest.length();/*width of the biggest number,   */
  /*  it's used for aligned output.*/
  {netrexx.lang.Rexx $3=highest;j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq($1,$3);j=j.OpAdd($1,new netrexx.lang.Rexx(1))){/*strike multiples of integers.  */
   if (j.OpMult($1,j).OpGt($1,highest)) 
    break j;/*only process up to  Ã(highest).*/
   if ((primes.getnode(j).leaf).OpNot($1)) 
    continue j;/*Â prime?  It was already struck*/
   
   {netrexx.lang.Rexx $4=highest;netrexx.lang.Rexx $5=j;boolean $6=$5.OpGtEq($1,$04);m=j.OpAdd($1,j).OpPlus($1);m:for(;$6?m.OpLtEq($1,$4):m.OpGtEq($1,$4);m=m.OpAdd($1,$5)){/*start with next multiple of J. */
    primes.getnode(m).leaf=new netrexx.lang.Rexx((byte)0);/*mark multiples of J not prime. */
    }
   }/*m*/
   }
  }/*j*/
  endProc=java.lang.System.nanoTime();
  duration=new netrexx.lang.Rexx(endProc).OpSub($1,new netrexx.lang.Rexx(beginProc));
  primeCount=new netrexx.lang.Rexx((byte)0);/*prime index, the # of the prime*/
  {netrexx.lang.Rexx $7=highest;n=new netrexx.lang.Rexx((byte)2);n:for(;n.OpLtEq($1,$7);n=n.OpAdd($1,new netrexx.lang.Rexx(1))){/*list all the primes found.     */
   if ((primes.getnode(n).leaf).OpNot($1)) 
    continue n;/*Not prime?  Then keep looking. */
   primeCount=primeCount.OpAdd($1,$05);/*bump the prime count ('til now)*/
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("           prime number").OpCcblank($1,primeCount.right(w))).OpCcblank($1,$06)).OpCcblank($1,n.right(w)));
   }
  }/*n*/
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Processing time:").OpCcblank($1,(duration.OpDiv($1,$07)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6)))).OpCc($1,$08));
  return;}
 
 private RSeiveOfEratosthenes03(){return;}
 }
