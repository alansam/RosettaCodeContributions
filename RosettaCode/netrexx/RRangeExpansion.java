/* Generated from 'RRangeExpansion.nrx' 10 May 2013 19:09:59 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/*NetRexx program to expand a range of integers into a list. *************
* 09.08.2012 Walter Pachl derived from my Rexx version
* Changes: translate(old,' ',',') -> old.translate(' ',',')
*          dashpos=pos('-',x,2)   -> dashpos=x.pos('-',2)
*          Do                     -> Loop
*          Parse Var a x a        -> Parse a x a
*          Parse Var x ...        -> Parse x ...
**********************************************************************/



public class RRangeExpansion{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("old=");
 private static final char[] $04={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final char[] $06={7,1,10,1,0,4,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("new=");
 private static final java.lang.String $0="RRangeExpansion.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx old=null;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx $new;
  netrexx.lang.Rexx comma;
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx dashpos=null;
  netrexx.lang.Rexx low=null;
  netrexx.lang.Rexx high=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  old=$1[0];}
  if (old.OpEq(null,$02)) 
   old=netrexx.lang.Rexx.toRexx("-6,-3--1,3-5,7-11,14,15,17-20");/*original list of nums/ranges */
  
  netrexx.lang.RexxIO.Say($03.OpCc(null,old));/*show old list of nums/ranges.  */
  a=old.translate(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','));/*translate commas to blanks     */
  $new=netrexx.lang.Rexx.toRexx("");/*new list of numbers (so far).  */
  
  comma=netrexx.lang.Rexx.toRexx("");
  {for(;;){if(!a.OpNotEq(null,$02))break;/* as long as there is input     */
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(a,$04,$2);
   x=$2[0];a=$2[1];}/* get one element               */
   dashpos=x.pos(new netrexx.lang.Rexx('-'),new netrexx.lang.Rexx((byte)2));/* find position of dash, if any */
   if (dashpos.OpGt(null,$05)) 
    {/* element is low-high           */
     {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
     $3[1]=dashpos;
     netrexx.lang.RexxParse.parse(x,$06,$3);
     low=$3[0];high=$3[2];}/* split the element        */
     {netrexx.lang.Rexx $4=high;j=low.OpPlus(null);j:for(;j.OpLtEq(null,$4);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/* output all numbers in range   */
      $new=($new.OpCc(null,comma)).OpCc(null,j);/* with separating commas        */
      comma=new netrexx.lang.Rexx(',');/* from now on use comma         */
      }
     }/*j*/
    }
   else 
    {/* element is a number           */
     $new=($new.OpCc(null,comma)).OpCc(null,x);/* append (with comma)           */
     comma=new netrexx.lang.Rexx(',');/* from now on use comma         */
    }
   }
  }
  netrexx.lang.RexxIO.Say($07.OpCc(null,$new));/*show the expanded list         */
  return;}
 
 private RRangeExpansion(){return;}
 }
