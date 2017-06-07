/* Generated from 'RCountOccurencesOfSubstring.nrx' 27 Jan 2013 14:10:55 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class RCountOccurencesOfSubstring{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("there are");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("\" in \"");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('\"');
 private static final java.lang.String $0="RCountOccurencesOfSubstring.nrx";
 
 public static netrexx.lang.Rexx countSubstring(netrexx.lang.Rexx inStr,netrexx.lang.Rexx findStr){
  return inStr.countstr(findStr);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx strings;
  netrexx.lang.Rexx find;
  netrexx.lang.Rexx ix;
  netrexx.lang.Rexx str=null;
  netrexx.lang.Rexx fnd=null;
  strings=netrexx.lang.Rexx.toRexx("");
  find=netrexx.lang.Rexx.toRexx("FIND");
  ix=new netrexx.lang.Rexx((byte)0);
  ix=ix.OpAdd(null,$01);
  strings.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
  find.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
  strings.getnode(ix).leaf=netrexx.lang.Rexx.toRexx("the three truths");
  strings.getnode(ix).leaf.getnode(find).leaf=netrexx.lang.Rexx.toRexx("th");
  ix=ix.OpAdd(null,$01);
  strings.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
  find.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
  strings.getnode(ix).leaf=netrexx.lang.Rexx.toRexx("ababababab");
  strings.getnode(ix).leaf.getnode(find).leaf=netrexx.lang.Rexx.toRexx("abab");
  
  {netrexx.lang.Rexx $1=strings.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$1);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   str=strings.getnode(ix).leaf;
   fnd=strings.getnode(ix).leaf.getnode(find).leaf;
   netrexx.lang.RexxIO.Say(((((($02.OpCcblank(null,countSubstring(str,fnd))).OpCcblank(null,netrexx.lang.Rexx.toRexx("occurences of \""))).OpCc(null,fnd)).OpCc(null,$03)).OpCc(null,str)).OpCc(null,$04));
   }
  }/*ix*/
  
  return;
  }
 
 private RCountOccurencesOfSubstring(){return;}
 }
