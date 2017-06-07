/* Generated from 'RPrimality01.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RPrimality01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("is prime");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx((byte)6);
 private static final java.lang.String $0="RPrimality01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx nn=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  n_=$1[0];}
  if (n_.OpEq(null,$02)) 
   n_=new netrexx.lang.Rexx((short)2000);
  
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(java.lang.Math.sqrt(n_.todouble()));nn=new netrexx.lang.Rexx((byte)3);nn:for(;nn.OpLtEq(null,$2);nn=nn.OpAdd(null,new netrexx.lang.Rexx(1))){
   if (isPrime(nn)) 
    netrexx.lang.RexxIO.Say((nn.right(new netrexx.lang.Rexx((byte)6))).OpCcblank(null,$04));
   }
  }/*nn*/
  
  return;
  }

 /*-------------------------------------ISPRIME subroutine---------------*/
 
 public static boolean isPrime(netrexx.lang.Rexx x_){
  boolean ip=false;
  netrexx.lang.Rexx j_=null;
  
  
  
  // is it a teacher's pet?
  if (netrexx.lang.Rexx.toRexx("2 3 5 7").wordpos(x_).OpNotEqS(null,$05)) 
   {
    ip=isTrue();
   }
   
   // weed out the riff-raff.
  else 
   if ((x_.OpLt(null,$06)|x_.OpRem(null,$06).OpEqS(null,$05))|x_.OpRem(null,$07).OpEqS(null,$05)) 
    {
     ip=isFalse();
    }
   else 
    {
     // Note:   //  is modulus.
     {netrexx.lang.Rexx $3=$08;j_=new netrexx.lang.Rexx((byte)5);boolean $4=true;j_:for(;;){if($4){$4=false;}else{if(j_.OpMult(null,j_).OpGt(null,x_))break;j_=j_.OpAdd(null,$3);} // skips multiples of three. 
      if (x_.OpRem(null,j_).OpEqS(null,$05)|x_.OpRem(null,(j_.OpAdd(null,$06))).OpEqS(null,$05)) 
       {
        ip=isFalse(); // do a pair of divides (mod)
       }
      else 
       {
        ip=isTrue();
       }
      }
     }/*j_*/
    }
  
  return ip;
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 private RPrimality01(){return;}
 }
