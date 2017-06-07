/* Generated from 'RFractalTree.nrx' 20 Nov 2013 17:45:52 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */







public class RFractalTree extends javax.swing.JFrame{
 private static final java.lang.String $0="RFractalTree.nrx";
 /* properties constant */
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=(!isTrue);

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public RFractalTree(){
  super("Fractal Tree");
  setBounds(100,100,800,600);
  setResizable(isFalse);
  setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  return;
  }
 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private void drawTree(java.awt.Graphics g,int x1,int y1,double angle,int depth){
  int x2=0;
  int y2=0;
  if (depth!=0) 
   {
    x2=x1+(((int)(((java.lang.Math.cos(java.lang.Math.toRadians(angle)))*((double)depth))*10.0D)));
    y2=y1+(((int)(((java.lang.Math.sin(java.lang.Math.toRadians(angle)))*((double)depth))*10.0D)));
    g.drawLine(x1,y1,x2,y2);
    drawTree(g,x2,y2,angle-((double)20),depth-1);
    drawTree(g,x2,y2,angle+((double)20),depth-1);
   }
  return;
  }
 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public void paint(java.awt.Graphics g){
  g.setColor(java.awt.Color.BLACK);
  drawTree(g,400,500,(double)((byte)-90),9);
  return;
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  (new RFractalTree()).setVisible(isTrue);
  return;
  }
 }
