/* Generated from 'RDetermineIfNumeric.nrx' 10 Jan 2013 13:04:58 [v3.01] */
/* Options: Comments Crossref Decimal Diag Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RDetermineIfNumeric{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)20);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx("1.5");
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx("1.5e-27");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx("1.5e+27");
 private static final java.lang.String $0="RDetermineIfNumeric.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx msg=null;
  {netrexx.lang.Rexx[] $5=getTestData();int $4=0;netrexx.lang.Rexx[] $3=new netrexx.lang.Rexx[$5.length];synchronized($5){for(;;){if($4==$3.length)break;$3[$4]=$5[$5.length-1-$4];$4++;}}n_:for(;;){if(--$4<0)break;n_=(netrexx.lang.Rexx)$3[$4];
   // could have used n_.datatype('N') directly here...
   if (isNumeric(n_)) 
    msg=netrexx.lang.Rexx.toRexx("numeric");
   else 
    msg=netrexx.lang.Rexx.toRexx("not numeric");
   netrexx.lang.RexxIO.Say((((($02.OpCc($1,n_)).OpCc($1,$02)).right(new netrexx.lang.Rexx((byte)25))).OpCc($1,$03)).OpCcblank($1,msg));
   }
  }/*n_*/
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Pointless in NetRexx; the DATATYPE built-in-function is more powerful!
 
 public static boolean isNumeric(netrexx.lang.Rexx testString){
  return (testString.datatype(new netrexx.lang.Rexx('N'))).toboolean();
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx[] getTestData(){
  netrexx.lang.Rexx testData[];
  
  // Coercing numbers into the Rexx type has the effect of converting them to strings.
  // NetRexx will still perform arithmetic on Rexx strings if those strings represent numbers.
  // Notice that whitespace between the sign and the number are ignored even when inside a string constant
  testData=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx(" one and a half"),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx("1.5"),new netrexx.lang.Rexx("1.5e+27"),netrexx.lang.Rexx.toRexx("   1 "),netrexx.lang.Rexx.toRexx("  1.5 "),netrexx.lang.Rexx.toRexx("  1.5e+27 "),netrexx.lang.Rexx.toRexx("-one and a half"),$04.OpMinus($1),$05.OpMinus($1),$06.OpMinus($1),netrexx.lang.Rexx.toRexx(" - 1 "),netrexx.lang.Rexx.toRexx("- 1.5 "),netrexx.lang.Rexx.toRexx("- 1.5e-27 "),netrexx.lang.Rexx.toRexx("+one and a half"),$04.OpPlus($1),$05.OpPlus($1),$07.OpPlus($1),netrexx.lang.Rexx.toRexx(" + 1 "),netrexx.lang.Rexx.toRexx("+ 1.5 "),netrexx.lang.Rexx.toRexx("+ 1.5e+27 "),netrexx.lang.Rexx.toRexx("Math Constants"),new netrexx.lang.Rexx(java.lang.Math.PI),new netrexx.lang.Rexx(java.lang.Math.E),new netrexx.lang.Rexx(java.lang.Math.PI).OpMinus($1),new netrexx.lang.Rexx(java.lang.Math.E).OpMinus($1),new netrexx.lang.Rexx(java.lang.Math.PI).OpPlus($1),new netrexx.lang.Rexx(java.lang.Math.E).OpPlus($1),netrexx.lang.Rexx.toRexx("Numeric Constants"),new netrexx.lang.Rexx(java.lang.Double.NaN),new netrexx.lang.Rexx(java.lang.Double.POSITIVE_INFINITY),new netrexx.lang.Rexx(java.lang.Double.NEGATIVE_INFINITY)};
  
  
  
  
  
  
  
  
  
  
  return testData;
  }
 
 private RDetermineIfNumeric(){return;}
 }
