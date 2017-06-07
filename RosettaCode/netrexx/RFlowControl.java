/* Generated from 'RFlowControl.nrx' 27 Jan 2013 12:02:39 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*
NetRexx doesn't have a <tt>GOTO</tt> instruction and unlike [[Rexx|#REXX]] the <tt>SIGNAL</tt>
instruction is only used to throw exceptions.

Like [[Rexx|#REXX]] however, NetRexx provides the <tt>LEAVE</tt> and <tt>ITERATE</tt> instructions.

===LEAVE===
The <tt>LEAVE</tt> instruction causes immediate exit from one or more <tt>DO</tt>, <tt>SELECT</tt> or <tt>LOOP</tt>
constructs.
 */


public class RFlowControl{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx((byte)9);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx((byte)3);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx(" \000");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(1000);
 private static final java.lang.String $0="RFlowControl.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx xx=null;
  netrexx.lang.Rexx yy=null;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx vv=null;
  netrexx.lang.Rexx fff=null;
  {xx=new netrexx.lang.Rexx((byte)1);xx:for(;xx.OpLtEq(null,$01);xx=xx.OpAdd(null,new netrexx.lang.Rexx(1))){
   if (xx.OpEq(null,$02)) 
    break xx; // loop terminated by leave
   netrexx.lang.RexxIO.Say("unreachable");
   }
  }/*xx*/
  
  /*
  A ''<tt>name</tt>'' parameter can be provided to direct <tt>LEAVE</tt> to a specific end of block
  (as defined by a <tt>LABEL</tt> option or in the case of a controlled <tt>LOOP</tt> the
  control variable of the loop.
   */
  
  {xx=new netrexx.lang.Rexx((byte)1);xx:for(;xx.OpLtEq(null,$01);xx=xx.OpAdd(null,new netrexx.lang.Rexx(1))){ // xx is the control variable
   netrexx.lang.RexxIO.Say(xx);
   {yy=new netrexx.lang.Rexx((byte)1);yy:for(;yy.OpLtEq(null,$01);yy=yy.OpAdd(null,new netrexx.lang.Rexx(1))){ // yy is the control variable
    if (yy.OpEq(null,$03)) 
     break xx; // xx loop terminated by leave
    if (yy.OpEq(null,$04)) 
     break yy; // yy loop terminated by leave
    netrexx.lang.RexxIO.Say(xx.OpMult(null,$05).OpAdd(null,yy));
    }
   }/*yy*/
   }
  }/*xx*/
  
  {xx=new netrexx.lang.Rexx((byte)1);xlabel:for(;xx.OpLtEq(null,$01);xx=xx.OpAdd(null,new netrexx.lang.Rexx(1))){ // xx is still the control variable but LABEL takes precidence
   netrexx.lang.RexxIO.Say(xx);
   {yy=new netrexx.lang.Rexx((byte)1);yy:for(;yy.OpLtEq(null,$01);yy=yy.OpAdd(null,new netrexx.lang.Rexx(1))){ // yy is the control variable
    if (yy.OpEq(null,$03)) 
     break xlabel; // xx loop terminated by leave
    netrexx.lang.RexxIO.Say(xx.OpMult(null,$05).OpAdd(null,yy));
    }
   }/*yy*/
   }
  }/*xlabel*/
  
  {try{FINIS:do{
   netrexx.lang.RexxIO.Say("in do block");
   if ((1==1)) 
    break FINIS;
   netrexx.lang.RexxIO.Say("unreachable");
   throw new java.lang.Exception("Will never happen");
  }while(false);}
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }
  finally{
   netrexx.lang.RexxIO.Say("out of do block");
  }}/*FINIS*/
  
  {netrexx.lang.Rexx[] $5=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('A'),new netrexx.lang.Rexx('B')};int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[$5.length];synchronized($5){for(;;){if($4==$3.length)break;$3[$4]=$5[$5.length-1-$4];$4++;}}vv:for(;;){if(--$4<0)break;vv=(netrexx.lang.Rexx)$3[$4];
   {selecting:do{/*select*/
   if (vv.OpEqS(null,new netrexx.lang.Rexx('A')))
    {
     netrexx.lang.RexxIO.Say("A selected");
     netrexx.lang.RexxIO.Say("...");
    }
   else if (vv.OpEqS(null,new netrexx.lang.Rexx('B')))
    {
     netrexx.lang.RexxIO.Say("B selected");
     if ((1==1)) 
      break selecting;
     netrexx.lang.RexxIO.Say("...");
    }
   else{
    {
     netrexx.lang.RexxIO.Say("nl selection");
     netrexx.lang.RexxIO.Say("...");
    }
   }
   }while(false);}/*selecting*/
   }
  }/*vv*/
  
  /*
  ===ITERATE===
  The <tt>ITERATE</tt> instruction alters flow of control within a <tt>LOOP</tt> construct.
  On encountering an <tt>ITERATE</tt> instruction, execution of the loop body is terminated
  and control is passed directly back to the top of the loop just as though the last clause
  in the body of the loop had been executed.
  
  As with <tt>LEAVE</tt> an optional ''<tt>NAME</tt>'' can be supplied to direct the instruction
  to a loop level outside the current level.
   */
  
  {fff=new netrexx.lang.Rexx((byte)0);fff:for(;fff.OpLtEq(null,$06);fff=fff.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say("");
   {xx=new netrexx.lang.Rexx((byte)1);xx:for(;xx.OpLtEq(null,$07);xx=xx.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(fff.OpCc(null,$08));
    if (fff.OpGt(null,$09)) 
     continue fff;
    netrexx.lang.RexxIO.Say((fff.OpMult(null,$010).OpAdd(null,xx)).right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0)));
    }
   }/*xx*/
   }
  }/*fff*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RFlowControl(){return;}
 }
