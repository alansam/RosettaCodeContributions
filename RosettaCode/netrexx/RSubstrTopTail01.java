/* Generated from 'RSubstrTopTail01.nrx' 2 Aug 2013 12:46:57 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSubstrTopTail01{
 private static final char[] $01={1,10,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RSubstrTopTail01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx z=null;
  netrexx.lang.Rexx l;
  
  /* *********************************************************************
   * 02.08.2013 Walter Pachl  translated from REXX
   * *********************************************************************/
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  z=$1[0];}
  if (z.OpEq(null,$02)) 
   z=netrexx.lang.Rexx.toRexx("abcdefghijk");
  l=z.length();
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("                  the original string =").OpCcblank(null,z));
  if (l.OpGtEq(null,$03)) 
   {
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("string first        character removed =").OpCcblank(null,z.substr(new netrexx.lang.Rexx((byte)2))));
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("string         last character removed =").OpCcblank(null,z.left(l.OpSub(null,$03))));
   }
  if (l.OpGtEq(null,$04)) 
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("string first & last character removed =").OpCcblank(null,z.substr(new netrexx.lang.Rexx((byte)2),l.OpSub(null,$04))));
  
  return;
  }
 
 private RSubstrTopTail01(){return;}
 }
