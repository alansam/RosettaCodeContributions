/* Generated from 'R100d01.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class R100d01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("Door Nr.");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("is");
 private static final java.lang.String $0="R100d01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx True;
  netrexx.lang.Rexx False;
  netrexx.lang.Rexx doors;
  int i_=0;
  int j_=0;
  int d_=0;
  java.lang.String state=null;
  True=new netrexx.lang.Rexx(1==1);
  False=new netrexx.lang.Rexx(True.OpNot(null));
  
  doors=False;
  
  {i_=1;i_:for(;i_<=100;i_++){
   {j_=1;j_:for(;j_<=100;j_++){
    if (0==((j_%i_))) 
     doors.getnode(new netrexx.lang.Rexx(j_)).leaf=new netrexx.lang.Rexx((doors.getnode(new netrexx.lang.Rexx(j_)).leaf).OpNot(null));
    }
   }/*j_*/
   }
  }/*i_*/
  
  {d_=1;d_:for(;d_<=100;d_++){
   if ((doors.getnode(new netrexx.lang.Rexx(d_)).leaf).toboolean()) 
    state="open";
   else 
    state="closed";
   
   netrexx.lang.RexxIO.Say((($01.OpCcblank(null,(new netrexx.lang.Rexx(d_)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(state)));
   }
  }/*d_*/
  return;}
 
 private R100d01(){return;}
 }
