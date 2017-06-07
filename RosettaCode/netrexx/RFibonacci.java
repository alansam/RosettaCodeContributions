/* Generated from 'RFibonacci.nrx' 3 Jul 2011 10:21:44 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * The <strong>Fibonacci sequence</strong> is a sequence F<sub>n</sub> of natural numbers defined recursively:
 * <p>
 * <code>
 * F<sub>0</sub> = 0
 * <br />
 * F<sub>1</sub> = 1
 * <br />
 * F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub>, if n>1
 * </code>
 * </p>
 * <p>
 * Write a function to generate the nth Fibonacci number. Solutions can be iterative or recursive
 * (though recursive solutions are generally considered too slow and are mostly used as an exercise in recursion).
 * </p>
 * <p>
 * The sequence is sometimes extended into negative numbers by using a straightforward inverse of the positive definition:
 * </p>
 * <p>
 * <code>
 * F<sub>n</sub> = F<sub>n+2</sub> - F<sub>n+1</sub>, if n<0
 * </code>
 * </p>
 * <p>
 * Support for negative n in the solution is optional.
 * </p>
 * <h4>References:</h4>
 * <ul>
 * <li><a href="http://en.wikipedia.org/wiki/Fibonacci_chain"></a>Wikipedia</li>
 * <li><a href="http://mathworld.wolfram.com/FibonacciNumber.html"></a>Wolfram MathWorld</li>
 * <li><a href="http://oeis.org/A000045"></a>OEIS Fibonacci sequence</li>
 * </ul>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Fibonacci_sequence">rosettacode.org/wiki/Fibonacci_sequence</a> 
 */

/*prepare for some big 'uns.     */

public class RFibonacci{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(210000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(30);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("Fibonacci");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(25);
 private static final char[] $08={1,10,1,0,0};
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RFibonacci.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx y=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx q=null;
  netrexx.lang.Rexx w=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  x=$2[0];y=$2[1];}/*allow a single number or range.*/
  if (x.OpEqS($1,$03)) 
   {/*no input? Then assume -30-->+30*/
    x=$04.OpMinus($1);
    y=x.OpMinus($1);
   }
  
  if (y.OpEqS($1,$03)) 
   y=x;/*if only one number, show fib(n)*/
  {netrexx.lang.Rexx $3=y;k=x.OpPlus($1);k:for(;k.OpLtEq($1,$3);k=k.OpAdd($1,new netrexx.lang.Rexx(1))){/*process each Fibonacci request.*/
   q=fib(k);
   w=q.length();/*if wider than 25 bytes, tell it*/
   netrexx.lang.RexxIO.Say((($05.OpCcblank($1,k)).OpCc($1,$06)).OpCc($1,q));
   if (w.OpGt($1,$07)) 
    netrexx.lang.RexxIO.Say((($05.OpCcblank($1,k)).OpCcblank($1,netrexx.lang.Rexx.toRexx("has a length of"))).OpCcblank($1,w));
   }
  }/*k*/
  {System.exit(0);return;}
  }

 /*-------------------------------------FIB subroutine (non-recursive)---*/
 
 private static netrexx.lang.Rexx fib(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx na;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx b;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx s=null;
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$08,$4);
  n=$4[0];}
  na=n.abs();
  
  if (na.OpLt($1,$09)) 
   return na;/*handle special cases.          */
  a=new netrexx.lang.Rexx((byte)0);
  b=new netrexx.lang.Rexx((byte)1);
  
  {netrexx.lang.Rexx $5=na;j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq($1,$5);j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   s=a.OpAdd($1,b);
   a=b;
   b=s;
   }
  }/*j*/
  
  if (n.OpGt($1,$010)|na.OpRem($1,$09).OpEqS($1,$011)) 
   return s;/*if positive or odd negative... */
  else 
   return s.OpMinus($1);/*return a negative Fib number.  */
  }
 
 private RFibonacci(){return;}
 }
