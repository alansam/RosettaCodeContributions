/* Generated from 'RMontyHall.nrx' 23 Feb 2013 18:46:31 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RMontyHall{
 private static final java.lang.String[] $01={"switchwins","staywins","shown","choice"};
 private static final java.lang.String $02="switchWins = int 0";
 private static final java.lang.String[] $03={"switchwins"};
 private static final java.lang.String $04="stayWins   = int 0";
 private static final java.lang.String[] $05={"staywins"};
 private static final java.lang.String $06="  choice = gen.nextInt(3)   -- pick a door, any door";
 private static final java.lang.String[] $07={"choice"};
 private static final java.lang.String $08="  shown = int";
 private static final java.lang.String[] $09={"shown"};
 private static final java.lang.String $010="    shown = gen.nextInt(3)  -- don't show the winner or the choice";
 private static final java.lang.String $011="  stayWins = stayWins + doors[choice] -- if you won by staying, count it";
 private static final java.lang.String $012="  switchWins = switchWins + doors[3 - choice - shown]";
 private static final java.lang.String $0="RMontyHall.nrx";
 private static final netrexx.lang.RexxTrace $1=new netrexx.lang.RexxTrace(24,System.err,"RMontyHall.nrx");
 static{$1.modnames($01,null);}
 
 public static void main(java.lang.String $0s[]){
  int switchWins;
  int stayWins;
  java.util.Random gen;
  int doors[]=null;
  int choice=0;
  int shown=0;
  $1.traceclause(5,$02,1,$03);switchWins=($1.traceint(5,(int)(0),'v',1,"switchWins"));
  $1.traceclause(6,$04,1,$05);stayWins=($1.traceint(6,(int)(0),'v',1,"stayWins"));
  gen=new java.util.Random();
  {int $2=10;boolean $3=true;for(;;$2--){if($3){$3=false;}else{}if(!($2>0))break; //37267
   doors=new int[]{0,0,0};
   doors[gen.nextInt(3)]=1; // 0 is a goat, 1 is a car
   $1.traceclause(11,$06,1,$07);choice=($1.traceint(11,(int)(gen.nextInt(3)),'v',1,"choice")); // pick a door, any door
   $1.traceclause(12,$08,1,$09);
{boolean $4=true;for(;;){if($4){$4=false;}else{if((doors[shown]==1)|(shown==choice))break;}
    $1.traceclause(14,$010,1,$09);shown=($1.traceint(14,(int)(gen.nextInt(3)),'v',1,"shown")); // don't show the winner or the choice
    }
   }
   $1.traceclause(16,$011,1,$05);stayWins=($1.traceint(16,(int)(stayWins+doors[choice]),'v',1,"stayWins")); // if you won by staying, count it
   
   // the switched (last remaining) door is (3 - choice - shown), because 0+1+2=3
   $1.traceclause(19,$012,1,$03);switchWins=($1.traceint(19,(int)(switchWins+(doors[(3-choice)-shown])),'v',1,"switchWins"));
   }
  }
  netrexx.lang.RexxIO.Say("Switching wins"+" "+switchWins+" "+"times.");
  netrexx.lang.RexxIO.Say("Staying wins"+" "+stayWins+" "+"times.");
  return;
  }
 
 private RMontyHall(){return;}
 }
