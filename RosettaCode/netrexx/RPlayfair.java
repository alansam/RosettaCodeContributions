/* Generated from 'RPlayfair.nrx' 18 Nov 2013 11:56:00 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class RPlayfair{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('I');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('J');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('D');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final char[] $06={4,1,1,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx('-');
 private static final char[] $012={4,1,10,10,1,0,1,10,1,1,0};
 private static final char[] $013={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(2);
 private static final char[] $015={4,1,2,10,1,0,1,10,1,1,0};
 private static final char[] $016={1,10,5,0,1,2,3,4,0};
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RPlayfair.nrx";
 
 /* properties private constant */ //unused
 private static final boolean BTRUE=(1==1);
 private static final boolean BFALSE=new netrexx.lang.Rexx(BTRUE).OpNot(null);
 private static final netrexx.lang.Rexx A2Z=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
 
 /* properties indirect */
 private boolean IJ;
 private boolean encipher;
 private boolean explain;
 private netrexx.lang.Rexx key;
 private netrexx.lang.Rexx keyMatrix;
 private netrexx.lang.Rexx plainText;
 private netrexx.lang.Rexx cipherText;
 private netrexx.lang.Rexx digraphs;
 private netrexx.lang.Rexx duplicationCharacter;
 private netrexx.lang.Rexx fillCharacter;

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public RPlayfair(){
  this(netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("playfair"),new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('X'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt){
  this(pt,netrexx.lang.Rexx.toRexx("playfair"),new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('X'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky){
  this(pt,ky,new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('X'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky,netrexx.lang.Rexx mode){
  this(pt,ky,mode,new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('X'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky,netrexx.lang.Rexx mode,netrexx.lang.Rexx IorQ){
  this(pt,ky,mode,IorQ,new netrexx.lang.Rexx('X'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky,netrexx.lang.Rexx mode,netrexx.lang.Rexx IorQ,netrexx.lang.Rexx d_){
  this(pt,ky,mode,IorQ,d_,netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky,netrexx.lang.Rexx mode,netrexx.lang.Rexx IorQ,netrexx.lang.Rexx d_,netrexx.lang.Rexx f_){
  this(pt,ky,mode,IorQ,d_,f_,new netrexx.lang.Rexx('N'));return;
  }
 public RPlayfair(netrexx.lang.Rexx pt,netrexx.lang.Rexx ky,netrexx.lang.Rexx mode,netrexx.lang.Rexx IorQ,netrexx.lang.Rexx d_,netrexx.lang.Rexx f_,netrexx.lang.Rexx e_){super();
  if (ky==null) 
   ky=netrexx.lang.Rexx.toRexx("playfair");
  if (mode==null) 
   mode=new netrexx.lang.Rexx('E');
  if (IorQ==null) 
   IorQ=new netrexx.lang.Rexx('I');
  if (d_==null) 
   d_=new netrexx.lang.Rexx('X');
  if (f_==null) 
   f_=d_;
  if (e_==null) 
   e_=new netrexx.lang.Rexx('N');
  IorQ=IorQ.upper();
  mode=mode.upper();
  d_=d_.upper();
  f_=f_.upper();
  if (IorQ.OpEq(null,$01)|IorQ.OpEq(null,$02)) 
   setIJ(BTRUE);
  else 
   setIJ(BFALSE);
  if (mode.OpEq(null,$03)) 
   setEncipher(BFALSE); // decipher
  else 
   setEncipher(BTRUE); // encipher
  if (netrexx.lang.Rexx.toRexx("YES").abbrev(e_.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   setExplain(BTRUE);
  else 
   setExplain(BFALSE);
  setDuplicationCharacter(d_);
  if (f_.OpEq(null,$04)) 
   f_=d_;
  setFillCharacter(f_);
  setKey(ky);
  buildKeyMatrix();
  setPlainText(pt);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx cipher(){
  netrexx.lang.Rexx d_=null;
  netrexx.lang.Rexx cipherText_;
  netrexx.lang.Rexx digraphs_;
  netrexx.lang.Rexx km;
  netrexx.lang.Rexx dw=null;
  netrexx.lang.Rexx digraph=null;
  netrexx.lang.Rexx cl=null;
  netrexx.lang.Rexx cr=null;
  netrexx.lang.Rexx dl=null;
  netrexx.lang.Rexx dr=null;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx clx=null;
  netrexx.lang.Rexx crx=null;
  netrexx.lang.Rexx ptype=null;
  netrexx.lang.Rexx rx=null;
  netrexx.lang.Rexx cy=null;
  netrexx.lang.Rexx cx=null;
  netrexx.lang.Rexx rlx=null;
  netrexx.lang.Rexx rrx=null;
  netrexx.lang.Rexx r1=null;
  netrexx.lang.Rexx r2=null;
  if (isEncipher()) 
   d_=new netrexx.lang.Rexx((byte)1);
  else 
   d_=$05.OpMinus(null);
  cipherText_=netrexx.lang.Rexx.toRexx("");
  digraphs_=buildDigraphs();
  km=getKeyMatrix();
  if (isExplain()) 
   showKeyMatrix();
  {netrexx.lang.Rexx $1=digraphs_.words();dw=new netrexx.lang.Rexx((byte)1);dw:for(;dw.OpLtEq(null,$1);dw=dw.OpAdd(null,new netrexx.lang.Rexx(1))){
   // process the digraphs one at a time
   digraph=digraphs_.word(dw);
   cl=netrexx.lang.Rexx.toRexx("");
   cr=netrexx.lang.Rexx.toRexx("");
   // get each letter from the digraph
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(digraph,$06,$2);
   dl=$2[0];dr=$2[1];}
   {netrexx.lang.Rexx $3=km.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$3);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!((cl.OpCcblank(null,cr)).words()).OpLt(null,$07))break;
    // locate the row/col of each letter in the cipher matrix
    clx=km.getnode(r_).leaf.wordpos(dl);
    crx=km.getnode(r_).leaf.wordpos(dr);
    if (clx.OpGt(null,$08)) 
     cl=r_.OpCcblank(null,clx);
    if (crx.OpGt(null,$08)) 
     cr=r_.OpCcblank(null,crx);
    }
   }/*r_*/
   
   // process the digraph's rows, columns or rectangles
   {/*select*/
   if ((cl.word(new netrexx.lang.Rexx((byte)1))).OpEq(null,cr.word(new netrexx.lang.Rexx((byte)1))))
    {
     // a row
     ptype=netrexx.lang.Rexx.toRexx("row");
     rx=cl.word(new netrexx.lang.Rexx((byte)1));
     clx=(cl.word(new netrexx.lang.Rexx((byte)2))).OpAdd(null,d_);
     crx=(cr.word(new netrexx.lang.Rexx((byte)2))).OpAdd(null,d_);
     if (clx.OpGt(null,$09)) 
      clx=new netrexx.lang.Rexx((byte)1); // wrap
     if (crx.OpGt(null,$09)) 
      crx=new netrexx.lang.Rexx((byte)1);
     if (clx.OpLt(null,$05)) 
      clx=new netrexx.lang.Rexx((byte)5);
     if (crx.OpLt(null,$05)) 
      crx=new netrexx.lang.Rexx((byte)5);
     cy=(km.getnode(rx).leaf.word(clx)).OpCc(null,km.getnode(rx).leaf.word(crx));
     cipherText_=cipherText_.OpCcblank(null,cy);
    }
   else if ((cl.word(new netrexx.lang.Rexx((byte)2))).OpEq(null,cr.word(new netrexx.lang.Rexx((byte)2))))
    {
     // a column
     ptype=netrexx.lang.Rexx.toRexx("column");
     cx=cl.word(new netrexx.lang.Rexx((byte)2));
     rlx=(cl.word(new netrexx.lang.Rexx((byte)1))).OpAdd(null,d_);
     rrx=(cr.word(new netrexx.lang.Rexx((byte)1))).OpAdd(null,d_);
     if (rlx.OpGt(null,$09)) 
      rlx=new netrexx.lang.Rexx((byte)1); // wrap
     if (rrx.OpGt(null,$09)) 
      rrx=new netrexx.lang.Rexx((byte)1);
     if (rlx.OpLt(null,$05)) 
      rlx=new netrexx.lang.Rexx((byte)5);
     if (rrx.OpLt(null,$05)) 
      rrx=new netrexx.lang.Rexx((byte)5);
     cy=(km.getnode(rlx).leaf.word(cx)).OpCc(null,km.getnode(rrx).leaf.word(cx));
     cipherText_=cipherText_.OpCcblank(null,cy);
    }
   else{
    {
     // a rectangle
     ptype=netrexx.lang.Rexx.toRexx("rectangle");
     r1=cl.word(new netrexx.lang.Rexx((byte)1));
     r2=cr.word(new netrexx.lang.Rexx((byte)1));
     cy=(km.getnode(r1).leaf.word(cr.word(new netrexx.lang.Rexx((byte)2)))).OpCc(null,km.getnode(r2).leaf.word(cl.word(new netrexx.lang.Rexx((byte)2))));
     cipherText_=cipherText_.OpCcblank(null,cy);
    }
   }
   }
   if (isExplain()) 
    netrexx.lang.RexxIO.Say(((((((digraph.OpCcblank(null,cl)).OpCc(null,$010)).OpCcblank(null,cr)).OpCcblank(null,$011)).OpCcblank(null,cy)).OpCcblank(null,$011)).OpCcblank(null,ptype));
   }
  }/*dw*/
  setCipherText(cipherText_.strip());
  return getCipherText();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void setKey(netrexx.lang.Rexx ky){
  netrexx.lang.Rexx kp;
  netrexx.lang.Rexx kr;
  netrexx.lang.Rexx xx=null;
  kp=(ky.OpCc(null,A2Z)).upper();
  kr=netrexx.lang.Rexx.toRexx("");
  {$5:for(;;){if(!kp.OpNotEq(null,$04))break;
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(kp,$06,$4);
   xx=$4[0];kp=$4[1];}
   if ((xx.datatype(new netrexx.lang.Rexx('u'))).OpNot(null)) 
    continue $5;
   kr=kr.OpCcblank(null,xx);
   kp=kp.changestr(xx,netrexx.lang.Rexx.toRexx(""));
   }
  }
  
  if (isIJ()) 
   kr=kr.changestr(new netrexx.lang.Rexx('J'),netrexx.lang.Rexx.toRexx(""));
  else 
   kr=kr.changestr(new netrexx.lang.Rexx('Q'),netrexx.lang.Rexx.toRexx(""));
  
  key=kr.space();
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public netrexx.lang.Rexx getDigraphs(){
  if (digraphs==null) 
   digraphs=buildDigraphs();
  return digraphs;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private void buildKeyMatrix(){
  netrexx.lang.Rexx km;
  netrexx.lang.Rexx kr;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx kp=null;
  km=netrexx.lang.Rexx.toRexx("");
  kr=getKey();
  {r_=new netrexx.lang.Rexx((byte)1);r_:for(;;r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!kr.OpNotEq(null,$04))break;
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(kr,$012,$6);
   kp=$6[0];kr=$6[1];}
   km.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
   km.getnode(r_).leaf=kp;
   }
  }/*r_*/
  setKeyMatrix(km);
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public void showKeyMatrix(){
  netrexx.lang.Rexx km;
  netrexx.lang.Rexx r_=null;
  km=getKeyMatrix();
  {netrexx.lang.Rexx $7=km.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$7);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((r_.right(new netrexx.lang.Rexx((byte)2))).OpCcblank(null,km.getnode(r_).leaf));
   }
  }/*r_*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private netrexx.lang.Rexx buildDigraphs(){
  netrexx.lang.Rexx eks=null;
  netrexx.lang.Rexx text;
  netrexx.lang.Rexx tp;
  netrexx.lang.Rexx rtext;
  netrexx.lang.Rexx ll;
  netrexx.lang.Rexx lc=null;
  netrexx.lang.Rexx IorQ=null;
  netrexx.lang.Rexx sc=null;
  netrexx.lang.Rexx rtl;
  netrexx.lang.Rexx digraphs_;
  netrexx.lang.Rexx digraph=null;
  if (isEncipher()) 
   eks=getDuplicationCharacter();
  else 
   eks=netrexx.lang.Rexx.toRexx("");
  text=getPlainText().upper();
  tp=text.translate(netrexx.lang.Rexx.toRexx(""),A2Z);
  text=text.translate(new netrexx.lang.Rexx(' ').copies(tp.length()),tp).space(new netrexx.lang.Rexx((byte)0));
  rtext=netrexx.lang.Rexx.toRexx("");
  ll=netrexx.lang.Rexx.toRexx("");
  
  {for(;;){if(!text.OpNotEq(null,$04))break;
   {netrexx.lang.Rexx $8[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(text,$06,$8);
   lc=$8[0];text=$8[1];}
   if (ll.OpNotEq(null,lc)) 
    rtext=rtext.OpCc(null,lc);
   else 
    rtext=(rtext.OpCc(null,eks)).OpCc(null,lc);
   ll=lc;
   }
  }
  
  // I == J or remove Q fixup
  if (isIJ()) 
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("J I"),$013,$9);
   IorQ=$9[0];sc=$9[1];} // fixup for a J in the text
  else 
   {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("Q K"),$013,$10);
   IorQ=$10[0];sc=$10[1];} // fixup for a Q in the text
  
  rtext=rtext.changestr(IorQ,sc);
  rtl=rtext.length();
  if (rtl.OpRem(null,$014).OpNotEq(null,$08)) 
   rtext=rtext.OpCc(null,getFillCharacter());
  digraphs_=netrexx.lang.Rexx.toRexx("");
  {for(;;){if(!rtext.OpNotEq(null,$04))break;
   {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(rtext,$015,$11);
   digraph=$11[0];rtext=$11[1];}
   digraphs_=digraphs_.OpCcblank(null,digraph);
   }
  }
  setDigraphs(digraphs_.space());
  return getDigraphs();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  arg=new netrexx.lang.Rexx(args);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ciph_=null;
  netrexx.lang.Rexx IorQ_=null;
  netrexx.lang.Rexx dbg_=null;
  netrexx.lang.Rexx key_=null;
  netrexx.lang.Rexx text_=null;
  RPlayfair pf=null;
  netrexx.lang.Rexx verify_=null;
  netrexx.lang.Rexx cipherText_=null;
  netrexx.lang.Rexx plainText_=null;
  RPlayfair ciphers[]=null;
  netrexx.lang.Rexx IQ=null;
  netrexx.lang.Rexx dbg=null;
  netrexx.lang.Rexx ED=null;
  RPlayfair px=null;
  if (arg.OpNotEq(null,$04)) 
   {
    {netrexx.lang.Rexx $12[]=new netrexx.lang.Rexx[5];
    netrexx.lang.RexxParse.parse(arg,$016,$12);
    ciph_=$12[0];IorQ_=$12[1];dbg_=$12[2];key_=$12[3];text_=$12[4];}
    if (ciph_.OpEq(null,$04)|ciph_.OpEq(null,$017)) 
     ciph_=new netrexx.lang.Rexx('E');
    if (IorQ_.OpEq(null,$04)|IorQ_.OpEq(null,$017)) 
     IorQ_=new netrexx.lang.Rexx('I');
    if (dbg_.OpEq(null,$04)|dbg_.OpEq(null,$017)) 
     dbg_=new netrexx.lang.Rexx('N');
    if (key_.OpEq(null,$04)|key_.OpEq(null,$017)) 
     key_=netrexx.lang.Rexx.toRexx("plugh_xyzzy");
    if (text_.OpEq(null,$04)|text_.OpEq(null,$017)) 
     text_=netrexx.lang.Rexx.toRexx("NetRexx; not just a programing language for kings & queens!");
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say($011.copies(new netrexx.lang.Rexx((byte)120)));
    
    pf=new RPlayfair(text_,key_,ciph_,IorQ_,(netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,dbg_);
    verify_=pf.getDigraphs();
    cipherText_=pf.cipher();
    netrexx.lang.RexxIO.Say(pf.getPlainText());
    netrexx.lang.RexxIO.Say(verify_);
    netrexx.lang.RexxIO.Say(cipherText_);
    if (pf.isEncipher()) 
     ciph_=new netrexx.lang.Rexx('D');
    else 
     ciph_=new netrexx.lang.Rexx('E');
    pf=new RPlayfair(cipherText_,key_,ciph_,IorQ_,(netrexx.lang.Rexx)null,(netrexx.lang.Rexx)null,dbg_);
    plainText_=pf.cipher();
    netrexx.lang.RexxIO.Say(plainText_);
    if (verify_.OpEqS(null,plainText_)) 
     netrexx.lang.RexxIO.Say("Encipher/decipher verificaton succeeded");
    else 
     netrexx.lang.RexxIO.Say("Encipher/decipher verificaton failed");
    netrexx.lang.RexxIO.Say("");
   }
  else 
   {
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say($011.copies(new netrexx.lang.Rexx((byte)120)));
    
    ciphers=new RPlayfair[]{new RPlayfair(netrexx.lang.Rexx.toRexx("NetRexx; not just a programing language for kings & queens!"),netrexx.lang.Rexx.toRexx("plugh_xyzzy")),new RPlayfair(netrexx.lang.Rexx.toRexx("Hide the gold in the tree stump!"),netrexx.lang.Rexx.toRexx("Playfair example")),new RPlayfair(netrexx.lang.Rexx.toRexx("KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWTT TUOLKS YCA JPOBO TE IZONTX BYBW T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q"),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY"),new netrexx.lang.Rexx('D')),new RPlayfair(netrexx.lang.Rexx.toRexx("KXJEY UREBE ZWEHE WRYTU HEYFS KREHE GOYFI WUUTU OLKSY CAJPO BOTEI ZONTX BYBNT GONEY CUZWR GDSON SXBOU YWRHE BAAHY USEDQ"),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY"),new netrexx.lang.Rexx('D')),new RPlayfair(netrexx.lang.Rexx.toRexx("PT BOAT ONE OWE NINE LOST IN ACION IN BLACKETT STRAIT TWO MILES SW MERESU COVE X CREW OF TWELVE X REQUEST ANY INFORMATION X"),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY"),new netrexx.lang.Rexx('E'),new netrexx.lang.Rexx('I'),netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx('X'),new netrexx.lang.Rexx('N')),new RPlayfair(netrexx.lang.Rexx.toRexx("NetRexx; not just a programing language for kings & queens!"),netrexx.lang.Rexx.toRexx("plugh_xyzzy"),(netrexx.lang.Rexx)null,new netrexx.lang.Rexx('Q'))};
    
    
    
    
    
    
    
    /*         ....+....1....+....2....+....3....+....4....+....5....+....6....+....7....+....8....+....9....+....0....+....1....+....2....+....3  */
    {int $15=0;RPlayfair[] $14=new RPlayfair[ciphers.length];synchronized(ciphers){for(;;){if($15==$14.length)break;$14[$15]=ciphers[ciphers.length-1-$15];$15++;}}pf:for(;;){if(--$15<0)break;pf=(RPlayfair)$14[$15];
     cipherText_=pf.cipher();
     verify_=pf.getDigraphs();
     netrexx.lang.RexxIO.Say(pf.getPlainText());
     netrexx.lang.RexxIO.Say(verify_);
     netrexx.lang.RexxIO.Say(cipherText_);
     if (pf.isIJ()) 
      IQ=new netrexx.lang.Rexx('I');
     else 
      IQ=new netrexx.lang.Rexx('Q');
     if (pf.isExplain()) 
      dbg=new netrexx.lang.Rexx('Y');
     else 
      dbg=new netrexx.lang.Rexx('N');
     if (pf.isEncipher()) 
      ED=new netrexx.lang.Rexx('D');
     else 
      ED=new netrexx.lang.Rexx('E');
     px=new RPlayfair(cipherText_,pf.getKey(),ED,IQ,pf.getDuplicationCharacter(),pf.getFillCharacter(),dbg);
     plainText_=px.cipher();
     netrexx.lang.RexxIO.Say(plainText_);
     if (verify_.OpEqS(null,plainText_)) 
      netrexx.lang.RexxIO.Say("Encipher/decipher verificaton succeeded");
     else 
      netrexx.lang.RexxIO.Say("Encipher/decipher verificaton failed");
     netrexx.lang.RexxIO.Say("");
     }
    }/*pf*/
   }
  
  return;
  }
 
 public boolean isIJ(){return IJ;}
 
 public void setIJ(boolean $16){IJ=$16;return;}
 
 public boolean isEncipher(){return encipher;}
 
 public void setEncipher(boolean $17){encipher=$17;return;}
 
 public boolean isExplain(){return explain;}
 
 public void setExplain(boolean $18){explain=$18;return;}
 
 public netrexx.lang.Rexx getKey(){return key;}
 
 public netrexx.lang.Rexx getKeyMatrix(){return keyMatrix;}
 
 public void setKeyMatrix(netrexx.lang.Rexx $19){keyMatrix=$19;return;}
 
 public netrexx.lang.Rexx getPlainText(){return plainText;}
 
 public void setPlainText(netrexx.lang.Rexx $20){plainText=$20;return;}
 
 public netrexx.lang.Rexx getCipherText(){return cipherText;}
 
 public void setCipherText(netrexx.lang.Rexx $21){cipherText=$21;return;}
 
 public void setDigraphs(netrexx.lang.Rexx $22){digraphs=$22;return;}
 
 public netrexx.lang.Rexx getDuplicationCharacter(){return duplicationCharacter;}
 
 public void setDuplicationCharacter(netrexx.lang.Rexx $23){duplicationCharacter=$23;return;}
 
 public netrexx.lang.Rexx getFillCharacter(){return fillCharacter;}
 
 public void setFillCharacter(netrexx.lang.Rexx $24){fillCharacter=$24;return;}
 }
/*
     1 2 3 4 5
   + - - - - -
 1 | R O Y A L 
 2 | N E W Z D 
 3 | V B C F G 
 4 | H I K M P 
 5 | Q S T U X

 KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWTT TUOLKS YCA JPOBO TE IZONTX BYBW T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q
 PT BOAT ONE OWE NINE LOST IN ACTION IN BLACKESS STRAIT TWO MILES SW MERESU COCE X CREW OF TWELVE X REQUEST ANY INFORMATION X

 KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWUU TUOLKS YCA JPOBO TE IZONTX BYBN T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q
 PT BOAT ONE OWE NINE LOST IN ACTION IN BLACKETT STRAIT TWO MILES SW MERESU COVE X CREW OF TWELVE X REQUEST ANY INFORMATION X

 PT BOAT ONE OWE NINE LOST IN ACION IN BLACKETT  STRAIT   TWO MILES   SW MERESU COVE X CREW OF TWELVE X REQUEST ANY INFORMATION X
 KX IEYU REB EZW EHEW RYTU HE YFSEE HE VRLKTWSQU TUOLKS Q UEY PKODT Q TE IZONTX BYBN T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q
 PT BOAT ONE OWE NINE LOST IN ACION IN BLACKETXT STRAIT X TWO MILES X SW MERESU COVE X CREW OF TWELVE X REQUEST ANY INFORMATION X
 */

