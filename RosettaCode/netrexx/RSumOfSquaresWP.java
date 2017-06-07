/* Generated from 'RSumOfSquaresWP.nrx' 2 May 2014 09:58:22 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*NetRexx *************************************************************
* program to sum the squares of a vector of fifteen numbers.
* translated from REXX
* 14.05.2013 Walter Pachl
**********************************************************************/
/*allow 50-digit # (default is 9)*/

public class RSumOfSquaresWP{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)50);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final char[] $03={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("The sum of");
 private static final java.lang.String $0="RSumOfSquaresWP.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx v;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx sum;
  v=netrexx.lang.Rexx.toRexx("-100 9 8 7 6 0 3 4 5 2 1 .5 10 11 12");/* vector with some #s.     */
  n=v.words();
  x=netrexx.lang.Rexx.toRexx("");
  sum=new netrexx.lang.Rexx((byte)0);/*initialize   SUM   to zero.    */
  /*if vector is empty, sum = zero.*/
  {boolean $2=true;for(;;){if($2){$2=false;}else{if(x.OpEq($1,$02))break;}/*loop until list is exhausted   */
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(v,$03,$3);
   x=$3[0];v=$3[1];}/* pick next number              */
   if (x.OpGt($1,$02)) /* there is a number             */
    sum=sum.OpAdd($1,x.OpPow($1,$04));/*add its square to the sum.     */
   }
  }
  netrexx.lang.RexxIO.Say((($05.OpCcblank($1,n)).OpCcblank($1,netrexx.lang.Rexx.toRexx("elements for the V vector is:"))).OpCcblank($1,sum));
  return;}
 
 private RSumOfSquaresWP(){return;}
 }
