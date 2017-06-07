/* Generated from 'RSockets.nrx' 28 Mar 2013 19:55:16 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RSockets{
 private static final char[] $01={2,1,58,10,1,0,2,1,58,10,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RSockets.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx host=null;
  netrexx.lang.Rexx port=null;
  netrexx.lang.Rexx message=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  host=$1[0];port=$1[1];message=$1[2];}
  if (host.OpEq(null,$02)) 
   host=netrexx.lang.Rexx.toRexx("localhost");
  if (port.OpEq(null,$02)) 
   port=new netrexx.lang.Rexx((short)256);
  if (message.OpEq(null,$02)) 
   message=netrexx.lang.Rexx.toRexx("hello socket world");
  sendToSocket(host,port,message);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void sendToSocket(netrexx.lang.Rexx host,netrexx.lang.Rexx port,netrexx.lang.Rexx message){
  java.net.Socket sokt=null;
  java.io.OutputStream soks=null;
  java.io.IOException ix=null;
  {try{
   sokt=new java.net.Socket(netrexx.lang.Rexx.toString(host),port.toint());
   soks=sokt.getOutputStream();
   soks.write((netrexx.lang.Rexx.toString(message)).getBytes());
   soks.flush();
   sokt.close();
  }
  catch (java.io.IOException $2){ix=$2;
   ix.printStackTrace();
  }}
  return;
  }
 
 private RSockets(){return;}
 }
