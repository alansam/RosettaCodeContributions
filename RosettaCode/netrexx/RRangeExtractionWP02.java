/* Generated from 'RRangeExtractionWP02.nrx' 23 Apr 2015 20:31:43 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/*NetRexx program to test range extraction. ***************************
* 07.08.2012 Walter Pachl derived from my Rexx Version
* Changes: line continuation in aaa assignment changed
*          1e99 -> Long.MAX_VALUE
*          Do -> Loop
*          words(aaa) -> aaa.words()
*          word(aaa,i) -> aaa.word(i)
*          provided a function as per task description
**********************************************************************/
// nrc -keepasjava -savelog RRangeExtractionWP02.nrx



public class RRangeExtractionWP02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("old=");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("new=");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="RRangeExtractionWP02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx aaa;
  netrexx.lang.RexxIO.Say("NetRexx program derived from Rexx");
  aaa=netrexx.lang.Rexx.toRexx("0 1 2 4 6 7 8 11 12 14 15 16 17 18 19 20 21 22 23 24 25 27 28 29").OpCcblank(null,netrexx.lang.Rexx.toRexx("30 31 32 33 35 36 37 38 39"));
  
  netrexx.lang.RexxIO.Say($01.OpCc(null,aaa));
  netrexx.lang.RexxIO.Say($02.OpCc(null,compact(aaa)));
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ 
 
 public static netrexx.lang.Rexx compact(netrexx.lang.Rexx aaa){
  netrexx.lang.Rexx TERMINAL_VAL;
  netrexx.lang.Rexx i;
  netrexx.lang.Rexx ol;
  netrexx.lang.Rexx comma;
  netrexx.lang.Rexx inrange;
  netrexx.lang.Rexx n=null;
  TERMINAL_VAL=new netrexx.lang.Rexx(java.lang.Long.MAX_VALUE);
  aaa=aaa.OpCcblank(null,TERMINAL_VAL);/* artificial number at the end  */
  i=new netrexx.lang.Rexx((byte)0);/* initialize index              */
  ol=netrexx.lang.Rexx.toRexx("");/* initialize output string      */
  comma=netrexx.lang.Rexx.toRexx("");/* will become a ',' lateron     */
  inrange=new netrexx.lang.Rexx((byte)0);
  
  {$1:for(;;){if(!i.OpLtEq(null,aaa.words()))break;/* loop for all numbers          */
   i=i.OpAdd(null,$03);/* index of next number          */
   n=aaa.word(i);/* the now current number        */
   if (n.OpEq(null,TERMINAL_VAL)) 
    break $1;/* we are at the end             */
   if (inrange.toboolean()) 
    {/* range was opened              */
     if ((aaa.word(i.OpAdd(null,$03))).OpNotEq(null,n.OpAdd(null,$03))) 
      {/* following word not in range*/
       ol=ol.OpCc(null,n);/* so this number is the end     */
       inrange=new netrexx.lang.Rexx((byte)0);/* and the range is over         */
      }/* else ignore current number    */
    }
   else 
    {/* not in a range                */
     ol=(ol.OpCc(null,comma)).OpCc(null,n);/* add number (with comma)       */
     comma=new netrexx.lang.Rexx(',');/* to the output string          */
     if ((aaa.word(i.OpAdd(null,$04))).OpEq(null,n.OpAdd(null,$04))) 
      {/* if the nr after the next fits*/
       inrange=new netrexx.lang.Rexx((byte)1);/* open a range                  */
       ol=ol.OpCc(null,$05);/* append the range connector    */
      }
    }
   }
  }
  
  return ol;
  }
 
 private RRangeExtractionWP02(){return;}
 }
