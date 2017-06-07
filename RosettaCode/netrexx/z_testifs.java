/* Generated from 'z_testifs.nrx' 20 Jul 2012 18:22:49 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */
/* binary */


public class z_testifs{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="z_testifs.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx v1=null;
  netrexx.lang.Rexx v2;
  v2=netrexx.lang.Rexx.toRexx("");
  
  if ((v1==null)||v1.OpEq(null,$01)) 
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("null or \'\',").OpCcblank(null,show(v1)));
  if ((v2==null)||v2.OpEq(null,$01)) 
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("null or \'\',").OpCcblank(null,show(v2)));
  
  return;
  }

 
 private static final netrexx.lang.Rexx show(netrexx.lang.Rexx val){
  
  if (val==null) 
   val=netrexx.lang.Rexx.toRexx("null");
  return val;
  }
 
 private z_testifs(){return;}
 }
