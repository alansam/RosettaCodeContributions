/* Generated from 'RDOMSerialization.nrx' 7 Nov 2012 00:19:51 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.io.StringWriter;

/* NetRexx */







public class RDOMSerialization{
 private static final java.lang.String $0="RDOMSerialization.nrx";
 
 /* properties private */
 private org.w3c.dom.Document domDoc;

 
 
 public static void main(java.lang.String args[]){
  RDOMSerialization lcl;
  
  lcl=new RDOMSerialization();
  lcl.buildDOMDocument();
  lcl.serializeXML();
  
  return;
  }

 
 protected void buildDOMDocument(){
  javax.xml.parsers.DocumentBuilderFactory factory=null;
  javax.xml.parsers.DocumentBuilder builder=null;
  org.w3c.dom.DOMImplementation impl=null;
  org.w3c.dom.Element elmt1=null;
  org.w3c.dom.Element elmt2=null;
  javax.xml.parsers.ParserConfigurationException exPC=null;
  
  {try{
   factory=javax.xml.parsers.DocumentBuilderFactory.newInstance();
   builder=factory.newDocumentBuilder();
   impl=builder.getDOMImplementation();
   domDoc=impl.createDocument((java.lang.String)null,(java.lang.String)null,(org.w3c.dom.DocumentType)null);
   elmt1=domDoc.createElement("root");
   elmt2=domDoc.createElement("element");
   elmt2.setTextContent("Some text here");
   
   domDoc.appendChild((org.w3c.dom.Node)elmt1);
   elmt1.appendChild((org.w3c.dom.Node)elmt2);
  }
  catch (javax.xml.parsers.ParserConfigurationException $1){exPC=$1;
   exPC.printStackTrace();
  }}
  
  return;
  }

 
 protected void serializeXML(){
  javax.xml.transform.dom.DOMSource domSrc=null;
  javax.xml.transform.Transformer txformer=null;
  java.io.StringWriter sw=null;
  javax.xml.transform.stream.StreamResult sr=null;
  javax.xml.transform.TransformerConfigurationException exTC=null;
  javax.xml.transform.TransformerFactoryConfigurationError exTF=null;
  javax.xml.transform.TransformerException exTE=null;
  
  {try{
   domSrc=new javax.xml.transform.dom.DOMSource((org.w3c.dom.Node)domDoc);
   txformer=javax.xml.transform.TransformerFactory.newInstance().newTransformer();
   txformer.setOutputProperty(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION,"no");
   txformer.setOutputProperty(javax.xml.transform.OutputKeys.METHOD,"xml");
   txformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING,"UTF-8");
   txformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT,"yes");
   txformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE,"yes");
   txformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
   
   sw=new StringWriter();
   sr=new javax.xml.transform.stream.StreamResult((java.io.Writer)sw);
   
   txformer.transform((javax.xml.transform.Source)domSrc,(javax.xml.transform.Result)sr);
   
   netrexx.lang.RexxIO.Say(sw.toString());
  }
  catch (javax.xml.transform.TransformerConfigurationException $2){exTC=$2;
   exTC.printStackTrace();
  }
  catch (javax.xml.transform.TransformerFactoryConfigurationError $3){exTF=$3;
   exTF.printStackTrace();
  }
  catch (javax.xml.transform.TransformerException $4){exTE=$4;
   exTE.printStackTrace();
  }}
  
  return;
  }
 
 public RDOMSerialization(){return;}
 }
