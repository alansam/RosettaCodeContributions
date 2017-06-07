/* Generated from 'RJumps01.nrx' 12 Dec 2012 11:07:05 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RJumps01{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("Selected");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx(">>>");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(6);
 private static final java.lang.String $0="RJumps01.nrx";

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx arg1=null;
  netrexx.lang.Rexx arg2=null;
  netrexx.lang.Rexx otherargs=null;
  RJumps01.CrashBang ex=null;
  
  arg=new netrexx.lang.Rexx(args);
  
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  arg1=$1[0];arg2=$1[1];otherargs=$1[2];}
  if (arg1.OpEq(null,$02)) 
   arg1=netrexx.lang.Rexx.toRexx("");
  if (arg2.OpEq(null,$02)) 
   arg2=netrexx.lang.Rexx.toRexx("");
  jumpingDO(arg1,arg2,otherargs);
  jumpingSELECT(arg1,arg2,otherargs);
  jumpingLOOP(arg1,arg2,otherargs);
  {try{
   netrexx.lang.RexxIO.Say("Signalling");
   jumpingSIGNAL(arg1,arg2,otherargs);
  }
  catch (RJumps01.CrashBang $2){ex=$2;
   ex.printStackTrace();
  }
  finally{
   netrexx.lang.RexxIO.Say("Done signalling");
  }}
  
  return;
  }

 
 private static void jumpingSIGNAL(netrexx.lang.Rexx arg1,netrexx.lang.Rexx arg2,netrexx.lang.Rexx otherargs) throws RJumps01.CrashBang{
  
  netrexx.lang.RexxIO.Say("Starting");
  if (otherargs.OpEq(null,$03)) 
   throw new RJumps01.CrashBang("Gronk!");
  netrexx.lang.RexxIO.Say("Success");
  netrexx.lang.RexxIO.Say(otherargs);
  
  return;
  }

 
 private static void jumpingDO(netrexx.lang.Rexx arg1,netrexx.lang.Rexx arg2,netrexx.lang.Rexx otherargs){
  RJumps01.CrashBang ex=null;
  
  {try{outaHere:do{
   netrexx.lang.RexxIO.Say("Starting");
   {proc:do{
    netrexx.lang.RexxIO.Say(arg1);
    netrexx.lang.RexxIO.Say(arg2);
    if (arg2.OpEq(null,$03)) 
     break proc;
    if (otherargs.OpEq(null,$03)) 
     throw new RJumps01.CrashBang("Gronk!");
    netrexx.lang.RexxIO.Say(otherargs);
   }while(false);}/*proc*/
   netrexx.lang.RexxIO.Say("Success");
  }while(false);}
  catch (RJumps01.CrashBang $3){ex=$3;
   ex.printStackTrace();
  }
  finally{
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say("Ending");
  }}/*outaHere*/
  
  return;
  }

 
 private static void jumpingSELECT(netrexx.lang.Rexx arg1,netrexx.lang.Rexx arg2,netrexx.lang.Rexx otherargs){
  
  {try{outaHere:do{/*select*/
  if (arg1.OpNotEq(null,$03))
   {
    netrexx.lang.RexxIO.Say(($04.OpCcblank(null,arg1)).OpCcblank(null,arg1.length()));
    if ((arg1.length()).OpEq(null,$05)) 
     break outaHere;
    netrexx.lang.RexxIO.Say($06.OpCcblank(null,arg1.length()));
   }
  else if (arg2.OpNotEq(null,$03))
   {
    netrexx.lang.RexxIO.Say($04.OpCcblank(null,arg1));
    if ((arg2.length()).OpEq(null,$05)) 
     break outaHere;
    netrexx.lang.RexxIO.Say($06.OpCcblank(null,arg2.length()));
   }
  else{
   netrexx.lang.RexxIO.Say("nothing selected");
  }
  }while(false);}
  finally{
   netrexx.lang.RexxIO.Say("Done selecting");
  }}/*outaHere*/
  
  return;
  }

 
 private static void jumpingLOOP(netrexx.lang.Rexx arg1,netrexx.lang.Rexx arg2,netrexx.lang.Rexx otherargs){
  netrexx.lang.Rexx outaHere=null;
  
  netrexx.lang.RexxIO.Say("Looping");
  {try{int $4=$07.OpPlus(null).toint();outaHere=new netrexx.lang.Rexx((byte)1);outaHere:for(;$4>0;$4--,outaHere=outaHere.OpAdd(null,new netrexx.lang.Rexx(1))){
   if (outaHere.OpGt(null,$08)&outaHere.OpLtEq(null,$09)) 
    continue outaHere;
   netrexx.lang.RexxIO.Say(outaHere);
   if (outaHere.OpGt(null,$010)) 
    break outaHere;
   }
  }
  finally{
   netrexx.lang.RexxIO.Say("Done looping");
  }}/*outaHere*/
  
  return;
  }
 
 private RJumps01(){return;}

 
 static class CrashBang extends java.lang.Exception{
  private final transient java.lang.String $0="RJumps01.nrx";

  
  public CrashBang(java.lang.String message){
   super(message);
   return;
   }
 }}
