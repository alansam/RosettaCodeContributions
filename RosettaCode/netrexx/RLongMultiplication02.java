/* Generated from 'RLongMultiplication02.nrx' 16 Aug 2013 17:28:58 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RLongMultiplication02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(123);
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx(",  ");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx(" , ");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("44444444444");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(64);
 private static final char[] $014={2,1,44,10,2,0,1,1,10,2,2,1,0};
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("Calculate");
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx('x');
 private static final netrexx.lang.Rexx $017=netrexx.lang.Rexx.toRexx("Built in:");
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("Derived: ");
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("ok");
 private static final netrexx.lang.Rexx $020=netrexx.lang.Rexx.toRexx("not ok");
 private static final java.lang.String $0="RLongMultiplication02.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx multiply(netrexx.lang.Rexx multiplier,netrexx.lang.Rexx multiplicand){
  netrexx.lang.Rexx result;
  netrexx.lang.Rexx mpa;
  netrexx.lang.Rexx mpb;
  netrexx.lang.Rexx r_;
  netrexx.lang.Rexx rim;
  netrexx.lang.Rexx bi=null;
  netrexx.lang.Rexx ai=null;
  netrexx.lang.Rexx ri=null;
  netrexx.lang.Rexx p_=null;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx s_=null;
  result=netrexx.lang.Rexx.toRexx("");
  mpa=s2a(multiplier);
  mpb=s2a(multiplicand);
  r_=new netrexx.lang.Rexx((byte)0);
  rim=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $2=mpb.getnode(new netrexx.lang.Rexx((byte)0)).leaf;bi=new netrexx.lang.Rexx((byte)1);bi:for(;bi.OpLtEq($1,$2);bi=bi.OpAdd($1,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $3=mpa.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ai=new netrexx.lang.Rexx((byte)1);ai:for(;ai.OpLtEq($1,$3);ai=ai.OpAdd($1,new netrexx.lang.Rexx(1))){
    ri=ai.OpAdd($1,bi).OpSub($1,$02);
    p_=(mpa.getnode(ai).leaf).OpMult($1,mpb.getnode(bi).leaf);
    {i_=ri.OpPlus($1);boolean $4=true;i_:for(;;){if($4){$4=false;}else{if(p_.OpEq($1,$04))break;i_=i_.OpAdd($1,new netrexx.lang.Rexx(1));}
     s_=(r_.getnode(i_).leaf).OpAdd($1,p_);
     r_.getnode(i_).leaf=s_.OpRem($1,$05);
     p_=s_.OpDivI($1,$05);
     }
    }/*i_*/
    rim=rim.max(i_);
    }
   }/*ai*/
   }
  }/*bi*/
  r_.getnode(new netrexx.lang.Rexx((byte)0)).leaf=rim;
  result=a2s(r_);
  result=result.strip(new netrexx.lang.Rexx('l'),new netrexx.lang.Rexx((byte)0));
  if (result.OpEq($1,$06)) 
   result=new netrexx.lang.Rexx((byte)0);
  return result;
  }

 // .............................................................................
 // copy characters of a numeric string into a corresponding array
 // digits are numbered 1 to n from right to left
 
 private static netrexx.lang.Rexx s2a(netrexx.lang.Rexx numbr){
  netrexx.lang.Rexx result;
  netrexx.lang.Rexx lstr;
  netrexx.lang.Rexx z_=null;
  result=new netrexx.lang.Rexx((byte)0);
  lstr=numbr.length();
  {netrexx.lang.Rexx $5=lstr;z_=new netrexx.lang.Rexx((byte)1);z_:for(;z_.OpLtEq($1,$5);z_=z_.OpAdd($1,new netrexx.lang.Rexx(1))){
   result.getnode(z_).leaf=numbr.substr(lstr.OpSub($1,z_).OpAdd($1,$02),new netrexx.lang.Rexx((byte)1));
   }
  }/*z_*/
  result.getnode(new netrexx.lang.Rexx((byte)0)).leaf=lstr;
  return result;
  }

 // .............................................................................
 // turn the array of digits into a numeric string
 
 private static netrexx.lang.Rexx a2s(netrexx.lang.Rexx numbr){
  netrexx.lang.Rexx result;
  netrexx.lang.Rexx z_=null;
  result=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $6=$02.OpMinus($1);boolean $7=$6.OpGtEq($1,$04);z_=(numbr.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpPlus($1);z_:for(;$7?z_.OpLtEq($1,$03):z_.OpGtEq($1,$03);z_=z_.OpAdd($1,$6)){
   result=result.OpCc($1,numbr.getnode(z_).leaf);
   }
  }/*z_*/
  return result;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx mms[];
  netrexx.lang.Rexx ok;
  netrexx.lang.Rexx errors;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx multiplier=null;
  netrexx.lang.Rexx multiplicand=null;
  netrexx.lang.Rexx builtIn=null;
  netrexx.lang.Rexx calculated=null;
  mms=new netrexx.lang.Rexx[]{($07.OpCc($1,$08)).OpCc($1,$07),((new netrexx.lang.Rexx("012")).OpCc($1,$08)).OpCc($1,$09),(new netrexx.lang.Rexx("123456789012").OpCc($1,$010)).OpCc($1,$011),($012.OpPow($1,$013).OpCc($1,$010)).OpCc($1,$012.OpPow($1,$013)),$04.OpCc($1,netrexx.lang.Rexx.toRexx("                      ,0 "))};
  
  
  
  
  
  
  ok=new netrexx.lang.Rexx((byte)0);
  errors=new netrexx.lang.Rexx((byte)0);
  
  {int $10=0;netrexx.lang.Rexx[] $9=new netrexx.lang.Rexx[mms.length];synchronized(mms){for(;;){if($10==$9.length)break;$9[$10]=mms[mms.length-1-$10];$10++;}}mm:for(;;){if(--$10<0)break;mm=(netrexx.lang.Rexx)$9[$10];
   {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(mm,$014,$11);
   multiplier=$11[0];multiplicand=$11[2];}
   builtIn=multiplier.OpMult($1,multiplicand);
   calculated=multiply(multiplier,multiplicand);
   netrexx.lang.RexxIO.Say((($015.OpCcblank($1,multiplier.OpAdd($1,$04))).OpCcblank($1,$016)).OpCcblank($1,multiplicand.OpAdd($1,$04)));
   netrexx.lang.RexxIO.Say($017.OpCcblank($1,builtIn));
   netrexx.lang.RexxIO.Say($018.OpCcblank($1,calculated));
   netrexx.lang.RexxIO.Say("");
   if (builtIn.OpEq($1,calculated)) 
    ok=ok.OpAdd($1,$02);
   else 
    errors=errors.OpAdd($1,$02);
   }
  }/*mm*/
  netrexx.lang.RexxIO.Say(ok.OpCcblank($1,$019));
  netrexx.lang.RexxIO.Say(errors.OpCcblank($1,$020));
  
  return;
  }
 
 private RLongMultiplication02(){return;}
 }
