/* Generated from 'RTowersOfHanoi00.nrx' 29 Mar 2013 20:27:06 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RTowersOfHanoi00{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("Solved in");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("moves.");
 private static final java.lang.String $0="RTowersOfHanoi00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx discs=null;
  netrexx.lang.Rexx moves;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  discs=$1[0];}
  if ((discs.OpEq(null,$02)||(discs.datatype(new netrexx.lang.Rexx('w'))).OpNot(null))||discs.OpLt(null,$03)) 
   discs=new netrexx.lang.Rexx((byte)4);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Minimum moves to solution:").OpCcblank(null,$04.OpPow(null,discs).OpSub(null,$03)));
  moves=move(discs.toint());
  netrexx.lang.RexxIO.Say(($05.OpCcblank(null,moves)).OpCcblank(null,$06));
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx move(){
  return move(4,1,2,3,0);
  }
 public static netrexx.lang.Rexx move(int discs){
  return move(discs,1,2,3,0);
  }
 public static netrexx.lang.Rexx move(int discs,int towerFrom){
  return move(discs,towerFrom,2,3,0);
  }
 public static netrexx.lang.Rexx move(int discs,int towerFrom,int towerTo){
  return move(discs,towerFrom,towerTo,3,0);
  }
 public static netrexx.lang.Rexx move(int discs,int towerFrom,int towerTo,int towerVia){
  return move(discs,towerFrom,towerTo,towerVia,0);
  }
 public static netrexx.lang.Rexx move(int discs,int towerFrom,int towerTo,int towerVia,int moves){
  if (discs==1) 
   {
    moves++;
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Move disc from peg"+" "+towerFrom+" "+"to peg"+" "+towerTo+" "+"- Move No:").OpCcblank(null,(new netrexx.lang.Rexx(moves)).right(new netrexx.lang.Rexx((byte)5))));
   }
  else 
   {
    moves=(move(discs-1,towerFrom,towerVia,towerTo,moves)).toint();
    moves=(move(1,towerFrom,towerTo,towerVia,moves)).toint();
    moves=(move(discs-1,towerVia,towerTo,towerFrom,moves)).toint();
   }
  return new netrexx.lang.Rexx(moves);
  }
 
 private RTowersOfHanoi00(){return;}
 }
