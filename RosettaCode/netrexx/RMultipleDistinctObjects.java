/* Generated from 'RMultipleDistinctObjects.nrx' 7 Aug 2013 17:25:56 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RMultipleDistinctObjects{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RMultipleDistinctObjects.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx nn=null;
  netrexx.lang.Rexx nList1;
  netrexx.lang.Rexx nr=null;
  netrexx.lang.Rexx rv=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  nn=$1[0];}
  if (nn.OpEq(null,$02)) 
   nn=new netrexx.lang.Rexx((byte)10);
  nList1=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=nn;nr=new netrexx.lang.Rexx((byte)1);nr:for(;nr.OpLtEq(null,$2);nr=nr.OpAdd(null,new netrexx.lang.Rexx(1))){
   nList1.getnode(nr).leaf=new netrexx.lang.Rexx("");
   }
  }/*nr*/
  nList1.getnode(new netrexx.lang.Rexx((byte)1)).leaf=(nList1.getnode(new netrexx.lang.Rexx((byte)1)).leaf).OpCc(null,$03);
  nList1.getnode(nn.OpDivI(null,$04)).leaf=(nList1.getnode(nn.OpDivI(null,$04)).leaf).OpCc(null,nn.OpDivI(null,$04));
  {netrexx.lang.Rexx $3=nn;rv=new netrexx.lang.Rexx((byte)1);rv:for(;rv.OpLtEq(null,$3);rv=rv.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((rv.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,nList1.getnode(rv).leaf));
   }
  }/*rv*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RMultipleDistinctObjects(){return;}
 }
