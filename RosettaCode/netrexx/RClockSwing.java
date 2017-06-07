/* Generated from 'RClockSwing.nrx' 13 Jun 2014 22:42:57 [v3.03] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */
import javax.swing.Timer;

/* NetRexx */




// .+....1....+....2....+....3....+....4....+....5....+....6....+....7....+....8

public class RClockSwing extends javax.swing.JFrame{
 private static final java.lang.String $0="RClockSwing.nrx";
 // . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .
 /* properties constant */
 protected static final java.lang.String K_TITLE="Clock";
 protected static final boolean isTrue=(1==1);
 protected static final boolean isFalse=(!isTrue);
 /* properties inheritable */
 protected java.awt.Container content;

 
 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public RClockSwing(){
  this(K_TITLE);
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public RClockSwing(java.lang.String title){
  super(title);
  initFrame();
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 private void initFrame(){
  content=getContentPane();
  content.setLayout((java.awt.LayoutManager)(new java.awt.BorderLayout()));
  content.add((java.awt.Component)(new RClockSwing.Panel()),(java.lang.Object)java.awt.BorderLayout.CENTER);
  setResizable(isFalse);
  pack();
  return;
  }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
 
 public static void main(java.lang.String args[]){
  javax.swing.JFrame clockFace=null;
  
  clockFace=(javax.swing.JFrame)(new RClockSwing());
  clockFace.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  clockFace.setVisible(isTrue);
  return;
  }

//..+....1....+....2....+....3....+....4....+....5....+....6....+....7....+....8
 
 static class Panel extends javax.swing.JPanel implements java.awt.event.ActionListener{
  private final transient java.lang.String $0="RClockSwing.nrx";
  /* properties constant */
  protected static final double degrees450=java.lang.Math.PI*2.5D;
  protected static final double degrees006=java.lang.Math.PI/30.0D;
  protected static final double degrees030=degrees006*((double)5);
  protected static final int size=350;
  protected static final int spacing=10;
  protected static final int diameter=size-(2*spacing);
  protected static final int x1=(int)((((float)diameter)/((float)2))+((float)spacing));
  protected static final int y1=(int)((((float)diameter)/((float)2))+((float)spacing));

 
 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
  
  public Panel(){
   super();
   this.initPanel();
   return;
   }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
  
  public void initPanel(){
   javax.swing.Timer ptimer;
   this.setPreferredSize(new java.awt.Dimension(size,size));
   this.setBackground(java.awt.Color.WHITE);
   ptimer=new Timer(1000,(java.awt.event.ActionListener)this);
   ptimer.start();
   return;
   }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
  
  public void paintComponent(java.awt.Graphics gr){
   java.awt.Graphics2D g2;
   java.util.Calendar cdate;
   int hours;
   int minutes;
   int seconds;
   double angle;
   double minsecs;
   double hourmins;
   super.paintComponent(gr);
   g2=(java.awt.Graphics2D)gr;
   g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
   gr.setColor(java.awt.Color.black);
   gr.drawOval(spacing,spacing,diameter,diameter);
   cdate=java.util.Calendar.getInstance();
   hours=cdate.get(java.util.Calendar.HOUR);
   minutes=cdate.get(java.util.Calendar.MINUTE);
   seconds=cdate.get(java.util.Calendar.SECOND);
   angle=degrees450-((degrees006*((double)seconds)));
   this.drawHand(gr,angle,(int)(((((float)diameter)/((float)2))-((float)10))),java.awt.Color.red);
   minsecs=(double)(((float)minutes)+(((float)seconds)/60.0F));
   angle=degrees450-((degrees006*minsecs));
   this.drawHand(gr,angle,(int)((((float)diameter)/((float)3))),java.awt.Color.black);
   hourmins=(((double)hours)+(minsecs/60.0D));
   angle=degrees450-((degrees030*hourmins));
   this.drawHand(gr,angle,(int)((((float)diameter)/((float)4))),java.awt.Color.black);
   return;
   }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
  
  public void drawHand(java.awt.Graphics gr,double angle,int radius,java.awt.Color color){
   int x2;
   int y2;
   x2=x1+(((int)((((double)radius)*(java.lang.Math.cos(angle))))));
   y2=y1+(((int)((((double)radius)*(java.lang.Math.sin((double)-angle))))));
   gr.setColor(color);
   gr.drawLine(x1,y1,x2,y2);
   return;
   }

 // ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
  
  public void actionPerformed(java.awt.event.ActionEvent evt){
   this.repaint();
   return;
   }
 }}
