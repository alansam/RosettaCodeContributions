/* Generated from 'RPriceFraction.nrx' 24 Jun 2013 21:17:52 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RPriceFraction{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("Input");
 private static final java.lang.String $0="RPriceFraction.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx in_val=null;
  netrexx.lang.Rexx test_vals[]=null;
  netrexx.lang.Rexx tv=null;
  netrexx.lang.Rexx adjust=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  in_val=$1[0];}
  if (in_val.OpNotEq(null,$02)) 
   test_vals=new netrexx.lang.Rexx[]{in_val};
  else 
   test_vals=getTestData();
  
  netrexx.lang.RexxIO.Say("Input Adjustment");
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(test_vals.length).OpSub(null,$03);tv=new netrexx.lang.Rexx((byte)0);tv:for(;tv.OpLtEq(null,$2);tv=tv.OpAdd(null,new netrexx.lang.Rexx(1))){
   in_val=test_vals[tv.toint()];
   adjust=priceFraction(in_val);
   netrexx.lang.RexxIO.Say((in_val.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2)).right(new netrexx.lang.Rexx((byte)5))).OpCcblank(null,adjust.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2)).right(new netrexx.lang.Rexx((byte)10))));
   }
  }/*tv*/
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static netrexx.lang.Rexx priceFraction(netrexx.lang.Rexx in_val){
  netrexx.lang.Rexx out_val;
  netrexx.lang.Rexx limit_table[][];
  int limit_table_K;
  netrexx.lang.Rexx p1=null;
  netrexx.lang.Rexx pair[]=null;
  netrexx.lang.Rexx hi_limit=null;
  netrexx.lang.Rexx adjustmt=null;
  out_val=$03.OpMinus(null);
  limit_table=getLimitTable();
  limit_table_K=limit_table.length;
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(limit_table_K).OpSub(null,$03);p1=new netrexx.lang.Rexx((byte)0);p1:for(;p1.OpLtEq(null,$3);p1=p1.OpAdd(null,new netrexx.lang.Rexx(1))){
   pair=limit_table[p1.toint()];
   hi_limit=pair[0];
   adjustmt=pair[1];
   if (in_val.OpLt(null,hi_limit)) 
    {
     out_val=adjustmt;
     break p1;
    }
   }
  }/*p1*/
  if (out_val.OpEq(null,$03.OpMinus(null))) 
   throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString(($04.OpCcblank(null,in_val)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is outside of acceptable range."))));
  
  return out_val;
  }

 // -----------------------------------------------------------------------------
 /*
  * >=  0.00  <  0.06  :=  0.10
  * >=  0.06  <  0.11  :=  0.18
  * >=  0.11  <  0.16  :=  0.26
  * >=  0.16  <  0.21  :=  0.32
  * >=  0.21  <  0.26  :=  0.38
  * >=  0.26  <  0.31  :=  0.44
  * >=  0.31  <  0.36  :=  0.50
  * >=  0.36  <  0.41  :=  0.54
  * >=  0.41  <  0.46  :=  0.58
  * >=  0.46  <  0.51  :=  0.62
  * >=  0.51  <  0.56  :=  0.66
  * >=  0.56  <  0.61  :=  0.70
  * >=  0.61  <  0.66  :=  0.74
  * >=  0.66  <  0.71  :=  0.78
  * >=  0.71  <  0.76  :=  0.82
  * >=  0.76  <  0.81  :=  0.86
  * >=  0.81  <  0.86  :=  0.90
  * >=  0.86  <  0.91  :=  0.94
  * >=  0.91  <  0.96  :=  0.98
  * >=  0.96  <  1.01  :=  1.00
  */
 
 public static netrexx.lang.Rexx[][] getLimitTable(){
  netrexx.lang.Rexx limit_table[][];
  limit_table=new netrexx.lang.Rexx[][]{new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.06"),new netrexx.lang.Rexx("0.10")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.11"),new netrexx.lang.Rexx("0.18")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.16"),new netrexx.lang.Rexx("0.26")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.21"),new netrexx.lang.Rexx("0.32")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.26"),new netrexx.lang.Rexx("0.38")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.31"),new netrexx.lang.Rexx("0.44")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.36"),new netrexx.lang.Rexx("0.50")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.41"),new netrexx.lang.Rexx("0.54")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.46"),new netrexx.lang.Rexx("0.58")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.51"),new netrexx.lang.Rexx("0.62")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.56"),new netrexx.lang.Rexx("0.66")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.61"),new netrexx.lang.Rexx("0.70")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.66"),new netrexx.lang.Rexx("0.74")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.71"),new netrexx.lang.Rexx("0.78")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.76"),new netrexx.lang.Rexx("0.82")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.81"),new netrexx.lang.Rexx("0.86")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.86"),new netrexx.lang.Rexx("0.90")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.91"),new netrexx.lang.Rexx("0.94")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.96"),new netrexx.lang.Rexx("0.98")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("1.01"),new netrexx.lang.Rexx("1.00")}};
  
  
  
  
  
  return limit_table;
  }

 // -----------------------------------------------------------------------------
 
 private static netrexx.lang.Rexx[] getTestData(){
  netrexx.lang.Rexx test_vals[];
  java.util.Random rng;
  netrexx.lang.Rexx tv=null;
  test_vals=new netrexx.lang.Rexx[5];
  rng=new java.util.Random(1024);
  {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(test_vals.length).OpSub(null,$03);tv=new netrexx.lang.Rexx((byte)0);tv:for(;tv.OpLtEq(null,$4);tv=tv.OpAdd(null,new netrexx.lang.Rexx(1))){
   test_vals[tv.toint()]=new netrexx.lang.Rexx(rng.nextFloat());
   }
  }/*tv*/
  return test_vals;
  }
 
 private RPriceFraction(){return;}
 }
