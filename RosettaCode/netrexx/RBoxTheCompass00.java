/* Generated from 'RBoxTheCompass00.nrx' 27 Jul 2011 11:15:15 [v3.00] */
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

public class RBoxTheCompass00{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("<h2>");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("</h2>\n");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("<caption>");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("<thead>\n");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("<tr>\n");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("</th><th>");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("</th>\n");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("</tr>\n");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("</thead>\n");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("<tbody>\n");
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(360);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(2);
 private static final char[] $013={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(0);
 private static final char[] $016={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx('|');
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx('(');
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx(')');
 private static final char[] $020={2,1,124,10,3,0,1,2,2,1,40,10,1,3,2,1,41,10,1,4,2,1,40,10,1,5,2,1,41,10,1,6,2,1,40,10,1,7,2,1,41,10,1,8,1,10,1,9,0};
 private static final netrexx.lang.Rexx $021=netrexx.lang.Rexx.toRexx("<tr>\n<td>");
 private static final netrexx.lang.Rexx $022=netrexx.lang.Rexx.toRexx("</td><td>");
 private static final netrexx.lang.Rexx $023=new netrexx.lang.Rexx("0.0");
 private static final netrexx.lang.Rexx $024=new netrexx.lang.Rexx("11.25");
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx("22.5");
 private static final char[] $026={2,1,124,10,3,0,1,2,2,1,40,10,1,3,2,1,41,10,1,4,1,10,1,5,0};
 private static final netrexx.lang.Rexx $027=netrexx.lang.Rexx.toRexx("</tbody>\n");
 private static final netrexx.lang.Rexx $028=netrexx.lang.Rexx.toRexx("</table>\n");
 private static final netrexx.lang.Rexx $029=new netrexx.lang.Rexx(32);
 private static final netrexx.lang.Rexx $030=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $031=new netrexx.lang.Rexx("5.62");
 private static final netrexx.lang.Rexx $032=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $033=new netrexx.lang.Rexx(60);
 private static final netrexx.lang.Rexx $034=new netrexx.lang.Rexx(100);
 private static final netrexx.lang.Rexx $035=new netrexx.lang.Rexx('\n');
 private static final netrexx.lang.Rexx $036=netrexx.lang.Rexx.toRexx("</title>");
 private static final netrexx.lang.Rexx $037=netrexx.lang.Rexx.toRexx("    <h1>");
 private static final netrexx.lang.Rexx $038=netrexx.lang.Rexx.toRexx("</h1>");
 private static final java.lang.String $0="RBoxTheCompass00.nrx";
 
 /* properties constant */
 protected static final netrexx.lang.Rexx _DEG=netrexx.lang.Rexx.toRexx("DEG");
 protected static final netrexx.lang.Rexx _MIN=netrexx.lang.Rexx.toRexx("MIN");
 protected static final netrexx.lang.Rexx _SEC=netrexx.lang.Rexx.toRexx("SEC");
 protected static final netrexx.lang.Rexx _FULL=netrexx.lang.Rexx.toRexx("FULL");
 
 /* properties private static */
 private static netrexx.lang.Rexx sign=netrexx.lang.Rexx.toRexx("");
 
 /* properties indirect */
 private netrexx.lang.Rexx headings=netrexx.lang.Rexx.toRexx("");
 private netrexx.lang.Rexx rosepoints=netrexx.lang.Rexx.toRexx("");

 
 /**
  * default construction
  */
 
 public RBoxTheCompass00(){super();
  
  setHeadings(makeHeadings());
  setRosepoints(makeRosepoints());
  
  return;
  }

 /**
  *
  */
 
 public static void main(java.lang.String args[]){
  RBoxTheCompass00 box;
  netrexx.lang.Rexx html;
  
  // sign[_DEG] = '¡'
  sign.getnode(_DEG).leaf=netrexx.lang.Rexx.toRexx("&deg;"); // '\u00b0'          -- '\xc2\xb0'     --  degree sign  : &deg;   - &#xb0;   - &#176;  : U+00B0
  sign.getnode(_MIN).leaf=netrexx.lang.Rexx.toRexx("&prime;"); // "'" -- '\u2032'   -- '\xe2\x80\xb2' --  prime        : &prime; - &#x2032; - &#8242; : U+2032
  sign.getnode(_SEC).leaf=netrexx.lang.Rexx.toRexx("&Prime;"); // '"' -- '\u2033'   -- '\xe2\x80\xb3' --  double prime : &Prime; - &#x2033; - &#8243; : U+2033
  
  box=new RBoxTheCompass00();
  
  html=netrexx.lang.Rexx.toRexx("");
  html=html.OpCc(null,pushHtml(box.getHtmlHeader()));
  html=html.OpCc(null,pushHtml(box.getHtmlHead(netrexx.lang.Rexx.toRexx("Box the Compass"))));
  html=html.OpCc(null,pushHtml(box.getHtmlBodyHeader(netrexx.lang.Rexx.toRexx("Box the Compass"))));
  html=html.OpCc(null,box.showTable1(netrexx.lang.Rexx.toRexx("Table of Compass Points")));
  html=html.OpCc(null,box.showTable2(netrexx.lang.Rexx.toRexx("Verification Test Sample")));
  html=html.OpCc(null,box.showTable3(netrexx.lang.Rexx.toRexx("RosettaCode &quot;Box the Compass&quot; Task Samples")));
  html=html.OpCc(null,pushHtml(box.getHtmlBodyFooter()));
  html=html.OpCc(null,pushHtml(box.getHtmlFooter()));
  netrexx.lang.RexxIO.Say(html);
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx showTable1(netrexx.lang.Rexx caption){
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx one_point;
  netrexx.lang.Rexx ad=null;
  netrexx.lang.Rexx am=null;
  netrexx.lang.Rexx as=null;
  netrexx.lang.Rexx h_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx hmin=null;
  netrexx.lang.Rexx hmax=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  netrexx.lang.Rexx tv=null;
  netrexx.lang.Rexx c1=null;
  netrexx.lang.Rexx c2=null;
  netrexx.lang.Rexx c3=null;
  netrexx.lang.Rexx c4=null;
  netrexx.lang.Rexx c5=null;
  netrexx.lang.Rexx c6=null;
  netrexx.lang.Rexx c7=null;
  netrexx.lang.Rexx c8=null;
  netrexx.lang.Rexx c9=null;
  
  points=new netrexx.lang.Rexx((byte)32);
  
  table=netrexx.lang.Rexx.toRexx("");
  table=((table.OpCc(null,$01)).OpCc(null,caption)).OpCc(null,$02);
  table=table.OpCc(null,netrexx.lang.Rexx.toRexx("<table class=\"ct0\">\n"));
  table=((table.OpCc(null,$03)).OpCc(null,caption)).OpCc(null,netrexx.lang.Rexx.toRexx("</caption>\n"));
  table=table.OpCc(null,$04);
  table=table.OpCc(null,$05);
  table=((((((((((((((((((table.OpCc(null,netrexx.lang.Rexx.toRexx("<th>Index</th><th>Compass Point</th><th>Abbr.</th><th>Lowest"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,sign.getnode(_MIN).leaf)).OpCcblank(null,sign.getnode(_SEC).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("</th><th>Middle"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,sign.getnode(_MIN).leaf)).OpCcblank(null,sign.getnode(_SEC).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("</th><th>Highest"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$06)).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,sign.getnode(_MIN).leaf)).OpCcblank(null,sign.getnode(_SEC).leaf)).OpCcblank(null,$07);
  table=table.OpCc(null,$08);
  table=table.OpCc(null,$09);
  table=table.OpCc(null,$010);
  
  one_point=$011.OpDiv(null,points);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(getDegreesMinutesSeconds(one_point.OpDiv(null,$012)),$013,$1);
  ad=$1[0];am=$1[1];as=$1[2];}
  {netrexx.lang.Rexx $2=points.OpSub(null,$014);h_=new netrexx.lang.Rexx((byte)0);h_:for(;h_.OpLtEq(null,$2);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=h_.OpMult(null,one_point);
   hmin=heading.OpSub(null,getDecimalAngle(ad,am,as));
   hmax=heading.OpAdd(null,getDecimalAngle(ad,as,as));
   
   if (hmin.OpLt(null,$015)) 
    {
     hmin=hmin.OpAdd(null,$011);
    }
   if (hmax.OpGtEq(null,$011)) 
    {
     hmax=hmax.OpSub(null,$011);
    }
   
   index=((h_.OpRem(null,points))).OpAdd(null,$014);
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getRosepoint(index),$016,$3);
   p_abbrev=$3[0];p_full=$3[1];}
   
   tv=((((((((((((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,$017)).OpCcblank(null,hmin.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$018)).OpCc(null,formatDegreesMinutesSeconds(hmin))).OpCc(null,$019)).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$018)).OpCc(null,formatDegreesMinutesSeconds(heading))).OpCc(null,$019)).OpCcblank(null,hmax.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$018)).OpCc(null,formatDegreesMinutesSeconds(hmax))).OpCc(null,$019);
   
   
   
   
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[10];
   netrexx.lang.RexxParse.parse(tv,$020,$4);
   c1=$4[0];c2=$4[1];c3=$4[2];c4=$4[3];c5=$4[4];c6=$4[5];c7=$4[6];c8=$4[7];c9=$4[8];}
   table=((((((((((((((((((table.OpCc(null,$021)).OpCc(null,c1.strip())).OpCc(null,$022)).OpCc(null,c3.strip())).OpCc(null,$022)).OpCc(null,c2.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c4.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c5.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c6.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c7.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c8.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c9.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td>\n</tr>\n"));
   }
  }/*h_*/
  table=table.OpCc(null,netrexx.lang.Rexx.toRexx("</tbody>\n</table>\n"));
  
  return table;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx showTable2(netrexx.lang.Rexx caption){
  netrexx.lang.Rexx Q_;
  netrexx.lang.Rexx Queue;
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  netrexx.lang.Rexx tv=null;
  netrexx.lang.Rexx c1=null;
  netrexx.lang.Rexx c2=null;
  netrexx.lang.Rexx c3=null;
  netrexx.lang.Rexx c4=null;
  netrexx.lang.Rexx c5=null;
  
  Q_=new netrexx.lang.Rexx((byte)0);
  Queue=netrexx.lang.Rexx.toRexx("");
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$011.OpAdd(null,$023);
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$011.OpAdd(null,$024);
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=$011.OpAdd(null,$025);
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("360.0");
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=getDecimalAngle(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)37),new netrexx.lang.Rexx((byte)30));
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("16.87");
  Q_=Q_.OpAdd(null,$014);
  Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf=Q_;
  Queue.getnode(Q_).leaf=new netrexx.lang.Rexx("16.88");
  
  table=netrexx.lang.Rexx.toRexx("");
  table=((table.OpCc(null,$01)).OpCc(null,caption)).OpCc(null,$02);
  table=table.OpCc(null,netrexx.lang.Rexx.toRexx("<table class=\"ct0\">\n"));
  table=((table.OpCc(null,$03)).OpCc(null,caption)).OpCc(null,netrexx.lang.Rexx.toRexx("</caption>\n"));
  table=table.OpCc(null,$04);
  table=table.OpCc(null,$05);
  table=((((((table.OpCc(null,netrexx.lang.Rexx.toRexx("<th>Index</th><th>Compass Point</th><th>Abbr.</th><th>Heading"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("</th><th>Heading"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,sign.getnode(_MIN).leaf)).OpCcblank(null,sign.getnode(_SEC).leaf)).OpCcblank(null,$07);
  table=table.OpCc(null,$08);
  table=table.OpCc(null,$09);
  table=table.OpCc(null,$010);
  {netrexx.lang.Rexx $5=Queue.getnode(new netrexx.lang.Rexx((byte)0)).leaf;Q_=new netrexx.lang.Rexx((byte)1);q_:for(;Q_.OpLtEq(null,$5);Q_=Q_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=Queue.getnode(Q_).leaf;
   index=getRosepointIndex(heading);
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getRosepoint(index),$016,$6);
   p_abbrev=$6[0];p_full=$6[1];}
   tv=((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,$017)).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$018)).OpCc(null,formatDegreesMinutesSeconds(heading))).OpCc(null,$019);
   
   
   {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[6];
   netrexx.lang.RexxParse.parse(tv,$026,$7);
   c1=$7[0];c2=$7[1];c3=$7[2];c4=$7[3];c5=$7[4];}
   table=((((((((((table.OpCc(null,$021)).OpCc(null,c1.strip())).OpCc(null,$022)).OpCc(null,c3.strip())).OpCc(null,$022)).OpCc(null,c2.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c4.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c5.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td>\n</tr>\n"));
   }
  }/*q_*/
  table=table.OpCc(null,netrexx.lang.Rexx.toRexx("</tbody>\n</table>\n"));
  
  return table;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx showTable3(netrexx.lang.Rexx caption){
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx h_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx index=null;
  netrexx.lang.Rexx p_abbrev=null;
  netrexx.lang.Rexx p_full=null;
  netrexx.lang.Rexx tv=null;
  netrexx.lang.Rexx c1=null;
  netrexx.lang.Rexx c2=null;
  netrexx.lang.Rexx c3=null;
  netrexx.lang.Rexx c4=null;
  netrexx.lang.Rexx c5=null;
  
  table=netrexx.lang.Rexx.toRexx("");
  table=((table.OpCc(null,$01)).OpCc(null,caption)).OpCc(null,$02);
  table=table.OpCc(null,netrexx.lang.Rexx.toRexx("<table class=\"ct0\">\n"));
  table=((table.OpCc(null,$03)).OpCc(null,caption)).OpCc(null,netrexx.lang.Rexx.toRexx("</caption>\n"));
  table=table.OpCc(null,$04);
  table=table.OpCc(null,$05);
  table=((((((table.OpCc(null,netrexx.lang.Rexx.toRexx("<th>Index</th><th>Compass Point</th><th>Abbr.</th><th>Heading"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,netrexx.lang.Rexx.toRexx("</th><th>Heading"))).OpCcblank(null,sign.getnode(_DEG).leaf)).OpCcblank(null,sign.getnode(_MIN).leaf)).OpCcblank(null,sign.getnode(_SEC).leaf)).OpCcblank(null,$07);
  table=table.OpCc(null,$08);
  table=table.OpCc(null,$09);
  table=table.OpCc(null,$010);
  {netrexx.lang.Rexx $8=headings.getnode(new netrexx.lang.Rexx((byte)0)).leaf;h_=new netrexx.lang.Rexx((byte)1);h_:for(;h_.OpLtEq(null,$8);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=headings.getnode(h_).leaf;
   index=getRosepointIndex(heading);
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getRosepoint(index),$016,$9);
   p_abbrev=$9[0];p_full=$9[1];}
   tv=((((((((index.right(new netrexx.lang.Rexx((byte)3))).OpCcblank(null,p_abbrev.left(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,p_full.left(new netrexx.lang.Rexx((byte)20)))).OpCcblank(null,$017)).OpCcblank(null,heading.format(new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)3)))).OpCc(null,sign.getnode(_DEG).leaf)).OpCcblank(null,$018)).OpCc(null,formatDegreesMinutesSeconds(heading))).OpCc(null,$019);
   
   
   
   {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[6];
   netrexx.lang.RexxParse.parse(tv,$026,$10);
   c1=$10[0];c2=$10[1];c3=$10[2];c4=$10[3];c5=$10[4];}
   table=((((((((((table.OpCc(null,$021)).OpCc(null,c1.strip())).OpCc(null,$022)).OpCc(null,c3.strip())).OpCc(null,$022)).OpCc(null,c2.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c4.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td><td class=\"c3\">"))).OpCc(null,c5.strip())).OpCc(null,netrexx.lang.Rexx.toRexx("</td>\n</tr>\n"));
   }
  }/*h_*/
  table=table.OpCc(null,$027);
  table=table.OpCc(null,$028);
  
  return table;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx makeHeadings(){
  netrexx.lang.Rexx hdg;
  netrexx.lang.Rexx points;
  netrexx.lang.Rexx one_point;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.Rexx heading=null;
  netrexx.lang.Rexx heading_h=null;
  netrexx.lang.Rexx ix=null;
  
  hdg=netrexx.lang.Rexx.toRexx("");
  hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  points=new netrexx.lang.Rexx((byte)32);
  one_point=$011.OpDiv(null,$029);
  {netrexx.lang.Rexx $11=points;i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$11);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   heading=i_.OpMult(null,one_point);
   
   {/*select*/netrexx.lang.Rexx $12=i_.OpRem(null,$030);
   if ($12.OpEqS(null,new netrexx.lang.Rexx((byte)1)))
    {
     heading_h=heading.OpAdd(null,$031);
    }
    
   else if ($12.OpEqS(null,new netrexx.lang.Rexx((byte)2)))
    {
     heading_h=heading.OpSub(null,$031);
    }
    
   else{
    {
     heading_h=heading;
    }
   }
   }
   
   ix=(hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$014);
   hdg.getnode(new netrexx.lang.Rexx((byte)0)).leaf=ix;
   hdg.getnode(ix).leaf=heading_h;
   }
  }/*i_*/
  
  return hdg;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx getRosepointIndex(netrexx.lang.Rexx heading){
  netrexx.lang.Rexx one_point;
  netrexx.lang.Rexx hn;
  netrexx.lang.Rexx hi;
  netrexx.lang.Rexx idx;
  
  one_point=$011.OpDiv(null,$029);
  hn=heading.OpRem(null,$011);
  hi=hn.OpDivI(null,one_point);
  
  if (hn.OpGt(null,hi.OpMult(null,one_point).OpAdd(null,one_point.OpDiv(null,$012)))) 
   {
    hi=hi.OpAdd(null,$014); // greater than max range for this point; bump to next point
   }
  
  idx=hi.OpRem(null,$029).OpAdd(null,$014); // add one to get index into rosepoints. stem
  
  return idx;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx getRosepoint(netrexx.lang.Rexx index){
  netrexx.lang.Rexx rp;
  
  rp=getRosepoints();
  return (rp.getnode(index).leaf).OpCcblank(null,rp.getnode(index).leaf.getnode(_FULL).leaf);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx makeRosepoints(){
  netrexx.lang.Rexx rp;
  netrexx.lang.Rexx p_;
  
  rp=netrexx.lang.Rexx.toRexx("");
  p_=new netrexx.lang.Rexx((byte)0);
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('N');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by East");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbn");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by North");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NEbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northeast by East");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ENE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Northeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by North");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('E');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("EbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East by South");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("ESE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("East-Southeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by East");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SEbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southeast by South");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southeast");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbE");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by East");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('S');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South by West");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SSW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("South-Southwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by South");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("SWbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest by West");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WSW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Southwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbS");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by South");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=new netrexx.lang.Rexx('W');
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West by North");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("WNW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("West-Northwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by West");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NWbN");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("Northwest by North");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NNW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North-Northwest");
  p_=p_.OpAdd(null,$014);
  rp.getnode(new netrexx.lang.Rexx((byte)0)).leaf=p_;
  rp.getnode(p_).leaf=netrexx.lang.Rexx.toRexx("NbW");
  rp.getnode(p_).leaf.getnode(_FULL).leaf=netrexx.lang.Rexx.toRexx("North by West");
  
  return rp;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  * Decimal degrees = whole number of degrees, plus minutes divided by 60, plus seconds divided by 3600
  */
 
 public static netrexx.lang.Rexx getDecimalAngle(netrexx.lang.Rexx degrees,netrexx.lang.Rexx minutes,netrexx.lang.Rexx seconds){
  netrexx.lang.Rexx angle;
  
  degrees=degrees.OpMult(null,$032).OpDivI(null,$032);
  minutes=minutes.OpMult(null,$032).OpDivI(null,$032);
  angle=degrees.OpAdd(null,(minutes.OpDiv(null,$033).OpAdd(null,(seconds.OpDiv(null,$033).OpDiv(null,$033)))));
  
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
  
  degrees=angle.OpMult(null,$034).OpDivI(null,$034);
  minutes=((((angle.OpSub(null,degrees))).OpMult(null,$033))).OpMult(null,$034).OpDivI(null,$034);
  seconds=((((((((angle.OpSub(null,degrees))).OpMult(null,$033))).OpSub(null,minutes))).OpMult(null,$033))).OpMult(null,$034).OpDivI(null,$034);
  
  return (degrees.OpCcblank(null,minutes)).OpCcblank(null,seconds);
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx formatDegreesMinutesSeconds(netrexx.lang.Rexx angle){
  netrexx.lang.Rexx degrees=null;
  netrexx.lang.Rexx minutes=null;
  netrexx.lang.Rexx seconds=null;
  netrexx.lang.Rexx formatted;
  
  {netrexx.lang.Rexx $13[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(getDegreesMinutesSeconds(angle),$013,$13);
  degrees=$13[0];minutes=$13[1];seconds=$13[2];}
  
  formatted=(((((degrees.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,sign.getnode(_DEG).leaf)).OpCc(null,minutes.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,sign.getnode(_MIN).leaf)).OpCc(null,seconds.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCc(null,sign.getnode(_SEC).leaf);
  
  return formatted;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private static netrexx.lang.Rexx pushHtml(netrexx.lang.Rexx html[]){
  netrexx.lang.Rexx htmlstring;
  netrexx.lang.Rexx h_=null;
  
  htmlstring=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $14=new netrexx.lang.Rexx(html.length).OpSub(null,$014);h_=new netrexx.lang.Rexx((byte)0);h_:for(;h_.OpLtEq(null,$14);h_=h_.OpAdd(null,new netrexx.lang.Rexx(1))){
   htmlstring=(htmlstring.OpCc(null,html[h_.toint()])).OpCcblank(null,$035);
   }
  }/*h_*/
  
  return htmlstring;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx[] getHtmlHeader(){
  netrexx.lang.Rexx html[]=null;
  
  
  html=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("<?xml version=\"1.1\" encoding=\"iso-8859-1\"?>"),netrexx.lang.Rexx.toRexx("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\""),netrexx.lang.Rexx.toRexx("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"),netrexx.lang.Rexx.toRexx("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">")};
  
  
  
  
  
  
  return html;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx[] getHtmlFooter(){
  netrexx.lang.Rexx html[]=null;
  
  
  html=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("</html>")};
  
  return html;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx[] getHtmlHead(netrexx.lang.Rexx title){
  netrexx.lang.Rexx html[]=null;
  
  
  html=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("  <head>"),(netrexx.lang.Rexx.toRexx("    <title>").OpCc(null,title)).OpCc(null,$036),netrexx.lang.Rexx.toRexx("    <meta name=\"author\"    content=\"Alan Sampson - alansamps@gmail.com\" />"),netrexx.lang.Rexx.toRexx("    <meta name=\"revised\"   content=\"Alan Sampson - alansamps@gmail.com,2011-07-26\" />"),netrexx.lang.Rexx.toRexx("    <meta name=\"copyright\" content=\"Alan Sampson 2011\" />"),netrexx.lang.Rexx.toRexx("    <meta name=\"generator\" content=\"NetRexx\" />"),netrexx.lang.Rexx.toRexx("    <meta name=\"keywords\"  content=\"HTML, DHTML, XML, XHTML, CSS, JavaScript\" />"),netrexx.lang.Rexx.toRexx("    <meta http-equiv=\"expires\" content=\"Fri, 01 Jan 2011 00:00:01 GMT\" />"),netrexx.lang.Rexx.toRexx("    <link rel=\"SHORTCUT ICON\" href=\"./images/favicon.ico\"/>"),netrexx.lang.Rexx.toRexx("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/default.css\" />"),netrexx.lang.Rexx.toRexx("		<script src=\"includes/createDate.js\" type=\"text/javascript\"></script>"),netrexx.lang.Rexx.toRexx("    <script language=\"javascript\" type=\"text/javascript\">"),netrexx.lang.Rexx.toRexx("      //<![CDATA["),netrexx.lang.Rexx.toRexx("      if (document.all) {"),netrexx.lang.Rexx.toRexx("        document.createStyleSheet(\"./css/default.css\");"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx("      //]]>"),netrexx.lang.Rexx.toRexx("    </script>"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("    <style type=\"text/css\">"),netrexx.lang.Rexx.toRexx("      /*<![CDATA[*/"),netrexx.lang.Rexx.toRexx("      body {"),netrexx.lang.Rexx.toRexx("        font-family:   \"Geneva\", \"Verdana\", \"Helvetica Neue\", \"Helvetica\", \"DejaVu Sans\", \"Tahoma\", \"Trebuchet MS\", \"Arial\", \"FreeSans\", sans-serif;"),netrexx.lang.Rexx.toRexx("        margin-top:    3.0em;"),netrexx.lang.Rexx.toRexx("        margin-bottom: 2.0em;"),netrexx.lang.Rexx.toRexx("        margin-left:   5.0em;"),netrexx.lang.Rexx.toRexx("        margin-right:  3.0em;"),netrexx.lang.Rexx.toRexx("        padding:       0.2em;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      table.ct0 {"),netrexx.lang.Rexx.toRexx("        border-collapse: collapse;"),netrexx.lang.Rexx.toRexx("        border-width:    0.1em;"),netrexx.lang.Rexx.toRexx("        padding:         0.2em;"),netrexx.lang.Rexx.toRexx("        font-family:     \"Monaco\", \"Menlo\", \"Lucida Console\", \"DejaVu Sans Mono\", \"Andale Mono\", \"Courier New\", \"Courier\", \"FreeMono\", monospace;"),netrexx.lang.Rexx.toRexx("        font-size:       smaller;"),netrexx.lang.Rexx.toRexx("        color:           green;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      .body {"),netrexx.lang.Rexx.toRexx("        font-family: \"Geneva\", \"Verdana\", \"Helvetica Neue\", \"Helvetica\", \"DejaVu Sans\", \"Tahoma\", \"Tebuchet MS\", \"Arial\", \"FreeSans\", sans-serif;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      .code {"),netrexx.lang.Rexx.toRexx("        font-family: \"Monaco\", \"Menlo\", \"Lucida Console\", \"DejaVu Sans Mono\", \"Andale Mono\", \"Courier New\", \"Courier\", \"FreeMono\", monospace;"),netrexx.lang.Rexx.toRexx("        font-size:   smaller;"),netrexx.lang.Rexx.toRexx("        color:       green;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      .print {"),netrexx.lang.Rexx.toRexx("        font-family: \"Georgia\", \"Baskerville\", \"Hoefler Text\", \"Didot\", \"Palatino\", \"Garamond\", \"DejaVu Serif\", \"Times New Roman\", \"Times\", \"FreeSerif\", serif;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      .fancy {"),netrexx.lang.Rexx.toRexx("        font-family: \"Papyrus\", \"Marker Felt\", \"Herculanum\", \"Capitals\", \"Copperplate\", \"Haettenschweiler\", \"Snap ITC\", \"Impact\", fantasy;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      .script {"),netrexx.lang.Rexx.toRexx("        font-family: \"Apple Chancery\", \"Zapfino\", \"Apple Casual\", \"Casual\", \"Monotype Corsiva\", \"Brush Script MT\", \"Comic Sans MS\", cursive;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      body.c0 {"),netrexx.lang.Rexx.toRexx("        margin-top:    0.0em;"),netrexx.lang.Rexx.toRexx("				margin-bottom: 0.0em;"),netrexx.lang.Rexx.toRexx("				margin-left:   0.0em;"),netrexx.lang.Rexx.toRexx("				margin-right:  0.0em;"),netrexx.lang.Rexx.toRexx("        padding:       0.0em;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      td, th {"),netrexx.lang.Rexx.toRexx("				padding-top:    inherit;"),netrexx.lang.Rexx.toRexx("				padding-left:   inherit;"),netrexx.lang.Rexx.toRexx("				badding-bottom: inherit;"),netrexx.lang.Rexx.toRexx("				padding-right:  2.0em !important;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("			th.thc0 {"),netrexx.lang.Rexx.toRexx("				text-align: left;"),netrexx.lang.Rexx.toRexx("				font-size:  120%;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("			th.thc1 {"),netrexx.lang.Rexx.toRexx("				text-align: left;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("			th.thc2 {"),netrexx.lang.Rexx.toRexx("				text-align: left;"),netrexx.lang.Rexx.toRexx("				font-size:  85%;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      td.c1 {"),netrexx.lang.Rexx.toRexx("        background-color: #999999;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      td.c2 {"),netrexx.lang.Rexx.toRexx("        font-size: 0.6em;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      td.c3 {"),netrexx.lang.Rexx.toRexx("        text-align: right;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      b.c3 {"),netrexx.lang.Rexx.toRexx("        font-size: 1.3em;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      div.c4 {"),netrexx.lang.Rexx.toRexx("        margin:  2px;"),netrexx.lang.Rexx.toRexx("        padding: 2px;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx("			h3.c5 {"),netrexx.lang.Rexx.toRexx("				font-style: italic;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx("			div.c6 {"),netrexx.lang.Rexx.toRexx("				margin-top:    0.0em;"),netrexx.lang.Rexx.toRexx("				margin-bottom: 0.0em;"),netrexx.lang.Rexx.toRexx("				margin-left:   2.0em;"),netrexx.lang.Rexx.toRexx("				margin-right:  0.0em;"),netrexx.lang.Rexx.toRexx("				padding:       0.0em;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      #body {"),netrexx.lang.Rexx.toRexx("        font-family: \"Verdana\", \"Tahoma\", \"Helvetica\", \"Swiss\", sans-serif;"),netrexx.lang.Rexx.toRexx("        font-size:   smaller;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      #code {"),netrexx.lang.Rexx.toRexx("        font-family: \"Lucida Console\", \"Courier New\", \"Courier\";"),netrexx.lang.Rexx.toRexx("        font-size:   smaller;"),netrexx.lang.Rexx.toRexx("        color:       green;"),netrexx.lang.Rexx.toRexx("      }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("			a {"),netrexx.lang.Rexx.toRexx("				text-decoration: none;"),netrexx.lang.Rexx.toRexx("				font-size:       85%;"),netrexx.lang.Rexx.toRexx("			}"),netrexx.lang.Rexx.toRexx("			a:link    { color: #480082; /*indigo*/ }"),netrexx.lang.Rexx.toRexx("			a:visited { color: #6a5acd; /*SlateBlue*/ }"),netrexx.lang.Rexx.toRexx("			a:hover   { color: #dda520; /*goldenrod*/ }"),netrexx.lang.Rexx.toRexx("			a:acrive  { color: #ff0000; /*red*/ }"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("      /*]]>*/"),netrexx.lang.Rexx.toRexx("    </style>"),netrexx.lang.Rexx.toRexx("  </head>")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return html;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx[] getHtmlBodyHeader(netrexx.lang.Rexx title){
  netrexx.lang.Rexx html[]=null;
  
  
  html=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("  <body>"),($037.OpCc(null,title)).OpCc(null,$038)};
  
  
  
  return html;
  }

 /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 /**
  *
  */
 
 private netrexx.lang.Rexx[] getHtmlBodyFooter(){
  netrexx.lang.Rexx html[]=null;
  
  
  html=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("  </body>")};
  
  return html;
  }
 
 public netrexx.lang.Rexx getHeadings(){return headings;}
 
 public void setHeadings(netrexx.lang.Rexx $15){headings=$15;return;}
 
 public netrexx.lang.Rexx getRosepoints(){return rosepoints;}
 
 public void setRosepoints(netrexx.lang.Rexx $16){rosepoints=$16;return;}
 }
