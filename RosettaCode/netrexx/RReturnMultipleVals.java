/* Generated from 'RReturnMultipleVals.nrx' 9 Jan 2013 20:24:44 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// =============================================================================

public class RReturnMultipleVals{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final char[] $03={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(',');
 private static final java.lang.String $0="RReturnMultipleVals.nrx";
 /* properties constant */
 protected static final netrexx.lang.Rexx L=new netrexx.lang.Rexx('L');
 protected static final netrexx.lang.Rexx R=new netrexx.lang.Rexx('R');
 protected static final netrexx.lang.Rexx K_lipsum=netrexx.lang.Rexx.toRexx("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
 protected static final netrexx.lang.Rexx K_1024=new netrexx.lang.Rexx((short)1024);

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RReturnMultipleVals(){super();
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx nv_=null;
  netrexx.lang.Rexx sv_=null;
  RReturnMultipleVals lcl;
  netrexx.lang.Rexx rvr;
  netrexx.lang.Rexx val1=null;
  netrexx.lang.Rexx val2=null;
  RReturnMultipleVals.Pair rvp;
  java.util.List rvl;
  java.util.Map rvm;
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  nv_=$1[0];sv_=$1[1];}
  if ((nv_.datatype(new netrexx.lang.Rexx('n'))).OpNot(null)) 
   nv_=K_1024;
  if (sv_.OpEq(null,$02)) 
   sv_=K_lipsum;
  
  lcl=new RReturnMultipleVals();
  
  rvr=lcl.getPair(nv_,sv_); // multiple values returned as a string.  Use PARSE to extract values
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(rvr,$03,$2);
  val1=$2[0];val2=$2[1];}
  netrexx.lang.RexxIO.Say("Results extracted from a NetRexx string:");
  netrexx.lang.RexxIO.Say((val1.OpCc(null,$04)).OpCcblank(null,val2));
  netrexx.lang.RexxIO.Say("");
  
  rvr=lcl.getPairFromRexx(nv_,sv_); // values returned in a NetRexx indexed string
  netrexx.lang.RexxIO.Say("Results extracted from a NetRexx \"indexed string\":");
  netrexx.lang.RexxIO.Say(((rvr.getnode(L).leaf).OpCc(null,$04)).OpCcblank(null,rvr.getnode(R).leaf));
  netrexx.lang.RexxIO.Say("");
  
  rvp=lcl.getPairFromPair(nv_,sv_); // values returned in a bespoke object
  netrexx.lang.RexxIO.Say("Results extracted from a composite object:");
  netrexx.lang.RexxIO.Say(((rvp.getLeftVal()).OpCc(null,$04)).OpCcblank(null,rvp.getRightVal()));
  netrexx.lang.RexxIO.Say("");
  
  rvl=lcl.getPairFromList(nv_,sv_); // values returned in a Java Collection "List" object
  netrexx.lang.RexxIO.Say("Results extracted from a Java Colections \"List\" object:");
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(java.lang.String.valueOf(rvl.get(0))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(rvl.get(1)))));
  netrexx.lang.RexxIO.Say("");
  
  rvm=lcl.getPairFromMap(nv_,sv_); // values returned in a Java Collection "Map" object
  netrexx.lang.RexxIO.Say("Results extracted from a Java Colections \"Map\" object:");
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(java.lang.String.valueOf(rvm.get((java.lang.Object)L))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(rvm.get((java.lang.Object)R)))));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // returns the values in a NetRexx string.
 //  Caller can the power of PARSE to extract the results
 
 public netrexx.lang.Rexx getPair(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){
  return nv_.OpCcblank(null,sv_);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Return the values as members of a NetRexx indexed string
 
 public netrexx.lang.Rexx getPairFromRexx(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){
  netrexx.lang.Rexx rval;
  rval=netrexx.lang.Rexx.toRexx("");
  rval.getnode(L).leaf=nv_;
  rval.getnode(R).leaf=sv_;
  return rval;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Return a bespoke object.
 // Permits any number and type of value to be returned
 
 public RReturnMultipleVals.Pair getPairFromPair(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){
  RReturnMultipleVals.Pair rset;
  rset=new RReturnMultipleVals.Pair(nv_,sv_);
  return rset;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Exploit Java Collections classes to assemble a collection of results.
 // This example uses java.util.List
 
 public java.util.List getPairFromList(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){
  java.util.ArrayList rset;
  rset=new java.util.ArrayList();
  rset.add((java.lang.Object)nv_);
  rset.add((java.lang.Object)sv_);
  return (java.util.List)rset;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // This example uses java.util.Map
 
 public java.util.Map getPairFromMap(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){
  java.util.HashMap rset;
  rset=new java.util.HashMap();
  rset.put((java.lang.Object)L,(java.lang.Object)nv_);
  rset.put((java.lang.Object)R,(java.lang.Object)sv_);
  return (java.util.Map)rset;
  }

// =============================================================================
 
 class Pair{
  private final transient java.lang.String $0="RReturnMultipleVals.nrx";
 
  /* properties indirect */
  private netrexx.lang.Rexx leftVal;
  private netrexx.lang.Rexx rightVal;

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  public Pair(){
   this(RReturnMultipleVals.this.K_1024,RReturnMultipleVals.this.K_lipsum);return;
   }
  public Pair(netrexx.lang.Rexx nv_){
   this(nv_,RReturnMultipleVals.this.K_lipsum);return;
   }
  public Pair(netrexx.lang.Rexx nv_,netrexx.lang.Rexx sv_){super();
   this.setLeftVal(nv_);
   this.setRightVal(sv_);
   return;
   }
  
  public netrexx.lang.Rexx getLeftVal(){return leftVal;}
  
  public void setLeftVal(netrexx.lang.Rexx $1){leftVal=$1;return;}
  
  public netrexx.lang.Rexx getRightVal(){return rightVal;}
  
  public void setRightVal(netrexx.lang.Rexx $2){rightVal=$2;return;}
 }}
