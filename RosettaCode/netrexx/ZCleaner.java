/* Generated from 'ZCleaner.nrx' 1 Feb 2013 19:54:00 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class ZCleaner{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(20);
 private static final java.lang.String $0="ZCleaner.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx cleaninput;
  java.util.ArrayList cleaned;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx cc=null;
  java.util.ArrayList lz;
  netrexx.lang.Rexx i_=null;
  java.util.List target_freqs;
  netrexx.lang.RexxIO.Say(clean(sample_data()));
  cleaninput=clean(encoded());
  netrexx.lang.RexxIO.Say(cleaninput);
  cleaned=new java.util.ArrayList();
  {netrexx.lang.Rexx $1=(cleaninput.length()).OpSub(null,$01);c=new netrexx.lang.Rexx((byte)0);c:for(;c.OpLtEq(null,$1);c=c.OpAdd(null,new netrexx.lang.Rexx(1))){
   cc=new netrexx.lang.Rexx(cleaninput.charAt(c.toint()));
   cleaned.add((java.lang.Object)(cc.c2d()));
   }
  }/*c*/
  netrexx.lang.RexxIO.Say(cleaned);
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(cleaned.size()).OpCcblank(null,new netrexx.lang.Rexx(cleaned.size()).OpDivI(null,$02)));
  lz=new java.util.ArrayList();
  {netrexx.lang.Rexx $2=((new netrexx.lang.Rexx(cleaned.size()).OpDivI(null,$02))).OpSub(null,$01);i_=new netrexx.lang.Rexx((byte)2);i_:for(;i_.OpLtEq(null,$2);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   lz.add((java.lang.Object)i_);
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say(lz);
  
  target_freqs=english_frequences();
  netrexx.lang.RexxIO.Say(target_freqs);
  java.util.Collections.sort(target_freqs);
  netrexx.lang.RexxIO.Say(target_freqs);
  
  return;
  }

 // remove non-alpha chars
 
 public static netrexx.lang.Rexx clean(netrexx.lang.Rexx input){
  netrexx.lang.Rexx cleaninput;
  input=input.upper();
  cleaninput=input.translate(netrexx.lang.Rexx.toRexx(""),input.translate(netrexx.lang.Rexx.toRexx(""),uppercase())).space(new netrexx.lang.Rexx((byte)0));
  return cleaninput;
  }

 
 private static netrexx.lang.Rexx sample_data(){
  netrexx.lang.Rexx sd;
  sd=netrexx.lang.Rexx.toRexx("QWERTY UIOP[ 12345 678910 ASDFG qwert 12121 AAAA !@#$% BBBBB");
  return sd;
  }

 
 public static netrexx.lang.Rexx encoded(){
  netrexx.lang.Rexx encoded;
  encoded=(((((((((((((((netrexx.lang.Rexx.toRexx("MOMUD EKAPV TQEFM OEVHP AJMII CDCTI FGYAG JSPXY ALUYM NSMYH").OpCcblank(null,netrexx.lang.Rexx.toRexx("VUXJE LEPXJ FXGCM JHKDZ RYICU HYPUS PGIGM OIYHF WHTCQ KMLRD"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ITLXZ LJFVQ GHOLW CUHLO MDSOE KTALU VYLNZ RFGBX PHVGA LWQIS"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("FGRPH JOOFW GUBYI LAPLA LCAFA AMKLG CETDW VOELJ IKGJB XPHVG"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ALWQC SNWBU BYHCU HKOCE XJEYK BQKVY KIIEH GRLGH XEOLW AWFOJ"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ILOVV RHPKD WIHKN ATUHN VRYAQ DIVHX FHRZV QWMWV LGSHN NLVZS"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("JLAKI FHXUF XJLXM TBLQV RXXHR FZXGV LRAJI EXPRV OSMNP KEPDT"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("LPRWM JAZPK LQUZA ALGZX GVLKL GJTUI ITDSU REZXJ ERXZS HMPST"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("MTEOE PAPJH SMFNB YVQUZ AALGA YDNMP AQOWT UHDBV TSMUE UIMVH"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("QGVRW AEFSP EMPVE PKXZY WLKJA GWALT VYYOB YIXOK IHPDS EVLEV"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("RVSGB JOGYW FHKBL GLXYA MVKIS KIEHY IMAPX UOISK PVAGN MZHPW"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("TTZPV XFCCD TUHJH WLAPF YULTB UXJLN SIJVV YOVDJ SOLXG TGRVO"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SFRII CTMKO JFCQF KTINQ BWVHG TENLH HOGCS PSFPV GJOKM SIFPR"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ZPAAS ATPTZ FTPPD PORRF TAXZP KALQA WMIUD BWNCT LEFKO ZQDLX"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("BUXJL ASIMR PNMBF ZCYLV WAPVF QRHZV ZGZEF KBYIO OFXYE VOWGB"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("BXVCB XBAWG LQKCM ICRRX MACUO IKHQU AJEGL OIJHH XPVZW JEWBA"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("FWAML ZZRXJ EKAHV FASMU LVVUT TGK"));
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  return encoded;
  }

 
 public static java.util.List english_frequences(){
  netrexx.lang.Rexx english_frequences[];
  java.util.ArrayList rlist;
  netrexx.lang.Rexx d_=null;
  english_frequences=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx("0.08167"),new netrexx.lang.Rexx("0.01492"),new netrexx.lang.Rexx("0.02782"),new netrexx.lang.Rexx("0.04253"),new netrexx.lang.Rexx("0.12702"),new netrexx.lang.Rexx("0.02228"),new netrexx.lang.Rexx("0.02015"),new netrexx.lang.Rexx("0.06094"),new netrexx.lang.Rexx("0.06966"),new netrexx.lang.Rexx("0.00153"),new netrexx.lang.Rexx("0.00772"),new netrexx.lang.Rexx("0.04025"),new netrexx.lang.Rexx("0.02406"),new netrexx.lang.Rexx("0.06749"),new netrexx.lang.Rexx("0.07507"),new netrexx.lang.Rexx("0.01929"),new netrexx.lang.Rexx("0.00095"),new netrexx.lang.Rexx("0.05987"),new netrexx.lang.Rexx("0.06327"),new netrexx.lang.Rexx("0.09056"),new netrexx.lang.Rexx("0.02758"),new netrexx.lang.Rexx("0.00978"),new netrexx.lang.Rexx("0.02360"),new netrexx.lang.Rexx("0.00150"),new netrexx.lang.Rexx("0.01974"),new netrexx.lang.Rexx("0.00074")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  rlist=new java.util.ArrayList();
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(english_frequences.length).OpSub(null,$01);d_=new netrexx.lang.Rexx((byte)0);d_:for(;d_.OpLtEq(null,$3);d_=d_.OpAdd(null,new netrexx.lang.Rexx(1))){
   rlist.add((java.lang.Object)(new java.math.BigDecimal(netrexx.lang.Rexx.tochararray(english_frequences[d_.toint()]))));
   }
  }/*d_*/
  return (java.util.List)rlist;
  }

 
 public static netrexx.lang.Rexx uppercase(){
  netrexx.lang.Rexx uppercase;
  uppercase=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  return uppercase;
  }
 
 private ZCleaner(){return;}
 }
