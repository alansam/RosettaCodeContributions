/* Generated from 'RCreateHTMLTable.nrx' 27 Dec 2012 10:25:39 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// create some test data.  Put the data in a Rexx indexed string

public class RCreateHTMLTable{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)5);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("<head>\n");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("<!--\n");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("}\n");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("/* ]] */\n");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("//-->\n");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("</style>\n");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("</head>\n");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("<body>\n");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("</body>\n");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("</html>\n");
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("<caption>");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("<thead>\n");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx('\n');
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("</thead>\n");
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("<tbody>\n");
 private static final netrexx.lang.Rexx $020=netrexx.lang.Rexx.toRexx("</tbody>\n");
 private static final netrexx.lang.Rexx $021=netrexx.lang.Rexx.toRexx("</table>\n");
 private static final char[] $022={6,1,10,1,0,1,10,1,2,0};
 private static final netrexx.lang.Rexx $023=netrexx.lang.Rexx.toRexx("<tr>\n");
 private static final netrexx.lang.Rexx $024=new netrexx.lang.Rexx('<');
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $026=netrexx.lang.Rexx.toRexx("</");
 private static final netrexx.lang.Rexx $027=netrexx.lang.Rexx.toRexx(">\n");
 private static final netrexx.lang.Rexx $028=netrexx.lang.Rexx.toRexx("</tr>\n");
 private static final java.lang.String $0="RCreateHTMLTable.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx maxI;
  java.util.Random rng;
  netrexx.lang.Rexx xyz;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx ra=null;
  netrexx.lang.Rexx html;
  maxI=new netrexx.lang.Rexx((short)1000);
  rng=new java.util.Random();
  xyz=netrexx.lang.Rexx.toRexx("");
  xyz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)1);
  xyz.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx(". X Y Z"); // use a dot to indicate an empty cell
  {int $1=$01.OpPlus(null).toint();r_=new netrexx.lang.Rexx((byte)1);r_:for(;$1>0;$1--,r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   ra=((r_.OpCcblank(null,new netrexx.lang.Rexx(rng.nextInt(maxI.toint())))).OpCcblank(null,new netrexx.lang.Rexx(rng.nextInt(maxI.toint())))).OpCcblank(null,new netrexx.lang.Rexx(rng.nextInt(maxI.toint())));
   xyz.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_.OpAdd(null,$02);
   xyz.getnode(r_.OpAdd(null,$02)).leaf=ra;
   }
  }/*r_*/
  
  // build an HTML string
  html=htmlHeader();
  html=html.OpCc(null,htmlTable(xyz));
  html=html.OpCc(null,htmlFooter());
  
  // display HTML at standard output device
  netrexx.lang.RexxIO.Say(html);
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // HTML boilerplate header
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx htmlHeader(){
  netrexx.lang.Rexx html;
  html=(((((((((((((((((((((((netrexx.lang.Rexx.toRexx("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n").OpCc(null,netrexx.lang.Rexx.toRexx("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en-US\" xml:lang=\"en-US\">\n"))).OpCc(null,$03)).OpCc(null,netrexx.lang.Rexx.toRexx("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<title>RCreateHTMLTable</title>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<style type=\"text/css\">\n"))).OpCc(null,$04)).OpCc(null,netrexx.lang.Rexx.toRexx("/* <![DATA[ */\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("body {font-family: \"Lucida Grande\", \"Geneva\", \"Verdana\", \"Helvetica Neue\", \"Helvetica\", \"DejaVu Sans\", \"Arial\", sans-serif;}\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("table, th, td {table-layout: fixed; border: 1px solid black; border-collapse: collapse; padding: 0.25em; font-size: 85%;}\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("th, td {width: 6em;}\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("th {color: white; background-color: green;}\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("td {text-align: right;}\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("p.classname {\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  font-size: inherit;\n"))).OpCc(null,$05)).OpCc(null,$06)).OpCc(null,$07)).OpCc(null,$08)).OpCc(null,$09)).OpCc(null,$010)).OpCc(null,netrexx.lang.Rexx.toRexx("<h1>Rosetta Code &ndash; NetRexx Sample Output</h2>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<h2><a href=\"http://rosettacode.org/wiki/Create_an_HTML_table\">Create an HTML table</a></h2>\n"))).OpCc(null,$011);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return html;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // HTML footer
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx htmlFooter(){
  netrexx.lang.Rexx html;
  html=($012.OpCc(null,$013)).OpCc(null,$011);
  
  
  return html;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Create the table
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx htmlTable(netrexx.lang.Rexx rows){
  return htmlTable(rows,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx htmlTable(netrexx.lang.Rexx rows,netrexx.lang.Rexx caption){
  netrexx.lang.Rexx html;
  netrexx.lang.Rexx r_=null;
  html=netrexx.lang.Rexx.toRexx("<table>\n");
  if ((caption.length()).OpGt(null,$014)) 
   {
    html=((((html.OpCc(null,$015)).OpCc(null,caption)).OpCc(null,netrexx.lang.Rexx.toRexx("</caption>\n"))).OpCc(null,$016)).OpCc(null,$011);
   
   
   
   }
  html=((((html.OpCc(null,htmlCsvTableRow(rows.getnode(new netrexx.lang.Rexx((byte)1)).leaf,netrexx.lang.Rexx.toRexx("th")))).OpCc(null,$017)).OpCc(null,$018)).OpCc(null,$019)).OpCc(null,$011);
  
  
  
  
  {netrexx.lang.Rexx $2=rows.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)2);r_:for(;r_.OpLtEq(null,$2);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   html=html.OpCc(null,htmlCsvTableRow(rows.getnode(r_).leaf));
   
   }
  }/*r_*/
  html=((html.OpCc(null,$020)).OpCc(null,$021)).OpCc(null,$011);
  
  
  
  return html;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Add a row to the table
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row){
  return htmlCsvTableRow(row,netrexx.lang.Rexx.toRexx("td"),new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('.'));
  }
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row,netrexx.lang.Rexx tag){
  return htmlCsvTableRow(row,tag,new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('.'));
  }
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row,netrexx.lang.Rexx tag,netrexx.lang.Rexx sep){
  return htmlCsvTableRow(row,tag,sep,new netrexx.lang.Rexx('.'));
  }
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row,netrexx.lang.Rexx tag,netrexx.lang.Rexx sep,netrexx.lang.Rexx emptyCell){
  netrexx.lang.Rexx elmts;
  netrexx.lang.Rexx e_;
  netrexx.lang.Rexx elmt=null;
  netrexx.lang.Rexx html;
  if (tag==null) 
   tag=netrexx.lang.Rexx.toRexx("td");
  row=row.strip(new netrexx.lang.Rexx('t'));
  // replace HTML special characters with symbol entities
  row=row.changestr(new netrexx.lang.Rexx('&'),netrexx.lang.Rexx.toRexx("&amp;")); // need to do this one first to avoid double translation
  row=row.changestr(new netrexx.lang.Rexx('\"'),netrexx.lang.Rexx.toRexx("&quot;"));
  row=row.changestr(new netrexx.lang.Rexx('\''),netrexx.lang.Rexx.toRexx("&apos;"));
  row=row.changestr(new netrexx.lang.Rexx('<'),netrexx.lang.Rexx.toRexx("&lt;"));
  row=row.changestr(new netrexx.lang.Rexx('>'),netrexx.lang.Rexx.toRexx("&gt;"));
  elmts=netrexx.lang.Rexx.toRexx("");
  elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  e_=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!(row.length()).OpGt(null,$014))break;
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
   $3[1]=sep;
   netrexx.lang.RexxParse.parse(row,$022,$3);
   elmt=$3[0];row=$3[2];}
   if (elmt.OpEqS(null,emptyCell)) 
    elmt=netrexx.lang.Rexx.toRexx("&nbsp;"); // replace empy cells with non-breaking spaces
   e_=e_.OpAdd(null,$02);
   elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=e_;
   elmts.getnode(e_).leaf=elmt;
   }
  }
  html=$023.OpCc(null,$011);
  
  {netrexx.lang.Rexx $4=elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf;e_=new netrexx.lang.Rexx((byte)1);e_:for(;e_.OpLtEq(null,$4);e_=e_.OpAdd(null,new netrexx.lang.Rexx(1))){
   html=(((((((html.OpCc(null,$024)).OpCc(null,tag)).OpCc(null,$025)).OpCc(null,elmts.getnode(e_).leaf)).OpCc(null,$026)).OpCc(null,tag)).OpCc(null,$027)).OpCc(null,$011);
   
   
   }
  }/*e_*/
  html=(html.OpCc(null,$028)).OpCc(null,$011);
  
  
  return html;
  }
 
 private RCreateHTMLTable(){return;}
 }
