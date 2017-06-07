/* Generated from 'GaussEaster.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



/** @see:<a href="http://american_almanac.tripod.com/gauss.htm">http://american_almanac.tripod.com/gauss.htm</a> */


public class GaussEaster{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1900);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((short)2016);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="GaussEaster.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx year=null;
  {year=$01.OpPlus(null);year:for(;year.OpLtEq(null,$02);year=year.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(getEaster(year.toint()));
   }
  }/*year*/
  
  return;
  }

 
 public static java.lang.String getEaster(int year){
  int M[];
  int N[];
  int CC;
  int a;
  int b;
  int c;
  int d;
  int e;
  int DD;
  int MM;
  
  //        0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20
  M=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,23,23,24,24};
  N=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5};
  CC=year/100;
  
  /*
   * Take the number of the year, divide by 19, call the remainder a. For 1997, a=2.
   * In the language of higher arithmetic, 1997 is congruent to two, modulo 19.
   * This tells you where, in the 19-year cycle of the phases of the moon, and the
   * calendar day, the year 1997 falls.
   */
  a=year%19;
  
  /*
   * Divide the year by four. Call the remainder b. For 1997, b=1.
   * 1997 is congruent to one, modulo four.
   * This tells you the relationship with the leap year cycle.
   */
  b=year%4;
  
  /*
   * Divide the year by seven. Call the remainder c.
   * For 1997, c=2. 1997 is congruent to two, modulo seven.
   * This tells you the relationship between the calendar day, and the day of the week.
   */
  c=year%7;
  
  /*
   * The next step is a little more complicated (Fig. 10): Divide (19a + M=24) by 30;
   * call the remainder d. For 1997, d=2. This gives you the number of days, after the vernal equinox,
   * that the Paschal Moon will appear. M changes from century to century, and is calculated from the
   * cycle of dates on which the Paschal Moon occurs, in that century. For the 18th and 19th century,
   * M=23. For the 20th century M=24.
   */
  d=(((19*a)+M[CC]))%30;
  
  /*
   * Finally, divide (2b + 4c + 6d + N=5) by seven and call the remainder e.
   * For 1997, e=6. This gives you the number of days from the Paschal Moon, to the next Sunday.
   * This formula takes into account the relationship of the year to the solar cycle. N also changes
   * from century to century and is based on the cycle of the days of the week on which the Paschal
   * Moon occurs in that century. Sunday being 0, Monday being 1, Saturday being 6.
   * For the twentieth century, N=5.
   */
  e=(((((2*b)+(4*c))+(6*d))+N[CC]))%7;
  
  DD=(22+d)+e;
  MM=3+((DD>31)?1:0);
  DD=DD-((31*((DD>31)?1:0)));
  
  return netrexx.lang.Rexx.toString(((netrexx.lang.Rexx.toRexx(netrexx.lang.Rexx.toString((new netrexx.lang.Rexx(year)).right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0)))+"-").OpCc(null,(new netrexx.lang.Rexx(MM)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,$03)).OpCc(null,(new netrexx.lang.Rexx(DD)).right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0))));
  }
 
 private GaussEaster(){return;}
 }
