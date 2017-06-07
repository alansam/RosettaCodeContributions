/* Generated from 'RNumericalIntegration00.nrx' 21 May 2013 10:44:58 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */

/*use twenty digits precision.   */

// =============================================================================

public class RNumericalIntegration00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx("0.5");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final char[] $09={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("test");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx(", ");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx(") = ");
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx("1e-9");
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RNumericalIntegration00.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties private static */
 private static netrexx.lang.Rexx test_=new netrexx.lang.Rexx((byte)1);

 
 /*----------------------------------LEFT_RECT subroutine----------------*/
 
 public static netrexx.lang.Rexx left_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $3=h;int $2=n.OpPlus($1).toint();x=a.OpPlus($1);x:for(;$2>0;$2--,x=x.OpAdd($1,$3)){
   sum=sum.OpAdd($1,f(x));
   }
  }/*x*/
  return sum.OpMult($1,h);
  }

 /*----------------------------------MIDPOINT_RECT subroutine------------*/
 
 public static netrexx.lang.Rexx midpoint_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $5=h;int $4=n.OpPlus($1).toint();x=a.OpAdd($1,h.OpDiv($1,$02)).OpPlus($1);x:for(;$4>0;$4--,x=x.OpAdd($1,$5)){
   sum=sum.OpAdd($1,f(x));
   }
  }/*x*/
  return sum.OpMult($1,h);
  }

 /*----------------------------------RIGHT_RECT subroutine---------------*/
 
 public static netrexx.lang.Rexx right_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $7=h;int $6=n.OpPlus($1).toint();x=a.OpAdd($1,h).OpPlus($1);x:for(;$6>0;$6--,x=x.OpAdd($1,$7)){
   sum=sum.OpAdd($1,f(x));
   }
  }/*x*/
  return sum.OpMult($1,h);
  }

 /*----------------------------------SIMPSON subroutine------------------*/
 
 public static netrexx.lang.Rexx simpson(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx sum1;
  netrexx.lang.Rexx sum2;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum1=f(a.OpAdd($1,h.OpDiv($1,$02)));
  sum2=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $8=n.OpSub($1,$03);x=new netrexx.lang.Rexx((byte)1);x:for(;x.OpLtEq($1,$8);x=x.OpAdd($1,new netrexx.lang.Rexx(1))){
   sum1=sum1.OpAdd($1,f(a.OpAdd($1,h.OpMult($1,x)).OpAdd($1,h.OpMult($1,$04))));
   sum2=sum2.OpAdd($1,f(a.OpAdd($1,x.OpMult($1,h))));
   }
  }/*x*/
  
  return h.OpMult($1,((f(a)).OpAdd($1,f(b)).OpAdd($1,$05.OpMult($1,sum1)).OpAdd($1,$02.OpMult($1,sum2)))).OpDiv($1,$06);
  }

 /*----------------------------------TRAPEZOID subroutine----------------*/
 
 public static netrexx.lang.Rexx trapezoid(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=new netrexx.lang.Rexx("0.0");
  {netrexx.lang.Rexx $9=b;netrexx.lang.Rexx $10=h;boolean $11=$10.OpGtEq($1,$07);x=a.OpPlus($1);x:for(;$11?x.OpLtEq($1,$9):x.OpGtEq($1,$9);x=x.OpAdd($1,$10)){
   sum=sum.OpAdd($1,h.OpMult($1,((f(x)).OpAdd($1,f(x.OpAdd($1,h))))).OpMult($1,$04));
   }
  }/*x*/
  return sum;
  }

 /*----------------------------------F subroutine------------------------*/
 
 private static netrexx.lang.Rexx f(netrexx.lang.Rexx z){
  if (test_.OpEqS($1,$03)) 
   return z.OpPow($1,$08);
  if (test_.OpEqS($1,$02)) 
   return $03.OpDiv($1,z);
  return z;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tests=null;
  netrexx.lang.Rexx test=null;
  netrexx.lang.Rexx L=null;
  netrexx.lang.Rexx H=null;
  netrexx.lang.Rexx i=null;
  long etime=0;
  netrexx.lang.Rexx arl=null;
  netrexx.lang.Rexx arm=null;
  netrexx.lang.Rexx arr=null;
  netrexx.lang.Rexx asr=null;
  netrexx.lang.Rexx atz=null;
  
  {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$09,$12);
  tests=$12[0];}
  if ((tests.OpEq($1,$010)||tests.OpLt($1,$03))||tests.OpGt($1,$05)) 
   tests=new netrexx.lang.Rexx((byte)4);
  {int $13=tests.OpPlus($1).toint();test=new netrexx.lang.Rexx((byte)1);test:for(;$13>0;$13--,test=test.OpAdd($1,new netrexx.lang.Rexx(1))){/*perform the test suite.        */
   test_=test;
   {/*select*/
   if (test.OpEqS($1,$03))
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((byte)1);
     i=new netrexx.lang.Rexx((byte)100);
    }
   else if (test.OpEqS($1,$02))
    {
     L=new netrexx.lang.Rexx((byte)1);
     H=new netrexx.lang.Rexx((byte)100);
     i=new netrexx.lang.Rexx((short)1000);
    }
   else if (test.OpEqS($1,$08))
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((short)5000);
     i=new netrexx.lang.Rexx(5000000);
    }
   else if (test.OpEqS($1,$05))
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((short)6000);
     i=new netrexx.lang.Rexx(5000000);
    }
   else{
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((byte)1);
     i=new netrexx.lang.Rexx((byte)100);
    }
   }
   }
   etime=java.lang.System.nanoTime();
   arl=left_rect(L,H,i);
   arm=midpoint_rect(L,H,i);
   arr=right_rect(L,H,i);
   asr=simpson(L,H,i);
   atz=trapezoid(L,H,i);
   etime=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(etime)).tolong();
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say(($011.OpCcblank($1,test)).centre(new netrexx.lang.Rexx((byte)79),new netrexx.lang.Rexx('-')));/*display a header for the test. */
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("      left_rectangular(").OpCc($1,L)).OpCc($1,$012)).OpCc($1,H)).OpCc($1,$012)).OpCc($1,i)).OpCc($1,$013)).OpCcblank($1,arl.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("  midpoint_rectangular(").OpCc($1,L)).OpCc($1,$012)).OpCc($1,H)).OpCc($1,$012)).OpCc($1,i)).OpCc($1,$013)).OpCcblank($1,arm.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("     right_rectangular(").OpCc($1,L)).OpCc($1,$012)).OpCc($1,H)).OpCc($1,$012)).OpCc($1,i)).OpCc($1,$013)).OpCcblank($1,arr.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("               simpson(").OpCc($1,L)).OpCc($1,$012)).OpCc($1,H)).OpCc($1,$012)).OpCc($1,i)).OpCc($1,$013)).OpCcblank($1,asr.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("             trapezoid(").OpCc($1,L)).OpCc($1,$012)).OpCc($1,H)).OpCc($1,$012)).OpCc($1,i)).OpCc($1,$013)).OpCcblank($1,atz.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(" Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(etime).OpMult($1,$014))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$015));
   }
  }/*test*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }
 
 private RNumericalIntegration00(){return;}
 }
