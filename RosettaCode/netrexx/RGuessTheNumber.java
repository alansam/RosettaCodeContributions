/* Generated from 'RGuessTheNumber.nrx' 8 Oct 2013 09:45:26 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RGuessTheNumber{
 private static final char[] $01={1,10,2,0,1,0};
 private static final java.lang.String[] $02={"guessthis","guess"};
 private static final java.lang.String $03="guessThis = (Math.random * 10 + 1) % 1";
 private static final java.lang.String[] $04={"guessthis"};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final java.lang.String $07="guess = -1";
 private static final java.lang.String[] $08={"guess"};
 private static final java.lang.String $09="  parse ask guess .";
 private static final java.lang.String $0="RGuessTheNumber.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx tracing=null;
  netrexx.lang.Rexx guessThis;
  netrexx.lang.Rexx guess;
  netrexx.lang.Rexx prompt[];
  int promptIdx;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  netrexx.lang.RexxTrace $1=new netrexx.lang.RexxTrace(26,System.err,"RGuessTheNumber.nrx");
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$2);
  tracing=$2[0];}
  if (netrexx.lang.Rexx.toRexx("TRACE").abbrev(tracing.upper(),new netrexx.lang.Rexx((byte)2)).toboolean()){
   $1.modnames($02,null);
   }
  $1.traceclause(7,$03,1,$04);guessThis=($1.traceRexx(7,((new netrexx.lang.Rexx(java.lang.Math.random()).OpMult(null,$05).OpAdd(null,$06))).OpDivI(null,$06),'v',1,"guessThis"));
  $1.traceclause(8,$07,1,$08);guess=($1.traceRexx(8,$06.OpMinus(null),'v',1,"guess"));
  prompt=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Try guessing a number between 1 and 10"),netrexx.lang.Rexx.toRexx("Wrong; try again...")};
  
  
  
  promptIdx=new netrexx.lang.Rexx(0).toint();
  
  {boolean $3=true;g_:for(;;){if($3){$3=false;}else{if(guess.OpEq(null,guessThis))break;}
   netrexx.lang.RexxIO.Say(prompt[promptIdx]);
   promptIdx=1;
   $1.traceclause(18,$09,1,$08);{netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$4);
   guess=($1.traceRexx(18,$4[0],'v',1,"guess"));}
   if (guess.OpEq(null,guessThis)){
    {
     netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Well guessed!").OpCcblank(null,guess)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is the correct number.")));
     break g_;
    }
    }
   }
  }/*g_*/
  
  return;
  }
 
 private RGuessTheNumber(){return;}
 }
