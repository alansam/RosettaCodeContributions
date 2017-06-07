/* Generated from 'RLargestInt.nrx' 21 Oct 2013 20:50:56 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RLargestInt{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RLargestInt.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx largestInt(netrexx.lang.Rexx il){
  netrexx.lang.Rexx ri;
  netrexx.lang.Rexx wa;
  netrexx.lang.Rexx ww=null;
  netrexx.lang.Rexx wx=null;
  netrexx.lang.Rexx wy=null;
  netrexx.lang.Rexx xx=null;
  netrexx.lang.Rexx yy=null;
  netrexx.lang.Rexx xy=null;
  netrexx.lang.Rexx yx=null;
  ri=netrexx.lang.Rexx.toRexx("");
  wa=netrexx.lang.Rexx.toRexx("");
  // put the list into an indexed string
  wa.getnode(new netrexx.lang.Rexx((byte)0)).leaf=il.words();
  {netrexx.lang.Rexx $1=wa.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ww=new netrexx.lang.Rexx((byte)1);ww:for(;ww.OpLtEq(null,$1);ww=ww.OpAdd(null,new netrexx.lang.Rexx(1))){
   wa.getnode(ww).leaf=il.word(ww);
   }
  }/*ww*/
  
  // order the list
  {netrexx.lang.Rexx $2=(wa.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpSub(null,$01);wx=new netrexx.lang.Rexx((byte)1);wx:for(;wx.OpLtEq(null,$2);wx=wx.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $3=wa.getnode(new netrexx.lang.Rexx((byte)0)).leaf;wy=wx.OpAdd(null,$01).OpPlus(null);wy:for(;wy.OpLtEq(null,$3);wy=wy.OpAdd(null,new netrexx.lang.Rexx(1))){
    xx=wa.getnode(wx).leaf;
    yy=wa.getnode(wy).leaf;
    xy=xx.OpCc(null,yy);
    yx=yy.OpCc(null,xx);
    if (xy.OpLt(null,yx)) 
     {
      // swap xx and yy
      wa.getnode(wx).leaf=yy;
      wa.getnode(wy).leaf=xx;
     }
    }
   }/*wy*/
   }
  }/*wx*/
  
  // rebuild list from indexed string
  {netrexx.lang.Rexx $4=wa.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ww=new netrexx.lang.Rexx((byte)1);ww:for(;ww.OpLtEq(null,$4);ww=ww.OpAdd(null,new netrexx.lang.Rexx(1))){
   ri=ri.OpCcblank(null,wa.getnode(ww).leaf);
   }
  }/*ww*/
  return ri.space(new netrexx.lang.Rexx((byte)0)); // concatenate the list elements into a single numeric
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ints[];
  netrexx.lang.Rexx il=null;
  ints=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("1 34 3 98 9 76 45 4"),netrexx.lang.Rexx.toRexx("54 546 548 60")};
  
  
  
  {int $7=0;netrexx.lang.Rexx[] $6=new netrexx.lang.Rexx[ints.length];synchronized(ints){for(;;){if($7==$6.length)break;$6[$7]=ints[ints.length-1-$7];$7++;}}il:for(;;){if(--$7<0)break;il=(netrexx.lang.Rexx)$6[$7];
   netrexx.lang.RexxIO.Say(((largestInt(il).right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$02)).OpCcblank(null,il.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','))));
   }
  }/*il*/
  return;
  }
 
 private RLargestInt(){return;}
 }
