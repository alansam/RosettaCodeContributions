/* Generated from 'RIdentityMatrix.nrx' 15 Jul 2013 13:09:03 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* show identity matrix of size n
* I consider m[i,j] to represent the matrix
* 09.07.2013 Walter Pachl (translated from REXX Version 2)
**********************************************************************/



public class RIdentityMatrix{
 private static final char[] $01={1,10,1,0,0};
 private static final java.lang.String $0="RIdentityMatrix.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n=null;
  int m[][];
  int i=0;
  java.lang.String ol=null;
  int j=0;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  n=$1[0];}
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Identity Matrix of size").OpCcblank(null,n)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(m[i,j] IS the Matrix)")));
  m=new int[100][100];
  {int $2=n.toint();i=1;i:for(;i<=$2;i++){
   ol="";
   {int $3=n.toint();j=1;j:for(;j<=$3;j++){
    m[i][j]=(int)((i==j)?1:0);
    ol=ol+" "+m[i][j];
    }
   }/*j*/
   netrexx.lang.RexxIO.Say(ol);
   }
  }/*i*/
  return;}
 
 private RIdentityMatrix(){return;}
 }
