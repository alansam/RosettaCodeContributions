/* Generated from 'RSortingBeadsort.nrx' 8 Mar 2013 13:54:07 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/**
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://oeis.org/">The On-Line Encyclopedia of Integer Sequences&#8482; (OEIS&#8482;)</a>
 * @see <a href="http://oeisf.org/">The OEIS Foundation Inc.</a>
 */

public class RSortingBeadsort{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(12);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(22);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(26);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(30);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(46);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(54);
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(62);
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(66);
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(78);
 private static final netrexx.lang.Rexx $013=new netrexx.lang.Rexx(94);
 private static final netrexx.lang.Rexx $014=new netrexx.lang.Rexx(110);
 private static final netrexx.lang.Rexx $015=new netrexx.lang.Rexx(126);
 private static final netrexx.lang.Rexx $016=new netrexx.lang.Rexx(134);
 private static final netrexx.lang.Rexx $017=new netrexx.lang.Rexx(138);
 private static final netrexx.lang.Rexx $018=new netrexx.lang.Rexx(158);
 private static final netrexx.lang.Rexx $019=new netrexx.lang.Rexx(162);
 private static final netrexx.lang.Rexx $020=new netrexx.lang.Rexx(186);
 private static final netrexx.lang.Rexx $021=new netrexx.lang.Rexx(190);
 private static final netrexx.lang.Rexx $022=new netrexx.lang.Rexx(222);
 private static final netrexx.lang.Rexx $023=new netrexx.lang.Rexx(254);
 private static final netrexx.lang.Rexx $024=new netrexx.lang.Rexx(270);
 private static final netrexx.lang.Rexx $025=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $026=new netrexx.lang.Rexx(16);
 private static final netrexx.lang.Rexx $027=new netrexx.lang.Rexx(40);
 private static final netrexx.lang.Rexx $028=new netrexx.lang.Rexx(80);
 private static final netrexx.lang.Rexx $029=new netrexx.lang.Rexx(140);
 private static final netrexx.lang.Rexx $030=new netrexx.lang.Rexx(224);
 private static final netrexx.lang.Rexx $031=new netrexx.lang.Rexx(336);
 private static final netrexx.lang.Rexx $032=new netrexx.lang.Rexx(480);
 private static final netrexx.lang.Rexx $033=new netrexx.lang.Rexx(660);
 private static final netrexx.lang.Rexx $034=new netrexx.lang.Rexx(880);
 private static final netrexx.lang.Rexx $035=new netrexx.lang.Rexx(1144);
 private static final netrexx.lang.Rexx $036=new netrexx.lang.Rexx(1456);
 private static final netrexx.lang.Rexx $037=new netrexx.lang.Rexx(1820);
 private static final netrexx.lang.Rexx $038=new netrexx.lang.Rexx(2240);
 private static final netrexx.lang.Rexx $039=new netrexx.lang.Rexx(2720);
 private static final netrexx.lang.Rexx $040=new netrexx.lang.Rexx(3264);
 private static final netrexx.lang.Rexx $041=new netrexx.lang.Rexx(3876);
 private static final netrexx.lang.Rexx $042=new netrexx.lang.Rexx(4560);
 private static final netrexx.lang.Rexx $043=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $044=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $045=new netrexx.lang.Rexx(18);
 private static final netrexx.lang.Rexx $046=new netrexx.lang.Rexx(20);
 private static final netrexx.lang.Rexx $047=new netrexx.lang.Rexx(28);
 private static final netrexx.lang.Rexx $048=new netrexx.lang.Rexx(8);
 private static final netrexx.lang.Rexx $049=netrexx.lang.Rexx.toRexx("");
 private static final char[] $050={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $051=netrexx.lang.Rexx.toRexx("element");
 private static final netrexx.lang.Rexx $052=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $053=new netrexx.lang.Rexx('-');
 private static final java.lang.String $0="RSortingBeadsort.nrx";
 
 /* properties private static */
 private static netrexx.lang.Rexx _;

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx grasshopper;
  netrexx.lang.Rexx greengrocer;
  netrexx.lang.Rexx bernN;
  netrexx.lang.Rexx psi;
  netrexx.lang.Rexx list;
  netrexx.lang.Rexx $$;
  /*REXX program sorts a list of integers using a bead sort. */
  
  
  /*get some grassHopper numbers.                            */
  grasshopper=(((((((((((((((((((((($01.OpCcblank(null,$02)).OpCcblank(null,$03)).OpCcblank(null,$04)).OpCcblank(null,$05)).OpCcblank(null,$06)).OpCcblank(null,$07)).OpCcblank(null,$08)).OpCcblank(null,$09)).OpCcblank(null,$010)).OpCcblank(null,$011)).OpCcblank(null,$012)).OpCcblank(null,$013)).OpCcblank(null,$014)).OpCcblank(null,$015)).OpCcblank(null,$016)).OpCcblank(null,$017)).OpCcblank(null,$018)).OpCcblank(null,$019)).OpCcblank(null,$020)).OpCcblank(null,$021)).OpCcblank(null,$022)).OpCcblank(null,$023)).OpCcblank(null,$024);
  
  
  
  /*GreeenGrocer numbers are also called hexagonal pyramidal */
  /*             numbers.                                    */
  greengrocer=((((((((((((((((($025.OpCcblank(null,$02)).OpCcblank(null,$026)).OpCcblank(null,$027)).OpCcblank(null,$028)).OpCcblank(null,$029)).OpCcblank(null,$030)).OpCcblank(null,$031)).OpCcblank(null,$032)).OpCcblank(null,$033)).OpCcblank(null,$034)).OpCcblank(null,$035)).OpCcblank(null,$036)).OpCcblank(null,$037)).OpCcblank(null,$038)).OpCcblank(null,$039)).OpCcblank(null,$040)).OpCcblank(null,$041)).OpCcblank(null,$042);
  
  
  /*get some Bernoulli numerator numbers.                    */
  bernN=netrexx.lang.Rexx.toRexx("1 -1 1 0 -1 0 1 0 -1 0 5 0 -691 0 7 0 -3617 0 43867 0 -174611 0 854513");
  
  
  /*Psi is also called the Reduced Totient function,  and    */
  /*    is also called Carmichale lambda, or LAMBDA function.*/
  psi=(((((((((((((((((((((((((((((((($01.OpCcblank(null,$01)).OpCcblank(null,$043)).OpCcblank(null,$043)).OpCcblank(null,$02)).OpCcblank(null,$043)).OpCcblank(null,$044)).OpCcblank(null,$043)).OpCcblank(null,$044)).OpCcblank(null,$02)).OpCcblank(null,$03)).OpCcblank(null,$043)).OpCcblank(null,$04)).OpCcblank(null,$044)).OpCcblank(null,$02)).OpCcblank(null,$02)).OpCcblank(null,$026)).OpCcblank(null,$044)).OpCcblank(null,$045)).OpCcblank(null,$02)).OpCcblank(null,$044)).OpCcblank(null,$03)).OpCcblank(null,$05)).OpCcblank(null,$043)).OpCcblank(null,$046)).OpCcblank(null,$04)).OpCcblank(null,$045)).OpCcblank(null,$044)).OpCcblank(null,$047)).OpCcblank(null,$02)).OpCcblank(null,$07)).OpCcblank(null,$048)).OpCcblank(null,$03)).OpCcblank(null,$026);
  
  
  
  list=((grasshopper.OpCcblank(null,greengrocer)).OpCcblank(null,bernN)).OpCcblank(null,psi);/*combine the four lists into one*/
  
  
  showL(netrexx.lang.Rexx.toRexx("before sort"),list);/*show list before sorting. */
  $$=beadSort(list);/*invoke the bead sort.     */
  showL(netrexx.lang.Rexx.toRexx(" after sort"),$$);/*show  after array elements*/
  {System.exit(0);return;}
  }

 
 /*─────────────────────────────────────SHOW@ subroutine────────────*/
 //beadSort: procedure expose _.; parse arg z
 
 public static netrexx.lang.Rexx beadSort(netrexx.lang.Rexx z){
  netrexx.lang.Rexx $$;
  netrexx.lang.Rexx low;
  netrexx.lang.Rexx high;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx m=null;
  $$=netrexx.lang.Rexx.toRexx("");/*this'll be the sorted list*/
  low=new netrexx.lang.Rexx(999999999);
  high=low.OpMinus(null);/*define the low and high #s*/
  _=new netrexx.lang.Rexx((byte)0);/*define all beads to zero. */
  
  
  {j=new netrexx.lang.Rexx((byte)1);boolean $1=true;j:for(;;){if($1){$1=false;}else{if(z.OpEqS(null,$049))break;j=j.OpAdd(null,new netrexx.lang.Rexx(1));}/*pick the meat off the bone*/
   {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(z,$050,$2);
   x=$2[0];z=$2[1];}
   if ((x.datatype(netrexx.lang.Rexx.toRexx("Whole"))).OpNot(null)) 
    {
     netrexx.lang.RexxIO.Say("");
     netrexx.lang.RexxIO.Say("*** error! ***");
     netrexx.lang.RexxIO.Say("");
     netrexx.lang.RexxIO.Say((($051.OpCcblank(null,j)).OpCcblank(null,netrexx.lang.Rexx.toRexx("in list isn\'t numeric:"))).OpCcblank(null,x));
     netrexx.lang.RexxIO.Say("");
     {System.exit(13);return null;}
    }
   
   x=x.OpDiv(null,$01);/*normalize number, it could*/
   /*be:  +4  007  5.  2e3 etc.*/
   _.getnode(x).leaf=_.getnode(x.OpAdd(null,$01)).leaf;/*indicate this bead has a #*/
   low=low.min(x);/*keep track of the lowest #*/
   high=high.max(x);/* "     "    "  "  highest#*/
   }
  }/*j*//*j*/
  //  trace results;nop
  /*now, collect the beads and*/
  {netrexx.lang.Rexx $3=high;m=low.OpPlus(null);m:for(;m.OpLtEq(null,$3);m=m.OpAdd(null,new netrexx.lang.Rexx(1))){/*let them fall (to zero).  */
   if ((_.getnode(m).leaf).OpEqS(null,$025)) 
    continue m;/*No bead here? Keep looking*/
   //    loop n=1 for _[m]                    /*let the beads fall to  0. */
   //    $=$ m                              /*add it to the sorted list.*/
   //    end n
   }
  }/*m*/
  
  return $$;
  }

 
 /*─────────────────────────────────────SHOW@ subroutine────────────*/
 //showL: widthH=length(words(arg(2)))    /*maximum width of the index*/
 
 public static void showL(netrexx.lang.Rexx arg1,netrexx.lang.Rexx arg2){
  netrexx.lang.Rexx widthH;
  netrexx.lang.Rexx j=null;
  widthH=arg2.words().length();/*maximum width of the index*/
  
  {int $4=(arg2.words()).OpPlus(null).toint();j=new netrexx.lang.Rexx((byte)1);j:for(;$4>0;$4--,j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(((($051.OpCcblank(null,j.right(widthH))).OpCcblank(null,arg1)).OpCc(null,$052)).OpCcblank(null,arg2.word(j).right(new netrexx.lang.Rexx((byte)10))));
   }
  }/*j*/
  
  netrexx.lang.RexxIO.Say($053.copies(new netrexx.lang.Rexx((byte)80)));/*show a seperator line.    */
  return;
  }
 
 private RSortingBeadsort(){return;}
 }
