/* Generated from 'RBoxTheCompass01.nrx' 26 Jul 2011 16:19:25 [v3.00] */
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

public class RBoxTheCompass01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(360);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("5.62");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final char[] $05={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('(');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(')');
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx("0.0");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx("11.25");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx("22.5");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(32);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(60);
 private static final char[] $017={1,10,4,0,1,2,3,0};
 private static final java.lang.String $0="RBoxTheCompass01.nrx";
 
 /* properties constant */
 protected static final netrexx.lang.Rexx _DEG=netrexx.lang.Rexx.toRexx("_DEG");
 protected static final netrexx.lang.Rexx _MIN=netrexx.lang.Rexx.toRexx("_MIN");
 protected static final netrexx.lang.Rexx _SEC=netrexx.lang.Rexx.toRexx("_SEC");
 protected static final netrexx.lang.Rexx _FULL=netrexx.lang.Rexx.toRexx("_FULL");
 
 /* properties private static */
 private static netrexx.lang.Rexx sign=netrexx.lang.Rexx.toRexx("");
 
 private static netrexx.lang.Rexx headings=netrexx.lang.Rexx.toRexx("");
 
 private static netrexx.lang.Rexx rosepoints=netrexx.lang.Rexx.toRexx("");

 
 /**
  *
  */
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx h_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx hmin=null;
  netrexx.lang.Rexx hmax=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  netrexx.lang.Rexx Q_;
  netrexx.lang.Rexx Queue;
  
  // sign[_DEG] = '¡'
  sign.getnode(_DEG).leaf=new netrexx.lang.Rexx('\u00b0'); // '\xc2\xb0'     --  degree sign  : &deg;   - &#xb0;   - &#176;  : U+00B0
  sign.getnode(_MIN).leaf=new netrexx.lang.Rexx('\''); // '\u2032'   -- '\xe2\x80\xb2' --  prime        : &prime; - &#x2032; - &#8242; : U+2032
  sign.getnode(_SEC).leaf=new netrexx.lang.Rexx('\"'); // '\u2033'   -- '\xe2\x80\xb3' --  double prime : &Prime; - &#x2033; - &#8243; : U+2033
  
  headings.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  make_headings();
  
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  rosepoints=get_points();
  
  points=new netrexx.lang.Rexx((byte)32);
  {netrexx.lang.Rexx $1=points.OpSub(null,$01);h_=new netrexx.lang.Rexx((byte)0);h_:for(;h_.OpLtEq(null,$1);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=h_.OpMult(null,$02).OpDiv(null,points);
   hmin=heading.OpSub(null,$03);
   hmax=heading.OpAdd(null,$03);
   
   if (hmin.OpLt(null,$04)) 
    {
     hmin=hmin.OpAdd(null,$02);
    }
   if (hmax.OpGtEq(null,$02)) 
    {
     hmax=hmax.OpSub(null,$02);
    }
   
   index=((h_.OpRem(null,points))).OpAdd(null,$01);
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(get_point(index),$05,$2);
   p_abbrev=$2[0];p_full=$2[1];}
   
   netrexx.lang.RexxIO.Say(((((((((((((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,hmin.format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCc(null,format_mins_of_arc(hmin))).OpCc(null,$07)).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCc(null,format_mins_of_arc(heading))).OpCc(null,$07)).OpCcblank(null,hmax.format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCc(null,format_mins_of_arc(hmax))).OpCc(null,$07)).OpCcblank(null,$08));
   
   
   
   
   
   }
  }/*h_*/
  
  netrexx.lang.RexxIO.Say("");
  
  Q_=new netrexx.lang.Rexx((byte)0);
  Queue=netrexx.lang.Rexx.toRexx("");
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$02.OpAdd(null,$09);
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$02.OpAdd(null,$010);
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$02.OpAdd(null,$011);
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("360.0");
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("16.87");
  Q_=Q_.OpAdd(null,$01);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("16.88");
  
  {netrexx.lang.Rexx $3=Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf;Q_=new netrexx.lang.Rexx((byte)1);q_:for(;Q_.OpLtEq(null,$3);Q_=Q_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=Queue.getnode(Q_).leaf;
   index=get_index(heading);
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(get_point(index),$05,$4);
   p_abbrev=$4[0];p_full=$4[1];}
   netrexx.lang.RexxIO.Say(((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCc(null,format_mins_of_arc(heading))).OpCc(null,$07)).OpCcblank(null,$08));
   
   
   
   }
  }/*q_*/
  
  netrexx.lang.RexxIO.Say("");
  {netrexx.lang.Rexx $5=headings.getnode(new netrexx.lang.Rexx((byte)0)).leaf;h_=new netrexx.lang.Rexx((byte)1);h_:for(;h_.OpLtEq(null,$5);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=headings.getnode(h_).leaf;
   index=get_index(heading);
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(get_point(index),$05,$6);
   p_abbrev=$6[0];p_full=$6[1];}
   netrexx.lang.RexxIO.Say(((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)2)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCc(null,format_mins_of_arc(heading))).OpCc(null,$07)).OpCcblank(null,$08));
   
   
   
   }
  }/*h_*/
  
  return;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static void make_headings(){
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx it=null;
  netrexx.lang.Rexx heading_h=null;
  netrexx.lang.Rexx ix=null;
  
  points=new netrexx.lang.Rexx((byte)32);
  {netrexx.lang.Rexx $7=points;i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$7);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=i_.OpMult(null,$02).OpDiv(null,$012);
   
   it=i_.OpRem(null,$013);
   {/*select*/
   if (it.OpEq(null,$01))
    {
     heading_h=heading.OpAdd(null,$03);
    }
    
   else if (it.OpEq(null,$014))
    {
     heading_h=heading.OpSub(null,$03);
    }
    
   else{
    {
     heading_h=heading;
    }
   }
   }
   
   ix=(headings.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$01);
   headings.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
   headings.getnode(ix).leaf=heading_h;
   }
  }/*i_*/
  
  return;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx get_index(netrexx.lang.Rexx heading){
  netrexx.lang.Rexx one_pt;
  netrexx.lang.Rexx hn;
  netrexx.lang.Rexx hi;
  netrexx.lang.Rexx idx;
  
  one_pt=$02.OpDiv(null,$012);
  hn=heading.OpRem(null,$02);
  hi=hn.OpDivI(null,one_pt);
  
  if (hn.OpGt(null,hi.OpMult(null,one_pt).OpAdd(null,$03))) 
   {
    hi=hi.OpAdd(null,$01); // greater than max range for this point; bump to next point
   }
  
  idx=hi.OpRem(null,$012).OpAdd(null,$01); // add one to get index into rosepoints. stem
  
  return idx;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx get_point(netrexx.lang.Rexx index){
  
  return (rosepoints.getnode(index).leaf).OpCcblank(null,rosepoints.getnode(index).leaf.getnode(_FULL).leaf);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx get_points(){
  netrexx.lang.Rexx p_;
  
  p_=new netrexx.lang.Rexx((byte)0);
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=new netrexx.lang.Rexx('N');
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by East");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbn");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by North");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by East");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ENE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Northeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbN");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by North");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=new netrexx.lang.Rexx('E');
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbS");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by South");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ESE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Southeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by East");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbS");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by South");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southeast");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbE");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by East");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=new netrexx.lang.Rexx('S');
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by West");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbS");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by South");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by West");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WSW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbS");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by South");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=new netrexx.lang.Rexx('W');
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbN");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by North");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WNW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West-Northwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by West");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbN");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by North");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northwest");
  p_=p_.OpAdd(null,$01);
  rosepoints.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rosepoints.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbW");
  rosepoints.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by West");
  
  return rosepoints;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /* http://en.wikipedia.org/wiki/Minute_of_arc                                 */
 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx mins_of_arc(netrexx.lang.Rexx angle){
  netrexx.lang.Rexx degrees;
  netrexx.lang.Rexx minutes;
  netrexx.lang.Rexx seconds;
  
  degrees=angle.OpMult(null,$015).OpDivI(null,$015);
  minutes=((((angle.OpSub(null,degrees))).OpMult(null,$016))).OpMult(null,$015).OpDivI(null,$015);
  seconds=((((((((angle.OpSub(null,degrees))).OpMult(null,$016))).OpSub(null,minutes))).OpMult(null,$016))).OpMult(null,$015).OpDivI(null,$015);
  
  return (degrees.OpCcblank(null,minutes)).OpCcblank(null,seconds);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx format_mins_of_arc(netrexx.lang.Rexx angle){
  netrexx.lang.Rexx degrees=null;
  netrexx.lang.Rexx minutes=null;
  netrexx.lang.Rexx seconds=null;
  netrexx.lang.Rexx formatted;
  
  {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(mins_of_arc(angle),$017,$8);
  degrees=$8[0];minutes=$8[1];seconds=$8[2];}
  
  formatted=(((((degrees.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,sign.getnode(_DEG).leaf)).OpCc(null,minutes.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,sign.getnode(_MIN).leaf)).OpCc(null,seconds.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,sign.getnode(_SEC).leaf);
  
  return formatted;
  }
 
 private RBoxTheCompass01(){return;}
 }
