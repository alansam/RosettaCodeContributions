/* Generated from 'FizzBuzz.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

public class FizzBuzz{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(15);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3);
 private static final java.lang.String $0="FizzBuzz.nrx";
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx j=null;
  {int $1=$01.OpPlus(null).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$1>0;$1--,j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   {/*select*/
   if (j.OpRem(null,$02).OpEqS(null,$03))
    netrexx.lang.RexxIO.Say("FizzBuzz");
   else if (j.OpRem(null,$04).OpEqS(null,$03))
    netrexx.lang.RexxIO.Say("Buzz");
   else if (j.OpRem(null,$05).OpEqS(null,$03))
    netrexx.lang.RexxIO.Say("Fizz");
   else{
    netrexx.lang.RexxIO.Say(j.right(new netrexx.lang.Rexx((byte)4)));
   }
   }
   }
  }/*j*/
  return;}
 
 private FizzBuzz(){return;}
 }