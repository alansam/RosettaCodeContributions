/* Generated from 'RSumAndProductOfAnArray.nrx' 8 Sep 2011 10:22:22 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RSumAndProductOfAnArray{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RSumAndProductOfAnArray.nrx";
 
 public static void main(java.lang.String $0s[]){
  long harry[];
  long sum;
  long product;
  netrexx.lang.Rexx entries;
  int n_=0;
  long nxt=0;
  harry=new long[]{(long)1,2,3,4,5,6,7,8,9,10};
  
  sum=(long)0;
  product=(long)1;
  entries=netrexx.lang.Rexx.toRexx("");
  
  {int $1=harry.length-1;n_=0;n_:for(;n_<=$1;n_++){
   nxt=harry[n_];
   entries=entries.OpCcblank(null,new netrexx.lang.Rexx(nxt));
   sum=sum+nxt;
   product=product*nxt;
   }
  }/*n_*/
  
  entries=entries.strip();
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Sum and product of").OpCcblank(null,entries.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(',')))).OpCc(null,$01));
  netrexx.lang.RexxIO.Say("     Sum:"+" "+sum);
  netrexx.lang.RexxIO.Say(" Product:"+" "+product);
  
  return;
  }
 
 private RSumAndProductOfAnArray(){return;}
 }
