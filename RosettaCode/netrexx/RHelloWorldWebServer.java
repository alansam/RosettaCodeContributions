/* Generated from 'RHelloWorldWebServer.nrx' 3 Oct 2012 10:08:00 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */


/**
 * <h1>RosettaCode task <a href="">Hello world/Web server</a></h1>
 * <p>
 * Multiple requests will be served in the order that they reach the server, with a queue size limit of 50 waiting
 * requests imposed by default in the ServerSocket class (may be changed by adding a second positive integer argument
 * to the ServerSocket constructor).
 * </p>
 *
 * @author <a href="http://rosettacode.org/wiki/User:Mwn3d">Mike Neurohr</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hello_world/Web_server">RosettaCode: Hello world/Web server</a>
 * @see <a href="http://perishablepress.com/xhtml-document-header-resource/">XHTML Document Header Resource</a>
 */

public class RHelloWorldWebServer{
 private static final java.lang.String $0="RHelloWorldWebServer.nrx";
 
 /* properties public constant */
 public static final boolean isTrue=(1==1);
 public static final boolean isFalse=(1!=1);
 public static final java.lang.String greeting1="Goodbye, World!";
 public static final java.lang.String greeting2=""+"HTTP/1.1 200 OK\r\n"+"Content-Type: text/html; charset=UTF-8\r\n\r\n"+"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n"+"<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\r\n"+"<header>\r\n"+"<title>Hello</title>\r\n"+"<style type=\"text/css\">body {font-family: sans-serif;}</style>\r\n"+"</header>\r\n"+"<body>\r\n"+"<h2 style=\"text-align: center;\">"+greeting1+"</h2>\r\n"+"</body>\r\n"+"</html>\r\n"+"";
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /* properties static inheritable */
 protected static boolean terminate=isFalse;
 // TODO: provide a less draconian means to terminate the listener loop
 
 
 public static void main(java.lang.String args[]) throws java.io.IOException{
  java.net.ServerSocket listener;
  java.net.Socket sock=null;
  listener=new java.net.ServerSocket(8080);
  {listener:for(;;){
   if (terminate) 
    break listener;
   sock=listener.accept();
   (new java.io.PrintWriter(sock.getOutputStream(),isTrue)).println(greeting2);
   sock.close();
   }
  }/*listener*/
  return;
  }
 
 private RHelloWorldWebServer(){return;}
 }
