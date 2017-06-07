/* Generated from 'RLastFridayOfMonth.nrx' 22 Oct 2013 21:48:05 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RLastFridayOfMonth{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1700);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final char[] $05={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RLastFridayOfMonth.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void lastFridayByLib(netrexx.lang.Rexx year){
  java.util.GregorianCalendar cal;
  java.lang.String mon=null;
  int totalDaysOfMonth=0;
  netrexx.lang.Rexx daysToRollBack=null;
  netrexx.lang.Rexx day=null;
  
  cal=new java.util.GregorianCalendar(year.toint(),0,1);
  
  {java.lang.String[] $4=(new java.text.DateFormatSymbols()).getShortMonths();int $3=0;java.lang.String[] $2=new java.lang.String[$4.length];synchronized($4){for(;;){if($3==$2.length)break;$2[$3]=$4[$4.length-1-$3];$3++;}}mon:for(;;){if(--$3<0)break;mon=(java.lang.String)$2[$3];
   if (new netrexx.lang.Rexx(mon.isEmpty()).OpNot(null)) 
    {
     totalDaysOfMonth=cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
     cal.set(java.util.Calendar.DAY_OF_MONTH,totalDaysOfMonth);
     
     daysToRollBack=((new netrexx.lang.Rexx(cal.get(java.util.Calendar.DAY_OF_WEEK)).OpAdd(null,$01))).OpRem(null,$02);
     
     day=new netrexx.lang.Rexx(totalDaysOfMonth).OpSub(null,daysToRollBack);
     cal.set(java.util.Calendar.DAY_OF_MONTH,day.toint());
     
     netrexx.lang.RexxIO.Say(((year.right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,netrexx.lang.Rexx.toRexx(mon))).OpCcblank(null,day.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0))));
     
     cal.set(year.toint(),new netrexx.lang.Rexx(cal.get(java.util.Calendar.MONTH)).OpAdd(null,$01).toint(),1);
    }
   }
  }/*mon*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void lastFridayCalc(netrexx.lang.Rexx year) throws netrexx.lang.BadArgumentException{
  int wk=0;
  int mth=0;
  int yr;
  int days[];
  int wx=0;
  netrexx.lang.Rexx yy=null;
  netrexx.lang.Rexx mm=null;
  netrexx.lang.Rexx dd=null;
  
  if (year.OpLtEq(null,$03)) 
   {
    throw new netrexx.lang.BadArgumentException(netrexx.lang.Rexx.toString(year.OpCcblank(null,netrexx.lang.Rexx.toRexx("is out of range"))));
   }
  
  
  
  yr=year.toint();
  days=new int[]{31,29,31,30,31,30,31,31,30,31,30,31}; // days in month
  days[1]=days[1]-((((yr%4))|(((((yr%100))==0?1:0))&((yr%400))))); // adjust for leap year
  
  wk=((((yr*365)+(((yr-1))/4))-(((yr-1))/100))+(((yr-1))/400))+6; // week number
  
  {mth=0;mth:for(;mth<=11;mth++){
   wk=((wk+days[mth]))%7;
   
   if (wk<5) 
    wx=-2;
   else 
    wx=5;
   yy=new netrexx.lang.Rexx(yr);
   mm=new netrexx.lang.Rexx(mth+1);
   dd=new netrexx.lang.Rexx((days[mth]+wx)-wk);
   netrexx.lang.RexxIO.Say(((((yy.right(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)0))).OpCc(null,$04)).OpCc(null,mm.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,$04)).OpCc(null,dd.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0))));
   }
  }/*mth*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx year=null;
  netrexx.lang.Rexx dlm=null;
  java.lang.Exception ex=null;
  {try{
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(arg,$05,$5);
   year=$5[0];}
   if (year.OpEq(null,$06)|year.OpEq(null,$07)) 
    year=new netrexx.lang.Rexx((short)2012);
   dlm=new netrexx.lang.Rexx('-');
   dlm=dlm.left(new netrexx.lang.Rexx((byte)60),dlm);
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say("Using Java calendar libraries");
   netrexx.lang.RexxIO.Say(dlm);
   lastFridayByLib(year);
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say("Calculated");
   netrexx.lang.RexxIO.Say(dlm);
   lastFridayCalc(year);
  }
  catch (java.lang.Exception $6){ex=$6;
   ex.printStackTrace();
  }}
  return;
  }
 
 private RLastFridayOfMonth(){return;}
 }
