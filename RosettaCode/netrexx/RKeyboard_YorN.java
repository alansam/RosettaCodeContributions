/* Generated from 'RKeyboard_YorN.nrx' 6 Nov 2015 23:34:17 [v3.04] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RKeyboard_YorN{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('Y');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('N');
 private static final java.lang.String $0="RKeyboard_YorN.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx c=null;
  netrexx.lang.RexxIO.Say("Please enter Y or N");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  c=$1[0];}
  {/*select*/
  if (c.OpEq(null,$02))
   netrexx.lang.RexxIO.Say("YES");
  else if (c.OpEq(null,$03))
   netrexx.lang.RexxIO.Say("NO");
  else{
   netrexx.lang.RexxIO.Say("Undecided");
  }
  }
  return;}
 
 private RKeyboard_YorN(){return;}
 }
