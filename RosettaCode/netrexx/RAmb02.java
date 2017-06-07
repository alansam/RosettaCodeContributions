/* Generated from 'RAmb02.nrx' 31 Aug 2013 16:59:20 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* REXX **************************************************************
 * 25.08.2013 Walter Pachl derived from REXX version 2
 ******************************************************************* */



public class RAmb02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)3);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("-->");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx((byte)4);
 private static final java.lang.String $0="RAmb02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx l;
  netrexx.lang.Rexx mm;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx ii=null;
  netrexx.lang.Rexx jj=null;
  netrexx.lang.Rexx ns=null;
  w=netrexx.lang.Rexx.toRexx("");
  l=new netrexx.lang.Rexx((byte)0);
  mm=new netrexx.lang.Rexx((byte)0);
  mkset(new netrexx.lang.Rexx((byte)1),netrexx.lang.Rexx.toRexx("the that a if"),w,mm,l);
  mkset(new netrexx.lang.Rexx((byte)2),netrexx.lang.Rexx.toRexx("frog elephant thing"),w,mm,l);
  mkset(new netrexx.lang.Rexx((byte)3),netrexx.lang.Rexx.toRexx("walked treaded grows trots"),w,mm,l);
  mkset(new netrexx.lang.Rexx((byte)4),netrexx.lang.Rexx.toRexx("slowly quickly"),w,mm,l);
  show(w,mm,l);
  
  {i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$01);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over sets            */
   k=i.OpAdd(null,$02);/* the following set          */
   {ii=new netrexx.lang.Rexx((byte)1);ii:for(;ii.OpLtEq(null,$03);ii=ii.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over elements in set k*/
    if ((w.getnode(i).leaf.getnode(ii).leaf.words()).OpEq(null,i)) 
     {/* a sentence part found      */
      {jj=new netrexx.lang.Rexx((byte)1);jj:for(;jj.OpLtEq(null,$03);jj=jj.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over following words  */
       if ((w.getnode(i).leaf.getnode(ii).leaf.right(new netrexx.lang.Rexx((byte)1))).OpEq(null,w.getnode(k).leaf.getnode(jj).leaf.left(new netrexx.lang.Rexx((byte)1)))) 
        {/* fitting     */
         ns=((w.getnode(i).leaf.getnode(ii).leaf).OpCc(null,$04)).OpCc(null,w.getnode(k).leaf.getnode(jj).leaf);/* build new sentence (part)  */
         if ((ns.words()).OpEq(null,k)) /* 'complete' part            */
          add(w,k,ns);/* add to set k               */
        }
       }
      }/*jj*/
     }
    }
   }/*ii*/
   }
  }/*i*/
  netrexx.lang.RexxIO.Say("Results:");
  {jj=new netrexx.lang.Rexx((byte)1);jj:for(;jj.OpLtEq(null,$03);jj=jj.OpAdd(null,new netrexx.lang.Rexx(1))){/* show the results           */
   if ((w.getnode(new netrexx.lang.Rexx((byte)4)).leaf.getnode(jj).leaf.words()).OpEq(null,$05)) 
    netrexx.lang.RexxIO.Say($06.OpCcblank(null,w.getnode(new netrexx.lang.Rexx((byte)4)).leaf.getnode(jj).leaf));
   }
  }/*jj*/
  return;}

 
 public static void add(netrexx.lang.Rexx w,netrexx.lang.Rexx k,netrexx.lang.Rexx s){
  netrexx.lang.Rexx i=null;
  /* *******************************************************************
   * add a fitting sentence (part) s to set w[k,*]
   ****************************************************************** */
  {i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$03);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(w.getnode(k).leaf.getnode(i).leaf).OpGt(null,$07))break;/* look for an empty slot     */
   }
  }/*i*/
  w.getnode(k).leaf.getnode(i).leaf=s;/* add the sentence (part)    */
  return;
  }

 
 public static void mkset(netrexx.lang.Rexx n,netrexx.lang.Rexx arg,netrexx.lang.Rexx smp,netrexx.lang.Rexx mm,netrexx.lang.Rexx l){
  netrexx.lang.Rexx i=null;
  /* *******************************************************************
   * create set smp[n,*] from data in arg
   * mm[0] maximum number of elements in any set
   * l[n] maximum word length in set n
   ****************************************************************** */
  {netrexx.lang.Rexx $1=arg.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   smp.getnode(n).leaf.getnode(i).leaf=arg.word(i);
   if ((smp.getnode(n).leaf.getnode(i).leaf.length()).OpGt(null,l.getnode(n).leaf)) 
    l.getnode(n).leaf=smp.getnode(n).leaf.getnode(i).leaf.length();
   }
  }/*i*/
  if (i.OpSub(null,$02).OpGt(null,mm.getnode(new netrexx.lang.Rexx((byte)0)).leaf)) 
   {
    mm.getnode(new netrexx.lang.Rexx((byte)0)).leaf=i.OpSub(null,$02);
   }
  return;
  }

 
 public static void show(netrexx.lang.Rexx w,netrexx.lang.Rexx mm,netrexx.lang.Rexx l){
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx ol=null;
  netrexx.lang.Rexx i=null;
  /* *******************************************************************
   * show the input
   ****************************************************************** */
  netrexx.lang.RexxIO.Say("Input:");
  {netrexx.lang.Rexx $2=mm.getnode(new netrexx.lang.Rexx((byte)0)).leaf;j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$2);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/* output lines               */
   ol=netrexx.lang.Rexx.toRexx("");
   {i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$08);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
    ol=ol.OpCcblank(null,w.getnode(i).leaf.getnode(j).leaf.left(l.getnode(i).leaf));
    }
   }/*i*/
   netrexx.lang.RexxIO.Say(ol.strip());
   }
  }/*j*/
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RAmb02(){return;}
 }
/*
Output:
Input:
the    frog     walked  slowly
that   elephant treaded quickly
a      thing    grows
if              trots

Results:
--> the elephant trots slowly
--> that thing grows slowly
--> if frog grows slowly
*/
