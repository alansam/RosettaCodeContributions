/* Generated from 'RLiteralsString.nrx' 7 Nov 2012 16:06:47 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RLiteralsString{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("\"\"");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("\'\'");
 private static final java.lang.String $0="RLiteralsString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("In NetRexx, literal strings can be contained within single quotes [\']").OpCcblank(null,netrexx.lang.Rexx.toRexx("or in double quotes [\"].")));
  
  netrexx.lang.RexxIO.Say("This flexibility removes much of the need for escaping quote characters (although they can be):");
  netrexx.lang.RexxIO.Say("  Inside single quoted literals: \" results in \".");
  netrexx.lang.RexxIO.Say("  Inside double quoted literals: \' results in \'.");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Inside a string literal, quotes can be \"escaped\" by either doubling the quote\000").OpCcblank(null,netrexx.lang.Rexx.toRexx("or using a backslash (reverse solidus, \'\\\'):")));
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("  Inside double quoted literals:").OpCcblank(null,$01)).OpCcblank(null,netrexx.lang.Rexx.toRexx("results in \", \\\" results in \" and \\\' results in \'.")));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("  Inside single quoted literals:").OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx("results in \', \\\" results in \" and \\\' results in \'.")));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Verbatim strings are not supported.");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Variable expansion is not supported.");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("\"Hear documents\" are not supported");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Escaped null characters (\'\\-\', \'\\0\', \'\\x00\' or \'\\u0000\')").OpCcblank(null,netrexx.lang.Rexx.toRexx("inside literal strings translate to \'\000\', \'\000\', \'\000\' or \'\u0000\'")));
  
  netrexx.lang.RexxIO.Say("but at the end of a \"SAY\" statement they are used to indicate continuation:");
  netrexx.lang.RexxIO.Say("  say \' part 1,\\-\'");
  netrexx.lang.RexxIO.Say("  say \' part 2,\\0\'");
  netrexx.lang.RexxIO.Say("  say \' part 3,\\x00\'");
  netrexx.lang.RexxIO.Say("  say \' part 4,\\u0000\'");
  netrexx.lang.RexxIO.Say("  say \' part 5.\'");
  netrexx.lang.RexxIO.Say("results in:");
  netrexx.lang.RexxIO.Say(" part 1,\000");
  netrexx.lang.RexxIO.Say(" part 2,\000");
  netrexx.lang.RexxIO.Say(" part 3,\000");
  netrexx.lang.RexxIO.Say(" part 4,\u0000");
  netrexx.lang.RexxIO.Say(" part 5.");
  netrexx.lang.RexxIO.Say("");
  return;}
 
 private RLiteralsString(){return;}
 }
