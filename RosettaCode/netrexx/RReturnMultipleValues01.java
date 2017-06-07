/* Generated from 'RReturnMultipleValues01.nrx' 10 Oct 2012 22:36:33 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RReturnMultipleValues01{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(',');
 private static final java.lang.String $0="RReturnMultipleValues01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx term;
  netrexx.lang.Rexx vals;
  java.util.Map vm;
  java.util.Queue vq;
  term=getPair(); // return values as NetRexx string
  displayPair(term);
  
  vals=getPairFromRexx();
  term=(vals.getnode(new netrexx.lang.Rexx('L')).leaf).OpCcblank(null,vals.getnode(new netrexx.lang.Rexx('R')).leaf); // put return values into a NetRexx string
  displayPair(term);
  
  vm=getPairFromMap();
  term=new netrexx.lang.Rexx(java.lang.String.valueOf(vm.get((java.lang.Object)(new netrexx.lang.Rexx('L'))))).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vm.get((java.lang.Object)(new netrexx.lang.Rexx('R')))))); // put return values into a NetRexx string
  displayPair(term);
  
  vq=getPairFromQueue();
  term=new netrexx.lang.Rexx(java.lang.String.valueOf(vq.poll())).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vq.poll()))); // put return values into a NetRexx string
  displayPair(term);
  
  return;
  }

 // At it's simplest NetRexx can exploit the typeless capability of the language to store results in a parseable string
 
 public static netrexx.lang.Rexx getPair(){
  netrexx.lang.Rexx lval;
  netrexx.lang.Rexx rval;
  lval=new netrexx.lang.Rexx((byte)10);
  rval=new netrexx.lang.Rexx((byte)20);
  return lval.OpCcblank(null,rval);
  }

 // NetRexx also allows data to be stored in indexed string variables which can then be accessed by name
 
 public static netrexx.lang.Rexx getPairFromRexx(){
  netrexx.lang.Rexx rVal;
  rVal=netrexx.lang.Rexx.toRexx("");
  rVal.getnode(new netrexx.lang.Rexx('L')).leaf=new netrexx.lang.Rexx((byte)10);
  rVal.getnode(new netrexx.lang.Rexx('R')).leaf=new netrexx.lang.Rexx((byte)20);
  return rVal;
  }

 // NetRexx also provides access to complex Java object types.  [This example uses a Map]
 
 public static java.util.Map getPairFromMap(){
  java.util.HashMap rm;
  rm=new java.util.HashMap();
  rm.put((java.lang.Object)(new netrexx.lang.Rexx('L')),(java.lang.Object)(new netrexx.lang.Rexx(10)));
  rm.put((java.lang.Object)(new netrexx.lang.Rexx('R')),(java.lang.Object)(new netrexx.lang.Rexx(20)));
  return (java.util.Map)rm;
  }

 // NetRexx also provides access to complex Java object types.  [This example uses a Queue]
 
 public static java.util.Queue getPairFromQueue(){
  java.util.LinkedList rq;
  rq=new java.util.LinkedList();
  rq.add((java.lang.Object)(new netrexx.lang.Rexx(10)));
  rq.add((java.lang.Object)(new netrexx.lang.Rexx(20)));
  return (java.util.Queue)rq;
  }

 // NetRexx parse will extract typeless values from a string
 
 public static void displayPair(netrexx.lang.Rexx term){
  netrexx.lang.Rexx lVal=null;
  netrexx.lang.Rexx rVal=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(term,$01,$1);
  lVal=$1[0];rVal=$1[1];}
  netrexx.lang.RexxIO.Say((lVal.OpCc(null,$02)).OpCcblank(null,rVal));
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RReturnMultipleValues01(){return;}
 }
