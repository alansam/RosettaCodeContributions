/* Generated from 'RDateShowEpoch.nrx' 4 Aug 2012 12:42:18 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RDateShowEpoch{
 private static final java.lang.String $0="RDateShowEpoch.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.util.Date date_;
  java.text.DateFormat format;
  date_=new java.util.Date(0);
  format=java.text.DateFormat.getDateTimeInstance();
  format.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
  netrexx.lang.RexxIO.Say(format.format(date_));
  
  return;
  }
 
 private RDateShowEpoch(){return;}
 }
