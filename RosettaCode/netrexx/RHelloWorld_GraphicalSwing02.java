/* Generated from 'RHelloWorld_GraphicalSwing02.nrx' 6 Jul 2011 10:09:17 [v3.00] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 Verbose3 */

/* NetRexx */



/**
 * In this User Output task, the goal is to display the string "Goodbye, World!" on a GUI object
 * (alert box, plain window, text area, etc.).
 *
 * @author Alan Sampson
 * @version 1.0
 * @see <a href="http://rosettacode.org/wiki/Hello_world/Graphical">rosettacode.org/wiki/Hello_world/Graphical</a>
 */




public class RHelloWorld_GraphicalSwing02{
 private static final java.lang.String $0="RHelloWorld_GraphicalSwing02.nrx";
 
 public static void main(java.lang.String $0s[]){
  java.lang.String msgText;
  javax.swing.JFrame window;
  javax.swing.JTextArea text;
  java.awt.Dimension minSize;
  msgText="Goodbye, World!";
  
  window=new javax.swing.JFrame(msgText);
  text=new javax.swing.JTextArea();
  minSize=new java.awt.Dimension(200,100);
  
  text.setText(msgText);
  
  window.setLayout((java.awt.LayoutManager)(new java.awt.FlowLayout()));
  window.add((java.awt.Component)text);
  window.setMinimumSize(minSize);
  window.pack();
  window.setVisible(isTrue());
  window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  
  return;
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RHelloWorld_GraphicalSwing02(){return;}
 }
