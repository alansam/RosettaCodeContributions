/* Generated from 'RShortCircuitEval01.nrx' 24 Apr 2015 21:34:57 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RShortCircuitEval01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("NetRexx 3.03 11 Jun 2014");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Version=");
 private static final java.lang.String $0="RShortCircuitEval01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx v=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  v=$1[0];}
  netrexx.lang.RexxIO.Say($03.OpCc(null,v));
  
  if ((a())|(b())) 
   netrexx.lang.RexxIO.Say("a and b are true");
  if (new netrexx.lang.Rexx(a()).OpNot(null)|(b())) 
   netrexx.lang.RexxIO.Say("Surprise");
  else 
   netrexx.lang.RexxIO.Say("ok");
  
  if ((a())||(b())) 
   netrexx.lang.RexxIO.Say("a is true");
  if (new netrexx.lang.Rexx(a()).OpNot(null)||(b())) 
   netrexx.lang.RexxIO.Say("Surprise");
  else 
   netrexx.lang.RexxIO.Say("ok: \\a() is false");
  
  {/*select*/
  if (new netrexx.lang.Rexx(a()).OpNot(null)||(b()))
   netrexx.lang.RexxIO.Say("Surprise");
  else{
   netrexx.lang.RexxIO.Say("ok: \\a() is false (Select)");
  }
  }
  return;
  }

 
 private static boolean a(){
  boolean state;
  state=java.lang.Boolean.TRUE.booleanValue();
  netrexx.lang.RexxIO.Say("--a returns"+" "+(state?"1":"0"));
  return state;
  }

 
 private static boolean b(){
  boolean state;
  state=java.lang.Boolean.TRUE.booleanValue();
  netrexx.lang.RexxIO.Say("--b returns"+" "+(state?"1":"0"));
  return state;
  }
 
 private RShortCircuitEval01(){return;}
 }
