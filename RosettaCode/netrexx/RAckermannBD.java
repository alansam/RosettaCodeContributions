/* Generated from 'RAckermannBD.nrx' 16 Jul 2011 13:17:37 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */





// needed to report the run-time


public class RAckermannBD{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)10);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("A(");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("):");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RAckermannBD.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nanoFactor;
  long t1;
  netrexx.lang.Rexx m_=null;
  netrexx.lang.Rexx n_=null;
  long t2;
  netrexx.lang.Rexx td;
  nanoFactor=$02.OpPow($1,$03);
  
  t1=java.lang.System.nanoTime();
  {m_=new netrexx.lang.Rexx((byte)0);m_:for(;m_.OpLtEq($1,$04);m_=m_.OpAdd($1,new netrexx.lang.Rexx(1))){
   {n_=new netrexx.lang.Rexx((byte)0);n_:for(;n_.OpLtEq($1,$05);n_=n_.OpAdd($1,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((((($06.OpCc($1,m_.right(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$07)).OpCc($1,n_.right(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)0)))).OpCc($1,$08)).OpCcblank($1,netrexx.lang.Rexx.toRexx(A(java.math.BigDecimal.valueOf(m_.tolong()),java.math.BigDecimal.valueOf(n_.tolong())).toString())));
    }
   }/*n_*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*m_*/
  t2=java.lang.System.nanoTime();
  td=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Run time in seconds:").OpCcblank($1,td.OpDiv($1,nanoFactor)));
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 public static java.math.BigDecimal A(java.math.BigDecimal m,java.math.BigDecimal n){
  java.math.BigDecimal ar=null;
  
  
  {/*select*/
  if (new netrexx.lang.Rexx(m.compareTo(java.math.BigDecimal.ZERO)).OpEq($1,$09))
   ar=n.add(java.math.BigDecimal.ONE);/* m = 0 */
  else if (new netrexx.lang.Rexx(m.compareTo(java.math.BigDecimal.ZERO)).OpEq($1,$010)&new netrexx.lang.Rexx(n.compareTo(java.math.BigDecimal.ZERO)).OpEq($1,$09))
   ar=A(m.subtract(java.math.BigDecimal.ONE),java.math.BigDecimal.ONE);/* m > = & n = 0 */
  else if (new netrexx.lang.Rexx(m.compareTo(java.math.BigDecimal.ZERO)).OpEq($1,$010)&new netrexx.lang.Rexx(n.compareTo(java.math.BigDecimal.ZERO)).OpEq($1,$010))
   ar=A(m.subtract(java.math.BigDecimal.ONE),A(m,n.subtract(java.math.BigDecimal.ONE)));/* m > = & n > 0 */
  else{
   throw new java.lang.RuntimeException();
  }
  }
  
  return ar;
  }
 
 private RAckermannBD(){return;}
 }
