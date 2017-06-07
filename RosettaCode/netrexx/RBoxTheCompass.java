/* Generated from 'RBoxTheCompass.nrx' 27 Jul 2011 11:15:15 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/**
 * <h3>Boxing the compass</h3>
 * <p>
 * Avast me hearties!
 * </p>
 * <p>
 * There be many a <a href="http://www.talklikeapirate.com/howto.html">land lubber</a> that knows naught of
 * the pirate ways and gives direction by degree! They know not how to
 * <a href="http://en.wikipedia.org/wiki/Boxing_the_compass">box the compass</a>!
 * </p>
 * <h4>Task description</h4>
 * <ol>
 * <li>
 * Create a function that takes a heading in degrees and returns the correct 32-point compass heading.
 * </li>
 * <li>
 * Use the function to print and display a table of Index, Compass point, and Degree; rather like the corresponding
 * columns from, the first table of the <a href="http://en.wikipedia.org/wiki/Boxing_the_compass">wikipedia article</a>,
 * but use only the following 33 headings as input:
 * <br />
 * <code>[0.0, 16.87, 16.88, 33.75, 50.62, 50.63, 67.5, 84.37, 84.38, 101.25, 118.12, 118.13, 135.0, 151.87, 151.88,
 * 168.75, 185.62, 185.63, 202.5, 219.37, 219.38, 236.25, 253.12, 253.13, 270.0, 286.87, 286.88, 303.75, 320.62, 320.63,
 * 337.5, 354.37, 354.38]</code>.
 * (They should give the same order of points but are spread throughout the ranges of acceptance)
 * </li>
 * </ol>
 * <h4>Note</h4>
 * <ul>
 * The headings and indices can be calculated from this pseudocode:
 * <pre>
 * for i in 0..32 inclusive:
 *     heading = i * 11.25
 *     case i %3:
 *       if 1: heading += 5.62; break
 *       if 2: heading -= 5.62; break
 *     end
 *     index = ( i mod 32) + 1
 * </pre>
 * <li>
 * </li>
 * </ul>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://www.fileformat.info/info/unicode/">www.fileformat.info/info/unicode/</a>
 * @see <a href="http://en.wikipedia.org/wiki/List_of_Unicode_characters">en.wikipedia.org/wiki/List_of_Unicode_characters</a>
 */

public class RBoxTheCompass{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("Idx");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("Abbr");
 private static final char[] $07={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(360);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(32);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx("5.62");
 private static final char[] $013={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RBoxTheCompass.nrx";
 
 /* properties public constant */
 public static final netrexx.lang.Rexx _FULL=netrexx.lang.Rexx.toRexx("_FULL");
 
 /* properties indirect */
 private netrexx.lang.Rexx headings;
 private netrexx.lang.Rexx rosepoints;

 
 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * Default construction
  */
 
 public RBoxTheCompass(){super();
  
  setHeadings(makeHeadings());
  setRosepoints(makeRosepoints());
  
  return;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @param args
  */
 
 public static void main(java.lang.String args[]){
  RBoxTheCompass box;
  netrexx.lang.Rexx cp;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx hx;
  
  box=new RBoxTheCompass();
  
  cp=box.getCompassPoints();
  {netrexx.lang.Rexx $1=cp.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$1);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(cp.getnode(r_).leaf);
   }
  }/*r_*/
  netrexx.lang.RexxIO.Say("");
  
  hx=box.getHeadingsReport(box.getHeadings());
  {netrexx.lang.Rexx $2=hx.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$2);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(hx.getnode(r_).leaf);
   }
  }/*r_*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * Decimal degrees = whole number of degrees, plus minutes divided by 60, plus seconds divided by 3600
  */
 
 public static netrexx.lang.Rexx getDecimalAngle(netrexx.lang.Rexx degrees,netrexx.lang.Rexx minutes,netrexx.lang.Rexx seconds){
  netrexx.lang.Rexx angle;
  
  degrees=degrees.OpMult(null,$01).OpDivI(null,$01);
  minutes=minutes.OpMult(null,$01).OpDivI(null,$01);
  angle=degrees.OpAdd(null,(minutes.OpDiv(null,$02).OpAdd(null,(seconds.OpDiv(null,$02).OpDiv(null,$02)))));
  
  return angle;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /* http://en.wikipedia.org/wiki/Minute_of_arc                                 */
 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 public static netrexx.lang.Rexx getDegreesMinutesSeconds(netrexx.lang.Rexx angle){
  netrexx.lang.Rexx degrees;
  netrexx.lang.Rexx minutes;
  netrexx.lang.Rexx seconds;
  
  degrees=angle.OpMult(null,$03).OpDivI(null,$03);
  minutes=((((angle.OpSub(null,degrees))).OpMult(null,$02))).OpMult(null,$03).OpDivI(null,$03);
  seconds=((((((((angle.OpSub(null,degrees))).OpMult(null,$02))).OpSub(null,minutes))).OpMult(null,$02))).OpMult(null,$03).OpDivI(null,$03);
  
  return (degrees.OpCcblank(null,minutes)).OpCcblank(null,seconds);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @param headings as an indexed stirng
  * @return table of headings as an indexed string
  */
 
 public netrexx.lang.Rexx getHeadingsReport(netrexx.lang.Rexx bearings){
  netrexx.lang.Rexx r_;
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx h_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  
  r_=new netrexx.lang.Rexx((byte)0);
  table=netrexx.lang.Rexx.toRexx("");
  r_=r_.OpAdd(null,$04);
  table.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
  table.getnode(r_).leaf=(($05.OpCcblank(null,$06)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Compass Point").left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Degrees").right(new netrexx.lang.Rexx((byte)10)));
  
  
  
  
  {netrexx.lang.Rexx $3=bearings.getnode(new netrexx.lang.Rexx((byte)0)).leaf;h_=new netrexx.lang.Rexx((byte)1);h_:for(;h_.OpLtEq(null,$3);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=bearings.getnode(h_).leaf;
   index=getRosepointIndex(heading);
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getRosepoint(index),$07,$4);
   p_abbrev=$4[0];p_full=$4[1];}
   
   r_=r_.OpAdd(null,$04);
   table.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
   table.getnode(r_).leaf=(((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)).right(new netrexx.lang.Rexx((byte)10)));
   
   
   
   }
  }/*h_*/
  
  return table;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @param heading
  * @return index into compase rose array (1 - 32)
  */
 
 public netrexx.lang.Rexx getRosepointIndex(netrexx.lang.Rexx heading){
  netrexx.lang.Rexx one_pt;
  netrexx.lang.Rexx hn;
  netrexx.lang.Rexx hi;
  netrexx.lang.Rexx idx;
  
  one_pt=$08.OpDiv(null,$09);
  hn=heading.OpRem(null,$08);
  hi=hn.OpDivI(null,one_pt);
  
  if (hn.OpGt(null,hi.OpMult(null,one_pt).OpAdd(null,one_pt.OpDiv(null,$010)))) 
   {
    hi=hi.OpAdd(null,$04); // greater than max range for this point; bump to next point
   }
  
  idx=hi.OpRem(null,$09).OpAdd(null,$04); // add one to get index into rosepoints indexed string
  
  return idx;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @param index
  * @return readable short and long names of compass points
  */
 
 public netrexx.lang.Rexx getRosepoint(netrexx.lang.Rexx index){
  netrexx.lang.Rexx rp;
  
  rp=getRosepoints();
  return (rp.getnode(index).leaf).OpCcblank(null,rp.getnode(index).leaf.getnode(_FULL).leaf);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @return an indexed array of compass rose points
  */
 
 private netrexx.lang.Rexx makeRosepoints(){
  netrexx.lang.Rexx p_;
  netrexx.lang.Rexx rp;
  
  p_=new netrexx.lang.Rexx((byte)0);
  rp=netrexx.lang.Rexx.toRexx("");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('N');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by East");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbn");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by North");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by East");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ENE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Northeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by North");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('E');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by South");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ESE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Southeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by East");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by South");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southeast");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by East");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('S');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by West");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by South");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by West");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WSW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by South");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('W');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by North");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WNW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West-Northwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by West");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by North");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northwest");
  p_=p_.OpAdd(null,$04);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by West");
  
  return rp;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @return 
  */
 
 private netrexx.lang.Rexx makeHeadings(){
  netrexx.lang.Rexx hdg;
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx heading_h=null;
  netrexx.lang.Rexx ix=null;
  
  hdg=netrexx.lang.Rexx.toRexx("");
  hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  points=new netrexx.lang.Rexx((byte)32);
  {netrexx.lang.Rexx $5=points;i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$5);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=i_.OpMult(null,$08).OpDiv(null,points);
   
   {/*select*/netrexx.lang.Rexx $6=i_.OpRem(null,$011);
   if ($6.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
    heading_h=heading.OpAdd(null,$012);
   else if ($6.OpEqS(null,new netrexx.lang.Rexx((byte)2)))
    heading_h=heading.OpSub(null,$012);
   else{
    heading_h=heading;
   }
   }
   
   ix=(hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$04);
   hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
   hdg.getnode(ix).leaf=heading_h;
   }
  }/*i_*/
  
  return hdg;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * @return table of compass points as an indexed string
  */
 
 public netrexx.lang.Rexx getCompassPoints(){
  netrexx.lang.Rexx r_;
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx one_pt;
  netrexx.lang.Rexx ad=null;
  netrexx.lang.Rexx am=null;
  netrexx.lang.Rexx as=null;
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx h_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx hmin=null;
  netrexx.lang.Rexx hmax=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  
  r_=new netrexx.lang.Rexx((byte)0);
  table=netrexx.lang.Rexx.toRexx("");
  r_=r_.OpAdd(null,$04);
  table.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
  table.getnode(r_).leaf=(((($05.OpCcblank(null,$06)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Compass Point").left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Low (Deg.)").right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Mid (Deg.)").right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Hi (Deg.)").right(new netrexx.lang.Rexx((byte)10)));
  
  
  
  
  
  
  // one point of the compass is 360 / 32 (11.25) degrees
  // using functions to calculate this just for fun
  one_pt=$08.OpDiv(null,$09);
  {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(getDegreesMinutesSeconds(one_pt.OpDiv(null,$010)),$013,$7);
  ad=$7[0];am=$7[1];as=$7[2];}
  points=new netrexx.lang.Rexx((byte)32);
  {netrexx.lang.Rexx $8=points.OpSub(null,$04);h_=new netrexx.lang.Rexx((byte)0);h_:for(;h_.OpLtEq(null,$8);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=h_.OpMult(null,$08).OpDiv(null,points);
   hmin=heading.OpSub(null,getDecimalAngle(ad,am,as));
   hmax=heading.OpAdd(null,getDecimalAngle(ad,am,as));
   
   if (hmin.OpLt(null,$014)) 
    {
     hmin=hmin.OpAdd(null,$08);
    }
   if (hmax.OpGtEq(null,$08)) 
    {
     hmax=hmax.OpSub(null,$08);
    }
   
   index=getRosepointIndex(heading);
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getRosepoint(index),$07,$9);
   p_abbrev=$9[0];p_full=$9[1];}
   r_=r_.OpAdd(null,$04);
   table.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
   table.getnode(r_).leaf=(((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,hmin.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)).right(new netrexx.lang.Rexx((byte)10)))).OpCcblank(null,hmax.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)).right(new netrexx.lang.Rexx((byte)10)));
   
   
   
   
   
   }
  }/*h_*/
  
  return table;
  }
 
 public netrexx.lang.Rexx getHeadings(){return headings;}
 
 public void setHeadings(netrexx.lang.Rexx $10){headings=$10;return;}
 
 public netrexx.lang.Rexx getRosepoints(){return rosepoints;}
 
 public void setRosepoints(netrexx.lang.Rexx $11){rosepoints=$11;return;}
 }
