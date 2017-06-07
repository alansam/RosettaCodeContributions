/* Generated from 'RSortingPermutationsort.nrx' 27 Apr 2013 09:40:15 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */








public class RSortingPermutationsort{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("passes (of");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("s.");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final char[] $08={2,1,44,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RSortingPermutationsort.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 /* properties private static */
 private static netrexx.lang.Rexx iterations;
 private static netrexx.lang.Rexx maxIterations;

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List permutationSort(java.util.List vlist){
  RPermutationIterator perm;
  java.util.List pl=null;
  perm=new RPermutationIterator(vlist);
  iterations=new netrexx.lang.Rexx((byte)0);
  maxIterations=RPermutationIterator.factorial(new netrexx.lang.Rexx(vlist.size()));
  {$2:for(;;){if(!(perm.hasNext()))break;
   iterations=iterations.OpAdd($1,$02);
   pl=(java.util.List)(perm.next());
   if (isSorted(pl)) 
    break $2;
   else 
    pl=(java.util.List)null;
   }
  }
  return pl;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static boolean isSorted(java.util.List ss){
  boolean status;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx vleft=null;
  netrexx.lang.Rexx vright=null;
  boolean vtest=false;
  status=isTrue();
  {ix=new netrexx.lang.Rexx((byte)1);ix:for(;;ix=ix.OpAdd($1,new netrexx.lang.Rexx(1))){if(!ix.OpLt($1,new netrexx.lang.Rexx(ss.size())))break;
   vleft=(netrexx.lang.Rexx)(ss.get(ix.OpSub($1,$02).toint()));
   vright=(netrexx.lang.Rexx)(ss.get(ix.toint()));
   if ((vleft.datatype(new netrexx.lang.Rexx('N'))).OpAnd($1,vright.datatype(new netrexx.lang.Rexx('N')))) 
    vtest=vleft.OpGt($1,vright); // For numeric types we must use regular comparison.
   else 
    vtest=vleft.OpGtS($1,vright); // For non-numeric/mixed types we must do strict comparison.
   if (vtest) 
    {
     status=isFalse();
     break ix;
    }
   }
  }/*ix*/
  return status;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx placesList;
  netrexx.lang.Rexx anotherList;
  netrexx.lang.Rexx reversed;
  netrexx.lang.Rexx unsorted;
  java.util.List lists[];
  netrexx.lang.Rexx il=null;
  java.util.List vlist=null;
  long runtime=0;
  java.util.List rlist=null;
  placesList=netrexx.lang.Rexx.toRexx("UK  London,     US  New York,   US  Boston,     US  Washington").OpCcblank($1,netrexx.lang.Rexx.toRexx("UK  Washington, US  Birmingham, UK  Birmingham, UK  Boston"));
  
  
  anotherList=netrexx.lang.Rexx.toRexx("Alpha, Beta, Gamma, Beta");
  reversed=netrexx.lang.Rexx.toRexx("7, 6, 5, 4, 3, 2, 1");
  unsorted=netrexx.lang.Rexx.toRexx("734, 3, 1, 24, 324, -1024, -666, -1, 0, 324, 99999999");
  lists=new java.util.List[]{makeList(placesList),makeList(anotherList),makeList(reversed),makeList(unsorted)};
  {il=new netrexx.lang.Rexx((byte)0);il:for(;;il=il.OpAdd($1,new netrexx.lang.Rexx(1))){if(!il.OpLt($1,new netrexx.lang.Rexx(lists.length)))break;
   vlist=lists[il.toint()];
   netrexx.lang.RexxIO.Say(vlist);
   runtime=java.lang.System.nanoTime();
   rlist=permutationSort(vlist);
   runtime=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(runtime)).tolong();
   if (rlist!=null) 
    netrexx.lang.RexxIO.Say(rlist);
   else 
    netrexx.lang.RexxIO.Say("sort failed");
   netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx.toRexx("This permutation sort of").OpCcblank($1,new netrexx.lang.Rexx(vlist.size()))).OpCcblank($1,netrexx.lang.Rexx.toRexx("elements took"))).OpCcblank($1,iterations)).OpCcblank($1,$03)).OpCcblank($1,maxIterations)).OpCc($1,netrexx.lang.Rexx.toRexx(") to complete. \000")));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(runtime).OpDiv($1,$04.OpPow($1,$05))))).OpCc($1,$06));
   netrexx.lang.RexxIO.Say("");
   }
  }/*il*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.List makeList(netrexx.lang.Rexx in){
  java.util.ArrayList lst;
  netrexx.lang.Rexx val=null;
  lst=new java.util.ArrayList();
  {for(;;){if(!in.OpGt($1,$07))break;
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(in,$08,$3);
   val=$3[0];in=$3[1];}
   lst.add((java.lang.Object)(val.strip()));
   }
  }
  return (java.util.List)lst;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  runSample(new netrexx.lang.Rexx(args));
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isTrue(){
  return (1==1);
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isFalse(){
  return (1==0);
  }
 
 private RSortingPermutationsort(){return;}
 }
