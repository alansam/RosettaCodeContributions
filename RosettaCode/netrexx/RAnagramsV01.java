/* Generated from 'RAnagramsV01.nrx' 7 Aug 2013 19:43:57 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAnagramsV01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Searching");
 private static final java.lang.String $0="RAnagramsV01.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void runSample(netrexx.lang.Rexx arg) throws java.net.MalformedURLException,java.io.IOException,java.io.FileNotFoundException{
  netrexx.lang.Rexx localFile=null;
  java.io.Reader isr=null;
  java.net.URL durl=null;
  java.lang.String dictFrom=null;
  java.io.BufferedReader dictionaryReader;
  java.util.Map anagrams;
  java.lang.String aWord=null;
  netrexx.lang.Rexx count;
  char chars[]=null;
  java.lang.String key=null;
  java.util.Iterator ani;
  java.lang.Object ana=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  localFile=$1[0];}
  
  if (localFile.OpEq(null,$02)) 
   {
    durl=new java.net.URL("http://www.puzzlers.org/pub/wordlists/unixdict.txt");
    dictFrom=durl.toString();
    isr=(java.io.Reader)(new java.io.InputStreamReader(durl.openStream()));
   }
  else 
   {
    dictFrom=netrexx.lang.Rexx.toString(localFile);
    isr=(java.io.Reader)(new java.io.FileReader(netrexx.lang.Rexx.toString(localFile)));
   }
  netrexx.lang.RexxIO.Say(($03.OpCcblank(null,netrexx.lang.Rexx.toRexx(dictFrom))).OpCcblank(null,netrexx.lang.Rexx.toRexx("for anagrams")));
  dictionaryReader=new java.io.BufferedReader(isr);
  
  anagrams=(java.util.Map)(new java.util.HashMap());
  
  count=new netrexx.lang.Rexx((byte)0);
  {w_:for(;;){
   aWord=dictionaryReader.readLine();
   if (aWord==null) 
    break w_;
   chars=aWord.toCharArray();
   java.util.Arrays.sort(chars);
   key=new java.lang.String(chars);
   if ((new netrexx.lang.Rexx(anagrams.containsKey((java.lang.Object)key)).OpNot(null))) 
    {
     anagrams.put((java.lang.Object)key,(java.lang.Object)(new java.util.ArrayList()));
    }
   ((java.util.ArrayList)(anagrams.get((java.lang.Object)key))).add((java.lang.Object)aWord);
   count=new netrexx.lang.Rexx(java.lang.Math.max(count.toint(),((java.util.ArrayList)(anagrams.get((java.lang.Object)key))).size()));
   }
  }/*w_*/
  dictionaryReader.close();
  
  ani=anagrams.values().iterator();
  {a_:for(;;){if(!(ani.hasNext()))break;
   ana=ani.next();
   if (new netrexx.lang.Rexx(((java.util.ArrayList)ana).size()).OpGtEq(null,count)) 
    {
     netrexx.lang.RexxIO.Say(ana);
    }
   }
  }/*a_*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  RAnagramsV01 ra=null;
  java.lang.Exception ex=null;
  
  arg=new netrexx.lang.Rexx(args);
  {try{
   ra=new RAnagramsV01();
   ra.runSample(arg);
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 public RAnagramsV01(){return;}
 }
