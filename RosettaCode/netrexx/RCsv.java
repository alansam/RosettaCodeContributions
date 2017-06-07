/* Generated from 'RCsv.nrx' 1 May 2014 18:49:01 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */

// classpath /Users/alansampson/apache/commons/commons-csv/trunk/target/commons-csv-1.0-SNAPSHOT.jar:.



// =============================================================================

public final class RCsv{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('.');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RCsv.nrx";
 
 /* properties private constant */
 private static final java.lang.String NL=java.lang.System.getProperty("line.separator");
 private static final java.lang.String COL_NAME_SUM="SUM, \"integers\"";
 private static final netrexx.lang.Rexx CSV_IFILE=netrexx.lang.Rexx.toRexx("data/csvtest_in.csv");
 private static final netrexx.lang.Rexx CSV_OFILE=netrexx.lang.Rexx.toRexx("data/csvtest_sumRexx.csv");

 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx Arg;
  java.io.Reader iCvs;
  java.io.Writer oCvs;
  netrexx.lang.Rexx ifile=null;
  netrexx.lang.Rexx ofile=null;
  java.io.IOException ex=null;
  Arg=new netrexx.lang.Rexx(args);
  iCvs=(java.io.Reader)null;
  oCvs=(java.io.Writer)null;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(Arg,$01,$1);
  ifile=$1[0];ofile=$1[1];}
  if (ifile.OpEq(null,$02)||ifile.OpEq(null,$03)) 
   ifile=CSV_IFILE;
  if (ofile.OpEq(null,$02)||ofile.OpEq(null,$03)) 
   ofile=CSV_OFILE;
  netrexx.lang.RexxIO.Say(textFileContentsToString(ifile));
  {try{
   iCvs=(java.io.Reader)(new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(netrexx.lang.Rexx.toString(ifile)))));
   oCvs=(java.io.Writer)(new java.io.BufferedWriter((java.io.Writer)(new java.io.FileWriter(netrexx.lang.Rexx.toString(ofile)))));
   processCsv(iCvs,oCvs);
  }
  catch (java.io.IOException $2){ex=$2;
   ex.printStackTrace();
  }
  finally{
   {try{
    if (iCvs!=null) 
     iCvs.close();
    if (oCvs!=null) 
     oCvs.close();
   }
   catch (java.io.IOException $3){ex=$3;
    ex.printStackTrace();
   }}
  }}
  netrexx.lang.RexxIO.Say(textFileContentsToString(ofile));
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void processCsv(java.io.Reader iCvs,java.io.Writer oCvs) throws java.io.IOException{
  org.apache.commons.csv.CSVPrinter printer;
  java.util.List oCvsHeaders=null;
  java.util.List oCvsRecord=null;
  org.apache.commons.csv.CSVParser records=null;
  java.util.Map irHeader=null;
  java.util.Iterator recordIterator=null;
  org.apache.commons.csv.CSVRecord record=null;
  printer=(org.apache.commons.csv.CSVPrinter)null;
  {try{
   printer=new org.apache.commons.csv.CSVPrinter((java.lang.Appendable)oCvs,org.apache.commons.csv.CSVFormat.DEFAULT.withRecordSeparator(NL));
   
   
   records=org.apache.commons.csv.CSVFormat.DEFAULT.withHeader(new java.lang.String[0]).parse(iCvs);
   irHeader=records.getHeaderMap();
   oCvsHeaders=(java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((irHeader.keySet()).toArray((java.lang.Object[])(new java.lang.String[0]))))));
   oCvsHeaders.add((java.lang.Object)COL_NAME_SUM);
   printer.printRecord((java.lang.Iterable)oCvsHeaders);
   recordIterator=records.iterator();
   
   {for(;;){if(!(recordIterator.hasNext()))break;
    record=(org.apache.commons.csv.CSVRecord)(recordIterator.next());
    oCvsRecord=record2list(record,oCvsHeaders);
    printer.printRecord((java.lang.Iterable)oCvsRecord);
    }
   }
  }
  finally{
   if (printer!=null) 
    printer.close();
  }}
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.List record2list(org.apache.commons.csv.CSVRecord record,java.util.List oCvsHeaders){
  java.util.List cvsRecord=null;
  java.util.Map rMap;
  long recNo;
  netrexx.lang.Rexx sum;
  int ci=0;
  java.lang.Object key=null;
  
  rMap=record.toMap();
  recNo=record.getRecordNumber();
  rMap=alterRecord(rMap,recNo);
  sum=summation(record.iterator());
  rMap.put((java.lang.Object)COL_NAME_SUM,(java.lang.Object)sum);
  cvsRecord=(java.util.List)(new java.util.ArrayList());
  {int $4=(oCvsHeaders.size())-1;ci=0;ci:for(;ci<=$4;ci++){
   key=oCvsHeaders.get(ci);
   cvsRecord.add(rMap.get(key));
   }
  }/*ci*/
  return cvsRecord;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static java.util.Map alterRecord(java.util.Map rMap,long recNo){
  int rv=0;
  java.util.Random rg;
  java.lang.Object ks[];
  int ix;
  long yv;
  java.lang.Object ky;
  java.lang.String xv;
  
  rg=new java.util.Random(recNo);
  rv=rg.nextInt(50);
  ks=rMap.keySet().toArray((java.lang.Object[])(new java.lang.String[0]));
  ix=rg.nextInt(ks.length);
  yv=(long)0;
  ky=ks[ix];
  xv=(java.lang.String)(rMap.get(ky));
  if ((xv!=null)&((xv.length())>0)) 
   {
    yv=(java.lang.Long.valueOf(xv).longValue())+rv;
    rMap.put(ks[ix],(java.lang.Object)(java.lang.String.valueOf(yv)));
   }
  return rMap;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx summation(java.util.Iterator iColumn){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx nv=null;
  sum=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!(iColumn.hasNext()))break;
   nv=new netrexx.lang.Rexx((java.lang.String)(iColumn.next()));
   if (((nv==null)||(nv.length()).OpEq(null,$04))||(nv.datatype(new netrexx.lang.Rexx('n'))).OpNot(null)) 
    nv=new netrexx.lang.Rexx((byte)0);
   sum=sum.OpAdd(null,nv);
   }
  }
  return sum;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx textFileContentsToString(netrexx.lang.Rexx filename){
  netrexx.lang.Rexx lineOut;
  java.util.Scanner fs;
  java.lang.String line=null;
  java.io.FileNotFoundException ex=null;
  lineOut=netrexx.lang.Rexx.toRexx("");
  fs=(java.util.Scanner)null;
  {try{
   fs=new java.util.Scanner(new java.io.File(netrexx.lang.Rexx.toString(filename)));
   lineOut=(lineOut.OpCc(null,filename)).OpCc(null,netrexx.lang.Rexx.toRexx(NL));
   {for(;;){if(!(fs.hasNextLine()))break;
    line=fs.nextLine();
    lineOut=(lineOut.OpCc(null,netrexx.lang.Rexx.toRexx(line))).OpCc(null,netrexx.lang.Rexx.toRexx(NL));
    }
   }
  }
  catch (java.io.FileNotFoundException $5){ex=$5;
   ex.printStackTrace();
  }
  finally{
   if (fs!=null) 
    fs.close();
  }}
  return lineOut;
  }
 
 private RCsv(){return;}
 }
