/* Generated from 'RStringInterp.nrx' 22 Aug 2011 16:57:06 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */







public class RStringInterp{
 private static final java.lang.String $0="RStringInterp.nrx";
 
 public static void main(java.lang.String $0s[]){
  useBif();
  useMessageFormat();
  
  return;
  }

 
 public static void useBif(){
  netrexx.lang.Rexx st;
  netrexx.lang.Rexx si;
  
  st=netrexx.lang.Rexx.toRexx("Mary had a %1$ lamb.");
  si=netrexx.lang.Rexx.toRexx("little");
  
  netrexx.lang.RexxIO.Say(st.changestr(netrexx.lang.Rexx.toRexx("%1$"),si));
  
  return;
  }

 
 public static void useMessageFormat(){
  java.lang.StringBuffer result;
  java.lang.Object args;
  java.text.MessageFormat msgfmt;
  
  result=new java.lang.StringBuffer("");
  
  args=(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new java.lang.Integer(7)),(java.lang.Object)(new java.util.Date()),(java.lang.Object)netrexx.lang.Rexx.toRexx("a disturbance in the Force")});
  
  
  
  
  msgfmt=new java.text.MessageFormat("At {1, time} on {1, date}, there was {2} on planet {0, number, integer}.");
  result=msgfmt.format(args,result,new java.text.FieldPosition(0));
  netrexx.lang.RexxIO.Say(result);
  
  return;
  }
 
 private RStringInterp(){return;}
 }
