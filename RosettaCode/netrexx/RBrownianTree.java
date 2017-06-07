/* Generated from 'RBrownianTree.nrx' 28 Jun 2012 17:14:20 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */









public class RBrownianTree extends javax.swing.JFrame implements java.lang.Runnable{
 private static final java.lang.String $0="RBrownianTree.nrx";
 
 /* properties inheritable */
 protected java.awt.image.BufferedImage I;
 protected java.util.List particles;
 
 /* properties inheritable static */
 protected static java.util.Random rand=new java.util.Random();

 
 
 public RBrownianTree(){
  super("Brownian Tree");
  setBounds(100,100,400,300);
  setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  I=new java.awt.image.BufferedImage(getWidth(),getHeight(),java.awt.image.BufferedImage.TYPE_INT_RGB);
  I.setRGB((I.getWidth())/2,(I.getHeight())/2,65280);
  particles=(java.util.List)(new java.util.LinkedList());
  return;
  }

 
 public void paint(java.awt.Graphics g){
  g.drawImage((java.awt.Image)I,0,0,(java.awt.image.ImageObserver)this);
  return;
  }

 
 public void run(){
  int i_=0;
  java.util.Iterator it=null;
  
  {int $1=(int)(i_<20000?1:0);i_=0;i_:for(;i_<=$1;i_++){
   particles.add((java.lang.Object)(new RBrownianTree.Particle()));
   }
  }/*i_*/
  
  {for(;;){if(!((!(particles.isEmpty()))))break;
   it=particles.iterator();
   {for(;;){if(!(it.hasNext()))break;
    if (((RBrownianTree.Particle)(it.next())).move()) 
     {
      it.remove();
     }
    }
   }
   repaint();
   }
  }
  return;
  }

 
 public static void main(java.lang.String args[]){
  RBrownianTree b;
  b=new RBrownianTree();
  b.setVisible(isTrue());
  (new java.lang.Thread((java.lang.Runnable)b)).start();
  return;
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return isTrue();
  }

 
 class Particle{
  private final transient java.lang.String $0="RBrownianTree.nrx";
 
  /* properties private */
  private int x;
  private int y;

 
  
  public Particle(){super();
   x=RBrownianTree.rand.nextInt(RBrownianTree.this.I.getWidth());
   y=RBrownianTree.rand.nextInt(RBrownianTree.this.I.getHeight());
   return;
   }

 /* returns true if either out of bounds or collided with tree */
  
  public boolean move(){
   int dx;
   int dy;
   dx=(RBrownianTree.rand.nextInt(3))-1;
   dy=(RBrownianTree.rand.nextInt(3))-1;
   if (netrexx.lang.Rexx.toRexx(((((x+dx)<0)?"1":"0")+(((y+dy)<0)?"1":"0")+(((y+dy)>=(RBrownianTree.this.I.getHeight()))?"1":"0")+(((x+dx)>=(RBrownianTree.this.I.getWidth()))?"1":"0"))).toboolean()) 
    {
     return RBrownianTree.isTrue();
    }
   x=x+dx;
   y=x+dy;
   if ((((RBrownianTree.this.I.getRGB(x,y))&65280))==65280) 
    {
     RBrownianTree.this.I.setRGB(x-dx,y-dy,65280);
     return RBrownianTree.isTrue();
    }
   return RBrownianTree.isFalse();
   }
 }}
