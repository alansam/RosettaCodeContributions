/* Generated from 'RLoopMultipleArrays.nrx' 12 Jul 2011 08:35:47 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Loop over multiple arrays (or lists or tuples or whatever they're called in your language)
 * and print the ith element of each. Use your language's "for each" loop if it has one,
 * otherwise iterate through the collection in order with some other loop.
 * <p>
 * For this example, loop over the arrays <code>(a,b,c)</code>, <code>(A,B,C)</code> and
 * <code>(1,2,3)</code> to produce the output
 * </p>
 * <pre>
 * aA1
 * bB2
 * cC3
 * </pre>
 * <p>
 * If possible, also describe what happens when the arrays are of different lengths.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Loop_over_multiple_arrays_simultaneously">rosettacode.org/wiki/Loop_over_multiple_arrays_simultaneously</a>
 */


public class RLoopMultipleArrays{
 private static final java.lang.String $0="RLoopMultipleArrays.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx aa[];
  netrexx.lang.Rexx bb[];
  netrexx.lang.Rexx cc[];
  netrexx.lang.Rexx x_=null;
  netrexx.lang.Rexx ax=null;
  netrexx.lang.Rexx bx=null;
  netrexx.lang.Rexx cx=null;
  netrexx.lang.Rexx ai;
  netrexx.lang.Rexx bi;
  netrexx.lang.Rexx ci;
  netrexx.lang.RexxIO.Say("Using arrays");
  aa=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('a'),new netrexx.lang.Rexx('b'),new netrexx.lang.Rexx('c'),new netrexx.lang.Rexx('d')};
  bb=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('A'),new netrexx.lang.Rexx('B'),new netrexx.lang.Rexx('C')};
  cc=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)4)};
  
  {int $1=new netrexx.lang.Rexx(aa.length).OpPlus(null).toint();x_=new netrexx.lang.Rexx((byte)0);x_:for(;$1>0;$1--,x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {try{
    ax=aa[x_.toint()];
   }
   catch (java.lang.ArrayIndexOutOfBoundsException $2){
    ax=new netrexx.lang.Rexx(' ');
   }}
   {try{
    bx=bb[x_.toint()];
   }
   catch (java.lang.ArrayIndexOutOfBoundsException $3){
    bx=new netrexx.lang.Rexx(' ');
   }}
   {try{
    cx=cc[x_.toint()];
   }
   catch (java.lang.ArrayIndexOutOfBoundsException $4){
    cx=new netrexx.lang.Rexx(' ');
   }}
   
   netrexx.lang.RexxIO.Say((ax.OpCc(null,bx)).OpCc(null,cx));
   }
  }/*x_*/
  
  netrexx.lang.RexxIO.Say("Using indexed strings (associative arrays)");
  ai=sampleData(netrexx.lang.Rexx.toRexx("a b c d"));
  bi=sampleData(netrexx.lang.Rexx.toRexx("A B C"));
  ci=sampleData(netrexx.lang.Rexx.toRexx("1 2 3 4"));
  
  {netrexx.lang.Rexx $5=ai.getnode(new netrexx.lang.Rexx((byte)0)).leaf;x_=new netrexx.lang.Rexx((byte)1);x_:for(;x_.OpLtEq(null,$5);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((ai.getnode(x_).leaf).OpCc(null,bi.getnode(x_).leaf)).OpCc(null,ci.getnode(x_).leaf));
   }
  }/*x_*/
  return;}

 
 public static netrexx.lang.Rexx sampleData(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx smp;
  netrexx.lang.Rexx i_=null;
  smp=new netrexx.lang.Rexx(' ');
  smp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=arg.words();
  {netrexx.lang.Rexx $6=smp.getnode(new netrexx.lang.Rexx((byte)0)).leaf;i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$6);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   smp.getnode(i_).leaf=arg.word(i_);
   }
  }/*i_*/
  
  return smp;
  }
 
 private RLoopMultipleArrays(){return;}
 }
