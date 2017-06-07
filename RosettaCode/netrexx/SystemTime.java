/* Generated from 'SystemTime.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */
import java.text.SimpleDateFormat;

public class SystemTime{
 private static final java.lang.String $0="SystemTime.nrx";
 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS")).format(new java.util.Date()));
  return;}
 
 private SystemTime(){return;}
 }