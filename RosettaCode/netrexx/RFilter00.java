/* Generated from 'RFilter00.nrx' 15 Jul 2013 22:18:13 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RFilter00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)5000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('\000');
 private static final java.lang.String $0="RFilter00.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sd1[]=null;
  netrexx.lang.Rexx sd2[]=null;
  java.util.ArrayList clist;
  java.util.ListIterator li;
  netrexx.lang.Rexx e_=null;
  
  
  
  
  netrexx.lang.RexxIO.Say("Test data:");
  sd1=makeSampleData(new netrexx.lang.Rexx((byte)100));
  display(sd1);
  clist=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])sd1)));
  li=clist.listIterator();
  {for(;;){if(!(li.hasNext()))break;
   e_=(netrexx.lang.Rexx)(li.next());
   if (e_.OpRem($1,$02).OpNotEq($1,$03)) 
    li.remove();
   }
  }
  netrexx.lang.RexxIO.Say("Option 1 (copy to a new array):");
  sd2=(netrexx.lang.Rexx[])(clist.toArray((java.lang.Object[])(new netrexx.lang.Rexx[clist.size()])));
  display(sd2);
  netrexx.lang.RexxIO.Say("Option 2 (replace the original array):");
  sd1=(netrexx.lang.Rexx[])(clist.toArray((java.lang.Object[])(new netrexx.lang.Rexx[clist.size()])));
  display(sd1);
  
  return;
  }

 // ---------------------------------------------------------------------------
 
 public static void display(netrexx.lang.Rexx sd[]){
  netrexx.lang.Rexx i_=null;
  
  netrexx.lang.RexxIO.Say($04.copies(new netrexx.lang.Rexx((byte)80)));
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(sd.length).OpSub($1,$05);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq($1,$2);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((sd[i_.toint()]).OpCcblank($1,$06));
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 // ---------------------------------------------------------------------------
 
 public static netrexx.lang.Rexx[] makeSampleData(netrexx.lang.Rexx size){
  netrexx.lang.Rexx sd[];
  netrexx.lang.Rexx e_=null;
  
  sd=new netrexx.lang.Rexx[size.toint()];
  {netrexx.lang.Rexx $3=size.OpSub($1,$05);e_=new netrexx.lang.Rexx((byte)0);e_:for(;e_.OpLtEq($1,$3);e_=e_.OpAdd($1,new netrexx.lang.Rexx(1))){
   sd[e_.toint()]=e_.OpAdd($1,$05);
   }
  }/*e_*/
  
  return sd;
  }
 
 private RFilter00(){return;}
 }
