/* Generated from 'REmptyString.nrx' 12 Jan 2013 14:08:57 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class REmptyString{
 private static final char[] $01={1,10,3,0,1,0,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx(":\000");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="REmptyString.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String s1;
  java.lang.String s2;
  netrexx.lang.Rexx s3=null;
  java.lang.String strings[];
  int s_=0;
  s1=""; // assignment
  s2=""; // equivalent to s1
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(new netrexx.lang.Rexx('.'),$01,$1);
  s3=$1[1];} // parsing a token that doesn't exist results in an empty string 
  
  strings=new java.lang.String[]{s1,s2,netrexx.lang.Rexx.toString(s3)," "};
  
  {int $2=strings.length-1;s_=0;s_:for(;s_<=$2;s_++){
   netrexx.lang.RexxIO.Say(((new netrexx.lang.Rexx(s_)).right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$02));
   {/*select*/
   if (strings[s_].equals(""))
    netrexx.lang.RexxIO.Say(" \""+strings[s_]+"\" is really empty");
   else if ((strings[s_].length())==0)
    netrexx.lang.RexxIO.Say(" \""+strings[s_]+"\" is empty");
   else if (netrexx.lang.Rexx.toRexx(strings[s_]).OpEq(null,$03))
    netrexx.lang.RexxIO.Say(" \""+strings[s_]+"\" looks empty but may not be");
   else if ((strings[s_].length())>0)
    netrexx.lang.RexxIO.Say(" \""+strings[s_]+"\" is not empty");
   else{
    ;
   }
   }
   }
  }/*s_*/
  
  return;
  }
 
 private REmptyString(){return;}
 }
