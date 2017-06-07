/* Generated from 'RUserInputText.nrx' 3 Oct 2012 19:29:44 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RUserInputText{
 private static final char[] $01={1,10,1,0,0};
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("is not");
 private static final java.lang.String $0="RUserInputText.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx checkVal;
  netrexx.lang.Rexx inString=null;
  netrexx.lang.Rexx inNumber=null;
  checkVal=new netrexx.lang.Rexx(75000);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input a string then the number").OpCcblank(null,checkVal));
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  inString=$1[0];}
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$02,$2);
  inNumber=$2[0];}
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input string:").OpCcblank(null,inString));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input number:").OpCcblank(null,inNumber));
  if (inNumber.OpEqS(null,checkVal)) 
   {
    netrexx.lang.RexxIO.Say("Success!  Input number is as requested");
   }
  else 
   {
    netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("Failure!  Number").OpCcblank(null,inNumber)).OpCcblank(null,$03)).OpCcblank(null,checkVal));
   }
  return;
  }
 
 private RUserInputText(){return;}
 }
