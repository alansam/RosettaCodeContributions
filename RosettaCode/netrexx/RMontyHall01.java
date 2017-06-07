/* Generated from 'RMontyHall01.nrx' 18 Dec 2013 20:33:55 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* 30.08.2013 Walter Pachl  translated from Java/REXX/PL/I
**********************************************************************/



public class RMontyHall01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1000000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final char[] $04={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final char[] $06={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("Run");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("times.");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('%');
 private static final java.lang.String $0="RMontyHall01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx monty_hall(){
  netrexx.lang.Rexx doors;
  netrexx.lang.Rexx switchWins;
  netrexx.lang.Rexx stayWins;
  netrexx.lang.Rexx shown;
  netrexx.lang.Rexx r=null;
  netrexx.lang.Rexx choice=null;
  doors=create_doors();
  switchWins=new netrexx.lang.Rexx((byte)0);
  stayWins=new netrexx.lang.Rexx((byte)0);
  shown=new netrexx.lang.Rexx((byte)0);
  //Loop plays = 1 To 1000000
  {int $1=$01.OpPlus(null).toint();plays:for(;$1>0;$1--){
   doors=new netrexx.lang.Rexx((byte)0);
   r=r3();
   doors.getnode(r).leaf=new netrexx.lang.Rexx((byte)1);
   choice=r3();
   {boolean $2=true;for(;;){if($2){$2=false;}else{if(shown.OpNotEq(null,choice)&(doors.getnode(shown).leaf).OpEq(null,$02))break;}
    shown=r3();
    }
   }
   if ((doors.getnode(choice).leaf).OpEq(null,$03)) 
    {
     stayWins=stayWins.OpAdd(null,$03);
    }
   else 
    {
     switchWins=switchWins.OpAdd(null,$03);
    }
   }
  }/*plays*/
  return switchWins.OpCcblank(null,stayWins);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx create_doors(){
  netrexx.lang.Rexx doors;
  doors=netrexx.lang.Rexx.toRexx("");
  doors.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  doors.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)0);
  doors.getnode(new netrexx.lang.Rexx((byte)2)).leaf=new netrexx.lang.Rexx((byte)0);
  return doors;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx r3(){
  java.util.Random rand;
  rand=new java.util.Random();
  return new netrexx.lang.Rexx(rand.nextInt(3)).OpAdd(null,$03);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx runs=null;
  netrexx.lang.Rexx switchTotal;
  netrexx.lang.Rexx stayTotal;
  netrexx.lang.Rexx runTotal;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx switchWins=null;
  netrexx.lang.Rexx stayWins=null;
  netrexx.lang.Rexx countWins=null;
  netrexx.lang.Rexx switchPct=null;
  netrexx.lang.Rexx stayPct=null;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$04,$3);
  runs=$3[0];}
  if (runs.OpEq(null,$05)) 
   runs=new netrexx.lang.Rexx((byte)1);
  switchTotal=new netrexx.lang.Rexx((byte)0);
  stayTotal=new netrexx.lang.Rexx((byte)0);
  runTotal=new netrexx.lang.Rexx((byte)0);
  {int $4=runs.OpPlus(null).toint();r_=new netrexx.lang.Rexx((byte)1);r_:for(;$4>0;$4--,r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(monty_hall(),$06,$5);
   switchWins=$5[0];stayWins=$5[1];}
   countWins=switchWins.OpAdd(null,stayWins);
   switchTotal=switchTotal.OpAdd(null,switchWins);
   stayTotal=stayTotal.OpAdd(null,stayWins);
   runTotal=runTotal.OpAdd(null,countWins);
   switchPct=(switchWins.OpDiv(null,countWins).OpMult(null,$07)).format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3));
   stayPct=(stayWins.OpDiv(null,countWins).OpMult(null,$07)).format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3));
   netrexx.lang.RexxIO.Say(($08.OpCcblank(null,r_)).OpCc(null,$09));
   netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  Switching wins").OpCcblank(null,switchWins.format(new netrexx.lang.Rexx((byte)8)))).OpCcblank(null,$010)).OpCcblank(null,switchPct)).OpCc(null,$011));
   netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  Staying wins  ").OpCcblank(null,stayWins.format(new netrexx.lang.Rexx((byte)8)))).OpCcblank(null,$010)).OpCcblank(null,stayPct)).OpCc(null,$011));
   netrexx.lang.RexxIO.Say("");
   }
  }/*r_*/
  if (runs.OpGt(null,$03)) 
   {
    switchPct=(switchTotal.OpDiv(null,runTotal).OpMult(null,$07)).format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3));
    stayPct=(stayTotal.OpDiv(null,runTotal).OpMult(null,$07)).format(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Average switching wins count:").OpCcblank(null,(switchTotal.format(new netrexx.lang.Rexx((byte)8))).OpDivI(null,runs))).OpCcblank(null,$09)).OpCcblank(null,switchPct)).OpCc(null,$011));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Average staying wins count:  ").OpCcblank(null,(stayTotal.format(new netrexx.lang.Rexx((byte)8))).OpDivI(null,runs))).OpCcblank(null,$09)).OpCcblank(null,stayPct)).OpCc(null,$011));
    netrexx.lang.RexxIO.Say("");
   }
  return;
  }
 
 private RMontyHall01(){return;}
 }
