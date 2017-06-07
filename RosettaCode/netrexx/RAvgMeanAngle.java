/* Generated from 'RAvgMeanAngle.nrx' 8 May 2013 18:45:38 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


//trace results


public class RAvgMeanAngle{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)80);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("is:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("  ");
 private static final java.lang.String $0="RAvgMeanAngle.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getMeanAngle(netrexx.lang.Rexx angles){
  double x_component;
  double y_component;
  int aK;
  int a_=0;
  double angle_d=0;
  double angle_r=0;
  double avg_r;
  double avg_d;
  //trace var angle_d angle_r x_component y_component x_avg y_avg avg_r avg_d
  x_component=(double)0.0D;
  y_component=(double)0.0D;
  aK=(angles.words()).toint();
  {int $2=aK;a_=1;a_:for(;a_<=$2;a_++){
   angle_d=(angles.word(new netrexx.lang.Rexx(a_))).todouble();
   angle_r=java.lang.Math.toRadians(angle_d);
   x_component=x_component+(java.lang.Math.cos(angle_r));
   y_component=y_component+(java.lang.Math.sin(angle_r));
   }
  }/*a_*/
  x_component=x_component/((double)aK);
  y_component=y_component/((double)aK);
  avg_r=java.lang.Math.atan2(y_component,x_component);
  avg_d=java.lang.Math.toDegrees(avg_r);
  return new netrexx.lang.Rexx(avg_d);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx angleSet[];
  netrexx.lang.Rexx angles=null;
  angleSet=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("350 10"),netrexx.lang.Rexx.toRexx("90 180 270 360"),netrexx.lang.Rexx.toRexx("10 20 30"),netrexx.lang.Rexx.toRexx("370"),netrexx.lang.Rexx.toRexx("180")};
  {int $5=0;netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[angleSet.length];synchronized(angleSet){for(;;){if($5==$4.length)break;$4[$5]=angleSet[angleSet.length-1-$5];$5++;}}angles:for(;;){if(--$5<0)break;angles=(netrexx.lang.Rexx)$4[$5];
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("The mean angle of").OpCcblank($1,angles.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCcblank($1,$02));
   netrexx.lang.RexxIO.Say($03.OpCc($1,getMeanAngle(angles).format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)6))));
   netrexx.lang.RexxIO.Say("");
   }
  }/*angles*/
  return;
  }
 
 private RAvgMeanAngle(){return;}
 }
