/* Generated from 'RAmb01.nrx' 24 Aug 2013 11:09:19 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAmb01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final char[] $03={1,10,2,0,1,0};
 private static final java.lang.String $0="RAmb01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx amb(netrexx.lang.Rexx wordLists[]){
  netrexx.lang.Rexx anAmb;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx wordList=null;
  netrexx.lang.Rexx wx=null;
  anAmb=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(wordLists.length).OpSub(null,$01);w_=new netrexx.lang.Rexx((byte)0);w_:for(;w_.OpLtEq(null,$1);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   wordList=wordLists[w_.toint()];
   netrexx.lang.RexxIO.Say(wordList);
   {for(;;){if(!wordList.OpNotEq(null,$02))break;
    {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(wordList,$03,$2);
    wx=$2[0];wordList=$2[1];}
    netrexx.lang.RexxIO.Say((wx.right(new netrexx.lang.Rexx((byte)1))).OpCcblank(null,wordList));
    }
   }
   }
  }/*w_*/
  
  return anAmb;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx wordLists[];
  
  wordLists=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("the that a"),netrexx.lang.Rexx.toRexx("frog elephant thing"),netrexx.lang.Rexx.toRexx("walked treaded grows"),netrexx.lang.Rexx.toRexx("slowly quickly")};
  
  
  
  
  
  
  netrexx.lang.RexxIO.Say(amb(wordLists));
  
  return;
  }
 
 private RAmb01(){return;}
 }
