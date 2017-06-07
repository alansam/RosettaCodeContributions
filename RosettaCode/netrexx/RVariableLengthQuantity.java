/* Generated from 'RVariableLengthQuantity.nrx' 29 Nov 2012 14:35:06 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RVariableLengthQuantity{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)100);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RVariableLengthQuantity.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nums[];
  netrexx.lang.Rexx num=null;
  netrexx.lang.Rexx octets=null;
  netrexx.lang.Rexx renum=null;
  netrexx.lang.Rexx vv=null;
  nums=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(2097152),new netrexx.lang.Rexx(2097151),new netrexx.lang.Rexx("137438953472"),new netrexx.lang.Rexx("137438953471"),new netrexx.lang.Rexx(2097153),new netrexx.lang.Rexx(2097150),new netrexx.lang.Rexx("9223372036854775808"),new netrexx.lang.Rexx("18446744073709551615")};
  
  {int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[nums.length];synchronized(nums){for(;;){if($4==$3.length)break;$3[$4]=nums[nums.length-1-$4];$4++;}}num:for(;;){if(--$4<0)break;num=(netrexx.lang.Rexx)$3[$4];
   octets=getOctets(num);
   renum=octets.space(new netrexx.lang.Rexx((byte)0)).x2d();
   if (num.OpEqS($1,renum)) 
    vv=netrexx.lang.Rexx.toRexx("true");
   else 
    vv=netrexx.lang.Rexx.toRexx("false");
   netrexx.lang.RexxIO.Say(((((num.right(new netrexx.lang.Rexx((byte)24))).OpCcblank($1,num.d2x().right(new netrexx.lang.Rexx((byte)30)))).OpCcblank($1,octets.right(new netrexx.lang.Rexx((byte)30)))).OpCcblank($1,renum.right(new netrexx.lang.Rexx((byte)24)))).OpCcblank($1,vv));
   }
  }/*num*/
  
  return;
  }

 
 public static netrexx.lang.Rexx getOctets(netrexx.lang.Rexx num){
  netrexx.lang.Rexx hex;
  netrexx.lang.Rexx octets;
  netrexx.lang.Rexx p_=null;
  hex=num.d2x();
  
  octets=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $5=$03.OpMinus($1);boolean $6=$5.OpGtEq($1,$04);p_=(hex.length()).OpPlus($1);p_:for(;$6?p_.OpLtEq($1,$02):p_.OpGtEq($1,$02);p_=p_.OpAdd($1,$5)){
   octets=(hex.substr(p_.OpSub($1,$05),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0))).OpCcblank($1,octets);
   }
  }/*p_*/
  
  return octets;
  }
 
 private RVariableLengthQuantity(){return;}
 }
