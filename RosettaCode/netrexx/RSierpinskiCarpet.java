/* Generated from 'RSierpinskiCarpet.nrx' 26 Jun 2013 20:36:14 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RSierpinskiCarpet{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final char[] $07={1,10,1,0,0};
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('\000');
 private static final java.lang.String $0="RSierpinskiCarpet.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ordr=null;
  netrexx.lang.Rexx fchar=null;
  netrexx.lang.Rexx FULL_BLOCK;
  netrexx.lang.Rexx LOWER_HALF_BLOCK;
  netrexx.lang.Rexx UPPER_HALF_BLOCK;
  netrexx.lang.Rexx LIGHT_SHADE;
  netrexx.lang.Rexx MEDIUM_SHADE;
  netrexx.lang.Rexx DARK_SHADE;
  netrexx.lang.Rexx uBlocks[];
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx cn=null;
  netrexx.lang.Rexx filler=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  ordr=$2[0];fchar=$2[1];}
  if (ordr.OpEq($1,$03)|ordr.OpEq($1,$04)) 
   ordr=new netrexx.lang.Rexx((byte)3);
  // Some unicode block characters
  FULL_BLOCK=new netrexx.lang.Rexx('\u2588');
  LOWER_HALF_BLOCK=new netrexx.lang.Rexx('\u2584');
  UPPER_HALF_BLOCK=new netrexx.lang.Rexx('\u2580');
  LIGHT_SHADE=new netrexx.lang.Rexx('\u2591');
  MEDIUM_SHADE=new netrexx.lang.Rexx('\u2592');
  DARK_SHADE=new netrexx.lang.Rexx('\u2593');
  uBlocks=new netrexx.lang.Rexx[]{DARK_SHADE,MEDIUM_SHADE,LIGHT_SHADE,FULL_BLOCK,LOWER_HALF_BLOCK,UPPER_HALF_BLOCK,new netrexx.lang.Rexx('#'),new netrexx.lang.Rexx('*'),new netrexx.lang.Rexx('.'),new netrexx.lang.Rexx('X'),new netrexx.lang.Rexx('@')};
  
  
  
  if (fchar.OpEq($1,$03)|fchar.OpEq($1,$04)) 
   {
    {$5:for(;;){
     {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(uBlocks.length).OpSub($1,$05);n=new netrexx.lang.Rexx((byte)0);n:for(;n.OpLtEq($1,$3);n=n.OpAdd($1,new netrexx.lang.Rexx(1))){
      netrexx.lang.RexxIO.Say((((n.OpAdd($1,$05)).right(new netrexx.lang.Rexx((byte)3))).OpCc($1,$06)).OpCcblank($1,uBlocks[n.toint()]));
      }
     }/*n*/
     netrexx.lang.RexxIO.Say("Choose the index of the character you wish for the display from the above list [1]: \000");
     {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[1];
     netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$07,$4);
     cn=$4[0];}
     {/*select*/
     if (cn.OpEq($1,$03))
      {
       filler=uBlocks[0];
       break $5;
      }
     else if ((cn.datatype(new netrexx.lang.Rexx('w'))).OpNot($1))
      continue $5;
     else if (cn.OpLt($1,$05)|cn.OpGt($1,new netrexx.lang.Rexx(uBlocks.length)))
      continue $5;
     else{
      {
       filler=uBlocks[cn.OpSub($1,$05).toint()];
       break $5;
      }
     }
     }
     }
    }
   }
  else 
   {
    filler=fchar;
   }
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
  
  
  powr=$08.OpPow($1,ordr);
  {long $6=powr.OpSub($1,$05).tolong();x=0;x:for(;x<=$6;x=x+1){
   {long $7=powr.OpSub($1,$05).tolong();y=0;y:for(;y<=$7;y=y+1){
    if (isSierpinskiCarpetCellFilled(x,y)) 
     cell=filler;
    else 
     cell=new netrexx.lang.Rexx(' ');
    netrexx.lang.RexxIO.Say(cell.OpCc($1,$09));
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
 
 private RSierpinskiCarpet(){return;}
 }
