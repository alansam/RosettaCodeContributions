/* Generated from 'RSortingPancakesort00.nrx' 3 May 2013 22:09:45 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RSortingPancakesort00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("  flip{1-");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("} Before:");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("}  After:");
 private static final char[] $06={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx(" Input:");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("Output:");
 private static final java.lang.String $0="RSortingPancakesort00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.List pancakeSort(java.util.List tlist){
  return pancakeSort(tlist,(1==0));
  }
 private static java.util.List pancakeSort(java.util.List tlist,boolean debug){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx maxPos=null;
  netrexx.lang.Rexx a_=null;
  
  if (new netrexx.lang.Rexx(tlist.size()).OpGt(null,$01)) 
   {
    {netrexx.lang.Rexx $1=$01.OpMinus(null);i_=new netrexx.lang.Rexx(tlist.size()).OpPlus(null);i_:for(;;i_=i_.OpAdd(null,$1)){if(!i_.OpGt(null,$01))break;
     maxPos=new netrexx.lang.Rexx((byte)0);
     {a_=new netrexx.lang.Rexx((byte)0);a_:for(;;a_=a_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!a_.OpLt(null,i_))break;
      if (((netrexx.lang.Rexx)(tlist.get(a_.toint()))).OpGt(null,(netrexx.lang.Rexx)(tlist.get(maxPos.toint())))) 
       maxPos=a_;
      }
     }/*a_*/
     if (maxPos.OpEq(null,i_.OpSub(null,$01))) 
      continue i_;
     if (maxPos.OpGt(null,$02)) 
      pancakeFlip(tlist,maxPos.OpAdd(null,$01),debug);
     pancakeFlip(tlist,i_,debug);
     }
    }/*i_*/
   }
  return tlist;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.List pancakeFlip(java.util.List tlist,netrexx.lang.Rexx offset){
  return pancakeFlip(tlist,offset,(1==0));
  }
 private static java.util.List pancakeFlip(java.util.List tlist,netrexx.lang.Rexx offset,boolean debug){
  netrexx.lang.Rexx z_;
  netrexx.lang.Rexx pl;
  netrexx.lang.Rexx plx=null;
  netrexx.lang.Rexx i_=null;
  z_=offset.OpSub(null,$01);
  pl=new netrexx.lang.Rexx((byte)3);
  if (debug) 
   {
    plx=offset.length();
    if (plx.OpGt(null,pl)) 
     pl=plx;
    netrexx.lang.RexxIO.Say((($03.OpCc(null,offset.right(pl,new netrexx.lang.Rexx((byte)0)))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(tlist))));
   }
  {i_=new netrexx.lang.Rexx((byte)0);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,z_))break;
   java.util.Collections.swap(tlist,i_.toint(),z_.toint());
   z_=z_.OpSub(null,$01);
   }
  }/*i_*/
  if (debug) 
   {
    netrexx.lang.RexxIO.Say((($03.OpCc(null,offset.right(pl,new netrexx.lang.Rexx((byte)0)))).OpCc(null,$05)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(tlist))));
   }
  return tlist;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  boolean isTrue;
  boolean isFalse;
  netrexx.lang.Rexx debug=null;
  netrexx.lang.Rexx lists;
  netrexx.lang.Rexx il=null;
  java.util.List clist=null;
  
  isTrue=(1==1);
  isFalse=new netrexx.lang.Rexx(isTrue).OpNot(null);
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$06,$2);
  debug=$2[0];}
  if (netrexx.lang.Rexx.toRexx("-debug").abbrev(debug.lower(),new netrexx.lang.Rexx((byte)2)).toboolean()) 
   debug=new netrexx.lang.Rexx(isTrue);
  else 
   debug=new netrexx.lang.Rexx(isFalse);
  
  lists=sampleData();
  {netrexx.lang.Rexx $3=lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf;il=new netrexx.lang.Rexx((byte)1);il:for(;il.OpLtEq(null,$3);il=il.OpAdd(null,new netrexx.lang.Rexx(1))){
   clist=words2list(lists.getnode(il).leaf);
   netrexx.lang.RexxIO.Say($07.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(clist))));
   netrexx.lang.RexxIO.Say($08.OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(pancakeSort(clist,debug.toboolean())))));
   netrexx.lang.RexxIO.Say("");
   }
  }/*il*/
  
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx sampleData(){
  netrexx.lang.Rexx lists;
  netrexx.lang.Rexx i_;
  lists=netrexx.lang.Rexx.toRexx("");
  i_=new netrexx.lang.Rexx((byte)0);
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("6 7 8 9 2 5 3 4 1");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("1 4 3 5 2 9 8 7 6");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("52 26 73 73 66 7 59 54 20");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("10 -9 8 -7 6 -5 4 -3 2 -1 0 -10 9 -8 7 -6 5 -4 3 -2 1");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("4 4 1 3");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("4 10 11 15 14 16 17 1 6 9 3 7 19 2 0 12 5 18 13 8");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("24 32 100 15 8 34 50 79 46 52");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("31 41 59 26 53 58 97 93 23 84");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("23 76 99 58 97 57 35 89 51 38 95 92 24 46 31 24 14 12 57 78 4");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("88 18 31 44 4 0 8 81 14 78 20 76 84 33 73 75 82 5 62 70 12 7 1");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("10 10.0 10.00 1 -10.0 10. -1");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=netrexx.lang.Rexx.toRexx("To be or not to be that is the question");
  i_=i_.OpAdd(null,$01);
  lists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
  lists.getnode(i_).leaf=new netrexx.lang.Rexx('1');
  return lists;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.List words2list(netrexx.lang.Rexx wordlist){
  java.util.ArrayList clist;
  netrexx.lang.Rexx w_=null;
  
  clist=new java.util.ArrayList();
  {netrexx.lang.Rexx $4=wordlist.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$4);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   clist.add((java.lang.Object)(wordlist.word(w_)));
   }
  }/*w_*/
  
  return (java.util.List)clist;
  }
 
 private RSortingPancakesort00(){return;}
 }
