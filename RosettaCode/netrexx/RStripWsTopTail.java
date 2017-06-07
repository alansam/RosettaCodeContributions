/* Generated from 'RStripWsTopTail.nrx' 22 Feb 2013 19:52:25 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RStripWsTopTail{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={7,1,10,1,0,7,3,10,1,2,1,10,1,4,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("*****");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("==");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('\"');
 private static final java.lang.String $0="RStripWsTopTail.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  //testAllWS(arg)
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx stripWhitespace(netrexx.lang.Rexx sstring){
  return stripWhitespace(sstring,netrexx.lang.Rexx.toRexx("BOTH"));
  }
 public static netrexx.lang.Rexx stripWhitespace(netrexx.lang.Rexx sstring,netrexx.lang.Rexx soption){
  netrexx.lang.Rexx wsChars;
  netrexx.lang.Rexx po1;
  netrexx.lang.Rexx po2=null;
  netrexx.lang.Rexx ss=null;
  netrexx.lang.Rexx sl=null;
  netrexx.lang.Rexx sm=null;
  netrexx.lang.Rexx st=null;
  //trace var po1 po2 ss sl sm st
  wsChars=getWhitspaceCharacterString();
  po1=sstring.verify(wsChars);
  if (po1.OpEq(null,$01)) 
   {
    sstring=netrexx.lang.Rexx.toRexx("");
   }
  else 
   {
    po2=(sstring.length()).OpSub(null,((sstring.reverse().verify(wsChars)).OpSub(null,$02))).OpAdd(null,$02);
    ss=sstring;
    {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[5];
    $1[1]=po1;$1[3]=po2;
    netrexx.lang.RexxParse.parse(ss,$03,$1);
    sl=$1[0];sm=$1[2];st=$1[4];}
    if (po1.OpLtEq(null,$02)) 
     sl=netrexx.lang.Rexx.toRexx("");
    soption=soption.upper();
    {/*select*/
    if (netrexx.lang.Rexx.toRexx("BOTH").abbrev(soption,new netrexx.lang.Rexx((byte)1)).toboolean())
     sstring=sm;
    else if (netrexx.lang.Rexx.toRexx("LEADING").abbrev(soption,new netrexx.lang.Rexx((byte)1)).toboolean())
     sstring=sm.OpCc(null,st);
    else if (netrexx.lang.Rexx.toRexx("TRAILING").abbrev(soption,new netrexx.lang.Rexx((byte)1)).toboolean())
     sstring=sl.OpCc(null,sm);
    else{
     sstring=sm;
    }
    }
   }
  return sstring;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /**
  * Create an array containing a useful subset of unicode whitespace characters
  *
  * @return an array of unicode whitespace characters
  * @see http://www.fileformat.info/info/unicode/category/index.htm
  */
 
 public static netrexx.lang.Rexx[] getWhitspaceCharacters(){
  netrexx.lang.Rexx wsChars[];
  wsChars=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx('\u2028'),new netrexx.lang.Rexx('\u2029'),new netrexx.lang.Rexx('\u0020'),new netrexx.lang.Rexx('\u00A0'),new netrexx.lang.Rexx('\u1680'),new netrexx.lang.Rexx('\u180E'),new netrexx.lang.Rexx('\u2000'),new netrexx.lang.Rexx('\u2001'),new netrexx.lang.Rexx('\u2002'),new netrexx.lang.Rexx('\u2003'),new netrexx.lang.Rexx('\u2004'),new netrexx.lang.Rexx('\u2005'),new netrexx.lang.Rexx('\u2006'),new netrexx.lang.Rexx('\u2007'),new netrexx.lang.Rexx('\u2008'),new netrexx.lang.Rexx('\u2009'),new netrexx.lang.Rexx('\u200A'),new netrexx.lang.Rexx('\u202F'),new netrexx.lang.Rexx('\u3000'),new netrexx.lang.Rexx('\u205F'),new netrexx.lang.Rexx('\u0008'),new netrexx.lang.Rexx('\u0009'),new netrexx.lang.Rexx('\n'),new netrexx.lang.Rexx('\u000B'),new netrexx.lang.Rexx('\u000C'),new netrexx.lang.Rexx('\r'),new netrexx.lang.Rexx('\u001C'),new netrexx.lang.Rexx('\u001D'),new netrexx.lang.Rexx('\u001E'),new netrexx.lang.Rexx('\u001F'),new netrexx.lang.Rexx('\u0085'),new netrexx.lang.Rexx('\u200B'),new netrexx.lang.Rexx('\uFEFF')};
  /* LINE SEPARATOR              [Zi] *//* PARAGRAPH SEPARATOR         [Zp] */
  /* SPACE                       [Zs] *//* NO-BREAK SPACE              [Zs] */
  /* OGHAM SPACE MARK            [Zs] *//* MONGOLIAN VOWEL SEPARATOR   [Zs] */
  /* EN QUAD                     [Zs] *//* EM QUAD                     [Zs] */
  /* EN SPACE                    [Zs] *//* EM SPACE                    [Zs] */
  /* THREE-PER-EM SPACE          [Zs] *//* FOUR-PER-EM SPACE           [Zs] */
  /* SIX-PER-EM SPACE            [Zs] *//* FIGURE SPACE                [Zs] */
  /* PUNCTUATION SPACE           [Zs] *//* THIN SPACE                  [Zs] */
  /* HAIR SPACE                  [Zs] *//* NARROW NO-BREAK SPACE       [Zs] */
  /* MEDIUM MATHEMATICAL SPACE   [Zs] *//* IDIOGRAPHIC SPACE           [Zs] */
  /* BACKSPACE                   [Cc] *//* CHARACTER TABULATION, HT    [Cc] */
  /* LINE FEED (LF)              [Cc] *//* LINE TABULATION (VT)        [Cc] */
  /* FORM FEED (FF)              [Cc] *//* CARRIAGE RETURN (CR)        [Cc] */
  /* INFORMATION SEPARATOR FOUR  [Cc] *//* INFORMATION SEPARATOR THREE [Cc] */
  /* INFORMATION SEPARATOR TWO   [Cc] *//* INFORMATION SEPARATOR ONE   [Cc] */
  /* NEXT LINE (NEL)             [Cc] */
  /* ZERO WIDTH SPACE            [Cf] *//* ZERO WIDTH NO-BREAK SPACE   [Cf] */
  
  return wsChars;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx getWhitspaceCharacterString(){
  netrexx.lang.Rexx wsCharstring;
  netrexx.lang.Rexx wsChar=null;
  wsCharstring=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx[] $5=getWhitspaceCharacters();int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[$5.length];synchronized($5){for(;;){if($4==$3.length)break;$3[$4]=$5[$5.length-1-$4];$4++;}}wsChar:for(;;){if(--$4<0)break;wsChar=(netrexx.lang.Rexx)$3[$4];
   wsCharstring=wsCharstring.OpCc(null,wsChar);
   }
  }/*wsChar*/
  return wsCharstring;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sstrings[];
  netrexx.lang.Rexx sstringO=null;
  netrexx.lang.Rexx sstringL=null;
  netrexx.lang.Rexx sstringT=null;
  netrexx.lang.Rexx sstringB=null;
  sstrings=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx(" \u0020 \u0009 \r\r \n \u2029\uFEFF1 String with white space.  \t  \r  \n \u1680  "),netrexx.lang.Rexx.toRexx(" \t 2 String with white space. \t   "),netrexx.lang.Rexx.toRexx("3 String with white space. \t"),netrexx.lang.Rexx.toRexx(" \t 4 String with white space."),netrexx.lang.Rexx.toRexx("5 String with white space."),netrexx.lang.Rexx.toRexx("\u0020\u0009\u2029\uFEFF\u1680\u2006"),netrexx.lang.Rexx.toRexx("   "),netrexx.lang.Rexx.toRexx("")};
  
  
  
  
  
  
  
  
  
  {int $8=0;netrexx.lang.Rexx[] $7=new netrexx.lang.Rexx[sstrings.length];synchronized(sstrings){for(;;){if($8==$7.length)break;$7[$8]=sstrings[sstrings.length-1-$8];$8++;}}sstringO:for(;;){if(--$8<0)break;sstringO=(netrexx.lang.Rexx)$7[$8];
   sstringL=stripWhitespace(sstringO,new netrexx.lang.Rexx('l'));
   sstringT=stripWhitespace(sstringO,new netrexx.lang.Rexx('t'));
   sstringB=stripWhitespace(sstringO);
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("  Original string  [").OpCc(null,sstringO)).OpCc(null,$04));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("    strip leading  [").OpCc(null,sstringL)).OpCc(null,$04));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("    strip trailing [").OpCc(null,sstringT)).OpCc(null,$04));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("    strip both     [").OpCc(null,sstringB)).OpCc(null,$04));
   netrexx.lang.RexxIO.Say("");
   }
  }/*sstringO*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void testAllWS(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx wsChars[];
  netrexx.lang.Rexx tt;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx wsChar=null;
  netrexx.lang.Rexx wsString=null;
  wsChars=getWhitspaceCharacters();
  tt=netrexx.lang.Rexx.toRexx("");
  {int $9=$05.OpPlus(null).toint();ix=new netrexx.lang.Rexx((byte)1);ix:for(;$9>0;$9--,ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   {int $12=0;netrexx.lang.Rexx[] $11=new netrexx.lang.Rexx[wsChars.length];synchronized(wsChars){for(;;){if($12==$11.length)break;$11[$12]=wsChars[wsChars.length-1-$12];$12++;}}wsChar:for(;;){if(--$12<0)break;wsChar=(netrexx.lang.Rexx)$11[$12];
    if (ix.OpEq(null,$02)) 
     {
      tt=tt.OpCc(null,wsChar);
     }
    else 
     {
      wsString=(((wsChar.OpCc(null,wsChar)).OpCc(null,$06)).OpCc(null,wsChar)).OpCc(null,wsChar);
      netrexx.lang.RexxIO.Say(((wsChar.c2x().right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$07)).OpCcblank(null,wsChar.c2d().right(new netrexx.lang.Rexx((byte)6))));
      netrexx.lang.RexxIO.Say(($08.OpCc(null,wsString)).OpCc(null,$08));
      netrexx.lang.RexxIO.Say(($08.OpCc(null,wsString.strip())).OpCc(null,$08));
      netrexx.lang.RexxIO.Say(($08.OpCc(null,stripWhitespace(wsString))).OpCc(null,$08));
     }
    }
   }/*wsChar*/
   }
  }/*ix*/
  
  return;
  }
 
 private RStripWsTopTail(){return;}
 }
