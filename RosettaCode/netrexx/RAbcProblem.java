/* Generated from 'RAbcProblem.nrx' 23 Apr 2014 17:20:01 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*
 * 10.01.2014 Walter Pachl  counts the number of possible ways
 * 12.01.2014 corrected date and output
 */

public class RAbcProblem{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("ways");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RAbcProblem.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx showv=null;
  boolean show;
  netrexx.lang.Rexx blocks;
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx blk;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx wlen;
  netrexx.lang.Rexx wi=null;
  netrexx.lang.Rexx wrd=null;
  netrexx.lang.Rexx ways=null;
  netrexx.lang.Rexx poss=null;
  netrexx.lang.Rexx lw=null;
  netrexx.lang.Rexx cannot=null;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx z=null;
  netrexx.lang.Rexx s=null;
  netrexx.lang.Rexx ii=null;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx way=null;
  netrexx.lang.Rexx p=null;
  netrexx.lang.Rexx v=null;
  netrexx.lang.Rexx ol=null;
  netrexx.lang.Rexx wj=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  showv=$1[0];}
  show=(showv.OpNotEq(null,$02));
  blocks=netrexx.lang.Rexx.toRexx("BO XK DQ CP NA GT RE TG QD FS JW HU VI AN OB ER FS LY PC ZM");
  list=netrexx.lang.Rexx.toRexx("$ A baRk bOOk trEat coMMon squaD conFuse");
  list=list.upper();
  
  blk=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $2=blocks.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$2);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   //blkn[i] = blocks.word(i)'-'i
   blk.getnode(i).leaf=blocks.word(i);
   }
  }/*i*/
  
  w=netrexx.lang.Rexx.toRexx("");
  wlen=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $3=list.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$3);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   w.getnode(i).leaf=list.word(i);
   wlen=wlen.max(w.getnode(i).leaf.length());
   }
  }/*i*/
  
  //trace results
  {netrexx.lang.Rexx $4=list.words();wi=new netrexx.lang.Rexx((byte)0);wi:for(;wi.OpLtEq(null,$4);wi=wi.OpAdd(null,new netrexx.lang.Rexx(1))){
   wrd=w.getnode(wi).leaf;
   ways=new netrexx.lang.Rexx((byte)0);
   poss=new netrexx.lang.Rexx((byte)0);
   lw=wrd.length();
   cannot=new netrexx.lang.Rexx((byte)0);
   {netrexx.lang.Rexx $5=lw;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$5);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over the characters   */
    c=wrd.substr(i,new netrexx.lang.Rexx((byte)1));/* the current character      */
    {netrexx.lang.Rexx $6=blocks.words();j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$6);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop over blocks           */
     blk=blocks.word(j);
     if ((c.pos(blk)).OpGt(null,$03)) 
      {/* block can be used in this position */
       z=(poss.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$04);
       poss.getnode(i).leaf.getnode(z).leaf=j;
       poss.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf=z;/* number of possible blocks for pos i */
      }
     }
    }/*j*/
    
    if ((poss.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpEq(null,$03)) 
     {
      cannot=new netrexx.lang.Rexx((byte)1);
      break i;
     }
    }
   }/*i*/
   
   if (cannot.OpEq(null,$03)) 
    {/* no prohibitive character   */
     s=new netrexx.lang.Rexx((byte)0);
     {netrexx.lang.Rexx $7=poss.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf;j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$7);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){/* build possible strings for char 1 */
      z=(s.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$04);
      s.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(z).leaf=poss.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(j).leaf;
      s.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf=z;
      }
     }/*j*/
     {netrexx.lang.Rexx $8=lw;i=new netrexx.lang.Rexx((byte)2);i:for(;i.OpLtEq(null,$8);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){/* build possible strings for chars 1 to i */
      ii=i.OpSub(null,$04);
      {netrexx.lang.Rexx $9=poss.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf;j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$9);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
       {netrexx.lang.Rexx $10=s.getnode(ii).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf;k=new netrexx.lang.Rexx((byte)1);k:for(;k.OpLtEq(null,$10);k=k.OpAdd(null,new netrexx.lang.Rexx(1))){
        z=(s.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$04);
        s.getnode(i).leaf.getnode(z).leaf=(s.getnode(ii).leaf.getnode(k).leaf).OpCcblank(null,poss.getnode(i).leaf.getnode(j).leaf);
        s.getnode(i).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf=z;
        }
       }/*k*/
       }
      }/*j*/
      }
     }/*i*/
     way=netrexx.lang.Rexx.toRexx("");
     
     {netrexx.lang.Rexx $11=s.getnode(lw).leaf.getnode(new netrexx.lang.Rexx((byte)0)).leaf;p=new netrexx.lang.Rexx((byte)1);p:for(;p.OpLtEq(null,$11);p=p.OpAdd(null,new netrexx.lang.Rexx(1))){/* loop through all possible strings */
      v=valid(s.getnode(lw).leaf.getnode(p).leaf);/* test if the string is valid*/
      if (v.toboolean()) 
       {/* it is                      */
        ways=ways.OpAdd(null,$04);/* increment number of ways   */
        way.getnode(ways).leaf=netrexx.lang.Rexx.toRexx("");/* and store the string's blocks */
        {netrexx.lang.Rexx $12=lw;ii=new netrexx.lang.Rexx((byte)1);ii:for(;ii.OpLtEq(null,$12);ii=ii.OpAdd(null,new netrexx.lang.Rexx(1))){
         z=s.getnode(lw).leaf.getnode(p).leaf.word(ii);
         way.getnode(ways).leaf=(way.getnode(ways).leaf).OpCcblank(null,blk.getnode(z).leaf);
         }
        }/*ii*/
       }
      }
     }/*p*/
    }
   
   /*---------------------------------------------------------------------
   * now show the result
   *--------------------------------------------------------------------*/
   ol=(($05.OpCc(null,wrd)).OpCc(null,$05)).left(wlen.OpAdd(null,$06));
   {/*select*/
   if (ways.OpEq(null,$03))
    ol=ol.OpCcblank(null,netrexx.lang.Rexx.toRexx("cannot be spelt"));
   else if (ways.OpEq(null,$04))
    ol=ol.OpCcblank(null,netrexx.lang.Rexx.toRexx("can be spelt"));
   else{
    ol=((ol.OpCcblank(null,netrexx.lang.Rexx.toRexx("can be spelt in"))).OpCcblank(null,ways)).OpCcblank(null,$07);
   }
   }
   
   netrexx.lang.RexxIO.Say(ol.OpCc(null,$08));
   if (show) 
    {
     {netrexx.lang.Rexx $13=ways;wj=new netrexx.lang.Rexx((byte)1);wj:for(;wj.OpLtEq(null,$13);wj=wj.OpAdd(null,new netrexx.lang.Rexx(1))){
      netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(' ').copies(new netrexx.lang.Rexx((byte)10)).OpCcblank(null,way.getnode(wj).leaf));
      }
     }/*wj*/
    }
   }
  }/*wi*/
  
  return;
  }

 
 private static netrexx.lang.Rexx valid(netrexx.lang.Rexx list){
  netrexx.lang.Rexx used;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx w=null;
  /*---------------------------------------------------------------------
  * Check if the same block is used more than once -> 0
  * Else: the combination is valid
  *--------------------------------------------------------------------*/
  //Parse Arg list
  used=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $14=list.words();i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$14);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   w=list.word(i);
   if ((used.getnode(w).leaf).toboolean()) 
    return new netrexx.lang.Rexx((byte)0);
   used.getnode(w).leaf=new netrexx.lang.Rexx((byte)1);
   }
  }/*i*/
  
  return new netrexx.lang.Rexx((byte)1);
  }
 
 private RAbcProblem(){return;}
 }
