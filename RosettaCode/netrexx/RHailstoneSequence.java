/* Generated from 'RHailstoneSequence.nrx' 7 Sep 2011 16:16:49 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RHailstoneSequence{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("elements");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(' ');
 private static final java.lang.String $0="RHailstoneSequence.nrx";
 
 public static void main(java.lang.String $0s[]){
  int start=0;
  netrexx.lang.Rexx hs=null;
  netrexx.lang.Rexx hsCount=null;
  int hsMax=0;
  int hsCountMax=0;
  int llimit=0;
  int x_=0;
  java.lang.Exception ex=null;
  {try{
   start=27;
   hs=hailstone(start);
   hsCount=hs.words();
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("The number"+" "+start+" "+"has a hailstone sequence comprising").OpCcblank(null,hsCount)).OpCcblank(null,$01));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  its first four elements are:").OpCcblank(null,hs.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4))));
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("   and last four elements are:").OpCcblank(null,hs.subword(hsCount.OpSub(null,$02))));
   
   hsMax=0;
   hsCountMax=0;
   llimit=100000;
   {int $1=llimit-1;x_=1;x_:for(;x_<=$1;x_++){
    hs=hailstone(x_);
    hsCount=hs.words();
    if (hsCount.OpGt(null,new netrexx.lang.Rexx(hsCountMax))) 
     {
      hsMax=x_;
      hsCountMax=hsCount.toint();
     }
    }
   }/*x_*/
   
   netrexx.lang.RexxIO.Say("The number"+" "+hsMax+" "+"has the longest hailstone sequence in the range 1 to"+" "+(llimit-1)+" "+"with a sequence length of"+" "+hsCountMax);
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 public static netrexx.lang.Rexx hailstone(long hn) throws java.lang.IllegalArgumentException{
  netrexx.lang.Rexx hs;
  
  hs=new netrexx.lang.Rexx("");
  if (hn<=0) 
   throw new java.lang.IllegalArgumentException("Invalid start point.  Must be a positive integer greater than 0");
  
  {n_:for(;;){if(!(hn>1))break;
   hs=(hs.OpCc(null,$03)).OpCc(null,new netrexx.lang.Rexx(hn));
   if ((hn%2)!=0) 
    hn=(hn*3)+1;
   else 
    hn=hn/2;
   }
  }/*n_*/
  hs=(hs.OpCc(null,$03)).OpCc(null,new netrexx.lang.Rexx(hn));
  
  return hs.strip();
  }
 
 private RHailstoneSequence(){return;}
 }
