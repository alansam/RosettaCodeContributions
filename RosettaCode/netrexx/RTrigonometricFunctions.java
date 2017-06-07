/* Generated from 'RTrigonometricFunctions.nrx' 5 Nov 2012 19:58:46 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */





public class RTrigonometricFunctions{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final char[] $02={1,10,4,0,1,2,3,0};
 private static final char[] $03={1,10,7,0,1,2,3,4,5,6,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('|');
 private static final java.lang.String $0="RTrigonometricFunctions.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx RADIANS=null;
  netrexx.lang.Rexx DEGREES=null;
  netrexx.lang.Rexx ANGLE=null;
  netrexx.lang.Rexx SINE=null;
  netrexx.lang.Rexx COSINE=null;
  netrexx.lang.Rexx TANGENT=null;
  netrexx.lang.Rexx ARCSINE=null;
  netrexx.lang.Rexx ARCCOSINE=null;
  netrexx.lang.Rexx ARCTANGENT=null;
  netrexx.lang.Rexx trigVals;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("Radians Degrees angle"),$02,$2);
  RADIANS=$2[0];DEGREES=$2[1];ANGLE=$2[2];}
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[7];
  netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("sine cosine tangent arcsine arccosine arctangent"),$03,$3);
  SINE=$3[0];COSINE=$3[1];TANGENT=$3[2];ARCSINE=$3[3];ARCCOSINE=$3[4];ARCTANGENT=$3[5];}
  
  trigVals=netrexx.lang.Rexx.toRexx("");
  trigVals.getnode(RADIANS).leaf.getnode(ANGLE).leaf=((new netrexx.lang.Rexx(java.lang.Math.PI))).OpDiv($1,$04); // Pi/4 == 45 degrees
  trigVals.getnode(DEGREES).leaf.getnode(ANGLE).leaf=new netrexx.lang.Rexx("45.0");
  trigVals.getnode(RADIANS).leaf.getnode(SINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.sin((trigVals.getnode(RADIANS).leaf.getnode(ANGLE).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(SINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.sin(java.lang.Math.toRadians((trigVals.getnode(DEGREES).leaf.getnode(ANGLE).leaf).todouble()))));
  trigVals.getnode(RADIANS).leaf.getnode(COSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.cos((trigVals.getnode(RADIANS).leaf.getnode(ANGLE).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(COSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.cos(java.lang.Math.toRadians((trigVals.getnode(DEGREES).leaf.getnode(ANGLE).leaf).todouble()))));
  trigVals.getnode(RADIANS).leaf.getnode(TANGENT).leaf=(new netrexx.lang.Rexx(java.lang.Math.tan((trigVals.getnode(RADIANS).leaf.getnode(ANGLE).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(TANGENT).leaf=(new netrexx.lang.Rexx(java.lang.Math.tan(java.lang.Math.toRadians((trigVals.getnode(DEGREES).leaf.getnode(ANGLE).leaf).todouble()))));
  trigVals.getnode(RADIANS).leaf.getnode(ARCSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.asin((trigVals.getnode(RADIANS).leaf.getnode(SINE).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(ARCSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.toDegrees(java.lang.Math.acos((trigVals.getnode(DEGREES).leaf.getnode(SINE).leaf).todouble()))));
  trigVals.getnode(RADIANS).leaf.getnode(ARCCOSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.acos((trigVals.getnode(RADIANS).leaf.getnode(COSINE).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(ARCCOSINE).leaf=(new netrexx.lang.Rexx(java.lang.Math.toDegrees(java.lang.Math.acos((trigVals.getnode(DEGREES).leaf.getnode(COSINE).leaf).todouble()))));
  trigVals.getnode(RADIANS).leaf.getnode(ARCTANGENT).leaf=(new netrexx.lang.Rexx(java.lang.Math.atan((trigVals.getnode(RADIANS).leaf.getnode(TANGENT).leaf).todouble())));
  trigVals.getnode(DEGREES).leaf.getnode(ARCTANGENT).leaf=(new netrexx.lang.Rexx(java.lang.Math.toDegrees(java.lang.Math.atan((trigVals.getnode(DEGREES).leaf.getnode(TANGENT).leaf).todouble()))));
  
  netrexx.lang.RexxIO.Say(((((new netrexx.lang.Rexx(' ').right(new netrexx.lang.Rexx((byte)12)).OpCc($1,$05)).OpCcblank($1,RADIANS.right(new netrexx.lang.Rexx((byte)17)))).OpCcblank($1,$05)).OpCcblank($1,DEGREES.right(new netrexx.lang.Rexx((byte)17)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((ANGLE.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(ANGLE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(ANGLE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((SINE.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(SINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(SINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((COSINE.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(COSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(COSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((TANGENT.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(TANGENT).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(TANGENT).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((ARCSINE.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(ARCSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(ARCSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((ARCCOSINE.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(ARCCOSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(ARCCOSINE).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say((((((ARCTANGENT.right(new netrexx.lang.Rexx((byte)12))).OpCc($1,$05)).OpCcblank($1,trigVals.getnode(RADIANS).leaf.getnode(ARCTANGENT).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05)).OpCcblank($1,trigVals.getnode(DEGREES).leaf.getnode(ARCTANGENT).leaf.format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)12)))).OpCcblank($1,$05));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RTrigonometricFunctions(){return;}
 }
