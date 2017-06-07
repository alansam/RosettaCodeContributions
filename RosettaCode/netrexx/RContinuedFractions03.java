/* Generated from 'RContinuedFractions03.nrx' 24 Sep 2012 14:47:23 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* REXX *************************************************************
* The task description specifies a continued fraction for pi
* that gives a reasonable approximation.
* Literature shows a better CF that yields pi with a precision of
* 200 digits.
* http://de.wikipedia.org/wiki/Kreiszahl
*                    1
* pi = 3 + ------------------------
*                      1
*          7 + --------------------
*                         1
*              15 + ---------------
*                            1
*                   1 + -----------

*                       292 + ...

* This program uses that CF and shows the first 50 digits
* PI =3.1415926535897932384626433832795028841971693993751...
* PIX=3.1415926535897932384626433832795028841971693993751...
* 201 correct digits
* 18.09.2012 Walter Pachl
**********************************************************************/




public class RContinuedFractions03{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("693993751058209749445923078164062862089986280348");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("253421170679821480865132823066470938446095505822");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("317253594081284811174502841027019385211055596446");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("229489549303819644288109756659334461284756482337");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("867831652712019091456485669234603486104543266482");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("133936072602491412737245870066063155881748815209");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("209628292540917153643678925903600113305305488204");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("665213841469519415116094330572703657595919530921");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("861173819326117931051185480744623799627495673518");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("857527248912279381830119491298336733624");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx((byte)50);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("PI  =");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("...");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("PIX =");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx((short)1000);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx((byte)1);
 private static final java.lang.String $0="RContinuedFractions03.nrx";
 
 /* properties constant */
 
 protected static final netrexx.lang.Rexx pi=(((((((((netrexx.lang.Rexx.toRexx("3.1415926535897932384626433832795028841971").OpCc(null,$01)).OpCc(null,$02)).OpCc(null,$03)).OpCc(null,$04)).OpCc(null,$05)).OpCc(null,$06)).OpCc(null,$07)).OpCc(null,$08)).OpCc(null,$09)).OpCc(null,$010);
 
 
 
 
 
 
 
 
 
 
 
 /* properties private static */
 //    al = '  7  15   1 292   1   1   1   2   1   3   1  14   2   1   1   2   2   2   2   1' - --  20
 //         ' 84   2   1   1  15   3  13   1   4   2   6   6  99   1   2   2   6   3   5   1' - --  40
 //         '  1   6   8   1   7   1   2   3   7   1   2   1   1  12   1   1   1   3   1   1' - --  60
 //         '  8   1   1   2   1   6   1   1   5   2   2   3   1   2   4   4  16   1 161  45' - --  80
 //         '  1  22   1   2   2   1   4   1   2  24   1   2   1   3   1   2   1   1  10   2' - -- 100
 //         '  5   4   1   2   2   8   1   5   2   2  26   1   4   1   1   8   2  42   2   1' - -- 120
 //         '  7   3   3   1   1   7   2   4   9   7   2   3   1  57   1  18   1   9  19   1' - -- 140
 //         '  2  18   1   3   7  30   1   1   1   3   3   3   1   2   8   1   1   2   1  15' - -- 160
 //         '  1   2  13   1   2   1   4   1  12   1   1   3   3  28   1  10   3   2  20   1' - -- 180
 //         '  1   1   1   4   1   1   1   5   3   2   1   6   1   4'                           -- 193
 
 private static netrexx.lang.Rexx ax[]=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)15),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((short)292),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)14),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)84),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)15),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)13),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)99),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)12),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)16),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((short)161),new netrexx.lang.Rexx((byte)45),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)22),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)26),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)42),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)57),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)18),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)19),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)18),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)30),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)15),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)13),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)12),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)28),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)4)};
 //   0
 //  20
 //  40
 //  60
 //  80
 // 100
 // 120
 // 140
 // 160
 // 180
 // 194
 
 private static netrexx.lang.Rexx A;
 private static netrexx.lang.Rexx B;

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx pix;
  netrexx.lang.Rexx e=null;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  //    Loop i = 1 By 1 while al <> ''
  //      Parse al axi al
  //      ax[i] = axi
  //      End i
  pix=Calc(new netrexx.lang.Rexx(ax.length).OpSub($1,$011));
  
  {netrexx.lang.Rexx $2=pi.length();e=new netrexx.lang.Rexx((byte)1);e:for(;e.OpLtEq($1,$2);e=e.OpAdd($1,new netrexx.lang.Rexx(1))){
   if ((pix.substr(e,new netrexx.lang.Rexx((byte)1))).OpNotEq($1,pi.substr(e,new netrexx.lang.Rexx((byte)1)))) 
    break e;
   }
  }/*e*/
  
  $1.setDigits($012);
  netrexx.lang.RexxIO.Say(($014.OpCcblank($1,(pi.OpAdd($1,$013)))).OpCc($1,$015));
  netrexx.lang.RexxIO.Say(($016.OpCcblank($1,(pix.OpAdd($1,$013)))).OpCc($1,$015));
  netrexx.lang.RexxIO.Say(((e.OpSub($1,$011))).OpCcblank($1,netrexx.lang.Rexx.toRexx("correct digits")));
  return;
  }

 
 private static void Get_Coeffs(netrexx.lang.Rexx n){
  A=ax[n.toint()];
  B=new netrexx.lang.Rexx((byte)1);
  return;
  }

 
 private static netrexx.lang.Rexx Calc(netrexx.lang.Rexx n){
  netrexx.lang.Rexx Temp;
  netrexx.lang.Rexx ni=null;
  netrexx.lang.RexxSet $3=new netrexx.lang.RexxSet();
  $3.setDigits($017);
  Temp=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $4=$011.OpMinus($3);boolean $5=$4.OpGtEq($3,$013);ni=n.OpPlus($3);ni:for(;$5?ni.OpLtEq($3,$018):ni.OpGtEq($3,$018);ni=ni.OpAdd($3,$4)){
   Get_Coeffs(ni);
   Temp=B.OpDiv($3,(A.OpAdd($3,Temp)));
   }
  }/*ni*/
  Get_Coeffs(new netrexx.lang.Rexx((byte)0));
  return (A.OpAdd($3,Temp));
  }
 
 private RContinuedFractions03(){return;}
 }
