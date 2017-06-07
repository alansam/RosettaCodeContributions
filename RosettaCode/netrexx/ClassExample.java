/* Generated from 'ClassExample.nrx' 3 Nov 2012 09:15:28 [v3.01] *//* Options: Compact Crossref Decimal Java Logo Symbols Trace2 UTF8 Verbose3 */
public class ClassExample{private static final java.lang.String $0="ClassExample.nrx";

/* properties private */
private int foo;

/* properties public */
public boolean bar;

/* properties indirect */
private java.lang.String baz=new java.lang.String();

public static void main(java.lang.String args[]){ClassExample clsex;
clsex=new ClassExample();
clsex.foo=42;
clsex.baz="forty-two";
clsex.bar=false;
clsex.test(clsex.foo);
clsex.test(clsex.bar);
clsex.test(clsex.baz);return;}

public void test(int s){netrexx.lang.Rexx aap;
aap=new netrexx.lang.Rexx((byte)1);
netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(s).OpCcblank(null,aap));return;}

public void test(java.lang.String s){netrexx.lang.Rexx noot;
noot=new netrexx.lang.Rexx((byte)2);
netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(s).OpCcblank(null,noot));return;}

public void test(boolean s){netrexx.lang.Rexx mies;
mies=new netrexx.lang.Rexx((byte)3);
netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(s).OpCcblank(null,mies));return;}public java.lang.String getBaz(){return baz;}public void setBaz(java.lang.String $1){baz=$1;return;}public ClassExample(){return;}}