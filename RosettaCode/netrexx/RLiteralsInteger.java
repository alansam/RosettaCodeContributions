/* Generated from 'RLiteralsInteger.nrx' 5 Aug 2012 16:18:54 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RLiteralsInteger{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('8');
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("==");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("-8");
 private static final java.lang.String $0="RLiteralsInteger.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx iv;
  iv=new netrexx.lang.Rexx((byte)8);
  netrexx.lang.RexxIO.Say(($01.right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     8
  iv=$03.OpMinus(null);
  netrexx.lang.RexxIO.Say(($04.right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -8
  iv=new netrexx.lang.Rexx((byte)-8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("1x8").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -8
  iv=new netrexx.lang.Rexx((byte)8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("2x8").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     8
  iv=new netrexx.lang.Rexx((byte)8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("2x08").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     8
  iv=new netrexx.lang.Rexx((byte)8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0x08").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     8
  iv=new netrexx.lang.Rexx((byte)16);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0x10").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    16
  iv=new netrexx.lang.Rexx((short)129);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //   129
  iv=new netrexx.lang.Rexx((byte)-127);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("2x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //  -127
  iv=new netrexx.lang.Rexx((short)129);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("3x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //   129
  iv=new netrexx.lang.Rexx((short)129);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("4x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //   129
  iv=new netrexx.lang.Rexx((short)129);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("04x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //   129
  iv=new netrexx.lang.Rexx((short)129);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("16x81").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //   129
  iv=new netrexx.lang.Rexx((short)-3967);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("4xF081").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // -3967
  iv=new netrexx.lang.Rexx(61569);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("8xF081").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 61569
  iv=new netrexx.lang.Rexx(61569);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0Xf081").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 61569
  iv=new netrexx.lang.Rexx(65535);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0xffff").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 65535
  iv=new netrexx.lang.Rexx((byte)-1);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("4xffff").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -1
  iv=new netrexx.lang.Rexx(65535);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("8xffff").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 65535
  iv=new netrexx.lang.Rexx((byte)0);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("1b0").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     0
  iv=new netrexx.lang.Rexx((byte)-1);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("1b1").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -1
  iv=new netrexx.lang.Rexx((byte)1);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("2b1").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     1
  iv=new netrexx.lang.Rexx((byte)2);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0b10").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     2
  iv=new netrexx.lang.Rexx((byte)-2);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("2b10").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -2
  iv=new netrexx.lang.Rexx((byte)2);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("3b10").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     2
  iv=new netrexx.lang.Rexx((byte)4);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("0b100").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     4
  iv=new netrexx.lang.Rexx((byte)-4);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("3b100").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -4
  iv=new netrexx.lang.Rexx((byte)4);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("4b100").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     4
  iv=new netrexx.lang.Rexx((byte)-8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("4b1000").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -8
  iv=new netrexx.lang.Rexx((byte)8);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("8B1000").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //     8
  iv=new netrexx.lang.Rexx(65535);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("00B1111111111111111").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 65535
  iv=new netrexx.lang.Rexx((byte)-1);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("16B1111111111111111").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); //    -1
  iv=new netrexx.lang.Rexx(65535);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("32B1111111111111111").right(new netrexx.lang.Rexx((byte)20)).OpCcblank(null,$02)).OpCcblank(null,iv.right(new netrexx.lang.Rexx((byte)8)))); // 65535
  
  return;
  }
 
 private RLiteralsInteger(){return;}
 }
