/* Generated from 'RURLDecode.nrx' 19 Jul 2011 09:51:49 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/**
 * <h3>URL decoding</h3>
 * <p>
 * This task (the reverse of <a href="http://rosettacode.org/wiki/URL_encoding">URL encoding</a>)
 * is to provide a function or mechanism to convert a url-encoded string into its original unencoded form.
 * </p>
 * <h5>Example</h5>
 * <p>
 * The encoded string "http%3A%2F%2Ffoo%20bar%2F" should be reverted to the unencoded form "http://foo bar/".
 * </p>
 *
 * @author alansampson : <a href="mailto%3A%22Alan%20Sampson%22%20%3Calansamps%40gmail%2Ecom%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/URL_decoding">rosettacode.org/wiki/URL_decoding</a>
 */


public class RURLDecode{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final char[] $04={6,1,10,1,0,4,1,1,4,1,2,10,1,2,1,10,1,3,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RURLDecode.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx url[];
  netrexx.lang.Rexx u_=null;
  url=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("http%3A%2F%2Ffoo%20bar%2F"),netrexx.lang.Rexx.toRexx("mailto%3A%22Ivan%20Aim%22%20%3Civan%2Eaim%40email%2Ecom%3E"),netrexx.lang.Rexx.toRexx("%6D%61%69%6C%74%6F%3A%22%49%72%6D%61%20%55%73%65%72%22%20%3C%69%72%6D%61%2E%75%73%65%72%40%6D%61%69%6C%2E%63%6F%6D%3E")};
  
  
  
  
  
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(url.length).OpSub(null,$01);u_=new netrexx.lang.Rexx((byte)0);u_:for(;u_.OpLtEq(null,$1);u_=u_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(url[u_.toint()]);
   netrexx.lang.RexxIO.Say(DecodeURL(url[u_.toint()]));
   netrexx.lang.RexxIO.Say("");
   }
  }/*u_*/
  
  return;
  }

 
 public static netrexx.lang.Rexx DecodeURL(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx encoded=null;
  netrexx.lang.Rexx decoded;
  netrexx.lang.Rexx PCT;
  netrexx.lang.Rexx head=null;
  netrexx.lang.Rexx code=null;
  netrexx.lang.Rexx tail=null;
  
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse(arg,$02,$2);
  encoded=$2[0];}
  decoded=netrexx.lang.Rexx.toRexx("");
  PCT=new netrexx.lang.Rexx('%');
  
  {e_:for(;;){if(!(encoded.length()).OpGt(null,$03))break;
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[4];
   $3[1]=PCT;
   netrexx.lang.RexxParse.parse(encoded,$04,$3);
   head=$3[0];code=$3[2];tail=$3[3];}
   decoded=decoded.OpCc(null,head);
   {/*select*/
   if (new netrexx.lang.Rexx((code.strip(new netrexx.lang.Rexx('T')).length()).OpEq(null,$05)).OpAnd(null,code.datatype(new netrexx.lang.Rexx('X'))))
    {
     code=code.x2c();
     decoded=decoded.OpCc(null,code);
    }
   else if ((code.strip(new netrexx.lang.Rexx('T')).length()).OpNotEq(null,$03))
    {
     decoded=decoded.OpCc(null,PCT);
     tail=code.OpCc(null,tail);
    }
   else{
    {
     ;
    }
   }
   }
   encoded=tail;
   }
  }/*e_*/
  
  return decoded;
  }
 
 private RURLDecode(){return;}
 }
