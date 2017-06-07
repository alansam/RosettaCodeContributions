/* Generated from 'RSierpinskiTriangle.nrx' 26 Jun 2013 18:17:06 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RSierpinskiTriangle{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(':');
 private static final char[] $07={1,10,1,0,0};
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RSierpinskiTriangle.nrx";
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
  netrexx.lang.Rexx BLACK_UPPOINTING_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_SMALL_TRIANGLE;
  netrexx.lang.Rexx BLACK_UPPOINTING_SMALL_TRIANGLE;
  netrexx.lang.Rexx WHITE_UPPOINTING_TRIANGLE_WITH_DOT;
  netrexx.lang.Rexx UPPOINTING_TRIANGLE_LEFT_BLACK;
  netrexx.lang.Rexx UPPOINTING_TRIANGLE_RIGHT_BLACK;
  netrexx.lang.Rexx uBlocks[];
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx cn=null;
  netrexx.lang.Rexx filler=null;
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  ordr=$2[0];fchar=$2[1];}
  if (ordr.OpEq($1,$03)|ordr.OpEq($1,$04)) 
   ordr=new netrexx.lang.Rexx((byte)4);
  // https://en.wikipedia.org/wiki/Geometric_Shapes
  BLACK_UPPOINTING_TRIANGLE=new netrexx.lang.Rexx('\u25b2');
  WHITE_UPPOINTING_TRIANGLE=new netrexx.lang.Rexx('\u25b3');
  WHITE_UPPOINTING_SMALL_TRIANGLE=new netrexx.lang.Rexx('\u25b4');
  BLACK_UPPOINTING_SMALL_TRIANGLE=new netrexx.lang.Rexx('\u25b5');
  WHITE_UPPOINTING_TRIANGLE_WITH_DOT=new netrexx.lang.Rexx('\u25ec');
  UPPOINTING_TRIANGLE_LEFT_BLACK=new netrexx.lang.Rexx('\u25ed');
  UPPOINTING_TRIANGLE_RIGHT_BLACK=new netrexx.lang.Rexx('\u25ee');
  uBlocks=new netrexx.lang.Rexx[]{BLACK_UPPOINTING_TRIANGLE,WHITE_UPPOINTING_TRIANGLE,WHITE_UPPOINTING_SMALL_TRIANGLE,BLACK_UPPOINTING_SMALL_TRIANGLE,WHITE_UPPOINTING_TRIANGLE_WITH_DOT,UPPOINTING_TRIANGLE_LEFT_BLACK,UPPOINTING_TRIANGLE_RIGHT_BLACK,new netrexx.lang.Rexx('A'),new netrexx.lang.Rexx('*'),new netrexx.lang.Rexx('.'),new netrexx.lang.Rexx('^')};
  
  
  
  
  
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
  drawSierpinskiTriangle(ordr,filler);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void drawSierpinskiTriangle(netrexx.lang.Rexx ordr){
  drawSierpinskiTriangle(ordr,new netrexx.lang.Rexx('^'));return;
  }
 public static void drawSierpinskiTriangle(netrexx.lang.Rexx ordr,netrexx.lang.Rexx filler){
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx line;
  netrexx.lang.Rexx row=null;
  netrexx.lang.Rexx u=null;
  netrexx.lang.Rexx col=null;
  netrexx.lang.Rexx cl=null;
  netrexx.lang.Rexx cr=null;
  netrexx.lang.Rexx t=null;
  netrexx.lang.Rexx j2=null;
  netrexx.lang.Rexx j3=null;
  n=$05.OpMult($1,($08.OpPow($1,ordr)));
  line=new netrexx.lang.Rexx(' ').copies($08.OpMult($1,n));
  line=line.overlay(filler,n.OpAdd($1,$05)); // set the top point of the triangle
  {netrexx.lang.Rexx $6=n;row=new netrexx.lang.Rexx((byte)1);row:for(;row.OpLtEq($1,$6);row=row.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(line.strip(new netrexx.lang.Rexx('t')));
   u=filler;
   {netrexx.lang.Rexx $7=n.OpAdd($1,row);col=$08.OpAdd($1,n).OpSub($1,row).OpPlus($1);col:for(;col.OpLtEq($1,$7);col=col.OpAdd($1,new netrexx.lang.Rexx(1))){
    cl=line.substr(col.OpSub($1,$05),new netrexx.lang.Rexx((byte)1));
    cr=line.substr(col.OpAdd($1,$05),new netrexx.lang.Rexx((byte)1));
    if (cl.OpEqS($1,cr)) 
     t=new netrexx.lang.Rexx(' ');
    else 
     t=filler;
    line=line.overlay(u,col.OpSub($1,$05));
    u=t;
    }
   }/*col*/
   j2=n.OpAdd($1,row).OpSub($1,$05);
   j3=n.OpAdd($1,row);
   line=line.overlay(t,j2.OpAdd($1,$05));
   line=line.overlay(filler,j3.OpAdd($1,$05));
   }
  }/*row*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void drawSierpinskiTriangle2(netrexx.lang.Rexx ordr){
  drawSierpinskiTriangle2(ordr,new netrexx.lang.Rexx('^'));return;
  }
 public static void drawSierpinskiTriangle2(netrexx.lang.Rexx ordr,netrexx.lang.Rexx filler){
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx line;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx u=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx j1=null;
  netrexx.lang.Rexx cl=null;
  netrexx.lang.Rexx cr=null;
  netrexx.lang.Rexx t=null;
  netrexx.lang.Rexx j2=null;
  netrexx.lang.Rexx j3=null;
  n=$05.OpMult($1,($08.OpPow($1,ordr)));
  line=new netrexx.lang.Rexx(' ').copies($08.OpMult($1,n));
  line=line.overlay(filler,n.OpAdd($1,$05)); // set the top point of the triangle
  {netrexx.lang.Rexx $8=n.OpSub($1,$05);i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq($1,$8);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(line.strip(new netrexx.lang.Rexx('t')));
   u=filler;
   {j=n.OpSub($1,i).OpPlus($1);j:for(;;j=j.OpAdd($1,new netrexx.lang.Rexx(1))){if(!j.OpLt($1,n.OpAdd($1,i).OpAdd($1,$05)))break;
    j1=j.OpAdd($1,$05);
    cl=line.substr(j1.OpSub($1,$05),new netrexx.lang.Rexx((byte)1));
    cr=line.substr(j1.OpAdd($1,$05),new netrexx.lang.Rexx((byte)1));
    if (cl.OpEqS($1,cr)) 
     t=new netrexx.lang.Rexx(' ');
    else 
     t=filler;
    line=line.overlay(u,j1.OpSub($1,$05));
    u=t;
    }
   }/*j*/
   j2=n.OpAdd($1,i);
   j3=n.OpAdd($1,i).OpAdd($1,$05);
   line=line.overlay(t,j2.OpAdd($1,$05));
   line=line.overlay(filler,j3.OpAdd($1,$05));
   }
  }/*i*/
  return;
  }
 
 private RSierpinskiTriangle(){return;}
 }
