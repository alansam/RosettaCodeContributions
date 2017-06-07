/* Generated from 'RSortingCyclesort100.nrx' 18 Jun 2014 16:00:26 [v3.03] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/*REXX program demonstrates a cycle sort on a list of numbers**********
* 13.06.2014 Walter Pachl
* Modified from Rexx Version 2
* ooRexx allows to pass a stemmed variable by reference
* swapping variables uses a temporary instead of the parse.
**********************************************************************/


public class RSortingCyclesort100{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("This took");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("writes.");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RSortingCyclesort100.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx w;
  a=netrexx.lang.Rexx.toRexx("");
  a.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("George Washington  Virginia");
  a.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("John Adams  Massachusetts");
  a.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("Thomas Jefferson  Virginia");
  a.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("James Madison  Virginia");
  a.getnode(new netrexx.lang.Rexx((byte)5)).leaf=netrexx.lang.Rexx.toRexx("James Monroe  Virginia");
  n=new netrexx.lang.Rexx((byte)5);
  show(a,n,netrexx.lang.Rexx.toRexx("Unsorted list: "));
  w=sortcycle(a,n);
  netrexx.lang.RexxIO.Say("sorted");
  show(a,n,netrexx.lang.Rexx.toRexx("Sorted list"));
  netrexx.lang.RexxIO.Say(' ');
  netrexx.lang.RexxIO.Say(($01.OpCcblank(null,w)).OpCcblank(null,$02));
  {System.exit(0);return;}
  }

 
 public static netrexx.lang.Rexx sortcycle(netrexx.lang.Rexx a,netrexx.lang.Rexx n){
  netrexx.lang.Rexx writes;
  netrexx.lang.Rexx c=null;
  netrexx.lang.Rexx x=null;
  netrexx.lang.Rexx p=null;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx t=null;
  netrexx.lang.Rexx k=null;
  writes=new netrexx.lang.Rexx((byte)0);
  {int $1=n.OpPlus(null).toint();c=new netrexx.lang.Rexx((byte)1);c:for(;$1>0;$1--,c=c.OpAdd(null,new netrexx.lang.Rexx(1))){
   x=a.getnode(c).leaf;
   p=c;
   x=a.getnode(c).leaf;
   {netrexx.lang.Rexx $2=n;j=c.OpAdd(null,$03).OpPlus(null);j:for(;j.OpLtEq(null,$2);j=j.OpAdd(null,new netrexx.lang.Rexx(1))){
    if ((a.getnode(j).leaf).OpLt(null,x)) 
     p=p.OpAdd(null,$03);
    }
   }/*j*/
   if (p.OpEqS(null,c)) 
    continue c;
   {for(;;){if(!x.OpEqS(null,a.getnode(p).leaf))break;
    p=p.OpAdd(null,$03);
    }
   }
   t=x;
   x=a.getnode(p).leaf;
   a.getnode(p).leaf=t;
   writes=writes.OpAdd(null,$03);
   {for(;;){if(!p.OpNotEqS(null,c))break;
    p=c;
    {netrexx.lang.Rexx $3=n;k=c.OpAdd(null,$03).OpPlus(null);k:for(;k.OpLtEq(null,$3);k=k.OpAdd(null,new netrexx.lang.Rexx(1))){
     if ((a.getnode(k).leaf).OpLt(null,x)) 
      p=p.OpAdd(null,$03);
     }
    }/*k*/
    {for(;;){if(!x.OpEqS(null,a.getnode(p).leaf))break;
     p=p.OpAdd(null,$03);
     }
    }
    t=x;
    x=a.getnode(p).leaf;
    a.getnode(p).leaf=t;
    writes=writes.OpAdd(null,$03);
    }
   }
   }
  }/*c*/
  return writes;
  }

 
 public static void show(netrexx.lang.Rexx a,netrexx.lang.Rexx n,netrexx.lang.Rexx hdr){
  netrexx.lang.Rexx i=null;
  netrexx.lang.RexxIO.Say(' ');
  netrexx.lang.RexxIO.Say(hdr);
  {netrexx.lang.Rexx $4=n;i=new netrexx.lang.Rexx((byte)1);i:for(;i.OpLtEq(null,$4);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((i.format(new netrexx.lang.Rexx((byte)2))).OpCcblank(null,a.getnode(i).leaf));
   }
  }/*i*/
  return;
  }
 
 private RSortingCyclesort100(){return;}
 }
