/* Generated from 'RPascalsTriangle01.nrx' 24 Jun 2013 15:58:51 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/*REXX program to display Pascal's triangle,  neatly centered/formatted.*/
/*AKA:   Yang Hui's ▲,   Khayyam-Pascal ▲,   Kyayyam ▲,   Tartaglia's ▲ */
/*let's be able to handle big ▲. */

public class RPascalsTriangle01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("1");
 private static final java.lang.String $0="RPascalsTriangle01.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nn=null;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx mx;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx line;
  netrexx.lang.Rexx row=null;
  netrexx.lang.Rexx prev=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx jm=null;
  netrexx.lang.Rexx width;
  netrexx.lang.Rexx L=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  nn=$2[0];}
  if (nn.OpEqS($1,$03)) 
   nn=new netrexx.lang.Rexx((byte)10);
  n=nn.abs();
  a=new netrexx.lang.Rexx((byte)1);
  mx=(factorial(n.OpSub($1,$04))).OpDiv($1,factorial(n.OpDivI($1,$05))).OpDiv($1,factorial(n.OpSub($1,$04).OpSub($1,n.OpDivI($1,$05))));/*MX =biggest number in triangle.*/
  w=mx.length();/* W =width of biggest number.   */
  line=new netrexx.lang.Rexx((byte)1);
  
  {int $3=n.OpPlus($1).toint();row=new netrexx.lang.Rexx((byte)1);row:for(;$3>0;$3--,row=row.OpAdd($1,new netrexx.lang.Rexx(1))){
   prev=row.OpSub($1,$04);
   a.getnode(row).leaf.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)1);
   {netrexx.lang.Rexx $4=row.OpSub($1,$04);j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq($1,$4);j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
    jm=j.OpSub($1,$04);
    a.getnode(row).leaf.getnode(j).leaf=(a.getnode(prev).leaf.getnode(jm).leaf).OpAdd($1,a.getnode(prev).leaf.getnode(j).leaf);
    line.getnode(row).leaf=(line.getnode(row).leaf).OpCcblank($1,a.getnode(row).leaf.getnode(j).leaf.right(w));
    }
   }/*j*/
   
   if (row.OpNotEqS($1,$04)) 
    line.getnode(row).leaf=(line.getnode(row).leaf).OpCcblank($1,$06.right(w));/*append the last "1".*/
   }
  }/*row*/
  
  width=line.getnode(n).leaf.length();/*width of last line in triangle.*/
  
  {int $5=n.OpPlus($1).toint();L=new netrexx.lang.Rexx((byte)1);L:for(;$5>0;$5--,L=L.OpAdd($1,new netrexx.lang.Rexx(1))){/*show lines in Pascal's triangle*/
   netrexx.lang.RexxIO.Say(line.getnode(L).leaf.centre(width));/*either SAY or write.*/
   }
  }/*L*/
  
  return;/*stick a fork in it, we're done.*/
  }

 /*─────────────────────────────────────! (factorial) subroutine─────────*/
 
 public static netrexx.lang.Rexx factorial(netrexx.lang.Rexx x){
  netrexx.lang.Rexx fac;
  netrexx.lang.Rexx j=null;
  fac=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $6=x;j=new netrexx.lang.Rexx((byte)2);j:for(;j.OpLtEq($1,$6);j=j.OpAdd($1,new netrexx.lang.Rexx(1))){
   fac=fac.OpMult($1,j);
   }
  }/*j*/
  return fac;/*calc. factorial*/
  }
 
 private RPascalsTriangle01(){return;}
 }
