/* Generated from 'RStringCompare.nrx' 24 Mar 2013 21:08:11 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RStringCompare{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("and");
 private static final java.lang.String $0="RStringCompare.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx pairs;
  netrexx.lang.Rexx tl=null;
  netrexx.lang.Rexx tr=null;
  netrexx.lang.Rexx tx=null;
  netrexx.lang.Rexx tu=null;
  netrexx.lang.Rexx tv=null;
  pairs=netrexx.lang.Rexx.toRexx("Ball Bell RED BLUE Red RED 00100 100");
  {for(;;){if(!(pairs.words()).OpGt(null,$01))break;
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(pairs,$02,$1);
   tl=$1[0];tr=$1[1];pairs=$1[2];}
   tx=tl;
   tu=tl.upper();
   tv=tl.lower();
   netrexx.lang.RexxIO.Say((((tl.OpCcblank(null,tr)).OpCcblank(null,tx)).OpCcblank(null,tu)).OpCcblank(null,tv));
   netrexx.lang.RexxIO.Say($03.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-')));
   if (tl.OpEq(null,tr)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tr)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are lexically equal")));
   if (tl.OpNotEq(null,tr)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tr)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not lexically equal")));
   if (tl.OpEqS(null,tr)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tr)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are identical")));
   if (tl.OpNotEqS(null,tr)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tr)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not identical")));
   netrexx.lang.RexxIO.Say("");
   
   if (tl.OpEq(null,tx)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tx)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are lexically equal")));
   if (tl.OpNotEq(null,tx)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tx)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not lexically equal")));
   if (tl.OpEqS(null,tx)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tx)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are identical")));
   if (tl.OpNotEqS(null,tx)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tx)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not identical")));
   netrexx.lang.RexxIO.Say("");
   
   if (tl.OpEq(null,tu)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tu)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are lexically equal")));
   if (tl.OpNotEq(null,tu)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tu)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not lexically equal")));
   if (tl.OpEqS(null,tu)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tu)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are identical")));
   if (tl.OpNotEqS(null,tu)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tu)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not identical")));
   netrexx.lang.RexxIO.Say("");
   
   if (tl.OpEq(null,tv)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tv)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are lexically equal")));
   if (tl.OpNotEq(null,tv)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tv)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not lexically equal")));
   if (tl.OpEqS(null,tv)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tv)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are identical")));
   if (tl.OpNotEqS(null,tv)) 
    netrexx.lang.RexxIO.Say(((tl.OpCcblank(null,$04)).OpCcblank(null,tv)).OpCcblank(null,netrexx.lang.Rexx.toRexx("are not identical")));
   netrexx.lang.RexxIO.Say("");
   }
  }
  return;
  }
 
 private RStringCompare(){return;}
 }
