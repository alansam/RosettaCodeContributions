/* Generated from 'RWebScraping.nrx' 17 Jul 2012 16:25:44 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RWebScraping{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final char[] $03={2,1,62,10,1,0,2,3,85,84,67,10,1,1,3,0,10,1,0,2,1,62,10,1,0,2,1,44,10,1,0,2,3,85,84,67,10,1,2,1,10,1,0,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("UTC");
 private static final java.lang.String $0="RWebScraping.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx full_short=null;
  boolean dateFull=false;
  java.net.URL timeURL=null;
  java.net.URLConnection conn=null;
  java.io.BufferedReader ibr=null;
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx udatetime=null;
  netrexx.lang.Rexx utime=null;
  java.io.IOException ex=null;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  full_short=$1[0];}
  if (netrexx.lang.Rexx.toRexx("FULL").abbrev(full_short.upper(),new netrexx.lang.Rexx((byte)1)).toboolean()) 
   dateFull=isTrue();
  else 
   dateFull=isFalse();
  {try{
   timeURL=new java.net.URL("http://tycho.usno.navy.mil/cgi-bin/timer.pl");
   conn=timeURL.openConnection();
   ibr=new java.io.BufferedReader((java.io.Reader)(new java.io.InputStreamReader(conn.getInputStream())));
   
   {readLoop:for(;;){if(!(ibr.ready()))break;
    line=netrexx.lang.Rexx.toRexx(ibr.readLine());
    if (line==null) 
     break readLoop;
    line=line.translate(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('\t'));
    if ((line.wordpos(netrexx.lang.Rexx.toRexx("UTC"))).OpGt(null,$02)) 
     {
      {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[3];
      netrexx.lang.RexxParse.parse(line,$03,$2);
      udatetime=$2[1];utime=$2[2];}
      
      if (dateFull) 
       netrexx.lang.RexxIO.Say((udatetime.strip()).OpCcblank(null,$04));
      else 
       netrexx.lang.RexxIO.Say(utime.strip());
      break readLoop;
     }
    }
   }/*readLoop*/
   ibr.close();
  }
  catch (java.io.IOException $3){ex=$3;
   ex.printStackTrace();
  }}
  return;}

 
 public static final boolean isTrue(){
  return 1==1;
  }
 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RWebScraping(){return;}
 }
