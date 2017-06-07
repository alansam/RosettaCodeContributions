/* Generated from 'RXMLOutputStax.nrx' 22 Sep 2011 13:42:50 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */









public class RXMLOutputStax{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RXMLOutputStax.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String names[];
  java.lang.String remarks[];
  java.io.StringWriter buffer=null;
  javax.xml.stream.XMLStreamWriter out=null;
  netrexx.lang.Rexx i_=null;
  java.lang.Exception ex=null;
  names=new java.lang.String[]{"April","Tam O\'Shanter","Emily"};
  
  
  
  remarks=new java.lang.String[]{"Bubbly: I\'m > Tam and <= Emily","Burns: \"When chapman billies leave the street ...\"","Short & shrift"};
  
  
  
  
  
  {try{
   buffer=new java.io.StringWriter();
   
   out=javax.xml.stream.XMLOutputFactory.newInstance().createXMLStreamWriter((java.io.Writer)buffer);
   
   out.writeStartDocument("UTF-8","1.0");
   out.writeCharacters("\n");
   
   out.writeStartElement("CharacterRemarks");
   out.writeCharacters("\n");
   
   {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(names.length).OpSub(null,$01);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
    out.writeStartElement("Character");
    out.writeAttribute("name",names[i_.toint()]);
    out.writeCharacters(remarks[i_.toint()]);
    out.writeEndElement();
    out.writeCharacters("\n");
    }
   }/*i_*/
   
   out.writeEndElement();
   out.writeEndDocument();
   out.writeCharacters("\n");
   
   netrexx.lang.RexxIO.Say(buffer.toString());
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 private RXMLOutputStax(){return;}
 }
