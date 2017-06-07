/* Generated from 'RRPNCalc01.nrx' 9 Nov 2012 19:20:42 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RRPNCalc01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("]:");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final char[] $08={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("\t\000");
 private static final java.lang.String $0="RRPNCalc01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rpnDefaultExpression;
  netrexx.lang.Rexx EODAD;
  netrexx.lang.Rexx rpnString=null;
  netrexx.lang.Rexx rpnval=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  rpnDefaultExpression=netrexx.lang.Rexx.toRexx("3 4 2 * 1 5 - 2 3 ^ ^ / +");
  EODAD=netrexx.lang.Rexx.toRexx(".*");
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  rpnString=$2[0];}
  
  if (rpnString.OpEq($1,$03)) 
   rpnString=rpnDefaultExpression;
  if (rpnString.OpEq($1,$04)) 
   {
    netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Enter numbers or operators [to stop enter").OpCcblank($1,EODAD)).OpCc($1,$05));
    {rpnloop:for(;;){
     rpnval=netrexx.lang.RexxIO.Ask();
     if (rpnval.OpEqS($1,EODAD)) 
      break rpnloop;
     rpnString=rpnString.OpCcblank($1,rpnval);
     }
    }/*rpnloop*/
   }
  
  rpnString=rpnString.space(new netrexx.lang.Rexx((byte)1));
  netrexx.lang.RexxIO.Say((rpnString.OpCc($1,$06)).OpCcblank($1,evaluateRPN(rpnString)));
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static netrexx.lang.Rexx evaluateRPN(netrexx.lang.Rexx rpnString){
  java.util.LinkedList stack;
  netrexx.lang.Rexx op;
  netrexx.lang.Rexx L;
  netrexx.lang.Rexx R;
  netrexx.lang.Rexx token=null;
  netrexx.lang.Rexx rest=null;
  netrexx.lang.Rexx calc=null;
  
  stack=new java.util.LinkedList();
  op=new netrexx.lang.Rexx((byte)0);
  L=new netrexx.lang.Rexx('L');
  R=new netrexx.lang.Rexx('R');
  rpnString=rpnString.strip(new netrexx.lang.Rexx('b'));
  netrexx.lang.RexxIO.Say("Input\tOperation\tStack after");
  {rpn:for(;;){if(!(rpnString.length()).OpGt($1,$07))break;
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(rpnString,$08,$3);
   token=$3[0];rest=$3[1];}
   rpnString=rest.strip(new netrexx.lang.Rexx('b'));
   netrexx.lang.RexxIO.Say(token.OpCc($1,$09));
   {tox:do{/*select*/
   if (token.OpEqS($1,new netrexx.lang.Rexx('*')))
    {
     netrexx.lang.RexxIO.Say("Operate\t\t\000");
     op.getnode(R).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(L).leaf=(netrexx.lang.Rexx)(stack.pop());
     stack.push((java.lang.Object)(op.getnode(L).leaf).OpMult($1,op.getnode(R).leaf));
    }
   else if (token.OpEqS($1,new netrexx.lang.Rexx('/')))
    {
     netrexx.lang.RexxIO.Say("Operate\t\t\000");
     op.getnode(R).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(L).leaf=(netrexx.lang.Rexx)(stack.pop());
     stack.push((java.lang.Object)(op.getnode(L).leaf).OpDiv($1,op.getnode(R).leaf));
    }
   else if (token.OpEqS($1,new netrexx.lang.Rexx('+')))
    {
     netrexx.lang.RexxIO.Say("Operate\t\t\000");
     op.getnode(R).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(L).leaf=(netrexx.lang.Rexx)(stack.pop());
     stack.push((java.lang.Object)(op.getnode(L).leaf).OpAdd($1,op.getnode(R).leaf));
    }
   else if (token.OpEqS($1,new netrexx.lang.Rexx('-')))
    {
     netrexx.lang.RexxIO.Say("Operate\t\t\000");
     op.getnode(R).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(L).leaf=(netrexx.lang.Rexx)(stack.pop());
     stack.push((java.lang.Object)(op.getnode(L).leaf).OpSub($1,op.getnode(R).leaf));
    }
   else if (token.OpEqS($1,new netrexx.lang.Rexx('^')))
    {
     netrexx.lang.RexxIO.Say("Operate\t\t\000");
     op.getnode(R).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(L).leaf=(netrexx.lang.Rexx)(stack.pop());
     op.getnode(R).leaf=(op.getnode(R).leaf).OpAdd($1,$07);
     if ((op.getnode(R).leaf.datatype(new netrexx.lang.Rexx('w'))).toboolean()) 
      stack.push((java.lang.Object)(op.getnode(L).leaf).OpPow($1,op.getnode(R).leaf));
     else 
      stack.push((java.lang.Object)(new netrexx.lang.Rexx(java.lang.Math.pow((op.getnode(L).leaf).todouble(),(op.getnode(R).leaf).todouble()))));
    }
   else{
    {
     if ((token.datatype(new netrexx.lang.Rexx('n'))).toboolean()) 
      {
       netrexx.lang.RexxIO.Say("Push\t\t\000");
       stack.push((java.lang.Object)token);
      }
     else 
      {
       netrexx.lang.RexxIO.Say("Gronk\t\t\000");
      }
    }
   }
   }while(false);}/*tox*/
   
   netrexx.lang.RexxIO.Say(stack.toString());
   }
  }/*rpn*/
  netrexx.lang.RexxIO.Say("");
  calc=netrexx.lang.Rexx.toRexx(stack.toString());
  return calc;
  }
 
 private RRPNCalc01(){return;}
 }
