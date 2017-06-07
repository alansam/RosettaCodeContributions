/* Generated from 'RHelloWorld_GraphicalAWT01.nrx' 6 Jul 2011 10:09:17 [v3.00] */
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


public class RHelloWorld_GraphicalAWT01 extends java.awt.Dialog implements java.awt.event.ActionListener{
 private static final java.lang.String $0="RHelloWorld_GraphicalAWT01.nrx";
 
 /* properties private constant */
 private static final java.lang.String msgText="Goodbye, World!";
 
 /* properties indirect */
 private boolean ok;
 private boolean can;
 private java.awt.Button okButton;
 private java.awt.Button canButton;
 private java.awt.Panel buttonPanel;

 
 
 public RHelloWorld_GraphicalAWT01(java.awt.Frame frame,java.lang.String msg,boolean canaction){
  super(frame,"Default",isTrue());
  setLayout((java.awt.LayoutManager)(new java.awt.BorderLayout()));
  add(java.awt.BorderLayout.CENTER,(java.awt.Component)(new java.awt.Label(msg)));
  addOKCancelPanel(canaction);
  createFrame();
  pack();
  setVisible(isTrue());
  
  return;
  }

 
 public RHelloWorld_GraphicalAWT01(java.awt.Frame frame,java.lang.String msg){
  this(frame,msg,isFalse());
  return;
  }

 
 public void addOKCancelPanel(boolean canaction){
  setButtonPanel(new java.awt.Panel());
  getButtonPanel().setLayout((java.awt.LayoutManager)(new java.awt.FlowLayout()));
  createOKButton();
  if (canaction) 
   {
    createCancelButton();
   }
  add(java.awt.BorderLayout.SOUTH,(java.awt.Component)(getButtonPanel()));
  return;
  }

 
 public void createOKButton(){
  setOkButton(new java.awt.Button("OK"));
  getButtonPanel().add((java.awt.Component)(getOkButton()));
  getOkButton().addActionListener((java.awt.event.ActionListener)this);
  return;
  }

 
 public void createCancelButton(){
  setCanButton(new java.awt.Button("Cancel"));
  getButtonPanel().add((java.awt.Component)(getCanButton()));
  getCanButton().addActionListener((java.awt.event.ActionListener)this);
  return;
  }

 
 public void createFrame(){
  java.awt.Dimension dim;
  dim=getToolkit().getScreenSize();
  setLocation((int)(((float)dim.width)/((float)3)),(int)(((float)dim.height)/((float)3)));
  return;
  }

 
 public void actionPerformed(java.awt.event.ActionEvent ae){
  if ((ae.getSource())==(getOkButton())) 
   {
    setOk(isTrue());
    setVisible(isFalse());
   }
  else 
   if ((ae.getSource())==(getCanButton())) 
    {
     setVisible(isFalse());
    }
  return;
  }

 
 public static final void main(java.lang.String args[]){
  java.awt.Frame mainFrame;
  RHelloWorld_GraphicalAWT01 message;
  mainFrame=new java.awt.Frame();
  mainFrame.setSize(200,200);
  mainFrame.setVisible(isTrue());
  message=new RHelloWorld_GraphicalAWT01(mainFrame,msgText,isTrue());
  if (message.isOk()) 
   netrexx.lang.RexxIO.Say("OK pressed");
  if ((!(message.isOk()))) 
   netrexx.lang.RexxIO.Say("Cancel pressed");
  message.dispose();
  mainFrame.dispose();
  return;
  }

 
 public static boolean isTrue(){
  return 1==1;
  }

 
 public static boolean isFalse(){
  return (!(isTrue()));
  }
 
 public boolean isOk(){return ok;}
 
 public void setOk(boolean $1){ok=$1;return;}
 
 public boolean isCan(){return can;}
 
 public void setCan(boolean $2){can=$2;return;}
 
 public java.awt.Button getOkButton(){return okButton;}
 
 public void setOkButton(java.awt.Button $3){okButton=$3;return;}
 
 public java.awt.Button getCanButton(){return canButton;}
 
 public void setCanButton(java.awt.Button $4){canButton=$4;return;}
 
 public java.awt.Panel getButtonPanel(){return buttonPanel;}
 
 public void setButtonPanel(java.awt.Panel $5){buttonPanel=$5;return;}
 }

