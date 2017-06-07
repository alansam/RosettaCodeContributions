/* Generated from 'RKnuthShuffle.nrx' 17 Sep 2011 21:08:46 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





/*
 * @see http://en.wikipedia.org/wiki/Knuth_shuffle
 *
 * <pre>
 * To shuffle an array a of n elements (indexes 0..n-1):
 * for i from n ? 1 downto 1 do
 *   j <- random integer with 0 <= j <= i
 *   exchange a[j] and a[i]
 * </pre>
 */


public class RKnuthShuffle{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RKnuthShuffle.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String cards[];
  int cardsLen;
  java.util.ArrayList deck;
  netrexx.lang.Rexx c_=null;
  cards=new java.lang.String[]{"hA","h2","h3","h4","h5","h6","h7","h8","h9","h10","hJ","hQ","hK","cA","c2","c3","c4","c5","c6","c7","c8","c9","c10","cJ","cQ","cK","dA","d2","d3","d4","d5","d6","d7","d8","d9","d10","dJ","dQ","dK","sA","s2","s3","s4","s5","s6","s7","s8","s9","s10","sJ","sQ","sK"};
  
  
  
  
  
  cardsLen=cards.length;
  deck=new java.util.ArrayList(cardsLen);
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(cardsLen).OpSub(null,$01);c_=new netrexx.lang.Rexx((byte)0);c_:for(;c_.OpLtEq(null,$1);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   deck.add((java.lang.Object)(new java.lang.String(cards[c_.toint()])));
   }
  }/*c_*/
  
  showHand(deck);
  deck=(java.util.ArrayList)(shuffle((java.util.List)deck));
  showHand(deck);
  
  return;
  }

 
 public static java.util.List shuffle(java.util.List deck){
  java.util.Random rn;
  int dl;
  int i_=0;
  int j_=0;
  java.lang.Object __=null;
  
  rn=new java.util.Random();
  dl=deck.size();
  
  {i_=dl-1;i_:for(;i_>=1;i_--){
   j_=rn.nextInt(i_);
   __=deck.get(i_);
   deck.set(i_,deck.get(j_));
   deck.set(j_,__);
   }
  }/*i_*/
  
  return deck;
  }

 
 public static void showHand(java.util.ArrayList deck){
  int dl;
  int hl;
  int c_=0;
  int d_=0;
  
  dl=deck.size();
  hl=dl/4;
  {int $2=dl-1;int $3=hl;boolean $4=$3>=0;c_=0;c_:for(;$4?c_<=$2:c_>=$2;c_=c_+$3){
   d_=(c_+hl)-1;
   if (d_>=dl) 
    d_=dl-1;
   netrexx.lang.RexxIO.Say((new java.util.ArrayList((java.util.Collection)(deck.subList(c_,d_)))).toString());
   }
  }/*c_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RKnuthShuffle(){return;}
 }
