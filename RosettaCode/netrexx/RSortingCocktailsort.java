/* Generated from 'RSortingCocktailsort.nrx' 4 Jul 2012 07:47:31 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */






public class RSortingCocktailsort{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((short)1000);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(99);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((short)1099);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(30);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx((byte)0);
 private static final java.lang.String $0="RSortingCocktailsort.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String sortedList[];
  java.lang.String lists[][];
  netrexx.lang.Rexx ln=null;
  java.lang.String cl[]=null;
  netrexx.lang.Rexx ct=null;
  java.util.ArrayList rn;
  netrexx.lang.Rexx x_=null;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  sortedList=cocktailSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)));
  
  lists=new java.lang.String[][]{placesList,sortedList};
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(lists.length).OpSub(null,$01);ln=new netrexx.lang.Rexx((byte)0);ln:for(;ln.OpLtEq(null,$1);ln=ln.OpAdd(null,new netrexx.lang.Rexx(1))){
   cl=lists[ln.toint()];
   {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(cl.length).OpSub(null,$01);ct=new netrexx.lang.Rexx((byte)0);ct:for(;ct.OpLtEq(null,$2);ct=ct.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say(cl[ct.toint()]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  rn=new java.util.ArrayList();
  {int $3=$02.OpPlus(null).toint();n_:for(;$3>0;$3--){
   rn.add((java.lang.Object)(new java.lang.Integer(netrexx.lang.Rexx.toString(rrandom($03.OpMinus(null),new netrexx.lang.Rexx((short)999))))));
   }
  }/*n_*/
  shownums((java.util.List)rn);
  netrexx.lang.RexxIO.Say("");
  shownums((java.util.List)(cocktailSort((java.util.List)(new java.util.ArrayList((java.util.Collection)rn)))));
  netrexx.lang.RexxIO.Say("");
  
  rn=new java.util.ArrayList();
  {x_=new netrexx.lang.Rexx((byte)1);x_:for(;x_.OpLtEq(null,$04);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   rn.add((java.lang.Object)(new java.lang.Integer(netrexx.lang.Rexx.toString(x_.OpSub(null,$05)))));
   }
  }/*x_*/
  rn=(java.util.ArrayList)(shuffleFischerYates((java.util.List)rn));
  shownums((java.util.List)rn);
  netrexx.lang.RexxIO.Say("");
  shownums((java.util.List)(cocktailSort((java.util.List)(new java.util.ArrayList((java.util.Collection)rn)))));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 public static final java.lang.String[] cocktailSort(java.lang.String A[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[A.length];
  al=(java.util.List)(cocktailSort(java.util.Arrays.asList((java.lang.Object[])A)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }

 
 public static final java.util.ArrayList cocktailSort(java.util.List A){
  int Alength;
  boolean swapped;
  int i_=0;
  java.lang.Object swap=null;
  
  /*
   * The cocktail shaker sort is an improvement on the Bubble Sort. The improvement is basically that values
   * "bubble" both directions through the array, because on each iteration the cocktail shaker sort bubble
   * sorts once forwards and once backwards.
   *
   * Pseudocode for the algorithm (from wikipedia):
   * <pre>
   * function cocktailSort( A : list of sortable items )
   *   do
   *     swapped := false
   *     for each i in 0 to length( A ) - 2 do
   *       if A[ i ] > A[ i+1 ] then // test whether the two 
   *                                 // elements are in the wrong 
   *                                 // order
   *         swap( A[ i ], A[ i+1 ] ) // let the two elements
   *                                  // change places
   *         swapped := true;
   *     if swapped = false then
   *       // we can exit the outer loop here if no swaps occurred.
   *       break do-while loop;
   *     swapped := false
   *     for each i in length( A ) - 2 down to 0 do
   *       if A[ i ] > A[ i+1 ] then
   *         swap( A[ i ], A[ i+1 ] )
   *         swapped := true;
   *   while swapped; // if no elements have been swapped, 
   *                  // then the list is sorted
   * </pre>
   */
  
  Alength=A.size();
  swapped=isFalse();
  {boolean $4=true;swapped:for(;;){if($4){$4=false;}else{if((!swapped))break;}
   swapped=isFalse();
   {int $5=Alength-2;i_=0;i_:for(;i_<=$5;i_++){
    if ((((java.lang.Comparable)(A.get(i_))).compareTo((java.lang.Object)((java.lang.Comparable)(A.get(i_+1)))))>0) 
     {
      swap=A.get(i_+1);
      A.set(i_+1,A.get(i_));
      A.set(i_,swap);
      swapped=isTrue();
     }
    }
   }/*i_*/
   if ((!swapped)) 
    {
     break swapped;
    }
   swapped=isFalse();
   {i_=Alength-2;i_:for(;i_>=0;i_--){
    if ((((java.lang.Comparable)(A.get(i_))).compareTo((java.lang.Object)((java.lang.Comparable)(A.get(i_+1)))))>0) 
     {
      swap=A.get(i_+1);
      A.set(i_+1,A.get(i_));
      A.set(i_,swap);
      swapped=isTrue();
     }
    }
   }/*i_*/
   }
  }/*swapped*/
  
  return new java.util.ArrayList((java.util.Collection)A);
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }

 
 private static final void shownums(java.util.List rn){
  netrexx.lang.Rexx rk;
  netrexx.lang.Rexx rl;
  netrexx.lang.Rexx ln;
  netrexx.lang.Rexx r_=null;
  
  rk=$01.OpMinus(null);
  rl=netrexx.lang.Rexx.toRexx("");
  ln=new netrexx.lang.Rexx((byte)0);
  netrexx.lang.RexxIO.Say($06.right(new netrexx.lang.Rexx((byte)3)).OpCc(null,netrexx.lang.Rexx.toRexx(":    1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26  27  28  29  30")));
  {netrexx.lang.Rexx $6=new netrexx.lang.Rexx(rn.size()).OpSub(null,$01);r_=new netrexx.lang.Rexx((byte)0);r_:for(;r_.OpLtEq(null,$6);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   rk=rk.OpAdd(null,$01);
   if (rk.OpEq(null,$07)) 
    {
     ln=ln.OpAdd(null,$01);
     netrexx.lang.RexxIO.Say((((((ln.OpSub(null,$01))).OpMult(null,$07)).right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$08)).OpCcblank(null,rl));
     rl=netrexx.lang.Rexx.toRexx("");
     rk=new netrexx.lang.Rexx((byte)0);
    }
   rl=rl.OpCc(null,(new netrexx.lang.Rexx(((java.lang.Integer)(rn.get(r_.toint()))).intValue())).right(new netrexx.lang.Rexx((byte)4)));
   }
  }/*r_*/
  ln=ln.OpAdd(null,$01);
  netrexx.lang.RexxIO.Say((((((ln.OpSub(null,$01))).OpMult(null,$07)).right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$08)).OpCcblank(null,rl));
  /*
     1    2    3    4    5    6    7    8    9   10    1    2    3    4    5    6    7    8    9   20    1    2    3    4
   000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000  000
  */
  return;
  }

 
 public static netrexx.lang.Rexx rrandom(netrexx.lang.Rexx amax){
  return rrandom(new netrexx.lang.Rexx((byte)0),amax);
  }

 
 public static netrexx.lang.Rexx rrandom(netrexx.lang.Rexx amin,netrexx.lang.Rexx amax){
  return rrandom(amin,amax,new netrexx.lang.Rexx(0).tolong());
  }
 public static netrexx.lang.Rexx rrandom(netrexx.lang.Rexx amin,netrexx.lang.Rexx amax,long seed){
  java.util.Random rs;
  netrexx.lang.Rexx rn=null;
  netrexx.lang.Rexx rf=null;
  //trace results
  //trace var rn rf amin amax seed
  rs=new java.util.Random();
  
  
  if (new netrexx.lang.Rexx(seed).OpNotEq(null,$09)) 
   {
    rs.setSeed(seed);
   }
  
  {/*select*/
  if (amin.OpEq(null,$09)&amax.OpEq(null,$09))
   {
    rn=new netrexx.lang.Rexx(rs.nextInt());
   }
  else if (amin.OpNotEq(null,$09))
   {
    if (amax.OpGt(null,$09)) 
     {
      rf=amax.OpSub(null,amin).OpAdd(null,$01);
      rn=new netrexx.lang.Rexx(rs.nextInt(rf.toint())).OpAdd(null,amin);
      rn=rn.OpSub(null,$01);
     }
    else 
     {
      rn=new netrexx.lang.Rexx((byte)0);
     }
   }
  else if (amax.OpEq(null,$09))
   {
    rn=new netrexx.lang.Rexx(rs.nextInt());
   }
  else{
   {
    rn=new netrexx.lang.Rexx(rs.nextInt(amax.toint()));
   }
  }
  }
  
  return rn;
  }

 
 public static java.util.List shuffleFischerYates(java.util.List arry){
  int alen;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx j_=null;
  java.lang.Object tmp=null;
  /* Fischer-Yates Shuffle */
  
  alen=arry.size();
  {netrexx.lang.Rexx $7=$01.OpMinus(null);boolean $8=$7.OpGtEq(null,$09);i_=new netrexx.lang.Rexx(alen).OpSub(null,$01).OpPlus(null);i_:for(;$8?i_.OpLtEq(null,$010):i_.OpGtEq(null,$010);i_=i_.OpAdd(null,$7)){
   j_=rrandom(new netrexx.lang.Rexx((byte)1),i_);
   if (i_.OpEqS(null,j_)) 
    continue i_;
   tmp=arry.get(i_.toint());
   arry.set(i_.toint(),arry.get(j_.toint()));
   arry.set(j_.toint(),tmp);
   }
  }/*i_*/
  return arry;
  }

 
 public static java.util.List shuffleNaive(java.util.List arry){
  int alen;
  netrexx.lang.Rexx p1=null;
  netrexx.lang.Rexx p2=null;
  java.lang.Object tmp=null;
  /* Naive Shuffle */
  
  alen=arry.size();
  {int $9=new netrexx.lang.Rexx(alen).OpPlus(null).toint();for(;$9>0;$9--){
   p1=(rrandom(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(alen))).OpSub(null,$01);
   p2=(rrandom(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(alen))).OpSub(null,$01);
   {for(;;){if(!p2.OpEqS(null,p1))break;
    p2=(rrandom(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(alen))).OpSub(null,$01);
    }
   }
   tmp=arry.get(p1.toint());
   arry.set(p1.toint(),arry.get(p2.toint()));
   arry.set(p2.toint(),tmp);
   }
  }
  return arry;
  }
 
 private RSortingCocktailsort(){return;}
 }
