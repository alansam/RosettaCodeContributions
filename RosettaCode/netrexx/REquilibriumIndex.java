/* Generated from 'REquilibriumIndex.nrx' 15 Aug 2013 23:55:19 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class REquilibriumIndex{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\"');
 private static final java.lang.String $0="REquilibriumIndex.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // @see http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 
 private static netrexx.lang.Rexx equilibriumIndex(netrexx.lang.Rexx sequence){
  netrexx.lang.Rexx es;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx sum=null;
  netrexx.lang.Rexx jx=null;
  es=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=sequence.words();ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq($1,$2);ix=ix.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum=new netrexx.lang.Rexx((byte)0);
   {netrexx.lang.Rexx $3=sequence.words();jx=new netrexx.lang.Rexx((byte)1);jx:for(;jx.OpLtEq($1,$3);jx=jx.OpAdd($1,new netrexx.lang.Rexx(1))){
    if (jx.OpLt($1,ix)) 
     sum=sum.OpAdd($1,sequence.word(jx));
    if (jx.OpGt($1,ix)) 
     sum=sum.OpSub($1,sequence.word(jx));
    }
   }/*jx*/
   if (sum.OpEq($1,$02)) 
    es=es.OpCcblank($1,ix);
   }
  }/*ix*/
  return es;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sequences[];
  netrexx.lang.Rexx sequence=null;
  // Note: A Rexx object based list of "words" starts at index 1
  sequences=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("-7  1  5  2 -4  3  0"),netrexx.lang.Rexx.toRexx(" 2  4  6"),netrexx.lang.Rexx.toRexx(" 0  2  4  0  6  0"),netrexx.lang.Rexx.toRexx(" 2  9  2"),netrexx.lang.Rexx.toRexx(" 1 -1  1 -1  1 -1  1")};
  // 4 7
  // (no equilibrium point)
  // 4
  // 2
  // 1 2 3 4 5 6 7
  
  {int $6=0;netrexx.lang.Rexx[] $5=new netrexx.lang.Rexx[sequences.length];synchronized(sequences){for(;;){if($6==$5.length)break;$5[$6]=sequences[sequences.length-1-$6];$6++;}}sequence:for(;;){if(--$6<0)break;sequence=(netrexx.lang.Rexx)$5[$6];
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("For sequence \"").OpCc($1,sequence.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCc($1,netrexx.lang.Rexx.toRexx("\" the equilibrium indices are: \000")));
   netrexx.lang.RexxIO.Say(($03.OpCc($1,equilibriumIndex(sequence).space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCc($1,$03));
   }
  }/*sequence*/
  return;
  }
 
 private REquilibriumIndex(){return;}
 }

