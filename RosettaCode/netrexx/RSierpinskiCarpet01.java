/* Generated from 'RSierpinskiCarpet01.nrx' 26 Jun 2013 18:07:53 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RSierpinskiCarpet01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('\000');
 private static final java.lang.String $0="RSierpinskiCarpet01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx DARK_SHADE;
  netrexx.lang.Rexx ordr=null;
  netrexx.lang.Rexx filr=null;
  netrexx.lang.Rexx filler=null;
  DARK_SHADE=new netrexx.lang.Rexx('\u2593');
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  ordr=$2[0];filr=$2[1];}
  if (ordr.OpEq($1,$03)|ordr.OpEq($1,$04)) 
   ordr=new netrexx.lang.Rexx((byte)3);
  if (filr.OpEq($1,$03)|filr.OpEq($1,$04)) 
   filler=DARK_SHADE;
  else 
   filler=filr;
  drawSierpinskiCarpet(ordr,filler);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void drawSierpinskiCarpet(netrexx.lang.Rexx ordr){
  drawSierpinskiCarpet(ordr,netrexx.lang.Rexx.toRexx("@"));return;
  }
 public static void drawSierpinskiCarpet(netrexx.lang.Rexx ordr,netrexx.lang.Rexx filler){
  long x=0;
  long y=0;
  netrexx.lang.Rexx powr;
  netrexx.lang.Rexx cell=null;
  
  
  powr=$05.OpPow($1,ordr);
  {long $3=powr.OpSub($1,$06).tolong();x=0;x:for(;x<=$3;x=x+1){
   {long $4=powr.OpSub($1,$06).tolong();y=0;y:for(;y<=$4;y=y+1){
    if (isSierpinskiCarpetCellFilled(x,y)) 
     cell=filler;
    else 
     cell=new netrexx.lang.Rexx(' ');
    netrexx.lang.RexxIO.Say(cell.OpCc($1,$07));
    }
   }/*y*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*x*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isSierpinskiCarpetCellFilled(long x,long y){
  boolean isTrue;
  boolean isFalse;
  boolean isFilled;
  isTrue=(1==1);
  isFalse=(!isTrue);
  isFilled=isTrue;
  {edge:for(;;){if(!((x!=0)&(y!=0)))break;
   if (((x%3)==1)&((y%3)==1)) 
    {
     isFilled=isFalse;
     break edge;
    }
   x=x/3;
   y=y/3;
   }
  }/*edge*/
  return isFilled;
  }
 
 private RSierpinskiCarpet01(){return;}
 }
