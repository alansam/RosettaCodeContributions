/* Generated from 'zVersion.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class zVersion{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("NetRexx 3.01 23 Aug 2012");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("Java method zVersion.nrx");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('\000');
 private static final java.lang.String $0="zVersion.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx ver=null;
  netrexx.lang.Rexx src=null;
  netrexx.lang.Rexx arry[];
  netrexx.lang.Rexx stem;
  int irry[];
  java.util.List list=null;
  netrexx.lang.Rexx lmnt=null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  ver=$1[0];}
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($03,$02,$2);
  src=$2[0];}
  
  netrexx.lang.RexxIO.Say(ver);
  netrexx.lang.RexxIO.Say(src);
  
  arry=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("k1"),netrexx.lang.Rexx.toRexx("k2"),netrexx.lang.Rexx.toRexx("k3")};
  
  stem=netrexx.lang.Rexx.toRexx("s1");
  stem.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("s1");
  stem.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("s2");
  stem.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("s3");
  
  irry=new int[]{new netrexx.lang.Rexx(3).toint(),1,4,1,5,9,2,6,5,3,5,9};
  
  
  list=(java.util.List)(new java.util.ArrayList());
  list.add((java.lang.Object)"l1");
  list.add((java.lang.Object)"l2");
  list.add((java.lang.Object)"l3");
  
  {int $5=0;netrexx.lang.Rexx[] $4=new netrexx.lang.Rexx[arry.length];synchronized(arry){for(;;){if($5==$4.length)break;$4[$5]=arry[arry.length-1-$5];$5++;}}lmnt:for(;;){if(--$5<0)break;lmnt=(netrexx.lang.Rexx)$4[$5];
   netrexx.lang.RexxIO.Say(lmnt.OpCcblank(null,$04));
   }
  }/*lmnt*/
  netrexx.lang.RexxIO.Say("");
  
  {int $8=0;java.util.Vector $7=new java.util.Vector(100,0);synchronized(stem){java.util.Enumeration $6=stem.keys();for(;;){if(!$6.hasMoreElements())break;$7.addElement($6.nextElement());if(!stem.testnode((netrexx.lang.Rexx)($7.elementAt($8)))){$7.removeElementAt($8);continue;}$8++;}}lmnt:for(;;){if(--$8<0)break;lmnt=(netrexx.lang.Rexx)$7.elementAt($8);
   netrexx.lang.RexxIO.Say((stem.getnode(lmnt).leaf).OpCcblank(null,$04));
   }
  }/*lmnt*/
  netrexx.lang.RexxIO.Say("");
  
  {int $11=0;int[] $10=new int[irry.length];synchronized(irry){for(;;){if($11==$10.length)break;$10[$11]=irry[irry.length-1-$11];$11++;}}lmnt:for(;;){if(--$11<0)break;lmnt=new netrexx.lang.Rexx((int)$10[$11]);
   netrexx.lang.RexxIO.Say(lmnt.OpCcblank(null,$04));
   }
  }/*lmnt*/
  netrexx.lang.RexxIO.Say("");
  
  {int $14=0;java.lang.Object[] $13=new java.lang.Object[list.size()];synchronized(list){java.util.Iterator $12=list.iterator();for(;;){if($14==$13.length)break;$13[$14]=$12.next();$14++;}}lmnt:for(;;){if(--$14<0)break;lmnt=(netrexx.lang.Rexx)((java.lang.Object)$13[$14]);
   netrexx.lang.RexxIO.Say(lmnt.OpCcblank(null,$04));
   }
  }/*lmnt*/
  netrexx.lang.RexxIO.Say("");
  return;}
 
 private zVersion(){return;}
 }
