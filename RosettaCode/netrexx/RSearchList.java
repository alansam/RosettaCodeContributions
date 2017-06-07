/* Generated from 'RSearchList.nrx' 19 Feb 2013 16:52:06 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RSearchList{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("  ");
 private static final java.lang.String $0="RSearchList.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  driver(arg); // call the test wrapper
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx searchListOfWords(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle) throws java.lang.Exception{
  return searchListOfWords(haystack,needle,(1==1),(1==1));
  }
 public static netrexx.lang.Rexx searchListOfWords(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle,boolean forwards) throws java.lang.Exception{
  return searchListOfWords(haystack,needle,forwards,(1==1));
  }
 public static netrexx.lang.Rexx searchListOfWords(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle,boolean forwards,boolean respectCase) throws java.lang.Exception{
  netrexx.lang.Rexx wp=null;
  
  if (new netrexx.lang.Rexx(respectCase).OpNot(null)) 
   {
    needle=needle.upper();
    haystack=haystack.upper();
   }
  if (forwards) 
   wp=haystack.wordpos(needle);
  else 
   wp=(haystack.words()).OpSub(null,haystack.reverse().wordpos(needle.reverse())).OpAdd(null,$01);
  if (wp.OpEq(null,$02)) 
   throw new java.lang.Exception(netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx("*** Error! \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" not found in list ***"))));
  
  return wp;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx searchIndexedList(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle) throws java.lang.Exception{
  return searchIndexedList(haystack,needle,(1==1),(1==1));
  }
 public static netrexx.lang.Rexx searchIndexedList(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle,boolean forwards) throws java.lang.Exception{
  return searchIndexedList(haystack,needle,forwards,(1==1));
  }
 public static netrexx.lang.Rexx searchIndexedList(netrexx.lang.Rexx haystack,netrexx.lang.Rexx needle,boolean forwards,boolean respectCase) throws java.lang.Exception{
  netrexx.lang.Rexx strtIx=null;
  netrexx.lang.Rexx endIx=null;
  netrexx.lang.Rexx incrIx=null;
  netrexx.lang.Rexx wp;
  netrexx.lang.Rexx ix=null;
  if (forwards) 
   {
    strtIx=new netrexx.lang.Rexx((byte)1);
    endIx=haystack.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    incrIx=new netrexx.lang.Rexx((byte)1);
   }
  else 
   {
    strtIx=haystack.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    endIx=new netrexx.lang.Rexx((byte)1);
    incrIx=$01.OpMinus(null);
   }
  
  wp=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $1=endIx;netrexx.lang.Rexx $2=incrIx;boolean $3=$2.OpGtEq(null,$02);ix=strtIx.OpPlus(null);ix:for(;$3?ix.OpLtEq(null,$1):ix.OpGtEq(null,$1);ix=ix.OpAdd(null,$2)){
   if (respectCase) 
    if (needle.OpEqS(null,haystack.getnode(ix).leaf)) 
     wp=ix;
    else 
     ;
   else 
    if ((needle.upper()).OpEqS(null,haystack.getnode(ix).leaf.upper())) 
     wp=ix;
    else 
     ;
   if (wp.OpGt(null,$02)) 
    break ix;
   }
  }/*ix*/
  if (wp.OpEq(null,$02)) 
   throw new java.lang.Exception(netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx("*** Error! \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" not found in indexed list ***"))));
  
  return wp;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Test wrapper
 
 public static void driver(netrexx.lang.Rexx arg){
  boolean TRUE_;
  boolean FALSE_;
  boolean FORWARDS_;
  boolean BACKWARDS_;
  boolean CASERESPECT_;
  boolean CASEIGNORE_;
  netrexx.lang.Rexx needles[];
  netrexx.lang.Rexx hayrick;
  netrexx.lang.Rexx cornstook;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx needle=null;
  netrexx.lang.Rexx idxF=null;
  netrexx.lang.Rexx idxL=null;
  java.lang.Exception ex=null;
  netrexx.lang.Rexx corn=null;
  netrexx.lang.Rexx ci=null;
  // some manifests
  TRUE_=(1==1);
  FALSE_=new netrexx.lang.Rexx(TRUE_).OpNot(null);
  FORWARDS_=TRUE_;
  BACKWARDS_=FALSE_;
  CASERESPECT_=TRUE_;
  CASEIGNORE_=new netrexx.lang.Rexx(CASERESPECT_).OpNot(null);
  
  // test data
  needles=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("barley"),netrexx.lang.Rexx.toRexx("quinoa")};
  
  // a simple list of words.  Lists of words are indexable in NetRexx via the word(N) function
  hayrick=netrexx.lang.Rexx.toRexx("Barley maize barley sorghum millet wheat rice rye barley Barley oats flax");
  
  // a Rexx indexed string made up from the words in hayrick
  cornstook=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $4=hayrick.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$4);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){ // populate the indexed string
   cornstook.getnode(new netrexx.lang.Rexx((byte)0)).leaf=w_;
   cornstook.getnode(w_).leaf=hayrick.word(w_);
   }
  }/*w_*/
  
  {int $7=0;netrexx.lang.Rexx[] $6=new netrexx.lang.Rexx[needles.length];synchronized(needles){for(;;){if($7==$6.length)break;$6[$7]=needles[needles.length-1-$7];$7++;}}needle:for(;;){if(--$7<0)break;needle=(netrexx.lang.Rexx)$6[$7];
   {try{ // process the list of words
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Searching for \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" in the list \""))).OpCc(null,hayrick)).OpCc(null,$03));
    idxF=searchListOfWords(hayrick,needle);
    idxL=searchListOfWords(hayrick,needle,BACKWARDS_);
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The first occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxF)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the list")));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The last occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxL)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the list")));
    idxF=searchListOfWords(hayrick,needle,FORWARDS_,CASEIGNORE_);
    idxL=searchListOfWords(hayrick,needle,BACKWARDS_,CASEIGNORE_);
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The first caseless occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxF)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the list")));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The last caseless occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxL)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the list")));
    netrexx.lang.RexxIO.Say("");
   }
   catch (java.lang.Exception $8){ex=$8;
    netrexx.lang.RexxIO.Say($04.OpCc(null,netrexx.lang.Rexx.toRexx(ex.getMessage())));
    netrexx.lang.RexxIO.Say("");
   }}
   
   {try{ // process the indexed list
    corn=netrexx.lang.Rexx.toRexx("");
    {netrexx.lang.Rexx $9=cornstook.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ci=new netrexx.lang.Rexx((byte)1);ci:for(;ci.OpLtEq(null,$9);ci=ci.OpAdd(null,new netrexx.lang.Rexx(1))){
     corn=corn.OpCcblank(null,cornstook.getnode(ci).leaf);
     }
    }/*ci*/
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Searching for \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" in the indexed list \""))).OpCc(null,corn.space())).OpCc(null,$03));
    idxF=searchIndexedList(cornstook,needle);
    idxL=searchIndexedList(cornstook,needle,BACKWARDS_);
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The first occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxF)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the indexed list")));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The last occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxL)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the indexed list")));
    idxF=searchIndexedList(cornstook,needle,FORWARDS_,CASEIGNORE_);
    idxL=searchIndexedList(cornstook,needle,BACKWARDS_,CASEIGNORE_);
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The first caseless occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxF)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the indexed list")));
    netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("  The last caseless occurence of \"").OpCc(null,needle)).OpCc(null,netrexx.lang.Rexx.toRexx("\" is at index"))).OpCcblank(null,idxL)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in the indexed list")));
    netrexx.lang.RexxIO.Say("");
   }
   catch (java.lang.Exception $10){ex=$10;
    netrexx.lang.RexxIO.Say($04.OpCc(null,netrexx.lang.Rexx.toRexx(ex.getMessage())));
    netrexx.lang.RexxIO.Say("");
   }}
   }
  }/*needle*/
  
  return;
  }
 
 private RSearchList(){return;}
 }
