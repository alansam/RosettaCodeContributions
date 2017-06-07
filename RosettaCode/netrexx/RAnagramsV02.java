/* Generated from 'RAnagramsV02.nrx' 7 Aug 2013 23:27:32 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*REXX program finds words with the largest set of anagrams (same size).*/

public class RAnagramsV02{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RAnagramsV02.nrx";
 
 public static void main(java.lang.String $0s[]) throws java.io.FileNotFoundException,java.io.IOException{
  netrexx.lang.Rexx _n_;
  netrexx.lang.Rexx _a_;
  netrexx.lang.Rexx ifid=null;
  java.io.File ifi;
  java.io.BufferedReader ifr;
  netrexx.lang.Rexx l_;
  netrexx.lang.Rexx j_=null;
  java.lang.String line=null;
  netrexx.lang.Rexx awords;
  netrexx.lang.Rexx x_=null;
  netrexx.lang.Rexx Lx=null;
  netrexx.lang.Rexx notHas=null;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx k_=null;
  netrexx.lang.Rexx y_=null;
  netrexx.lang.Rexx m_=null;
  netrexx.lang.Rexx XX=null;
  netrexx.lang.Rexx p_=null;
  netrexx.lang.Rexx loval=null;
  netrexx.lang.Rexx mA;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  _n_=new netrexx.lang.Rexx((byte)0);/*number of anagrams for word X. */
  _a_=netrexx.lang.Rexx.toRexx("");/*          anagrams for word X. */
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  ifid=$1[0];}
  if (ifid.OpEq(null,$02)) 
   ifid=netrexx.lang.Rexx.toRexx("unixdict.txt");/*input file identifier.         */
  //--ifid = 'unixdict.txt'                  /*input file identifier.         */
  //--ifid = 'testdict.txt'
  ifi=new java.io.File(netrexx.lang.Rexx.toString(ifid));
  ifr=new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(ifi)));
  //loop j_ = 1 while lines(ifid)
  //  l_[j_] = linein(ifid)
  //  end j_
  l_=netrexx.lang.Rexx.toRexx("");
  {j_=new netrexx.lang.Rexx((byte)1);j_:for(;;j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
   line=ifr.readLine();
   if (line==null) 
    break j_;
   l_.getnode(j_).leaf=netrexx.lang.Rexx.toRexx(line);
   }
  }/*j_*/
  
  awords=j_.OpSub(null,$04);/*number of words in dictionary. */
  netrexx.lang.RexxIO.Say((($05.copies(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,awords)).OpCcblank(null,netrexx.lang.Rexx.toRexx("words in the dictionary file:"))).OpCcblank(null,ifid));
  
  {int $2=awords.OpPlus(null).toint();j_=new netrexx.lang.Rexx((byte)1);j_:for(;$2>0;$2--,j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){/*process the words in dictionary*/
   x_=l_.getnode(j_).leaf;
   Lx=x_.length();
   if (Lx.OpLt(null,$06)) 
    continue j_;/*onezys & twozys can't win*/
   
   notHas=new netrexx.lang.Rexx((byte)1);
   {int $3=Lx.OpPlus(null).toint();i_=new netrexx.lang.Rexx((byte)1);i_:for(;$3>0;$3--,i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){/*build fast way to compare chars*/
    w_=x_.substr(i_,new netrexx.lang.Rexx((byte)1));
    notHas.getnode(w_).leaf=new netrexx.lang.Rexx((byte)0);/*indicate this char is in word X*/
    }
   }/*i_*/
   
   {int $4=awords.OpPlus(null).toint();k_=new netrexx.lang.Rexx((byte)1);k_:for(;$4>0;$4--,k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){/*plow through the other words.  */
    if ((l_.getnode(k_).leaf.length()).OpNotEqS(null,Lx)) 
     continue k_;/*Y length isn't right, skip it. */
    y_=l_.getnode(k_).leaf;
    {netrexx.lang.Rexx $6=$04.OpMinus(null);int $5=Lx.OpPlus(null).toint();m_=Lx.OpPlus(null);m_:for(;$5>0;$5--,m_=m_.OpAdd(null,$6)){/*see if all Y chars are in X.   */
     w_=y_.substr(m_,new netrexx.lang.Rexx((byte)1));/*(backwards is faster.)         */
     if ((notHas.getnode(w_).leaf).toboolean()) 
      continue k_;/*if doesn't have it, skip word. */
     }
    }/*m_*/
    
    XX=x_;/*make a throwaway copy of  X.   */
    {int $7=Lx.OpPlus(null).toint();p_=new netrexx.lang.Rexx((byte)1);p_:for(;$7>0;$7--,p_=p_.OpAdd(null,new netrexx.lang.Rexx(1))){/*discount dup chars not in  X.  */
     w_=XX.pos(y_.substr(p_,new netrexx.lang.Rexx((byte)1)));/*find position of the char in X.*/
     if (w_.OpEqS(null,$07)) 
      continue k_;/*Not there?  Must be a duplicate*/
     loval=new netrexx.lang.Rexx((byte)0);
     XX=loval.overlay(XX,w_);/*replace the char with  '00'x.  */
     }
    }/*p_*/
    
    if (k_.OpEqS(null,j_)) 
     continue k_;/*skip doing anagram on itself.  */
    _n_.getnode(j_).leaf=(_n_.getnode(j_).leaf).OpAdd(null,$04);
    _a_.getnode(j_).leaf=(_a_.getnode(j_).leaf).OpCcblank(null,y_);/*bump counter, add --> anagrams.*/
    }
   }/*k_*//*k_*/
   }
  }/*j_*//*j_*/
  
  mA=_n_.getnode(j_).leaf;
  {netrexx.lang.Rexx $8=awords;j_=new netrexx.lang.Rexx((byte)2);j_:for(;j_.OpLtEq(null,$8);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
   mA=mA.max(_n_.getnode(j_).leaf);
   }
  }/*j_*//*find maximum "anagrams". */
  
  {int $9=awords.OpPlus(null).toint();k_=new netrexx.lang.Rexx((byte)1);k_:for(;$9>0;$9--,k_=k_.OpAdd(null,new netrexx.lang.Rexx(1))){
   if ((_n_.getnode(k_).leaf).OpEqS(null,mA)&(_a_.getnode(k_).leaf.word(new netrexx.lang.Rexx((byte)1))).OpGt(null,l_.getnode(k_).leaf)) 
    {
     netrexx.lang.RexxIO.Say((l_.getnode(k_).leaf).OpCcblank(null,_a_.getnode(k_).leaf));
    }
   }
  }/*k_*/
  return;}
 
 private RAnagramsV02(){return;}
 }
