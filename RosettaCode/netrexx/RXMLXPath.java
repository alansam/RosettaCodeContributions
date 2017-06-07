/* Generated from 'RXMLXPath.nrx' 14 Nov 2012 20:09:54 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */








public class RXMLXPath{
 private static final java.lang.String $0="RXMLXPath.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String xmlStr;
  java.lang.String expr1;
  java.lang.String expr2;
  java.lang.String expr3;
  java.lang.String attr1;
  org.w3c.dom.Document doc=null;
  javax.xml.xpath.XPath xpath=null;
  org.w3c.dom.NodeList nodes=null;
  int i_=0;
  java.util.List nameList=null;
  int n_=0;
  java.lang.Exception ex=null;
  xmlStr=""+"<inventory title=\"OmniCorp Store #45x10^3\">"+"  <section name=\"health\">"+"    <item upc=\"123456789\" stock=\"12\">"+"      <name>Invisibility Cream</name>"+"      <price>14.50</price>"+"      <description>Makes you invisible</description>"+"    </item>"+"    <item upc=\"445322344\" stock=\"18\">"+"      <name>Levitation Salve</name>"+"      <price>23.99</price>"+"      <description>Levitate yourself for up to 3 hours per application</description>"+"    </item>"+"  </section>"+"  <section name=\"food\">"+"    <item upc=\"485672034\" stock=\"653\">"+"      <name>Blork and Freen Instameal</name>"+"      <price>4.95</price>"+"      <description>A tasty meal in a tablet; just add water</description>"+"    </item>"+"    <item upc=\"132957764\" stock=\"44\">"+"      <name>Grob winglets</name>"+"      <price>3.56</price>"+"      <description>Tender winglets of Grob. Just add priwater</description>"+"    </item>"+"  </section>"+"</inventory>";
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  expr1="/inventory/section/item[1]";
  expr2="/inventory/section/item/price";
  expr3="/inventory/section/item/name";
  attr1="upc";
  
  {try{
   doc=javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource((java.io.Reader)(new java.io.StringReader(xmlStr))));
   xpath=javax.xml.xpath.XPathFactory.newInstance().newXPath();
   
   // Extract attribute from 1st item element
   netrexx.lang.RexxIO.Say(expr1);
   netrexx.lang.RexxIO.Say("  "+(((org.w3c.dom.Node)(xpath.evaluate(expr1,(java.lang.Object)doc,javax.xml.xpath.XPathConstants.NODE))).getAttributes().getNamedItem(attr1)).toString());
   netrexx.lang.RexxIO.Say("");
   
   // Extract and display all price elments
   nodes=(org.w3c.dom.NodeList)(xpath.evaluate(expr2,(java.lang.Object)doc,javax.xml.xpath.XPathConstants.NODESET));
   netrexx.lang.RexxIO.Say(expr2);
   {int $1=(nodes.getLength())-1;i_=0;i_:for(;i_<=$1;i_++){
    netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(nodes.item(i_).getTextContent())).format(new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((byte)2)));
    }
   }/*i_*/
   netrexx.lang.RexxIO.Say("");
   
   // Extract elements and store in an ArrayList
   
   nameList=(java.util.List)(new java.util.ArrayList());
   nodes=(org.w3c.dom.NodeList)(xpath.evaluate(expr3,(java.lang.Object)doc,javax.xml.xpath.XPathConstants.NODESET));
   {int $2=(nodes.getLength())-1;i_=0;i_:for(;i_<=$2;i_++){
    nameList.add((java.lang.Object)(nodes.item(i_).getTextContent()));
    }
   }/*i_*/
   
   // display contents of ArrayList
   netrexx.lang.RexxIO.Say(expr3);
   {int $3=(nameList.size())-1;n_=0;n_:for(;n_<=$3;n_++){
    netrexx.lang.RexxIO.Say("  "+(nameList.get(n_)).toString());
    }
   }/*n_*/
   netrexx.lang.RexxIO.Say("");
  }
  catch (java.lang.Exception $4){ex=$4;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 private RXMLXPath(){return;}
 }
