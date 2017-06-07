/* Generated from 'RSierpinskiTriangle01.nrx' 26 Jun 2013 18:17:10 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RSierpinskiTriangle01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RSierpinskiTriangle01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx BLACK_UPPOINTING_TRIANGLE;
  netrexx.lang.Rexx ordr=null;
  netrexx.lang.Rexx filr=null;
  netrexx.lang.Rexx filler=null;
  BLACK_UPPOINTING_TRIANGLE=new netrexx.lang.Rexx('\u25b2');
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  ordr=$2[0];filr=$2[1];}
  if (ordr.OpEq($1,$03)|ordr.OpEq($1,$04)) 
   ordr=new netrexx.lang.Rexx((byte)4);
  if (filr.OpEq($1,$03)|filr.OpEq($1,$04)) 
   filler=BLACK_UPPOINTING_TRIANGLE;
  else 
   filler=filr;
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
  n=$06.OpMult($1,($05.OpPow($1,ordr)));
  line=new netrexx.lang.Rexx(' ').copies($05.OpMult($1,n));
  line=line.overlay(filler,n.OpAdd($1,$06)); // set the top point of the triangle
  {netrexx.lang.Rexx $3=n;row=new netrexx.lang.Rexx((byte)1);row:for(;row.OpLtEq($1,$3);row=row.OpAdd($1,new netrexx.lang.Rexx(1))){ // NetRexx arrays, lists etc. index from 1
   netrexx.lang.RexxIO.Say(line.strip(new netrexx.lang.Rexx('t')));
   u=filler;
   {netrexx.lang.Rexx $4=n.OpAdd($1,row);col=$05.OpAdd($1,n).OpSub($1,row).OpPlus($1);col:for(;col.OpLtEq($1,$4);col=col.OpAdd($1,new netrexx.lang.Rexx(1))){
    cl=line.substr(col.OpSub($1,$06),new netrexx.lang.Rexx((byte)1));
    cr=line.substr(col.OpAdd($1,$06),new netrexx.lang.Rexx((byte)1));
    if (cl.OpEqS($1,cr)) 
     t=new netrexx.lang.Rexx(' ');
    else 
     t=filler;
    line=line.overlay(u,col.OpSub($1,$06));
    u=t;
    }
   }/*col*/
   j2=n.OpAdd($1,row).OpSub($1,$06);
   j3=n.OpAdd($1,row);
   line=line.overlay(t,j2.OpAdd($1,$06));
   line=line.overlay(filler,j3.OpAdd($1,$06));
   }
  }/*row*/
  return;
  }
 
 private RSierpinskiTriangle01(){return;}
 }
