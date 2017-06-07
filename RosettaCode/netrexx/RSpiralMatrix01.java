/* Generated from 'RSpiralMatrix01.nrx' 23 Jun 2012 10:04:29 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */

// =============================================================================


public class RSpiralMatrix01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('|');
 private static final java.lang.String $0="RSpiralMatrix01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx size=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  size=$1[0];}
  
  if ((size.datatype(new netrexx.lang.Rexx('W'))).OpNot(null)) 
   {
    printArray(generateArray(3));
    netrexx.lang.RexxIO.Say("");
    
    printArray(generateArray(4));
    netrexx.lang.RexxIO.Say("");
    
    printArray(generateArray(5));
    netrexx.lang.RexxIO.Say("");
   }
  else 
   {
    printArray(generateArray(size.toint()));
    netrexx.lang.RexxIO.Say("");
   }
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 private static int[][] generateArray(int dimension){
  int array[][];
  int squares;
  int sidelength;
  int current;
  int i_=0;
  int j_=0;
  
  // the output array
  array=new int[dimension][dimension];
  
  // get the number of squares, including the center one if
  // the dimension is odd
  
  squares=(dimension/2)+(dimension%2);
  
  // length of a side for the current square
  sidelength=dimension;
  current=0;
  
  {int $2=squares-1;i_=0;i_:for(;i_<=$2;i_++){
   
   // do each side of the current square
   // top side
   {int $3=sidelength-1;j_=0;j_:for(;j_<=$3;j_++){
    array[i_][i_+j_]=current;
    current++;
    }
   }/*j_*/
   
   // down the right side
   {int $4=sidelength-1;j_=1;j_:for(;j_<=$4;j_++){
    array[i_+j_][(dimension-1)-i_]=current;
    current++;
    }
   }/*j_*/
   
   // across the bottom
   {j_=sidelength-2;j_:for(;j_>=0;j_--){
    array[(dimension-1)-i_][i_+j_]=current;
    current++;
    }
   }/*j_*/
   
   // and up the left side
   {j_=sidelength-2;j_:for(;j_>=1;j_--){
    array[i_+j_][i_]=current;
    current++;
    }
   }/*j_*/
   
   // reduce the length of the side by two rows
   sidelength=sidelength-2;
   }
  }/*i_*/
  
  return array;
  }

 // -----------------------------------------------------------------------------
 
 private static void printArray(int array[][]){
  int dimension;
  netrexx.lang.Rexx rl;
  int i_=0;
  netrexx.lang.Rexx line=null;
  int j_=0;
  
  dimension=array[1].length;
  rl=formatSize(array);
  {int $5=dimension-1;i_=0;i_:for(;i_<=$5;i_++){
   line=new netrexx.lang.Rexx('|');
   {int $6=dimension-1;j_=0;j_:for(;j_<=$6;j_++){
    line=line.OpCcblank(null,(new netrexx.lang.Rexx(array[i_][j_])).right(rl));
    }
   }/*j_*/
   line=line.OpCcblank(null,$02);
   netrexx.lang.RexxIO.Say(line);
   }
  }/*i_*/
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 private static netrexx.lang.Rexx formatSize(int array[][]){
  int dim;
  netrexx.lang.Rexx maxNum;
  
  dim=array[1].length;
  maxNum=(new netrexx.lang.Rexx((dim*dim)-1)).length();
  
  return maxNum;
  }
 
 private RSpiralMatrix01(){return;}
 }
// =============================================================================
/*

Output:

|  0  1  2 |
|  7  8  3 |
|  6  5  4 |

|  0  1  2  3 |
| 11 12 13  4 |
| 10 15 14  5 |
|  9  8  7  6 |

|  0  1  2  3  4 |
| 15 16 17 18  5 |
| 14 23 24 19  6 |
| 13 22 21 20  7 |
| 12 11 10  9  8 |
*/
// =============================================================================

