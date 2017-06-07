/* Generated from 'RMultiplies3x5.nrx' 14 May 2013 22:35:12 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RMultiplies3x5{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)60);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('|');
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("Sum");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("1000");
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx("1e-9");
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx('s');
 private static final java.lang.String $0="RMultiplies3x5.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx summing(){
  return summing(new netrexx.lang.Rexx((short)1000));
  }
 public static netrexx.lang.Rexx summing(netrexx.lang.Rexx maxLimit){
  netrexx.lang.Rexx mult;
  netrexx.lang.Rexx mv=null;
  mult=new netrexx.lang.Rexx((byte)0);
  {mv=new netrexx.lang.Rexx((byte)0);mv:for(;;mv=mv.OpAdd($1,new netrexx.lang.Rexx(1))){if(!mv.OpLt($1,maxLimit))break;
   if (mv.OpRem($1,$02).OpEq($1,$03)|mv.OpRem($1,$04).OpEq($1,$03)) 
    mult=mult.OpAdd($1,mv);
   }
  }/*mv*/
  return mult;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // translation of perl 6
 
 public static netrexx.lang.Rexx sum_mults(netrexx.lang.Rexx first,netrexx.lang.Rexx limit){
  netrexx.lang.Rexx last;
  netrexx.lang.Rexx sum;
  last=limit.OpSub($1,$05);
  last=last.OpSub($1,last.OpRem($1,first));
  sum=((last.OpDiv($1,first))).OpMult($1,(first.OpAdd($1,last))).OpDivI($1,$06);
  return sum;
  }

 
 public static netrexx.lang.Rexx sum35(netrexx.lang.Rexx maxLimit){
  return (sum_mults(new netrexx.lang.Rexx((byte)3),maxLimit)).OpAdd($1,sum_mults(new netrexx.lang.Rexx((byte)5),maxLimit)).OpSub($1,sum_mults(new netrexx.lang.Rexx((byte)15),maxLimit));
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx offset;
  netrexx.lang.Rexx incr;
  long timing;
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx tmax;
  netrexx.lang.Rexx mm;
  
  offset=new netrexx.lang.Rexx((byte)30);
  incr=new netrexx.lang.Rexx((byte)10);
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Limit").right(offset).OpCc($1,$07)).OpCc($1,$08));
  netrexx.lang.RexxIO.Say(($09.copies(offset).OpCc($1,$010)).OpCc($1,$09.copies(new netrexx.lang.Rexx((byte)60))));
  timing=java.lang.System.nanoTime();
  sum=summing();
  timing=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(timing)).tolong();
  netrexx.lang.RexxIO.Say(($011.format().right(offset).OpCc($1,$07)).OpCc($1,sum));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(timing).OpMult($1,$012))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$013));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Limit").right(offset).OpCc($1,$07)).OpCc($1,$08));
  netrexx.lang.RexxIO.Say(($09.copies(offset).OpCc($1,$010)).OpCc($1,$09.copies(new netrexx.lang.Rexx((byte)60))));
  tmax=new netrexx.lang.Rexx("1e+6");
  timing=java.lang.System.nanoTime();
  mm=new netrexx.lang.Rexx((byte)1);
  {for(;;){if(!mm.OpLtEq($1,tmax))break;
   netrexx.lang.RexxIO.Say(((mm.right(offset)).OpCc($1,$07)).OpCc($1,summing(mm)));
   mm=mm.OpMult($1,incr);
   }
  }
  timing=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(timing)).tolong();
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(timing).OpMult($1,$012))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$013));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Limit").right(offset).OpCc($1,$07)).OpCc($1,$08));
  netrexx.lang.RexxIO.Say(($09.copies(offset).OpCc($1,$010)).OpCc($1,$09.copies(new netrexx.lang.Rexx((byte)60))));
  timing=java.lang.System.nanoTime();
  sum=sum35(new netrexx.lang.Rexx((short)1000));
  timing=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(timing)).tolong();
  netrexx.lang.RexxIO.Say(($011.format().right(offset).OpCc($1,$07)).OpCc($1,sum));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(timing).OpMult($1,$012))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$013));
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Limit").right(offset).OpCc($1,$07)).OpCc($1,$08));
  netrexx.lang.RexxIO.Say(($09.copies(offset).OpCc($1,$010)).OpCc($1,$09.copies(new netrexx.lang.Rexx((byte)60))));
  tmax=new netrexx.lang.Rexx("1e+27");
  timing=java.lang.System.nanoTime();
  mm=new netrexx.lang.Rexx((byte)1);
  {for(;;){if(!mm.OpLtEq($1,tmax))break;
   netrexx.lang.RexxIO.Say(((mm.right(offset)).OpCc($1,$07)).OpCc($1,sum35(mm)));
   mm=mm.OpMult($1,incr);
   }
  }
  timing=new netrexx.lang.Rexx(java.lang.System.nanoTime()).OpSub($1,new netrexx.lang.Rexx(timing)).tolong();
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Elapsed time:").OpCcblank($1,(new netrexx.lang.Rexx(new netrexx.lang.Rexx(timing).OpMult($1,$012))).format(new netrexx.lang.Rexx((byte)4),new netrexx.lang.Rexx((byte)6)))).OpCc($1,$013));
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private RMultiplies3x5(){return;}
 }
