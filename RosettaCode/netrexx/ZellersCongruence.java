/* Generated from 'ZellersCongruence.nrx' 17 Sep 2011 21:08:46 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/** @see <a href="http://mathforum.org/library/drmath/view/55837.html">http://mathforum.org/library/drmath/view/55837.html</a> */


public class ZellersCongruence{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Between");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("and");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(400);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(7);
 private static final java.lang.String $0="ZellersCongruence.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx days;
  int yearRanges[];
  netrexx.lang.Rexx searchday;
  netrexx.lang.Rexx algorithmName[];
  netrexx.lang.Rexx alg=null;
  netrexx.lang.Rexx sd=null;
  netrexx.lang.Rexx year=null;
  int dayIndex=0;
  netrexx.lang.Rexx r_=null;
  days=netrexx.lang.Rexx.toRexx("Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
  yearRanges=new int[]{new netrexx.lang.Rexx(2008).toint(),2121};
  
  searchday=netrexx.lang.Rexx.toRexx("");
  searchday.getnode(netrexx.lang.Rexx.toRexx("index")).leaf=days.wordpos(netrexx.lang.Rexx.toRexx("Sunday"));
  searchday.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  
  algorithmName=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Java Calendar"),netrexx.lang.Rexx.toRexx("Zeller[1]"),netrexx.lang.Rexx.toRexx("Zeller[2]"),netrexx.lang.Rexx.toRexx("Sakamoto"),netrexx.lang.Rexx.toRexx("Gauss"),netrexx.lang.Rexx.toRexx("Keith"),netrexx.lang.Rexx.toRexx("Babwani")};
  
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(algorithmName.length).OpSub(null,$01);alg=new netrexx.lang.Rexx((byte)0);alg:for(;alg.OpLtEq(null,$1);alg=alg.OpAdd(null,new netrexx.lang.Rexx(1))){
   sd=(searchday.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
   searchday.getnode(new netrexx.lang.Rexx((byte)0)).leaf=sd;
   searchday.getnode(netrexx.lang.Rexx.toRexx("agorithm")).leaf.getnode(sd).leaf=algorithmName[alg.toint()];
   {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(yearRanges[1]);year=new netrexx.lang.Rexx(yearRanges[0]).OpPlus(null);year:for(;year.OpLtEq(null,$2);year=year.OpAdd(null,new netrexx.lang.Rexx(1))){
    {/*select*/
    if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)0)))
     dayIndex=getDaynumJavaLibrary(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
     dayIndex=getDaynumZellersCongruenceV1(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)2)))
     dayIndex=getDaynumZellersCongruenceV2(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)3)))
     dayIndex=getDaynumSakamoto(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)4)))
     dayIndex=getDaynumGauss(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)5)))
     dayIndex=getDaynumKeith(year.toint(),12,25);
    else if (alg.OpEqS(null,new netrexx.lang.Rexx((byte)6)))
     dayIndex=getDaynumBabwani(year.toint(),12,25);
    else{
     ;
    }
    }
    if (new netrexx.lang.Rexx(dayIndex).OpEq(null,searchday.getnode(netrexx.lang.Rexx.toRexx("index")).leaf)) 
     searchday.getnode(sd).leaf=(searchday.getnode(sd).leaf).OpCcblank(null,year);
    }
   }/*year*/
   }
  }/*alg*/
  
  // display results
  netrexx.lang.RexxIO.Say(((($02.OpCcblank(null,new netrexx.lang.Rexx(yearRanges[0]))).OpCcblank(null,$03)).OpCcblank(null,new netrexx.lang.Rexx(yearRanges[1]))).OpCc(null,netrexx.lang.Rexx.toRexx(", Christmas day falls on a Sunday in the following years:")));
  {netrexx.lang.Rexx $3=searchday.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$3);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   searchday.getnode(r_).leaf=searchday.getnode(r_).leaf.strip().changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx(','));
   netrexx.lang.RexxIO.Say(((searchday.getnode(netrexx.lang.Rexx.toRexx("agorithm")).leaf.getnode(r_).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCc(null,$04)).OpCcblank(null,searchday.getnode(r_).leaf));
   }
  }/*r_*/
  
  /*
  ly = 2011
  lm = 12
  ld = 31
  loop d_ = 1 to ld
    dayIndex = getDaynumGauss(ly, lm, d_)
    say ly.right(4, 0)'-'lm.right(2, 0)'-'d_.right(2, 0)':'dayIndex
    end d_
  */
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static int getDaynumJavaLibrary(int Year,int Month,int Day){
  return getDaynumJavaLibrary(Year,Month,Day,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static int getDaynumJavaLibrary(int Year,int Month,int Day,netrexx.lang.Rexx iso){
  java.util.Calendar cal=null;
  int jmNumber[];
  int mon;
  int h;
  int w=0;
  
  // The day-of-week is an integer value where 1 is Sunday, 2 is Monday, ..., and 7 is Saturday
  // For an ISO week date Day-of-Week d (1 = Monday to 7 = Sunday), use d = ((h - 1 + 6) mod 7) + 1
  
  
  jmNumber=new int[]{java.util.Calendar.JANUARY,java.util.Calendar.FEBRUARY,java.util.Calendar.MARCH,java.util.Calendar.APRIL,java.util.Calendar.MAY,java.util.Calendar.JUNE,java.util.Calendar.JULY,java.util.Calendar.AUGUST,java.util.Calendar.SEPTEMBER,java.util.Calendar.OCTOBER,java.util.Calendar.NOVEMBER,java.util.Calendar.DECEMBER};
  
  
  
  
  
  mon=jmNumber[Month-1];
  cal=(java.util.Calendar)(new java.util.GregorianCalendar(Year,mon,Day));
  h=cal.get(java.util.Calendar.DAY_OF_WEEK);
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   w=(((((h-1)+6))%7))+1;
  else 
   w=h;
  
  return w;
  }

 // -----------------------------------------------------------------------------
 
 public static int getDaynumZellersCongruenceV1(int Year,int Month,int Day){
  return getDaynumZellersCongruenceV1(Year,Month,Day,new netrexx.lang.Rexx('Y'));
  }
 public static int getDaynumZellersCongruenceV1(int Year,int Month,int Day,netrexx.lang.Rexx iso){
  netrexx.lang.Rexx MonthFactor;
  netrexx.lang.Rexx YearFactor;
  netrexx.lang.Rexx DayNum;
  netrexx.lang.Rexx d=null;
  
  // +--------------------------------------------------------------------------
  // +  January and February are treated as month 13 and 14,
  // +  respecively, from the year before.
  // +--------------------------------------------------------------------------
  //  MonthIndex = Month          -- Save month number
  //  YearIndex  = Year           -- Save year number
  if (new netrexx.lang.Rexx(Month).OpEq(null,$01)|new netrexx.lang.Rexx(Month).OpEq(null,$05)) 
   {
    Month=new netrexx.lang.Rexx(Month).OpAdd(null,$06).toint();
    Year=new netrexx.lang.Rexx(Year).OpSub(null,$01).toint();
   }
  
  // +--------------------------------------------------------------------------
  // +  The formula f(D)=(D+(2M+3(M+1)/5))+Y+Y/4-Y/100+Y/400) mod 7 is applied.
  // +  Where:
  // +   D:  Day of month
  // +   M:  Month (3 to 14 - March to Feb.)
  // +   Y:  Year
  // +   All divisions are assumed integer.
  // +
  // +   f(D) results in an integer in the range 0-6
  // +   where 0 represents Monday etc.
  // +--------------------------------------------------------------------------
  MonthFactor=$05.OpMult(null,new netrexx.lang.Rexx(Month)).OpAdd(null,$07.OpMult(null,(new netrexx.lang.Rexx(Month).OpAdd(null,$01))).OpDivI(null,$08));
  YearFactor=new netrexx.lang.Rexx(Year).OpAdd(null,new netrexx.lang.Rexx(Year).OpDivI(null,$09)).OpSub(null,new netrexx.lang.Rexx(Year).OpDivI(null,$010)).OpAdd(null,new netrexx.lang.Rexx(Year).OpDivI(null,$011));
  DayNum=((new netrexx.lang.Rexx(Day).OpAdd(null,MonthFactor).OpAdd(null,YearFactor))).OpRem(null,$012);
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   d=DayNum.OpAdd(null,$01);/* Increment to allow indexing from 1 */
  else 
   d=DayNum;
  
  return d.toint();
  }

 // -----------------------------------------------------------------------------
 
 public static int getDaynumZellersCongruenceV2(int Year,int Month,int Day){
  return getDaynumZellersCongruenceV2(Year,Month,Day,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static int getDaynumZellersCongruenceV2(int Year,int Month,int Day,netrexx.lang.Rexx iso){
  int q;
  int m;
  int Y;
  int h;
  int d=0;
  
  if (Month<3) 
   {
    Month=Month+12;
    Year--;
   }
  
  /*
   h is the day of the week (0 = Saturday, 1 = Sunday, 2 = Monday, ...)
   q is the date of the month
   m is the month (3 = March, 4 = April, 5 = May, ..., 14 = February)
   K the year of the century ().
   J is the century (actually ) (For example, in 1995 the century would be 19, even though it was the 20th century.)
   Y is the year
  For an ISO week date Day-of-Week d (1 = Monday to 7 = Sunday), use d = ((h + 5) mod 7) + 1
   */
  q=Day;
  m=Month;
  //K = Year // 100
  //J = year % 100
  Y=Year;
  
  //h = (q + Math.floor((m + 1) * 26 / 10) + K + Math.floor(K / 4) + Math.floor(J / 4) + 5 * J)) // 7
  //h = (q + Math.floor((m + 1) * 26 / 10) + Y + Math.floor(Y / 4) + 6 * Math.floor(Y / 100) + Math.floor(Y / 400)) // 7
  h=((((((q+(((((m+1))*26)/10)))+Y)+((Y/4)))+(6*((Y/100))))+((Y/400))))%7;
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   d=((((h+5))%7))+1;
  else 
   d=h;
  
  return d;
  }

 // -----------------------------------------------------------------------------
 
 public static int getDaynumSakamoto(int y,int m,int d){
  return getDaynumSakamoto(y,m,d,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static int getDaynumSakamoto(int y,int m,int d,netrexx.lang.Rexx iso){
  int t[];
  int h;
  
  /*
   h is the day of the week (0 = Sunday, 1 = Monday, 2 = Tuesday...)
   d is the date of the month
   m is the month (3 = March, 4 = April, 5 = May, ..., 14 = February)
   y is the year
   For an ISO week date Day-of-Week d (1 = Monday to 7 = Sunday), use d = ((h + 6) mod 7) + 1
   */
  
  t=new int[]{0,3,2,5,0,3,5,1,4,6,2,4};
  y=y-((m<3)?1:0);
  //h = (y + Math.floor(y / 4) - Math.floor(y / 100) + Math.floor(y / 400) + t[m - 1] + d) // 7
  h=((((((y+(y/4))-(y/100))+(y/400))+(t[m-1]))+d))%7;
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   d=((((h+6))%7))+1;
  else 
   d=h;
  
  return d;
  }

 // -----------------------------------------------------------------------------
 
 public static int getDaynumGauss(int Year,int Month,int Day){
  return getDaynumGauss(Year,Month,Day,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static int getDaynumGauss(int Year,int Month,int Day,netrexx.lang.Rexx iso){
  double k;
  double C;
  double Y;
  double m;
  int W;
  int h=0;
  
  /*
   The following formula, which is for the Gregorian calendar only, may be more convenient for computer programming.
   Note that in some programming languages the remainder operation can yield a negative result if given a negative
   operand, so mod 7 may not translate to a simple remainder.
  
   W = (k + floor(2.6m - 0.2) - 2C + Y + floor(Y/4) + floor(C/4)) mod 7
  
   where floor() denotes the integer floor function,
   k is day (1 to 31)
   m is month (1 = March, ..., 10 = December, 11 = Jan, 12 = Feb) Treat Jan & Feb as months of the preceding year
   C is century (1987 has C = 19)
   Y is year (1987 has Y = 87 except Y = 86 for Jan & Feb)
   W is week day (0 = Sunday, ..., 6 = Saturday)
   */
  
  Year=Year-((Month<3)?1:0);
  k=(double)Day;
  C=(double)(Year/100);
  Y=(double)(Year%100);
  m=(double)(((((Month+9))%12))+1);
  //m = m - 2
  //m = m + (12 * (m < 0))
  
  //mf = Math.floor(2.6 * m - 0.2)
  //yf = Math.floor(Y / 4)
  //cf = Math.floor(C / 4)
  //c2 = 2 * C
  //W = DOWGauss.mod(int (k + mf - c2 + Y + yf + cf), 7)
  W=modulo((int)((((((k+(java.lang.Math.floor((2.6D*m)-0.2D)))+Y)+(java.lang.Math.floor(Y/((double)4))))+(java.lang.Math.floor(C/((double)4))))-(((double)2)*C))),7);
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   h=((((W+6))%7))+1;
  else 
   h=W;
  
  return h;
  }

 // -----------------------------------------------------------------------------
 /*
  * Mike Keith has given, as the shortest C Day-of-Week expression (45 characters) :-
  * (d+=m<3?y--:y-2,23*m/9+d+4+y/4-y/100+y/400)%7 // Sunday = 0
  */
 
 public static final int getDaynumKeith(int y,int m,int d){
  return getDaynumKeith(y,m,d,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static final int getDaynumKeith(int y,int m,int d,netrexx.lang.Rexx iso){
  int h;
  int W=0;
  
  if (m<3) 
   {
    d=d+y;
    y--;
   }
  else 
   {
    d=(d+y)-2;
   }
  
  h=((((((((23*m)/9)+d)+4)+(y/4))-(y/100))+(y/400)))%7;
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   W=((((h+6))%7))+1;
  else 
   W=h;
  
  return W;
  }

 // -----------------------------------------------------------------------------
 
 public static final int getDaynumBabwani(int Year,int Month,int Day){
  return getDaynumBabwani(Year,Month,Day,netrexx.lang.Rexx.toRexx("Y"));
  }
 public static final int getDaynumBabwani(int Year,int Month,int Day,netrexx.lang.Rexx iso){
  int y;
  int m;
  int d;
  int dow=0;
  double dowfg=0;
  int fmonth=0;
  int leap=0;
  int century;
  int lastdigits;
  int W=0;
  // return dow = Day of week: 0 = Saturday, 1 = Sunday, ... 6 = Friday
  
  y=Year;
  m=Month;
  d=Day;
  
  // dow stands for day of week
  
  
  
  
  if (((((y%100)==0))&(((y%400)!=0))))  // leap function 1 for leap & 0 for non-leap
   leap=0;
  else 
   if (((y%4)==0)) 
    leap=1;
   else 
    leap=0;
  
  fmonth=(3+(((2-leap))*((((m+2))/((2*m))))))+((((5*m)+(m/9)))/2); // f(m) formula
  fmonth=fmonth%7; // f(m) is brought in range of 0 to 6
  
  century=y/100;
  lastdigits=y%100;
  
  dowfg=(((1.25F*((float)lastdigits))+((float)fmonth))+((float)d))-((float)(2*((century%4)))); // function of weekday for Gregorian
  dow=(int)(dowfg%((double)7)); // remainder on division by 7
  
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(iso.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   W=((((dow+5))%7))+1;
  else 
   W=dow;
  
  return W;
  }

 // -----------------------------------------------------------------------------
 
 protected static int modulo(int N,int D){
  return ((D+((N%D))))%D;
  }
 
 private ZellersCongruence(){return;}
 }
