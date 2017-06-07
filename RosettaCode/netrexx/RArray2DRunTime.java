/* Generated from 'RArray2DRunTime.nrx' 5 Aug 2012 11:46:44 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RArray2DRunTime{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("arry[");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("]:");
 private static final java.lang.String $0="RArray2DRunTime.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx xDim=null;
  netrexx.lang.Rexx yDim=null;
  netrexx.lang.Rexx xPos;
  netrexx.lang.Rexx yPos;
  netrexx.lang.Rexx arry[][];
  netrexx.lang.RexxIO.Say("give me the X and Y dimensions as two positive integers:");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  xDim=$1[0];yDim=$1[1];}
  xPos=xDim.OpDivI(null,$02); // integer divide to get close to the middle of the array
  yPos=yDim.OpDivI(null,$02);
  
  arry=new netrexx.lang.Rexx[xDim.toint()][yDim.toint()];
  arry[xPos.toint()][yPos.toint()]=xDim.OpDiv(null,yDim); // make up a value...
  netrexx.lang.RexxIO.Say((((($03.OpCc(null,xPos)).OpCc(null,$04)).OpCc(null,yPos)).OpCc(null,$05)).OpCcblank(null,arry[xPos.toint()][yPos.toint()]));
  return;
  }
 
 private RArray2DRunTime(){return;}
 }
