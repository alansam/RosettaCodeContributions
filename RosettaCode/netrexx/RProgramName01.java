/* Generated from 'RProgramName01.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RProgramName01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("Java method RProgramName01.nrx");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RProgramName01.nrx";

 
 
 public RProgramName01(){super();
  netrexx.lang.Rexx pgmName=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  pgmName=$1[0];}
  netrexx.lang.RexxIO.Say($03.OpCcblank(null,pgmName));
  return;
  }

 
 private void getSource(){
  netrexx.lang.Rexx pgmName=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$2);
  pgmName=$2[0];}
  netrexx.lang.RexxIO.Say($04.OpCcblank(null,pgmName));
  return;
  }

 
 public static final void main(java.lang.String args[]){
  netrexx.lang.Rexx pgmName=null;
  RProgramName01 lcl;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$3);
  pgmName=$3[0];}
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,pgmName));
  
  lcl=new RProgramName01();
  lcl.getSource();
  
  return;
  }
 }
