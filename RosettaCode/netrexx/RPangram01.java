/* Generated from 'RPangram01.nrx' 13 Jul 2011 22:36:52 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */





/**
 * <h3>Pangram checker</h3>
 * <p>
 * Write a function or method to check a sentence to see if it is a
 * <a href="http://en.wikipedia.org/wiki/Pangram">pangram</a> or not and show its use.
 * </p>
 * <p>
 * A pangram is a sentence that contains all the letters of the English alphabet at least once,
 * for example: <i>The quick brown fox jumps over the lazy dog</i>.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Pangram_checker">http://rosettacode.org/wiki/Pangram_checker</a>
 * @see <a href="http://en.wikipedia.org/wiki/List_of_pangrams">Wikipedia <i>List of pangrams</i></a>
 */


public class RPangram01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RPangram01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx A2Z;
  java.util.List pangrams;
  java.util.ListIterator pangrami;
  netrexx.lang.Rexx pangram=null;
  netrexx.lang.Rexx q_=null;
  A2Z=new netrexx.lang.Rexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  
  pangrams=create_samples();
  pangrami=pangrams.listIterator();
  
  {p_:for(;;){if(!(pangrami.hasNext()))break;
   pangram=new netrexx.lang.Rexx(pangrami.next().toString());
   q_=A2Z.verify(pangram.upper());
   netrexx.lang.RexxIO.Say(pangram.OpCc(null,$01));
   if (q_.OpEqS(null,$02)) 
    netrexx.lang.RexxIO.Say(" [OK, a pangram]");
   else 
    netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(" [Not a pangram.  Missing:").OpCcblank(null,A2Z.substr(q_,new netrexx.lang.Rexx((byte)1)))).OpCc(null,$03));
   }
  }/*p_*/
  return;}

 /**
  * Create some sample data
  *
  * @return a @{link List} of pangrams
  */
 
 public static java.util.List create_samples(){
  java.util.ArrayList pangrams;
  
  pangrams=new java.util.ArrayList();
  
  /* Perfect pangrams in English (26 letters) */
  /* Without proper nouns or initialisms */
  pangrams.add((java.lang.Object)("Cwm fjordbank glyphs vext quiz.")); //('Carved symbols in a mountain hollow on the bank of an inlet irritated an eccentric person.')<ref>[http://www.funtrivia.com/askft/Question35564.html What is the longest sentence in English without repeating any letters?]</ref>
  pangrams.add((java.lang.Object)("Squdgy fez, blank jimp crwth vox!")); //('A short brimless felt hat barely blocks out the sound of a Celtic violin.' Ð created by [[Claude Shannon]])
  pangrams.add((java.lang.Object)("Jink cwm, zag veldt, fob qursh pyx.")); //('Cross valley and plain to steal coins from Saudi mint.' Ð created by Stephen Wagner)
  pangrams.add((java.lang.Object)("Veldt jynx grimps waqf zho buck.")); //('A grasslands wryneck woodpecker climbs onto a male bovid on Muslim land held in trust.' Ð created by Michael Jones)<ref>Boehm, David A. et, al. [[Guinness Book of World Records]]. Bantam Books, New York, 1988. Page 198.</ref>
  pangrams.add((java.lang.Object)("Junky qoph-flags vext crwd zimb.")); //('An Abyssinian fly playing a Celtic violin was annoyed by trashy flags on which were the Hebrew letter qoph.')
  pangrams.add((java.lang.Object)("Cwm fjord veg balks nth pyx quiz.")); //('Relaxing in basins at the end of inlets terminates the endless tests from the box.')
  
  /* With proper nouns, acronyms, abbreviations or initialisms */
  pangrams.add((java.lang.Object)("Quartz glyph job vex\'d cwm finks.")); // ('The act of carving symbols into quartz irritated ruffians from a Welsh river valley.')
  pangrams.add((java.lang.Object)("Blowzy night-frumps vex\'d Jack Q."));
  pangrams.add((java.lang.Object)("Dwarf mobs quiz lynx.jpg, kvetch!")); // ('crowd of midgets question picture of wildcat, then complain.')
  pangrams.add((java.lang.Object)("Jerk gawps foxy Qum Blvd. chintz.")); // ('Contemptible person stares at sexy, burka-clad women parading down the main street of Qum, Iran')
  pangrams.add((java.lang.Object)("Fjord q-klutz bahs given cwm pyx."));
  pangrams.add((java.lang.Object)("Frowzy things plumb vex\'d Jack Q."));
  pangrams.add((java.lang.Object)("Glum Schwartzkopf vex\'d by NJ IQ."));
  pangrams.add((java.lang.Object)("J.Q. Vandz struck my big fox whelp."));
  pangrams.add((java.lang.Object)("Zing, dwarf jocks vex lymph, Qutb.")); //  ('Making a high-pitched sound, short athletes annoy their lymph glands and an Islamic saint.' Ð created by Peter M. Lella)
  pangrams.add((java.lang.Object)("J.Q. Schwartz flung D.V. Pike my box."));
  pangrams.add((java.lang.Object)("Jocks find quartz glyph, vex BMW."));
  pangrams.add((java.lang.Object)("Jumbling vext frowzy hacks PDQ.")); // ('Being bounced around quickly annoyed the disheveled taxi drivers.' Ð all words in high school dictionary)
  pangrams.add((java.lang.Object)("Jump dogs, why vex Fritz Blank QC?"));
  pangrams.add((java.lang.Object)("The glib czar junks my VW Fox PDQ."));
  pangrams.add((java.lang.Object)("T.V. quiz jock, Mr. PhD, bags few lynx.")); // (often seen as Mr. Jock, TV quiz PhD, bags few lynx.)
  pangrams.add((java.lang.Object)("New job: fix Mr. Gluck\'s hazy TV, PDQ!")); // (includes 5 [[punctuation symbol]]s)
  pangrams.add((java.lang.Object)("PR flacks quiz gym: TV DJ box when?"));
  pangrams.add((java.lang.Object)("Quartz jock vends BMW glyph fix."));
  pangrams.add((java.lang.Object)("Zing! Vext cwm fly jabs Kurd qoph."));
  pangrams.add((java.lang.Object)("G.B. fjords vex quick waltz nymph."));
  pangrams.add((java.lang.Object)("JFK got my VHS, PC and XLR web quiz."));
  pangrams.add((java.lang.Object)("Fjord Nymphs XV beg quick waltz."));
  
  /*  */
  pangrams.add((java.lang.Object)("Nymphs blitz quick vex dwarf jog."));
  pangrams.add((java.lang.Object)("DJs flock by when MTV ax quiz prog."));
  pangrams.add((java.lang.Object)("Big fjords vex quick waltz nymph."));
  pangrams.add((java.lang.Object)("Bawds jog, flick quartz, vex nymph."));
  pangrams.add((java.lang.Object)("Junk MTV quiz graced by fox whelps."));
  pangrams.add((java.lang.Object)("Bawds jog, flick quartz, vex nymphs."));
  pangrams.add((java.lang.Object)("Waltz, bad nymph, for quick jigs vex!"));
  pangrams.add((java.lang.Object)("Fox nymphs grab quick-jived waltz."));
  pangrams.add((java.lang.Object)("Brick quiz whangs jumpy veldt fox."));
  pangrams.add((java.lang.Object)("Glib jocks quiz nymph to vex dwarf."));
  pangrams.add((java.lang.Object)("Bright vixens jump; dozy fowl quack."));
  pangrams.add((java.lang.Object)("Vexed nymphs go for quick waltz job."));
  pangrams.add((java.lang.Object)("Quick wafting zephyrs vex bold Jim."));
  pangrams.add((java.lang.Object)("Quick zephyrs blow, vexing daft Jim."));
  pangrams.add((java.lang.Object)("Quick blowing zephyrs vex daft Jim."));
  pangrams.add((java.lang.Object)("Sphinx of black quartz, judge my vow."));
  pangrams.add((java.lang.Object)("Sex-charged fop blew my junk TV quiz"));
  pangrams.add((java.lang.Object)("Jack fox bids ivy-strewn phlegm quiz"));
  pangrams.add((java.lang.Object)("How quickly daft jumping zebras vex."));
  pangrams.add((java.lang.Object)("Two driven jocks help fax my big quiz."));
  pangrams.add((java.lang.Object)("\"Now fax quiz Jack!\" my brave ghost pled."));
  pangrams.add((java.lang.Object)("Jack, love my big wad of sphinx quartz!"));
  pangrams.add((java.lang.Object)("Vamp fox held quartz duck just by wing."));
  pangrams.add((java.lang.Object)("Five quacking zephyrs jolt my wax bed."));
  pangrams.add((java.lang.Object)("The five boxing wizards jump quickly."));
  pangrams.add((java.lang.Object)("Jackdaws love my big sphinx of quartz."));
  pangrams.add((java.lang.Object)("Kvetching, flummoxed by job, W. zaps Iraq."));
  pangrams.add((java.lang.Object)("My ex pub quiz crowd gave joyful thanks."));
  pangrams.add((java.lang.Object)("Cozy sphinx waves quart jug of bad milk."));
  pangrams.add((java.lang.Object)("Waxy and quivering, jocks fumble pizza."));
  pangrams.add((java.lang.Object)("A very bad quack might jinx zippy fowls."));
  pangrams.add((java.lang.Object)("Pack my box with five dozen liquor jugs."));
  pangrams.add((java.lang.Object)("Few quips galvanized the mock jury box."));
  pangrams.add((java.lang.Object)("The jay, pig, fox, zebra, and my wolves quack!"));
  pangrams.add((java.lang.Object)("Blowzy red vixens fight for a quick jump."));
  pangrams.add((java.lang.Object)("Sex prof gives back no quiz with mild joy."));
  pangrams.add((java.lang.Object)("Joaquin Phoenix was gazed by MTV for luck."));
  pangrams.add((java.lang.Object)("JCVD might pique a sleazy boxer with funk."));
  pangrams.add((java.lang.Object)("Quizzical twins proved my hijack-bug fix."));
  pangrams.add((java.lang.Object)("The quick brown fox jumps over a lazy dog."));
  pangrams.add((java.lang.Object)("Wolf zombies quickly spot the jinxed grave."));
  pangrams.add((java.lang.Object)("Heavy boxes perform quick waltzes and jigs."));
  pangrams.add((java.lang.Object)("A quick chop jolted my big sexy frozen wives."));
  pangrams.add((java.lang.Object)("A wizard\u2019s job is to vex chumps quickly in fog."));
  pangrams.add((java.lang.Object)("Sympathizing would fix Quaker objectives."));
  pangrams.add((java.lang.Object)("Pack my red box with five dozen quality jugs."));
  pangrams.add((java.lang.Object)("Fake bugs put in wax jonquils drive him crazy."));
  pangrams.add((java.lang.Object)("Watch \"Jeopardy!\", Alex Trebek\'s fun TV quiz game."));
  pangrams.add((java.lang.Object)("The big plump jowls of zany Dick Nixon quiver."));
  pangrams.add((java.lang.Object)("GQ jock wears vinyl tuxedo for showbiz promo."));
  pangrams.add((java.lang.Object)("Woven silk pyjamas exchanged for blue quartz."));
  pangrams.add((java.lang.Object)("Brawny gods just flocked up to quiz and vex him."));
  pangrams.add((java.lang.Object)("Twelve ziggurats quickly jumped a finch box."));
  pangrams.add((java.lang.Object)("My faxed joke won a pager in the cable TV quiz show."));
  pangrams.add((java.lang.Object)("The quick onyx goblin jumps over the lazy dwarf."));
  pangrams.add((java.lang.Object)("The lazy major was fixing Cupid\'s broken quiver."));
  pangrams.add((java.lang.Object)("Amazingly few discotheques provide jukeboxes."));
  pangrams.add((java.lang.Object)("Foxy diva Jennifer Lopez wasn\u2019t baking my quiche."));
  pangrams.add((java.lang.Object)("Cozy lummox gives smart squid who asks for job pen."));
  pangrams.add((java.lang.Object)("By Jove, my quick study of lexicography won a prize."));
  pangrams.add((java.lang.Object)("Painful zombies quickly watch a jinxed graveyard."));
  pangrams.add((java.lang.Object)("Fax back Jim\'s Gwyneth Paltrow video quiz."));
  pangrams.add((java.lang.Object)("My girl wove six dozen plaid jackets before she quit."));
  pangrams.add((java.lang.Object)("Six big devils from Japan quickly forgot how to waltz."));
  pangrams.add((java.lang.Object)("\"Who am taking the ebonics quiz?\", the prof jovially axed."));
  pangrams.add((java.lang.Object)("Why shouldn\'t a quixotic Kazakh vampire jog barefoot?"));
  pangrams.add((java.lang.Object)("Within Jack\'s dark empty cave, boxes of quartz glisten."));
  pangrams.add((java.lang.Object)("Big July earthquakes confound zany experimental vow."));
  pangrams.add((java.lang.Object)("Foxy parsons quiz and cajole the lovably dim wiki-girl."));
  pangrams.add((java.lang.Object)("Cute, kind, jovial, foxy physique, amazing beauty? Wowser!"));
  pangrams.add((java.lang.Object)("Have a pick: twenty six letters \u2013 no forcing a jumbled quiz!"));
  pangrams.add((java.lang.Object)("A very big box sailed up then whizzed quickly from Japan."));
  pangrams.add((java.lang.Object)("Jack quietly moved up front and seized the big ball of wax."));
  pangrams.add((java.lang.Object)("Few black taxis drive up major roads on quiet hazy nights."));
  pangrams.add((java.lang.Object)("Just poets wax boldly as kings and queens march over fuzz."));
  pangrams.add((java.lang.Object)("Bored? Craving a pub quiz fix? Why, just come to the Royal Oak!"));
  pangrams.add((java.lang.Object)("Grumpy wizards make toxic brew for the evil Queen and Jack."));
  pangrams.add((java.lang.Object)("Crazy Fredericka bought many very exquisite opal jewels."));
  pangrams.add((java.lang.Object)("Sixty zippers were quickly picked from the woven jute bag."));
  pangrams.add((java.lang.Object)("The job of waxing linoleum frequently peeves chintzy kids."));
  pangrams.add((java.lang.Object)("Back in June we delivered oxygen equipment of the same size."));
  pangrams.add((java.lang.Object)("Just keep examining every low bid quoted for zinc etchings."));
  pangrams.add((java.lang.Object)("How razorback-jumping frogs can level six piqued gymnasts!"));
  pangrams.add((java.lang.Object)("A quick movement of the enemy will jeopardize six gunboats."));
  pangrams.add((java.lang.Object)("All questions asked by five watched experts amaze the judge."));
  pangrams.add((java.lang.Object)("The wizard quickly jinxed the gnomes before they vaporized."));
  pangrams.add((java.lang.Object)("What you write deserves better than a jiggling, shaky, inexact, or questionably fuzzy approximation of blur."));
  
  /* most common */
  pangrams.add((java.lang.Object)("The quick brown fox jumps over a lazy dog.")); // best/shortest pangram
  pangrams.add((java.lang.Object)("The quick brown fox jumps over the lazy dog.")); // not as short but at least it's still a pangram
  pangrams.add((java.lang.Object)("The quick brown fox jumped over the lazy dog.")); // not a pangram
  
  return (java.util.List)pangrams;
  }
 
 private RPangram01(){return;}
 }
