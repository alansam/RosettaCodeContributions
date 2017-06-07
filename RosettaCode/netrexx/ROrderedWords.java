/* Generated from 'ROrderedWords.nrx' 22 Sep 2011 09:15:33 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */




public class ROrderedWords{
 private static final java.lang.String $0="ROrderedWords.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String unixdict;
  int wmax=0;
  java.util.ArrayList dwords=null;
  java.io.BufferedReader inrdr=null;
  netrexx.lang.Rexx dword=null;
  java.util.ListIterator witerator=null;
  java.io.IOException ex=null;
  unixdict="unixdict.txt";
  {try{
   wmax=java.lang.Integer.MIN_VALUE;
   dwords=new java.util.ArrayList();
   inrdr=new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(new java.io.File(unixdict))));
   {ln:for(;;){if(!(inrdr.ready()))break;
    dword=(new netrexx.lang.Rexx(inrdr.readLine())).strip();
    if (isOrdered(netrexx.lang.Rexx.toString(dword))) 
     {
      dwords.add((java.lang.Object)dword);
      if ((dword.length()).OpGt(null,new netrexx.lang.Rexx(wmax))) 
       wmax=(dword.length()).toint();
     }
    }
   }/*ln*/
   inrdr.close();
   
   witerator=dwords.listIterator();
   {wd:for(;;){if(!(witerator.hasNext()))break;
    dword=(netrexx.lang.Rexx)(witerator.next());
    if ((dword.length()).OpLt(null,new netrexx.lang.Rexx(wmax))) 
     {
      witerator.remove();
     }
    }
   }/*wd*/
   dwords.trimToSize();
   
   netrexx.lang.RexxIO.Say(dwords.toString());
  }
  catch (java.io.IOException $1){ex=$1;
   ex.printStackTrace();
  }}
  
  return;
  }

 
 protected static boolean isOrdered(java.lang.String dword){
  char wchars[];
  wchars=dword.toCharArray();
  java.util.Arrays.sort(wchars);
  return dword.equalsIgnoreCase(new java.lang.String(wchars));
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private ROrderedWords(){return;}
 }
