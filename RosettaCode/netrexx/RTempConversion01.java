/* Generated from 'RTempConversion01.nrx' 12 Aug 2013 23:01:13 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RTempConversion01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final char[] $02={1,10,9,0,1,2,3,4,5,6,7,8,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("273.15");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx("459.67");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("373.15");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(33);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(21);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(40);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx("7.5");
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(32);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx(212);
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $020=new netrexx.lang.Rexx(11);
 private static final netrexx.lang.Rexx $021=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $022=new netrexx.lang.Rexx(7);
 private static final netrexx.lang.Rexx $023=new netrexx.lang.Rexx(24);
 private static final netrexx.lang.Rexx $024=new netrexx.lang.Rexx("491.67");
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx("671.67");
 private static final netrexx.lang.Rexx $026=new netrexx.lang.Rexx(50);
 private static final netrexx.lang.Rexx $027=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $028=new netrexx.lang.Rexx(15);
 private static final netrexx.lang.Rexx $029=new netrexx.lang.Rexx(80);
 private static final netrexx.lang.Rexx $030=new netrexx.lang.Rexx(20);
 private static final netrexx.lang.Rexx $031=new netrexx.lang.Rexx(35);
 private static final netrexx.lang.Rexx $032=new netrexx.lang.Rexx(22);
 private static final char[] $033={1,10,5,0,1,2,3,4,0};
 private static final netrexx.lang.Rexx $034=netrexx.lang.Rexx.toRexx("C ");
 private static final netrexx.lang.Rexx $035=netrexx.lang.Rexx.toRexx("F ");
 private static final netrexx.lang.Rexx $036=netrexx.lang.Rexx.toRexx("K ");
 private static final netrexx.lang.Rexx $037=netrexx.lang.Rexx.toRexx("R ");
 private static final java.lang.String $0="RTempConversion01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /*
   +  Kelvin               Celsius        Fahrenheit      Rankine             Delisle        Newton            Réaumur        Rømer
   K  T                    T-273.15       T*9/5-459.67    T*9/5               (373.15-T)*3/2 (T-273.15)*33/100 (T-273.15)*4/5 (T-273.15)*21/40+7.5
   C  T+273.15             T              T*9/5+32        (T+273.15)*9/5      (100-T)*3/2    T*33/100          T*4/5          T*21/40+7.5
   F  (T+459.67)*5/9       (T-32)*5/9     T               T+459.67            (212-T)*5/6    (T-32)*11/60      (T-32)*4/9     (T-32)*7/24+7.5
   R  T*5/9                (T-491.67)*5/9 T-459.67        T                   (671.67-T)*5/6 (T-491.67)*11/60  (T-491.67)*4/9 (T-491.67)*7/24+7.5
   De 373.15-T*2/3         100-T*2/3      212-T*6/5       671.67-T*6/5        T              33-T*11/50        80-T*8/15      60-T*7/20
   N  T*100/33+273.15      T*100/33       T*60/11+32      T*60/11+491.67      (33-T)*50/11   T                 T*80/33        T*35/22+7.5
   Ré T*5/4+273.15         T*5/4          T*9/4+32        T*9/4+491.67        (80-T)*15/8    T*33/80           T              T*21/32+7.5
   Rø (T-7.5)*40/21+273.15 (T-7.5)*40/21  (T-7.5)*24/7+32 (T-7.5)*24/7+491.67 (60-T)*20/7    (T-7.5)*22/35     (T-7.5)*32/21  T
  */
 
 public static netrexx.lang.Rexx temperatureConversion(netrexx.lang.Rexx scaleFrom,netrexx.lang.Rexx scaleTo,netrexx.lang.Rexx T){
  netrexx.lang.Rexx KELVIN=null;
  netrexx.lang.Rexx CELSIUS=null;
  netrexx.lang.Rexx FAHRENHEIT=null;
  netrexx.lang.Rexx RANKINE=null;
  netrexx.lang.Rexx DELISLE=null;
  netrexx.lang.Rexx NEWTON=null;
  netrexx.lang.Rexx REAUMUR=null;
  netrexx.lang.Rexx ROEMER=null;
  netrexx.lang.Rexx val=null;
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[9];
  netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("KELVIN CELSIUS FAHRENHEIT RANKINE DELISLE NEWTON REAUMUR ROEMER"),$02,$2);
  KELVIN=$2[0];CELSIUS=$2[1];FAHRENHEIT=$2[2];RANKINE=$2[3];DELISLE=$2[4];NEWTON=$2[5];REAUMUR=$2[6];ROEMER=$2[7];}
  
  scaleFrom=scaleFrom.upper();
  scaleTo=scaleTo.upper();
  {sF:do{/*select*/
  if (scaleFrom.OpEqS($1,KELVIN))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=T;
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=T.OpSub($1,$03);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T.OpMult($1,$04).OpDiv($1,$05).OpSub($1,$06);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=T.OpMult($1,$04).OpDiv($1,$05);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($07.OpSub($1,T))).OpMult($1,$08).OpDiv($1,$09);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=((T.OpSub($1,$03))).OpMult($1,$010).OpDiv($1,$011);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=((T.OpSub($1,$03))).OpMult($1,$012).OpDiv($1,$05);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=((T.OpSub($1,$03))).OpMult($1,$013).OpDiv($1,$014).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,CELSIUS))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=T.OpAdd($1,$03);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=T;
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T.OpMult($1,$04).OpDiv($1,$05).OpAdd($1,$017);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=((T.OpAdd($1,$03))).OpMult($1,$04).OpDiv($1,$05);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($011.OpSub($1,T))).OpMult($1,$08).OpDiv($1,$09);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=T.OpMult($1,$010).OpDiv($1,$011);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=T.OpMult($1,$012).OpDiv($1,$05);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=T.OpMult($1,$013).OpDiv($1,$014).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,FAHRENHEIT))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=((T.OpAdd($1,$06))).OpMult($1,$05).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=((T.OpSub($1,$017))).OpMult($1,$05).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T;
    else if (scaleTo.OpEqS($1,RANKINE))
     val=T.OpAdd($1,$06);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($018.OpSub($1,T))).OpMult($1,$05).OpDiv($1,$019);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=((T.OpSub($1,$017))).OpMult($1,$020).OpDiv($1,$021);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=((T.OpSub($1,$017))).OpMult($1,$012).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=((T.OpSub($1,$017))).OpMult($1,$022).OpDiv($1,$023).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,RANKINE))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=T.OpMult($1,$05).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=((T.OpSub($1,$024))).OpMult($1,$05).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T.OpSub($1,$06);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=T;
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($025.OpSub($1,T))).OpMult($1,$05).OpDiv($1,$019);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=((T.OpSub($1,$024))).OpMult($1,$020).OpDiv($1,$021);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=((T.OpSub($1,$024))).OpMult($1,$012).OpDiv($1,$04);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=((T.OpSub($1,$024))).OpMult($1,$022).OpDiv($1,$023).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,DELISLE))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=$07.OpSub($1,T.OpMult($1,$09).OpDiv($1,$08));
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=$011.OpSub($1,T.OpMult($1,$09).OpDiv($1,$08));
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=$018.OpSub($1,T.OpMult($1,$019).OpDiv($1,$05));
    else if (scaleTo.OpEqS($1,RANKINE))
     val=$025.OpSub($1,T.OpMult($1,$019).OpDiv($1,$05));
    else if (scaleTo.OpEqS($1,DELISLE))
     val=T;
    else if (scaleTo.OpEqS($1,NEWTON))
     val=$010.OpSub($1,T.OpMult($1,$020).OpDiv($1,$026));
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=$029.OpSub($1,T.OpMult($1,$027).OpDiv($1,$028));
    else if (scaleTo.OpEqS($1,ROEMER))
     val=$021.OpSub($1,T.OpMult($1,$022).OpDiv($1,$030));
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,NEWTON))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=T.OpMult($1,$011).OpDiv($1,$010).OpAdd($1,$03);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=T.OpMult($1,$011).OpDiv($1,$010);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T.OpMult($1,$021).OpDiv($1,$020).OpAdd($1,$017);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=T.OpMult($1,$021).OpDiv($1,$020).OpAdd($1,$024);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($010.OpSub($1,T))).OpMult($1,$026).OpDiv($1,$020);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=T;
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=T.OpMult($1,$029).OpDiv($1,$010);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=T.OpMult($1,$031).OpDiv($1,$032).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,REAUMUR))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=T.OpMult($1,$05).OpDiv($1,$012).OpAdd($1,$03);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=T.OpMult($1,$05).OpDiv($1,$012);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=T.OpMult($1,$04).OpDiv($1,$012).OpAdd($1,$017);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=T.OpMult($1,$04).OpDiv($1,$012).OpAdd($1,$024);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($029.OpSub($1,T))).OpMult($1,$028).OpDiv($1,$027);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=T.OpMult($1,$010).OpDiv($1,$029);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=T;
    else if (scaleTo.OpEqS($1,ROEMER))
     val=T.OpMult($1,$013).OpDiv($1,$017).OpAdd($1,$015);
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else if (scaleFrom.OpEqS($1,ROEMER))
   {
    {/*select*/
    if (scaleTo.OpEqS($1,KELVIN))
     val=((T.OpSub($1,$015))).OpMult($1,$014).OpDiv($1,$013).OpAdd($1,$03);
    else if (scaleTo.OpEqS($1,CELSIUS))
     val=((T.OpSub($1,$015))).OpMult($1,$014).OpDiv($1,$013);
    else if (scaleTo.OpEqS($1,FAHRENHEIT))
     val=((T.OpSub($1,$015))).OpMult($1,$023).OpDiv($1,$022).OpAdd($1,$017);
    else if (scaleTo.OpEqS($1,RANKINE))
     val=((T.OpSub($1,$015))).OpMult($1,$023).OpDiv($1,$022).OpAdd($1,$024);
    else if (scaleTo.OpEqS($1,DELISLE))
     val=(($021.OpSub($1,T))).OpMult($1,$030).OpDiv($1,$022);
    else if (scaleTo.OpEqS($1,NEWTON))
     val=((T.OpSub($1,$015))).OpMult($1,$032).OpDiv($1,$031);
    else if (scaleTo.OpEqS($1,REAUMUR))
     val=((T.OpSub($1,$015))).OpMult($1,$017).OpDiv($1,$013);
    else if (scaleTo.OpEqS($1,ROEMER))
     val=T;
    else{
     throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
    }
    }
   }
  else{
   throw new java.lang.IllegalArgumentException(netrexx.lang.Rexx.toString((((scaleFrom.OpCc($1,$016)).OpCcblank($1,scaleTo)).OpCc($1,$016)).OpCcblank($1,T)));
  }
  }while(false);}/*sF*/
  
  return val;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tlist[];
  netrexx.lang.Rexx CELSIUS=null;
  netrexx.lang.Rexx FAHRENHEIT=null;
  netrexx.lang.Rexx KELVIN=null;
  netrexx.lang.Rexx RANKINE=null;
  netrexx.lang.Rexx temp=null;
  netrexx.lang.Rexx ttC=null;
  netrexx.lang.Rexx ttF=null;
  netrexx.lang.Rexx ttK=null;
  netrexx.lang.Rexx ttR=null;
  
  tlist=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx(" 5500.00  9932.00  5773.15 10391.67"),netrexx.lang.Rexx.toRexx("  300.00   572.00   573.15  1031.67"),netrexx.lang.Rexx.toRexx("  200.00   392.00   473.15   851.67"),netrexx.lang.Rexx.toRexx("  100.00   212.00   373.15   671.67"),netrexx.lang.Rexx.toRexx("   37.00    98.60   310.15   558.27"),netrexx.lang.Rexx.toRexx("    0.00    32.00   273.15   491.67"),netrexx.lang.Rexx.toRexx(" -100.00  -148.00   173.15   311.67"),netrexx.lang.Rexx.toRexx(" -200.00  -328.00    73.15   131.67"),netrexx.lang.Rexx.toRexx(" -252.15  -421.87    21.00    37.80"),netrexx.lang.Rexx.toRexx(" -273.15  -459.67     0.00     0.00")};
  /* C....... F....... K....... R.......*/
  
  
  
  
  
  
  
  
  
  
  
  
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[5];
  netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("CELSIUS FAHRENHEIT KELVIN RANKINE"),$033,$3);
  CELSIUS=$3[0];FAHRENHEIT=$3[1];KELVIN=$3[2];RANKINE=$3[3];}
  {int $6=0;netrexx.lang.Rexx[] $5=new netrexx.lang.Rexx[tlist.length];synchronized(tlist){for(;;){if($6==$5.length)break;$5[$6]=tlist[tlist.length-1-$6];$6++;}}temp:for(;;){if(--$6<0)break;temp=(netrexx.lang.Rexx)$5[$6];
   {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[5];
   netrexx.lang.RexxParse.parse(temp,$033,$7);
   ttC=$7[0];ttF=$7[1];ttK=$7[2];ttR=$7[3];}
   netrexx.lang.RexxIO.Say("   C....... F....... K....... R.......");
   netrexx.lang.RexxIO.Say(((($034.OpCcblank($1,temperatureConversion(CELSIUS,CELSIUS,ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(CELSIUS,FAHRENHEIT,ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(CELSIUS,KELVIN,ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(CELSIUS,RANKINE,ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((($035.OpCcblank($1,temperatureConversion(FAHRENHEIT,CELSIUS,ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(FAHRENHEIT,FAHRENHEIT,ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(FAHRENHEIT,KELVIN,ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(FAHRENHEIT,RANKINE,ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((($036.OpCcblank($1,temperatureConversion(KELVIN,CELSIUS,ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(KELVIN,FAHRENHEIT,ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(KELVIN,KELVIN,ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(KELVIN,RANKINE,ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((($037.OpCcblank($1,temperatureConversion(RANKINE,CELSIUS,ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(RANKINE,FAHRENHEIT,ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(RANKINE,KELVIN,ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,temperatureConversion(RANKINE,RANKINE,ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   netrexx.lang.RexxIO.Say("");
   }
  }/*temp*/
  
  return;
  }
 
 private RTempConversion01(){return;}
 }
