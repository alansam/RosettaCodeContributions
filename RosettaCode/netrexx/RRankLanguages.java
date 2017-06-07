/* Generated from 'RRankLanguages.nrx' 27 Mar 2013 20:06:12 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RRankLanguages{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="RRankLanguages.nrx";
 /* properties constant */
 protected static final netrexx.lang.Rexx cats_url=netrexx.lang.Rexx.toRexx("http://www.rosettacode.org/w/index.php?title=Special:Categories&limit=5000");
 protected static final netrexx.lang.Rexx lang_url=netrexx.lang.Rexx.toRexx("http://www.rosettacode.org/w/api.php?action=query&list=categorymembers&cmtitle=Category:Programming_Languages&cmlimit=500&format=json");

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.util.Scanner scCats=null;
  java.util.Scanner scLang=null;
  java.lang.Exception ex=null;
  {try{
   scCats=new java.util.Scanner((new java.net.URL(netrexx.lang.Rexx.toString(cats_url))).openStream());
   scLang=new java.util.Scanner((new java.net.URL(netrexx.lang.Rexx.toString(lang_url))).openStream());
   displayScan(scCats);
   displayScan(scLang);
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void displayScan(java.util.Scanner sc){
  netrexx.lang.Rexx lc=null;
  {lc=new netrexx.lang.Rexx((byte)1);lc:for(;lc.OpLtEq(null,$01);lc=lc.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(sc.hasNext()))break;
   netrexx.lang.RexxIO.Say(((lc.right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(sc.nextLine())));
   }
  }/*lc*/
  return;
  }
 
 private RRankLanguages(){return;}
 }
