/* Generated from 'RRangeExtractionWP01.nrx' 23 Apr 2015 20:09:14 [v3.03] *//* Options: Crossref Decimal Java Logo Trace2 UTF8 Verbose3 */







public class RRangeExtractionWP01{private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("old=");private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(999999999);private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('-');private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("new=");private static final java.lang.String $0="RRangeExtractionWP01.nrx";public static void main(java.lang.String $0s[]){netrexx.lang.Rexx aaa;netrexx.lang.Rexx i;netrexx.lang.Rexx ol;netrexx.lang.Rexx comma;netrexx.lang.Rexx inrange;netrexx.lang.Rexx n=null;netrexx.lang.RexxIO.Say("NetRexx program derived from Rexx");
aaa=netrexx.lang.Rexx.toRexx("0 1 2 4 6 7 8 11 12 14 15 16 17 18 19 20 21 22 23 24 25 27 28 29");
aaa=aaa.OpCc(null,netrexx.lang.Rexx.toRexx(" 30 31 32 33 35 36 37 38 39"));
netrexx.lang.RexxIO.Say($01.OpCc(null,aaa));
aaa=aaa.OpCcblank(null,$02);
i=new netrexx.lang.Rexx((byte)0);
ol=netrexx.lang.Rexx.toRexx("");
comma=netrexx.lang.Rexx.toRexx("");
inrange=new netrexx.lang.Rexx((byte)0);
{$1:for(;;){if(!i.OpLtEq(null,aaa.words()))break;
i=i.OpAdd(null,$03);
n=aaa.word(i);
if (n.OpEq(null,$02)) break $1;
if (inrange.toboolean()) {
if ((aaa.word(i.OpAdd(null,$03))).OpNotEq(null,n.OpAdd(null,$03))) {
ol=ol.OpCc(null,n);
inrange=new netrexx.lang.Rexx((byte)0);
}
}
else {
ol=(ol.OpCc(null,comma)).OpCc(null,n);
comma=new netrexx.lang.Rexx(',');
if ((aaa.word(i.OpAdd(null,$04))).OpEq(null,n.OpAdd(null,$04))) {
inrange=new netrexx.lang.Rexx((byte)1);
ol=ol.OpCc(null,$05);
}
}
}}
netrexx.lang.RexxIO.Say($06.OpCc(null,ol));return;}private RRangeExtractionWP01(){return;}}