/* Generated from 'RSpecialVariables.nrx' 22 Sep 2011 00:36:03 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RSpecialVariables{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("<digits>");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("</digits>");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("<form>");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("</form>");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("Java method RSpecialVariables.nrx");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("<source>");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("</source>");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx("22");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("<trace>");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("</trace>");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("NetRexx 3.00 11 Jun 2011");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("<version>");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("</version>");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("<ask>");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("</ask>");
 private static final java.lang.String $0="RSpecialVariables.nrx";

 
 
 public RSpecialVariables(){super();
  java.lang.String x;
  java.lang.String y;
  x=super.toString();
  y=this.toString();
  netrexx.lang.RexxIO.Say("<super>"+x+"</super>");
  netrexx.lang.RexxIO.Say("<this>"+y+"</this>");
  netrexx.lang.RexxIO.Say("<class>"+RSpecialVariables.class.toString()+"</class>");
  netrexx.lang.RexxIO.Say(($01.OpCc(null,(new netrexx.lang.Rexx(9)))).OpCc(null,$02));
  netrexx.lang.RexxIO.Say(($03.OpCc(null,new netrexx.lang.Rexx("scientific"))).OpCc(null,$04));
  netrexx.lang.RexxIO.Say("<[1, 2, 3].length>");
  netrexx.lang.RexxIO.Say((new int[]{1,2,3}).length);
  netrexx.lang.RexxIO.Say("</[1, 2, 3].length>");
  netrexx.lang.RexxIO.Say("<null>");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("</null>");
  netrexx.lang.RexxIO.Say(($06.OpCc(null,$05)).OpCc(null,$07));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("<sourceline>").OpCc(null,$08)).OpCc(null,netrexx.lang.Rexx.toRexx("</sourceline>")));
  netrexx.lang.RexxIO.Say(($09.OpCc(null,new netrexx.lang.Rexx("off"))).OpCc(null,$010));
  netrexx.lang.RexxIO.Say(($012.OpCc(null,$011)).OpCc(null,$013));
  
  netrexx.lang.RexxIO.Say("Type an answer:");
  netrexx.lang.RexxIO.Say(($014.OpCc(null,netrexx.lang.RexxIO.Ask())).OpCc(null,$015));
  
  return;
  }

 
 public static void main(java.lang.String args[]){
  
  new RSpecialVariables();
  
  return;
  }
 }
