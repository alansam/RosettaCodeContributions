/* Generated from 'RUserInput_Text.nrx' 14 Jul 2011 07:53:01 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>User input/Text</h3>
 * <p>
 * In this task, the goal is to input a string and the integer 75000, from the text console.
 * </p>
 * <p>
 * See also: <a href="http://rosettacode.org/wiki/User_input/Graphical">User input/Graphical</a>
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/User_input/Text">rosettacode.org/wiki/User_input/Text</a>
 */


public class RUserInput_Text{
 private static final char[] $01={1,10,1,0,0};
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(75000);
 private static final java.lang.String $0="RUserInput_Text.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx text=null;
  netrexx.lang.Rexx num=null;
  netrexx.lang.RexxIO.Say("Enter a string:");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  text=$1[0];}
  netrexx.lang.RexxIO.Say("");
  
  {$3:for(;;){
   netrexx.lang.RexxIO.Say("Enter the number 75000:");
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$02,$2);
   num=$2[0];}
   
   if (num.OpNotEq(null,$03)) 
    {
     netrexx.lang.RexxIO.Say(" You aren\'t good at following instructions are you?");
    }
   else 
    {
     report(text,num);
     break $3;
    }
   }
  }
  
  return;
  }

 
 public static void report(netrexx.lang.Rexx text,netrexx.lang.Rexx num){
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  You entered string:").OpCcblank(null,text));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("          and number:").OpCcblank(null,num));
  return;
  }
 
 private RUserInput_Text(){return;}
 }
