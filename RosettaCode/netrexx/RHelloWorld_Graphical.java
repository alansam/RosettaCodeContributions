/* Generated from 'RHelloWorld_Graphical.nrx' 6 Jul 2011 08:35:09 [v3.00] */
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




public class RHelloWorld_Graphical{
 private static final java.lang.String $0="RHelloWorld_Graphical.nrx";
 
 public static void main(java.lang.String $0s[]){
  boolean False;
  boolean True;
  java.lang.String msgText;
  javax.swing.JFrame window;
  javax.swing.JTextArea text;
  javax.swing.JButton button;
  False=(1!=1);
  True=(!False);
  
  msgText="Goodbye, World!";
  javax.swing.JOptionPane.showMessageDialog((java.awt.Component)null,(java.lang.Object)msgText);
  
  window=new javax.swing.JFrame(msgText);
  text=new javax.swing.JTextArea();
  button=new javax.swing.JButton(msgText);
  
  text.setText(msgText);
  
  window.setLayout((java.awt.LayoutManager)(new java.awt.FlowLayout()));
  window.add((java.awt.Component)button);
  window.add((java.awt.Component)text);
  window.pack();
  window.setVisible(True);
  window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  
  return;
  }
 
 private RHelloWorld_Graphical(){return;}
 }
