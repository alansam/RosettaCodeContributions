/* Generated from 'RRangeExtraction.nrx' 23 Apr 2015 17:28:20 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */
// nrc -keepasjava -savelog RRangeExtraction.nrx



public class RRangeExtraction{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(',');
 private static final char[] $04={1,10,1,0,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("Original: ");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("Compacted:");
 private static final java.lang.String $0="RRangeExtraction.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 // Compact a list of numbers by reducing ranges
 
 public static netrexx.lang.Rexx compact(netrexx.lang.Rexx expanded){
  netrexx.lang.Rexx nums;
  netrexx.lang.Rexx rezult;
  netrexx.lang.Rexx RANGE;
  netrexx.lang.Rexx FIRST;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx LOCAL=null;
  nums=expanded.changestr(new netrexx.lang.Rexx(','),new netrexx.lang.Rexx(' ')).space(); // remove possible commas & clean up the string
  rezult=netrexx.lang.Rexx.toRexx("");
  
  RANGE=new netrexx.lang.Rexx((byte)0);
  FIRST=nums.word(new netrexx.lang.Rexx((byte)1)); // set starting value
  {netrexx.lang.Rexx $1=nums.words();i_=new netrexx.lang.Rexx((byte)2);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){ // each word in the string is a number to examine
   LOCAL=nums.word(i_);
   if (LOCAL.OpSub(null,FIRST).OpSub(null,RANGE).OpEqS(null,$01)) 
    {
     // inside a range
     RANGE=RANGE.OpAdd(null,$01);
    }
   else 
    {
     // not inside a range
     if (RANGE.OpNotEq(null,$02)) 
      {
       // we have a range of numbers so collect this and reset
       rezult=(((rezult.OpCc(null,FIRST)).OpCc(null,delim(RANGE))).OpCc(null,FIRST.OpAdd(null,RANGE))).OpCc(null,$03);
       RANGE=new netrexx.lang.Rexx((byte)0);
      }
     else 
      {
       // just collect this number
       rezult=(rezult.OpCc(null,FIRST)).OpCc(null,$03);
      }
     FIRST=LOCAL; // bump new starting value
    }
   }
  }/*i_*/
  
  if (RANGE.OpNotEq(null,$02)) 
   {
    // terminating value is a range
    rezult=((rezult.OpCc(null,FIRST)).OpCc(null,delim(RANGE))).OpCc(null,FIRST.OpAdd(null,RANGE));
   }
  else 
   {
    // terminating value is a single number
    rezult=rezult.OpCc(null,FIRST);
   }
  
  return rezult.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')); // format and return result string
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 // determine if the range delimiter should be a comma or dash
 
 private static netrexx.lang.Rexx delim(netrexx.lang.Rexx range){
  netrexx.lang.Rexx dlm=null;
  if (range.OpEqS(null,$01)) 
   dlm=new netrexx.lang.Rexx(',');
  else 
   dlm=new netrexx.lang.Rexx('-');
  return dlm;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 // sample driver
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx userInput=null;
  netrexx.lang.Rexx td;
  netrexx.lang.Rexx r_=null;
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$04,$2);
  userInput=$2[0];}
  td=new netrexx.lang.Rexx((byte)0);
  if ((userInput.words()).OpGt(null,$02)) 
   {
    // use input from command line
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=userInput;
   }
  else 
   {
    // use canned test data
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=netrexx.lang.Rexx.toRexx(" -6,  -3,  -2,  -1,   0,   1,   3,  4,  5,   7,  8,  9, 10, 11, 14, 15, 17, 18, 19, 20");
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=netrexx.lang.Rexx.toRexx("  0,   1,   2,   4,   6,   7,   8, 11,  12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 35, 36, 37, 38, 39");
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=netrexx.lang.Rexx.toRexx(" -4,  -3,  -2,   0,   1,   2,   4,  6,  7,   8, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 35, 36, 37, 38, 39");
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=netrexx.lang.Rexx.toRexx("-19, -18, -17, -16, -14, -13, -10, -8, -7,  -6, -5, -3, -2, -1,  0,  3,  4,  5,  7,  8, 10, 11, 12");
    // some end-point conditions
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=new netrexx.lang.Rexx((byte)1);
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=$01.OpCcblank(null,$05);
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=($01.OpCcblank(null,$05)).OpCcblank(null,$06);
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=(($01.OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08);
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=(($01.OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$09);
    td.getnode(new netrexx.lang.Rexx((byte)0)).leaf=(td.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
    r_=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;
    td.getnode(r_).leaf=netrexx.lang.Rexx.toRexx("1 3 4 5 7");
   }
  
  {netrexx.lang.Rexx $3=td.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$3);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say($010.OpCcblank(null,td.getnode(r_).leaf.changestr(new netrexx.lang.Rexx(','),new netrexx.lang.Rexx(' ')).space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','))));
   netrexx.lang.RexxIO.Say($011.OpCcblank(null,compact(td.getnode(r_).leaf)));
   netrexx.lang.RexxIO.Say("");
   }
  }/*r_*/
  return;
  }
 
 private RRangeExtraction(){return;}
 }
