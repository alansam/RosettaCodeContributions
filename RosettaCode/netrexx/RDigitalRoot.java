/* Generated from 'RDigitalRoot.nrx' 6 Nov 2015 22:43:21 [v3.04] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx ************************************************************
* Test digroot
**********************************************************************/



public class RDigitalRoot{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("expected:");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("->");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("");
 private static final char[] $06={4,1,1,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RDigitalRoot.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say("number -> digital_root persistence");
  test_digroot(new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)7),new netrexx.lang.Rexx((byte)0));
  test_digroot(new netrexx.lang.Rexx(627615),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)2));
  test_digroot(new netrexx.lang.Rexx(39390),new netrexx.lang.Rexx((byte)6),new netrexx.lang.Rexx((byte)2));
  test_digroot(new netrexx.lang.Rexx(588225),new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)2));
  test_digroot(new netrexx.lang.Rexx("393900588225"),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)2));
  test_digroot(new netrexx.lang.Rexx("393900588225"),new netrexx.lang.Rexx((byte)9),new netrexx.lang.Rexx((byte)3));/* test error case */
  return;}

 
 public static void test_digroot(netrexx.lang.Rexx n,netrexx.lang.Rexx dx,netrexx.lang.Rexx px){
  netrexx.lang.Rexx res;
  netrexx.lang.Rexx d=null;
  netrexx.lang.Rexx p=null;
  netrexx.lang.Rexx tag=null;
  res=digroot(n);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(res,$01,$1);
  d=$1[0];p=$1[1];}
  if (d.OpEq(null,dx)&p.OpEq(null,px)) 
   tag=netrexx.lang.Rexx.toRexx("ok");
  else 
   tag=($02.OpCcblank(null,dx)).OpCcblank(null,px);
  netrexx.lang.RexxIO.Say((((n.OpCcblank(null,$03)).OpCcblank(null,d)).OpCcblank(null,p)).OpCcblank(null,tag));
  return;}

 
 public static netrexx.lang.Rexx digroot(netrexx.lang.Rexx n){
  netrexx.lang.Rexx p;
  netrexx.lang.Rexx s=null;
  netrexx.lang.Rexx c=null;
  /**********************************************************************
  * Compute the digital root and persistence of the given decimal number
  * 19.08.2012 Walter Pachl derived from Rexx
  **************************** Bottom of Data **************************/
  p=new netrexx.lang.Rexx((byte)0);/* persistence                   */
  {for(;;){if(!(n.length()).OpGt(null,$04))break;/* more than one digit in n      */
   s=new netrexx.lang.Rexx((byte)0);/* initialize sum                */
   p=p.OpAdd(null,$04);/* increment persistence         */
   {for(;;){if(!n.OpNotEq(null,$05))break;/* as long as there are digits   */
    {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(n,$06,$2);
    c=$2[0];n=$2[1];}/* pick the first one            */
    s=s.OpAdd(null,c);/* add to the new sum            */
    }
   }
   n=s;/* the 'new' number              */
   }
  }
  return n.OpCcblank(null,p);/* return root and persistence   */
  }
 
 private RDigitalRoot(){return;}
 }
