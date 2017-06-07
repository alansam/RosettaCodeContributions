/* Generated from 'z_WParrays.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx program ****************************************************
* 03.11.2012 Walter Pachl
**********************************************************************/


public class z_WParrays{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final char[] $04={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="z_WParrays.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx values;
  netrexx.lang.Rexx keys;
  netrexx.lang.Rexx kcopy;
  netrexx.lang.Rexx ka;
  netrexx.lang.Rexx va;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx v=null;
  values=netrexx.lang.Rexx.toRexx("triangle quadrilateral pentagon hexagon heptagon octagon").OpCcblank(null,netrexx.lang.Rexx.toRexx("nonagon decagon dodecagon"));
  
  keys=netrexx.lang.Rexx.toRexx("three four five six seven eight nine ten twelve");
  kcopy=keys;
  ka=netrexx.lang.Rexx.toRexx("");
  va=netrexx.lang.Rexx.toRexx("");
  {i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$02);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){if(!kcopy.OpGt(null,$03))break;
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(kcopy,$04,$1);
   k=$1[0];kcopy=$1[1];}
   ka.getnode(i).leaf=k;
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(values,$04,$2);
   v=$2[0];values=$2[1];}
   va.getnode(i).leaf=v;
   netrexx.lang.RexxIO.Say((((i.OpCcblank(null,k)).OpCcblank(null,v)).OpCcblank(null,ka.getnode(i).leaf)).OpCcblank(null,va.getnode(i).leaf));
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(($05.OpCcblank(null,k.getnode(new netrexx.lang.Rexx((byte)2)).leaf)).OpCcblank(null,v.getnode(new netrexx.lang.Rexx((byte)2)).leaf));
  netrexx.lang.RexxIO.Say(($06.OpCcblank(null,ka.getnode(new netrexx.lang.Rexx((byte)1)).leaf)).OpCcblank(null,va.getnode(new netrexx.lang.Rexx((byte)1)).leaf));
  return;}
 
 private z_WParrays(){return;}
 }/**********************************************************************
1 three triangle three triangle
2 four quadrilateral four quadrilateral
1 four quadrilateral  ???? WHY *** ???????????
**********************************************************************/

