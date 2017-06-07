/* Generated from 'RReadConfigFile02.nrx' 12 Nov 2012 13:07:37 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadConfigFile02{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String[] $05={"vars","varx","varname"};
 private static final java.lang.String $06="  vars = Map";
 private static final java.lang.String[] $07={"vars"};
 private static final java.lang.String $08="  vars = HashMap()";
 private static final char[] $09={4,1,1,10,1,0,3,0,10,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx('#');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(';');
 private static final netrexx.lang.Rexx $012=new netrexx.lang.Rexx(0);
 private static final java.lang.String $013="    parse line varName varVal";
 private static final java.lang.String[] $014={"varname","varval"};
 private static final java.lang.String $015="    varx = Rexx('')";
 private static final java.lang.String[] $016={"varx"};
 private static final java.lang.String $017="        varx    = V_BOOL";
 private static final java.lang.String $018="        varx[0] = 1";
 private static final java.lang.String $019="        varx[1] = isTrue";
 private static final java.lang.String $020="        varx    = V_ARRAY";
 private static final java.lang.String $021="        varx[0] = 0";
 private static final char[] $022={2,1,44,10,1,0,1,10,1,1,0};
 private static final java.lang.String $023="          varx[0]  = e_";
 private static final java.lang.String $024="          varx[e_] = elmt.strip()";
 private static final java.lang.String $025="        varx    = V_SCALAR";
 private static final java.lang.String $026="        varx[1] = varVal";
 private static final java.lang.String $027="    varx = null";
 private static final java.lang.String $0="RReadConfigFile02.nrx";
 
 /* properties constant inheritable */
 protected static final netrexx.lang.Rexx V_SCALAR=new netrexx.lang.Rexx('S');
 protected static final netrexx.lang.Rexx V_ARRAY=new netrexx.lang.Rexx('A');
 protected static final netrexx.lang.Rexx V_BOOL=new netrexx.lang.Rexx('B');
 protected static final netrexx.lang.Rexx E_TYPE=netrexx.lang.Rexx.toRexx("TYPE");
 protected static final boolean isTrue=1==1;
 protected static final boolean isFalse=1==0;

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx configFile=null;
  java.util.Map vars;
  java.lang.Object xvar=null;
  netrexx.lang.Rexx xval=null;
  netrexx.lang.Rexx vi=null;
  
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  configFile=$1[0];}
  
  if (configFile.OpEq(null,$02)|configFile.OpEq(null,$03)) 
   configFile=netrexx.lang.Rexx.toRexx("./data/rosetta.conf");
  vars=readConfigFile(configFile);
  
  //  requiredVars = 'FULLNAME FAVOURITEFRUIT OTHERFAMILY NEEDSPEELING SEEDSREMOVED'
  //  vars = verifyRequiredVars(vars, requiredVars)
  
  netrexx.lang.RexxIO.Say("");
  {java.util.Set $5=vars.keySet();int $4=0;java.lang.Object[] $3=new java.lang.Object[$5.size()];synchronized($5){java.util.Iterator $2=$5.iterator();for(;;){if($4==$3.length)break;$3[$4]=$2.next();$4++;}}xvar:for(;;){if(--$4<0)break;xvar=(java.lang.Object)$3[$4];
   xval=(netrexx.lang.Rexx)(vars.get(xvar));
   netrexx.lang.RexxIO.Say((((((netrexx.lang.Rexx)xvar).right(new netrexx.lang.Rexx((byte)20))).OpCc(null,$04)).OpCcblank(null,xval)).OpCcblank(null,xval.getnode(new netrexx.lang.Rexx((byte)0)).leaf));
   {netrexx.lang.Rexx $6=xval.getnode(new netrexx.lang.Rexx((byte)0)).leaf;vi=new netrexx.lang.Rexx((byte)1);vi:for(;vi.OpLtEq(null,$6);vi=vi.OpAdd(null,new netrexx.lang.Rexx(1))){
    netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(' ').copies(new netrexx.lang.Rexx((byte)20)).OpCc(null,$04)).OpCcblank(null,xval.getnode(vi).leaf));
    }
   }/*vi*/
   }
  }/*xvar*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
/*
 method verifyRequiredVars(vars = Map, requiredVars) public static returns Rexx
 
   xvars = ''
   loop w_ = 1 to requiredVars.words()
     key = requiredVars.word(w_)
     if vars[key] = '' then do
       -- The required key doesn't exist so create a new entry as a  boolean and set it's value to false
       vals = V_BOOL
       vals[0] = 1
       vals[1] = isFalse
       end
     xvars[key] = vals
     end w_
   newvars = vars.copyindexed(xvars)
 
   return newvars
 */
 
 public static java.util.Map readConfigFile(netrexx.lang.Rexx configFile){
  java.util.Map vars=null;
  netrexx.lang.Rexx configLines;
  netrexx.lang.Rexx lNr=null;
  netrexx.lang.Rexx pc=null;
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx varName=null;
  netrexx.lang.Rexx varVal=null;
  netrexx.lang.Rexx varx=null;
  netrexx.lang.Rexx e_=null;
  netrexx.lang.Rexx elmt=null;
  netrexx.lang.Rexx rest=null;
  netrexx.lang.RexxTrace $7=new netrexx.lang.RexxTrace(115,System.err,"RReadConfigFile02.nrx");
  
  $7.modnames($05,null);
  $7.traceclause(57,$06,1,$07);
$7.traceclause(58,$08,1,$07);vars=(java.util.Map)(((java.util.HashMap)$7.traceObject(58,new java.util.HashMap(),'v',1,"vars")));
  
  configLines=scanFile(configFile);
  {netrexx.lang.Rexx $8=configLines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;lNr=new netrexx.lang.Rexx((byte)1);boolean $9=true;lNr:for(;;){if($9){$9=false;}else{lNr=lNr.OpAdd(null,new netrexx.lang.Rexx(1));}if(!(lNr.OpLtEq(null,$8)))break;
   {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(configLines.getnode(lNr).leaf.strip(new netrexx.lang.Rexx('b')),$09,$10);
   pc=$10[0];line=$10[2];}
   if ((pc.OpEq(null,$010)|pc.OpEq(null,$011))|(line.length()).OpEq(null,$012)){
    continue lNr;
    }
   $7.traceclause(64,$013,1,$014);{netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(line,$01,$11);
   varName=($7.traceRexx(64,$11[0],'v',1,"varName"));varVal=$11[1];}
   $7.traceclause(65,$015,1,$016);varx=($7.traceRexx(65,new netrexx.lang.Rexx(""),'v',1,"varx"));
   
   {/*select*/
   if ((varVal.length()).OpEq(null,$012)){
    {
     $7.traceclause(69,$017,1,$016);varx=($7.traceRexx(69,V_BOOL,'v',1,"varx"));
     $7.traceclause(70,$018,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx(($7.tracebyte(70,(byte)((byte)1),'v',1,"varx")));
     $7.traceclause(71,$019,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)1)).leaf=new netrexx.lang.Rexx(($7.traceboolean(71,(boolean)(isTrue),'v',1,"varx")));
    }
   }else{if ((varVal.pos(new netrexx.lang.Rexx(','))).OpGt(null,$012)){
    {
     $7.traceclause(74,$020,1,$016);varx=($7.traceRexx(74,V_ARRAY,'v',1,"varx"));
     $7.traceclause(75,$021,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx(($7.tracebyte(75,(byte)((byte)0),'v',1,"varx")));
     {e_=new netrexx.lang.Rexx((byte)1);boolean $12=true;e_:for(;;){if($12){$12=false;}else{e_=e_.OpAdd(null,new netrexx.lang.Rexx(1));}if(!(varVal.length()).OpGt(null,$012))break;
      {netrexx.lang.Rexx $13[]=new netrexx.lang.Rexx[2];
      netrexx.lang.RexxParse.parse(varVal,$022,$13);
      elmt=$13[0];rest=$13[1];}
      $7.traceclause(78,$023,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)0)).leaf=($7.traceRexx(78,e_,'v',1,"varx"));
      $7.traceclause(79,$024,1,$016);varx.getnode(e_).leaf=($7.traceRexx(79,elmt.strip(),'v',1,"varx"));
      varVal=rest.strip();
      }
     }/*e_*/
    }
   }else{
    {
     $7.traceclause(84,$025,1,$016);varx=($7.traceRexx(84,V_SCALAR,'v',1,"varx"));
     $7.traceclause(85,$018,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx(($7.tracebyte(85,(byte)((byte)1),'v',1,"varx")));
     $7.traceclause(86,$026,1,$016);varx.getnode(new netrexx.lang.Rexx((byte)1)).leaf=($7.traceRexx(86,varVal,'v',1,"varx"));
    }
   }}
   }
   
   vars.put((java.lang.Object)varName,(java.lang.Object)varx);
   $7.traceclause(91,$027,1,$016);varx=(netrexx.lang.Rexx)null;
   netrexx.lang.RexxIO.Say(((java.util.HashMap)vars).toString());
   }
  }/*lNr*/
  
  return vars;
  }

 // Read a file and return contents as a Rexx indexed string
 
 public static netrexx.lang.Rexx scanFile(netrexx.lang.Rexx inFileName){
  netrexx.lang.Rexx fileLines;
  java.io.File inFile=null;
  java.util.Scanner inFileScanner=null;
  netrexx.lang.Rexx l_=null;
  java.io.FileNotFoundException ex=null;
  
  fileLines=netrexx.lang.Rexx.toRexx("");
  {try{
   inFile=new java.io.File(netrexx.lang.Rexx.toString(inFileName));
   inFileScanner=new java.util.Scanner(inFile);
   {l_=new netrexx.lang.Rexx((byte)1);l_:for(;;l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(inFileScanner.hasNext()))break;
    fileLines.getnode(new netrexx.lang.Rexx((byte)0)).leaf=l_;
    fileLines.getnode(l_).leaf=netrexx.lang.Rexx.toRexx(inFileScanner.nextLine());
    }
   }/*l_*/
   inFileScanner.close();
  }
  catch (java.io.FileNotFoundException $14){ex=$14;
   ex.printStackTrace();
  }}
  
  return fileLines;
  }
 
 private RReadConfigFile02(){return;}
 }
