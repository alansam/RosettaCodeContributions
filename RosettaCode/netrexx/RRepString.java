/* Generated from 'RRepString.nrx' 13 May 2013 13:45:48 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/* REXX ***************************************************************
* 11.05.2013 Walter Pachl
**********************************************************************/

public class RRepString{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final char[] $05={1,10,1,0,0};
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("1001110011");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("1110111011");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("0010010010");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("1010101010");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("1111111111");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("0100101101");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("0100100");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("101");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("11");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("00");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx('1');
 private static final char[] $018={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $020=netrexx.lang.Rexx.toRexx("i.e. \'");
 private static final java.lang.String $0="RRepString.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 /**
  * Test for rep-strings
  * @param s_str a string to check for rep-strings
  * @return Rexx string: boolean indication of reps, length, repeated value
  */
 
 public static netrexx.lang.Rexx repstring(netrexx.lang.Rexx s_str){
  netrexx.lang.Rexx s_str_n;
  netrexx.lang.Rexx rep_str;
  netrexx.lang.Rexx lx=null;
  netrexx.lang.Rexx ix=null;
  s_str_n=s_str.length();
  rep_str=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=$03.OpMinus(null);boolean $2=$1.OpGtEq(null,$04);lx=(s_str.length()).OpDivI(null,$01).OpPlus(null);lx:for(;$2?lx.OpLtEq(null,$02):lx.OpGtEq(null,$02);lx=lx.OpAdd(null,$1)){
   if ((s_str.substr(lx.OpAdd(null,$03),lx)).OpEq(null,s_str.left(lx))) 
    break lx;
   }
  }/*lx*/
  if (lx.OpGt(null,$04)) 
   {reps:do{
    rep_str=s_str.left(lx);
    {ix=new netrexx.lang.Rexx((byte)1);ix:for(;;ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
     if ((s_str.substr(ix.OpMult(null,lx).OpAdd(null,$03),lx)).OpNotEq(null,rep_str)) 
      break ix;
     }
    }/*ix*/
    if ((rep_str.copies(s_str_n).left(s_str.length())).OpNotEq(null,s_str)) 
     rep_str=netrexx.lang.Rexx.toRexx("");
   }while(false);}/*reps*/
  return (new netrexx.lang.Rexx(((rep_str.length()).OpGt(null,$04))).OpCcblank(null,rep_str.length())).OpCcblank(null,rep_str);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx samples=null;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx in_str=null;
  netrexx.lang.Rexx is_rep_str=null;
  netrexx.lang.Rexx rep_str_len=null;
  netrexx.lang.Rexx rep_str=null;
  netrexx.lang.Rexx sq=null;
  netrexx.lang.Rexx tstrlen=null;
  {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$05,$3);
  samples=$3[0];}
  if (samples.OpEq(null,$06)) 
   samples=((((((((($07.OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$010)).OpCcblank(null,$011)).OpCcblank(null,$012)).OpCcblank(null,$013)).OpCcblank(null,$014)).OpCcblank(null,$015)).OpCcblank(null,$016)).OpCcblank(null,$017);
  
  
  
  
  
  
  
  
  
  
  
  
  {netrexx.lang.Rexx $4=samples.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$4);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
   in_str=samples.word(w_);
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(repstring(in_str),$018,$5);
   is_rep_str=$5[0];rep_str_len=$5[1];rep_str=$5[2];}
   
   sq=($019.OpCc(null,in_str)).OpCc(null,$019);
   tstrlen=sq.length().max(new netrexx.lang.Rexx((byte)20));
   sq=sq.right(tstrlen);
   if (is_rep_str.toboolean()) 
    netrexx.lang.RexxIO.Say(((((sq.OpCcblank(null,netrexx.lang.Rexx.toRexx("has a repetition length of"))).OpCcblank(null,rep_str_len)).OpCcblank(null,$020)).OpCc(null,rep_str)).OpCc(null,$019));
   else 
    netrexx.lang.RexxIO.Say(sq.OpCcblank(null,netrexx.lang.Rexx.toRexx("is not a repeated string")));
   }
  }/*w_*/
  return;
  }
 
 private RRepString(){return;}
 }
