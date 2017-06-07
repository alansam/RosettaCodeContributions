/* Generated from 'RSierpinskiTriangle02.nrx' 25 Jun 2013 14:23:39 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RSierpinskiTriangle02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(' ');
 private static final java.lang.String $0="RSierpinskiTriangle02.nrx";
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
  netrexx.lang.Rexx BLACK_UPPOINTING_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_SMALL_TRIANGLE;
  netrexx.lang.Rexx BLACK_UPPOINTING_SMALL_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_TRIANGLE_WITH_DOT;
  netrexx.lang.Rexx UPPOINTING_TRIANGLE_LEFT_BLACK;
  netrexx.lang.Rexx UPPOINTING_TRIANGLE_RIGHT_BLACK;
  netrexx.lang.Rexx uBlocks[];
  netrexx.lang.Rexx filler;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  ordr=$2[0];}
  if (ordr.OpEq($1,$03)) 
   ordr=new netrexx.lang.Rexx((byte)4);
  // Some unicode block characters
  // https://en.wikipedia.org/wiki/Geometric_Shapes
  BLACK_UPPOINTING_TRIANGLE=new netrexx.lang.Rexx('\u25b2');
  WHITE_UPPOINTING_TRIANGLE=new netrexx.lang.Rexx('\u25b3');
  WHITE_UPPOINTING_SMALL_TRIANGLE=new netrexx.lang.Rexx('\u25b4');
  BLACK_UPPOINTING_SMALL_TRIANGLE=new netrexx.lang.Rexx('\u25b5');
  WHITE_UPPOINTING_TRIANGLE_WITH_DOT=new netrexx.lang.Rexx('\u25ec');
  UPPOINTING_TRIANGLE_LEFT_BLACK=new netrexx.lang.Rexx('\u25ed');
  UPPOINTING_TRIANGLE_RIGHT_BLACK=new netrexx.lang.Rexx('\u25ee');
  uBlocks=new netrexx.lang.Rexx[]{BLACK_UPPOINTING_TRIANGLE,WHITE_UPPOINTING_TRIANGLE,WHITE_UPPOINTING_SMALL_TRIANGLE,BLACK_UPPOINTING_SMALL_TRIANGLE,WHITE_UPPOINTING_TRIANGLE_WITH_DOT,UPPOINTING_TRIANGLE_LEFT_BLACK,UPPOINTING_TRIANGLE_RIGHT_BLACK,new netrexx.lang.Rexx('A')};
  
  
  
  
  // prevent compiler warning
  filler=uBlocks[0]; // choose a pretty one
  drawSierpinskiTriangle(ordr,filler);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void drawSierpinskiTriangle(netrexx.lang.Rexx ordr){
  drawSierpinskiTriangle(ordr,new netrexx.lang.Rexx('A'));return;
  }
 public static void drawSierpinskiTriangle(netrexx.lang.Rexx ordr,netrexx.lang.Rexx filler){
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx p=null;
  netrexx.lang.Rexx z=null;
  netrexx.lang.Rexx k=null;
  {int $3=ordr.OpMult($1,$04).OpPlus($1).toint();j=new netrexx.lang.Rexx((byte)0);j:for(;$3>0;$3--,j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   p=new netrexx.lang.Rexx((byte)1);
   z=$03.left(ordr.OpMult($1,$04).OpSub($1,$05).OpSub($1,j));/*indent the line. */
   {netrexx.lang.Rexx $4=j;k=new netrexx.lang.Rexx((byte)0);k:for(;k.OpLtEq($1,$4);k=k.OpAdd($1,new netrexx.lang.Rexx(1))){/*build the line with  J+1  parts*/
    if (p.OpRem($1,$06).OpEqS($1,$07)) 
     z=z.OpCcblank($1,$08);/*it's either a blank,  or  ...  */
    else 
     z=z.OpCcblank($1,filler);/*it's one of them thar character*/
    p=p.OpMult($1,(j.OpSub($1,k))).OpDivI($1,(k.OpAdd($1,$05)));/*calculate a handy-dandy thingy.*/
    }
   }/*k*/
   netrexx.lang.RexxIO.Say(z);/*display a line of the triangle.*/
   }
  }/*j*/
  return;
  }
 
 private RSierpinskiTriangle02(){return;}
 }
