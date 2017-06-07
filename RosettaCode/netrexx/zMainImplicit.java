/* Generated from 'zMainImplicit.nrx' 18 May 2013 18:24:33 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Trace2 Verbose3 */

/* NetRexx */


public class zMainImplicit{
 private static final char[] $01={1,10,1,0,0};
 private static final java.lang.String $0="zMainImplicit.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx aaa=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  aaa=$1[0];}
  netrexx.lang.RexxIO.Say(aaa);
  return;
  }
 
 private zMainImplicit(){return;}
 }
