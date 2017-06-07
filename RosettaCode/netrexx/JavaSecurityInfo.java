/* Generated from 'JavaSecurityInfo.nrx' 29 Nov 2012 09:42:39 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class JavaSecurityInfo{
 private static final java.lang.String $0="JavaSecurityInfo.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.util.List providers;
  java.security.Provider pv=null;
  java.util.Set keys=null;
  java.lang.Object key=null;
  providers=java.util.Arrays.asList((java.lang.Object[])(java.security.Security.getProviders()));
  
  
  {int $3=0;java.lang.Object[] $2=new java.lang.Object[providers.size()];synchronized(providers){java.util.Iterator $1=providers.iterator();for(;;){if($3==$2.length)break;$2[$3]=$1.next();$3++;}}pv:for(;;){if(--$3<0)break;pv=(java.security.Provider)((java.lang.Object)$2[$3]);
   netrexx.lang.RexxIO.Say(pv.toString());
   netrexx.lang.RexxIO.Say(pv.getName());
   netrexx.lang.RexxIO.Say(pv.getVersion());
   netrexx.lang.RexxIO.Say(pv.getInfo());
   keys=pv.keySet();
   {int $6=0;java.lang.Object[] $5=new java.lang.Object[keys.size()];synchronized(keys){java.util.Iterator $4=keys.iterator();for(;;){if($6==$5.length)break;$5[$6]=$4.next();$6++;}}key:for(;;){if(--$6<0)break;key=(java.lang.Object)$5[$6];
    netrexx.lang.RexxIO.Say("  "+key.toString());
    }
   }/*key*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*pv*/
  
  return;
  }
 
 private JavaSecurityInfo(){return;}
 }
