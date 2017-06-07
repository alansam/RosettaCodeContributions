/* Generated from 'RIdentityMatrix01.nrx' 15 Jul 2013 17:05:54 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RIdentityMatrix01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RIdentityMatrix01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx createIdMatrix(netrexx.lang.Rexx n){
  netrexx.lang.Rexx DIM_;
  netrexx.lang.Rexx m;
  netrexx.lang.Rexx i=null;
  DIM_=netrexx.lang.Rexx.toRexx("DIMENSION");
  m=new netrexx.lang.Rexx((byte)0);
  m.getnode(DIM_).leaf=n;
  {netrexx.lang.Rexx $1=n;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   m.getnode(i).leaf.getnode(i).leaf=new netrexx.lang.Rexx((byte)1);
   }
  }/*i*/
  return m;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void displayIdMatrix(netrexx.lang.Rexx m){
  netrexx.lang.Rexx DIM_;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx ol=null;
  netrexx.lang.Rexx j=null;
  DIM_=netrexx.lang.Rexx.toRexx("DIMENSION");
  if ((m.exists(DIM_)).OpNot(null)) 
   throw new java.lang.RuntimeException("Matrix dimension not set");
  n=m.getnode(DIM_).leaf;
  {netrexx.lang.Rexx $2=n;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   ol=netrexx.lang.Rexx.toRexx("");
   {netrexx.lang.Rexx $3=n;j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$3);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
    ol=ol.OpCcblank(null,m.getnode(i).leaf.getnode(j).leaf);
    }
   }/*j*/
   netrexx.lang.RexxIO.Say(ol);
   }
  }/*i*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx n=null;
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$4);
  n=$4[0];}
  if (n.OpEq(null,$02)) 
   n=new netrexx.lang.Rexx((byte)5);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Identity Matrix of size").OpCcblank(null,n));
  displayIdMatrix(createIdMatrix(n));
  return;
  }
 
 private RIdentityMatrix01(){return;}
 }
