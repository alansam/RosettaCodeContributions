/* Generated from 'RGreatestSubsequentialSum01.nrx' 24 Aug 2012 10:37:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* REXX ***************************************************************
* 10.08.2012 Walter Pachl Pascal algorithm -> Rexx -> NetRexx
**********************************************************************/

public class RGreatestSubsequentialSum01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Sum:");
 private static final java.lang.String $0="RGreatestSubsequentialSum01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx maxSum;
  netrexx.lang.Rexx seqStart;
  netrexx.lang.Rexx seqEnd;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx seqSum=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx ol=null;
  netrexx.lang.Rexx w=null;
  s=netrexx.lang.Rexx.toRexx(" -1 -2  3  5  6 -2 -1  4 -4  2 -1");
  maxSum=new netrexx.lang.Rexx((byte)0);
  seqStart=new netrexx.lang.Rexx((byte)0);
  seqEnd=$01.OpMinus(null);
  {netrexx.lang.Rexx $1=s.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   seqSum=new netrexx.lang.Rexx((byte)0);
   {netrexx.lang.Rexx $2=s.words();j=i.OpPlus(null);j:for(;j.OpLtEq(null,$2);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
    seqSum=seqSum.OpAdd(null,s.word(j));
    if (seqSum.OpGt(null,maxSum)) 
     {
      maxSum=seqSum;
      seqStart=i;
      seqEnd=j;
     }
    }
   }/*j*/
   }
  }/*i*/
  netrexx.lang.RexxIO.Say("Sequence:");
  netrexx.lang.RexxIO.Say(s);
  netrexx.lang.RexxIO.Say("Subsequence with greatest sum: ");
  if (seqEnd.OpLt(null,seqStart)) 
   netrexx.lang.RexxIO.Say("empty");
  else 
   {
    ol=netrexx.lang.Rexx.toRexx("   ").copies(seqStart.OpSub(null,$01));
    {netrexx.lang.Rexx $3=seqEnd;i=seqStart.OpPlus(null);i:for(;i.OpLtEq(null,$3);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
     w=s.word(i);
     ol=ol.OpCc(null,w.right(new netrexx.lang.Rexx((byte)3)));
     }
    }/*i*/
    netrexx.lang.RexxIO.Say(ol);
    netrexx.lang.RexxIO.Say($02.OpCcblank(null,maxSum));
   }
  return;}
 
 private RGreatestSubsequentialSum01(){return;}
 }
