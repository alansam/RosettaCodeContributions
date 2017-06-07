/* Generated from 'RCharacterMatch.nrx' 11 Jul 2011 17:53:37 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Given two strings, demonstrate the following 3 types of matchings:
 * <ol>
 * <li>Determining if the first string starts with second string</li>
 * <li>Determining if the first string contains the second string at any location</li>
 * <li>Determining if the first string ends with the second string<.li>
 * <p>
 * Optional requirements:
 * </p>
 * <ol>
 * <li>Print the location of the match for part 2</li>
 * <li>Handle multiple occurrences of a string for part 2.</li>
 * </ol>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Character_matching">rosettacode.org/wiki/Character_matching</a>
 */


public class RCharacterMatch{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RCharacterMatch.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx lipsum;
  netrexx.lang.Rexx x_;
  netrexx.lang.Rexx srch;
  netrexx.lang.Rexx j_=null;
  netrexx.lang.Rexx x1=null;
  netrexx.lang.Rexx x2=null;
  netrexx.lang.Rexx x3=null;
  netrexx.lang.Rexx many;
  netrexx.lang.Rexx o_=null;
  netrexx.lang.Rexx k_=null;
  lipsum=netrexx.lang.Rexx.toRexx("");
  x_=new netrexx.lang.Rexx((byte)0);
  x_=x_.OpAdd(null,$01);
  lipsum.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x_;
  lipsum.getnode(x_).leaf=netrexx.lang.Rexx.toRexx("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
  x_=x_.OpAdd(null,$01);
  lipsum.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x_;
  lipsum.getnode(x_).leaf=lipsum.getnode(new netrexx.lang.Rexx((byte)1)).leaf.reverse();
  
  srch=netrexx.lang.Rexx.toRexx("");
  srch.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("Lorem ipsum dolor sit amet");
  srch.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("consectetur adipisicing elit");
  srch.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("dolore magna aliqua.");
  
  {netrexx.lang.Rexx $1=lipsum.getnode(new netrexx.lang.Rexx((byte)0)).leaf;j_=new netrexx.lang.Rexx((byte)1);j_:for(;j_.OpLtEq(null,$1);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
   x1=lipsum.getnode(j_).leaf.pos(srch.getnode(new netrexx.lang.Rexx((byte)1)).leaf);
   x2=lipsum.getnode(j_).leaf.pos(srch.getnode(new netrexx.lang.Rexx((byte)2)).leaf);
   x3=lipsum.getnode(j_).leaf.lastpos(srch.getnode(new netrexx.lang.Rexx((byte)3)).leaf);
   
   report(x1.OpEq(null,$01),lipsum.getnode(j_).leaf,srch.getnode(new netrexx.lang.Rexx((byte)1)).leaf,netrexx.lang.Rexx.toRexx("Test string starts with search string:"),netrexx.lang.Rexx.toRexx("Test string does not start with search string:"));
   report(x2.OpGt(null,$02),lipsum.getnode(j_).leaf,srch.getnode(new netrexx.lang.Rexx((byte)2)).leaf,netrexx.lang.Rexx.toRexx("Search string located in test string at position:").OpCcblank(null,x2),netrexx.lang.Rexx.toRexx("Search string not found within test string:"));
   report(x3.OpNotEq(null,srch.getnode(new netrexx.lang.Rexx((byte)3)).leaf.length()),lipsum.getnode(j_).leaf,srch.getnode(new netrexx.lang.Rexx((byte)3)).leaf,netrexx.lang.Rexx.toRexx("Test string ends with search string:"),netrexx.lang.Rexx.toRexx("Test string does not start with search string:"));
   }
  }/*j_*/
  
  many=netrexx.lang.Rexx.toRexx("");
  x_=new netrexx.lang.Rexx((byte)0);
  x_=x_.OpAdd(null,$01);
  many.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x_;
  many.getnode(x_).leaf=netrexx.lang.Rexx.toRexx("How many times does \"many times\" occur in this string?");
  x_=x_.OpAdd(null,$01);
  many.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x_;
  many.getnode(x_).leaf=netrexx.lang.Rexx.toRexx("How often does \"many times\" occur in this string?");
  x_=x_.OpAdd(null,$01);
  many.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x_;
  many.getnode(x_).leaf=netrexx.lang.Rexx.toRexx("How often does it occur in this string?");
  srch.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("many times");
  
  {netrexx.lang.Rexx $2=many.getnode(new netrexx.lang.Rexx((byte)0)).leaf;j_=new netrexx.lang.Rexx((byte)1);j_:for(;j_.OpLtEq(null,$2);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
   o_=new netrexx.lang.Rexx((byte)0);
   k_=new netrexx.lang.Rexx((byte)0);
   {boolean $3=true;dups:for(;;){if($3){$3=false;}else{if(o_.OpEq(null,$02))break;}
    o_=many.getnode(j_).leaf.pos(srch.getnode(new netrexx.lang.Rexx((byte)4)).leaf,o_.OpAdd(null,$01));
    if (o_.OpNotEq(null,$02)) 
     k_=k_.OpAdd(null,$01);
    }
   }/*dups*/
   report(k_.OpGt(null,$02),many.getnode(j_).leaf,srch.getnode(new netrexx.lang.Rexx((byte)4)).leaf,netrexx.lang.Rexx.toRexx("Number of times search string occurs:").OpCcblank(null,k_),netrexx.lang.Rexx.toRexx("Search string not found"));
   }
  }/*j_*/
  return;}

 
 public static void report(boolean state,netrexx.lang.Rexx ts,netrexx.lang.Rexx ss,netrexx.lang.Rexx testSuccess,netrexx.lang.Rexx testFailure){
  if (state) 
   netrexx.lang.RexxIO.Say(testSuccess);
  else 
   netrexx.lang.RexxIO.Say(testFailure);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("    Test string:").OpCcblank(null,ts));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Search string:").OpCcblank(null,ss));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RCharacterMatch(){return;}
 }
