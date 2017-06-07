/* Generated from 'RWriteName3D01.nrx' 12 Aug 2012 20:07:56 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RWriteName3D01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx((byte)1);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RWriteName3D01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx txt;
  netrexx.lang.Rexx x;
  netrexx.lang.Rexx _top;
  netrexx.lang.Rexx _bot;
  netrexx.lang.Rexx ll=null;
  txt=netrexx.lang.Rexx.toRexx("");
  x=new netrexx.lang.Rexx((byte)0);
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   *    *            *****");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   **   *        *   *    *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   * *  *  ***  ***  *    *  ***  *   * *   *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   *  * * *   *  *   *****  *   *  * *   * *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   *   ** *****  *   *  *   *****   *     *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   *    * *      *   *   *  *      * *   * *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("   *    *  ***    ** *    *  ***  *   * *   *");
  x=x.OpAdd(null,$01);
  txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf=x;
  txt.getnode(x).leaf=netrexx.lang.Rexx.toRexx("");
  
  _top=netrexx.lang.Rexx.toRexx("_TOP");
  _bot=netrexx.lang.Rexx.toRexx("_BOT");
  txt=Banner3D(txt,new netrexx.lang.Rexx(isTrue()));
  {netrexx.lang.Rexx $1=txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ll=new netrexx.lang.Rexx((byte)1);ll:for(;ll.OpLtEq(null,$1);ll=ll.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say(txt.getnode(ll).leaf.getnode(_top).leaf);
   netrexx.lang.RexxIO.Say(txt.getnode(ll).leaf.getnode(_bot).leaf);
   }
  }/*ll*/
  
  return;
  }

 
 public static netrexx.lang.Rexx Banner3D(netrexx.lang.Rexx txt){
  return Banner3D(txt,netrexx.lang.Rexx.toRexx(""));
  }
 public static netrexx.lang.Rexx Banner3D(netrexx.lang.Rexx txt,netrexx.lang.Rexx slope){
  netrexx.lang.Rexx _top;
  netrexx.lang.Rexx _bot;
  netrexx.lang.Rexx ll=null;
  netrexx.lang.Rexx li=null;
  
  {/*select*/
  if (slope.OpEq(null,new netrexx.lang.Rexx(isTrue())))
   ;
  else if (slope.OpEq(null,new netrexx.lang.Rexx(isFalse())))
   ;
  else{
   {
    if (slope.OpEq(null,$02)) 
     slope=new netrexx.lang.Rexx(isFalse());
    else 
     slope=new netrexx.lang.Rexx(isTrue());
   }
  }
  }
  
  _top=netrexx.lang.Rexx.toRexx("_TOP");
  _bot=netrexx.lang.Rexx.toRexx("_BOT");
  {netrexx.lang.Rexx $2=txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf;ll=new netrexx.lang.Rexx((byte)1);ll:for(;ll.OpLtEq(null,$2);ll=ll.OpAdd(null,new netrexx.lang.Rexx(1))){
   txt.getnode(ll).leaf.getnode(_top).leaf=txt.getnode(ll).leaf;
   txt.getnode(ll).leaf.getnode(_bot).leaf=txt.getnode(ll).leaf;
   txt.getnode(ll).leaf.getnode(_top).leaf=txt.getnode(ll).leaf.getnode(_top).leaf.changestr(new netrexx.lang.Rexx(' '),netrexx.lang.Rexx.toRexx("   "));
   txt.getnode(ll).leaf.getnode(_bot).leaf=txt.getnode(ll).leaf.getnode(_bot).leaf.changestr(new netrexx.lang.Rexx(' '),netrexx.lang.Rexx.toRexx("   "));
   txt.getnode(ll).leaf.getnode(_top).leaf=txt.getnode(ll).leaf.getnode(_top).leaf.changestr(new netrexx.lang.Rexx('*'),netrexx.lang.Rexx.toRexx("///"));
   txt.getnode(ll).leaf.getnode(_bot).leaf=txt.getnode(ll).leaf.getnode(_bot).leaf.changestr(new netrexx.lang.Rexx('*'),netrexx.lang.Rexx.toRexx("\\\\\\"));
   txt.getnode(ll).leaf.getnode(_top).leaf=(txt.getnode(ll).leaf.getnode(_top).leaf).OpCc(null,$03);
   txt.getnode(ll).leaf.getnode(_bot).leaf=(txt.getnode(ll).leaf.getnode(_bot).leaf).OpCc(null,$03);
   txt.getnode(ll).leaf.getnode(_top).leaf=txt.getnode(ll).leaf.getnode(_top).leaf.changestr(netrexx.lang.Rexx.toRexx("/ "),netrexx.lang.Rexx.toRexx("/\\"));
   txt.getnode(ll).leaf.getnode(_bot).leaf=txt.getnode(ll).leaf.getnode(_bot).leaf.changestr(netrexx.lang.Rexx.toRexx("\\ "),netrexx.lang.Rexx.toRexx("\\/"));
   }
  }/*ll*/
  
  if (slope.toboolean()) 
   {
    {netrexx.lang.Rexx $3=$01.OpMinus(null);boolean $4=$3.OpGtEq(null,$05);li=(txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpPlus(null);li:for(;$4?li.OpLtEq(null,$04):li.OpGtEq(null,$04);li=li.OpAdd(null,$3)){
     ll=(txt.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpSub(null,li).OpAdd(null,$01);
     txt.getnode(ll).leaf.getnode(_top).leaf=txt.getnode(ll).leaf.getnode(_top).leaf.insert(netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx((byte)1),li.OpSub(null,$01),new netrexx.lang.Rexx(' '));
     txt.getnode(ll).leaf.getnode(_bot).leaf=txt.getnode(ll).leaf.getnode(_bot).leaf.insert(netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx((byte)1),li.OpSub(null,$01),new netrexx.lang.Rexx(' '));
     }
    }/*li*/
   }
  
  return txt;
  }

 
 public static final boolean isTrue(){
  return 1==1;
  }

 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 private RWriteName3D01(){return;}
 }
