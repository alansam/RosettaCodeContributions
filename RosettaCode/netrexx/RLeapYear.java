/* Generated from 'RLeapYear.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class RLeapYear{
 private static final java.lang.String $0="RLeapYear.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx years;
  netrexx.lang.Rexx y_=null;
  netrexx.lang.Rexx year=null;
  years=netrexx.lang.Rexx.toRexx("1500 1580 1581 1582 1583 1584 1600 1700 1800 1900 1994 1996 1997 2000 2004 2008 2009 2010 2011 2012 2100 2200 2300 2400 2500 2600");
  years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf=netrexx.lang.Rexx.toRexx("");
  years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf=netrexx.lang.Rexx.toRexx("");
  years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf=netrexx.lang.Rexx.toRexx("");
  years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf=netrexx.lang.Rexx.toRexx("");
  
  {netrexx.lang.Rexx $1=years.words();y_=new netrexx.lang.Rexx((byte)1);y_:for(;y_.OpLtEq(null,$1);y_=y_.OpAdd(null,new netrexx.lang.Rexx(1))){
   year=years.word(y_);
   if (isLeapyear(year.toint())) 
    years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf=(years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf).OpCcblank(null,year);
   else 
    years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf=(years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf).OpCcblank(null,year);
   if ((new java.util.GregorianCalendar()).isLeapYear(year.toint())) 
    years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf=(years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf).OpCcblank(null,year);
   else 
    years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf=(years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf).OpCcblank(null,year);
   }
  }/*y_*/
  
  years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf=years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf.strip();
  years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf=years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf.strip();
  years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf=years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf.strip();
  years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf=years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf.strip();
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(" Sample years:").OpCcblank(null,years.getnode(netrexx.lang.Rexx.toRexx("all")).leaf.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("     Leap years (algorithmically):").OpCcblank(null,years.getnode(netrexx.lang.Rexx.toRexx("l-a")).leaf.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("     Leap years (Java library)   :").OpCcblank(null,years.getnode(netrexx.lang.Rexx.toRexx("l-j")).leaf.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(" Non-leap years (algorithmically):").OpCcblank(null,years.getnode(netrexx.lang.Rexx.toRexx("n-a")).leaf.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(" Non-leap years (Java library)   :").OpCcblank(null,years.getnode(netrexx.lang.Rexx.toRexx("n-j")).leaf.changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','))));
  
  return;
  }

 // algorithmically
 
 public static final boolean isLeapyear(int year){
  boolean ly=false;
  {/*select*/
  if ((year%400)==0)
   ly=isTrue();
  else if (((year%100)!=0)&((year%4)==0))
   ly=isTrue();
  else{
   ly=isFalse();
  }
  }
  return ly;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RLeapYear(){return;}
 }
