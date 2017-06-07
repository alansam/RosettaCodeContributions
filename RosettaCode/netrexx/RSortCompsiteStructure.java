/* Generated from 'RSortCompsiteStructure.nrx' 5 Mar 2013 20:15:26 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


// =============================================================================

public class RSortCompsiteStructure{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(']');
 private static final java.lang.String $0="RSortCompsiteStructure.nrx";
  private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('(');
  private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(')');

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  RSortCompsiteStructure.PairBean places[];
  places=new RSortCompsiteStructure.PairBean[]{new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("London"),netrexx.lang.Rexx.toRexx("UK")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("New York"),netrexx.lang.Rexx.toRexx("US")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Boston"),netrexx.lang.Rexx.toRexx("US")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Washington"),netrexx.lang.Rexx.toRexx("US")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Washington"),netrexx.lang.Rexx.toRexx("UK")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Birmingham"),netrexx.lang.Rexx.toRexx("US")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Birmingham"),netrexx.lang.Rexx.toRexx("UK")),new RSortCompsiteStructure.PairBean(netrexx.lang.Rexx.toRexx("Boston"),netrexx.lang.Rexx.toRexx("UK"))};
  
  
  
  
  
  netrexx.lang.RexxIO.Say(displayArray(places));
  java.util.Arrays.sort((java.lang.Object[])places,(java.util.Comparator)(new RSortCompsiteStructure.PairComparator()));
  netrexx.lang.RexxIO.Say(displayArray(places));
  return;
  }

 
 public static final netrexx.lang.Rexx displayArray(RSortCompsiteStructure.PairBean harry[]){
  netrexx.lang.Rexx disp;
  RSortCompsiteStructure.PairBean elmt=null;
  disp=netrexx.lang.Rexx.toRexx("");
  {int $3=0;RSortCompsiteStructure.PairBean[] $2=new RSortCompsiteStructure.PairBean[harry.length];synchronized(harry){for(;;){if($3==$2.length)break;$2[$3]=harry[harry.length-1-$3];$3++;}}elmt:for(;;){if(--$3<0)break;elmt=(RSortCompsiteStructure.PairBean)$2[$3];
   disp=(disp.OpCc(null,$01)).OpCc(null,new netrexx.lang.Rexx(java.lang.String.valueOf(elmt)));
   }
  }/*elmt*/
  return ($02.OpCc(null,disp.substr(new netrexx.lang.Rexx((byte)2)))).OpCc(null,$03); // trim leading comma
  }
 
 private RSortCompsiteStructure(){return;}

// =============================================================================
 
 static class PairBean{
  private final transient java.lang.String $0="RSortCompsiteStructure.nrx";
  /* properties indirect */
  private netrexx.lang.Rexx name;
  private netrexx.lang.Rexx value;

  
  public PairBean(netrexx.lang.Rexx name_,netrexx.lang.Rexx value_){super();
   this.setName(name_);
   this.setValue(value_);
   return;
   }
  
  public java.lang.String toString(){
   return netrexx.lang.Rexx.toString(((($04.OpCc(null,this.getName())).OpCc(null,$01)).OpCc(null,this.getValue())).OpCc(null,$05));
   }
  
  public netrexx.lang.Rexx getName(){return name;}
  
  public void setName(netrexx.lang.Rexx $1){name=$1;return;}
  
  public netrexx.lang.Rexx getValue(){return value;}
  
  public void setValue(netrexx.lang.Rexx $2){value=$2;return;}
  }

 // =============================================================================
 
 static class PairComparator implements java.util.Comparator{
  private final transient java.lang.String $0="RSortCompsiteStructure.nrx";

  
  public int compare(java.lang.Object lft,java.lang.Object rgt){
   int cRes=0;
   java.lang.String lName=null;
   java.lang.String rName=null;
   java.lang.String lVal=null;
   java.lang.String rVal=null;
  
   if ((lft instanceof RSortCompsiteStructure.PairBean)||(rgt instanceof RSortCompsiteStructure.PairBean)) 
    {
     lName=netrexx.lang.Rexx.toString(((RSortCompsiteStructure.PairBean)lft).getName());
     rName=netrexx.lang.Rexx.toString(((RSortCompsiteStructure.PairBean)rgt).getName());
     cRes=lName.compareTo(rName);
     if (cRes==0) 
      {
       lVal=netrexx.lang.Rexx.toString(((RSortCompsiteStructure.PairBean)lft).getValue());
       rVal=netrexx.lang.Rexx.toString(((RSortCompsiteStructure.PairBean)rgt).getValue());
       cRes=lVal.compareTo(rVal);
      }
    }
   else 
    throw new java.lang.IllegalArgumentException("Arguments must be of type PairBean");
   return cRes;
   }
  
  public PairComparator(){return;}
 }}
