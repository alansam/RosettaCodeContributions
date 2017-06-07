/* Generated from 'RTowersOfHanoi01.nrx' 29 Mar 2013 20:24:54 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RTowersOfHanoi01{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("Solved in");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("moves.");
 private static final java.lang.String $0="RTowersOfHanoi01.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 private static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx discs=null;
  netrexx.lang.Rexx moves;
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(arg,$01,$1);
  discs=$1[0];}
  if ((discs.OpEq(null,$02)||(discs.datatype(new netrexx.lang.Rexx('w'))).OpNot(null))||discs.OpLt(null,$03)) 
   discs=new netrexx.lang.Rexx((byte)4);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Minimum moves to solution:").OpCcblank(null,$04.OpPow(null,discs).OpSub(null,$03)));
  moves=move(discs.toint());
  netrexx.lang.RexxIO.Say(($05.OpCcblank(null,moves)).OpCcblank(null,$06));
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static netrexx.lang.Rexx move(){
  return move(4,0);
  }
 public static netrexx.lang.Rexx move(int discs){
  return move(discs,0);
  }
 public static netrexx.lang.Rexx move(int discs,int moves){
  java.lang.String tOH[]=null;
  int k_=0;
  
  tOH=showSteps(discs);
  netrexx.lang.RexxIO.Say("Towers of Hanoi for"+" "+discs+" "+"discs; step by step!");
  {k_=0;k_:for(;;k_++){if(!(k_<tOH.length))break;
   moves++;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Move disc from peg"+" "+java.lang.String.valueOf(tOH[k_].charAt(0))+" "+"to peg"+" "+java.lang.String.valueOf(tOH[k_].charAt(1))+" "+"- Move No:").OpCcblank(null,(new netrexx.lang.Rexx(k_+1)).right(new netrexx.lang.Rexx((byte)5))));
   }
  }/*k_*/
  return new netrexx.lang.Rexx(moves);
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.lang.String[] changeString(java.lang.String array[],char a_,char b_){
  int i_=0;
  int j_=0;
  {i_=0;i_:for(;;i_++){if(!(i_<array.length))break;
   {j_=0;j_:for(;;j_++){if(!(j_<(array[i_].length())))break;
    {/*select*/char $2=array[i_].charAt(j_);
    if ($2==b_)
     array[i_]=array[i_].substring(0,j_)+java.lang.String.valueOf(a_)+array[i_].substring(j_+1);
    else if ($2==a_)
     array[i_]=array[i_].substring(0,j_)+java.lang.String.valueOf(b_)+array[i_].substring(j_+1);
    else{
     ;
    }
    }
    }
   }/*j_*/
   }
  }/*i_*/
  return array;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static java.lang.String[] showSteps(int discs){
  java.lang.String Array[];
  int i_=0;
  int middle=0;
  java.lang.String tempArray[]=null;
  int left=0;
  int o_=0;
  int ax=0;
  //data = [String 'A', 'B', 'C']
  Array=new java.lang.String[(int)((((netrexx.lang.RexxUtil.floatPow((double)2,(int)discs)))-((float)1)))];
  {i_=1;i_:for(;;i_++){if(!(i_<=Array.length))break;
   middle=((i_-1))/2;
   Array[middle]="AC";
   
   tempArray=new java.lang.String[middle];
   {left=0;left:for(;;left++){if(!(left<middle))break;
    tempArray[left]=Array[left];
    }
   }/*left*/
   tempArray=changeString(tempArray,'C','B');
   {o_=0;o_:for(;;o_++){if(!(o_<middle))break;
    Array[o_]=tempArray[o_];
    }
   }/*o_*/
   tempArray=changeString(tempArray,'B','A');
   tempArray=changeString(tempArray,'A','C');
   {o_=middle+1;o_:for(;;o_++){if(!(o_<i_))break;
    ax=(o_-middle)-1;
    Array[o_]=tempArray[ax];
    }
   }/*o_*/
   i_=i_*2;
   }
  }/*i_*/
  return Array;
  }
 
 private RTowersOfHanoi01(){return;}
 }
