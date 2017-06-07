/* Generated from 'RFindCommonDir.nrx' 16 May 2013 18:06:39 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.nio.file.Paths;
import java.nio.file.Path;

/* NetRexx */





public class RFindCommonDir{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("");
 private static final java.lang.String $0="RFindCommonDir.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx commonPath(netrexx.lang.Rexx dirlist){
  netrexx.lang.Rexx common;
  netrexx.lang.Rexx maxL;
  netrexx.lang.Rexx dw=null;
  netrexx.lang.Rexx dirL=null;
  netrexx.lang.Rexx dirR=null;
  netrexx.lang.Rexx commonL=null;
  
  common=dirlist.word(new netrexx.lang.Rexx((byte)1));
  maxL=common.length();
  {dw=new netrexx.lang.Rexx((byte)2);dw:for(;;dw=dw.OpAdd(null,new netrexx.lang.Rexx(1))){if(!dw.OpLtEq(null,dirlist.words()))break;
   dirL=dirlist.word(dw.OpSub(null,$01));
   dirR=dirlist.word(dw);
   commonL=dirL.compare(dirR);
   if (commonL.OpEq(null,$02)) 
    continue dw;
   maxL=maxL.min(commonL);
   }
  }/*dw*/
  common=common.left(common.lastpos(new netrexx.lang.Rexx(java.io.File.separatorChar),maxL));
  
  return common;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx cp1;
  netrexx.lang.Rexx cp2;
  java.nio.file.Path pp1;
  java.nio.file.Path pp2;
  cp1=((netrexx.lang.Rexx.toRexx("/home/user1/tmp/coverage/test").OpCcblank(null,netrexx.lang.Rexx.toRexx("/home/user1/tmp/covert/operator"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("/home/user1/tmp/coven/members"))).OpCcblank(null,$03);
  
  
  
  
  cp2=netrexx.lang.Rexx.toRexx("/home/user1/tmp/coverage/test /hame/user1/tmp/coverage/test");
  
  netrexx.lang.RexxIO.Say(commonPath(cp1));
  netrexx.lang.RexxIO.Say(commonPath(cp2));
  
  pp1=Paths.get(netrexx.lang.Rexx.toString(cp1.word(new netrexx.lang.Rexx((byte)1))),new java.lang.String[]{""});
  pp2=Paths.get(netrexx.lang.Rexx.toString(cp1.word(new netrexx.lang.Rexx((byte)2))),new java.lang.String[]{""});
  netrexx.lang.RexxIO.Say(pp1.toString());
  netrexx.lang.RexxIO.Say(pp2.toString());
  netrexx.lang.RexxIO.Say(pp1.resolveSibling(pp2).toString());
  
  return;
  }
 
 private RFindCommonDir(){return;}
 }
