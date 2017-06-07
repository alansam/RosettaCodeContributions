/* Generated from 'DateFormat.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */
import java.text.SimpleDateFormat;

public class DateFormat{
 private static final java.lang.String $0="DateFormat.nrx";
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("yyyy-MM-dd")).format(new java.util.Date()));
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("EEEE, MMMM dd, yyyy")).format(new java.util.Date()));
  return;}
 
 private DateFormat(){return;}
 }