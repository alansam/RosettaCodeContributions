/* Generated from 'RGreyscaleBars.nrx' 19 Jul 2011 14:56:57 [v3.00] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * <h3>Greyscale bars/Display</h3>
 * <p>
 * The task is to display a series of vertical greyscale bars (contrast bars) with a sufficient number of bars
 * to span the entire width of the display.
 * </p>
 * <p>
 * For the top quarter of the display, the left hand bar should be black, and we then incrementally step though
 * six shades of grey until we have a white bar on the right hand side of the display. (This gives a total of 8 bars)
 * </p>
 * <p>
 * For the second quarter down, we start with white and step down through 14 shades of gray, getting darker
 * until we have black on the right hand side of the display. (This gives a total of 16 bars).
 * </p>
 * <p>
 * Halfway down the display, we start with black, and produce 32 bars, ending in white, and for the last
 * quarter, we start with white and step through 62 shades of grey, before finally arriving at black in the
 * bottom right hand corner, producing a total of 64 bars for the bottom quarter.
 * </p>
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Greyscale_bars/Display">rosettacode.org/wiki/Greyscale_bars/Display</a>
 */






public class RGreyscaleBars extends javax.swing.JFrame{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)127);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx((byte)16);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(255);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(4);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RGreyscaleBars.nrx";
 
 /* properties private constant */
 private static final int DEFAULT_WIDTH=(int)((short)640);
 private static final int DEFAULT_HEIGHT=(int)((short)320);
 
 /* properties indirect */
 private int width;
 private int height;
 private boolean valid;

 
 
 public RGreyscaleBars(){
  
  super("Greyscale bars/Display");
  
  setValid(isFalse());
  
  return;
  }

 
 protected synchronized boolean initialize(){
  boolean state;
  java.lang.RuntimeException ex=null;
  
  state=isValid();
  if (new netrexx.lang.Rexx(state).OpNot(null)) 
   {
    netrexx.lang.RexxIO.Say("Greyscale bars/Display gobberize");
    {try{
     setWidth(DEFAULT_WIDTH);
     setHeight(DEFAULT_HEIGHT);
     setSize(getWidth(),getHeight());
     setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
     setVisible(isTrue());
     state=isTrue();
    }
    catch (java.lang.RuntimeException $1){ex=$1;
     state=isFalse();
     ex.printStackTrace();
    }}
   }
  else 
   {
    netrexx.lang.RexxIO.Say("Greyscale bars/Display already gobberized");
   }
  
  setValid(state);
  
  return state;
  }

 
 public void paint(java.awt.Graphics g_){
  boolean amValid;
  int run=0;
  int colcomp=0;
  int colwidth=0;
  int colheight=0;
  int xstart=0;
  int ystart=0;
  netrexx.lang.Rexx colcount=null;
  netrexx.lang.Rexx colgap=null;
  netrexx.lang.Rexx i_=null;
  java.awt.Color nextColor=null;
  
  amValid=isValid();
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("gobberized?").OpCcblank(null,new netrexx.lang.Rexx(amValid)));
  if (amValid) 
   {
    netrexx.lang.RexxIO.Say("painting");
    run=(int)((byte)0);
    colcomp=(int)((byte)0);
    
    
    
    
    
    {netrexx.lang.Rexx $2=$02;colcount=new netrexx.lang.Rexx((byte)8);colcount:for(;colcount.OpLtEq(null,$01);colcount=colcount.OpAdd(null,$2)){
     colgap=$03.OpDivI(null,colcount);
     colwidth=new netrexx.lang.Rexx(getWidth()).OpDivI(null,colcount).toint();
     colheight=new netrexx.lang.Rexx(getHeight()).OpDivI(null,$04).toint();
     
     if (new netrexx.lang.Rexx(run).OpRem(null,$05).OpEq(null,$06)) 
      {
       colcomp=0;
      }
     else 
      {
       colcomp=255;
       colgap=colgap.OpMult(null,$07.OpMinus(null));
      }
     
     ystart=$06.OpAdd(null,new netrexx.lang.Rexx(colheight).OpMult(null,new netrexx.lang.Rexx(run))).toint();
     xstart=0;
     {i_=new netrexx.lang.Rexx((byte)0);i_:for(;;i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!i_.OpLt(null,colcount))break;
      nextColor=new java.awt.Color(colcomp,colcomp,colcomp);
      g_.setColor(nextColor);
      g_.fillRect(xstart,ystart,colwidth,colheight);
      xstart=new netrexx.lang.Rexx(xstart).OpAdd(null,new netrexx.lang.Rexx(colwidth)).toint();
      colcomp=new netrexx.lang.Rexx(colcomp).OpAdd(null,colgap).toint();
      }
     }/*i_*/
     
     run=new netrexx.lang.Rexx(run).OpAdd(null,$07).toint();
     }
    }/*colcount*/
   }
  
  return;
  }

 
 public static void main(java.lang.String args[]){
  RGreyscaleBars gb;
  
  gb=new RGreyscaleBars();
  netrexx.lang.RexxIO.Say("initializing");
  gb.initialize();
  
  return;
  }

 
 public static boolean isTrue(){
  return (1==1);
  }

 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 public int getWidth(){return width;}
 
 public void setWidth(int $3){width=$3;return;}
 
 public int getHeight(){return height;}
 
 public void setHeight(int $4){height=$4;return;}
 
 public boolean isValid(){return valid;}
 
 public void setValid(boolean $5){valid=$5;return;}
 }
