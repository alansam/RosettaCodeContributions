/* Generated from 'RIntrospection.nrx' 23 Aug 2013 01:27:06 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RIntrospection{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("NetRexx 3.02 25 Jun 2013");
 private static final char[] $04={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("version");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RIntrospection.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx minVersion=null;
  netrexx.lang.Rexx lang=null;
  netrexx.lang.Rexx ver=null;
  netrexx.lang.Rexx bdate=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  minVersion=$1[0];}
  if (minVersion.OpEq(null,$02)) 
   minVersion=new netrexx.lang.Rexx("2.0");
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse($03,$04,$2);
  lang=$2[0];ver=$2[1];bdate=$2[2];}
  if (ver.OpLt(null,minVersion)) 
   {
    netrexx.lang.RexxIO.Say((((((((lang.OpCcblank(null,$05)).OpCcblank(null,ver)).OpCcblank(null,netrexx.lang.Rexx.toRexx("[Build date:"))).OpCcblank(null,bdate)).OpCc(null,$06)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is less than"))).OpCcblank(null,minVersion.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2)))).OpCc(null,netrexx.lang.Rexx.toRexx("; exiting...")));
    
    
    
    {System.exit(0);return;}
   }
  else 
   {
    netrexx.lang.RexxIO.Say(((((((lang.OpCcblank(null,$05)).OpCcblank(null,ver)).OpCcblank(null,netrexx.lang.Rexx.toRexx("[Build date:"))).OpCcblank(null,bdate)).OpCc(null,$06)).OpCcblank(null,netrexx.lang.Rexx.toRexx("meets minimum requirements of"))).OpCcblank(null,minVersion.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2))));
   
   
   
   }
  return;
  }
 
 private RIntrospection(){return;}
 }
