/* Generated from 'RSortingBubblesort01.nrx' 26 Sep 2011 20:22:35 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingBubblesort01{
 private static final java.lang.String $0="RSortingBubblesort01.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String sortedList[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  sortedList=bubbleSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)));
  
  lists=new java.lang.String[][]{placesList,sortedList};
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    netrexx.lang.RexxIO.Say(cl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  return;
  }

 
 public static final java.lang.String[] bubbleSort(java.lang.String list[]){
  java.lang.String rl[];
  java.util.ArrayList al;
  
  rl=new java.lang.String[list.length];
  al=bubbleSort(java.util.Arrays.asList((java.lang.Object[])list));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList bubbleSort(java.util.List list){
  int listLen;
  java.util.ArrayList rlist;
  int i_=0;
  int j_=0;
  java.lang.Object cmpi=null;
  java.lang.Object cmpj=null;
  
  listLen=list.size();
  rlist=new java.util.ArrayList((java.util.Collection)list);
  {int $3=listLen-1;i_=0;i_:for(;i_<=$3;i_++){
   {int $4=listLen-1;j_=i_+1;j_:for(;j_<=$4;j_++){
    cmpi=rlist.get(i_);
    cmpj=rlist.get(j_);
    if ((((java.lang.Comparable)cmpi).compareTo((java.lang.Object)((java.lang.Comparable)cmpj)))>0) 
     {
      rlist.set(j_,cmpi);
      rlist.set(i_,cmpj);
     }
    }
   }/*j_*/
   }
  }/*i_*/
  
  return rlist;
  }
 
 private RSortingBubblesort01(){return;}
 }
