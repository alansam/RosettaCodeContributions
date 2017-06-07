/* Generated from 'LuhnTest.nrx' 28 Sep 2011 17:40:02 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class LuhnTest{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("passed");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("failed");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('0');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(9);
 private static final java.lang.String $0="LuhnTest.nrx";

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx cc;
  int k=0;
  netrexx.lang.Rexx r=null;
  cc=new netrexx.lang.Rexx(0);
  cc.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("49927398716");
  cc.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("49927398717");
  cc.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("1234567812345678");
  cc.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("1234567812345670");
  
  {k=1;k:for(;;k++){if(!(cc.getnode(new netrexx.lang.Rexx(k)).leaf).OpNotEq(null,$01))break;
   r=checksum(cc.getnode(new netrexx.lang.Rexx(k)).leaf);
   if (r.OpEqS(null,$01)) 
    netrexx.lang.RexxIO.Say((cc.getnode(new netrexx.lang.Rexx(k)).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$02));
   else 
    netrexx.lang.RexxIO.Say((cc.getnode(new netrexx.lang.Rexx(k)).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$03));
   }
  }/*k*/
  return;}

 // Luhn algorithm checksum for credit card numbers
 
 public static netrexx.lang.Rexx checksum(netrexx.lang.Rexx t){
  int s;
  int j=0;
  netrexx.lang.Rexx q=null;
  if ((t.length()).OpRem(null,$04).toboolean()) 
   t=$05.OpCc(null,t); //pad # on left with 0
  t=t.reverse();
  s=0;
  {int $1=(t.length()).OpSub(null,$06).toint();int $2=2;j=1;j:for(;j<=$1;j=j+$2){
   q=$04.OpMult(null,t.substr(new netrexx.lang.Rexx(j+1),new netrexx.lang.Rexx((byte)1)));
   if (q.OpGt(null,$07)) 
    q=(q.left(new netrexx.lang.Rexx((byte)1))).OpAdd(null,q.right(new netrexx.lang.Rexx((byte)1)));
   s=new netrexx.lang.Rexx(s).OpAdd(null,t.substr(new netrexx.lang.Rexx(j),new netrexx.lang.Rexx((byte)1))).OpAdd(null,q).toint();
   }
  }/*j*/
  return new netrexx.lang.Rexx((s%10)!=0);
  }
 
 private LuhnTest(){return;}
 }
