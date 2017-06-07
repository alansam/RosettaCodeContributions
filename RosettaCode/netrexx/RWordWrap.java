/* Generated from 'RWordWrap.nrx' 15 Aug 2013 17:27:06 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RWordWrap{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final char[] $02={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("characters");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(10);
 private static final java.lang.String $0="RWordWrap.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /*
    @see http://en.wikipedia.org/wiki/Word_wrap#Minimum_length
 
    SpaceLeft := LineWidth
    for each Word in Text
        if (Width(Word) + SpaceWidth) > SpaceLeft
            insert line break before Word in Text
            SpaceLeft := LineWidth - Width(Word)
        else
            SpaceLeft := SpaceLeft - (Width(Word) + SpaceWidth)
  */
 
 public static netrexx.lang.Rexx wordWrap(netrexx.lang.Rexx text){
  return wordWrap(text,new netrexx.lang.Rexx((byte)80));
  }
 public static netrexx.lang.Rexx wordWrap(netrexx.lang.Rexx text,netrexx.lang.Rexx lineWidth){
  netrexx.lang.Rexx NL=null;
  netrexx.lang.Rexx SP=null;
  netrexx.lang.Rexx wrapped=null;
  netrexx.lang.Rexx spaceWidth=null;
  netrexx.lang.Rexx spaceLeft=null;
  netrexx.lang.Rexx w_=null;
  netrexx.lang.Rexx nextWord=null;
  if (lineWidth.OpGt(null,$01)) 
   {
    NL=new netrexx.lang.Rexx('\n');
    SP=new netrexx.lang.Rexx(' ');
    wrapped=netrexx.lang.Rexx.toRexx("");
    spaceWidth=SP.length();
    spaceLeft=lineWidth;
    {netrexx.lang.Rexx $1=text.words();w_=new netrexx.lang.Rexx((byte)1);w_:for(;w_.OpLtEq(null,$1);w_=w_.OpAdd(null,new netrexx.lang.Rexx(1))){
     nextWord=text.word(w_);
     if ((((nextWord.length()).OpAdd(null,spaceWidth))).OpGt(null,spaceLeft)) 
      {
       wrapped=(wrapped.OpCc(null,NL)).OpCc(null,nextWord);
       spaceLeft=lineWidth.OpSub(null,nextWord.length());
      }
     else 
      {
       wrapped=(wrapped.OpCc(null,SP)).OpCc(null,nextWord);
       spaceLeft=spaceLeft.OpSub(null,((nextWord.length()).OpAdd(null,spaceWidth)));
      }
     }
    }/*w_*/
   }
  else 
   {
    wrapped=text;
   }
  
  return wrapped.strip(); // clean w/s from front & back
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx lineLen=null;
  netrexx.lang.Rexx textChoice=null;
  netrexx.lang.Rexx text;
  netrexx.lang.Rexx wrappedLines;
  //parse arg lineLen .
  //if lineLen  = '' then lineLen = 80
  //text = getText()
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  lineLen=$2[0];textChoice=$2[1];}
  if (lineLen.OpEq(null,$03)) 
   lineLen=new netrexx.lang.Rexx((byte)80);
  if (textChoice.OpEq(null,$03)) 
   textChoice=new netrexx.lang.Rexx((byte)1);
  text=testData(textChoice);
  wrappedLines=wordWrap(text,lineLen);
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Wrapping text at").OpCcblank(null,lineLen)).OpCcblank(null,$04));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("....+....|").copies(((lineLen.OpAdd(null,$05))).OpDivI(null,$06))).left(lineLen));
  netrexx.lang.RexxIO.Say(wrappedLines);
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx getText(){
  netrexx.lang.Rexx speech01;
  
  // ....+....|....+....|....+....|....+....|....+....|....+....|
  speech01=(((((((((((((netrexx.lang.Rexx.toRexx("She should have died hereafter;").OpCcblank(null,netrexx.lang.Rexx.toRexx("There would have been a time for such a word."))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Tomorrow, and tomorrow, and tomorrow,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Creeps in this petty pace from day to day,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("To the last syllable of recorded time;"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And all our yesterdays have lighted fools"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The way to dusty death. Out, out, brief candle!"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Life\'s but a walking shadow, a poor player"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("That struts and frets his hour upon the stage"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And then is heard no more. It is a tale"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Told by an idiot, full of sound and fury"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Signifying nothing."))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("\u2014-Macbeth (Act 5, Scene 5, lines 17-28)"))).OpCcblank(null,$03);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return speech01;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx testData(){
  return testData(new netrexx.lang.Rexx((byte)1));
  }
 public static netrexx.lang.Rexx testData(netrexx.lang.Rexx choice){
  netrexx.lang.Rexx speech01;
  netrexx.lang.Rexx speech02;
  netrexx.lang.Rexx speech03;
  netrexx.lang.Rexx speech=null;
  
  // ....+....|....+....|....+....|....+....|....+....|....+....|
  speech01=(((((((((((((netrexx.lang.Rexx.toRexx("She should have died hereafter;").OpCcblank(null,netrexx.lang.Rexx.toRexx("There would have been a time for such a word."))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Tomorrow, and tomorrow, and tomorrow,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Creeps in this petty pace from day to day,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("To the last syllable of recorded time;"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And all our yesterdays have lighted fools"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The way to dusty death. Out, out, brief candle!"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Life\'s but a walking shadow, a poor player"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("That struts and frets his hour upon the stage"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And then is heard no more. It is a tale"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Told by an idiot, full of sound and fury"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Signifying nothing."))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("\u2014-Macbeth (Act 5, Scene 5, lines 17-28)"))).OpCcblank(null,$03);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // ....+....|....+....|....+....|....+....|....+....|....+....|
  speech02=(((((((($03.OpCcblank(null,netrexx.lang.Rexx.toRexx("Out, damned spot! out, I say!-One: two: why,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("then, \'tis time to do\'t.-Hell is murky!-Fie, my"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("lord, fie! a soldier, and afeard? What need we"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("fear who knows it, when none can call our power"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("to account?\u2014Yet who would have thought the old"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("man to have had so much blood in him?"))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("--Macbeth (Act 5, Scene 1, lines 35-40)"))).OpCcblank(null,$03);
  
  
  
  
  
  
  
  
  
  // ....+....|....+....|....+....|....+....|....+....|....+....|
  speech03=((((((((((((((((((((((((((((((((((((($03.OpCcblank(null,netrexx.lang.Rexx.toRexx("To be, or not to be--that is the question:"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Whether \'tis nobler in the mind to suffer"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The slings and arrows of outrageous fortune"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Or to take arms against a sea of troubles"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And by opposing end them. To die, to sleep--"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("No more--and by a sleep to say we end"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The heartache, and the thousand natural shocks"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("That flesh is heir to. \'Tis a consummation"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Devoutly to be wished. To die, to sleep--"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("To sleep--perchance to dream: ay, there\'s the rub,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("For in that sleep of death what dreams may come"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("When we have shuffled off this mortal coil,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Must give us pause. There\'s the respect"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("That makes calamity of so long life."))).OpCcblank(null,netrexx.lang.Rexx.toRexx("For who would bear the whips and scorns of time,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Th\' oppressor\'s wrong, the proud man\'s contumely"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The pangs of despised love, the law\'s delay,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The insolence of office, and the spurns"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("That patient merit of th\' unworthy takes,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("When he himself might his quietus make"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("With a bare bodkin? Who would fardels bear,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("To grunt and sweat under a weary life,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("But that the dread of something after death,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The undiscovered country, from whose bourn"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("No traveller returns, puzzles the will,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And makes us rather bear those ills we have"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Than fly to others that we know not of?"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Thus conscience does make cowards of us all,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And thus the native hue of resolution"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Is sicklied o\'er with the pale cast of thought,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And enterprise of great pitch and moment"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("With this regard their currents turn awry"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("And lose the name of action. -- Soft you now,"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("The fair Ophelia! -- Nymph, in thy orisons"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Be all my sins remembered."))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("--Hamlet (Act 3, scene 1, lines 55\u201387)"))).OpCcblank(null,$03);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  {/*select*/netrexx.lang.Rexx $3=(choice);
  if ($3.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
   speech=speech01;
  else if ($3.OpEqS(null,new netrexx.lang.Rexx((byte)2)))
   speech=speech02;
  else if ($3.OpEqS(null,new netrexx.lang.Rexx((byte)3)))
   speech=speech03;
  else{
   speech=speech01;
  }
  }
  
  return speech;
  }
 
 private RWordWrap(){return;}
 }/*

    speech00 = "" // — Macbeth (Act 4, Scene 1, lines 44-45)
        + NL + "By the pricking of my thumbs,"
        + NL + "Something wicked this way comes."
        + NL + ""
        + NL + "— Macbeth (Act 4, Scene 1, lines 44-45)"
        ;
    speech01 = "" // — Macbeth (Act 1, Scene 3, lines 30-31)
        + NL + "A drum, a drum!"
        + NL + "Macbeth doth come."
        + NL + ""
        + NL + "— Macbeth (Act 1, Scene 3, lines 30-31)"
        ;
    speech02 = "" // — Macbeth (Act 5, Scene 5, lines 17-28)
        + NL + "She should have died hereafter;"
        + NL + "There would have been a time for such a word."
        + NL + "Tomorrow, and tomorrow, and tomorrow,"
        + NL + "Creeps in this petty pace from day to day,"
        + NL + "To the last syllable of recorded time;"
        + NL + "And all our yesterdays have lighted fools"
        + NL + "The way to dusty death. Out, out, brief candle!"
        + NL + "Life's but a walking shadow, a poor player"
        + NL + "That struts and frets his hour upon the stage"
        + NL + "And then is heard no more. It is a tale"
        + NL + "Told by an idiot, full of sound and fury"
        + NL + "Signifying nothing."
        + NL + ""
        + NL + "— Macbeth (Act 5, Scene 5, lines 17-28)"
         ;
    speech03 = "" // - Macbeth (Act 5, Scene 1, lines 35-40)
        + NL + "Out, damned spot! out, I say!-One: two: why,"
        + NL + "then, 'tis time to do't.-Hell is murky!-Fie, my"
        + NL + "lord, fie! a soldier, and afeard? What need we"
        + NL + "fear who knows it, when none can call our power"
        + NL + "to account?—Yet who would have thought the old"
        + NL + "man to have had so much blood in him?"
        + NL + ""
        + NL + "- Macbeth (Act 5, Scene 1, lines 35-40)"
        ;

    String[] antic_disposition = {
        "To be, or not to be--that is the question:",
        "Whether 'tis nobler in the mind to suffer",
        "The slings and arrows of outrageous fortune",
        "Or to take arms against a sea of troubles",
        "And by opposing end them. To die, to sleep--",
        "No more--and by a sleep to say we end",
        "The heartache, and the thousand natural shocks",
        "That flesh is heir to. 'Tis a consummation",
        "Devoutly to be wished. To die, to sleep--",
        "To sleep--perchance to dream: ay, there's the rub,",
        "For in that sleep of death what dreams may come",
        "When we have shuffled off this mortal coil,",
        "Must give us pause. There's the respect",
        "That makes calamity of so long life.",
        "For who would bear the whips and scorns of time,",
        "Th' oppressor's wrong, the proud man's contumely",
        "The pangs of despised love, the law's delay,",
        "The insolence of office, and the spurns",
        "That patient merit of th' unworthy takes,",
        "When he himself might his quietus make",
        "With a bare bodkin? Who would fardels bear,",
        "To grunt and sweat under a weary life,",
        "But that the dread of something after death,",
        "The undiscovered country, from whose bourn",
        "No traveller returns, puzzles the will,",
        "And makes us rather bear those ills we have",
        "Than fly to others that we know not of?",
        "Thus conscience does make cowards of us all,",
        "And thus the native hue of resolution",
        "Is sicklied o'er with the pale cast of thought,",
        "And enterprise of great pitch and moment",
        "With this regard their currents turn awry",
        "And lose the name of action. -- Soft you now,",
        "The fair Ophelia! -- Nymph, in thy orisons",
        "Be all my sins remembered.",
      }; // Hamlet Act 3, scene 1, 55–87

*/
