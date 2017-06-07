/* Generated from 'RLoops.nrx' 13 Jul 2011 11:57:29 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Loops
 * <h3>Loops/Break</h3>
 * <p>
 * Show a loop which prints random numbers (each number newly generated each loop) from 0 to 19 (inclusive).
 * If a number is 10, stop the loop after printing it, and do not generate any further numbers.
 * Otherwise, generate and print a second random number before restarting the loop.
 * If the number 10 is never generated as the first number in a loop, loop forever.
 * </p>
 * <h3>Loops/Continue</h3>
 * <p>
 * Show the following output using one loop.
 * <pre>
 * 1, 2, 3, 4, 5
 * 6, 7, 8, 9, 10
 * </pre>
 * <p>
 * Try to achieve the result by forcing the next iteration within the loop upon a specific condition,
 * if your language allows it.
 * </p>
 * <h3>Loops/Do-while</h3>
 * <p>
 * Start with a value at 0. Loop while value mod 6 is not equal to 0. Each time through the loop,
 * add 1 to the value then print it. The loop must execute at least once.
 * </p>
 * <h3>Loops/Downward for</h3>
 * <p>
 * Write a for loop which writes a countdown from 10 to 0.
 * </p>
 * <h3>Loops/For</h3>
 * <p>
 * "For" loops are used to make some block of code be iterated a number of times, setting a variable or parameter
 * to a monotonically increasing integer value for each execution of the block of code. Common extensions of this
 * allow other counting patterns or iterating over abstract structures other than the integers.
 * <p>
 * For this task, show how two loops may be nested within each other, with the number of iterations performed by
 * the inner for loop being controlled by the outer for loop. Specifically print out the following pattern by
 * using one for loop nested in another:
 * </p>
 * <pre>
 * *
 * **
 * ***
 * ****
 * *****
 * </pre>
 * <h3>Loops/For with a specified step</h3>
 * <p>
 * Demonstrate a for loop where the step value is greater than one.
 * </p>
 * <h3>Loops/Foreach</h3>
 * <p>
 * Loop through and print each element in a collection in order. Use your language's "for each" loop if it has one,
 * otherwise iterate through the collection in order with some other loop.
 * </p>
 * <h3>Loops/Infinite</h3>
 * <p>
 * Specifically print out "SPAM" followed by a newline in an infinite loop.
 * </p>
 * <h3>Loops/N plus one half</h3>
 * <p>
 * Quite often one needs loops which, in the last iteration, execute only part of the loop body.
 * The goal of this task is to demonstrate the best way to do this.
 * </p>
 * <p>
 * Write a loop which writes the comma-separated list
 * <pre>
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * </pre>
 * <p>
 * using separate output statements for the number and the comma from within the body of the loop.
 * </p>
 * <h3>Loops/Nested</h3>
 * <p>
 * Show a nested loop which searches two-dimensional array filled with random number uniformly distributed on [1..20].
 * The loops iterate rows and columns of the array printing the iterated elements of, until the value 20 is met.
 * Specifically, this task also shows how to <a href="http://rosettacode.org/wiki/Loop/Break">break</a> out of nested loops.
 * </p>
 * <h3>Loops/While</h3>
 * <p>
 * Start an integer value at 1024. Loop while it is greater than 0. Print the value (with a newline)
 * and divide it by two each time through the loop.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Loops/Break">rosettacode.org/wiki/Loops/Break</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Continue">rosettacode.org/wiki/Loops/Continue</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Do-while">rosettacode.org/wiki/Loops/Do-while</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Downward_for">rosettacode.org/wiki/Loops/Downward_for</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/For_with_a_specified_step">rosettacode.org/wiki/Loops/For_with_a_specified_step</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Foreach">rosettacode.org/wiki/Loops/Foreach</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Infinite">rosettacode.org/wiki/Loops/Infinite</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/N_plus_one_half">rosettacode.org/wiki/Loops/N_plus_one_half</a>
 * @see <a href="http://rosettacode.org/wiki/Loops/Nested">rosettacode.org/wiki/Loops/Nested</a>
 */


public class RLoops{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx(", ");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx((byte)0);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx((byte)5);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("1.4");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx("10.6");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx("1.7");
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx(": \000");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(20);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RLoops.nrx";
 
 public static void main(java.lang.String args[]){
  
  loopsBreak();
  loopsContinue();
  loopsDoWhile();
  loopsDownwardFor();
  loopsFor();
  loopsForSpecStep();
  loopsForEach();
  loopsInfinite();
  loopsNplusHalf();
  loopsNested();
  loopsWhile();
  
  return;
  }

 /**
  * Loops/Break
  */
 
 public static void loopsBreak(){
  netrexx.lang.Rexx rn=null;
  java.util.Random rnd;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Break");
  
  rnd=new java.util.Random();
  
  {lb:for(;;){
   rn=new netrexx.lang.Rexx(rnd.nextInt(19));
   netrexx.lang.RexxIO.Say((rn.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$01));
   if (rn.OpEq(null,$02)) 
    break lb;
   rn=new netrexx.lang.Rexx(rnd.nextInt(19));
   netrexx.lang.RexxIO.Say((rn.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$01));
   }
  }/*lb*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /**
  * Loops/Continue
  */
 
 public static void loopsContinue(){
  netrexx.lang.Rexx nul;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Continue");
  
  nul=new netrexx.lang.Rexx('\000');
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$03);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((i_.right(new netrexx.lang.Rexx((byte)2))).OpCc(null,nul));
   if (i_.OpRem(null,$04).OpEq(null,$05)) 
    {
     netrexx.lang.RexxIO.Say("");
     continue i_;
    }
   netrexx.lang.RexxIO.Say($06.OpCc(null,nul));
   
   }
  }/*i_*/
  
  return;
  }

 /**
  * Loops/Do-while
  */
 
 public static void loopsDoWhile(){
  netrexx.lang.Rexx i_;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Do-while");
  
  i_=new netrexx.lang.Rexx((byte)0);
  {boolean $1=true;for(;;){if($1){$1=false;}else{if(i_.OpRem(null,$07).OpEq(null,$05))break;}
   i_=i_.OpAdd(null,$08);
   netrexx.lang.RexxIO.Say(i_);
   }
  }
  
  return;
  }

 /**
  * Loops/Downward for
  */
 
 public static void loopsDownwardFor(){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Downward for");
  
  {netrexx.lang.Rexx $2=$08.OpMinus(null);boolean $3=$2.OpGtEq(null,$05);i_=$03.OpPlus(null);i_:for(;$3?i_.OpLtEq(null,$09):i_.OpGtEq(null,$09);i_=i_.OpAdd(null,$2)){
   netrexx.lang.RexxIO.Say(i_.right(new netrexx.lang.Rexx((byte)2)));
   }
  }/*i_*/
  
  return;
  }

 /**
  * Loops/For
  */
 
 public static void loopsFor(){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/For");
  
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$010);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {int $4=i_.OpPlus(null).toint();for(;$4>0;$4--){
    netrexx.lang.RexxIO.Say("*\000");
    }
   }
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  
  return;
  }

 /**
  * Loops/For with a specified step
  */
 
 public static void loopsForSpecStep(){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/For with a specified step");
  
  {netrexx.lang.Rexx $5=$013;i_=$011.OpMinus(null).OpPlus(null);i_:for(;i_.OpLtEq(null,$012);i_=i_.OpAdd(null,$5)){
   netrexx.lang.RexxIO.Say((i_.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1))).OpCc(null,$01));
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /**
  * Loops/Foreach
  */
 
 public static void loopsForEach(){
  netrexx.lang.Rexx days[];
  java.util.List daysl;
  java.util.Iterator daysi;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Foreach");
  
  days=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Sunday"),netrexx.lang.Rexx.toRexx("Monday"),netrexx.lang.Rexx.toRexx("Tuesday"),netrexx.lang.Rexx.toRexx("Wednesday"),netrexx.lang.Rexx.toRexx("Thursday"),netrexx.lang.Rexx.toRexx("Friday"),netrexx.lang.Rexx.toRexx("Saturday")};
  daysl=java.util.Arrays.asList((java.lang.Object[])days);
  daysi=daysl.iterator();
  
  {for(;;){if(!(daysi.hasNext()))break;
   netrexx.lang.RexxIO.Say(daysi.next());
   }
  }
  
  return;
  }

 /**
  * Loops/Infinite
  */
 
 public static void loopsInfinite(){
  netrexx.lang.Rexx ct;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Infinite");
  
  ct=new netrexx.lang.Rexx((byte)0);
  {spam:for(;;){
   netrexx.lang.RexxIO.Say("SPAM");
   ct=ct.OpAdd(null,$08);
   if ((isDebug())&ct.OpGtEq(null,$014)) 
    {
     netrexx.lang.RexxIO.Say("Loverly SPAM, wonderful SPAM, SPAM, SPAM, SPAM!");
     break spam;
    }
   }
  }/*spam*/
  
  return;
  }

 /**
  * Loops/N plus one half
  */
 
 public static void loopsNplusHalf(){
  netrexx.lang.Rexx rs;
  netrexx.lang.Rexx istart;
  netrexx.lang.Rexx iend;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/N plus one half");
  
  rs=netrexx.lang.Rexx.toRexx("");
  istart=new netrexx.lang.Rexx((byte)1);
  iend=new netrexx.lang.Rexx((byte)10);
  {netrexx.lang.Rexx $6=iend;i_=istart.OpPlus(null);i_:for(;i_.OpLtEq(null,$6);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   rs=rs.OpCc(null,i_.right(new netrexx.lang.Rexx((byte)3)));
   if (i_.OpLt(null,iend)) 
    {
     rs=rs.OpCc(null,$015);
    }
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say(rs);
  
  return;
  }

 /**
  * Loops/Nested
  */
 
 public static void loopsNested(){
  java.util.Random rnd;
  int dim2[][];
  netrexx.lang.Rexx i1=null;
  netrexx.lang.Rexx i2=null;
  netrexx.lang.Rexx x1=null;
  netrexx.lang.Rexx x2=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Nested");
  
  rnd=new java.util.Random();
  dim2=new int[10][10];
  
  {int $7=new netrexx.lang.Rexx(dim2.length).OpPlus(null).toint();i1=new netrexx.lang.Rexx((byte)0);i1:for(;$7>0;$7--,i1=i1.OpAdd(null,new netrexx.lang.Rexx(1))){
   {int $8=new netrexx.lang.Rexx(dim2[i1.toint()].length).OpPlus(null).toint();i2=new netrexx.lang.Rexx((byte)0);i2:for(;$8>0;$8--,i2=i2.OpAdd(null,new netrexx.lang.Rexx(1))){
    dim2[i1.toint()][i2.toint()]=new netrexx.lang.Rexx(rnd.nextInt(20)).OpAdd(null,$08).toint();
    }
   }/*i2*/
   }
  }/*i1*/
  
  {try{int $9=new netrexx.lang.Rexx(dim2.length).OpPlus(null).toint();x1=new netrexx.lang.Rexx((byte)0);x1:for(;$9>0;$9--,x1=x1.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(x1.OpAdd(null,$08))).right(new netrexx.lang.Rexx((byte)4))).OpCc(null,$016));
   {try{int $10=new netrexx.lang.Rexx(dim2[x1.toint()].length).OpPlus(null).toint();x2=new netrexx.lang.Rexx((byte)0);x2:for(;$10>0;$10--,x2=x2.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(dim2[x1.toint()][x2.toint()])).right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$01));
    if (new netrexx.lang.Rexx(dim2[x1.toint()][x2.toint()]).OpEq(null,$017)) 
     break x1;
    }
   }
   finally{
    netrexx.lang.RexxIO.Say("");
   }}/*x2*/
   }
  }
  finally{
   netrexx.lang.RexxIO.Say("");
  }}/*x1*/
  
  return;
  }

 /**
  * Loops/While
  */
 
 public static void loopsWhile(){
  netrexx.lang.Rexx x_;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/While");
  
  x_=new netrexx.lang.Rexx((short)1024);
  {for(;;){if(!x_.OpGt(null,$05))break;
   netrexx.lang.RexxIO.Say(x_.right(new netrexx.lang.Rexx((byte)6)));
   x_=x_.OpDivI(null,$018);
   }
  }
  
  return;
  }

 
 protected static boolean isDebug(){
  return isTrue();
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RLoops(){return;}
 }
/*
 */

