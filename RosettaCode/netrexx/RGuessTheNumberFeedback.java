/* Generated from 'RGuessTheNumberFeedback.nrx' 8 Oct 2013 17:46:45 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RGuessTheNumberFeedback{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final char[] $04={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("and");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("tries.");
 private static final java.lang.String $0="RGuessTheNumberFeedback.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx lo=null;
  netrexx.lang.Rexx hi=null;
  java.util.Random rg;
  netrexx.lang.Rexx tries;
  netrexx.lang.Rexx guessThis;
  netrexx.lang.Rexx guess=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  lo=$1[0];hi=$1[1];}
  if (lo.OpEq(null,$02)|lo.OpEq(null,$03)) 
   lo=new netrexx.lang.Rexx((byte)1);
  if (hi.OpEq(null,$02)|hi.OpEq(null,$03)) 
   hi=new netrexx.lang.Rexx((byte)100);
  if (lo.OpGt(null,hi)) 
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse((hi.OpCcblank(null,lo)),$04,$2);
   lo=$2[0];hi=$2[1];} // make sure lo is < hi
  rg=new java.util.Random();
  tries=new netrexx.lang.Rexx((byte)0);
  guessThis=new netrexx.lang.Rexx(rg.nextInt(hi.OpSub(null,lo).toint())).OpAdd(null,lo);
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Rules:  Guess a number between").OpCcblank(null,lo)).OpCcblank(null,$05)).OpCcblank(null,hi));
  netrexx.lang.RexxIO.Say("        Use QUIT or . to stop the game");
  netrexx.lang.RexxIO.Say("        Use TELL to get the game to tell you the answer.");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Starting...");
  netrexx.lang.RexxIO.Say("");
  
  {g_:for(;;){
   netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Try guessing a number between").OpCcblank(null,lo)).OpCcblank(null,$05)).OpCcblank(null,hi));
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$04,$3);
   guess=$3[0];}
   {/*select*/
   if (netrexx.lang.Rexx.toRexx("QUIT").abbrev(guess.upper(),new netrexx.lang.Rexx((byte)1)).OpOr(null,new netrexx.lang.Rexx(guess.OpEq(null,$03))))
    {
     netrexx.lang.RexxIO.Say("You asked to leave the game.  Goodbye...");
     break g_;
    }
   else if (netrexx.lang.Rexx.toRexx("TELL").abbrev(guess.upper(),new netrexx.lang.Rexx((byte)1)).OpOr(null,new netrexx.lang.Rexx(guess.OpEq(null,$03))))
    {
     netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("The number you were looking for is").OpCcblank(null,guessThis));
    }
   else if ((guess.datatype(new netrexx.lang.Rexx('w'))).OpNot(null))
    {
     netrexx.lang.RexxIO.Say(guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not a whole number.  Try again.")));
    }
   else if (guess.OpEq(null,guessThis))
    {
     tries=tries.OpAdd(null,$06);
     netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Well guessed!").OpCcblank(null,guess)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is the correct number.")));
     netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("It took you").OpCcblank(null,tries)).OpCcblank(null,$07));
     break g_;
    }
   else if (guess.OpLt(null,lo))
    {
     tries=tries.OpAdd(null,$06);
     netrexx.lang.RexxIO.Say((guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is below the lower limit of"))).OpCcblank(null,lo));
    }
   else if (guess.OpGt(null,hi))
    {
     tries=tries.OpAdd(null,$06);
     netrexx.lang.RexxIO.Say((guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is above the upper limit of"))).OpCcblank(null,hi));
    }
   else if (guess.OpLt(null,guessThis))
    {
     tries=tries.OpAdd(null,$06);
     netrexx.lang.RexxIO.Say(guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is too low. Try again.")));
    }
   else if (guess.OpGt(null,guessThis))
    {
     tries=tries.OpAdd(null,$06);
     netrexx.lang.RexxIO.Say(guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is too high. Try again.")));
    }
   else{
    {
     netrexx.lang.RexxIO.Say(guess.OpCcblank(null,netrexx.lang.Rexx.toRexx("is an unexpected value.")));
    }
   }
   }
   }
  }/*g_*/
  
  return;
  }
 
 private RGuessTheNumberFeedback(){return;}
 }
