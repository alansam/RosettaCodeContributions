/* Generated from 'RTempConversion.nrx' 12 Aug 2013 23:01:06 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RTempConversion{
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
 private static final netrexx.lang.Rexx $033=netrexx.lang.Rexx.toRexx("C ");
 private static final netrexx.lang.Rexx $034=netrexx.lang.Rexx.toRexx("F ");
 private static final netrexx.lang.Rexx $035=netrexx.lang.Rexx.toRexx("K ");
 private static final netrexx.lang.Rexx $036=netrexx.lang.Rexx.toRexx("R ");
 private static final netrexx.lang.Rexx $037=netrexx.lang.Rexx.toRexx("De");
 private static final netrexx.lang.Rexx $038=netrexx.lang.Rexx.toRexx("N ");
 private static final netrexx.lang.Rexx $039=netrexx.lang.Rexx.toRexx("R\u00E9");
 private static final netrexx.lang.Rexx $040=netrexx.lang.Rexx.toRexx("R\u00F8");
 private static final java.lang.String $0="RTempConversion.nrx";
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
 // Kelvin
 
 public static netrexx.lang.Rexx K2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx K2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*T - 273.15*/
  }

 
 public static netrexx.lang.Rexx K2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T * 9 / 5 - 459.67*/
  }

 
 public static netrexx.lang.Rexx K2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*T * 9 / 5*/
  }

 
 public static netrexx.lang.Rexx K2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(373.15 - T) * 3 / 2*/
  }

 
 public static netrexx.lang.Rexx K2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*(T - 273.15) * 33 / 100*/
  }

 
 public static netrexx.lang.Rexx K2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*(T - 273.15) * 4 / 5*/
  }

 
 public static netrexx.lang.Rexx K2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("KELVIN"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*(T - 273.15) * 21 / 40 + 7.5*/
  }

 // Celsius
 
 public static netrexx.lang.Rexx C2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx C2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*T + 273.15*/
  }

 
 public static netrexx.lang.Rexx C2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T * 9 / 5 + 32*/
  }

 
 public static netrexx.lang.Rexx C2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*(T + 273.15) * 9 / 5*/
  }

 
 public static netrexx.lang.Rexx C2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(100 - T) * 3 / 2*/
  }

 
 public static netrexx.lang.Rexx C2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*T * 33 / 100*/
  }

 
 public static netrexx.lang.Rexx C2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*T * 4 / 5*/
  }

 
 public static netrexx.lang.Rexx C2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("CELSIUS"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*T * 21 / 40 + 7.5*/
  }

 // Fahrenheit
 
 public static netrexx.lang.Rexx F2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx F2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*(T + 459.67) * 5 / 9*/
  }

 
 public static netrexx.lang.Rexx F2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*(T - 32) * 5 / 9*/
  }

 
 public static netrexx.lang.Rexx F2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*T + 459.67*/
  }

 
 public static netrexx.lang.Rexx F2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(212 - T) * 5 / 6*/
  }

 
 public static netrexx.lang.Rexx F2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*(T - 32) * 11 / 60*/
  }

 
 public static netrexx.lang.Rexx F2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*(T - 32) * 4 / 9*/
  }

 
 public static netrexx.lang.Rexx F2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("FAHRENHEIT"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*(T - 32) * 7 / 24 + 7.5*/
  }

 // Rankine
 
 public static netrexx.lang.Rexx R2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx R2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*T * 5 / 9*/
  }

 
 public static netrexx.lang.Rexx R2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*(T - 491.67) * 5 / 9*/
  }

 
 public static netrexx.lang.Rexx R2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T - 459.67*/
  }

 
 public static netrexx.lang.Rexx R2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(671.67 - T) * 5 / 6*/
  }

 
 public static netrexx.lang.Rexx R2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*(T - 491.67) * 11 / 60*/
  }

 
 public static netrexx.lang.Rexx R2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*(T - 491.67) * 4 / 9*/
  }

 
 public static netrexx.lang.Rexx R2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("RANKINE"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*(T - 491.67) * 7 / 24 + 7.5*/
  }

 // Delisle
 
 public static netrexx.lang.Rexx De2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx De2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*373.15 - T * 2 / 3*/
  }

 
 public static netrexx.lang.Rexx De2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*100 - T * 2 / 3*/
  }

 
 public static netrexx.lang.Rexx De2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*212 - T * 6 / 5*/
  }

 
 public static netrexx.lang.Rexx De2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*671.67 - T * 6 / 5*/
  }

 
 public static netrexx.lang.Rexx De2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*33 - T * 11 / 50*/
  }

 
 public static netrexx.lang.Rexx De2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*80 - T * 8 / 15*/
  }

 
 public static netrexx.lang.Rexx De2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("DELISLE"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*60 - T * 7 / 20*/
  }

 // Newton
 
 public static netrexx.lang.Rexx N2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx N2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*T * 100 / 33 + 273.15*/
  }

 
 public static netrexx.lang.Rexx N2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*T * 100 / 33*/
  }

 
 public static netrexx.lang.Rexx N2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T * 60 / 11 + 32*/
  }

 
 public static netrexx.lang.Rexx N2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*T * 60 / 11 + 491.67*/
  }

 
 public static netrexx.lang.Rexx N2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(33 - T) * 50 / 11*/
  }

 
 public static netrexx.lang.Rexx N2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*T * 80 / 33*/
  }

 
 public static netrexx.lang.Rexx N2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("NEWTON"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*T * 35 / 22 + 7.5*/
  }

 // Réaumur
 
 public static netrexx.lang.Rexx Re2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx Re2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*T * 5 / 4 + 273.15*/
  }

 
 public static netrexx.lang.Rexx Re2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*T * 5 / 4*/
  }

 
 public static netrexx.lang.Rexx Re2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*T * 9 / 4 + 32*/
  }

 
 public static netrexx.lang.Rexx Re2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*T * 9 / 4 + 491.67*/
  }

 
 public static netrexx.lang.Rexx Re2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(80 - T) * 15 / 8*/
  }

 
 public static netrexx.lang.Rexx Re2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*T * 33 / 80*/
  }

 
 public static netrexx.lang.Rexx Re2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("REAUMUR"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*T * 21 / 32 + 7.5*/
  }

 // Rømer
 
 public static netrexx.lang.Rexx Ro2Ro(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("ROEMER"),T);/*T*/
  }

 
 public static netrexx.lang.Rexx Ro2K(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("KELVIN"),T);/*(T - 7.5) * 40 / 21 + 273.15*/
  }

 
 public static netrexx.lang.Rexx Ro2C(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("CELSIUS"),T);/*(T - 7.5) * 40 / 21*/
  }

 
 public static netrexx.lang.Rexx Ro2F(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("FAHRENHEIT"),T);/*(T - 7.5) * 24 / 7 + 32*/
  }

 
 public static netrexx.lang.Rexx Ro2R(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("RANKINE"),T);/*(T - 7.5) * 24 / 7 + 491.67*/
  }

 
 public static netrexx.lang.Rexx Ro2De(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("DELISLE"),T);/*(60 - T) * 20 / 7*/
  }

 
 public static netrexx.lang.Rexx Ro2N(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("NEWTON"),T);/*(T - 7.5) * 22 / 35*/
  }

 
 public static netrexx.lang.Rexx Ro2Re(netrexx.lang.Rexx T){
  return temperatureConversion(netrexx.lang.Rexx.toRexx("ROEMER"),netrexx.lang.Rexx.toRexx("REAUMUR"),T);/*(T - 7.5) * 32 / 21*/
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx tlist[];
  netrexx.lang.Rexx temp=null;
  netrexx.lang.Rexx ttC=null;
  netrexx.lang.Rexx ttF=null;
  netrexx.lang.Rexx ttK=null;
  netrexx.lang.Rexx ttR=null;
  netrexx.lang.Rexx ttDe=null;
  netrexx.lang.Rexx ttN=null;
  netrexx.lang.Rexx ttRe=null;
  netrexx.lang.Rexx ttRo=null;
  java.lang.IllegalArgumentException ex1=null;
  
  tlist=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx(" 5500.00  9932.00  5773.15 10391.67 -8100.00  1815.00  4400.00  2895.00"),netrexx.lang.Rexx.toRexx("  300.00   572.00   573.15  1031.67  -300.00    99.00   240.00   165.00"),netrexx.lang.Rexx.toRexx("  200.00   392.00   473.15   851.67  -150.00    66.00   160.00   112.50"),netrexx.lang.Rexx.toRexx("  100.00   212.00   373.15   671.67     0.00    33.00    80.00    60.00"),netrexx.lang.Rexx.toRexx("   37.00    98.60   310.15   558.27    94.50    12.21    29.60    26.93"),netrexx.lang.Rexx.toRexx("    0.00    32.00   273.15   491.67   150.00     0.00     0.00     7.50"),netrexx.lang.Rexx.toRexx(" -100.00  -148.00   173.15   311.67   300.00   -33.00   -80.00   -45.00"),netrexx.lang.Rexx.toRexx(" -200.00  -328.00    73.15   131.67   450.00   -66.00  -160.00   -97.50"),netrexx.lang.Rexx.toRexx(" -252.15  -421.87    21.00    37.80   528.23   -83.21  -201.72  -124.88"),netrexx.lang.Rexx.toRexx(" -273.15  -459.67     0.00     0.00   559.73   -90.14  -218.52  -135.90")};
  /* C....... F....... K....... R....... De...... N....... Ré...... Rø......*/
  
  
  
  
  
  
  
  
  
  
  
  
  {int $5=0;netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[tlist.length];synchronized(tlist){for(;;){if($5==$4.length)break;$4[$5]=tlist[tlist.length-1-$5];$5++;}}temp:for(;;){if(--$5<0)break;temp=(netrexx.lang.Rexx)$4[$5];
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[9];
   netrexx.lang.RexxParse.parse(temp,$02,$6);
   ttC=$6[0];ttF=$6[1];ttK=$6[2];ttR=$6[3];ttDe=$6[4];ttN=$6[5];ttRe=$6[6];ttRo=$6[7];}
   netrexx.lang.RexxIO.Say("   C....... F....... K....... R....... De...... N....... R\u00E9...... R\u00F8......");
   netrexx.lang.RexxIO.Say(((((((($033.OpCcblank($1,C2C(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2F(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2K(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2R(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2De(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2N(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2Re(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,C2Ro(ttC).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($034.OpCcblank($1,F2C(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2F(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2K(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2R(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2De(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2N(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2Re(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,F2Ro(ttF).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($035.OpCcblank($1,K2C(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2F(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2K(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2R(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2De(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2N(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2Re(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,K2Ro(ttK).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($036.OpCcblank($1,R2C(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2F(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2K(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2R(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2De(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2N(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2Re(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,R2Ro(ttR).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($037.OpCcblank($1,De2C(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2F(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2K(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2R(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2De(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2N(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2Re(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,De2Ro(ttDe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($038.OpCcblank($1,N2C(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2F(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2K(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2R(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2De(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2N(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2Re(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,N2Ro(ttN).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($039.OpCcblank($1,Re2C(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2F(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2K(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2R(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2De(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2N(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2Re(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Re2Ro(ttRe).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say(((((((($040.OpCcblank($1,Ro2C(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2F(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2K(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2R(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2De(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2N(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2Re(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCcblank($1,Ro2Ro(ttRo).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2))));
   
   
   
   
   
   
   
   
   netrexx.lang.RexxIO.Say("");
   }
  }/*temp*/
  
  {try{
   netrexx.lang.RexxIO.Say(temperatureConversion(netrexx.lang.Rexx.toRexx("Klatch"),netrexx.lang.Rexx.toRexx("celcius"),new netrexx.lang.Rexx((byte)100)));
  }
  catch (java.lang.IllegalArgumentException $7){ex1=$7;
   ex1.printStackTrace();
  }}
  {try{
   netrexx.lang.RexxIO.Say(temperatureConversion(netrexx.lang.Rexx.toRexx("fahrenheit"),netrexx.lang.Rexx.toRexx("Klatch"),new netrexx.lang.Rexx((byte)100)));
  }
  catch (java.lang.IllegalArgumentException $8){ex1=$8;
   ex1.printStackTrace();
  }}
  return;
  }
 
 private RTempConversion(){return;}
 }
