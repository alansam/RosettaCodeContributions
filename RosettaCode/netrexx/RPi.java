/* Generated from 'RPi.nrx' 8 Apr 2013 19:47:05 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RPi{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)5000);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final char[] $05={1,10,6,0,1,2,3,4,5,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(7);
 private static final java.lang.String $0="RPi.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx places=null;
  netrexx.lang.Rexx q_=null;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx t_=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx l_=null;
  boolean first;
  netrexx.lang.Rexx digitCt;
  netrexx.lang.Rexx nr=null;
  netrexx.lang.Rexx nn=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  places=$2[0];}
  if (places.OpEq($1,$03)) 
   places=$04.OpMinus($1);
  
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[6];
  netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("1 0 1 1 3 3"),$05,$3);
  q_=$3[0];r_=$3[1];t_=$3[2];k_=$3[3];n_=$3[4];l_=$3[5];} // init work vars
  
  first=isTrue();
  digitCt=new netrexx.lang.Rexx((byte)0);
  {$4:for(;;){
   if ($06.OpMult($1,q_).OpAdd($1,r_).OpSub($1,t_).OpLt($1,n_.OpMult($1,t_))) 
    {
     digitCt=digitCt.OpAdd($1,$04);
     if (places.OpGt($1,$07)&digitCt.OpSub($1,$04).OpGt($1,places)) 
      break $4;
     netrexx.lang.RexxIO.Say(n_.OpCc($1,$08));
     if (first) 
      {
       netrexx.lang.RexxIO.Say(".\000");
       first=isFalse();
      }
     nr=$09.OpMult($1,(r_.OpSub($1,n_.OpMult($1,t_))));
     n_=(((($09.OpMult($1,($010.OpMult($1,q_).OpAdd($1,r_))))).OpDivI($1,t_))).OpSub($1,$09.OpMult($1,n_));
     q_=q_.OpMult($1,$09);
     r_=nr;
    }
   else 
    {
     nr=(($011.OpMult($1,q_).OpAdd($1,r_))).OpMult($1,l_);
     nn=((q_.OpMult($1,($012.OpMult($1,k_).OpAdd($1,$011))).OpAdd($1,r_.OpMult($1,l_)))).OpDivI($1,(t_.OpMult($1,l_)));
     q_=q_.OpMult($1,k_);
     t_=t_.OpMult($1,l_);
     l_=l_.OpAdd($1,$011);
     k_=k_.OpAdd($1,$04);
     n_=nn;
     r_=nr;
    }
   }
  }
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 private static boolean isTrue(){
  return (1==1);
  }
 
 private static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot($1);
  }
 
 private RPi(){return;}
 }
