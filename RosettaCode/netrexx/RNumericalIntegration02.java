/* Generated from 'RNumericalIntegration02.nrx' 21 May 2013 11:48:54 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*use twenty digits precision.   */

// =============================================================================

public class RNumericalIntegration02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx("0.5");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(3);
 private static final char[] $07={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("test");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx(", ");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx(") = ");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx("1e-9");
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RNumericalIntegration02.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties private static */
 private static netrexx.lang.Rexx test_=new netrexx.lang.Rexx((byte)1);

 
 /*----------------------------------LEFT_RECT subroutine----------------*/
 
 public static java.math.BigDecimal left_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  java.math.BigDecimal sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=java.math.BigDecimal.ZERO;
  {netrexx.lang.Rexx $3=h;int $2=n.OpPlus($1).toint();x=a.OpPlus($1);x:for(;$2>0;$2--,x=x.OpAdd($1,$3)){
   sum=sum.add(f(x));
   }
  }/*x*/
  return sum.multiply(new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(h)));
  }

 /*----------------------------------MIDPOINT_RECT subroutine------------*/
 
 public static java.math.BigDecimal midpoint_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  java.math.BigDecimal sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=java.math.BigDecimal.ZERO;
  {netrexx.lang.Rexx $5=h;int $4=n.OpPlus($1).toint();x=a.OpAdd($1,h.OpDiv($1,$02)).OpPlus($1);x:for(;$4>0;$4--,x=x.OpAdd($1,$5)){
   sum=sum.add(f(x));
   }
  }/*x*/
  return sum.multiply(new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(h)));
  }

 /*----------------------------------RIGHT_RECT subroutine---------------*/
 
 public static java.math.BigDecimal right_rect(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  java.math.BigDecimal sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=java.math.BigDecimal.ZERO;
  {netrexx.lang.Rexx $7=h;int $6=n.OpPlus($1).toint();x=a.OpAdd($1,h).OpPlus($1);x:for(;$6>0;$6--,x=x.OpAdd($1,$7)){
   sum=sum.add(f(x));
   }
  }/*x*/
  return sum.multiply(new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(h)));
  }

 /*----------------------------------SIMPSON subroutine------------------*/
 
 public static java.math.BigDecimal simpson(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  java.math.BigDecimal sum1;
  java.math.BigDecimal sum2;
  int x=0;
  java.math.BigDecimal area;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum1=f(a.OpAdd($1,h.OpDiv($1,$02)));
  sum2=java.math.BigDecimal.ZERO;
  {int $8=n.OpSub($1,$03).toint();x=1;x:for(;x<=$8;x++){
   sum1=sum1.add(f(a.OpAdd($1,h.OpMult($1,new netrexx.lang.Rexx(x))).OpAdd($1,h.OpMult($1,$04))));
   sum2=sum2.add(f(a.OpAdd($1,new netrexx.lang.Rexx(x).OpMult($1,h))));
   }
  }/*x*/
  
  //  return h * (f(a) + f(b) + 4 * sum1 + 2 * sum2) / 6
  area=((new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(h))).multiply(f(a).add(f(b)).add(sum1.multiply(new java.math.BigDecimal("4"))).add(sum2.multiply(new java.math.BigDecimal("2"))))).divide(new java.math.BigDecimal("6"),java.math.RoundingMode.HALF_EVEN);
  return area;
  }

 /*----------------------------------TRAPEZOID subroutine----------------*/
 
 public static java.math.BigDecimal trapezoid(netrexx.lang.Rexx a,netrexx.lang.Rexx b,netrexx.lang.Rexx n){
  netrexx.lang.Rexx h;
  java.math.BigDecimal sum;
  netrexx.lang.Rexx x=null;
  h=((b.OpSub($1,a))).OpDiv($1,n);
  sum=java.math.BigDecimal.ZERO;
  {netrexx.lang.Rexx $9=b;netrexx.lang.Rexx $10=h;boolean $11=$10.OpGtEq($1,$05);x=a.OpPlus($1);x:for(;$11?x.OpLtEq($1,$9):x.OpGtEq($1,$9);x=x.OpAdd($1,$10)){
   //    sum = sum + h * (f(x) + f(x + h)) * 0.5
   sum=sum.add((new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(h))).multiply((f(x).add(f(x.OpAdd($1,h)))).multiply(new java.math.BigDecimal("0.5"))));
   }
  }/*x*/
  return sum;
  }

 /*----------------------------------F subroutine------------------------*/
 
 private static java.math.BigDecimal f(netrexx.lang.Rexx z){
  netrexx.lang.Rexx zb=null;
  {/*select*/
  if (test_.OpEqS($1,new netrexx.lang.Rexx((byte)1)))
   zb=z.OpPow($1,$06);
  else if (test_.OpEqS($1,new netrexx.lang.Rexx((byte)2)))
   zb=$03.OpDiv($1,z);
  else{
   zb=z;
  }
  }
  return new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(zb));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tests=null;
  netrexx.lang.Rexx test=null;
  netrexx.lang.Rexx L=null;
  netrexx.lang.Rexx H=null;
  netrexx.lang.Rexx i=null;
  long etime=0;
  java.math.BigDecimal arl=null;
  java.math.BigDecimal arm=null;
  java.math.BigDecimal arr=null;
  java.math.BigDecimal asr=null;
  java.math.BigDecimal atz=null;
  
  {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$07,$12);
  tests=$12[0];}
  if ((tests.OpEq($1,$08)||tests.OpLt($1,$03))||tests.OpGt($1,$09)) 
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
   else if (test.OpEqS($1,$06))
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((short)5000);
     i=new netrexx.lang.Rexx(5000000);
    }
   else if (test.OpEqS($1,$09))
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
   netrexx.lang.RexxIO.Say(($010.OpCcblank($1,test)).centre(new netrexx.lang.Rexx((byte)79),new netrexx.lang.Rexx('-')));/*display a header for the test. */
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("      left_rectangular(").OpCc($1,L)).OpCc($1,$011)).OpCc($1,H)).OpCc($1,$011)).OpCc($1,i)).OpCc($1,$012)).OpCcblank($1,(new netrexx.lang.Rexx(arl.toString())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("  midpoint_rectangular(").OpCc($1,L)).OpCc($1,$011)).OpCc($1,H)).OpCc($1,$011)).OpCc($1,i)).OpCc($1,$012)).OpCcblank($1,(new netrexx.lang.Rexx(arm.toString())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("     right_rectangular(").OpCc($1,L)).OpCc($1,$011)).OpCc($1,H)).OpCc($1,$011)).OpCc($1,i)).OpCc($1,$012)).OpCcblank($1,(new netrexx.lang.Rexx(arr.toString())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("               simpson(").OpCc($1,L)).OpCc($1,$011)).OpCc($1,H)).OpCc($1,$011)).OpCc($1,i)).OpCc($1,$012)).OpCcblank($1,(new netrexx.lang.Rexx(asr.toString())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("             trapezoid(").OpCc($1,L)).OpCc($1,$011)).OpCc($1,H)).OpCc($1,$011)).OpCc($1,i)).OpCc($1,$012)).OpCcblank($1,(new netrexx.lang.Rexx(atz.toString())).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(" Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(etime).OpMult($1,$013))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$014));
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
 
 private RNumericalIntegration02(){return;}
 }
