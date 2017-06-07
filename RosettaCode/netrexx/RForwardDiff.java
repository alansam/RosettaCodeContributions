/* Generated from 'RForwardDiff.nrx' 14 Aug 2012 21:07:09 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* NetRexx*************************************************************
* Forward differences
* 18.08.2012 Walter Pachl derived from Rexx
**********************************************************************/

public class RForwardDiff{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)11);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('<');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('>');
 private static final java.lang.String $0="RForwardDiff.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n=null;
  {n=$01.OpMinus(null).OpPlus(null);n:for(;n.OpLtEq(null,$02);n=n.OpAdd(null,new netrexx.lang.Rexx(1))){
   differences(netrexx.lang.Rexx.toRexx("90 47 58 29 22 32 55 5 55 73"),n);
   }
  }/*n*/
  return;}

 
 public static void differences(netrexx.lang.Rexx a,netrexx.lang.Rexx n){
  netrexx.lang.Rexx arr;
  netrexx.lang.Rexx m;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx t=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx u=null;
  netrexx.lang.Rexx ol=null;
  //arr=Rexx[11]                       -- array must be declared (zero based)
  arr=netrexx.lang.Rexx.toRexx(""); // alternative: indexed string
  m=a.words();
  {/*select*/
  if (n.OpLt(null,$03))
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("n is negative:").OpCcblank(null,n)).OpCcblank(null,$04)).OpCcblank(null,$03));
  else if (n.OpGt(null,m))
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("n is too large:").OpCcblank(null,n)).OpCcblank(null,$05)).OpCcblank(null,m));
  else{
   {
    {netrexx.lang.Rexx $1=m;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     arr.getnode(i).leaf=a.word(i);
     }
    }/*i*/
    {netrexx.lang.Rexx $2=n;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     t=arr.getnode(i).leaf;
     {netrexx.lang.Rexx $3=m;j=i.OpAdd(null,$01).OpPlus(null);j:for(;j.OpLtEq(null,$3);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
      u=arr.getnode(j).leaf;
      arr.getnode(j).leaf=(arr.getnode(j).leaf).OpSub(null,t);
      t=u;
      }
     }/*j*/
     }
    }/*i*/
    ol=netrexx.lang.Rexx.toRexx("");
    {netrexx.lang.Rexx $4=m;i=n.OpAdd(null,$01).OpPlus(null);i:for(;i.OpLtEq(null,$4);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     ol=ol.OpCcblank(null,arr.getnode(i).leaf.right(new netrexx.lang.Rexx((byte)4)));
     }
    }/*i*/
    netrexx.lang.RexxIO.Say((n.right(new netrexx.lang.Rexx((byte)2))).OpCcblank(null,ol));
   }
  }
  }
  return;}
 
 private RForwardDiff(){return;}
 }
