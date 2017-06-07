/* Generated from 'RAplusB.nrx' 3 Jul 2011 00:49:56 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <strong>A+B</strong> - in programming contests, classic problem, which is given so contestants can
 * gain familiarity with online judging system being used.
 * <p>
 * A+B is one of few problems on contests, which traditionally lacks fabula.
 *
 * <h4>Problem statement</h4>
 * <p>
 * Given 2 integer numbers, A and B. One needs to find their sum.
 * </p>
 * <dl>
 * <dt>Input data</dt>
 * <dd>Two integer numbers are written in the input stream, separated by space.
 * <br />
 * <code>(-1000 <= A, B <= +1000)</code>
 * </dd>
 * <dt>Output data</dt>
 * <dd>The required output is one integer: the sum of A and B.</dd>
 * </dl>
 * <h5>Example:</h5>
 * <table>
 * <thead>
 * <tr>
 * <th>Input</th><th>Output</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>2 2</td><td>4</td>
 * </tr>
 * <tr>
 * <td>3 2</td><td>5</td>
 * </tr>
 * </tbody>
 * </table>
 *
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/A%2BB">rosettacode.org/wiki/A%2BB</a>
 */


public class RAplusB{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('=');
 private static final java.lang.String $0="RAplusB.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx b=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  a=$1[0];b=$1[1];}
  netrexx.lang.RexxIO.Say((((a.OpCcblank(null,$02)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpAdd(null,b)));
  return;}
 
 private RAplusB(){return;}
 }
