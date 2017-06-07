/* Generated from 'RIdentityMatrix00.nrx' 15 Jul 2013 16:51:07 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* show identity matrix of size n
* I consider m[i,j] to represent the matrix
* 09.07.2013 Walter Pachl (translated from REXX Version 2)
**********************************************************************/



public class RIdentityMatrix00{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RIdentityMatrix00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n=null;
  int m[][];
  int i=0;
  java.lang.String ol=null;
  int j=0;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  n=$1[0];}
  if (n.OpEq(null,$02)) 
   n=new netrexx.lang.Rexx((byte)5);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Identity Matrix of size").OpCcblank(null,n)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(m[i,j] IS the Matrix)")));
  m=new int[n.toint()][n.toint()]; // Allocate 2D array at run-time
  {int $2=n.OpSub(null,$03).toint();i=0;i:for(;i<=$2;i++){ // Like Java, arrays in NetRexx start at 0
   ol="";
   {int $3=n.OpSub(null,$03).toint();j=0;j:for(;j<=$3;j++){
    m[i][j]=(int)((i==j)?1:0);
    ol=ol+" "+m[i][j];
    }
   }/*j*/
   netrexx.lang.RexxIO.Say(ol);
   }
  }/*i*/
  return;}
 
 private RIdentityMatrix00(){return;}
 }
