/* Generated from 'RCsv01.nrx' 30 Apr 2014 13:59:18 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */

// classpath /Users/alansampson/apache/commons/commons-csv/trunk/target/commons-csv-1.0-SNAPSHOT.jar:.




public class RCsv01{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RCsv01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
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
   printer=new org.apache.commons.csv.CSVPrinter((java.lang.Appendable)oCvs,org.apache.commons.csv.CSVFormat.DEFAULT.withRecordSeparator(NL()));
   
   
   records=org.apache.commons.csv.CSVFormat.DEFAULT.withHeader(new java.lang.String[0]).parse(iCvs);
   irHeader=records.getHeaderMap();
   oCvsHeaders=(java.util.List)(new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((irHeader.keySet()).toArray((java.lang.Object[])(new java.lang.String[0]))))));
   oCvsHeaders.add((java.lang.Object)(COL_NAME_SUM()));
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
  netrexx.lang.Rexx sum;
  int ci=0;
  java.lang.Object key=null;
  
  rMap=record.toMap();
  sum=summation(record.iterator());
  rMap.put((java.lang.Object)(COL_NAME_SUM()),(java.lang.Object)sum);
  cvsRecord=(java.util.List)(new java.util.ArrayList());
  {int $1=(oCvsHeaders.size())-1;ci=0;ci:for(;ci<=$1;ci++){
   key=oCvsHeaders.get(ci);
   cvsRecord.add(rMap.get(key));
   }
  }/*ci*/
  return cvsRecord;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx summation(java.util.Iterator iColumn){
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx nv=null;
  sum=new netrexx.lang.Rexx((byte)0);
  {for(;;){if(!(iColumn.hasNext()))break;
   nv=new netrexx.lang.Rexx((java.lang.String)(iColumn.next()));
   if (((nv==null)||(nv.length()).OpEq(null,$01))||(nv.datatype(new netrexx.lang.Rexx('n'))).OpNot(null)) 
    nv=new netrexx.lang.Rexx((byte)0);
   sum=sum.OpAdd(null,nv);
   }
  }
  return sum;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  java.io.Reader iCvs;
  java.io.Writer oCvs;
  java.io.IOException ex=null;
  iCvs=(java.io.Reader)null;
  oCvs=(java.io.Writer)null;
  {try{
   iCvs=(java.io.Reader)(new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader("data/csvtest_in.csv"))));
   oCvs=(java.io.Writer)(new java.io.BufferedWriter((java.io.Writer)(new java.io.FileWriter("data/csvtest_sumRexx.csv"))));
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
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static final java.lang.String NL(){
  return java.lang.System.getProperty("line.separator");
  }
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static final java.lang.String COL_NAME_SUM(){
  return "SUM, \"integers\"";
  }
 
 private RCsv01(){return;}
 }
