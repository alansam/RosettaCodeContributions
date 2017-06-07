/* Generated from 'zPosTest.nrx' 23 May 2013 12:07:14 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class zPosTest{
 private static final java.lang.String[] $01={"cx","cp"};
 private static final java.lang.String $02="str1 = '1223'";
 private static final java.lang.String[] $03={"str1"};
 private static final java.lang.String $04="str2 = '12'";
 private static final java.lang.String[] $05={"str2"};
 private static final java.lang.String $06="say \"'\"str1\"'\"";
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('\'');
 private static final java.lang.String $08="say \"'\"str2\"'\"";
 private static final java.lang.String $09="loop c_ = 1 to str1.length()";
 private static final java.lang.String[] $010={"c_"};
 private static final java.lang.String $011="  cx = str1.substr(c_, 1)";
 private static final java.lang.String[] $012={"cx"};
 private static final java.lang.String $013="  cp = str2.pos(cx)";
 private static final java.lang.String[] $014={"cp"};
 private static final java.lang.String $015="  say c_ cx cp";
 private static final java.lang.String $016="  end c_";
 private static final java.lang.String $017="return";
 private static final java.lang.String $0="zPosTest.nrx";
 private static final netrexx.lang.RexxTrace $1=new netrexx.lang.RexxTrace(15,System.err,"zPosTest.nrx");
 static{$1.newlevel(3);}
 static{$1.modnames($01,null);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx str1;
  netrexx.lang.Rexx str2;
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx cx=null;
  netrexx.lang.Rexx cp=null;
  $1.traceclause(5,$02,1,$03);str1=netrexx.lang.Rexx.toRexx("1223");
  $1.traceclause(6,$04,1,$05);str2=netrexx.lang.Rexx.toRexx("12");
  $1.traceclause(7,$06);netrexx.lang.RexxIO.Say(($07.OpCc(null,str1)).OpCc(null,$07));
  $1.traceclause(8,$08);netrexx.lang.RexxIO.Say(($07.OpCc(null,str2)).OpCc(null,$07));
  {$1.traceclause(9,$09,1,$010);netrexx.lang.Rexx $2=str1.length();c_=new netrexx.lang.Rexx((byte)1);boolean $3=true;c_:for(;;){if($3){$3=false;}else{$1.traceclause(9,$09,1,$010);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1));}if(!(c_.OpLtEq(null,$2)))break;
   $1.traceclause(10,$011,1,$012);cx=($1.traceRexx(10,str1.substr(c_,new netrexx.lang.Rexx((byte)1)),'v',1,"cx"));
   $1.traceclause(11,$013,1,$014);cp=($1.traceRexx(11,str2.pos(cx),'v',1,"cp"));
   $1.traceclause(12,$015);netrexx.lang.RexxIO.Say((c_.OpCcblank(null,cx)).OpCcblank(null,cp));
   }
  $1.traceclause(13,$016);}/*c_*/
  $1.traceclause(14,$017);return;
  }
 
 private zPosTest(){return;}
 }
