/* Generated from 'RRegularExpressions.nrx' 28 Jan 2013 16:52:03 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RRegularExpressions{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("(?imx)");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("String \"");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("\"?:");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("Original:");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("Modified:");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("String: \"");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("\" Match:");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("| ");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("&&");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("& ");
 private static final java.lang.String $0="RRegularExpressions.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx st1;
  netrexx.lang.Rexx st2;
  netrexx.lang.Rexx rx1;
  netrexx.lang.Rexx rx1ef;
  boolean mcm;
  netrexx.lang.Rexx stx=null;
  java.util.regex.Pattern pt1;
  netrexx.lang.Rexx ms=null;
  java.util.regex.Matcher mc1=null;
  netrexx.lang.Rexx sx=null;
  boolean TRUE_;
  boolean FALSE_;
  boolean DEBUG;
  st1=netrexx.lang.Rexx.toRexx("Fee, fie, foe, fum, I smell the blood of an Englishman");
  st2=netrexx.lang.Rexx.toRexx("\nFee\n");
  rx1=netrexx.lang.Rexx.toRexx("f.e.*?");
  
  rx1ef=$01.OpCc(null,rx1); // use embedded flag expression == Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.COMMENTS
  
  // using String's matches & replaceAll
  mcm=(netrexx.lang.Rexx.toString(st1)).matches(netrexx.lang.Rexx.toString(rx1ef));
  
  stx=netrexx.lang.Rexx.toRexx((netrexx.lang.Rexx.toString(st1)).replaceAll(netrexx.lang.Rexx.toString(rx1ef),"foo"));
  netrexx.lang.RexxIO.Say(((((($02.OpCc(null,st1)).OpCc(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("matches pattern \""))).OpCc(null,rx1ef)).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(new java.lang.Boolean(mcm)))));
  netrexx.lang.RexxIO.Say(((((($02.OpCc(null,st1)).OpCc(null,netrexx.lang.Rexx.toRexx("\" was changed to \""))).OpCc(null,stx)).OpCc(null,netrexx.lang.Rexx.toRexx("\" via pattern \""))).OpCc(null,rx1ef)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say("");
  
  // using java.util.regex classes
  pt1=java.util.regex.Pattern.compile(netrexx.lang.Rexx.toString(rx1),(bitor(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(java.util.regex.Pattern.CASE_INSENSITIVE),new netrexx.lang.Rexx(java.util.regex.Pattern.MULTILINE),new netrexx.lang.Rexx(java.util.regex.Pattern.COMMENTS)})).toint());
  {netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[]{st1,st2};int $3=0;netrexx.lang.Rexx[] $2=new netrexx.lang.Rexx[$4.length];synchronized($4){for(;;){if($3==$2.length)break;$2[$3]=$4[$4.length-1-$3];$3++;}}ms:for(;;){if(--$3<0)break;ms=(netrexx.lang.Rexx)$2[$3];
   mc1=pt1.matcher(netrexx.lang.Rexx.toString(ms));
   mcm=mc1.matches();
   netrexx.lang.RexxIO.Say(((((($02.OpCc(null,ms)).OpCc(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("matches pattern \""))).OpCc(null,netrexx.lang.Rexx.toRexx(pt1.toString()))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(new java.lang.Boolean(mcm)))));
   if (mcm) 
    {
     mc1=pt1.matcher(netrexx.lang.Rexx.toString(ms));
     {for(;;){if(!(mc1.find()))break;
      netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("  Found the text \"").OpCc(null,netrexx.lang.Rexx.toRexx(mc1.group()))).OpCc(null,netrexx.lang.Rexx.toRexx("\" starting index:"))).OpCcblank(null,new netrexx.lang.Rexx(mc1.start()))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ending index:"))).OpCcblank(null,new netrexx.lang.Rexx(mc1.end())));
      }
     }
    }
   mc1=pt1.matcher(netrexx.lang.Rexx.toString(ms));
   
   sx=netrexx.lang.Rexx.toRexx(mc1.replaceAll("foo"));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Input string:  \"").OpCc(null,ms)).OpCc(null,$03));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Result string: \"").OpCc(null,sx)).OpCc(null,$03));
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("  regex pattern: \"").OpCc(null,rx1)).OpCc(null,$03));
   netrexx.lang.RexxIO.Say("");
   }
  }/*ms*/
  netrexx.lang.RexxIO.Say("");
  
  TRUE_=(1==1);
  FALSE_=new netrexx.lang.Rexx(TRUE_).OpNot(null);
  DEBUG=FALSE_;
  //DEBUG  = TRUE_
  if (DEBUG) 
   {
    cheesy();
    codeGeeksTut();
    funWithBitMasks();
   }
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx bitor(netrexx.lang.Rexx lst[]){
  netrexx.lang.Rexx mask;
  int ll=0;
  mask=lst[0];
  if (lst.length>1) 
   {int $5=lst.length-1;ll=1;ll:for(;ll<=$5;ll++){ // start at 2nd element
    mask=new netrexx.lang.Rexx((mask.tolong())|(lst[ll].tolong()));
    }
   }/*ll*/
  return mask;
  }
 
 public static netrexx.lang.Rexx bitor(netrexx.lang.Rexx lft,netrexx.lang.Rexx rgt){
  return bitor(new netrexx.lang.Rexx[]{lft,rgt});
  }

 
 public static netrexx.lang.Rexx bitxor(netrexx.lang.Rexx lst[]){
  netrexx.lang.Rexx mask;
  int ll=0;
  mask=lst[0];
  if (lst.length>1) 
   {int $6=lst.length-1;ll=1;ll:for(;ll<=$6;ll++){ // start at 2nd element
    mask=new netrexx.lang.Rexx((mask.tolong())^(lst[ll].tolong()));
    }
   }/*ll*/
  return mask;
  }
 
 public static netrexx.lang.Rexx bitxor(netrexx.lang.Rexx lft,netrexx.lang.Rexx rgt){
  return bitxor(new netrexx.lang.Rexx[]{lft,rgt});
  }

 
 public static netrexx.lang.Rexx bitand(netrexx.lang.Rexx lst[]){
  netrexx.lang.Rexx mask;
  int ll=0;
  mask=lst[0];
  if (lst.length>1) 
   {int $7=lst.length-1;ll=1;ll:for(;ll<=$7;ll++){ // start at 2nd element
    mask=new netrexx.lang.Rexx((mask.tolong())&(lst[ll].tolong()));
    }
   }/*ll*/
  return mask;
  }
 
 public static netrexx.lang.Rexx bitand(netrexx.lang.Rexx lft,netrexx.lang.Rexx rgt){
  return bitand(new netrexx.lang.Rexx[]{lft,rgt});
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void cheesy(){
  netrexx.lang.Rexx st1;
  netrexx.lang.Rexx st2;
  netrexx.lang.Rexx st3;
  // using String's matches & replaceAll
  st1=netrexx.lang.Rexx.toRexx("This is a string");
  if (st1.toString().matches(".*ing")) 
   {
    netrexx.lang.RexxIO.Say(($03.OpCc(null,st1)).OpCc(null,netrexx.lang.Rexx.toRexx("\" ends with \"ing\"")));
   }
  
  st2=netrexx.lang.Rexx.toRexx("Originally this is the original string");
  st3=netrexx.lang.Rexx.toRexx(st2.toString().replaceAll("[Oo]riginal","modified"));
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,st2));
  netrexx.lang.RexxIO.Say($06.OpCcblank(null,st3));
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // see: http://www.javacodegeeks.com/2012/11/java-regular-expression-tutorial-with-examples.html
 
 private static void codeGeeksTut(){
  java.util.regex.Pattern pattern_;
  java.util.regex.Matcher matcher_;
  java.util.regex.PatternSyntaxException ex=null;
  netrexx.lang.Rexx stx;
  netrexx.lang.Rexx brp[];
  netrexx.lang.Rexx RX;
  netrexx.lang.Rexx brs;
  netrexx.lang.Rexx ix=null;
  java.lang.String words_[];
  java.lang.String s_=null;
  netrexx.lang.RexxIO.Say("\n\n");
  pattern_=java.util.regex.Pattern.compile(".xx.");
  matcher_=pattern_.matcher((java.lang.CharSequence)"MxxY");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Input String matches regex -").OpCcblank(null,netrexx.lang.Rexx.toRexx((new java.lang.Boolean(matcher_.matches())).toString())));
  {try{
   // bad regular expression
   pattern_=java.util.regex.Pattern.compile("*xx*");
  }
  catch (java.util.regex.PatternSyntaxException $8){ex=$8;
   ex.printStackTrace();
  }}
  netrexx.lang.RexxIO.Say("");
  stx=netrexx.lang.Rexx.toRexx("bbb");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Using String matches() method: ").OpCcblank(null,netrexx.lang.Rexx.toRexx((new java.lang.Boolean((netrexx.lang.Rexx.toString(stx)).matches(".bb"))).toString())));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Using Pattern matches() method:").OpCcblank(null,netrexx.lang.Rexx.toRexx((new java.lang.Boolean(java.util.regex.Pattern.matches(".bb",netrexx.lang.Rexx.toString(stx)))).toString())));
  
  // Capturing groups and Backreferences can be confusing, so let’s understand this with an example.
  netrexx.lang.RexxIO.Say("");
  //say Boolean(Pattern.matches('(\\w\\d)\\1', 'a2a2')) --true
  //say Boolean(Pattern.matches('(\\w\\d)\\1', 'a2b2')) --false
  //say Boolean(Pattern.matches('(AB)(B\\d)\\2\\1', 'ABB2B2AB')) --true
  //say Boolean(Pattern.matches('(AB)(B\\d)\\2\\1', 'ABB2B3AB')) --false
  brp=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("(\\w\\d)\\1"),netrexx.lang.Rexx.toRexx("(AB)(B\\d)\\2\\1")};
  RX=netrexx.lang.Rexx.toRexx("RX");
  brs=netrexx.lang.Rexx.toRexx("");
  brs.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)4);
  brs.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("a2a2");
  brs.getnode(new netrexx.lang.Rexx((byte)1)).leaf.getnode(RX).leaf=brp[0];
  brs.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("a2b2");
  brs.getnode(new netrexx.lang.Rexx((byte)2)).leaf.getnode(RX).leaf=brp[0];
  brs.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("ABB2B2AB");
  brs.getnode(new netrexx.lang.Rexx((byte)3)).leaf.getnode(RX).leaf=brp[1];
  brs.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("ABB2B3AB");
  brs.getnode(new netrexx.lang.Rexx((byte)4)).leaf.getnode(RX).leaf=brp[1];
  {netrexx.lang.Rexx $9=brs.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ix=new netrexx.lang.Rexx((byte)1);ix:for(;ix.OpLtEq(null,$9);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((((($07.OpCc(null,brs.getnode(ix).leaf)).OpCc(null,netrexx.lang.Rexx.toRexx("\" Pattern: \""))).OpCc(null,brs.getnode(ix).leaf.getnode(RX).leaf)).OpCc(null,$08)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(new java.lang.Boolean(java.util.regex.Pattern.matches(netrexx.lang.Rexx.toString(brs.getnode(ix).leaf.getnode(RX).leaf),netrexx.lang.Rexx.toString(brs.getnode(ix).leaf)))))));
   }
  }/*ix*/
  netrexx.lang.RexxIO.Say("");
  
  // using pattern with flags
  pattern_=java.util.regex.Pattern.compile("ab",java.util.regex.Pattern.CASE_INSENSITIVE);
  matcher_=pattern_.matcher((java.lang.CharSequence)"ABcabdAb");
  // using Matcher find(), group(), start() and end() methods
  {for(;;){if(!(matcher_.find()))break;
   netrexx.lang.RexxIO.Say(((((netrexx.lang.Rexx.toRexx("Found the text \"").OpCc(null,netrexx.lang.Rexx.toRexx(matcher_.group()))).OpCc(null,netrexx.lang.Rexx.toRexx("\" starting at index"))).OpCcblank(null,new netrexx.lang.Rexx(matcher_.start()))).OpCcblank(null,netrexx.lang.Rexx.toRexx("and ending at index"))).OpCcblank(null,new netrexx.lang.Rexx(matcher_.end())));
   }
  }
  
  // using Pattern split() method
  pattern_=java.util.regex.Pattern.compile("\\W");
  words_=pattern_.split((java.lang.CharSequence)("one@two#three:four$five"));
  {int $12=0;java.lang.String[] $11=new java.lang.String[words_.length];synchronized(words_){for(;;){if($12==$11.length)break;$11[$12]=words_[words_.length-1-$12];$12++;}}s_:for(;;){if(--$12<0)break;s_=(java.lang.String)$11[$12];
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Split using Pattern.split():").OpCcblank(null,netrexx.lang.Rexx.toRexx(s_)));
   }
  }/*s_*/
  
  // using Matcher.replaceFirst() and replaceAll() methods
  pattern_=java.util.regex.Pattern.compile("1*2");
  matcher_=pattern_.matcher((java.lang.CharSequence)"11234512678");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Using replaceAll:  ").OpCcblank(null,netrexx.lang.Rexx.toRexx(matcher_.replaceAll("_"))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Using replaceFirst:").OpCcblank(null,netrexx.lang.Rexx.toRexx(matcher_.replaceFirst("_"))));
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void funWithBitMasks(){
  netrexx.lang.Rexx mf[];
  netrexx.lang.Rexx mv;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx b1;
  netrexx.lang.Rexx b2;
  netrexx.lang.Rexx b3;
  netrexx.lang.RexxIO.Say("\n\n");
  mf=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(java.util.regex.Pattern.CANON_EQ),new netrexx.lang.Rexx(java.util.regex.Pattern.CASE_INSENSITIVE),new netrexx.lang.Rexx(java.util.regex.Pattern.COMMENTS),new netrexx.lang.Rexx(java.util.regex.Pattern.DOTALL),new netrexx.lang.Rexx(java.util.regex.Pattern.LITERAL),new netrexx.lang.Rexx(java.util.regex.Pattern.MULTILINE),new netrexx.lang.Rexx(java.util.regex.Pattern.UNICODE_CASE),new netrexx.lang.Rexx(java.util.regex.Pattern.UNICODE_CHARACTER_CLASS),new netrexx.lang.Rexx(java.util.regex.Pattern.UNIX_LINES)};
  
  
  
  
  
  
  mv=new netrexx.lang.Rexx((byte)0);
  {int $15=0;netrexx.lang.Rexx[] $14=new netrexx.lang.Rexx[mf.length];synchronized(mf){for(;;){if($15==$14.length)break;$14[$15]=mf[mf.length-1-$15];$15++;}}mm:for(;;){if(--$15<0)break;mm=(netrexx.lang.Rexx)$14[$15];
   mv=mv.OpAdd(null,mm);
   }
  }/*mm*/
  netrexx.lang.RexxIO.Say((mv.right(new netrexx.lang.Rexx((byte)16))).OpCcblank(null,mv.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  {int $18=0;netrexx.lang.Rexx[] $17=new netrexx.lang.Rexx[mf.length];synchronized(mf){for(;;){if($18==$17.length)break;$17[$18]=mf[mf.length-1-$18];$18++;}}mm:for(;;){if(--$18<0)break;mm=(netrexx.lang.Rexx)$17[$18];
   netrexx.lang.RexxIO.Say((mm.right(new netrexx.lang.Rexx((byte)16))).OpCcblank(null,mm.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
   }
  }/*mm*/
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say((bitor(mf).right(new netrexx.lang.Rexx((byte)16))).OpCcblank(null,bitor(mf).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say((bitxor(mf).right(new netrexx.lang.Rexx((byte)16))).OpCcblank(null,bitxor(mf).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say((bitand(mf).right(new netrexx.lang.Rexx((byte)16))).OpCcblank(null,bitand(mf).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say("");
  b1=(new netrexx.lang.Rexx(java.util.regex.Pattern.CASE_INSENSITIVE));
  b2=(new netrexx.lang.Rexx(java.util.regex.Pattern.MULTILINE));
  b3=(new netrexx.lang.Rexx(java.util.regex.Pattern.COMMENTS));
  netrexx.lang.RexxIO.Say(((((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$09)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$09)).OpCcblank(null,b3.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitor(new netrexx.lang.Rexx[]{b1,b2,b3}).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say(((((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$011)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$011)).OpCcblank(null,b3.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitxor(new netrexx.lang.Rexx[]{b1,b2,b3}).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say(((((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$012)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$012)).OpCcblank(null,b3.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitand(new netrexx.lang.Rexx[]{b1,b2,b3}).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  b1=new netrexx.lang.Rexx((short)129);
  b2=new netrexx.lang.Rexx((short)131);
  netrexx.lang.RexxIO.Say(((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$09)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitor(b1,b2).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say(((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$011)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitxor(b1,b2).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  netrexx.lang.RexxIO.Say(((((b1.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,$012)).OpCcblank(null,b2.d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$010)).OpCcblank(null,bitand(b1,b2).d2x().x2b().right(new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)0))));
  return;
  }
 
 private RRegularExpressions(){return;}
 }
