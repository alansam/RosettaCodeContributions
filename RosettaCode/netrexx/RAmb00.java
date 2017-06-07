/* Generated from 'RAmb00.nrx' 23 Aug 2013 01:32:42 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/*REXX program demonstrates Amd operator (choosing 4 words from 4 sets).*/
/* Standardization fixup: @ replaced by !, & # by ? in symbol names */
/* (ooRexx does not permit $, #, @ in symbols. Prefer _, !, ? instead) */
/*
The example didn't say so, but an assumption made (for this program)
that lowercase and uppercase letters are considered to be a match.
*/



public class RAmb00{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={3,0,10,2,0,1,1,10,2,2,3,0};
 private static final java.lang.String $0="RAmb00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx wordLists;
  netrexx.lang.Rexx j=null;
  wordLists=netrexx.lang.Rexx.toRexx("");/*default value for any # of sets*/
  wordLists.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("the that a");
  wordLists.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("frog elephant thing");
  wordLists.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("walked treaded grows");
  wordLists.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("slowly quickly");
  
  {j=new netrexx.lang.Rexx((byte)1);boolean $1=true;j:for(;;){if($1){$1=false;}else{if((wordLists.getnode(j).leaf).OpEqS(null,$01))break;j=j.OpAdd(null,new netrexx.lang.Rexx(1));}
   }
  }/*j*/
  wordLists.getnode(new netrexx.lang.Rexx((byte)0)).leaf=j.OpSub(null,$02);
  /*find how many sets there are.  */
  /*wordLists.0   contains number of sets. */
  Amb(wordLists,new netrexx.lang.Rexx((byte)1));/*find combo of words that works.*/
  {System.exit(0);return;}
  }

 /*─────────────────────────────────────AMB procedure────────────────────*/
 
 public static void Amb(netrexx.lang.Rexx wordLists,netrexx.lang.Rexx arg){
  netrexx.lang.Rexx Q=null;
  netrexx.lang.Rexx _=null;
  netrexx.lang.Rexx u=null;
  netrexx.lang.Rexx w=null;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx j=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(arg,$03,$2);
  Q=$2[0];_=$2[1];u=$2[3];}
  
  if (Q.OpEqS(null,$01)) 
   return;
  if (Q.OpGt(null,wordLists.getnode(new netrexx.lang.Rexx((byte)0)).leaf)) 
   {
    if (u.OpEqS(null,$01)) 
     return;
    w=u.word(new netrexx.lang.Rexx((byte)1));/*(Below) use upper case version.*/
    {netrexx.lang.Rexx $3=_.words();n=new netrexx.lang.Rexx((byte)2);n:for(;n.OpLtEq(null,$3);n=n.OpAdd(null,new netrexx.lang.Rexx(1))){
     c=u.word(n);
     if ((c.left(new netrexx.lang.Rexx((byte)1))).OpNotEqS(null,w.right(new netrexx.lang.Rexx((byte)1)))) 
      return;
     w=c;
     }
    }/*n*/
    netrexx.lang.RexxIO.Say(_.strip());/*_ has an extra leading blank.  */
   }
  {int $4=(wordLists.getnode(Q).leaf.words()).OpPlus(null).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$4>0;$4--,j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   Amb(wordLists,(Q.OpAdd(null,$02).OpCcblank(null,_)).OpCcblank(null,wordLists.getnode(Q).leaf.word(j)));/*generate the next combination. */
   }
  }/*j*/
  return;
  }
 
 private RAmb00(){return;}
 }
