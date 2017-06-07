/* Generated from 'RPrimalityRexx.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/*REXX program tests for primality using (kinda smartish) trial division*/


public class RPrimalityRexx{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(57);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("is prime.");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("there\'re");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx((byte)6);
 private static final java.lang.String $0="RPrimalityRexx.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx p;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  n=$1[0];}/*let user choose how many, maybe*/
  if (n.OpEqS(null,$02)) 
   n=new netrexx.lang.Rexx((short)10000);/*if not, then assume the default*/
  p=new netrexx.lang.Rexx((byte)0);/*a count of primes  (so far).   */
  /*I like Heinz's 57 varieties... */
  {netrexx.lang.Rexx $2=n;j=$03.OpMinus(null).OpPlus(null);j:for(;j.OpLtEq(null,$2);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/*start in the cellar and work up*/
   if (new netrexx.lang.Rexx(isprime(j)).OpNot(null)) 
    continue j;/*if not prime, keep looking.    */
   p=p.OpAdd(null,$04);/*bump the jelly bean counter.   */
   if ((j.length()).OpGt(null,$05)) 
    continue j;/*only show two-digit primes.    */
   netrexx.lang.RexxIO.Say((j.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$06));/*Just blab about the wee primes.*/
   }
  }/*j*/
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(((($07.OpCcblank(null,p)).OpCcblank(null,netrexx.lang.Rexx.toRexx("primes up to"))).OpCcblank(null,n)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(inclusive).")));
  {System.exit(0);return;}
  }

 /*-------------------------------------ISPRIME subroutine---------------*/
 
 public static boolean isprime(netrexx.lang.Rexx x){
  netrexx.lang.Rexx j=null;
  //isprime: procedure; arg x                   /*get the number in question*/
  if (netrexx.lang.Rexx.toRexx("2 3 5 7").wordpos(x).OpNotEqS(null,$08)) 
   return true;/*is it a teacher's pet?    */
  if ((x.OpLt(null,$05)|x.OpRem(null,$05).OpEqS(null,$08))|x.OpRem(null,$09).OpEqS(null,$08)) 
   return false;/*weed out the riff-raff.   */
  /*Note:   //  is modulus.   */
  {netrexx.lang.Rexx $3=$010;j=new netrexx.lang.Rexx((byte)5);boolean $4=true;j:for(;;){if($4){$4=false;}else{if(j.OpMult(null,j).OpGt(null,x))break;j=j.OpAdd(null,$3);}/*skips multiples of three. */
   if (x.OpRem(null,j).OpEqS(null,$08)|x.OpRem(null,(j.OpAdd(null,$05))).OpEqS(null,$08)) 
    return false;/*do a pair of divides (mod)*/
   }
  }/*j*/
  
  return true;/*I'm exhausted, it's prime!*/
  }
 
 private RPrimalityRexx(){return;}
 }
