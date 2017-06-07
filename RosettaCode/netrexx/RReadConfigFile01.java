/* Generated from 'RReadConfigFile01.nrx' 12 Nov 2012 14:06:50 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RReadConfigFile01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('[');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(']');
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx('=');
 private static final char[] $08={4,1,1,10,1,0,3,0,10,1,1,1,10,1,2,0};
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('#');
 private static final netrexx.lang.Rexx $010=new netrexx.lang.Rexx(';');
 private static final netrexx.lang.Rexx $011=new netrexx.lang.Rexx(0);
 private static final char[] $012={2,1,44,10,1,0,1,10,1,1,0};
 private static final java.lang.String $0="RReadConfigFile01.nrx";
 
 /* properties constant inheritable */
 protected static final netrexx.lang.Rexx V_SCALAR=new netrexx.lang.Rexx('S');
 protected static final netrexx.lang.Rexx V_ARRAY=new netrexx.lang.Rexx('A');
 protected static final netrexx.lang.Rexx V_BOOL=new netrexx.lang.Rexx('B');
 protected static final boolean isTrue=1==1;
 protected static final boolean isFalse=1==0;

 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx configFile=null;
  netrexx.lang.Rexx requiredVars;
  java.util.Map vars;
  java.lang.Object vkey=null;
  RReadConfigFile01.Variable varn=null;
  netrexx.lang.Rexx key=null;
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx typ=null;
  netrexx.lang.Rexx elmts=null;
  netrexx.lang.Rexx eNr=null;
  
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  configFile=$1[0];}
  
  requiredVars=netrexx.lang.Rexx.toRexx("FULLNAME FAVOURITEFRUIT OTHERFAMILY NEEDSPEELING SEEDSREMOVED");
  
  if (configFile.OpEq(null,$02)|configFile.OpEq(null,$03)) 
   configFile=netrexx.lang.Rexx.toRexx("./data/rosetta.conf");
  vars=readConfigFile(configFile);
  vars=verifyRequiredVars(vars,requiredVars);
  
  netrexx.lang.RexxIO.Say("");
  {java.util.Set $5=vars.keySet();int $4=0;java.lang.Object[] $3=new java.lang.Object[$5.size()];synchronized($5){java.util.Iterator $2=$5.iterator();for(;;){if($4==$3.length)break;$3[$4]=$2.next();$4++;}}vkey:for(;;){if(--$4<0)break;vkey=(java.lang.Object)$3[$4];
   varn=(RReadConfigFile01.Variable)(vars.get(vkey));
   key=varn.getName();
   val=varn.getValue();
   typ=varn.getType();
   if (typ.OpEq(null,V_ARRAY)) 
    {
     elmts=netrexx.lang.Rexx.toRexx("");
     {netrexx.lang.Rexx $6=val.getnode(new netrexx.lang.Rexx((byte)0)).leaf;eNr=new netrexx.lang.Rexx((byte)1);eNr:for(;eNr.OpLtEq(null,$6);eNr=eNr.OpAdd(null,new netrexx.lang.Rexx(1))){
      elmts=(elmts.OpCc(null,val.getnode(eNr).leaf)).OpCc(null,$04);
      }
     }/*eNr*/
     val=($05.OpCc(null,elmts.strip(new netrexx.lang.Rexx('t'),new netrexx.lang.Rexx(',')))).OpCc(null,$06);
    }
   netrexx.lang.RexxIO.Say((((((key.right(new netrexx.lang.Rexx((byte)30))).OpCcblank(null,$05)).OpCc(null,typ)).OpCc(null,$06)).OpCcblank(null,$07)).OpCcblank(null,val));
   }
  }/*vkey*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }

 
 public static java.util.Map verifyRequiredVars(java.util.Map vars,netrexx.lang.Rexx requiredVars){
  netrexx.lang.Rexx vi=null;
  netrexx.lang.Rexx varName=null;
  RReadConfigFile01.Variable varx=null;
  
  {netrexx.lang.Rexx $7=requiredVars.words();vi=new netrexx.lang.Rexx((byte)1);vi:for(;vi.OpLtEq(null,$7);vi=vi.OpAdd(null,new netrexx.lang.Rexx(1))){
   varName=requiredVars.word(vi);
   if ((vars.get((java.lang.Object)varName))==null) 
    {
     varx=new RReadConfigFile01.Variable();
     varx.setName(varName);
     varx.setType(V_BOOL);
     varx.setValue(new netrexx.lang.Rexx(isFalse));
     vars.put((java.lang.Object)(varx.getName()),(java.lang.Object)varx);
    }
   }
  }/*vi*/
  
  return vars;
  }

 
 public static java.util.Map readConfigFile(netrexx.lang.Rexx configFile){
  java.util.Map vars=null;
  netrexx.lang.Rexx configLines;
  netrexx.lang.Rexx lNr=null;
  netrexx.lang.Rexx pc=null;
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx varName=null;
  netrexx.lang.Rexx varVal=null;
  RReadConfigFile01.Variable varx=null;
  netrexx.lang.Rexx elmts=null;
  netrexx.lang.Rexx e_=null;
  netrexx.lang.Rexx elmt=null;
  netrexx.lang.Rexx rest=null;
  
  
  vars=(java.util.Map)(new java.util.HashMap());
  
  configLines=scanFile(configFile);
  {netrexx.lang.Rexx $8=configLines.getnode(new netrexx.lang.Rexx((byte)0)).leaf;lNr=new netrexx.lang.Rexx((byte)1);lNr:for(;lNr.OpLtEq(null,$8);lNr=lNr.OpAdd(null,new netrexx.lang.Rexx(1))){
   {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(configLines.getnode(lNr).leaf.strip(new netrexx.lang.Rexx('b')),$08,$9);
   pc=$9[0];line=$9[2];}
   if ((pc.OpEq(null,$09)|pc.OpEq(null,$010))|(line.length()).OpEq(null,$011)) 
    continue lNr;
   {netrexx.lang.Rexx $10[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(line,$01,$10);
   varName=$10[0];varVal=$10[1];}
   
   varx=new RReadConfigFile01.Variable();
   varx.setName(varName);
   
   {/*select*/
   if ((varVal.length()).OpEq(null,$011))
    {
     varx.setType(V_BOOL);
     varx.setValue(new netrexx.lang.Rexx(isTrue));
    }
   else if ((varVal.pos(new netrexx.lang.Rexx(','))).OpGt(null,$011))
    {
     elmts=netrexx.lang.Rexx.toRexx("");
     elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
     {e_=new netrexx.lang.Rexx((byte)1);e_:for(;;e_=e_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(varVal.length()).OpGt(null,$011))break;
      {netrexx.lang.Rexx $11[]=new netrexx.lang.Rexx[2];
      netrexx.lang.RexxParse.parse(varVal,$012,$11);
      elmt=$11[0];rest=$11[1];}
      elmts.getnode(new netrexx.lang.Rexx((byte)0)).leaf=e_;
      elmts.getnode(e_).leaf=elmt.strip();
      varVal=rest.strip();
      }
     }/*e_*/
     varx.setType(V_ARRAY);
     varx.setValue(elmts);
    }
   else{
    {
     varx.setType(V_SCALAR);
     varx.setValue(varVal);
    }
   }
   }
   vars.put((java.lang.Object)(varx.getName()),(java.lang.Object)varx);
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
  catch (java.io.FileNotFoundException $12){ex=$12;
   ex.printStackTrace();
  }}
  
  return fileLines;
  }
 
 private RReadConfigFile01(){return;}

 
 public static class Variable{
  private final transient java.lang.String $0="RReadConfigFile01.nrx";
  /* properties indirect */
  private netrexx.lang.Rexx name;
  private netrexx.lang.Rexx value;
  private netrexx.lang.Rexx type;
  
  public netrexx.lang.Rexx getName(){return name;}
  
  public void setName(netrexx.lang.Rexx $1){name=$1;return;}
  
  public netrexx.lang.Rexx getValue(){return value;}
  
  public void setValue(netrexx.lang.Rexx $2){value=$2;return;}
  
  public netrexx.lang.Rexx getType(){return type;}
  
  public void setType(netrexx.lang.Rexx $3){type=$3;return;}
  
  public Variable(){return;}
 }}
