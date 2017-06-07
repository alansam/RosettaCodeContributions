/* Generated from 'RGreatestCommonDivisor.nrx' 7 Nov 2013 17:42:28 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RGreatestCommonDivisor{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)2000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final char[] $03={1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final char[] $05={2,1,44,10,1,0,1,10,1,1,0};
 private static final char[] $06={2,1,58,10,1,0,1,10,2,1,2,0};
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final char[] $08={1,10,3,0,1,2,0};
 private static final char[] $09={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RGreatestCommonDivisor.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Euclid's algorithm - iterative implementation
 
 public static netrexx.lang.Rexx gcdEucidI(netrexx.lang.Rexx a_,netrexx.lang.Rexx b_){
  netrexx.lang.Rexx c_=null;
  {for(;;){if(!b_.OpGt($1,$02))break;
   c_=a_.OpRem($1,b_);
   a_=b_;
   b_=c_;
   }
  }
  return a_;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Euclid's algorithm - recursive implementation
 
 public static netrexx.lang.Rexx gcdEucidR(netrexx.lang.Rexx a_,netrexx.lang.Rexx b_){
  if (b_.OpNotEq($1,$02)) 
   a_=gcdEucidR(b_,a_.OpRem($1,b_));
  return a_;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tests=null;
  netrexx.lang.Rexx xiterate;
  netrexx.lang.Rexx xrecurse;
  netrexx.lang.Rexx ll_;
  netrexx.lang.Rexx lr_;
  netrexx.lang.Rexx lgi;
  netrexx.lang.Rexx lgr;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx pair=null;
  netrexx.lang.Rexx l_=null;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx gcdi=null;
  netrexx.lang.Rexx gcdr=null;
  // pairs of numbers, each number in the pair separated by a colon, each pair separated by a comma
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$03,$2);
  tests=$2[0];}
  if (tests.OpEq($1,$04)) 
   tests=netrexx.lang.Rexx.toRexx("0:0, 6:4, 7:21, 12:36, 33:77, 41:47, 99:51, 100:5, 7:23, 1989:867, 12345:9876, 40902:24140, 49865:69811, 137438691328:2305843008139952128");
  
  // most of what follows is for formatting
  xiterate=new netrexx.lang.Rexx((byte)0);
  xrecurse=new netrexx.lang.Rexx((byte)0);
  ll_=new netrexx.lang.Rexx((byte)0);
  lr_=new netrexx.lang.Rexx((byte)0);
  lgi=new netrexx.lang.Rexx((byte)0);
  lgr=new netrexx.lang.Rexx((byte)0);
  {i_=new netrexx.lang.Rexx((byte)1);boolean $3=true;i_:for(;;){if($3){$3=false;}else{if(tests.OpEq($1,$04))break;i_=i_.OpAdd($1,new netrexx.lang.Rexx(1));}
   xiterate.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
   xrecurse.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i_;
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(tests,$05,$4);
   pair=$4[0];tests=$4[1];}
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(pair,$06,$5);
   l_=$5[0];r_=$5[1];}
   
   // get the GCDs
   gcdi=gcdEucidI(l_,r_);
   gcdr=gcdEucidR(l_,r_);
   
   xiterate.getnode(i_).leaf=(l_.OpCcblank($1,r_)).OpCcblank($1,gcdi);
   xrecurse.getnode(i_).leaf=(l_.OpCcblank($1,r_)).OpCcblank($1,gcdr);
   ll_=ll_.max(l_.strip().length());
   lr_=lr_.max(r_.strip().length());
   lgi=lgi.max(gcdi.strip().length());
   lgr=lgr.max(gcdr.strip().length());
   }
  }/*i_*/
  // save formatter sizes in stems
  xiterate.getnode($07.OpMinus($1)).leaf=(ll_.OpCcblank($1,lr_)).OpCcblank($1,lgi);
  xrecurse.getnode($07.OpMinus($1)).leaf=(ll_.OpCcblank($1,lr_)).OpCcblank($1,lgr);
  
  // present results
  showResults(xiterate,netrexx.lang.Rexx.toRexx("Euclid\'s algorithm - iterative"));
  showResults(xrecurse,netrexx.lang.Rexx.toRexx("Euclid\'s algorithm - recursive"));
  netrexx.lang.RexxIO.Say("");
  if (verifyResults(xiterate,xrecurse)) 
   netrexx.lang.RexxIO.Say("Success: Results of iterative and recursive methods match");
  else 
   netrexx.lang.RexxIO.Say("Error:   Results of iterative and recursive methods do not match");
  netrexx.lang.RexxIO.Say("");
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void showResults(netrexx.lang.Rexx stem,netrexx.lang.Rexx title){
  netrexx.lang.Rexx ll=null;
  netrexx.lang.Rexx lr=null;
  netrexx.lang.Rexx lg=null;
  netrexx.lang.Rexx v_=null;
  netrexx.lang.Rexx lv=null;
  netrexx.lang.Rexx rv=null;
  netrexx.lang.Rexx gcd=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(title);
  {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(stem.getnode($07.OpMinus($1)).leaf,$08,$6);
  ll=$6[0];lr=$6[1];lg=$6[2];}
  {netrexx.lang.Rexx $7=stem.getnode(new netrexx.lang.Rexx((byte)0)).leaf;v_=new netrexx.lang.Rexx((byte)1);v_:for(;v_.OpLtEq($1,$7);v_=v_.OpAdd($1,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[4];
   netrexx.lang.RexxParse.parse(stem.getnode(v_).leaf,$09,$8);
   lv=$8[0];rv=$8[1];gcd=$8[2];}
   netrexx.lang.RexxIO.Say(((((lv.right(ll)).OpCc($1,$010)).OpCcblank($1,rv.right(lr))).OpCcblank($1,$011)).OpCcblank($1,gcd.right(lg)));
   }
  }/*v_*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean verifyResults(netrexx.lang.Rexx stem1,netrexx.lang.Rexx stem2){
  boolean T;
  boolean F;
  boolean verified;
  netrexx.lang.Rexx i_=null;
  if ((stem1.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpNotEq($1,stem2.getnode(new netrexx.lang.Rexx((byte)0)).leaf)) 
   throw new netrexx.lang.BadArgumentException();
  T=(1==1);
  F=new netrexx.lang.Rexx(T).OpNot($1);
  verified=T;
  {netrexx.lang.Rexx $9=stem1.getnode(new netrexx.lang.Rexx((byte)0)).leaf;i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq($1,$9);i_=i_.OpAdd($1,new netrexx.lang.Rexx(1))){
   if ((stem1.getnode(i_).leaf).OpNotEq($1,stem2.getnode(i_).leaf)) 
    {
     verified=F;
     break i_;
    }
   }
  }/*i_*/
  return verified;
  }
 
 private RGreatestCommonDivisor(){return;}
 }
