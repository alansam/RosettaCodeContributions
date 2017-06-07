/* Generated from 'nth_root.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

public class nth_root{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("     x	= ");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("  root	= ");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("digits	= ");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("answer	= ");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(5);
 private static final java.lang.String $0="nth_root.nrx";
 
 
 public static void main(java.lang.String args[]){
  java.lang.String x;
  java.lang.String root;
  java.lang.String digs=null;
  netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
  if (new netrexx.lang.Rexx(args.length).OpLt($1,$01)) 
   {
    netrexx.lang.RexxIO.Say("at least 2 arguments expected");
    {System.exit(0);return;}
   }
  x=args[0];
  root=args[1];
  if (new netrexx.lang.Rexx(args.length).OpGt($1,$01)) 
   digs=args[2];
  if (root.equals("")) 
   root=java.lang.String.valueOf((byte)2);
  if ((digs==null)||netrexx.lang.Rexx.toRexx(digs).OpEq($1,$02)) 
   digs=java.lang.String.valueOf((byte)20);
  $1.setDigits(netrexx.lang.Rexx.toRexx(digs));
  netrexx.lang.RexxIO.Say($03.OpCcblank($1,netrexx.lang.Rexx.toRexx(x)));
  netrexx.lang.RexxIO.Say($04.OpCcblank($1,netrexx.lang.Rexx.toRexx(root)));
  netrexx.lang.RexxIO.Say($05.OpCcblank($1,netrexx.lang.Rexx.toRexx(digs)));
  netrexx.lang.RexxIO.Say($06.OpCcblank($1,root(netrexx.lang.Rexx.toRexx(x),netrexx.lang.Rexx.toRexx(root),netrexx.lang.Rexx.toRexx(digs))));
  return;}
 
 
 public static netrexx.lang.Rexx root(netrexx.lang.Rexx x,netrexx.lang.Rexx r,netrexx.lang.Rexx digs){
  netrexx.lang.Rexx oldR;
  netrexx.lang.Rexx Rm1;
  netrexx.lang.Rexx oldDigs;
  netrexx.lang.Rexx dm;
  netrexx.lang.Rexx ax;
  netrexx.lang.Rexx g;
  netrexx.lang.Rexx d;
  netrexx.lang.Rexx old=null;
  netrexx.lang.Rexx _=null;
  netrexx.lang.RexxSet $2=new netrexx.lang.RexxSet();
  r=r;
  oldR=r;
  if (r.OpEq($2,$07)) 
   {
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say("*** error! ***");
    netrexx.lang.RexxIO.Say("a root of zero can\'t be specified.");
    netrexx.lang.RexxIO.Say("");
    return netrexx.lang.Rexx.toRexx("[n/a]");
   }
  r=r.abs();
  if (x.OpLt($2,$07)&((r.OpRem($2,$01).OpEqS($2,$07)))) 
   {
    netrexx.lang.RexxIO.Say("");
    netrexx.lang.RexxIO.Say("*** error! ***");
    netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("an even root can\'t be calculated for a").OpCcblank($2,netrexx.lang.Rexx.toRexx("negative number,")));
    netrexx.lang.RexxIO.Say("the result would be complex.");
    netrexx.lang.RexxIO.Say("");
    return netrexx.lang.Rexx.toRexx("[n/a]");
   }
  if (x.OpEq($2,$07)|r.OpEq($2,$08)) 
   return x.OpDiv($2,$08);
  Rm1=r.OpSub($2,$08);
  oldDigs=digs;
  dm=oldDigs.OpAdd($2,$09);
  ax=x.abs();
  g=((ax.OpAdd($2,$08))).OpDiv($2,r.OpPow($2,r));
  d=new netrexx.lang.Rexx((byte)5);
  {$4:for(;;){
   d=d.OpAdd($2,d);
   if (d.OpGt($2,dm)) 
    d=dm;
   $2.setDigits(d);
   old=new netrexx.lang.Rexx((byte)0);
   {$3:for(;;){
    _=((Rm1.OpMult($2,g.OpPow($2,r)).OpAdd($2,ax))).OpDiv($2,r).OpDiv($2,g.OpPow($2,Rm1));
    if (_.OpEq($2,g)|_.OpEq($2,old)) 
     break $3;
    old=g;
    g=_;
    }
   }
   if (d.OpEqS($2,dm)) 
    break $4;
   }
  }
  _=g.OpMult($2,x.sign());
  if (oldR.OpLt($2,$07)) 
   return new netrexx.lang.Rexx(_.OpEq($2,$08.OpDiv($2,_)));
  $2.setDigits(oldDigs);
  return _.OpDiv($2,$08);
  }
 
 private nth_root(){return;}
 }