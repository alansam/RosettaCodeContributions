/* Generated from 'RCaseSensitivity.nrx' 27 Jan 2013 14:31:29 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCaseSensitivity{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("and");
 private static final java.lang.String $0="RCaseSensitivity.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dog;
  dog=netrexx.lang.Rexx.toRexx("Benjamin");
  dog=netrexx.lang.Rexx.toRexx("Samba");
  dog=netrexx.lang.Rexx.toRexx("Bernie");
  
  if ((dog.OpEqS(null,dog)&dog.OpEqS(null,dog))&dog.OpEqS(null,dog)) 
   {
    netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("There is just one dog named").OpCcblank(null,dog)).OpCc(null,$01));
   }
  else 
   {
    netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx.toRexx("The three dogs are named").OpCcblank(null,dog)).OpCc(null,$02)).OpCcblank(null,dog)).OpCcblank(null,$03)).OpCcblank(null,dog)).OpCc(null,$01));
   }
  
  return;
  }
 
 private RCaseSensitivity(){return;}
 }
