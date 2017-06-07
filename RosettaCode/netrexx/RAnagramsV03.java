/* Generated from 'RAnagramsV03.nrx' 8 Aug 2013 20:30:42 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RAnagramsV03{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("Searching");
 private static final java.lang.String $0="RAnagramsV03.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void findMostAnagrams(netrexx.lang.Rexx arg) throws java.net.MalformedURLException,java.io.IOException,java.io.FileNotFoundException{
  netrexx.lang.Rexx localFile=null;
  java.io.Reader isr=null;
  java.net.URL durl=null;
  java.lang.String dictFrom=null;
  java.io.BufferedReader dictionaryReader;
  netrexx.lang.Rexx anagrams;
  netrexx.lang.Rexx maxWords;
  java.lang.String aWord=null;
  char chars[]=null;
  netrexx.lang.Rexx key=null;
  netrexx.lang.Rexx count=null;
  netrexx.lang.Rexx aWords=null;
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
  
  anagrams=new netrexx.lang.Rexx((byte)0);
  maxWords=new netrexx.lang.Rexx((byte)0);
  {w_:for(;;){
   aWord=dictionaryReader.readLine();
   if (aWord==null) 
    break w_;
   chars=aWord.toCharArray();
   java.util.Arrays.sort(chars);
   key=new netrexx.lang.Rexx(chars);
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(anagrams.getnode(key).leaf,$01,$2);
   count=$2[0];aWords=$2[1];}
   aWords=(aWords.OpCcblank(null,netrexx.lang.Rexx.toRexx(aWord))).space();
   maxWords=maxWords.max(aWords.words());
   anagrams.getnode(key).leaf=(aWords.words()).OpCcblank(null,aWords);
   }
  }/*w_*/
  dictionaryReader.close();
  
  {int $5=0;java.util.Vector $4=new java.util.Vector(100,0);synchronized(anagrams){java.util.Enumeration $3=anagrams.keys();for(;;){if(!$3.hasMoreElements())break;$4.addElement($3.nextElement());if(!anagrams.testnode((netrexx.lang.Rexx)($4.elementAt($5)))){$4.removeElementAt($5);continue;}$5++;}}key:for(;;){if(--$5<0)break;key=(netrexx.lang.Rexx)$4.elementAt($5);
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(anagrams.getnode(key).leaf,$01,$6);
   count=$6[0];aWords=$6[1];}
   if (count.OpGtEq(null,maxWords)) 
    netrexx.lang.RexxIO.Say(aWords);
   else 
    anagrams.getnode(key).leaf=(netrexx.lang.Rexx)null; // remove unwanted elements from the indexed string
   }
  }/*key*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  java.lang.Exception ex=null;
  
  {try{
   findMostAnagrams(arg);
  }
  catch (java.lang.Exception $7){ex=$7;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 private RAnagramsV03(){return;}
 }
