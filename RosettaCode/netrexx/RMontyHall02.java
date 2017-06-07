/* Generated from 'RMontyHall02.nrx' 18 Dec 2013 20:09:41 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* 30.08.2013 Walter Pachl  translated from Java/REXX/PL/I
**********************************************************************/



public class RMontyHall02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1000000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx(" times.");
 private static final java.lang.String $0="RMontyHall02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx doors;
  netrexx.lang.Rexx switchWins;
  netrexx.lang.Rexx stayWins;
  netrexx.lang.Rexx shown;
  netrexx.lang.Rexx plays=null;
  netrexx.lang.Rexx r=null;
  netrexx.lang.Rexx choice=null;
  doors=create_doors();
  switchWins=new netrexx.lang.Rexx((byte)0);
  stayWins=new netrexx.lang.Rexx((byte)0);
  shown=new netrexx.lang.Rexx((byte)0);
  {plays=new netrexx.lang.Rexx((byte)1);plays:for(;plays.OpLtEq(null,$01);plays=plays.OpAdd(null,new netrexx.lang.Rexx(1))){
   doors=new netrexx.lang.Rexx((byte)0);
   r=r3();
   doors.getnode(r).leaf=new netrexx.lang.Rexx((byte)1);
   choice=r3();
   {boolean $1=true;for(;;){if($1){$1=false;}else{if(shown.OpNotEq(null,choice)&(doors.getnode(shown).leaf).OpEq(null,$02))break;}
    shown=r3();
    }
   }
   if ((doors.getnode(choice).leaf).OpEq(null,$03)) 
    stayWins=stayWins.OpAdd(null,$03);
   else 
    switchWins=switchWins.OpAdd(null,$03);
   }
  }/*plays*/
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Switching wins ").OpCcblank(null,switchWins)).OpCcblank(null,$04));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Staying wins   ").OpCcblank(null,stayWins)).OpCcblank(null,$04));
  return;}

 
 public static netrexx.lang.Rexx create_doors(){
  netrexx.lang.Rexx doors;
  doors=netrexx.lang.Rexx.toRexx("");
  doors.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  doors.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)0);
  doors.getnode(new netrexx.lang.Rexx((byte)2)).leaf=new netrexx.lang.Rexx((byte)0);
  return doors;
  }

 
 public static netrexx.lang.Rexx r3(){
  java.util.Random rand;
  rand=new java.util.Random();
  return new netrexx.lang.Rexx(rand.nextInt(3)).OpAdd(null,$03);
  }
 
 private RMontyHall02(){return;}
 }/*
Output
Switching wins  667335  times.
Staying wins    332665  times.   
*/

