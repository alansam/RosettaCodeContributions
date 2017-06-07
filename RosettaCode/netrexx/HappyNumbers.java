/* Generated from 'HappyNumbers.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

public class HappyNumbers{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="HappyNumbers.nrx";
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx limit;
  netrexx.lang.Rexx haps;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx q=null;
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx sum=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  limit=arg.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
  netrexx.lang.RexxIO.Say(limit);
  if ((limit==null)||limit.OpEq(null,$01)) 
   limit=new netrexx.lang.Rexx((byte)8);
  haps=new netrexx.lang.Rexx((byte)0);
  {n=new netrexx.lang.Rexx((byte)1);n:for(;;n=n.OpAdd(null,new netrexx.lang.Rexx(1))){if(!haps.OpLt(null,limit))break;
   q=n;
   a=new netrexx.lang.Rexx((byte)0);
   {for(;;){
    if (q.OpEqS(null,$02)) 
     {
      haps=haps.OpAdd(null,$02);
      netrexx.lang.RexxIO.Say(n);
      continue n;
     }
    sum=new netrexx.lang.Rexx((byte)0);
    {int $1=(q.length()).OpPlus(null).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$1>0;$1--,j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
     sum=sum.OpAdd(null,(q.substr(j,new netrexx.lang.Rexx((byte)1))).OpPow(null,$03));
     }
    }/*j*/
    if ((a.getnode(sum).leaf).toboolean()) 
     continue n;
    a.getnode(sum).leaf=new netrexx.lang.Rexx((byte)1);
    q=sum;
    }
   }
   }
  }/*n*/
  return;}
 
 private HappyNumbers(){return;}
 }