/* Generated from 'RZigZag.nrx' 14 Jul 2011 07:53:01 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Zig-zag matrix</h3>
 * <p>
 * Produce a zig-zag array. A zig-zag array is a square arrangement of the first N2 integers,
 * where the numbers increase sequentially as you zig-zag along the anti-diagonals of the array.
 * For a graphical representation, see <a href="http://en.wikipedia.org/wiki/Image:JPEG_ZigZag.svg">JPG zigzag</a>
 * (JPG uses such arrays to encode images).
 * </p>
 * <p>
 * For example, given 5, produce this array:
 * </p>
 * <pre>
 *  0  1  5  6 14
 *  2  4  7 13 15
 *  3  8 12 16 21
 *  9 11 17 20 22
 * 10 18 19 23 24
 * </pre>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Zig-zag_matrix">rosettacode.org/wiki/Zig-zag_matrix</a>
 */


public class RZigZag{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RZigZag.nrx";
 
 public static void main(java.lang.String $0s[]){
  zigzag(new netrexx.lang.Rexx((byte)5));
  
  return;
  }

 
 public static void zigzag(netrexx.lang.Rexx msize){
  int row;
  int col;
  netrexx.lang.Rexx ziggy;
  int j_=0;
  netrexx.lang.Rexx L;
  java.lang.String rowOut=null;
  
  row=1;
  col=1;
  
  ziggy=new netrexx.lang.Rexx((byte)0);
  {int $1=msize.OpMult(null,msize).OpPlus(null).toint();j_=0;j_:for(;$1>0;$1--,j_++){
   ziggy.getnode(new netrexx.lang.Rexx(row)).leaf.getnode(new netrexx.lang.Rexx(col)).leaf=new netrexx.lang.Rexx(j_);
   if ((((row+col))%2)==0) 
    {
     if (new netrexx.lang.Rexx(col).OpLt(null,msize)) 
      col++;
     else 
      row=row+2;
     if (row!=1) 
      row--;
    }
   else 
    {
     if (new netrexx.lang.Rexx(row).OpLt(null,msize)) 
      row++;
     else 
      col=col+2;
     if (col!=1) 
      col--;
    }
   }
  }/*j_*/
  
  L=(msize.OpMult(null,msize).OpSub(null,$01)).length();/*for a constant element width.  */
  {int $2=msize.OpPlus(null).toint();row=1;row:for(;$2>0;$2--,row++){/*show all the matrix's rows.    */
   rowOut="";
   {int $3=msize.OpPlus(null).toint();col=1;col:for(;$3>0;$3--,col++){
    rowOut=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(rowOut).OpCcblank(null,ziggy.getnode(new netrexx.lang.Rexx(row)).leaf.getnode(new netrexx.lang.Rexx(col)).leaf.right(L)));
    }
   }/*col*/
   netrexx.lang.RexxIO.Say(rowOut);
   }
  }/*row*/
  
  return;
  }
 
 private RZigZag(){return;}
 }
