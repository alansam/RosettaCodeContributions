/* Generated from 'RArray01.nrx' 15 Jul 2011 12:10:41 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RArray01{
 private static final java.lang.String $0="RArray01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx cymru;
  netrexx.lang.Rexx c_=null;
  cymru=netrexx.lang.Rexx.toRexx("");
  cymru.getnode(netrexx.lang.Rexx.toRexx("ogof1")).leaf=netrexx.lang.Rexx.toRexx("Ogof Ffynnon Ddu");
  cymru.getnode(netrexx.lang.Rexx.toRexx("ogof2")).leaf=netrexx.lang.Rexx.toRexx("Ogof Draenen");
  
  {int $3=0;java.util.Vector $2=new java.util.Vector(100,0);synchronized(cymru){java.util.Enumeration $1=cymru.keys();for(;;){if(!$1.hasMoreElements())break;$2.addElement($1.nextElement());if(!cymru.testnode((netrexx.lang.Rexx)($2.elementAt($3)))){$2.removeElementAt($3);continue;}$3++;}}c_:for(;;){if(--$3<0)break;c_=(netrexx.lang.Rexx)$2.elementAt($3);
   netrexx.lang.RexxIO.Say(c_.OpCcblank(null,cymru.getnode(c_).leaf));
   }
  }/*c_*/
  return;}
 
 private RArray01(){return;}
 }
