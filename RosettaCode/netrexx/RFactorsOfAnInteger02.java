/* Generated from 'RFactorsOfAnInteger02.nrx' 7 Jan 2013 23:01:11 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RFactorsOfAnInteger02{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("   n = ");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RFactorsOfAnInteger02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx num;
  netrexx.lang.Rexx j_=null;
  num=new netrexx.lang.Rexx((byte)0);
  {running:for(;;){
   netrexx.lang.RexxIO.Say("Provide an integer [or anything else to stop]:");
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
   num=$1[0];}
   if ((num.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
    break running;
   {netrexx.lang.Rexx $2=num;j_=new netrexx.lang.Rexx((byte)1);j_:for(;j_.OpLtEq(null,$2);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((($02.OpCcblank(null,j_.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   divisors = "))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(factors(j_)))));
    }
   }/*j_*/
   }
  }/*running*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /*
  * public static TreeSet<Long> factors(long n)
  * {
  *  TreeSet<Long> factors = new TreeSet<Long>();
  *  factors.add(n);
  *  factors.add(1L);
  *  for(long test = n - 1; test >= Math.sqrt(n); test--)
  *   if(n % test == 0)
  *   {
  *    factors.add(test);
  *    factors.add(n / test);
  *   }
  *  return factors;
  * }
  */
 
 public static java.util.Set factors(netrexx.lang.Rexx n){
  java.util.TreeSet factors;
  netrexx.lang.Rexx test=null;
  factors=new java.util.TreeSet();
  factors.add((java.lang.Object)(new java.lang.Long(netrexx.lang.Rexx.toString(n))));
  factors.add((java.lang.Object)(new java.lang.Long(1)));
  {netrexx.lang.Rexx $3=$03.OpMinus(null);test=n.OpSub(null,$03).OpPlus(null);test:for(;;test=test.OpAdd(null,$3)){if(!test.OpGtEq(null,new netrexx.lang.Rexx(java.lang.Math.sqrt(n.todouble()))))break;
   if (n.OpRem(null,test).OpEq(null,$04)) 
    {
     factors.add((java.lang.Object)(new java.lang.Long(netrexx.lang.Rexx.toString(test))));
     factors.add((java.lang.Object)(new java.lang.Long(netrexx.lang.Rexx.toString(n.OpDivI(null,test)))));
    }
   }
  }/*test*/
  return (java.util.Set)factors;
  }
 
 private RFactorsOfAnInteger02(){return;}
 }
