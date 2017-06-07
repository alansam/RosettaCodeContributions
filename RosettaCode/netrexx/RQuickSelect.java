/* Generated from 'RQuickSelect.nrx' 19 Nov 2013 18:17:23 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */

/** @see <a href="http://en.wikipedia.org/wiki/Quickselect">http://en.wikipedia.org/wiki/Quickselect</a> */


public class RQuickSelect{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("    ");
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx((byte)4);
 private static final java.lang.String $0="RQuickSelect.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private static netrexx.lang.Rexx qpartition(netrexx.lang.Rexx list,netrexx.lang.Rexx ileft,netrexx.lang.Rexx iright,netrexx.lang.Rexx pivotIndex){
  netrexx.lang.Rexx pivotValue;
  netrexx.lang.Rexx storeIndex;
  netrexx.lang.Rexx i_=null;
  pivotValue=list.getnode(pivotIndex).leaf;
  list=swap(list,pivotIndex,iright); // Move pivot to end
  storeIndex=ileft;
  {netrexx.lang.Rexx $1=iright.OpSub(null,$01);i_=ileft.OpPlus(null);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   if ((list.getnode(i_).leaf).OpLtEq(null,pivotValue)) 
    {
     list=swap(list,storeIndex,i_);
     storeIndex=storeIndex.OpAdd(null,$01);
    }
   }
  }/*i_*/
  list=swap(list,iright,storeIndex); // Move pivot to its final place
  return storeIndex;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static netrexx.lang.Rexx qselectInPlace(netrexx.lang.Rexx list,netrexx.lang.Rexx k_){
  return qselectInPlace(list,k_,$01.OpMinus(null),$01.OpMinus(null));
  }
 public static netrexx.lang.Rexx qselectInPlace(netrexx.lang.Rexx list,netrexx.lang.Rexx k_,netrexx.lang.Rexx ileft){
  return qselectInPlace(list,k_,ileft,$01.OpMinus(null));
  }
 public static netrexx.lang.Rexx qselectInPlace(netrexx.lang.Rexx list,netrexx.lang.Rexx k_,netrexx.lang.Rexx ileft,netrexx.lang.Rexx iright){
  netrexx.lang.Rexx pivotIndex=null;
  netrexx.lang.Rexx pivotNewIndex=null;
  netrexx.lang.Rexx pivotDist=null;
  netrexx.lang.Rexx returnVal=null;
  if (ileft.OpEq(null,$01.OpMinus(null))) 
   ileft=new netrexx.lang.Rexx((byte)1);
  if (iright.OpEq(null,$01.OpMinus(null))) 
   iright=list.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
  
  {inplace:for(;;){
   pivotIndex=new netrexx.lang.Rexx((new java.util.Random()).nextInt(iright.OpSub(null,ileft).OpAdd(null,$01).toint())).OpAdd(null,ileft); // select pivotIndex between left and right
   pivotNewIndex=qpartition(list,ileft,iright,pivotIndex);
   pivotDist=pivotNewIndex.OpSub(null,ileft).OpAdd(null,$01);
   {/*select*/
   if (pivotDist.OpEq(null,k_))
    {
     returnVal=list.getnode(pivotNewIndex).leaf;
     break inplace;
    }
   else if (k_.OpLt(null,pivotDist))
    iright=pivotNewIndex.OpSub(null,$01);
   else{
    {
     k_=k_.OpSub(null,pivotDist);
     ileft=pivotNewIndex.OpAdd(null,$01);
    }
   }
   }
   }
  }/*inplace*/
  return returnVal;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private static netrexx.lang.Rexx swap(netrexx.lang.Rexx list,netrexx.lang.Rexx i1,netrexx.lang.Rexx i2){
  netrexx.lang.Rexx t1=null;
  if (i1.OpNotEq(null,i2)) 
   {
    t1=list.getnode(i1).leaf;
    list.getnode(i1).leaf=list.getnode(i2).leaf;
    list.getnode(i2).leaf=t1;
   }
  return list;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samplelist=null;
  netrexx.lang.Rexx items;
  netrexx.lang.Rexx iv;
  netrexx.lang.Rexx k_=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  samplelist=$2[0];}
  if (samplelist.OpEq(null,$03)|samplelist.OpEq(null,$04)) 
   samplelist=(((((((($05.OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$010)).OpCcblank(null,$01)).OpCcblank(null,$011)).OpCcblank(null,$012)).OpCcblank(null,$013);
  items=samplelist.words();
  netrexx.lang.RexxIO.Say("Input:");
  netrexx.lang.RexxIO.Say($014.OpCc(null,samplelist.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", "))));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say("Using in-place version of the algorithm:");
  iv=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $3=items;k_=new netrexx.lang.Rexx((byte)1);k_:for(;k_.OpLtEq(null,$3);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   iv=iv.OpCcblank(null,qselectInPlace(buildIndexedString(samplelist),k_));
   }
  }/*k_*/
  netrexx.lang.RexxIO.Say($014.OpCc(null,iv.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", "))));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say("Find the 4 smallest:");
  iv=netrexx.lang.Rexx.toRexx("");
  {k_=new netrexx.lang.Rexx((byte)1);k_:for(;k_.OpLtEq(null,$015);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   iv=iv.OpCcblank(null,qselectInPlace(buildIndexedString(samplelist),k_));
   }
  }/*k_*/
  netrexx.lang.RexxIO.Say($014.OpCc(null,iv.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", "))));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say("Find the 3 largest:");
  iv=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $4=items;k_=items.OpSub(null,$011).OpPlus(null);k_:for(;k_.OpLtEq(null,$4);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   iv=iv.OpCcblank(null,qselectInPlace(buildIndexedString(samplelist),k_));
   }
  }/*k_*/
  netrexx.lang.RexxIO.Say($014.OpCc(null,iv.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')).changestr(new netrexx.lang.Rexx(','),netrexx.lang.Rexx.toRexx(", "))));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx buildIndexedString(netrexx.lang.Rexx samplelist){
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx k_=null;
  list=new netrexx.lang.Rexx((byte)0);
  list.getnode(new netrexx.lang.Rexx((byte)0)).leaf=samplelist.words();
  {netrexx.lang.Rexx $5=list.getnode(new netrexx.lang.Rexx((byte)0)).leaf;k_=new netrexx.lang.Rexx((byte)1);k_:for(;k_.OpLtEq(null,$5);k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   list.getnode(k_).leaf=samplelist.word(k_);
   }
  }/*k_*/
  return list;
  }
 
 private RQuickSelect(){return;}
 }
