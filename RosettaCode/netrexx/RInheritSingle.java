/* Generated from 'RInheritSingle.nrx' 8 Jul 2013 17:17:30 [v3.02] */
/* Options: Binary Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class RInheritSingle{
 private static final char[] $01={1,10,3,0,1,2,0};
 private static final java.lang.String $0="RInheritSingle.nrx";

 
 public static void main(java.lang.String args[]){
  RInheritSingle_Animal animals[];
  RInheritSingle_Animal animal=null;
  netrexx.lang.Rexx oid=null;
  netrexx.lang.Rexx ct=null;
  netrexx.lang.Rexx st=null;
  animals=new RInheritSingle_Animal[]{new RInheritSingle_Animal(),(RInheritSingle_Animal)(new RInheritSingle_Cat()),(RInheritSingle_Animal)(new RInheritSingle_Dog()),(RInheritSingle_Animal)(new RInheritSingle_Lab()),(RInheritSingle_Animal)(new RInheritSingle_Collie())};
  
  
  
  
  
  
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Object ID").left(new netrexx.lang.Rexx((byte)12)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Class type").left(new netrexx.lang.Rexx((byte)24)))).OpCcblank(null,netrexx.lang.Rexx.toRexx("Superclass type")));
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx('.').left(new netrexx.lang.Rexx((byte)12),new netrexx.lang.Rexx('.')).OpCcblank(null,new netrexx.lang.Rexx('.').left(new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx('.')))).OpCcblank(null,new netrexx.lang.Rexx('.').left(new netrexx.lang.Rexx((byte)24),new netrexx.lang.Rexx('.'))));
  {int $3=0;RInheritSingle_Animal[] $2=new RInheritSingle_Animal[animals.length];synchronized(animals){for(;;){if($3==$2.length)break;$2[$3]=animals[animals.length-1-$3];$3++;}}animal:for(;;){if(--$3<0)break;animal=(RInheritSingle_Animal)$2[$3];
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(animal.whatAmI(),$01,$4);
   oid=$4[0];ct=$4[1];st=$4[2];}
   netrexx.lang.RexxIO.Say(((oid.left(new netrexx.lang.Rexx((byte)12))).OpCcblank(null,ct.left(new netrexx.lang.Rexx((byte)24)))).OpCcblank(null,st));
   }
  }/*animal*/
  return;
  }
 
 private RInheritSingle(){return;}
 }


class RInheritSingle_Animal{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('@');
 private static final java.lang.String $0="RInheritSingle.nrx";
 /* properties indirect */
 private java.lang.String whatThatIs;
 private java.lang.String whatThisIs;

 
 public RInheritSingle_Animal(){super();
  // Animal specific set-up
  setWhatThatIs(this.getClass().getSuperclass().getSimpleName());
  setWhatThisIs(this.getClass().getSimpleName());
  return;
  }
 
 public netrexx.lang.Rexx hashToString(){
  return $01.OpCc(null,(new netrexx.lang.Rexx(this.hashCode())).d2x().right(new netrexx.lang.Rexx((byte)8),new netrexx.lang.Rexx((byte)0)));
  }
 
 public netrexx.lang.Rexx whatAmI(){
  netrexx.lang.Rexx iAmText;
  iAmText=((hashToString()).OpCcblank(null,netrexx.lang.Rexx.toRexx(getWhatThisIs()))).OpCcblank(null,netrexx.lang.Rexx.toRexx(getWhatThatIs()));
  return iAmText;
  }
 
 public java.lang.String getWhatThatIs(){return whatThatIs;}
 
 public void setWhatThatIs(java.lang.String $1){whatThatIs=$1;return;}
 
 public java.lang.String getWhatThisIs(){return whatThisIs;}
 
 public void setWhatThisIs(java.lang.String $2){whatThisIs=$2;return;}
 }


class RInheritSingle_Cat extends RInheritSingle_Animal{
 private static final java.lang.String $0="RInheritSingle.nrx";

 
 public RInheritSingle_Cat(){super();
  // Do Cat specific set-up
  return;
  }
 }


class RInheritSingle_Dog extends RInheritSingle_Animal{
 private static final java.lang.String $0="RInheritSingle.nrx";

 
 public RInheritSingle_Dog(){super();
  // Do Dog specific set-up
  return;
  }
 }


class RInheritSingle_Lab extends RInheritSingle_Dog{
 private static final java.lang.String $0="RInheritSingle.nrx";

 
 public RInheritSingle_Lab(){super();
  // Do Lab specific set-up
  return;
  }
 }


class RInheritSingle_Collie extends RInheritSingle_Dog{
 private static final java.lang.String $0="RInheritSingle.nrx";

 
 public RInheritSingle_Collie(){super();
  // Do Collie specific set-up
  return;
  }
 }
