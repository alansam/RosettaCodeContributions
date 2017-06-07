/* Generated from 'RHornersRuleForPolynomialEval00.nrx' 6 Nov 2015 23:22:17 [v3.04] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RHornersRuleForPolynomialEval00{
 private static final java.lang.String $0="RHornersRuleForPolynomialEval00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  sample(arg);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void sample(netrexx.lang.Rexx arg){
  int coefficients[];
  int x_;
  int accumulator;
  int i_=0;
  /*
   * Pseudocode
   * coefficients := [-19, 7, -4, 6] # list coefficients of all x^0..x^n in order
   * x := 3
   * accumulator := 0
   * for i in length(coefficients) downto 1 do
   *     # Assumes 1-based indexing for arrays
   *     accumulator := ( accumulator * x ) + coefficients[i]
   * done
   * # accumulator now has the answer
   */
  
  coefficients=new int[]{-19,7,-4,6};
  x_=3;
  accumulator=0;
  
  {i_=coefficients.length-1;i_:for(;i_>=0;i_--){
   accumulator=((accumulator*x_))+coefficients[i_];
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say(accumulator);
  return;
  }
 
 private RHornersRuleForPolynomialEval00(){return;}
 }
