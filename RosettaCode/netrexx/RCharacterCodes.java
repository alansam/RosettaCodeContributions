/* Generated from 'RCharacterCodes.nrx' 5 Mar 2013 11:54:21 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCharacterCodes{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('$');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("| \'");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("\' \'");
 private static final java.lang.String $0="RCharacterCodes.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samp;
  netrexx.lang.Rexx ci=null;
  netrexx.lang.Rexx cc=null;
  netrexx.lang.Rexx cd=null;
  netrexx.lang.Rexx cx=null;
  netrexx.lang.Rexx dc=null;
  netrexx.lang.Rexx xc=null;
  // create some sample data: character, hex and unicode
  samp=((($01.OpCc(null,new netrexx.lang.Rexx('a').sequence(new netrexx.lang.Rexx('e')))).OpCc(null,$02)).OpCc(null,new netrexx.lang.Rexx('\242').sequence(new netrexx.lang.Rexx('\245')))).OpCc(null,new netrexx.lang.Rexx('\u20a0').sequence(new netrexx.lang.Rexx('\u20b5')));
  // use the C2D C2X D2C and X2C built-in functions
  netrexx.lang.RexxIO.Say(($03.OpCc(null,samp)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say("   | Chr    C2D  C2X D2C X2C");
  netrexx.lang.RexxIO.Say("---+ --- ------ ---- --- ---");
  {netrexx.lang.Rexx $1=samp.length();ci=new netrexx.lang.Rexx((byte)1);ci:for(;ci.OpLtEq(null,$1);ci=ci.OpAdd(null,new netrexx.lang.Rexx(1))){
   cc=samp.substr(ci,new netrexx.lang.Rexx((byte)1));
   cd=cc.c2d(); // char to decimal
   cx=cc.c2x(); // char to hexadecimal
   dc=cd.d2c(); // decimal to char
   xc=cx.x2c(); // hexadecimal to char
   netrexx.lang.RexxIO.Say(((((((((((ci.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$04)).OpCc(null,cc)).OpCc(null,$03)).OpCcblank(null,cd.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,cx.right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,$03)).OpCc(null,dc)).OpCc(null,$05)).OpCc(null,xc)).OpCc(null,$03));
   }
  }/*ci*/
  return;
  }
 
 private RCharacterCodes(){return;}
 }
