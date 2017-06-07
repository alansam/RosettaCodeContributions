/* Generated from 'RDateManipulation00.nrx' 28 Feb 2013 22:48:03 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RDateManipulation00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1000);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('\000');
 private static final char[] $04={2,1,122,10,1,0,4,1,1,10,1,1,3,0,10,1,0,2,1,90,4,1,1,10,1,2,3,0,10,1,0,2,1,88,4,1,3,10,1,3,1,10,1,0,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('z');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('Z');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final char[] $08={2,17,42,63,63,69,78,68,79,70,83,84,82,73,78,71,63,63,42,5,1,5,4,1,5,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("GMT");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("XXX");
 private static final char[] $011={2,17,42,63,63,69,78,68,79,70,83,84,82,73,78,71,63,63,42,5,1,6,4,1,6,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("XX");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx('X');
 private static final char[] $014={2,17,42,63,63,69,78,68,79,70,83,84,82,73,78,71,63,63,42,5,1,3,4,1,3,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(0);
 private static final char[] $016={2,1,123,2,1,125,10,1,0,2,1,123,10,1,1,2,1,125,10,1,2,1,10,2,3,1,0};
 private static final netrexx.lang.Rexx $017=netrexx.lang.Rexx.toRexx("Date");
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("hours:");
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("");
 private static final char[] $020={2,1,0,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RDateManipulation00.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx xDate,netrexx.lang.Rexx xDateFormat) throws java.text.ParseException{
  return manipulateDate(xDate,xDateFormat,new netrexx.lang.Rexx((byte)0),netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx xDate,netrexx.lang.Rexx xDateFormat,netrexx.lang.Rexx dHours) throws java.text.ParseException{
  return manipulateDate(xDate,xDateFormat,dHours,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx manipulateDate(netrexx.lang.Rexx xDate,netrexx.lang.Rexx xDateFormat,netrexx.lang.Rexx dHours,netrexx.lang.Rexx otherZones) throws java.text.ParseException{
  java.util.TimeZone tz;
  java.text.SimpleDateFormat formatter;
  netrexx.lang.Rexx msHours;
  java.util.Date day;
  java.lang.String dayFormatted;
  netrexx.lang.Rexx tzx=null;
  
  tz=getTimeZone(xDate,xDateFormat);
  formatter=new java.text.SimpleDateFormat(netrexx.lang.Rexx.toString(xDateFormat));
  msHours=dHours.OpMult(null,$01).OpMult(null,$01).OpMult(null,$02); // hours in milliseconds
  day=formatter.parse(netrexx.lang.Rexx.toString(xDate));
  //formatter.setTimeZone(tz)
  day.setTime(new netrexx.lang.Rexx(day.getTime()).OpAdd(null,msHours).tolong());
  dayFormatted=formatter.format(day);
  {netrexx.lang.Rexx $1=otherZones.words();tzx=new netrexx.lang.Rexx((byte)1);tzx:for(;tzx.OpLtEq(null,$1);tzx=tzx.OpAdd(null,new netrexx.lang.Rexx(1))){
   tz=java.util.TimeZone.getTimeZone(netrexx.lang.Rexx.toString((otherZones.word(tzx))));
   formatter.setTimeZone(tz);
   dayFormatted=netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx(dayFormatted).OpCc(null,$03)).OpCc(null,netrexx.lang.Rexx.toRexx(formatter.format(day))));
   }
  }/*tzx*/
  return netrexx.lang.Rexx.toRexx(dayFormatted);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.util.TimeZone getTimeZone(netrexx.lang.Rexx xDate,netrexx.lang.Rexx xDateFormat){
  netrexx.lang.Rexx z1=null;
  netrexx.lang.Rexx z2=null;
  netrexx.lang.Rexx x1=null;
  netrexx.lang.Rexx zoffset=null;
  java.util.TimeZone tz;
  xDate=xDate.strip();
  xDateFormat=xDateFormat.strip();
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(xDateFormat.strip(),$04,$2);
  z1=$2[1];z2=$2[2];x1=$2[3];}
  {/*select*/
  if (z1.OpEqS(null,$05))
   {
    zoffset=xDate.word(xDate.words()); // last word is zone offset
    ;
   }
  else if (z2.OpEqS(null,$06))
   {
    if ((xDate.words()).OpGt(null,$07)) 
     {
      zoffset=xDate.word(xDate.words()); // last word is zone offset
     }
    else 
     {
      {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
      netrexx.lang.RexxParse.parse(xDate,$08,$3);
      zoffset=$3[0];}
      zoffset=$09.OpCc(null,zoffset);
     }
    ;
   }
  else if (x1.OpEqS(null,$010))
   {
    {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(xDate,$011,$4);
    zoffset=$4[0];}
    if ((zoffset.right(new netrexx.lang.Rexx((byte)1))).OpEq(null,$05)) 
     zoffset=netrexx.lang.Rexx.toRexx("+00:00");
    zoffset=$09.OpCc(null,zoffset);
    ;
   }
  else if (x1.OpEqS(null,$012))
   {
    {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(xDate,$08,$5);
    zoffset=$5[0];}
    if ((zoffset.right(new netrexx.lang.Rexx((byte)1))).OpEq(null,$05)) 
     zoffset=netrexx.lang.Rexx.toRexx("+0000");
    zoffset=$09.OpCc(null,zoffset);
    ;
   }
  else if (x1.OpEqS(null,$013))
   {
    {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(xDate,$014,$6);
    zoffset=$6[0];}
    if ((zoffset.right(new netrexx.lang.Rexx((byte)1))).OpEq(null,$05)) 
     zoffset=netrexx.lang.Rexx.toRexx("+00");
    zoffset=$09.OpCc(null,zoffset);
    ;
   }
  else{
   {
    ;
   }
  }
  }
  tz=java.util.TimeZone.getTimeZone(netrexx.lang.Rexx.toString(zoffset));
  return tz;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx sampleDates[];
  netrexx.lang.Rexx tzList=null;
  netrexx.lang.Rexx sd=null;
  netrexx.lang.Rexx sampleDate=null;
  netrexx.lang.Rexx sampleDateFormat=null;
  netrexx.lang.Rexx deltaHours=null;
  netrexx.lang.Rexx mode=null;
  netrexx.lang.Rexx prefix=null;
  netrexx.lang.Rexx dates=null;
  netrexx.lang.Rexx datex=null;
  java.lang.Exception ex=null;
  // {date}                              {date format}                delta
  sampleDates=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("{March 7 2009 7:30pm EST}           {MMMM d yyyy hh:mma z}          12"),netrexx.lang.Rexx.toRexx("{March 7 2009 7:30pm GMT-05:00}     {MMMM d yyyy hh:mma zzzz}       12"),netrexx.lang.Rexx.toRexx("{March 7 2009 7:30pm EST}           {MMMM d yyyy hh:mma z}        -8.5"),netrexx.lang.Rexx.toRexx("{March 7 2009 7:30pm GMT-05:00}     {MMMM d yyyy hh:mma zzzz}     -8.5"),netrexx.lang.Rexx.toRexx("{July 7 2009 7:30pm EST5EDT}        {MMMM d yyyy hh:mma z}           0"),netrexx.lang.Rexx.toRexx("{July 7 2009 7:30pm EST5EDT}        {MMMM d yyyy hh:mma zzzz}        0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000-0800}      {yyyy-MM-dd\'T\'HH:mm:ss.SSSZ}     0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000-0000}      {yyyy-MM-dd\'T\'HH:mm:ss.SSSZZ}    0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000 GMT-05:00} {yyyy-MM-dd\'T\'HH:mm:ss.SSSZ}     0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000-08:00}     {yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX}   0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000-0800}      {yyyy-MM-dd\'T\'HH:mm:ss.SSSXX}    0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000-08}        {yyyy-MM-dd\'T\'HH:mm:ss.SSSX}     0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000Z}          {yyyy-MM-dd\'T\'HH:mm:ss.SSSXXX}   0"),netrexx.lang.Rexx.toRexx("{2012-02-28T20:00:00.000+00}        {yyyy-MM-dd\'T\'HH:mm:ss.SSSX}     0")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  if ((arg.length()).OpGt(null,$015)) 
   tzList=arg;
  else 
   tzList=netrexx.lang.Rexx.toRexx("America/Los_Angeles CST6CDT GMT"); // 'America/Los_Angeles EST5EDT GMT Europe/London CET Asia/Kolkata Asia/Kathmandu BST'
  
  {int $9=0;netrexx.lang.Rexx[] $8=new netrexx.lang.Rexx[sampleDates.length];synchronized(sampleDates){for(;;){if($9==$8.length)break;$8[$9]=sampleDates[sampleDates.length-1-$9];$9++;}}sd:for(;;){if(--$9<0)break;sd=(netrexx.lang.Rexx)$8[$9];
   {try{
    {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[4];
    netrexx.lang.RexxParse.parse(sd,$016,$10);
    sampleDate=$10[0];sampleDateFormat=$10[2];deltaHours=$10[3];}
    if (deltaHours.OpGtEq(null,$015)) 
     mode=new netrexx.lang.Rexx('+');
    else 
     mode=new netrexx.lang.Rexx('-');
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Original date:").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,sampleDate));
    prefix=((($017.OpCcblank(null,mode)).OpCcblank(null,deltaHours.abs())).OpCcblank(null,$018)).right(new netrexx.lang.Rexx((byte)20));
    dates=manipulateDate(sampleDate,sampleDateFormat,deltaHours,tzList);
    {for(;;){if(!dates.OpNotEq(null,$019))break;
     {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(dates,$020,$11);
     datex=$11[0];dates=$11[1];}
     netrexx.lang.RexxIO.Say(prefix.OpCcblank(null,datex));
     prefix=$019.left(new netrexx.lang.Rexx((byte)20));
     }
    }
    netrexx.lang.RexxIO.Say("");
   }
   catch (java.lang.Exception $12){ex=$12;
    ex.printStackTrace();
   }}
   }
  }/*sd*/
  
  return;
  }
 
 private RDateManipulation00(){return;}
 }
