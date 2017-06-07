/* Generated from 'R100Doors.nrx' 2 Jul 2011 14:37:58 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * Problem: You have 100 doors in a row that are all initially closed. You make 100
 * <a href="http://rosettacode.org/wiki/Rosetta_Code:Multiple_passes">passes</a> by the doors.
 * The first time through, you visit every door and toggle the door (if the door is closed, you open it;
 * if it is open, you close it). The second time you only visit every 2nd door (door #2, #4, #6, ...).
 * The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
 * <p>
 * Question: What state are the doors in after the last pass? Which are open, which are closed? [1]
 * </p>
 * <p>
 * Alternate: As noted in this page's <a href="http://rosettacode.org/wiki/Talk:100_doors">discussion page</a>,
 * the only doors that remain open are whose numbers are perfect squares of integers.
 * Opening only those doors is an <a href="http://rosettacode.org/wiki/Rosetta_Code:Optimization">optimization</a>
 * that may also be expressed.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/100_doors">rosettacode.org/wiki/100_doors</a>
 */


public class R100Doors{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("Door Nr.");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("is");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("is open\n");
 private static final java.lang.String $0="R100Doors.nrx";
 
 /* properties public constant */
 public static final netrexx.lang.Rexx True=new netrexx.lang.Rexx(1==1);
 public static final netrexx.lang.Rexx False=new netrexx.lang.Rexx(True.OpNot(null));

 
 /**
  * Driver
  *
  * @param args
  */
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx dlm;
  
  dlm=$01.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-'));
  
  netrexx.lang.RexxIO.Say(dlm);
  unoptimized();
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say(dlm);
  optimization01();
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say(dlm);
  optimization02();
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 /**
  * Unoptimized
  */
 
 public static void unoptimized(){
  netrexx.lang.Rexx doors;
  int pass=0;
  int i_=0;
  int d_=0;
  java.lang.String state=null;
  
  doors=False;
  
  {pass=1;pass:for(;pass<=100;pass++){
   {i_=1;i_:for(;i_<=100;i_++){
    if (0==((i_%pass))) 
     {
      doors.getnode(new netrexx.lang.Rexx(i_)).leaf=new netrexx.lang.Rexx((doors.getnode(new netrexx.lang.Rexx(i_)).leaf).OpNot(null));
     }
    }
   }/*i_*/
   }
  }/*pass*/
  
  {d_=1;d_:for(;d_<=100;d_++){
   if ((doors.getnode(new netrexx.lang.Rexx(d_)).leaf).toboolean()) 
    {
     state="open";
    }
   else 
    {
     state="closed";
    }
   
   netrexx.lang.RexxIO.Say((($02.OpCcblank(null,(new netrexx.lang.Rexx(d_)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx(state)));
   }
  }/*d_*/
  
  return;
  }

 /**
  * Optimization 1
  */
 
 public static void optimization01(){
  boolean doors[];
  int pass=0;
  int i_=0;
  java.lang.String state=null;
  
  doors=new boolean[100];
  
  {pass=0;pass:for(;pass<=9;pass++){
   doors[(((pass+1))*((pass+1)))-1]=True.toboolean();
   }
  }/*pass*/
  
  {i_=0;i_:for(;i_<=99;i_++){
   if (doors[i_]) 
    {
     state="open";
    }
   else 
    {
     state="closed";
    }
   netrexx.lang.RexxIO.Say((($02.OpCcblank(null,(new netrexx.lang.Rexx(i_+1)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx(state)));
   }
  }/*i_*/
  
  return;
  }

 /**
  * Optimization 2
  */
 
 public static void optimization02(){
  java.lang.String resultstring;
  int i_=0;
  
  resultstring="";
  
  {i_=1;i_:for(;i_<=10;i_++){
   resultstring=netrexx.lang.Rexx.toString((netrexx.lang.Rexx.toRexx(resultstring+"Door Nr.").OpCcblank(null,(new netrexx.lang.Rexx(i_*i_)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$04));
   }
  }/*i_*/
  
  netrexx.lang.RexxIO.Say(resultstring);
  
  return;
  }
 
 private R100Doors(){return;}
 }
