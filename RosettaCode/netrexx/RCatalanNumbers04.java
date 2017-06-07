/* Generated from 'RCatalanNumbers04.nrx' 1 Jul 2014 12:27:24 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/* REXX ---------------------------------------------------------------
* 01.07.2014 Walter Pachl
*--------------------------------------------------------------------*/


public class RCatalanNumbers04{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final char[] $04={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RCatalanNumbers04.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx c1(netrexx.lang.Rexx n){
  return (fact($02.OpMult($1,n))).OpDiv($1,((fact(n)).OpMult($1,fact(n.OpAdd($1,$03)))));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx c2(netrexx.lang.Rexx n,netrexx.lang.Rexx c2){
  netrexx.lang.Rexx res;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx nmi=null;
  res=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $2=n.OpSub($1,$03);i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq($1,$2);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   nmi=n.OpSub($1,i).OpSub($1,$03);
   res=res.OpAdd($1,(c2.getnode(i).leaf).OpMult($1,c2.getnode(nmi).leaf));
   }
  }/*i*/
  return res;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx c3(netrexx.lang.Rexx n,netrexx.lang.Rexx c3){
  netrexx.lang.Rexx res;
  netrexx.lang.Rexx im1;
  res=new netrexx.lang.Rexx((byte)0);
  im1=n.OpSub($1,$03);
  res=$02.OpMult($1,($02.OpMult($1,n).OpSub($1,$03))).OpMult($1,c3.getnode(im1).leaf).OpDiv($1,(n.OpAdd($1,$03)));
  return res;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx fact(netrexx.lang.Rexx n){
  netrexx.lang.Rexx f;
  netrexx.lang.Rexx i=null;
  f=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $3=n;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq($1,$3);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   f=f.OpMult($1,i);
   }
  }/*i*/
  return f;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx Arg){
  netrexx.lang.Rexx m=null;
  netrexx.lang.Rexx c1;
  netrexx.lang.Rexx i=null;
  netrexx.lang.Rexx c2;
  netrexx.lang.Rexx c3;
  netrexx.lang.Rexx l;
  netrexx.lang.Rexx f;
  netrexx.lang.Rexx hdr;
  {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(Arg,$04,$4);
  m=$4[0];}
  if (m.OpEq($1,$05)) 
   m=new netrexx.lang.Rexx((byte)20);
  
  c1=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $5=m;i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq($1,$5);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   c1.getnode(i).leaf=c1(i);
   }
  }/*i*/
  
  c2=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $6=m;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq($1,$6);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   c2.getnode(i).leaf=c2(i,c2);
   }
  }/*i*/
  
  c3=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $7=m;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq($1,$7);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   c3.getnode(i).leaf=c3(i,c3);
   }
  }/*i*/
  
  l=(c3.getnode(m).leaf).length();
  f=m.length();
  hdr=((new netrexx.lang.Rexx('n').right(f.OpAdd($1,$03)).OpCcblank($1,netrexx.lang.Rexx.toRexx("c1[n]").right(l.OpAdd($1,$03)))).OpCcblank($1,netrexx.lang.Rexx.toRexx("c2[n]").right(l.OpAdd($1,$03)))).OpCcblank($1,netrexx.lang.Rexx.toRexx("c3[n]").right(l.OpAdd($1,$03)));
  
  
  
  netrexx.lang.RexxIO.Say(hdr);
  {netrexx.lang.Rexx $8=m;i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq($1,$8);i=i.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((((i.right(f.OpAdd($1,$03))).OpCcblank($1,c1.getnode(i).leaf.format(l.OpAdd($1,$03)))).OpCcblank($1,c2.getnode(i).leaf.format(l.OpAdd($1,$03)))).OpCcblank($1,c3.getnode(i).leaf.format(l.OpAdd($1,$03))));
   
   
   }
  }/*i*/
  netrexx.lang.RexxIO.Say(hdr);
  return;
  }
 
 private RCatalanNumbers04(){return;}
 }
