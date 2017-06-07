/* Generated from 'RWriteFloatArray.nrx' 31 Aug 2011 16:25:01 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/**
 * <h3>Write float arrays to a text file</h3>
 * <p>
 * Write two equal-sized numerical arrays 'x' and 'y' to a two-column text file named 'filename'.
 * </p>
 * <p>
 * The first column of the file contains values from an 'x'-array with a given 'xprecision', the second -- values from 'y'-array with 'yprecision'.
 * </p>
 * <p>
 * For example, considering:
 * </p>
 * <pre>
 *   x = {1, 2, 3, 1e11};
 *   y = {1, 1.4142135623730951, 1.7320508075688772, 316227.76601683791}; 
 *                                                        &#x2F;&#x2A; sqrt(x) &#x2A;&#x2F;
 *   xprecision = 3;
 *   yprecision = 5;
 * </pre>
 * <p>
 * The file is:
 * </p>
 * <pre>
 *   1    1
 *   2    1.4142
 *   3    1.7321
 *   1e+011   3.1623e+005
 * </pre>
 * <p>
 * This task is intended as a subtask for
 * <a href="http://rosettacode.org/wiki/Measure_relative_performance_of_sorting_algorithms_implementations">Measure relative performance of sorting algorithms implementations</a>.
 * </p>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Write_float_arrays_to_a_text_file">http://rosettacode.org/wiki/Write_float_arrays_to_a_text_file</a>
 */

// Invent a target text file name based on this program's source file name

public class RWriteFloatArray{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("Java method RWriteFloatArray.nrx");
 private static final char[] $02={2,4,46,110,114,120,10,3,0,0,1,1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx(".txt");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RWriteFloatArray.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx pgmName=null;
  netrexx.lang.Rexx outFile;
  java.lang.Exception ex=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  pgmName=$1[1];}
  outFile=pgmName.OpCc(null,$03);
  
  {try{
   formatArrays(outFile,new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx("1e+11")},new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx("1.4142135623730951"),new netrexx.lang.Rexx("1.7320508075688772"),new netrexx.lang.Rexx("316227.76601683791")});
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 /**
  *
  * This function formats the input arrays.
  * <p>
  * It has defaults for the <strong><code>x</code></strong> &amp. <strong><code>y</code></strong> precision values of 3 &amp. 5
  * </p>
  *
  * @param outFile
  * @param xf
  * @param yf
  * @param xprecision
  * @param yprecision
  * @throws IllegalArgumentException
  * @throws FileNotFoundException
  * @throws IOException
  *
  */
 
 public static void formatArrays(netrexx.lang.Rexx outFile,netrexx.lang.Rexx xf[],netrexx.lang.Rexx yf[]) throws java.lang.IllegalArgumentException,java.io.FileNotFoundException,java.io.IOException{
  formatArrays(outFile,xf,yf,new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5));return;
  }
 public static void formatArrays(netrexx.lang.Rexx outFile,netrexx.lang.Rexx xf[],netrexx.lang.Rexx yf[],netrexx.lang.Rexx xprecision) throws java.lang.IllegalArgumentException,java.io.FileNotFoundException,java.io.IOException{
  formatArrays(outFile,xf,yf,xprecision,new netrexx.lang.Rexx((byte)5));return;
  }
 public static void formatArrays(netrexx.lang.Rexx outFile,netrexx.lang.Rexx xf[],netrexx.lang.Rexx yf[],netrexx.lang.Rexx xprecision,netrexx.lang.Rexx yprecision) throws java.lang.IllegalArgumentException,java.io.FileNotFoundException,java.io.IOException{
  java.io.BufferedWriter fw;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx row=null;
  
  
  if (new netrexx.lang.Rexx(xf.length).OpGt(null,new netrexx.lang.Rexx(yf.length))) 
   throw new java.lang.IllegalArgumentException("Y array must be at least as long as X array");
  
  fw=new java.io.BufferedWriter((java.io.Writer)(new java.io.OutputStreamWriter((java.io.OutputStream)(new java.io.FileOutputStream(netrexx.lang.Rexx.toString(outFile))))));
  
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(xf.length).OpSub(null,$04);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$3);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   row=(xf[i_.toint()].format((netrexx.lang.Rexx)null,xprecision,(netrexx.lang.Rexx)null,xprecision).left(new netrexx.lang.Rexx((byte)15))).OpCcblank(null,yf[i_.toint()].format((netrexx.lang.Rexx)null,yprecision,(netrexx.lang.Rexx)null,yprecision));
   netrexx.lang.RexxIO.Say(row);
   ((java.io.Writer)fw).write(netrexx.lang.Rexx.toString(row));
   fw.newLine();
   }
  }/*i_*/
  fw.close();
  
  return;
  }
 
 private RWriteFloatArray(){return;}
 }
