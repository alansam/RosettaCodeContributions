/* Generated from 'RQuine02.nrx' 3 Nov 2012 09:15:28 [v3.01] */
/* Options: Comments Compact Crossref Decimal Format Java Logo Replace Symbols Trace2 UTF8 Verbose3 */

/* NetRexx */



public class RQuine02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("  ");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx(", -");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("NL");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("AMP");
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("ESC");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("QS");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("REP");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final char[] $09={6,1,10,1,0,1,10,1,2,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('n');
 private static final java.lang.String $0="RQuine02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx Q;
  netrexx.lang.Rexx S;
  netrexx.lang.Rexx N;
  netrexx.lang.Rexx A;
  netrexx.lang.Rexx code[];
  netrexx.lang.Rexx pgm;
  netrexx.lang.Rexx txt;
  netrexx.lang.Rexx t_=null;
  netrexx.lang.Rexx K;
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx v_=null;
  netrexx.lang.Rexx T=null;
  netrexx.lang.Rexx pre=null;
  netrexx.lang.Rexx post=null;
  Q=new netrexx.lang.Rexx('\'');
  S=new netrexx.lang.Rexx('\\');
  N=new netrexx.lang.Rexx('\n');
  A=new netrexx.lang.Rexx('&');
  code=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("/* NetRexx */"),netrexx.lang.Rexx.toRexx("options replace format comments java crossref savelog symbols nobinary"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("Q = \"&QS\""),netrexx.lang.Rexx.toRexx("S = \"&ESC\""),netrexx.lang.Rexx.toRexx("N = \"&NL\""),netrexx.lang.Rexx.toRexx("A = \"&AMP\""),netrexx.lang.Rexx.toRexx("code = [ -"),netrexx.lang.Rexx.toRexx("&REP"),netrexx.lang.Rexx.toRexx("  ]"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("pgm = \"\""),netrexx.lang.Rexx.toRexx("txt = \"\""),netrexx.lang.Rexx.toRexx("loop t_ = 0 for code.length"),netrexx.lang.Rexx.toRexx("  txt = txt || \"  \" || Q || code[t_] || Q || \", -\" || N"),netrexx.lang.Rexx.toRexx("  end t_"),netrexx.lang.Rexx.toRexx("txt = txt.strip(\"T\", N)"),netrexx.lang.Rexx.toRexx("txt = txt.delstr(txt.lastpos(\",\"), 1)"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("K = \"\""),netrexx.lang.Rexx.toRexx("K[0] = 5"),netrexx.lang.Rexx.toRexx("K[1] = A\"NL\""),netrexx.lang.Rexx.toRexx("K[2] = A\"AMP\""),netrexx.lang.Rexx.toRexx("K[3] = A\"ESC\""),netrexx.lang.Rexx.toRexx("K[4] = A\"QS\""),netrexx.lang.Rexx.toRexx("K[5] = A\"REP\""),netrexx.lang.Rexx.toRexx("loop c_ = 0 for code.length"),netrexx.lang.Rexx.toRexx("  loop v_ = 1 to K[0]"),netrexx.lang.Rexx.toRexx("    T = K[v_]"),netrexx.lang.Rexx.toRexx("    if code[c_].pos(T) <> 0 then do"),netrexx.lang.Rexx.toRexx("      parse code[c_] pre(T)post"),netrexx.lang.Rexx.toRexx("      select case T"),netrexx.lang.Rexx.toRexx("        when K[1] then do"),netrexx.lang.Rexx.toRexx("          code[c_] = pre || S || \"n\" || post"),netrexx.lang.Rexx.toRexx("          end"),netrexx.lang.Rexx.toRexx("        when K[2] then do"),netrexx.lang.Rexx.toRexx("          code[c_] = pre || A || post"),netrexx.lang.Rexx.toRexx("          end"),netrexx.lang.Rexx.toRexx("        when K[3] then do"),netrexx.lang.Rexx.toRexx("          code[c_] = pre || S || S || post"),netrexx.lang.Rexx.toRexx("          end"),netrexx.lang.Rexx.toRexx("        when K[4] then do"),netrexx.lang.Rexx.toRexx("          code[c_] = pre || Q || post"),netrexx.lang.Rexx.toRexx("          end"),netrexx.lang.Rexx.toRexx("        when K[5] then do"),netrexx.lang.Rexx.toRexx("          code[c_] = txt"),netrexx.lang.Rexx.toRexx("          end"),netrexx.lang.Rexx.toRexx("        otherwise nop"),netrexx.lang.Rexx.toRexx("        end"),netrexx.lang.Rexx.toRexx("      end"),netrexx.lang.Rexx.toRexx("    end v_"),netrexx.lang.Rexx.toRexx("  pgm = pgm || code[c_].strip(\"T\") || N"),netrexx.lang.Rexx.toRexx("  end c_"),netrexx.lang.Rexx.toRexx("pgm = pgm.strip(\"T\", N) || N"),netrexx.lang.Rexx.toRexx("say pgm"),netrexx.lang.Rexx.toRexx(""),netrexx.lang.Rexx.toRexx("return"),netrexx.lang.Rexx.toRexx("")};
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  pgm=netrexx.lang.Rexx.toRexx("");
  txt=netrexx.lang.Rexx.toRexx("");
  {int $1=new netrexx.lang.Rexx(code.length).OpPlus(null).toint();t_=new netrexx.lang.Rexx((byte)0);t_:for(;$1>0;$1--,t_=t_.OpAdd(null,new netrexx.lang.Rexx(1))){
   txt=(((((txt.OpCc(null,$01)).OpCc(null,Q)).OpCc(null,code[t_.toint()])).OpCc(null,Q)).OpCc(null,$02)).OpCc(null,N);
   }
  }/*t_*/
  txt=txt.strip(new netrexx.lang.Rexx('T'),N);
  txt=txt.delstr(txt.lastpos(new netrexx.lang.Rexx(',')),new netrexx.lang.Rexx((byte)1));
  
  K=netrexx.lang.Rexx.toRexx("");
  K.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)5);
  K.getnode(new netrexx.lang.Rexx((byte)1)).leaf=A.OpCc(null,$03);
  K.getnode(new netrexx.lang.Rexx((byte)2)).leaf=A.OpCc(null,$04);
  K.getnode(new netrexx.lang.Rexx((byte)3)).leaf=A.OpCc(null,$05);
  K.getnode(new netrexx.lang.Rexx((byte)4)).leaf=A.OpCc(null,$06);
  K.getnode(new netrexx.lang.Rexx((byte)5)).leaf=A.OpCc(null,$07);
  {int $2=new netrexx.lang.Rexx(code.length).OpPlus(null).toint();c_=new netrexx.lang.Rexx((byte)0);c_:for(;$2>0;$2--,c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $3=K.getnode(new netrexx.lang.Rexx((byte)0)).leaf;v_=new netrexx.lang.Rexx((byte)1);v_:for(;v_.OpLtEq(null,$3);v_=v_.OpAdd(null,new netrexx.lang.Rexx(1))){
    T=K.getnode(v_).leaf;
    if ((code[c_.toint()].pos(T)).OpNotEq(null,$08)) 
     {
      {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
      $4[1]=T;
      netrexx.lang.RexxParse.parse(code[c_.toint()],$09,$4);
      pre=$4[0];post=$4[2];}
      {/*select*/
      if (T.OpEqS(null,(K.getnode(new netrexx.lang.Rexx((byte)1)).leaf)))
       {
        code[c_.toint()]=((pre.OpCc(null,S)).OpCc(null,$010)).OpCc(null,post);
       }
      else if (T.OpEqS(null,(K.getnode(new netrexx.lang.Rexx((byte)2)).leaf)))
       {
        code[c_.toint()]=(pre.OpCc(null,A)).OpCc(null,post);
       }
      else if (T.OpEqS(null,(K.getnode(new netrexx.lang.Rexx((byte)3)).leaf)))
       {
        code[c_.toint()]=((pre.OpCc(null,S)).OpCc(null,S)).OpCc(null,post);
       }
      else if (T.OpEqS(null,(K.getnode(new netrexx.lang.Rexx((byte)4)).leaf)))
       {
        code[c_.toint()]=(pre.OpCc(null,Q)).OpCc(null,post);
       }
      else if (T.OpEqS(null,(K.getnode(new netrexx.lang.Rexx((byte)5)).leaf)))
       {
        code[c_.toint()]=txt;
       }
      else{
       ;
      }
      }
     }
    }
   }/*v_*/
   pgm=(pgm.OpCc(null,code[c_.toint()].strip(new netrexx.lang.Rexx('T')))).OpCc(null,N);
   }
  }/*c_*/
  pgm=(pgm.strip(new netrexx.lang.Rexx('T'),N)).OpCc(null,N);
  netrexx.lang.RexxIO.Say(pgm);
  
  return;
  }
 
 private RQuine02(){return;}
 }
