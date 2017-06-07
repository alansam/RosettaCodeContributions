/* Generated from 'RSortCustomComparator.nrx' 5 Mar 2013 19:10:23 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// =============================================================================

public class RSortCustomComparator{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortCustomComparator.nrx";

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  java.lang.String sample[];
  sample=new java.lang.String[]{"Here","are","some","sample","strings","to","be","sorted"};
  netrexx.lang.RexxIO.Say(displayArray(sample));
  java.util.Arrays.sort((java.lang.Object[])sample,(java.util.Comparator)(new RSortCustomComparator.LengthComparator()));
  netrexx.lang.RexxIO.Say(displayArray(sample));
  return;
  }

 
 public static final netrexx.lang.Rexx displayArray(java.lang.String harry[]){
  netrexx.lang.Rexx disp;
  java.lang.String elmt=null;
  disp=netrexx.lang.Rexx.toRexx("");
  {int $3=0;java.lang.String[] $2=new java.lang.String[harry.length];synchronized(harry){for(;;){if($3==$2.length)break;$2[$3]=harry[harry.length-1-$3];$3++;}}elmt:for(;;){if(--$3<0)break;elmt=(java.lang.String)$2[$3];
   disp=(disp.OpCc(null,$01)).OpCc(null,netrexx.lang.Rexx.toRexx(elmt));
   }
  }/*elmt*/
  return ($02.OpCc(null,disp.substr(new netrexx.lang.Rexx((byte)2)))).OpCc(null,$03); // trim leading comma
  }
 
 private RSortCustomComparator(){return;}

// =============================================================================
 
 static class LengthComparator implements java.util.Comparator{
  private final transient java.lang.String $0="RSortCustomComparator.nrx";

 
  
  public int compare(java.lang.Object lft,java.lang.Object rgt){
   int cRes=0;
  
   if ((lft instanceof java.lang.String)||(rgt instanceof java.lang.String)) 
    {
     cRes=(((java.lang.String)rgt).length())-(((java.lang.String)lft).length());
     if (cRes==0) 
      cRes=((java.lang.String)lft).compareToIgnoreCase((java.lang.String)rgt);
    }
   else 
    throw new java.lang.IllegalArgumentException("Arguments must be Strings");
   return cRes;
   }
  
  public LengthComparator(){return;}
 }}
