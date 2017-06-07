/* Generated from 'RCsv02.nrx' 30 Apr 2014 15:10:37 [v3.02] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RCsv02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final char[] $02={2,1,44,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(1000);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(',');
 private static final char[] $06={1,10,3,0,1,2,0};
 private static final java.lang.String $0="RCsv02.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void csvTransform(netrexx.lang.Rexx csvInFile,netrexx.lang.Rexx csvToFile){
  netrexx.lang.Rexx rows;
  netrexx.lang.Rexx r_=null;
  netrexx.lang.Rexx row=null;
  netrexx.lang.Rexx cols=null;
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx col=null;
  java.util.Random rg=null;
  netrexx.lang.Rexx cx=null;
  rows=getRows(csvInFile); // slurp the file into the "rows" indexed string
  {netrexx.lang.Rexx $1=rows.getnode(new netrexx.lang.Rexx((byte)0)).leaf;r_=new netrexx.lang.Rexx((byte)2);r_:for(;r_.OpLtEq(null,$1);r_=r_.OpAdd(null,new netrexx.lang.Rexx(1))){ // loop through the rows, skip row 1; treat it as the col header row
   row=rows.getnode(r_).leaf;
   cols=netrexx.lang.Rexx.toRexx("");
   {c_=new netrexx.lang.Rexx((byte)1);c_:for(;;c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){if(!row.OpNotEq(null,$01))break; // break this row into columns and save in "cols" indexed string 
    {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
    netrexx.lang.RexxParse.parse(row,$02,$2);
    col=$2[0];row=$2[1];}
    cols.getnode(new netrexx.lang.Rexx((byte)0)).leaf=c_;
    cols.getnode(c_).leaf=col;
    }
   }/*c_*/
   // now do something to a random column within this row
   rg=new java.util.Random(27);
   cx=new netrexx.lang.Rexx(rg.nextInt((cols.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpSub(null,$03).toint())).OpAdd(null,$03);
   cols.getnode(cx).leaf=(cols.getnode(cx).leaf).OpMult(null,$04);
   row=netrexx.lang.Rexx.toRexx("");
   // rebuild the columns back into a row and put it back into "rows"
   {netrexx.lang.Rexx $3=cols.getnode(new netrexx.lang.Rexx((byte)0)).leaf;c_=new netrexx.lang.Rexx((byte)1);c_:for(;c_.OpLtEq(null,$3);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
    row=(row.OpCc(null,$05)).OpCc(null,cols.getnode(c_).leaf);
    }
   }/*c_*/
   row=row.strip(new netrexx.lang.Rexx('l'),new netrexx.lang.Rexx(','));
   rows.getnode(r_).leaf=row;
   }
  }/*r_*/
  putRows(csvToFile,rows); // deliver the "rows" to an output file
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static netrexx.lang.Rexx getRows(netrexx.lang.Rexx csvInFile){
  netrexx.lang.Rexx rows;
  java.io.BufferedReader csvIn=null;
  netrexx.lang.Rexx l_=null;
  java.lang.String line=null;
  java.io.IOException ex=null;
  rows=netrexx.lang.Rexx.toRexx("");
  {try{
   csvIn=new java.io.BufferedReader((java.io.Reader)(new java.io.FileReader(new java.io.File(netrexx.lang.Rexx.toString(csvInFile)))));
   {l_=new netrexx.lang.Rexx((byte)1);l_:for(;;l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){ // implied forever loop
    line=csvIn.readLine();
    if (line==null) 
     break l_;
    rows.getnode(new netrexx.lang.Rexx((byte)0)).leaf=l_;
    rows.getnode(l_).leaf=netrexx.lang.Rexx.toRexx(line);
    }
   }/*l_*/
   csvIn.close();
  }
  catch (java.io.IOException $4){ex=$4;
   ex.printStackTrace();
  }}
  return rows;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void putRows(netrexx.lang.Rexx csvToFile,netrexx.lang.Rexx rows){
  java.io.BufferedWriter csvTo=null;
  netrexx.lang.Rexx l_=null;
  java.lang.String line=null;
  java.io.IOException ex=null;
  {try{
   csvTo=new java.io.BufferedWriter((java.io.Writer)(new java.io.FileWriter(new java.io.File(netrexx.lang.Rexx.toString(csvToFile)))));
   {netrexx.lang.Rexx $5=rows.getnode(new netrexx.lang.Rexx((byte)0)).leaf;l_=new netrexx.lang.Rexx((byte)1);l_:for(;l_.OpLtEq(null,$5);l_=l_.OpAdd(null,new netrexx.lang.Rexx(1))){
    line=netrexx.lang.Rexx.toString(rows.getnode(l_).leaf);
    csvTo.write(line);
    csvTo.newLine();
    }
   }/*l_*/
   csvTo.close();
  }
  catch (java.io.IOException $6){ex=$6;
   ex.printStackTrace();
  }}
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx csvInFile=null;
  netrexx.lang.Rexx csvToFile=null;
  {netrexx.lang.Rexx $7[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$06,$7);
  csvInFile=$7[0];csvToFile=$7[1];}
  if (csvInFile.OpEq(null,$01)) 
   csvInFile=netrexx.lang.Rexx.toRexx("./data/rosetta00.csv");
  if (csvToFile.OpEq(null,$01)) 
   csvToFile=netrexx.lang.Rexx.toRexx("./data/rosetta01.csv");
  csvTransform(csvInFile,csvToFile);
  return;
  }
 
 private RCsv02(){return;}
 }
