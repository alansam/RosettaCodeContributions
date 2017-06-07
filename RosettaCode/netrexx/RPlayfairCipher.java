/* Generated from 'RPlayfairCipher.nrx' 13 Nov 2013 08:03:19 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RPlayfairCipher{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('D');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final char[] $03={4,1,1,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('Q');
 private static final char[] $011={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(2);
 private static final char[] $013={4,1,2,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx('I');
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx('J');
 private static final char[] $016={4,1,10,10,1,0,1,10,1,1,0};
 private static final char[] $017={1,10,4,0,1,2,3,0};
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx('E');
 private static final char[] $020={2,1,124,10,1,0,2,1,124,10,1,1,1,10,1,2,0};
 private static final java.lang.String $0="RPlayfairCipher.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx cipher(netrexx.lang.Rexx km,netrexx.lang.Rexx d_,netrexx.lang.Rexx digraphs){
  netrexx.lang.Rexx cipherText;
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
  if ((d_.upper()).OpEq(null,$01)) 
   d_=$02.OpMinus(null); // encode or decode
  else 
   d_=$02.OpPlus(null);
  cipherText=netrexx.lang.Rexx.toRexx("");
  {netrexx.lang.Rexx $1=digraphs.words();dw=new netrexx.lang.Rexx((byte)1);dw:for(;dw.OpLtEq(null,$1);dw=dw.OpAdd(null,new netrexx.lang.Rexx(1))){
   // process the digraphs one at a time
   digraph=digraphs.word(dw);
   cl=netrexx.lang.Rexx.toRexx("");
   cr=netrexx.lang.Rexx.toRexx("");
   // get each letter from the digraph
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(digraph,$03,$2);
   dl=$2[0];dr=$2[1];}
   {netrexx.lang.Rexx $3=km.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$3);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!((cl.OpCcblank(null,cr)).words()).OpLt(null,$04))break;
    // locate the row/col of each letter in the cipher matrix
    clx=km.getnode(r_).leaf.wordpos(dl);
    crx=km.getnode(r_).leaf.wordpos(dr);
    if (clx.OpGt(null,$05)) 
     cl=r_.OpCcblank(null,clx);
    if (crx.OpGt(null,$05)) 
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
     if (clx.OpGt(null,$06)) 
      clx=new netrexx.lang.Rexx((byte)1); // wrap
     if (crx.OpGt(null,$06)) 
      crx=new netrexx.lang.Rexx((byte)1);
     if (clx.OpLt(null,$02)) 
      clx=new netrexx.lang.Rexx((byte)5);
     if (crx.OpLt(null,$02)) 
      crx=new netrexx.lang.Rexx((byte)5);
     cy=(km.getnode(rx).leaf.word(clx)).OpCc(null,km.getnode(rx).leaf.word(crx));
     cipherText=cipherText.OpCcblank(null,cy);
    }
   else if ((cl.word(new netrexx.lang.Rexx((byte)2))).OpEq(null,cr.word(new netrexx.lang.Rexx((byte)2))))
    {
     // a column
     ptype=netrexx.lang.Rexx.toRexx("column");
     cx=cl.word(new netrexx.lang.Rexx((byte)2));
     rlx=(cl.word(new netrexx.lang.Rexx((byte)1))).OpAdd(null,d_);
     rrx=(cr.word(new netrexx.lang.Rexx((byte)1))).OpAdd(null,d_);
     if (rlx.OpGt(null,$06)) 
      rlx=new netrexx.lang.Rexx((byte)1); // wrap
     if (rrx.OpGt(null,$06)) 
      rrx=new netrexx.lang.Rexx((byte)1);
     if (rlx.OpLt(null,$02)) 
      rlx=new netrexx.lang.Rexx((byte)5);
     if (rrx.OpLt(null,$02)) 
      rrx=new netrexx.lang.Rexx((byte)5);
     cy=(km.getnode(rlx).leaf.word(cx)).OpCc(null,km.getnode(rrx).leaf.word(cx));
     cipherText=cipherText.OpCcblank(null,cy);
    }
   else{
    {
     // a rectangle
     ptype=netrexx.lang.Rexx.toRexx("rectangle");
     r1=cl.word(new netrexx.lang.Rexx((byte)1));
     r2=cr.word(new netrexx.lang.Rexx((byte)1));
     cy=(km.getnode(r1).leaf.word(cr.word(new netrexx.lang.Rexx((byte)2)))).OpCc(null,km.getnode(r2).leaf.word(cl.word(new netrexx.lang.Rexx((byte)2))));
     cipherText=cipherText.OpCcblank(null,cy);
    }
   }
   }
   netrexx.lang.RexxIO.Say(((((((digraph.OpCcblank(null,cl)).OpCc(null,$07)).OpCcblank(null,cr)).OpCcblank(null,$08)).OpCcblank(null,cy)).OpCcblank(null,$08)).OpCcblank(null,ptype));
   }
  }/*dw*/
  return cipherText.strip();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx encipher(netrexx.lang.Rexx km,netrexx.lang.Rexx digraphs){
  return cipher(km,new netrexx.lang.Rexx('E'),digraphs);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx decipher(netrexx.lang.Rexx km,netrexx.lang.Rexx digraphs){
  return cipher(km,new netrexx.lang.Rexx('D'),digraphs);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getDigraphs(netrexx.lang.Rexx text,netrexx.lang.Rexx IorQ,netrexx.lang.Rexx ED){
  netrexx.lang.Rexx a2z;
  netrexx.lang.Rexx eks=null;
  netrexx.lang.Rexx tp;
  netrexx.lang.Rexx rtext;
  netrexx.lang.Rexx ll;
  netrexx.lang.Rexx lc=null;
  netrexx.lang.Rexx sc=null;
  netrexx.lang.Rexx digraphs;
  netrexx.lang.Rexx digraph=null;
  a2z=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  if ((ED.upper()).OpNotEq(null,$01)) 
   eks=new netrexx.lang.Rexx('X');
  else 
   eks=netrexx.lang.Rexx.toRexx("");
  tp=text.upper().translate(netrexx.lang.Rexx.toRexx(""),a2z);
  text=text.upper().translate(new netrexx.lang.Rexx(' ').copies(tp.length()),tp).space(new netrexx.lang.Rexx((byte)0));
  rtext=netrexx.lang.Rexx.toRexx("");
  ll=netrexx.lang.Rexx.toRexx("");
  
  {for(;;){if(!text.OpNotEq(null,$09))break;
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(text,$03,$4);
   lc=$4[0];text=$4[1];}
   if (ll.OpNotEq(null,lc)) 
    rtext=rtext.OpCc(null,lc);
   else 
    rtext=(rtext.OpCc(null,eks)).OpCc(null,lc);
   ll=lc;
   }
  }
  
  // I == J or remove Q fixup
  if (IorQ.OpNotEq(null,$010)) 
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(netrexx.lang.Rexx.toRexx("J I"),$011,$5);
   IorQ=$5[0];sc=$5[1];}
  else 
   sc=netrexx.lang.Rexx.toRexx("");
  
  rtext=rtext.changestr(IorQ,sc);
  if ((rtext.length()).OpRem(null,$012).OpNotEq(null,$05)) 
   rtext=rtext.OpCc(null,eks);
  digraphs=netrexx.lang.Rexx.toRexx("");
  {for(;;){if(!rtext.OpNotEq(null,$09))break;
   {netrexx.lang.Rexx $6[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(rtext,$013,$6);
   digraph=$6[0];rtext=$6[1];}
   digraphs=digraphs.OpCcblank(null,digraph);
   }
  }
  return digraphs.space();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getKey(netrexx.lang.Rexx key,netrexx.lang.Rexx IorQ){
  netrexx.lang.Rexx a2z;
  netrexx.lang.Rexx kp;
  netrexx.lang.Rexx kr;
  netrexx.lang.Rexx xx=null;
  a2z=netrexx.lang.Rexx.toRexx("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  kp=(key.OpCc(null,a2z)).upper();
  kr=netrexx.lang.Rexx.toRexx("");
  {$8:for(;;){if(!kp.OpNotEq(null,$09))break;
   {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(kp,$03,$7);
   xx=$7[0];kp=$7[1];}
   if ((xx.datatype(new netrexx.lang.Rexx('u'))).OpNot(null)) 
    continue $8;
   kr=kr.OpCcblank(null,xx);
   kp=kp.changestr(xx,netrexx.lang.Rexx.toRexx(""));
   }
  }
  
  if ((IorQ.OpEq(null,$014)|IorQ.OpEq(null,$015))|IorQ.OpEq(null,$09)) 
   kr=kr.changestr(new netrexx.lang.Rexx('J'),netrexx.lang.Rexx.toRexx(""));
  else 
   kr=kr.changestr(new netrexx.lang.Rexx('Q'),netrexx.lang.Rexx.toRexx(""));
  
  return kr.space();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getKeyMatrix(netrexx.lang.Rexx kr){
  netrexx.lang.Rexx km;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx kp=null;
  km=netrexx.lang.Rexx.toRexx("");
  {r_=new netrexx.lang.Rexx((byte)1);r_:for(;;r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!kr.OpNotEq(null,$09))break;
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(kr,$016,$9);
   kp=$9[0];kr=$9[1];}
   km.getnode(new netrexx.lang.Rexx((byte)0)).leaf=r_;
   km.getnode(r_).leaf=kp;
   }
  }/*r_*/
  return km;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void showKeyMatrix(netrexx.lang.Rexx km){
  netrexx.lang.Rexx r_=null;
  {netrexx.lang.Rexx $10=km.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)1);r_:for(;r_.OpLtEq(null,$10);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((r_.right(new netrexx.lang.Rexx((byte)2))).OpCcblank(null,km.getnode(r_).leaf));
   }
  }/*r_*/
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ciph=null;
  netrexx.lang.Rexx IorQ=null;
  netrexx.lang.Rexx key=null;
  netrexx.lang.Rexx text=null;
  netrexx.lang.Rexx kr;
  netrexx.lang.Rexx km;
  netrexx.lang.Rexx digraphs;
  netrexx.lang.Rexx key_pairs[];
  netrexx.lang.Rexx kp=null;
  netrexx.lang.Rexx cipher=null;
  netrexx.lang.Rexx ct=null;
  netrexx.lang.Rexx mt=null;
  {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[4];
  netrexx.lang.RexxParse.parse(arg,$017,$11);
  ciph=$11[0];IorQ=$11[1];key=$11[2];text=$11[3];}
  if (ciph.OpEq(null,$09)|ciph.OpEq(null,$018)) 
   ciph=new netrexx.lang.Rexx('E');
  if (IorQ.OpEq(null,$09)|IorQ.OpEq(null,$018)) 
   IorQ=new netrexx.lang.Rexx('I');
  if (key.OpEq(null,$09)|key.OpEq(null,$018)) 
   key=netrexx.lang.Rexx.toRexx("plugh_xyzzy");
  if (text.OpEq(null,$09)|text.OpEq(null,$018)) 
   text=netrexx.lang.Rexx.toRexx("NetRexx; not just a programing language for kings & queens!");
  // Playfair example
  // 'Hide the gold in the tree stump!'
  // J.F. Kennedy's signal
  // ROYAL NEW ZEALAND NAVY
  // KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWTT TUOLKS YCA JPOBO TE IZONTX BYBW T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q
  
  kr=getKey(key.space(new netrexx.lang.Rexx((byte)0)),IorQ);
  netrexx.lang.RexxIO.Say((((IorQ.OpCcblank(null,$08)).OpCcblank(null,kr)).OpCc(null,$07)).OpCcblank(null,kr.words()));
  km=getKeyMatrix(kr);
  showKeyMatrix(km);
  
  digraphs=getDigraphs(text,IorQ,ciph);
  if ((IorQ.upper()).OpEq(null,$010)) 
   digraphs=digraphs.changestr(new netrexx.lang.Rexx('Q'),new netrexx.lang.Rexx('K')); // fixup for a Q in the text
  netrexx.lang.RexxIO.Say(text);
  netrexx.lang.RexxIO.Say((((IorQ.OpCcblank(null,$08)).OpCcblank(null,digraphs)).OpCc(null,$07)).OpCcblank(null,digraphs.words()));
  if ((ciph.upper()).OpEq(null,$019)) 
   netrexx.lang.RexxIO.Say(encipher(km,digraphs));
  else 
   netrexx.lang.RexxIO.Say(decipher(km,digraphs));
  
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say($08.copies(new netrexx.lang.Rexx((byte)120)));
  key_pairs=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("plugh_xyzzy | NetRexx; not just a programing language for kings & queens! | ."),netrexx.lang.Rexx.toRexx("Playfair example | Hide the gold in the tree stump! | ."),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY | . | KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWTT TUOLKS YCA JPOBO TE IZONTX BYBW T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q"),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY | . | KX JEYU REB EZW EHEW RYTU HE YFSKRE HE GOYFIWUU TUOLKS YCA JPOBO TE IZONTX BYBN T GONE YC UZWRGD S ONSXBOU YWR HEBAAHYUSED Q"),netrexx.lang.Rexx.toRexx("ROYAL NEW ZEALAND NAVY | PT BOAT ONE OWE NINE LOST IN ACION IN BLACKETT STRAIT TWO MILES SW MERESU COVE X CREW OF TWELVE X REQUEST ANY INFORMATION X | .")};
  
  
  
  
  
  
  {int $14=0;netrexx.lang.Rexx[] $13=new netrexx.lang.Rexx[key_pairs.length];synchronized(key_pairs){for(;;){if($14==$13.length)break;$13[$14]=key_pairs[key_pairs.length-1-$14];$14++;}}kp:for(;;){if(--$14<0)break;kp=(netrexx.lang.Rexx)$13[$14];
   {netrexx.lang.Rexx $15[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(kp,$020,$15);
   key=$15[0];text=$15[1];cipher=$15[2];}
   key=key.strip();
   text=text.strip();
   cipher=cipher.strip();
   kr=getKey(key.space(new netrexx.lang.Rexx((byte)0)),new netrexx.lang.Rexx('I'));
   km=getKeyMatrix(kr);
   showKeyMatrix(km);
   if (text.OpNotEq(null,$018)) 
    {
     digraphs=getDigraphs(text,new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('E'));
     ct=encipher(km,digraphs);
     digraphs=getDigraphs(ct,new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('D'));
     mt=decipher(km,digraphs);
    }
   else 
    {
     digraphs=getDigraphs(cipher,new netrexx.lang.Rexx('I'),new netrexx.lang.Rexx('D'));
     text=cipher;
     ct=new netrexx.lang.Rexx('.');
     mt=decipher(km,digraphs);
    }
   netrexx.lang.RexxIO.Say(text);
   netrexx.lang.RexxIO.Say(ct);
   netrexx.lang.RexxIO.Say(mt);
   }
  }/*kp*/
  
  return;
  }
 
 private RPlayfairCipher(){return;}
 }
