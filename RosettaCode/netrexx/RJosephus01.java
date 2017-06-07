/* Generated from 'RJosephus01.nrx' 16 Nov 2012 20:54:16 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */


/* REXX **************************************************************
* 15.11.2012 Walter Pachl - my own solution
* 16.11.2012 Walter Pachl generalized n prisoners + w killing distance
*                         and s=number of survivors
**********************************************************************/

public class RJosephus01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("killed:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("       ");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx((byte)40);
 private static final java.lang.String $0="RJosephus01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dead;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx nn;
  netrexx.lang.Rexx w;
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx p;
  netrexx.lang.Rexx killed;
  netrexx.lang.Rexx found=null;
  netrexx.lang.Rexx i=null;
  dead=new netrexx.lang.Rexx((byte)0);/* nobody's dead yet          */
  n=new netrexx.lang.Rexx((byte)41);/* number of alive prisoners  */
  nn=n;/* wrap around boundary       */
  w=new netrexx.lang.Rexx((byte)3);/* killing count              */
  s=new netrexx.lang.Rexx((byte)1);/* nuber of survivors         */
  p=$01.OpMinus(null);/* start here                 */
  killed=netrexx.lang.Rexx.toRexx("");/* output of killings         */
  {boolean $1=true;for(;;){if($1){$1=false;}else{if(n.OpEq(null,s))break;}/* until one alive prisoner   */
   found=new netrexx.lang.Rexx((byte)0);/* start looking              */
   {boolean $2=true;for(;;){if($2){$2=false;}else{if(found.OpEq(null,w))break;}/* until we have the third    */
    p=p.OpAdd(null,$01);/* next position              */
    if (p.OpEq(null,nn)) 
     p=new netrexx.lang.Rexx((byte)0);/* wrap around                */
    if ((dead.getnode(p).leaf).OpEq(null,$02)) /* a prisoner who is alive    */
     found=found.OpAdd(null,$01);/* increment found count      */
    }
   }
   dead.getnode(p).leaf=new netrexx.lang.Rexx((byte)1);
   n=n.OpSub(null,$01);/* shoot the one on this pos. */
   killed=killed.OpCcblank(null,p);/* add to output              */
   }
  }/* End of main loop           */
  netrexx.lang.RexxIO.Say($03.OpCc(null,killed.subword(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)20))));/* output killing sequence    */
  netrexx.lang.RexxIO.Say($04.OpCc(null,killed.subword(new netrexx.lang.Rexx((byte)21))));/* output killing sequence    */
  netrexx.lang.RexxIO.Say("Survivor(s):");/* show                       */
  {i=new netrexx.lang.Rexx((byte)0);i:for(;i.OpLtEq(null,$05);i=i.OpAdd(null,new netrexx.lang.Rexx(1))){/* look for the surviving p's */
   if ((dead.getnode(i).leaf).OpEq(null,$02)) 
    netrexx.lang.RexxIO.Say(i);/* found one                  */
   }
  }/*i*/
  return;}
 
 private RJosephus01(){return;}
 }
