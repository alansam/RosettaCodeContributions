/* Generated from 'RCompareListOfStrings01.nrx' 30 Jun 2014 17:21:50 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RCompareListOfStrings01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("List:");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("  ");
 private static final java.lang.String $0="RCompareListOfStrings01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isEqual(netrexx.lang.Rexx list[]){
  boolean state;
  int ix=0;
  state=(1==1); // default to true
  {ix=1;ix:for(;;ix++){if(!(ix<list.length))break;
   state=(list[ix-1]).OpEqS(null,list[ix]);
   if ((!state)) 
    break ix;
   }
  }/*ix*/
  return state;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isAscending(netrexx.lang.Rexx list[]){
  boolean state;
  int ix=0;
  state=(1==1); // default to true
  {ix=1;ix:for(;;ix++){if(!(ix<list.length))break;
   state=(list[ix-1]).OpLtS(null,list[ix]);
   if ((!state)) 
    break ix;
   }
  }/*ix*/
  return state;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samples[][];
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx sample[]=null;
  netrexx.lang.Rexx eq=null;
  netrexx.lang.Rexx asc=null;
  
  samples=new netrexx.lang.Rexx[][]{new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("BB"),netrexx.lang.Rexx.toRexx("CC")},new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("AA")},new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("AA"),netrexx.lang.Rexx.toRexx("CC"),netrexx.lang.Rexx.toRexx("BB")},new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("single_element")}};
  
  
  
  
  
  
  {ix=new netrexx.lang.Rexx((byte)0);ix:for(;;ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){if(!ix.OpLt(null,new netrexx.lang.Rexx(samples.length)))break;
   sample=samples[ix.toint()];
   if (isEqual(sample)) 
    eq=netrexx.lang.Rexx.toRexx("elements are identical");
   else 
    eq=netrexx.lang.Rexx.toRexx("elements are not identical");
   if (isAscending(sample)) 
    asc=netrexx.lang.Rexx.toRexx("elements are in ascending order");
   else 
    asc=netrexx.lang.Rexx.toRexx("elements are not in ascending order");
   netrexx.lang.RexxIO.Say($01.OpCcblank(null,netrexx.lang.Rexx.toRexx(java.util.Arrays.toString((java.lang.Object[])sample))));
   netrexx.lang.RexxIO.Say($02.OpCc(null,eq));
   netrexx.lang.RexxIO.Say($02.OpCc(null,asc));
   }
  }/*ix*/
  return;
  }
 
 private RCompareListOfStrings01(){return;}
 }
