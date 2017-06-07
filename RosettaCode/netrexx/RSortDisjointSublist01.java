/* Generated from 'RSortDisjointSublist01.nrx' 2 Sep 2013 19:18:08 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSortDisjointSublist01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final char[] $02={2,1,44,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("In: ");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("Out:");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("Idx:");
 private static final java.lang.String $0="RSortDisjointSublist01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx sortDisjoint(netrexx.lang.Rexx oldList,netrexx.lang.Rexx indices){
  netrexx.lang.Rexx newList;
  java.util.ArrayList subList=null;
  java.util.ArrayList idxList=null;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx iw=null;
  netrexx.lang.Rexx nw=null;
  netrexx.lang.Rexx kx=null;
  netrexx.lang.Rexx kk=null;
  netrexx.lang.Rexx ii=null;
  newList=oldList.space();
  if ((indices.words()).OpGt(null,$01)) 
   { // only do work if we need to
    subList=new java.util.ArrayList();
    idxList=new java.util.ArrayList();
    // pick the input list apart
    {netrexx.lang.Rexx $1=indices.words();ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$1);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
     iw=indices.word(ix);
     nw=oldList.word(iw);
     // protect against bad outcomes...
     if (iw.OpGt(null,oldList.words())) 
      throw new java.lang.ArrayIndexOutOfBoundsException();
     if (iw.OpLt(null,$01)) 
      throw new java.lang.ArrayIndexOutOfBoundsException();
     subList.add((java.lang.Object)nw);
     idxList.add((java.lang.Object)iw);
     }
    }/*ix*/
    java.util.Collections.sort((java.util.List)subList); // sort sublist
    java.util.Collections.sort((java.util.List)idxList); // sort indices
    // put it all back together
    {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(subList.size()).OpSub(null,$01);kx=new netrexx.lang.Rexx((byte)0);kx:for(;kx.OpLtEq(null,$2);kx=kx.OpAdd(null,new netrexx.lang.Rexx(1))){
     kk=(netrexx.lang.Rexx)(subList.get(kx.toint()));
     ii=(netrexx.lang.Rexx)(idxList.get(kx.toint()));
     newList=((newList.subword(new netrexx.lang.Rexx((byte)1),ii.OpSub(null,$01))).OpCcblank(null,kk)).OpCcblank(null,newList.subword(ii.OpAdd(null,$01)));
     }
    }/*kx*/
   }
  return newList;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx vList=null;
  netrexx.lang.Rexx iList=null;
  netrexx.lang.Rexx rList;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$3);
  vList=$3[0];iList=$3[1];}
  if (vList.OpEq(null,$03)) 
   vList=(((((($04.OpCcblank(null,$05)).OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$01)).OpCcblank(null,$010);
  if (iList.OpEq(null,$03)) 
   iList=($04.OpCcblank(null,$09)).OpCcblank(null,$011);
  rList=sortDisjoint(vList,iList);
  netrexx.lang.RexxIO.Say($012.OpCcblank(null,vList.space()));
  netrexx.lang.RexxIO.Say($013.OpCcblank(null,rList.space()));
  netrexx.lang.RexxIO.Say($014.OpCcblank(null,iList.space()));
  return;
  }
 
 private RSortDisjointSublist01(){return;}
 }
