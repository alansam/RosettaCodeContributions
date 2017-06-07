/* Generated from 'zMainExplicit.nrx' 18 May 2013 18:20:52 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Trace2 Verbose3 */

/* NetRexx */



public class zMainExplicit{
 private static final char[] $01={1,10,1,0,0};
 private static final java.lang.String $0="zMainExplicit.nrx";
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx aaa=null;
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  aaa=$1[0];}
  netrexx.lang.RexxIO.Say(aaa);
  return;
  }
 
 private zMainExplicit(){return;}
 }
