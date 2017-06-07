/* Generated from 'RPascalsTriangle02.nrx' 24 Jun 2013 17:27:03 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// allow very large numbers


public class RPascalsTriangle02{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((short)1000);
 private static final char[] $02={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("1");
 private static final java.lang.String $0="RPascalsTriangle02.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rows=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  rows=$2[0];}
  if (rows.OpEq($1,$03)) 
   rows=new netrexx.lang.Rexx((byte)11); // default to 11 rows
  printPascalTriangle(rows);
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static void printPascalTriangle(){
  printPascalTriangle(new netrexx.lang.Rexx((byte)11));return;
  }
 public static void printPascalTriangle(netrexx.lang.Rexx rows){
  netrexx.lang.Rexx lines;
  netrexx.lang.Rexx mx;
  netrexx.lang.Rexx row=null;
  netrexx.lang.Rexx n1=null;
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx col=null;
  netrexx.lang.Rexx n2=null;
  netrexx.lang.Rexx ml;
  lines=netrexx.lang.Rexx.toRexx("");
  mx=((factorial(rows.OpSub($1,$04))).OpDiv($1,factorial(rows.OpDivI($1,$05))).OpDiv($1,factorial(rows.OpSub($1,$04).OpSub($1,rows.OpDivI($1,$05))))).length(); // width of widest number
  
  {netrexx.lang.Rexx $3=rows;row=new netrexx.lang.Rexx((byte)1);row:for(;row.OpLtEq($1,$3);row=row.OpAdd($1,new netrexx.lang.Rexx(1))){
   n1=$06.center(mx);
   line=n1;
   {netrexx.lang.Rexx $4=row;col=new netrexx.lang.Rexx((byte)2);col:for(;col.OpLtEq($1,$4);col=col.OpAdd($1,new netrexx.lang.Rexx(1))){
    n2=col.OpSub($1,$04);
    n1=n1.OpMult($1,(row.OpSub($1,n2))).OpDiv($1,n2);
    line=line.OpCcblank($1,n1.center(mx));
    }
   }/*col*/
   lines.getnode(row).leaf=line.strip();
   }
  }/*row*/
  
  // display triangle
  ml=lines.getnode(rows).leaf.length(); // length of longest line
  {netrexx.lang.Rexx $5=rows;row=new netrexx.lang.Rexx((byte)1);row:for(;row.OpLtEq($1,$5);row=row.OpAdd($1,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(lines.getnode(row).leaf.centre(ml));
   }
  }/*row*/
  
  return;
  }

 // -----------------------------------------------------------------------------
 
 public static netrexx.lang.Rexx factorial(netrexx.lang.Rexx n){
  netrexx.lang.Rexx fac;
  netrexx.lang.Rexx n_=null;
  fac=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $6=n;n_=new netrexx.lang.Rexx((byte)2);n_:for(;n_.OpLtEq($1,$6);n_=n_.OpAdd($1,new netrexx.lang.Rexx(1))){
   fac=fac.OpMult($1,n_);
   }
  }/*n_*/
  return fac;/*calc. factorial*/
  }
 
 private RPascalsTriangle02(){return;}
 }
