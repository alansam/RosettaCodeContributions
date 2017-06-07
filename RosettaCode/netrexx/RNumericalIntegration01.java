/* Generated from 'RNumericalIntegration01.nrx' 21 May 2013 11:52:52 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */

/*use twenty digits precision.   */

// =============================================================================

public class RNumericalIntegration01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("test");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx(", ");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx(") = ");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("1e-9");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RNumericalIntegration01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties private static */
 private static netrexx.lang.Rexx test_=new netrexx.lang.Rexx((byte)1);

 
 /*----------------------------------LEFT_RECT subroutine----------------*/
 
 public static double left_rect(double a,double b,int n){
  double h;
  double sum;
  double x=0;
  h=((b-a))/((double)n);
  sum=(double)0.0D;
  {double $3=h;int $2=n;x=a;x:for(;$2>0;$2--,x=x+$3){
   sum=sum+(f(x));
   }
  }/*x*/
  return sum*h;
  }

 /*----------------------------------MIDPOINT_RECT subroutine------------*/
 
 public static double midpoint_rect(double a,double b,int n){
  double h;
  double sum;
  double x=0;
  h=((b-a))/((double)n);
  sum=(double)0.0D;
  {double $5=h;int $4=n;x=a+(h/((double)2));x:for(;$4>0;$4--,x=x+$5){
   sum=sum+(f(x));
   }
  }/*x*/
  return sum*h;
  }

 /*----------------------------------RIGHT_RECT subroutine---------------*/
 
 public static double right_rect(double a,double b,int n){
  double h;
  double sum;
  double x=0;
  h=((b-a))/((double)n);
  sum=(double)0.0D;
  {double $7=h;int $6=n;x=a+h;x:for(;$6>0;$6--,x=x+$7){
   sum=sum+(f(x));
   }
  }/*x*/
  return sum*h;
  }

 /*----------------------------------SIMPSON subroutine------------------*/
 
 public static double simpson(double a,double b,int n){
  double h;
  double sum1;
  double sum2;
  int x=0;
  h=((b-a))/((double)n);
  sum1=f(a+(h/((double)2)));
  sum2=(double)0.0D;
  {int $8=n-1;x=1;x:for(;x<=$8;x++){
   sum1=sum1+(f((a+(h*((double)x)))+(h*0.5D)));
   sum2=sum2+(f(a+(((double)x)*h)));
   }
  }/*x*/
  
  return (h*(((((f(a))+(f(b)))+(((double)4)*sum1))+(((double)2)*sum2))))/((double)6);
  }

 /*----------------------------------TRAPEZOID subroutine----------------*/
 
 public static double trapezoid(double a,double b,int n){
  double h;
  double sum;
  double x=0;
  h=((b-a))/((double)n);
  sum=(double)0.0D;
  {double $9=b;double $10=h;boolean $11=$10>=((double)0);x=a;x:for(;$11?x<=$9:x>=$9;x=x+$10){
   sum=sum+((h*(((f(x))+(f(x+h)))))*0.5D);
   }
  }/*x*/
  return sum;
  }

 /*----------------------------------F subroutine------------------------*/
 
 private static double f(double z){
  double zb=0;
  {/*select*/
  if (test_.OpEqS($1,new netrexx.lang.Rexx((byte)1)))
   zb=netrexx.lang.RexxUtil.doublePow((double)z,(int)3);
  else if (test_.OpEqS($1,new netrexx.lang.Rexx((byte)2)))
   zb=((double)1)/z;
  else{
   zb=z;
  }
  }
  return zb;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tests=null;
  netrexx.lang.Rexx test=null;
  netrexx.lang.Rexx L=null;
  netrexx.lang.Rexx H=null;
  netrexx.lang.Rexx i=null;
  long etime=0;
  double arl=0;
  double arm=0;
  double arr=0;
  double asr=0;
  double atz=0;
  
  {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$12);
  tests=$12[0];}
  if ((tests.OpEq($1,$03)||tests.OpLt($1,$04))||tests.OpGt($1,$05)) 
   tests=new netrexx.lang.Rexx((byte)4);
  {int $13=tests.OpPlus($1).toint();test=new netrexx.lang.Rexx((byte)1);test:for(;$13>0;$13--,test=test.OpAdd($1,new netrexx.lang.Rexx(1))){/*perform the test suite.        */
   test_=test;
   {/*select*/
   if (test.OpEqS($1,$04))
    {
     L=new netrexx.lang.Rexx((byte)0);
     H=new netrexx.lang.Rexx((byte)1);
     i=new netrexx.lang.Rexx((byte)100);
    }
   else if (test.OpEqS($1,$06))
    {
     L=new netrexx.lang.Rexx((byte)1);
     H=new netrexx.lang.Rexx((byte)100);
     i=new netrexx.lang.Rexx((short)1000);
    }
   else if (test.OpEqS($1,$07))
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
   arl=left_rect(L.todouble(),H.todouble(),i.toint());
   arm=midpoint_rect(L.todouble(),H.todouble(),i.toint());
   arr=right_rect(L.todouble(),H.todouble(),i.toint());
   asr=simpson(L.todouble(),H.todouble(),i.toint());
   atz=trapezoid(L.todouble(),H.todouble(),i.toint());
   etime=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(etime)).tolong();
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say(($08.OpCcblank($1,test)).centre(new netrexx.lang.Rexx((byte)79),new netrexx.lang.Rexx('-')));/*display a header for the test. */
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("      left_rectangular(").OpCc($1,L)).OpCc($1,$09)).OpCc($1,H)).OpCc($1,$09)).OpCc($1,i)).OpCc($1,$010)).OpCcblank($1,(new netrexx.lang.Rexx(arl)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("  midpoint_rectangular(").OpCc($1,L)).OpCc($1,$09)).OpCc($1,H)).OpCc($1,$09)).OpCc($1,i)).OpCc($1,$010)).OpCcblank($1,(new netrexx.lang.Rexx(arm)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("     right_rectangular(").OpCc($1,L)).OpCc($1,$09)).OpCc($1,H)).OpCc($1,$09)).OpCc($1,i)).OpCc($1,$010)).OpCcblank($1,(new netrexx.lang.Rexx(arr)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("               simpson(").OpCc($1,L)).OpCc($1,$09)).OpCc($1,H)).OpCc($1,$09)).OpCc($1,i)).OpCc($1,$010)).OpCcblank($1,(new netrexx.lang.Rexx(asr)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say(((((((netrexx.lang.Rexx.toRexx("             trapezoid(").OpCc($1,L)).OpCc($1,$09)).OpCc($1,H)).OpCc($1,$09)).OpCc($1,i)).OpCc($1,$010)).OpCcblank($1,(new netrexx.lang.Rexx(atz)).format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(" Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(etime).OpMult($1,$011))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$012));
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
 
 private RNumericalIntegration01(){return;}
 }
