/* Generated from 'RFlattenList.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


// A real cheat.  The list in this case is just a string so string manip. functions can be used

public class RFlattenList{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RFlattenList.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx list;
  java.lang.Object re[];
  list=netrexx.lang.Rexx.toRexx("[[1], 2, [[3,4], 5], [[[]]], [[[6]]], 7, 8, []]");
  list=($01.OpCc(null,list.changestr(new netrexx.lang.Rexx('['),netrexx.lang.Rexx.toRexx("")).changestr(new netrexx.lang.Rexx(']'),netrexx.lang.Rexx.toRexx("")).changestr(new netrexx.lang.Rexx(','),new netrexx.lang.Rexx(' ')).space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(',')))).OpCc(null,$02);
  netrexx.lang.RexxIO.Say(list);
  
  re=new java.lang.Object[]{(java.lang.Object)(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(1)}),(java.lang.Object)(new netrexx.lang.Rexx(2)),(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(3),new netrexx.lang.Rexx(4)}),(java.lang.Object)(new netrexx.lang.Rexx(5))}),(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)null})})}),(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx(6)})})}),(java.lang.Object)(new netrexx.lang.Rexx(7)),(java.lang.Object)(new netrexx.lang.Rexx(8)),(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)null})};
  netrexx.lang.RexxIO.Say(java.util.Arrays.asList(re));
  
  return;
  }
 
 private RFlattenList(){return;}
 }
