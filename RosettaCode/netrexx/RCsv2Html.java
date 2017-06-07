/* Generated from 'RCsv2Html.nrx' 26 Dec 2012 16:33:05 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCsv2Html{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("<head>\n");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("<!--\n");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("body {\n");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("}\n");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("th {\n");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("/* ]] */\n");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("//-->\n");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("</style>\n");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("</head>\n");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("<body>\n");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("</body>\n");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("</html>\n");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("<pre>\n");
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx('\n');
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("</pre>\n");
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("<table>\n");
 private static final netrexx.lang.Rexx $020=netrexx.lang.Rexx.toRexx("<thead>\n");
 private static final netrexx.lang.Rexx $021=netrexx.lang.Rexx.toRexx("</thead>\n");
 private static final netrexx.lang.Rexx $022=netrexx.lang.Rexx.toRexx("<tbody>\n");
 private static final netrexx.lang.Rexx $023=netrexx.lang.Rexx.toRexx("</tbody>\n");
 private static final netrexx.lang.Rexx $024=netrexx.lang.Rexx.toRexx("</table>\n");
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx(0);
 private static final char[] $026={2,1,44,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $027=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $028=netrexx.lang.Rexx.toRexx("<tr>\n");
 private static final netrexx.lang.Rexx $029=new netrexx.lang.Rexx('<');
 private static final netrexx.lang.Rexx $030=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $031=netrexx.lang.Rexx.toRexx("</");
 private static final netrexx.lang.Rexx $032=netrexx.lang.Rexx.toRexx(">\n");
 private static final netrexx.lang.Rexx $033=netrexx.lang.Rexx.toRexx("</tr>\n");
 private static final java.lang.String $0="RCsv2Html.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx inFileName=null;
  netrexx.lang.Rexx csv;
  netrexx.lang.Rexx header;
  netrexx.lang.Rexx pre;
  netrexx.lang.Rexx table;
  netrexx.lang.Rexx footer;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  inFileName=$1[0];}
  if (inFileName.OpEq(null,$02)|inFileName.OpEq(null,$03)) 
   inFileName=netrexx.lang.Rexx.toRexx("./data/Brian.csv");
  csv=RReadFileLineByLine01.scanFile(inFileName);
  
  header=htmlHeader();
  pre=htmlCsvText(csv,inFileName);
  table=htmlCsvTable(csv,inFileName);
  footer=htmlFooter();
  
  netrexx.lang.RexxIO.Say(header);
  netrexx.lang.RexxIO.Say(pre);
  netrexx.lang.RexxIO.Say(table);
  netrexx.lang.RexxIO.Say(footer);
  
  return;
  }

 
 public static netrexx.lang.Rexx htmlHeader(){
  netrexx.lang.Rexx html;
  html=(((((((((((((((((((((((((((((((netrexx.lang.Rexx.toRexx("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n").OpCc(null,netrexx.lang.Rexx.toRexx("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en-US\" xml:lang=\"en-US\">\n"))).OpCc(null,$04)).OpCc(null,netrexx.lang.Rexx.toRexx("<meta http-equiv=\"Content-type\" content=\"text/html;charset=UTF-8\"/>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<title>RCsv2Html</title>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<style type=\"text/css\">\n"))).OpCc(null,$05)).OpCc(null,netrexx.lang.Rexx.toRexx("/* <![DATA[ */\n"))).OpCc(null,$06)).OpCc(null,netrexx.lang.Rexx.toRexx("  font-family: \"Verdana\", \"Geneva\", \"Helvetica Neue\", \"Helvetica\", \"DejaVu Sans\", \"Arial\", sans-serif;\n"))).OpCc(null,$07)).OpCc(null,netrexx.lang.Rexx.toRexx("table, th, td {\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  border: 1px solid black;\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  border-collapse: collapse;\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  padding: 0.25em;\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  font-size: 85%;\n"))).OpCc(null,$07)).OpCc(null,$08)).OpCc(null,netrexx.lang.Rexx.toRexx("  color: white;\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  background-color: green;\n"))).OpCc(null,$07)).OpCc(null,netrexx.lang.Rexx.toRexx("p.classname {\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("  font-size: inherit;\n"))).OpCc(null,$07)).OpCc(null,$09)).OpCc(null,$010)).OpCc(null,$011)).OpCc(null,$012)).OpCc(null,$013)).OpCc(null,netrexx.lang.Rexx.toRexx("<h1>Rosetta Code &ndash; NetRexx Sample Output</h2>\n"))).OpCc(null,netrexx.lang.Rexx.toRexx("<h2><a href=\"http://rosettacode.org/wiki/CSV_to_HTML_translation\">CSV to HTML translation</a></h2>\n"))).OpCc(null,$02);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return html;
  }

 
 public static netrexx.lang.Rexx htmlFooter(){
  netrexx.lang.Rexx html;
  html=($014.OpCc(null,$015)).OpCc(null,$02);
  
  
  return html;
  }

 
 public static netrexx.lang.Rexx htmlCsvText(netrexx.lang.Rexx csv){
  return htmlCsvText(csv,new netrexx.lang.Rexx('.'));
  }
 public static netrexx.lang.Rexx htmlCsvText(netrexx.lang.Rexx csv,netrexx.lang.Rexx fileName){
  netrexx.lang.Rexx html;
  netrexx.lang.Rexx row=null;
  html=(((netrexx.lang.Rexx.toRexx("<h3>Contents of CSV <code>").OpCc(null,fileName)).OpCc(null,netrexx.lang.Rexx.toRexx("</code></h3>\n"))).OpCc(null,$016)).OpCc(null,$02);
  
  
  {netrexx.lang.Rexx $2=csv.getnode(new netrexx.lang.Rexx((byte)0)).leaf;row=new netrexx.lang.Rexx((byte)1);row:for(;row.OpLtEq(null,$2);row=row.OpAdd(null,new netrexx.lang.Rexx(1))){
   html=(html.OpCc(null,csv.getnode(row).leaf)).OpCc(null,$017);
   }
  }/*row*/
  html=(html.OpCc(null,$018)).OpCc(null,$02);
  
  
  return html;
  }

 
 public static netrexx.lang.Rexx htmlCsvTable(netrexx.lang.Rexx csv){
  return htmlCsvTable(csv,new netrexx.lang.Rexx('.'));
  }
 public static netrexx.lang.Rexx htmlCsvTable(netrexx.lang.Rexx csv,netrexx.lang.Rexx fileName){
  netrexx.lang.Rexx html;
  netrexx.lang.Rexx r_=null;
  html=(((($019.OpCc(null,netrexx.lang.Rexx.toRexx("<caption>Translation of CSV <code>"))).OpCc(null,fileName)).OpCc(null,netrexx.lang.Rexx.toRexx("</code></caption>\n"))).OpCc(null,$020)).OpCc(null,$02);
  
  
  
  html=((((html.OpCc(null,htmlCsvTableRow(csv.getnode(new netrexx.lang.Rexx((byte)1)).leaf,netrexx.lang.Rexx.toRexx("th")))).OpCc(null,$017)).OpCc(null,$021)).OpCc(null,$022)).OpCc(null,$02);
  
  
  
  
  {netrexx.lang.Rexx $3=csv.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)2);r_:for(;r_.OpLtEq(null,$3);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   html=((html.OpCc(null,htmlCsvTableRow(csv.getnode(r_).leaf))).OpCc(null,$017)).OpCc(null,$02);
   
   
   }
  }/*r_*/
  html=((html.OpCc(null,$023)).OpCc(null,$024)).OpCc(null,$02);
  
  
  
  return html;
  }

 
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row){
  return htmlCsvTableRow(row,netrexx.lang.Rexx.toRexx("td"));
  }
 public static netrexx.lang.Rexx htmlCsvTableRow(netrexx.lang.Rexx row,netrexx.lang.Rexx tag){
  netrexx.lang.Rexx elmts;
  netrexx.lang.Rexx e_;
  netrexx.lang.Rexx elmt=null;
  netrexx.lang.Rexx html;
  row=row.strip(new netrexx.lang.Rexx('t'));
  row=row.changestr(new netrexx.lang.Rexx('&'),netrexx.lang.Rexx.toRexx("&amp;")); // need to do this one first to avoid double translation
  row=row.changestr(new netrexx.lang.Rexx('\"'),netrexx.lang.Rexx.toRexx("&quot;"));
  row=row.changestr(new netrexx.lang.Rexx('\''),netrexx.lang.Rexx.toRexx("&apos;"));
  row=row.changestr(new netrexx.lang.Rexx('<'),netrexx.lang.Rexx.toRexx("&lt;"));
  row=row.changestr(new netrexx.lang.Rexx('>'),netrexx.lang.Rexx.toRexx("&gt;"));
  elmts=netrexx.lang.Rexx.toRexx("");
  elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  e_=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!(row.length()).OpGt(null,$025))break;
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(row,$026,$4);
   elmt=$4[0];row=$4[1];}
   e_=e_.OpAdd(null,$027);
   elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=e_;
   elmts.getnode(e_).leaf=elmt;
   }
  }
  html=$028.OpCc(null,$02);
  
  {netrexx.lang.Rexx $5=elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf;e_=new netrexx.lang.Rexx((byte)1);e_:for(;e_.OpLtEq(null,$5);e_=e_.OpAdd(null,new netrexx.lang.Rexx(1))){
   html=(((((((html.OpCc(null,$029)).OpCc(null,tag)).OpCc(null,$030)).OpCc(null,elmts.getnode(e_).leaf)).OpCc(null,$031)).OpCc(null,tag)).OpCc(null,$032)).OpCc(null,$02);
   
   
   }
  }/*e_*/
  html=(html.OpCc(null,$033)).OpCc(null,$02);
  
  
  return html;
  }
 
 private RCsv2Html(){return;}
 }
