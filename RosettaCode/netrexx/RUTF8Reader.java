/* Generated from 'RUTF8Reader.nrx' 25 Jan 2014 20:10:17 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RUTF8Reader{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("CodePoint:");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("index=\"");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("id=\"U+");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("hex=\"0x");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("dec=\"");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("oct=\"");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("char=\"");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("utf-16=\"");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("utf-8=\"");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("name=\"");
 private static final char[] $016={1,10,1,0,0};
 private static final netrexx.lang.Rexx $017=netrexx.lang.Rexx.toRexx("");
 private static final char[] $018={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("Input:");
 private static final java.lang.String $0="RUTF8Reader.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static java.lang.String readCharacters(netrexx.lang.Rexx fName){
  java.lang.String slurped;
  java.lang.StringBuilder slrp;
  java.io.Reader fr;
  java.io.File fFile;
  int EOF;
  int ic=0;
  char cc=0;
  java.io.FileNotFoundException fex=null;
  java.io.IOException iex=null;
  slurped=new java.lang.String("");
  slrp=new java.lang.StringBuilder();
  fr=(java.io.Reader)null;
  fFile=new java.io.File(netrexx.lang.Rexx.toString(fName));
  EOF=-1; // End Of File indicator
  {try{
   fr=(java.io.Reader)(new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(fFile))));
   
   
   // read the contents of the file one character at a time
   {rdr:for(;;){
    // Reader.read reads a single character as an integer value in the range 0 - 65535 [0x00 - 0xffff]
    // or -1 on end of stream i.e. End Of File
    ic=fr.read();
    if (ic==EOF) 
     break rdr;
    cc=((new netrexx.lang.Rexx(ic)).d2c()).tochar();
    slrp.append(cc);
    }
   }/*rdr*/
   // load the results of the read into a variable
   slurped=slrp.toString();
  }
  catch (java.io.FileNotFoundException $2){fex=$2;
   fex.printStackTrace();
  }
  catch (java.io.IOException $3){iex=$3;
   iex.printStackTrace();
  }
  finally{
   if (fr!=null) 
    {try{
     fr.close();
    }
    catch (java.io.IOException $4){iex=$4;
     iex.printStackTrace();
    }}
  }}
  return slurped;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void encodingDetails(java.lang.String str){
  int stlen;
  int cplen;
  netrexx.lang.Rexx ix=null;
  netrexx.lang.Rexx cp=null;
  netrexx.lang.Rexx cc=null;
  netrexx.lang.Rexx surrogates[]=null;
  netrexx.lang.Rexx sx=null;
  stlen=str.length();
  cplen=java.lang.Character.codePointCount((java.lang.CharSequence)str,0,stlen);
  netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx.toRexx("Unicode: length=\"").OpCc($1,new netrexx.lang.Rexx(stlen))).OpCc($1,netrexx.lang.Rexx.toRexx("\" code_point_count=\""))).OpCc($1,new netrexx.lang.Rexx(cplen))).OpCc($1,netrexx.lang.Rexx.toRexx("\" string=\""))).OpCc($1,netrexx.lang.Rexx.toRexx(str))).OpCc($1,$02));
  {netrexx.lang.Rexx $5=new netrexx.lang.Rexx(stlen).OpSub($1,$03);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq($1,$5);ix=ix.OpAdd($1,new netrexx.lang.Rexx(1))){
   cp=new netrexx.lang.Rexx(java.lang.Character.codePointAt((java.lang.CharSequence)str,ix.toint()));
   cc=new netrexx.lang.Rexx(java.lang.Character.charCount(cp.toint()));
   netrexx.lang.RexxIO.Say($04.OpCc($1,formatCodePoint(ix,cc,cp)));
   if (cc.OpGt($1,$03)) 
    {
     surrogates=new netrexx.lang.Rexx[]{(new netrexx.lang.Rexx(java.lang.Character.highSurrogate(cp.toint()))).c2d(),(new netrexx.lang.Rexx(java.lang.Character.lowSurrogate(cp.toint()))).c2d()};
     {netrexx.lang.Rexx $6=cc.OpSub($1,$03);sx=new netrexx.lang.Rexx((byte)0);sx:for(;sx.OpLtEq($1,$6);sx=sx.OpAdd($1,new netrexx.lang.Rexx(1))){
      ix=ix.OpAdd($1,sx);
      cp=surrogates[sx.toint()];
      netrexx.lang.RexxIO.Say($04.OpCc($1,formatCodePoint(ix,new netrexx.lang.Rexx((byte)1),cp)));
      }
     }/*sx*/
    }
   }
  }/*ix*/
  netrexx.lang.RexxIO.Say("");
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 // @see http://docs.oracle.com/javase/6/docs/technotes/guides/intl/encoding.doc.html
 // @since Java 1.7
 
 private static netrexx.lang.Rexx formatCodePoint(netrexx.lang.Rexx ix,netrexx.lang.Rexx cc,netrexx.lang.Rexx cp){
  netrexx.lang.Rexx scp;
  netrexx.lang.Rexx icp;
  netrexx.lang.Rexx ocp;
  netrexx.lang.Rexx x_utf16;
  netrexx.lang.Rexx x_utf8;
  byte b_utf16[]=null;
  byte b_utf8[]=null;
  netrexx.lang.Rexx bv=null;
  java.io.UnsupportedEncodingException ex=null;
  java.lang.String cpName;
  netrexx.lang.Rexx fmt;
  scp=new netrexx.lang.Rexx(java.lang.Character.toChars(cp.toint()));
  icp=cp.d2x(new netrexx.lang.Rexx((byte)8)).x2d(new netrexx.lang.Rexx((byte)9)); // signed to unsigned conversion
  ocp=new netrexx.lang.Rexx(java.lang.Integer.toOctalString(icp.toint()));
  x_utf16=netrexx.lang.Rexx.toRexx("");
  x_utf8=netrexx.lang.Rexx.toRexx("");
  {try{
   b_utf16=(new java.lang.String(netrexx.lang.Rexx.tochararray(scp))).getBytes("UTF-16BE");
   b_utf8=(new java.lang.String(netrexx.lang.Rexx.tochararray(scp))).getBytes("UTF-8");
   {netrexx.lang.Rexx $7=new netrexx.lang.Rexx(b_utf16.length).OpSub($1,$03);netrexx.lang.Rexx $8=$05;bv=new netrexx.lang.Rexx((byte)0);bv:for(;bv.OpLtEq($1,$7);bv=bv.OpAdd($1,$8)){
    x_utf16=(x_utf16.OpCcblank($1,(new netrexx.lang.Rexx(b_utf16[bv.toint()])).d2x(new netrexx.lang.Rexx((byte)2)))).OpCc($1,(new netrexx.lang.Rexx(b_utf16[bv.OpAdd($1,$03).toint()])).d2x(new netrexx.lang.Rexx((byte)2)));
    }
   }/*bv*/
   {netrexx.lang.Rexx $9=new netrexx.lang.Rexx(b_utf8.length).OpSub($1,$03);bv=new netrexx.lang.Rexx((byte)0);bv:for(;bv.OpLtEq($1,$9);bv=bv.OpAdd($1,new netrexx.lang.Rexx(1))){
    x_utf8=x_utf8.OpCcblank($1,(new netrexx.lang.Rexx(b_utf8[bv.toint()])).d2x(new netrexx.lang.Rexx((byte)2)));
    }
   }/*bv*/
   x_utf16=x_utf16.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','));
   x_utf8=x_utf8.space(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx(','));
  }
  catch (java.io.UnsupportedEncodingException $10){ex=$10;
   ex.printStackTrace();
  }}
  cpName=java.lang.Character.getName(cp.toint());
  fmt=((((((((((((((((((((((((((((($06.OpCcblank($1,$07)).OpCc($1,ix.right(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$02)).OpCcblank($1,netrexx.lang.Rexx.toRexx("character_count=\""))).OpCc($1,cc)).OpCc($1,$02)).OpCcblank($1,$08)).OpCc($1,cp.d2x(new netrexx.lang.Rexx((byte)5)))).OpCc($1,$02)).OpCcblank($1,$09)).OpCc($1,cp.d2x(new netrexx.lang.Rexx((byte)6)))).OpCc($1,$02)).OpCcblank($1,$010)).OpCc($1,icp.right(new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$02)).OpCcblank($1,$011)).OpCc($1,ocp.right(new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$02)).OpCcblank($1,$012)).OpCc($1,scp)).OpCc($1,$02)).OpCcblank($1,$013)).OpCc($1,x_utf16)).OpCc($1,$02)).OpCcblank($1,$014)).OpCc($1,x_utf8)).OpCc($1,$02)).OpCcblank($1,$015)).OpCc($1,netrexx.lang.Rexx.toRexx(cpName))).OpCc($1,$02);
  
  
  
  
  
  
  
  
  
  
  
  return fmt;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx fileNames=null;
  netrexx.lang.Rexx fileName=null;
  java.lang.String slurped=null;
  {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$016,$11);
  fileNames=$11[0];}
  if (fileNames.OpEq($1,$017)) 
   fileNames=netrexx.lang.Rexx.toRexx("data/utf8-001.txt");
  {for(;;){if(!fileNames.OpNotEq($1,$017))break;
   {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(fileNames,$018,$12);
   fileName=$12[0];fileNames=$12[1];}
   slurped=readCharacters(fileName);
   netrexx.lang.RexxIO.Say($019.OpCcblank($1,netrexx.lang.Rexx.toRexx(slurped)));
   encodingDetails(slurped);
   }
  }
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RUTF8Reader(){return;}
 }
