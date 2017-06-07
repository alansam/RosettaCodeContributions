/* Generated from 'RHailstoneSequenceUser.nrx' 7 May 2013 13:34:20 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import RHailstoneSequence;

/* NetRexx */





public class RHailstoneSequenceUser{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("<= N <");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("is");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("times.");
 private static final java.lang.String $0="RHailstoneSequenceUser.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx beginNum=null;
  netrexx.lang.Rexx endNum=null;
  netrexx.lang.Rexx hailstones;
  netrexx.lang.Rexx hn=null;
  netrexx.lang.Rexx hslist=null;
  netrexx.lang.Rexx hscount=null;
  netrexx.lang.Rexx mostOftenNum;
  netrexx.lang.Rexx mostOftenCount;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  beginNum=$1[0];endNum=$1[1];}
  if (beginNum.OpEq(null,$02)|beginNum.OpEq(null,$03)) 
   beginNum=new netrexx.lang.Rexx((byte)1);
  if (endNum.OpEq(null,$02)|endNum.OpEq(null,$03)) 
   endNum=new netrexx.lang.Rexx(100000);
  if (beginNum.OpGt(null,endNum)) 
   throw new java.lang.IllegalArgumentException("Gronk!");
  
  // collect sequences
  hailstones=new netrexx.lang.Rexx((byte)0);
  {hn=beginNum.OpPlus(null);hn:for(;;hn=hn.OpAdd(null,new netrexx.lang.Rexx(1))){if(!hn.OpLt(null,endNum))break;
   hslist=RHailstoneSequence.hailstone(hn.tolong());
   hscount=hslist.words();
   hailstones.getnode(hscount).leaf=(hailstones.getnode(hscount).leaf).OpAdd(null,$04);
   }
  }/*hn*/
  
  // locate most common
  mostOftenNum=new netrexx.lang.Rexx((byte)0);
  mostOftenCount=new netrexx.lang.Rexx((byte)0);
  {hn=beginNum.OpPlus(null);hn:for(;;hn=hn.OpAdd(null,new netrexx.lang.Rexx(1))){if(!hn.OpLt(null,endNum))break;
   if ((hailstones.getnode(hn).leaf).OpGt(null,mostOftenCount)) 
    {
     mostOftenCount=hailstones.getnode(hn).leaf;
     mostOftenNum=hn;
    }
   }
  }/*hn*/
  
  netrexx.lang.RexxIO.Say((((((((netrexx.lang.Rexx.toRexx("The length of hailstone sequence that is most common in the range").OpCcblank(null,beginNum)).OpCcblank(null,$05)).OpCcblank(null,endNum)).OpCcblank(null,$06)).OpCcblank(null,mostOftenNum)).OpCc(null,netrexx.lang.Rexx.toRexx(". It occurs"))).OpCcblank(null,mostOftenCount)).OpCcblank(null,$07));
  return;
  }
 
 private RHailstoneSequenceUser(){return;}
 }
