/* Generated from 'RFiveWeekends.nrx' 24 Oct 2013 19:50:37 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* 30.08.2012 Walter Pachl derived from Rexx version 3
*                         omitting dead code left there
**********************************************************************/



public class RFiveWeekends{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((short)1900);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx((short)2100);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1905);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2095);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx((byte)12);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(14);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(4800);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(32075);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(1461);
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(367);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx(3);
 private static final java.lang.String $0="RFiveWeekends.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nr5fwe;
  netrexx.lang.Rexx years_without_5fwe;
  netrexx.lang.Rexx mnl;
  netrexx.lang.Rexx ml;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx year_has_5fwe=null;
  netrexx.lang.Rexx mi=null;
  netrexx.lang.Rexx m=null;
  netrexx.lang.Rexx jd=null;
  nr5fwe=new netrexx.lang.Rexx((byte)0);
  years_without_5fwe=new netrexx.lang.Rexx((byte)0);
  mnl=netrexx.lang.Rexx.toRexx("Jan Mar May Jul Aug Oct Dec");
  ml=netrexx.lang.Rexx.toRexx("1 3 5 7 8 10 12");
  {j=$02.OpPlus($1);j:for(;j.OpLtEq($1,$03);j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   year_has_5fwe=new netrexx.lang.Rexx((byte)0);
   {netrexx.lang.Rexx $2=ml.words();mi=new netrexx.lang.Rexx((byte)1);mi:for(;mi.OpLtEq($1,$2);mi=mi.OpAdd($1,new netrexx.lang.Rexx(1))){
    m=ml.word(mi);
    jd=greg2jul(j,m,new netrexx.lang.Rexx((byte)1));
    if (jd.OpRem($1,$04).OpEq($1,$05)) 
     {/* 1st m j is a Friday */
      nr5fwe=nr5fwe.OpAdd($1,$06);
      year_has_5fwe=new netrexx.lang.Rexx((byte)1);
      if (j.OpLtEq($1,$07)|$08.OpLtEq($1,j)) 
       netrexx.lang.RexxIO.Say(((mnl.word(mi)).OpCcblank($1,j)).OpCcblank($1,netrexx.lang.Rexx.toRexx("has 5 full weekends")));
     }
    }
   }/*mi*/
   if (j.OpEq($1,$07)) 
    netrexx.lang.RexxIO.Say("...");
   if (year_has_5fwe.OpEq($1,$09)) 
    years_without_5fwe=years_without_5fwe.OpAdd($1,$06);
   }
  }/*j*/
  netrexx.lang.RexxIO.Say(' ');
  netrexx.lang.RexxIO.Say(nr5fwe.OpCcblank($1,netrexx.lang.Rexx.toRexx("occurrences of 5 full weekends in a month")));
  netrexx.lang.RexxIO.Say(years_without_5fwe.OpCcblank($1,netrexx.lang.Rexx.toRexx("years without 5 full weekends")));
  return;
  }

 
 public static netrexx.lang.Rexx greg2jul(netrexx.lang.Rexx yy,netrexx.lang.Rexx mm,netrexx.lang.Rexx d){
  netrexx.lang.Rexx mma;
  netrexx.lang.Rexx yya;
  netrexx.lang.Rexx result;
  netrexx.lang.RexxSet $3=new netrexx.lang.RexxSet($1);
  /* *********************************************************************
  * Converts a Gregorian date to the corresponding Julian day number
  * 19891101 Walter Pachl REXXified algorithm published in CACM
  *                (Fliegel & vanFlandern, CACM Vol.11 No.10 October 1968)
  ***********************************************************************/
  $3.setDigits($010);
  /* *********************************************************************
  * The published formula:
  * res=d-32075+1461*(yy+4800+(mm-14)%12)%4+,
  *     367*(mm-2-((mm-14)%12)*12)%12-3*((yy+4900+(mm-14)%12)%100)%4
  ***********************************************************************/
  mma=((mm.OpSub($3,$011))).OpDivI($3,$012);
  yya=yy.OpAdd($3,$013).OpAdd($3,mma);
  result=d.OpSub($3,$014).OpAdd($3,$015.OpMult($3,yya).OpDivI($3,$05)).OpAdd($3,$017.OpMult($3,(mm.OpSub($3,$016).OpSub($3,mma.OpMult($3,$012)))).OpDivI($3,$012)).OpSub($3,$019.OpMult($3,(((yya.OpAdd($3,$018))).OpDivI($3,$018))).OpDivI($3,$05));
  return result;/* return the result              */
  }
 
 private RFiveWeekends(){return;}
 }
