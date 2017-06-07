/* Generated from 'RURLEncode.nrx' 29 Jun 2012 23:43:13 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */

/* ========================================================================== */

/*
http%3A%2F%2Ffoo%20bar%2F
http://foo bar/

mailto%3A%22Ivan%20Aim%22%20%3Civan%2Eaim%40email%2Ecom%3E
mailto:"Ivan Aim" <ivan.aim@email.com>

%6D%61%69%6C%74%6F%3A%22%49%72%6D%61%20%55%73%65%72%22%20%3C%69%72%6D%61%2E%75%73%65%72%40%6D%61%69%6C%2E%63%6F%6D%3E
mailto:"Irma User" <irma.user@mail.com>
*/

/* -------------------------------------------------------------------------- */

public class RURLEncode{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final char[] $02={4,1,1,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("HTML5");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('%');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RURLEncode.nrx";
 
 public static void main(java.lang.String $0s[]){
  testcase();
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("RFC3986");
  testcase(netrexx.lang.Rexx.toRexx("RFC3986"));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("HTML5");
  testcase(netrexx.lang.Rexx.toRexx("HTML5"));
  netrexx.lang.RexxIO.Say("");
  return;
  }

 /* -------------------------------------------------------------------------- */
 
 public static netrexx.lang.Rexx encode(netrexx.lang.Rexx url,netrexx.lang.Rexx varn){
  netrexx.lang.Rexx variation;
  netrexx.lang.Rexx opts;
  netrexx.lang.Rexx rp;
  netrexx.lang.Rexx tc=null;
  
  variation=varn.upper();
  opts=netrexx.lang.Rexx.toRexx("");
  opts.getnode(netrexx.lang.Rexx.toRexx("RFC3986")).leaf=netrexx.lang.Rexx.toRexx("-._~");
  opts.getnode(netrexx.lang.Rexx.toRexx("HTML5")).leaf=netrexx.lang.Rexx.toRexx("-._*");
  //res = "!*'();:@&=+$,/?#[]"
  
  rp=netrexx.lang.Rexx.toRexx("");
  {for(;;){if(!(url.length()).OpGt(null,$01))break;
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(url,$02,$1);
   tc=$1[0];url=$1[1];}
   {/*select*/
   if ((tc.datatype(new netrexx.lang.Rexx('A'))).toboolean())
    {
     rp=rp.OpCc(null,tc);
    }
   else if (tc.OpEqS(null,$03))
    {
     if (variation.OpEq(null,$04)) 
      rp=rp.OpCc(null,$05);
     else 
      rp=(rp.OpCc(null,$06)).OpCc(null,tc.c2x());
    }
   else{
    {
     if ((opts.getnode(variation).leaf.pos(tc)).OpGt(null,$01)) 
      {
       rp=rp.OpCc(null,tc);
      }
     else 
      {
       rp=(rp.OpCc(null,$06)).OpCc(null,tc.c2x());
      }
    }
   }
   }
   }
  }
  
  return rp;
  }

 /* -------------------------------------------------------------------------- */
 
 public static void testcase(){
  testcase(netrexx.lang.Rexx.toRexx(""));return;
  }
 public static void testcase(netrexx.lang.Rexx variation){
  netrexx.lang.Rexx url[];
  netrexx.lang.Rexx i_=null;
  
  url=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("http://foo bar/"),netrexx.lang.Rexx.toRexx("mailto:\"Ivan Aim\" <ivan.aim@email.com>"),netrexx.lang.Rexx.toRexx("mailto:\"Irma User\" <irma.user@mail.com>"),netrexx.lang.Rexx.toRexx("http://foo.bar.com/~user-name/_subdir/*~.html")};
  
  
  
  
  
  
  {netrexx.lang.Rexx $2=new netrexx.lang.Rexx(url.length).OpSub(null,$07);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$2);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(url[i_.toint()]);
   netrexx.lang.RexxIO.Say(encode(url[i_.toint()],variation));
   }
  }/*i_*/
  
  return;
  }
 
 private RURLEncode(){return;}
 }
/* ========================================================================== */

