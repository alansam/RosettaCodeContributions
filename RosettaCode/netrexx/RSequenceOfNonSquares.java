/* Generated from 'RSequenceOfNonSquares.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRess */



// n + floor(1/2 + sqrt(n))


public class RSequenceOfNonSquares{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(22);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1000000);
 private static final java.lang.String $0="RSequenceOfNonSquares.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nonsqr=null;
  boolean proof;
  long n_=0;
  long sq=0;
  proof=isTrue();
  
  
  {n_=1;n_:for(;new netrexx.lang.Rexx(n_).OpLtEq(null,$02);n_=new netrexx.lang.Rexx(n_).OpAdd(null,$01).tolong()){
   nonsqr=new netrexx.lang.Rexx(nonSquare(n_));
   netrexx.lang.RexxIO.Say((((new netrexx.lang.Rexx(n_)).right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$03)).OpCcblank(null,nonsqr.format(new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)2))));
   }
  }/*n_*/
  
  {n_=1;n_:for(;new netrexx.lang.Rexx(n_).OpLtEq(null,$04);n_=new netrexx.lang.Rexx(n_).OpAdd(null,$01).tolong()){
   nonsqr=new netrexx.lang.Rexx(nonSquare(n_));
   sq=(long)(java.lang.Math.sqrt(nonsqr.todouble()));
   if (new netrexx.lang.Rexx(sq).OpMult(null,new netrexx.lang.Rexx(sq)).OpEq(null,nonsqr)) 
    {
     netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Square found at").OpCcblank(null,new netrexx.lang.Rexx(n_)));
     proof=isFalse();
     break n_;
    }
   }
  }/*n_*/
  
  if (proof) 
   {
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say("No squares occur for n less than one million");
   }
  
  return;
  }

 
 public static final double nonSquare(long n_){
  return ((double)n_)+(java.lang.Math.floor(((double)(((float)1)/((float)2)))+(java.lang.Math.sqrt((double)n_))));
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RSequenceOfNonSquares(){return;}
 }
