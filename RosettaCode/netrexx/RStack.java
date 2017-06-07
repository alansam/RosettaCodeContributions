/* Generated from 'RStack.nrx' 14 Aug 2013 19:53:44 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* 13.08.2013 Walter Pachl  translated from REXX version 2
**********************************************************************/



public class RStack{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("from push");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("from peek");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("from pull");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RStack.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx stk;
  stk=create_stk();
  
  netrexx.lang.RexxIO.Say((push(stk,new netrexx.lang.Rexx((byte)123))).OpCcblank(null,$01));
  netrexx.lang.RexxIO.Say(empty(stk));
  netrexx.lang.RexxIO.Say((peek(stk)).OpCcblank(null,$02));
  netrexx.lang.RexxIO.Say((pull(stk)).OpCcblank(null,$03));
  netrexx.lang.RexxIO.Say(empty(stk));
  netrexx.lang.RexxIO.Say((pull(stk)).OpCcblank(null,$03));
  return;}

 
 public static netrexx.lang.Rexx create_stk(){
  netrexx.lang.Rexx stk;
  stk=netrexx.lang.Rexx.toRexx("");
  stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  return stk;
  }

 
 public static netrexx.lang.Rexx push(netrexx.lang.Rexx stk,netrexx.lang.Rexx v){
  stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$04);
  stk.getnode(stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf).leaf=v;
  return v;
  }

 
 public static netrexx.lang.Rexx peek(netrexx.lang.Rexx stk){
  netrexx.lang.Rexx x;
  x=stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
  if (x.OpEq(null,$05)) 
   return netrexx.lang.Rexx.toRexx("stk is empty");
  else 
   return stk.getnode(x).leaf;
  }

 
 public static netrexx.lang.Rexx pull(netrexx.lang.Rexx stk){
  netrexx.lang.Rexx x;
  x=stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
  if (x.OpEq(null,$05)) 
   return netrexx.lang.Rexx.toRexx("stk is empty");
  else 
   {
    stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpSub(null,$04);
    return stk.getnode(x).leaf;
   }
  }

 
 public static netrexx.lang.Rexx empty(netrexx.lang.Rexx stk){
  return new netrexx.lang.Rexx((stk.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpEq(null,$05));
  }
 
 private RStack(){return;}
 }
/*
Output:
123 from push

123 from peek
123 from pull

stk is empty from pull
*/
