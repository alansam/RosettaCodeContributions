/* Generated from 'RFactorsOfAnInteger03.nrx' 8 Jan 2013 19:58:48 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RFactorsOfAnInteger03{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("   n = ");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RFactorsOfAnInteger03.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx num;
  netrexx.lang.Rexx j_=null;
  num=new netrexx.lang.Rexx((byte)0);
  {running:for(;;){
   netrexx.lang.RexxIO.Say("Provide an integer [or anything else to stop]:");
   {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
   num=$1[0];}
   if ((num.datatype(new netrexx.lang.Rexx('w'))).OpNot(null)) 
    break running;
   {netrexx.lang.Rexx $2=num;j_=new netrexx.lang.Rexx((byte)1);j_:for(;j_.OpLtEq(null,$2);j_=j_.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((($02.OpCcblank(null,j_.right(new netrexx.lang.Rexx((byte)6)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   divisors = "))).OpCcblank(null,factor(j_)));
    }
   }/*j_*/
   }
  }/*running*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx factor(netrexx.lang.Rexx n_){
  netrexx.lang.Rexx factors;
  netrexx.lang.Rexx x_=null;
  java.util.ArrayList fl;
  netrexx.lang.Rexx f_=null;
  factors=netrexx.lang.Rexx.toRexx("");
  factors.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx((byte)1);
  factors.getnode(n_).leaf=new netrexx.lang.Rexx((byte)1);
  {netrexx.lang.Rexx $3=new netrexx.lang.Rexx(java.lang.Math.sqrt(n_.todouble())).OpAdd(null,$03);x_=new netrexx.lang.Rexx((byte)1);x_:for(;x_.OpLtEq(null,$3);x_=x_.OpAdd(null,new netrexx.lang.Rexx(1))){
   if (n_.OpRem(null,x_).OpEq(null,$04)) 
    {
     factors.getnode(x_).leaf=new netrexx.lang.Rexx((byte)1);
     factors.getnode(n_.OpDivI(null,x_)).leaf=new netrexx.lang.Rexx((byte)1);
    }
   }
  }/*x_*/
  fl=new java.util.ArrayList();
  {int $6=0;java.util.Vector $5=new java.util.Vector(100,0);synchronized(factors){java.util.Enumeration $4=factors.keys();for(;;){if(!$4.hasMoreElements())break;$5.addElement($4.nextElement());if(!factors.testnode((netrexx.lang.Rexx)($5.elementAt($6)))){$5.removeElementAt($6);continue;}$6++;}}f_:for(;;){if(--$6<0)break;f_=(netrexx.lang.Rexx)$5.elementAt($6);
   fl.add((java.lang.Object)(netrexx.lang.Rexx.toString(f_)));
   }
  }/*f_*/
  java.util.Collections.sort((java.util.List)fl);
  return netrexx.lang.Rexx.toRexx(fl.toString());
  }
 
 private RFactorsOfAnInteger03(){return;}
 }
