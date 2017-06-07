/* Generated from 'RRegularExpressions01.nrx' 17 Mar 2013 15:45:58 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RRegularExpressions01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("(?i)");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("String \"");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("\":");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("\" with \"");
 private static final java.lang.String $0="RRegularExpressions01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx st1;
  netrexx.lang.Rexx rx1;
  netrexx.lang.Rexx sbx;
  netrexx.lang.Rexx rx1ef;
  boolean mcm;
  netrexx.lang.Rexx stx=null;
  java.util.regex.Pattern pt1;
  java.util.regex.Matcher mc1;
  netrexx.lang.Rexx sx1=null;
  st1=netrexx.lang.Rexx.toRexx("Fee, fie, foe, fum, I smell the blood of an Englishman");
  rx1=netrexx.lang.Rexx.toRexx("f.e.*?");
  sbx=netrexx.lang.Rexx.toRexx("foo");
  
  rx1ef=$01.OpCc(null,rx1); // use embedded flag expression == Pattern.CASE_INSENSITIVE
  
  // using String's matches & replaceAll
  mcm=(netrexx.lang.Rexx.toString(st1)).matches(netrexx.lang.Rexx.toString(rx1ef));
  netrexx.lang.RexxIO.Say(((((($02.OpCc(null,st1)).OpCc(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("matches pattern \""))).OpCc(null,rx1ef)).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(new java.lang.Boolean(mcm)))));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Replace all occurrences of regex pattern \"").OpCc(null,rx1ef)).OpCc(null,$05)).OpCc(null,sbx)).OpCc(null,$03));
  
  stx=netrexx.lang.Rexx.toRexx((netrexx.lang.Rexx.toString(st1)).replaceAll(netrexx.lang.Rexx.toString(rx1ef),netrexx.lang.Rexx.toString(sbx)));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Input string:  \"").OpCc(null,st1)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Result string: \"").OpCc(null,stx)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say("");
  
  // using java.util.regex classes
  pt1=java.util.regex.Pattern.compile(netrexx.lang.Rexx.toString(rx1),java.util.regex.Pattern.CASE_INSENSITIVE);
  mc1=pt1.matcher(netrexx.lang.Rexx.toString(st1));
  mcm=mc1.matches();
  netrexx.lang.RexxIO.Say(((((($02.OpCc(null,st1)).OpCc(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("matches pattern \""))).OpCc(null,netrexx.lang.Rexx.toRexx(pt1.toString()))).OpCc(null,$04)).OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(new java.lang.Boolean(mcm)))));
  mc1=pt1.matcher(netrexx.lang.Rexx.toString(st1));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Replace all occurrences of regex pattern \"").OpCc(null,rx1)).OpCc(null,$05)).OpCc(null,sbx)).OpCc(null,$03));
  
  sx1=netrexx.lang.Rexx.toRexx(mc1.replaceAll(netrexx.lang.Rexx.toString(sbx)));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Input string:  \"").OpCc(null,st1)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Result string: \"").OpCc(null,sx1)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RRegularExpressions01(){return;}
 }
