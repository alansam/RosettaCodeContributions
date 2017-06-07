/* Generated from 'RLevenshteinDistance01.nrx' 10 Sep 2012 20:28:07 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RLevenshteinDistance01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("->");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RLevenshteinDistance01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx w;
  n=new netrexx.lang.Rexx((byte)0);
  w=netrexx.lang.Rexx.toRexx("");
  n=n.OpAdd(null,$01);
  w.getnode(new netrexx.lang.Rexx((byte)0)).leaf=n;
  w.getnode(n).leaf=netrexx.lang.Rexx.toRexx("kitten sitting");
  n=n.OpAdd(null,$01);
  w.getnode(new netrexx.lang.Rexx((byte)0)).leaf=n;
  w.getnode(n).leaf=netrexx.lang.Rexx.toRexx("rosettacode raisethysword");
  //n = n + 1; w[0] = n; w[n] = "doctorwho torchwood"
  {netrexx.lang.Rexx $1=w.getnode(new netrexx.lang.Rexx((byte)0)).leaf;n=new netrexx.lang.Rexx((byte)1);n:for(;n.OpLtEq(null,$1);n=n.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((((w.getnode(n).leaf.word(new netrexx.lang.Rexx((byte)1))).OpCcblank(null,$02)).OpCcblank(null,w.getnode(n).leaf.word(new netrexx.lang.Rexx((byte)2)))).OpCc(null,$03)).OpCcblank(null,levenshteinDistance(w.getnode(n).leaf.word(new netrexx.lang.Rexx((byte)1)),w.getnode(n).leaf.word(new netrexx.lang.Rexx((byte)2)))));
   }
  }/*n*/
  return;
  }

 
 private static netrexx.lang.Rexx levenshteinDistance(netrexx.lang.Rexx s,netrexx.lang.Rexx t){
  netrexx.lang.Rexx m;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx d;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx j=null;
  s=s.lower();
  t=t.lower();
  
  m=s.length();
  n=t.length();
  
  // for all i and j, d[i,j] will hold the Levenshtein distance between
  // the first i characters of s and the first j characters of t;
  // note that d has (m+1)x(n+1) values
  d=new netrexx.lang.Rexx((byte)0);
  
  // source prefixes can be transformed into empty string by
  // dropping all characters (Note, ooRexx arrays are 1-based)
  {netrexx.lang.Rexx $2=m.OpAdd(null,$01);i=new netrexx.lang.Rexx((byte)2);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   d.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)1);
   }
  }/*i*/
  
  // target prefixes can be reached from empty source prefix
  // by inserting every characters
  {netrexx.lang.Rexx $3=n.OpAdd(null,$01);j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq(null,$3);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   d.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(j).leaf=new netrexx.lang.Rexx((byte)1);
   }
  }/*j*/
  
  {netrexx.lang.Rexx $4=n.OpAdd(null,$01);j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq(null,$4);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $5=m.OpAdd(null,$01);i=new netrexx.lang.Rexx((byte)2);i:for(;i.OpLtEq(null,$5);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
    if ((s.substr(i.OpSub(null,$01),new netrexx.lang.Rexx((byte)1))).OpEqS(null,t.substr(j.OpSub(null,$01),new netrexx.lang.Rexx((byte)1)))) 
     {
      d.getnode(i).leaf.getnode(j).leaf=d.getnode(i.OpSub(null,$01)).leaf.getnode(j.OpSub(null,$01)).leaf; // no operation required
     }
    else 
     {
      d.getnode(i).leaf.getnode(j).leaf=((d.getnode(i.OpSub(null,$01)).leaf.getnode(j).leaf).OpAdd(null,$01)).min(((d.getnode(i).leaf.getnode(j.OpSub(null,$01)).leaf).OpAdd(null,$01))).min(((d.getnode(i.OpSub(null,$01)).leaf.getnode(j.OpSub(null,$01)).leaf).OpAdd(null,$01)));
     // a deletion
     // an insertion
     // a substitution
     }
    }
   }/*i*/
   }
  }/*j*/
  
  return d.getnode(m.OpAdd(null,$01)).leaf.getnode(n.OpAdd(null,$01)).leaf;
  }
 
 private RLevenshteinDistance01(){return;}
 }
