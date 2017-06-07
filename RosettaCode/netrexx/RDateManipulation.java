/* Generated from 'RDateManipulation.nrx' 25 Feb 2013 00:01:17 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RDateManipulation{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1000);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(12);
 private static final char[] $04={1,10,6,0,0,0,0,1,0,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("1000.0");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx("60.0");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="RDateManipulation.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  netrexx.lang.RexxIO.Say("");
  runSampleX(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx sampleDate){
  return manipulateDate(sampleDate,new netrexx.lang.Rexx((byte)12));
  }
 private static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx sampleDate,netrexx.lang.Rexx hours){
  netrexx.lang.Rexx dateFmt;
  java.text.SimpleDateFormat formatter;
  netrexx.lang.Rexx msHours;
  java.util.Date day=null;
  java.lang.String formatted=null;
  java.util.GregorianCalendar gcal=null;
  java.text.ParseException px=null;
  if ((hours==null)||(hours.datatype(new netrexx.lang.Rexx('W'))).OpNot(null)) 
   hours=new netrexx.lang.Rexx((byte)12);
  
  dateFmt=netrexx.lang.Rexx.toRexx("MMMM d yyyy h:mma zzz");
  formatter=new java.text.SimpleDateFormat(netrexx.lang.Rexx.toString(dateFmt));
  msHours=hours.OpMult(null,$01).OpMult(null,$01).OpMult(null,$02); // hours in milliseconds
  {try{
   day=formatter.parse(netrexx.lang.Rexx.toString(sampleDate));
   day.setTime(new netrexx.lang.Rexx(day.getTime()).OpAdd(null,msHours).tolong());
   formatted=formatter.format(day);
   gcal=new java.util.GregorianCalendar();
  }
  catch (java.text.ParseException $1){px=$1;
   px.printStackTrace();
  }}
  return netrexx.lang.Rexx.toRexx(formatted);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sampleDate;
  sampleDate=netrexx.lang.Rexx.toRexx("March 7 2009 7:30pm EST");
  netrexx.lang.RexxIO.Say(sampleDate);
  netrexx.lang.RexxIO.Say(manipulateDate(sampleDate));
  netrexx.lang.RexxIO.Say(manipulateDate(sampleDate,new netrexx.lang.Rexx((byte)24)));
  netrexx.lang.RexxIO.Say(manipulateDate(sampleDate,$03.OpMinus(null)));
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 static void runSampleX(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sampleDate;
  netrexx.lang.Rexx hours;
  netrexx.lang.Rexx msHours;
  java.text.SimpleDateFormat formatter;
  java.text.SimpleDateFormat fdiso8601;
  netrexx.lang.Rexx tzId=null;
  java.util.GregorianCalendar gcal;
  java.util.Date day[]=null;
  netrexx.lang.Rexx d_=null;
  java.lang.String fdu=null;
  java.lang.String fdi=null;
  java.text.ParseException px=null;
  java.lang.String tzs[];
  netrexx.lang.Rexx tz=null;
  java.util.TimeZone zone=null;
  
  sampleDate=netrexx.lang.Rexx.toRexx("March 7 2009 7:30pm EST");
  hours=new netrexx.lang.Rexx((byte)12);
  msHours=hours.OpMult(null,$01).OpMult(null,$01).OpMult(null,$02); // hours in milliseconds
  formatter=new java.text.SimpleDateFormat("MMMM d yyyy h:mma zzz");
  fdiso8601=new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ");
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(sampleDate,$04,$2);
  tzId=$2[1];}
  fdiso8601.setTimeZone(java.util.TimeZone.getTimeZone(netrexx.lang.Rexx.toString(tzId)));
  
  gcal=new java.util.GregorianCalendar();
  gcal.setTimeZone(java.util.TimeZone.getTimeZone(netrexx.lang.Rexx.toString(tzId)));
  
  {try{
   day=new java.util.Date[3];
   day[0]=formatter.parse(netrexx.lang.Rexx.toString(sampleDate));
   day[1]=new java.util.Date();
   day[1].setTime(new netrexx.lang.Rexx(day[0].getTime()).OpAdd(null,msHours).tolong());
   day[2]=new java.util.Date();
   
   {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(day.length).OpSub(null,$05);d_=new netrexx.lang.Rexx((byte)0);d_:for(;d_.OpLtEq(null,$3);d_=d_.OpAdd(null,new netrexx.lang.Rexx(1))){
    gcal.setTime(day[d_.toint()]);
    //say gcal
    fdu=formatter.format(day[d_.toint()]);
    fdi=fdiso8601.format(day[d_.toint()]);
    
    netrexx.lang.RexxIO.Say(fdu);
    netrexx.lang.RexxIO.Say(fdi);
    }
   }/*d_*/
  }
  catch (java.text.ParseException $4){px=$4;
   px.printStackTrace();
  }}
  
  tzs=java.util.TimeZone.getAvailableIDs();
  {netrexx.lang.Rexx $5=new netrexx.lang.Rexx(tzs.length).OpSub(null,$05);tz=new netrexx.lang.Rexx((byte)0);tz:for(;tz.OpLtEq(null,$5);tz=tz.OpAdd(null,new netrexx.lang.Rexx(1))){
   zone=java.util.TimeZone.getTimeZone(tzs[tz.toint()]);
   netrexx.lang.RexxIO.Say(((((((tz.right(new netrexx.lang.Rexx((byte)5))).OpCc(null,$06)).OpCcblank(null,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(zone.getRawOffset()).OpDiv(null,$07).OpDiv(null,$08).OpDiv(null,$08))).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank(null,$09)).OpCcblank(null,netrexx.lang.Rexx.toRexx(zone.getID()))).OpCcblank(null,$09)).OpCcblank(null,netrexx.lang.Rexx.toRexx(zone.getDisplayName())));
   }
  }/*tz*/
  
  return;
  }
 
 private RDateManipulation(){return;}
 }
