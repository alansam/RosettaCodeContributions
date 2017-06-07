/* Generated from 'RDateManipulation01.nrx' 5 Mar 2013 20:33:19 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RDateManipulation01{
 private static final java.lang.String $0="RDateManipulation01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx sampleDate,netrexx.lang.Rexx dateFmt) throws java.text.ParseException{
  return manipulateDate(sampleDate,dateFmt,0);
  }
 private static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx sampleDate,netrexx.lang.Rexx dateFmt,int dHours) throws java.text.ParseException{
  java.text.SimpleDateFormat formatter;
  int msHours;
  java.util.Date day;
  java.lang.String formatted;
  formatter=new java.text.SimpleDateFormat(netrexx.lang.Rexx.toString(dateFmt));
  msHours=((dHours*60)*60)*1000; // hours in milliseconds
  day=formatter.parse(netrexx.lang.Rexx.toString(sampleDate));
  day.setTime((day.getTime())+msHours);
  formatted=formatter.format(day);
  return netrexx.lang.Rexx.toRexx(formatted);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.lang.String sampleDate=null;
  java.lang.String dateFmt=null;
  java.lang.Exception ex=null;
  {try{
   sampleDate="March 7 2009 7:30pm EST";
   dateFmt="MMMM d yyyy h:mma z";
   netrexx.lang.RexxIO.Say(sampleDate);
   netrexx.lang.RexxIO.Say(manipulateDate(netrexx.lang.Rexx.toRexx(sampleDate),netrexx.lang.Rexx.toRexx(dateFmt),12));
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RDateManipulation01(){return;}
 }
