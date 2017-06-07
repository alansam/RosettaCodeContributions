/* Generated from 'RDateTest.nrx' 4 Aug 2012 12:42:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RDateTest{
 private static final java.lang.String $0="RDateTest.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.util.Date date_;
  java.text.DateFormat format;
  date_=new java.util.Date(0);
  format=java.text.DateFormat.getDateTimeInstance();
  format.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
  java.lang.System.out.println(format.format(date_));
  return;}
 
 private RDateTest(){return;}
 }
