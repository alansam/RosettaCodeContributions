/* Generated from 'RUserInputGraphical.nrx' 12 Mar 2013 20:29:48 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RUserInputGraphical{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("1.0");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Number:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx(", String:");
 private static final java.lang.String $0="RUserInputGraphical.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx unumber;
  netrexx.lang.Rexx ustring;
  java.lang.Exception ex=null;
  unumber=new netrexx.lang.Rexx((byte)0);
  ustring=netrexx.lang.Rexx.toRexx("");
  
  {try{
   unumber=new netrexx.lang.Rexx(java.lang.Integer.parseInt(javax.swing.JOptionPane.showInputDialog((java.lang.Object)("Enter an Integer"))));
   ustring=netrexx.lang.Rexx.toRexx(javax.swing.JOptionPane.showInputDialog((java.lang.Object)("Enter a String")));
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  
  unumber=unumber.OpMult(null,$01); // just to prove unumber is really a number
  netrexx.lang.RexxIO.Say((($02.OpCcblank(null,unumber.right(new netrexx.lang.Rexx((byte)10)))).OpCc(null,$03)).OpCcblank(null,ustring));
  
  return;
  }
 
 private RUserInputGraphical(){return;}
 }
