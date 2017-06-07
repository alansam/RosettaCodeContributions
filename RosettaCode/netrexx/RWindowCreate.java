/* Generated from 'RWindowCreate.nrx' 29 Nov 2012 16:44:50 [v3.01] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/* NetRexx */








// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class RWindowCreate{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final java.lang.String $0="RWindowCreate.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx showText=null;
  boolean addText=false;
  java.lang.String title;
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  showText=$1[0];}
  {/*select*/
  if ((showText.length()).OpEq(null,$02))
   addText=isTrue();
  else if (netrexx.lang.Rexx.toRexx("YES").abbrev(showText.upper()).toboolean())
   addText=isTrue();
  else if (showText.OpEq(null,$03))
   addText=isTrue();
  else{
   addText=isFalse();
  }
  }
  title="Rosetta Code - Window Creation";
  createFrame(netrexx.lang.Rexx.toRexx(title),addText);
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void createFrame(netrexx.lang.Rexx title){
  createFrame(title,false);return;
  }
 public static void createFrame(netrexx.lang.Rexx title,boolean addText){
  javax.swing.JFrame fenester=null;
  java.lang.Exception ex=null;
  {try{
   fenester=new JFrame(netrexx.lang.Rexx.toString(title));
   fenester.setSize(600,200);
   fenester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   if (addText) 
    decorate(fenester);
   fenester.setVisible(isTrue());
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static javax.swing.JFrame decorate(javax.swing.JFrame fenester){
  return decorate(fenester,"This page intentionally left blank.");
  }
 private static javax.swing.JFrame decorate(javax.swing.JFrame fenester,java.lang.String textStr){
  javax.swing.JLabel textlbl;
  java.awt.Font textfont;
  textlbl=new JLabel(textStr);
  textfont=new Font(Font.SERIF,Font.BOLD,20);
  textlbl.setHorizontalAlignment(JLabel.CENTER);
  textlbl.setFont(textfont);
  textlbl.setForeground(Color.ORANGE);
  fenester.add((java.awt.Component)textlbl,(java.lang.Object)BorderLayout.CENTER);
  
  return fenester;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isTrue(){
  return (1==1);
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static boolean isFalse(){
  return (!((1==1)));
  }
 
 private RWindowCreate(){return;}
 }
