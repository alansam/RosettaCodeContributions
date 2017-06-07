/* Generated from 'RHarshadNivenSeries.nrx' 25 Jan 2014 19:17:16 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ------------------------------------------------------------
* 21.01.2014 Walter Pachl  translated from ooRexx (from REXX version 1)
*--------------------------------------------------------------------*/




public class RHarshadNivenSeries{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("first");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("is:");
 private static final java.lang.String $0="RHarshadNivenSeries.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx y=null;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx nl;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  x=$1[0];y=$1[1];}/* get optional arguments:  X  Y */
  if (x.OpEq(null,$02)) 
   x=new netrexx.lang.Rexx((byte)20);/* Not specified?  Use default   */
  if (y.OpEq(null,$02)) 
   y=new netrexx.lang.Rexx((short)1000);/* "      "        "     "       */
  n=new netrexx.lang.Rexx((byte)0);/* Niven count                   */
  nl=netrexx.lang.Rexx.toRexx("");/* Niven list.                   */
  
  {j=new netrexx.lang.Rexx((byte)1);boolean $2=true;j:for(;;){if($2){$2=false;}else{if(n.OpEq(null,x))break;j=j.OpAdd(null,new netrexx.lang.Rexx(1));}/* let's go Niven number hunting.*/
   if (j.OpRem(null,sumdigs(j)).OpEq(null,$04)) 
    {/* j is a Niven number           */
     n=n.OpAdd(null,$05);/* bump Niven count              */
     nl=nl.OpCcblank(null,j);/* add to list.                  */
    }
   }
  }/*j*/
  
  netrexx.lang.RexxIO.Say((($06.OpCcblank(null,n)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Niven numbers:"))).OpCc(null,nl));
  
  {j=y.OpAdd(null,$05).OpPlus(null);j:for(;;j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/* start with first candidate    */
   if (j.OpRem(null,sumdigs(j)).OpEq(null,$04)) /* j is a Niven number           */
    break j;
   }
  }/*j*/
  
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("first Niven number >").OpCcblank(null,y)).OpCcblank(null,$07)).OpCcblank(null,j));
  {System.exit(0);return;}
  }

 
 public static netrexx.lang.Rexx sumdigs(netrexx.lang.Rexx n){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx k=null;
  sum=n.left(new netrexx.lang.Rexx((byte)1));
  {netrexx.lang.Rexx $3=n.length();k=new netrexx.lang.Rexx((byte)2);k:for(;k.OpLtEq(null,$3);k=k.OpAdd(null,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd(null,n.substr(k,new netrexx.lang.Rexx((byte)1)));
   }
  }/*k*/
  return sum;
  }
 
 private RHarshadNivenSeries(){return;}
 }
