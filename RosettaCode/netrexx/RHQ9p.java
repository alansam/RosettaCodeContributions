/* Generated from 'RHQ9p.nrx' 30 Jun 2013 19:56:04 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RHQ9p{
 private static final char[] $01={4,1,1,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)99);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("bottles");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("of beer");
 private static final char[] $09={1,10,1,0,0};
 private static final java.lang.String $0="RHQ9p.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx interpretHCQ9p(netrexx.lang.Rexx code){
  return interpretHCQ9p(code,new netrexx.lang.Rexx((byte)0));
  }
 public static netrexx.lang.Rexx interpretHCQ9p(netrexx.lang.Rexx code,netrexx.lang.Rexx accumulator){
  netrexx.lang.Rexx quine;
  netrexx.lang.Rexx cc=null;
  quine=code;
  {int $1=(code.length()).OpPlus(null).toint();for(;$1>0;$1--){
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(code,$01,$2);
   cc=$2[0];code=$2[1];}
   cc=cc.lower();
   if (cc.OpNotEq(null,$02)) 
    {
     {/*select*/
     if (cc.OpEqS(null,new netrexx.lang.Rexx('h')))
      netrexx.lang.RexxIO.Say("Hello, world!");
     else if (cc.OpEqS(null,new netrexx.lang.Rexx('q')))
      netrexx.lang.RexxIO.Say(quine);
     else if (cc.OpEqS(null,new netrexx.lang.Rexx('9')))
      ninetyNineBottles();
     else if (cc.OpEqS(null,new netrexx.lang.Rexx('+')))
      accumulator=accumulator.OpAdd(null,$03);
     else{
      ;
     }
     }
    }
   }
  }
  return accumulator;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void ninetyNineBottles(){
  netrexx.lang.Rexx bottleCount;
  netrexx.lang.Rexx bc=null;
  bottleCount=bottles(new netrexx.lang.Rexx((byte)99));
  {netrexx.lang.Rexx $3=$03.OpMinus(null);boolean $4=$3.OpGtEq(null,$06);bc=$04.OpPlus(null);bc:for(;$4?bc.OpLtEq(null,$05):bc.OpGtEq(null,$05);bc=bc.OpAdd(null,$3)){
   netrexx.lang.RexxIO.Say(bottleCount.OpCcblank(null,netrexx.lang.Rexx.toRexx("on the wall")));
   netrexx.lang.RexxIO.Say(bottleCount);
   netrexx.lang.RexxIO.Say("Take one down, pass it around");
   bottleCount=bottles(bc.OpSub(null,$03));
   netrexx.lang.RexxIO.Say(bottleCount.OpCcblank(null,netrexx.lang.Rexx.toRexx("on the wall")));
   netrexx.lang.RexxIO.Say("");
   }
  }/*bc*/
  return;
  }

 
 private static netrexx.lang.Rexx bottles(netrexx.lang.Rexx nb){
  netrexx.lang.Rexx bm=null;
  {/*select*/
  if (nb.OpEqS(null,new netrexx.lang.Rexx((byte)0)))
   bm=netrexx.lang.Rexx.toRexx("No more bottles");
  else if (nb.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
   bm=netrexx.lang.Rexx.toRexx("One bottle");
  else{
   bm=nb.OpCcblank(null,$07);
  }
  }
  return bm.OpCcblank(null,$08);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx code=null;
  {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$09,$5);
  code=$5[0];}
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("HQ9+ Accumulator =").OpCcblank(null,interpretHCQ9p(code)));
  return;
  }
 
 private RHQ9p(){return;}
 }
