/* Generated from 'RShowEpoch.nrx' 23 Feb 2013 14:50:29 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RShowEpoch{
 private static final java.lang.String $0="RShowEpoch.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.util.Date edate;
  java.text.DateFormat zulu;
  edate=new java.util.Date(0);
  zulu=java.text.DateFormat.getDateTimeInstance();
  zulu.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
  netrexx.lang.RexxIO.Say(zulu.format(edate));
  return;
  }
 
 private RShowEpoch(){return;}
 }
