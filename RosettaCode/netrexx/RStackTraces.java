/* Generated from 'RStackTraces.nrx' 27 Mar 2013 19:34:11 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RStackTraces{
 private static final java.lang.String $0="RStackTraces.nrx";
  private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
  private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)2);
  private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
  private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
  private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('.');
  private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);

 
 public static void inner(){
  RStackTraces.StackTracer.printStackTrace();
  return;}
 
 public static void middle(){
  inner();
  return;}
 
 public static void outer(){
  middle();
  return;}
 
 public static void main(java.lang.String args[]){
  outer();
  return;}
 
 private RStackTraces(){return;}

 
 static class StackTracer{
  private final transient java.lang.String $0="RStackTraces.nrx";

  
  public static void printStackTrace(){
   java.lang.StackTraceElement elems[];
   netrexx.lang.Rexx j_;
   netrexx.lang.Rexx i_=null;
   elems=java.lang.Thread.currentThread().getStackTrace();
   netrexx.lang.RexxIO.Say("Stack trace:");
   j_=new netrexx.lang.Rexx((byte)2);
   {netrexx.lang.Rexx $1=$01.OpMinus(null);boolean $2=$1.OpGtEq(null,$03);i_=new netrexx.lang.Rexx(elems.length).OpSub(null,$01).OpPlus(null);i_:for(;$2?i_.OpLtEq(null,$02):i_.OpGtEq(null,$02);i_=i_.OpAdd(null,$1)){
    netrexx.lang.RexxIO.Say((($04.left(j_).OpCc(null,netrexx.lang.Rexx.toRexx(elems[i_.toint()].getClassName()))).OpCc(null,$05)).OpCc(null,netrexx.lang.Rexx.toRexx(elems[i_.toint()].getMethodName())));
    j_=j_.OpAdd(null,$06);
    }
   }/*i_*/
   return;}
  
  private StackTracer(){return;}
 }}
