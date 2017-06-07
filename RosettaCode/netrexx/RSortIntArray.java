/* Generated from 'RSortIntArray.nrx' 11 Jul 2011 17:53:37 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */

//binary

/**
 * Sort an array (or list) of integers in ascending numerical order.
 * Use a sorting facility provided by the language/library if possible.
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Sort_an_integer_array">http://rosettacode.org/wiki/Sort_an_integer_array</a>
 */

/*handle larger numbers.*/


public class RSortIntArray{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(61);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(50521);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(199360981);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("  as is=");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx(" sorted=");
 private static final java.lang.String $0="RSortIntArray.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  RCSortIntArray01();
  REXXImpl01();
  REXXImpl02();
  return;}

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void RCSortIntArray01(){
  netrexx.lang.Rexx ra[]=null;
  int ia[];
  netrexx.lang.Rexx rx=null;
  netrexx.lang.Rexx text;
  netrexx.lang.Rexx ix=null;
  
  
  ra=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),$02.OpMinus($1),new netrexx.lang.Rexx((byte)0),$03.OpMinus($1)};
  ia=new int[ra.length];
  {int $2=new netrexx.lang.Rexx(ra.length).OpPlus($1).toint();rx=new netrexx.lang.Rexx((byte)0);rx:for(;$2>0;$2--,rx=rx.OpAdd($1,new netrexx.lang.Rexx(1))){
   ia[rx.toint()]=(ra[rx.toint()]).toint();
   }
  }/*rx*/
  
  text=netrexx.lang.Rexx.toRexx("");
  java.util.Arrays.sort(ia);
  {int $3=new netrexx.lang.Rexx(ia.length).OpPlus($1).toint();ix=new netrexx.lang.Rexx((byte)0);ix:for(;$3>0;$3--,ix=ix.OpAdd($1,new netrexx.lang.Rexx(1))){
   text=text.OpCc($1,(new netrexx.lang.Rexx(ia[ix.toint()])).right(new netrexx.lang.Rexx((byte)4)));
   }
  }/*ix*/
  netrexx.lang.RexxIO.Say(text);
  
  return;
  }

 
 private static void REXXImpl01(){
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx size;
  netrexx.lang.RexxSet $4=new netrexx.lang.RexxSet($1);
  /*REXX program to sort an integer array.*/
  
  $4.setDigits($01);/*handle larger numbers.*/
  a=netrexx.lang.Rexx.toRexx("");
  a.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)1);
  a.getnode(new netrexx.lang.Rexx((byte)2)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)3)).leaf=$02.OpMinus($4);
  a.getnode(new netrexx.lang.Rexx((byte)4)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)5)).leaf=new netrexx.lang.Rexx((byte)5);
  a.getnode(new netrexx.lang.Rexx((byte)6)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)7)).leaf=$04.OpMinus($4);
  a.getnode(new netrexx.lang.Rexx((byte)8)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)9)).leaf=new netrexx.lang.Rexx((short)1385);
  a.getnode(new netrexx.lang.Rexx((byte)10)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)11)).leaf=$05.OpMinus($4);
  a.getnode(new netrexx.lang.Rexx((byte)12)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)13)).leaf=new netrexx.lang.Rexx(2702765);
  a.getnode(new netrexx.lang.Rexx((byte)14)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)15)).leaf=$06.OpMinus($4);
  a.getnode(new netrexx.lang.Rexx((byte)16)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)17)).leaf=new netrexx.lang.Rexx("19391512145");
  a.getnode(new netrexx.lang.Rexx((byte)18)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)19)).leaf=new netrexx.lang.Rexx("2404879675441").OpMinus($4);
  a.getnode(new netrexx.lang.Rexx((byte)20)).leaf=new netrexx.lang.Rexx((byte)0);
  a.getnode(new netrexx.lang.Rexx((byte)21)).leaf=new netrexx.lang.Rexx("370371188237525");
  
  netrexx.lang.RexxIO.Say(a.getnode(new netrexx.lang.Rexx((byte)11)).leaf);
  
  size=new netrexx.lang.Rexx((byte)21);/*we have a list of 21 Euler numbers.*/
  tell(netrexx.lang.Rexx.toRexx("un-sorted"),a,size);
  a.getnode(new netrexx.lang.Rexx((byte)0)).leaf=size;
  esort(a,new netrexx.lang.Rexx((byte)1));
  tell(netrexx.lang.Rexx.toRexx("   sorted"),a,size);
  
  return;
  }

 
 /*----------------------------------ESORT subroutine--------------------*/
 
 public static void esort(netrexx.lang.Rexx a,netrexx.lang.Rexx size){
  netrexx.lang.Rexx h;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx t=null;
  //esort: procedure expose a.;
  h=a.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
  
  {for(;;){if(!h.OpGt($1,$02))break;
   h=h.OpDivI($1,$03);
   {int $5=(a.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpSub($1,h).OpPlus($1).toint();i=new netrexx.lang.Rexx((byte)1);i:for(;$5>0;$5--,i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
    j=i;
    k=h.OpAdd($1,i);
    {$6:for(;;){if(!(a.getnode(k).leaf).OpLt($1,a.getnode(j).leaf))break;
     t=a.getnode(j).leaf;
     a.getnode(j).leaf=a.getnode(k).leaf;
     a.getnode(k).leaf=t;
     if (h.OpGtEq($1,j)) 
      break $6;
     j=j.OpSub($1,h);
     k=k.OpSub($1,h);
     }
    }
    }
   }/*i*/
   }
  }
  
  return;
  }

 /*----------------------------------TELL subroutine---------------------*/
 
 public static void tell(netrexx.lang.Rexx arg,netrexx.lang.Rexx a,netrexx.lang.Rexx size){
  netrexx.lang.Rexx j=null;
  //tell:
  
  netrexx.lang.RexxIO.Say(arg.center(new netrexx.lang.Rexx((byte)40),new netrexx.lang.Rexx('-')));
  {int $7=size.OpPlus($1).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$7>0;$7--,j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((((arg.OpCcblank($1,netrexx.lang.Rexx.toRexx("array element"))).OpCcblank($1,j.right(size.length()))).OpCc($1,$07)).OpCc($1,a.getnode(j).leaf.right(new netrexx.lang.Rexx((byte)25))));
   }
  }/*j*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 private static void REXXImpl02(){
  netrexx.lang.Rexx bell;
  netrexx.lang.Rexx bern;
  netrexx.lang.Rexx perrin;
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx size;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx bList;
  /*REXX program to sort an interesting integer list.*/
  
  bell=netrexx.lang.Rexx.toRexx("1 1 2 5 15 52 203 877 4140 21147 115975");/*some Bell numbers.*/
  bern=netrexx.lang.Rexx.toRexx("1 -1 1 0 -1 0 1 0 -1 0 5 0 -691 0 7 0 -3617");/*some Bernoulli num*/
  perrin=netrexx.lang.Rexx.toRexx("3 0 2 3 2 5 5 7 10 12 17 22 29 39 51 68 90");/*some Perrin nums. */
  list=(bell.OpCcblank($1,bern)).OpCcblank($1,perrin);/*combine the three.*/
  
  size=list.words();
  
  a=new netrexx.lang.Rexx((byte)0);
  {int $8=size.OpPlus($1).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$8>0;$8--,j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   a.getnode(j).leaf=list.word(j);
   }
  }/*j*/
  
  netrexx.lang.RexxIO.Say($08.OpCc($1,list));
  a.getnode(new netrexx.lang.Rexx((byte)0)).leaf=size;
  esort(a,size);
  bList=netrexx.lang.Rexx.toRexx("");
  
  {int $9=size.OpPlus($1).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$9>0;$9--,j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   bList=bList.OpCcblank($1,a.getnode(j).leaf);
   }
  }/*j*/
  
  bList=bList.strip();
  netrexx.lang.RexxIO.Say($09.OpCc($1,bList));
  
  return;
  }
 
 private RSortIntArray(){return;}
 }
