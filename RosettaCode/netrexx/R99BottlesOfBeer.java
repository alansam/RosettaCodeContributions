/* Generated from 'R99BottlesOfBeer.nrx' 2 Jul 2011 15:18:10 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * In this puzzle, write code to print out the entire "99 bottles of beer on the wall" song.
 * For those who do not know the song, the lyrics follow this form:
 * <pre>
 * X bottles of beer on the wall
 * X bottles of beer
 * Take one down, pass it around
 * X-1 bottles of beer on the wall
 * X-1 bottles of beer on the wall
 * ...
 * Take one down, pass it around
 * 0 bottles of beer on the wall
 * </pre>
 * <p>
 * Where X and X-1 are replaced by numbers of course.
 * Grammatical support for "1 bottle of beer" is optional.
 * As with any puzzle, try to do it in as creative/concise/comical a way as possible
 * (simple, obvious solutions allowed, too).
 * </p>
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/99_Bottles_of_Beer">rosettacode.org/wiki/99_Bottles_of_Beer</a> 
 * @see <a href="http://99-bottles-of-beer.net/">99-bottles-of-beer.net/</a>
 */


public class R99BottlesOfBeer{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(99);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("bottle");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("No more");
 private static final java.lang.String $0="R99BottlesOfBeer.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx beer;
  netrexx.lang.Rexx removeOne;
  int i=0;
  netrexx.lang.Rexx lastCall;
  beer=new netrexx.lang.Rexx("bottles of beer on the wall");
  removeOne=new netrexx.lang.Rexx("Take one down, pass it around,");
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,beer)).OpCc(null,$02));
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,beer.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
  {i=98;i:for(;i>=2;i--){
   netrexx.lang.RexxIO.Say(removeOne);
   netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,beer)).OpCc(null,$03));
   netrexx.lang.RexxIO.Say("");
   netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,beer)).OpCc(null,$02));
   netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,beer.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
   }
  }/*i*/
  lastCall=$04.OpCcblank(null,beer.delword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1)));
  netrexx.lang.RexxIO.Say(removeOne);
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,lastCall)).OpCc(null,$03));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,lastCall)).OpCc(null,$02));
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(i).OpCcblank(null,lastCall.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$02));
  netrexx.lang.RexxIO.Say(removeOne);
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,beer));
  return;}
 
 private R99BottlesOfBeer(){return;}
 }
