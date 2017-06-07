/* Generated from 'RCommaQuibbling.nrx' 23 Oct 2013 20:31:45 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCommaQuibbling{
 private static final char[] $01={2,1,91,2,1,93,10,1,0,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('{');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('}');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RCommaQuibbling.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx quibble(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx lst=null;
  netrexx.lang.Rexx lc;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  lst=$1[0];}
  lst=lst.changestr(new netrexx.lang.Rexx('\"'),netrexx.lang.Rexx.toRexx("")).space(new netrexx.lang.Rexx((byte)1));
  lc=lst.lastpos(new netrexx.lang.Rexx(','));
  if (lc.OpGt(null,$02)) 
   lst=lst.insert(netrexx.lang.Rexx.toRexx("and"),lc).overlay(new netrexx.lang.Rexx(' '),lc);
  return ($03.OpCc(null,lst)).OpCc(null,$04);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx lists[];
  netrexx.lang.Rexx lst=null;
  lists=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("[]"),netrexx.lang.Rexx.toRexx("[\"ABC\"]"),netrexx.lang.Rexx.toRexx("[\"ABC\", \"DEF\"]"),netrexx.lang.Rexx.toRexx("[\"ABC\", \"DEF\", \"G\", \"H\"]")}; // {}
  // {ABC}
  // {ABC and DEF}
  // {ABC, DEF, G and H}
  {int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[lists.length];synchronized(lists){for(;;){if($4==$3.length)break;$3[$4]=lists[lists.length-1-$4];$4++;}}lst:for(;;){if(--$4<0)break;lst=(netrexx.lang.Rexx)$3[$4];
   netrexx.lang.RexxIO.Say(((lst.right(new netrexx.lang.Rexx((byte)30))).OpCcblank(null,$05)).OpCcblank(null,quibble(lst)));
   }
  }/*lst*/
  return;
  }
 
 private RCommaQuibbling(){return;}
 }
