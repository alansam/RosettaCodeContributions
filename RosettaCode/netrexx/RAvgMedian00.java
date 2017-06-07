/* Generated from 'RAvgMedian00.nrx' 2 Jan 2013 18:31:04 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAvgMedian00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Meadian:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx(", Vector:");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("8.4");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx("1.7");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx("11e+2");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx("2.0");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx("6.3");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("1.0");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx("3.6");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx("2.3");
 private static final java.lang.String $0="RAvgMedian00.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx median(java.util.List lvector){
  java.util.ArrayList cvector;
  netrexx.lang.Rexx kVal;
  cvector=new java.util.ArrayList((java.util.Collection)lvector); // make a copy of input to ensure it's contents are preserved
  java.util.Collections.sort((java.util.List)cvector,(java.util.Comparator)(new RAvgMedian00.RexxComparator()));
  kVal=(((((netrexx.lang.Rexx)(cvector.get(new netrexx.lang.Rexx(cvector.size()).OpDivI(null,$01).toint())))).OpAdd(null,((netrexx.lang.Rexx)(cvector.get(((new netrexx.lang.Rexx(cvector.size()).OpSub(null,$02))).OpDivI(null,$01).toint())))))).OpDiv(null,$01);
  return kVal;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx median(netrexx.lang.Rexx rvector[]){
  return median((java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])rvector)))));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx show_median(java.util.List lvector){
  netrexx.lang.Rexx mVal;
  mVal=median(lvector);
  netrexx.lang.RexxIO.Say((($03.OpCcblank(null,mVal.format(new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx('s')))).OpCc(null,$04)).OpCcblank(null,(new netrexx.lang.Rexx(java.lang.String.valueOf(lvector))).space(new netrexx.lang.Rexx((byte)0))));
  return mVal;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx show_median(netrexx.lang.Rexx rvector[]){
  return show_median((java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])rvector)))));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void run_samples(){
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("10.0")}); // 10.0
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("10.0"),new netrexx.lang.Rexx("9.0"),new netrexx.lang.Rexx("8.0"),new netrexx.lang.Rexx("7.0"),new netrexx.lang.Rexx("6.0"),new netrexx.lang.Rexx("5.0"),new netrexx.lang.Rexx("4.0"),new netrexx.lang.Rexx("3.0"),new netrexx.lang.Rexx("2.0"),new netrexx.lang.Rexx("1.0")}); // 5.5
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1)}); // 5.0
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("1.0"),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx("2.0"),new netrexx.lang.Rexx("4.0")}); // 3.0
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("3.0"),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx("1.0"),new netrexx.lang.Rexx("5.0"),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx("7.0"),new netrexx.lang.Rexx("6.0")}); // 4.5
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(3),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),$05.OpMinus(null),new netrexx.lang.Rexx("7.2"),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx("1.2")}); // 2.1
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("1.2345678e+99").OpMinus(null),new netrexx.lang.Rexx("2.3e+700")}); // 1.15e+700
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("4.1"),new netrexx.lang.Rexx("5.6"),new netrexx.lang.Rexx("7.2"),new netrexx.lang.Rexx("1.7"),new netrexx.lang.Rexx("9.3"),new netrexx.lang.Rexx("4.4"),new netrexx.lang.Rexx("3.2")}); // 4.4
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("4.1"),new netrexx.lang.Rexx("7.2"),new netrexx.lang.Rexx("1.7"),new netrexx.lang.Rexx("9.3"),new netrexx.lang.Rexx("4.4"),new netrexx.lang.Rexx("3.2")}); // 4.25
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("28.207"),new netrexx.lang.Rexx("74.916"),new netrexx.lang.Rexx("51.695"),new netrexx.lang.Rexx("72.486"),new netrexx.lang.Rexx("51.118"),new netrexx.lang.Rexx("3.241"),new netrexx.lang.Rexx("73.807")}); // 51.695
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("27.984"),new netrexx.lang.Rexx("89.172"),new netrexx.lang.Rexx("0.250"),new netrexx.lang.Rexx("66.316"),new netrexx.lang.Rexx("41.805"),new netrexx.lang.Rexx("60.043")}); // 50.924
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("5.1"),new netrexx.lang.Rexx("2.6"),new netrexx.lang.Rexx("6.2"),new netrexx.lang.Rexx("8.8"),new netrexx.lang.Rexx("4.6"),new netrexx.lang.Rexx("4.1")}); // 4.85
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("5.1"),new netrexx.lang.Rexx("2.6"),new netrexx.lang.Rexx("8.8"),new netrexx.lang.Rexx("4.6"),new netrexx.lang.Rexx("4.1")}); // 4.6
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("4.4"),new netrexx.lang.Rexx("2.3"),$06.OpMinus(null),new netrexx.lang.Rexx("7.5"),new netrexx.lang.Rexx("6.6"),new netrexx.lang.Rexx("0.0"),new netrexx.lang.Rexx("1.9"),new netrexx.lang.Rexx("8.2"),new netrexx.lang.Rexx("9.3"),new netrexx.lang.Rexx("4.5")}); // 4.45
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(10),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx("0.11")}); // 3.0
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(10),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((byte)30),new netrexx.lang.Rexx((byte)40),new netrexx.lang.Rexx((byte)50),$07.OpMinus(null),new netrexx.lang.Rexx("4.7"),$08.OpMinus(null)}); // 15.0
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("9.3"),$09.OpMinus(null),new netrexx.lang.Rexx("4.0"),new netrexx.lang.Rexx("7.3"),new netrexx.lang.Rexx("8.1"),new netrexx.lang.Rexx("4.1"),$010.OpMinus(null),new netrexx.lang.Rexx("4.2"),$011.OpMinus(null),$05.OpMinus(null)}); // 4.05
  show_median(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("8.3"),$012.OpMinus(null),new netrexx.lang.Rexx("5.7"),new netrexx.lang.Rexx("2.3"),new netrexx.lang.Rexx("9.3"),new netrexx.lang.Rexx("5.4"),$013.OpMinus(null),new netrexx.lang.Rexx("6.3"),new netrexx.lang.Rexx("9.9")}); // 5.7
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  run_samples();
  return;
  }
 
 private RAvgMedian00(){return;}

// =============================================================================
 
 static class RexxComparator implements java.util.Comparator{
  private final transient java.lang.String $0="RAvgMedian00.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public int compare(java.lang.Object i1,java.lang.Object i2){
   netrexx.lang.Rexx i;
   netrexx.lang.Rexx j;
   i=(netrexx.lang.Rexx)i1;
   j=(netrexx.lang.Rexx)i2;
  
   if (i.OpLt(null,j)) 
    return $02.OpMinus(null).toint();
   if (i.OpGt(null,j)) 
    return $02.OpPlus(null).toint();
   else 
    return 0;
   }
  
  public RexxComparator(){return;}
 }}
