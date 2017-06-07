/* Generated from 'RGenericSwap.nrx' 7 Oct 2013 21:30:12 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// Simple values with no spaces can be swapped without the use of a parse template

public class RGenericSwap{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("</rval>");
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final char[] $05={6,1,10,1,0,1,10,1,2,0};
 private static final java.lang.String $0="RGenericSwap.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx lval;
  netrexx.lang.Rexx rval;
  netrexx.lang.Rexx dlm;
  lval=new netrexx.lang.Rexx((byte)27);
  rval=new netrexx.lang.Rexx((byte)5);
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Before - <lval>").OpCc(null,lval)).OpCc(null,netrexx.lang.Rexx.toRexx("</lval> <rval>"))).OpCc(null,rval)).OpCc(null,$01));
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse((lval.OpCcblank(null,rval)),$02,$1);
  rval=$1[0];lval=$1[1];}
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("After  - <lval>").OpCc(null,lval)).OpCc(null,netrexx.lang.Rexx.toRexx("</lval> <rval>"))).OpCc(null,rval)).OpCc(null,$01));
  netrexx.lang.RexxIO.Say("");
  
  // More complex data needs to use some form of parsing template
  lval=netrexx.lang.Rexx.toRexx("This value started on the left");
  rval=netrexx.lang.Rexx.toRexx("This value started on the right");
  dlm=new netrexx.lang.Rexx("-139660277928703"); // some_delimiting_value_that_is_unlikely_to_occur_in_the_LVAL_to_be_swapped
  // 8    0    f    a    c    e    b    e    a    d    0    1
  // 1000 0000 1111 1010 1100 1110 1011 1110 1010 1101 0000 0001
  // -139660277928703
  netrexx.lang.RexxIO.Say((dlm.OpCcblank(null,dlm.d2x(new netrexx.lang.Rexx((byte)12)))).OpCcblank(null,dlm.d2b($03.OpMult(null,$04))));
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Before - <lval>").OpCc(null,lval)).OpCc(null,netrexx.lang.Rexx.toRexx("</lval> <rval>"))).OpCc(null,rval)).OpCc(null,$01));
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  $2[1]=dlm;
  netrexx.lang.RexxParse.parse(((lval.OpCc(null,dlm)).OpCc(null,rval)),$05,$2);
  rval=$2[0];lval=$2[2];}
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("After  - <lval>").OpCc(null,lval)).OpCc(null,netrexx.lang.Rexx.toRexx("</lval> <rval>"))).OpCc(null,rval)).OpCc(null,$01));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RGenericSwap(){return;}
 }
