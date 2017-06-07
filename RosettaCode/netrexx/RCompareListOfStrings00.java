/* Generated from 'RCompareListOfStrings00.nrx' 30 Jun 2014 12:13:18 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* REXX ---------------------------------------------------------------
* 28.06.2014 Walter Pachl
*--------------------------------------------------------------------*/

public class RCompareListOfStrings00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("List");
 private static final java.lang.String $0="RCompareListOfStrings00.nrx";
 
 public static void main(java.lang.String $0s[]){
  test(netrexx.lang.Rexx.toRexx("ABC"),new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("BB"),netrexx.lang.Rexx.toRexx("CC")});
  test(netrexx.lang.Rexx.toRexx("AAA"),new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("AA")});
  test(netrexx.lang.Rexx.toRexx("ACB"),new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("CC"),netrexx.lang.Rexx.toRexx("BB")});
  return;
  }

 
 public static void test(netrexx.lang.Rexx name,netrexx.lang.Rexx list[]){
  boolean _true;
  boolean _false;
  boolean all_equal;
  boolean increasing;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx i1=null;
  _true=(1==1);
  _false=new netrexx.lang.Rexx(_true).OpNot(null);
  all_equal=_true;
  increasing=_true;
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(list.length).OpSub(null,$01);i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   i1=i.OpAdd(null,$02);
   {/*select*/
   if ((list[i1.toint()]).OpEqS(null,list[i.toint()]))
    increasing=_false;
   else if ((list[i1.toint()]).OpLtS(null,list[i.toint()]))
    {
     all_equal=_false;
     increasing=_false;
    }
   else if ((list[i1.toint()]).OpGtS(null,list[i.toint()]))
    all_equal=_false;
   
   else{throw new netrexx.lang.NoOtherwiseException();}
   }
   }
  }/*i*/
  {/*select*/
  if (all_equal)
   netrexx.lang.RexxIO.Say(($03.OpCcblank(null,name)).OpCc(null,netrexx.lang.Rexx.toRexx(": all elements are equal")));
  else if (increasing)
   netrexx.lang.RexxIO.Say(($03.OpCcblank(null,name)).OpCc(null,netrexx.lang.Rexx.toRexx(": elements are in increasing order")));
  else{
   netrexx.lang.RexxIO.Say(($03.OpCcblank(null,name)).OpCc(null,netrexx.lang.Rexx.toRexx(": neither equal nor in increasing order")));
  }
  }
  return;
  }
 
 private RCompareListOfStrings00(){return;}
 }
