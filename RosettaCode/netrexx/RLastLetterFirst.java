/* Generated from 'RLastLetterFirst.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RLastLetterFirst{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("searching");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("names...");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("    ");
 private static final java.lang.String[] $05={"peekpokemon","peeklongestchain","peekcurrentchain","currentlongest","lastchar","firstchar"};
 private static final java.lang.String $06="    peekpokemon = pokemon";
 private static final java.lang.String[] $07={"peekpokemon"};
 private static final java.lang.String $08="    peeklongestchain = longestchain";
 private static final java.lang.String[] $09={"peeklongestchain"};
 private static final java.lang.String $010="    peekcurrentchain = currentchain";
 private static final java.lang.String[] $011={"peekcurrentchain"};
 private static final java.lang.String $012="    lastchar = (Rexx pokemon.get(currentchain - 1)).right(1)";
 private static final java.lang.String[] $013={"lastchar"};
 private static final java.lang.String $014="      firstchar = (Rexx pokemon.get(i)).left(1)";
 private static final java.lang.String[] $015={"firstchar"};
 private static final java.lang.String $016="          currentLongest = currentchain + 1";
 private static final java.lang.String[] $017={"currentlongest"};
 private static final java.lang.String $0="RLastLetterFirst.nrx";
 /* properties private */
 private int maxx;
 private int searchsize;
 private int currentlongest;
 
 /* properties public constant */
 public static final netrexx.lang.Rexx pokemon_names=(netrexx.lang.Rexx.toRexx("audino bagon baltoy banette bidoof braviary bronzor carracosta charmeleon").OpCcblank(null,netrexx.lang.Rexx.toRexx("cresselia croagunk darmanitan deino emboar emolga exeggcute gabite"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("girafarig gulpin haxorus heatmor heatran ivysaur jellicent jumpluff kangaskhan"));

 
 /*-
 "kricketune landorus ledyba loudred lumineon lunatone machamp magnezone mamoswine" -
 "nosepass petilil pidgeotto pikachu pinsir poliwrath poochyena porygon2" -
 "porygonz registeel relicanth remoraid rufflet sableye scolipede scrafty seaking" -
 "sealeo silcoon simisear snivy snorlax spoink starly tirtouga trapinch treecko" -
 "tyrogue vigoroth vulpix wailord wartortle whismur wingull yamask"*/
 
 
 public RLastLetterFirst(){super();
  java.util.List pokemon;
  java.util.ArrayList longestchain;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx ni=null;
  pokemon=makearray(pokemon_names);
  searchsize=pokemon.size();
  currentlongest=0;
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,new netrexx.lang.Rexx(searchsize))).OpCcblank(null,$02));
  longestchain=new java.util.ArrayList();
  // run the sequence using each possible starting pokemon
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(pokemon.size()).OpSub(null,$03);i=new netrexx.lang.Rexx(new netrexx.lang.Rexx(0).toint()).OpPlus(null);i:for(;i.OpLtEq(null,$1);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   // swap the ith name to the front of our list
   java.util.Collections.swap(pokemon,0,i.toint());
   // run the chain from here
   this.searchChain(pokemon,(java.util.List)longestchain,1);
   // swap the name back so we have the list in original form
   java.util.Collections.swap(pokemon,0,i.toint());
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("maximum path length:").OpCcblank(null,new netrexx.lang.Rexx(longestchain.size())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("paths of that length:").OpCcblank(null,new netrexx.lang.Rexx(maxx)));
  netrexx.lang.RexxIO.Say("example path of that length:");
  
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(longestchain.size()).OpSub(null,$03);ni=new netrexx.lang.Rexx((byte)0);ni:for(;ni.OpLtEq(null,$2);ni=ni.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say($04.OpCc(null,new netrexx.lang.Rexx(java.lang.String.valueOf(longestchain.get(ni.toint())))));
   }
  }/*ni*/
  
  return;
  }

 // recursive search routine for adding to the chain
 
 private void searchChain(java.util.List pokemon,java.util.List longestchain,int currentchain){
  java.util.List peekpokemon;
  java.util.List peeklongestchain;
  int peekcurrentchain;
  netrexx.lang.Rexx lastchar;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx firstchar=null;
  netrexx.lang.RexxTrace $3=new netrexx.lang.RexxTrace(122,System.err,"RLastLetterFirst.nrx");
  
  $3.modnames($05,null);
  $3.modnames(null,null);
  $3.traceclause(50,$06,1,$07);peekpokemon=((java.util.List)$3.traceObject(50,pokemon,'v',1,"peekpokemon"));
  $3.traceclause(51,$08,1,$09);peeklongestchain=((java.util.List)$3.traceObject(51,longestchain,'v',1,"peeklongestchain"));
  $3.traceclause(52,$010,1,$011);peekcurrentchain=($3.traceint(52,(int)(currentchain),'v',1,"peekcurrentchain"));
  // get the last character
  $3.traceclause(54,$012,1,$013);lastchar=($3.traceRexx(54,((netrexx.lang.Rexx)(pokemon.get(new netrexx.lang.Rexx(currentchain).OpSub(null,$03).toint()))).right(new netrexx.lang.Rexx((byte)1)),'v',1,"lastchar"));
  // now we search through all of the permutations of remaining
  // matches to see if we can find a longer chain
  {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(searchsize).OpSub(null,$03);i=new netrexx.lang.Rexx(currentchain).OpPlus(null);boolean $5=true;i:for(;;){if($5){$5=false;}else{i=i.OpAdd(null,new netrexx.lang.Rexx(1));}if(!(i.OpLtEq(null,$4)))break;
   $3.traceclause(58,$014,1,$015);firstchar=($3.traceRexx(58,((netrexx.lang.Rexx)(pokemon.get(i.toint()))).left(new netrexx.lang.Rexx((byte)1)),'v',1,"firstchar"));
   // for every candidate name from here, recursively extend the chain.
   if (firstchar.OpEqS(null,lastchar)){
    {/*(Rexx pokemon.get(i)).left(1)*/
     if (currentchain==currentlongest){
      maxx=new netrexx.lang.Rexx(maxx).OpAdd(null,$03).toint();
      // have we now gone deeper than the current longest chain?
     }else{
      if (new netrexx.lang.Rexx(currentchain).OpGt(null,new netrexx.lang.Rexx(currentlongest))){
       {
        // chuck this result and refill with current set
        longestchain.clear();
        longestchain.addAll((java.util.Collection)(pokemon.subList(0,currentchain)));
        maxx=1;
        $3.traceclause(68,$016,1,$017);currentlongest=($3.traceRexx(68,new netrexx.lang.Rexx(currentchain).OpAdd(null,$03),'p',1,"currentlongest")).toint();
       }
       }
      } // perform the swap again
     java.util.Collections.swap(pokemon,currentchain,i.toint());
     // run the chain from here
     this.searchChain(pokemon,longestchain,new netrexx.lang.Rexx(currentchain).OpAdd(null,$03).toint());
     // swap the name back so we have the list in original form
     java.util.Collections.swap(pokemon,currentchain,i.toint());
    }
    }
   }
  }/*i*/
  
  return;
  }

 
 public static void main(java.lang.String args[]){
  // create the searcher and run it
  new RLastLetterFirst();
  return;
  }

 
 public static java.util.List makearray(netrexx.lang.Rexx paragraph){
  java.util.ArrayList pwords;
  netrexx.lang.Rexx w_=null;
  pwords=new java.util.ArrayList();
  {netrexx.lang.Rexx $6=paragraph.strip().words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$6);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   pwords.add((java.lang.Object)(paragraph.word(w_)));
   }
  }/*w_*/
  return (java.util.List)pwords;
  }
 }
/*
searching 70 names...
maximum path length: 23
paths of that length: 1248
example path of that length:
    machamp
    petilil
    landorus
    scrafty
    yamask
    kricketune
    emboar
    registeel
    loudred
    darmanitan
    nosepass
    simisear
    relicanth
    heatmor
    rufflet
    trapinch
    haxorus
    seaking
    girafarig
    gabite
    exeggcute
    emolga
    ivysaur
*/

