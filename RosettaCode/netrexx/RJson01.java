/* Generated from 'RJson01.nrx' 12 Feb 2013 18:15:36 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import org.json.JSONTokener;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import org.json.JSONException;

/* NetRexx */








/**
 * Using library from json.org 
 *
 * @see http://www.json.org/java/index.html
 */

public class RJson01{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("{\n");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("  },\n");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('}');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RJson01.nrx";
 
 /* properties private constant */
 private static final netrexx.lang.Rexx JSON_DWARFS=((((((((((((($01.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"F1937_1\" : {\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"title\"  : \"Snow White and the Seven Dwarfs\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"year\"   : 1937,\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"medium\" : \"film\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"dwarfs\" : [ \"Grumpy\", \"Happy\", \"Sleepy\", \"Bashful\", \"Sneezy\", \"Dopey\", \"Doc\" ]\n"))).OpCcblank(null,$03)).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"F2012_1\" : {\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"title\"  : \"Mirror, Mirror\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"year\"   : 2012,\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"medium\" : \"film\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    \"dwarfs\" : [ \"Grimm\", \"Butcher\", \"Wolf\", \"Napoleon\", \"Half Pint\", \"Grub\", \"Chuckles\" ]\n"))).OpCcblank(null,$03)).OpCcblank(null,$04);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /**
  * A bean that looks like the following JSON
  * <pre>
  * {
  *   "F2012_2" : {
  *     "title"  : "Snow White & the Huntsman",
  *     "year"   : 2012, 
  *     "medium" : "film",
  *     "dwarfs" : [ "Beith", "Quert", "Muir", "Coll", "Duir", "Gus", "Gort", "Nion" ]
  *   }
  * }
  * </pre>
  */
 private static final RJson01.DwarfBean SAMPLE_BEAN=new RJson01.DwarfBean("F2012_2","Snow White & the Huntsman",new java.lang.Long(2012),"film",java.util.Arrays.asList((java.lang.Object[])(new java.lang.String[]{"Beith","Quert","Muir","Coll","Duir","Gus","Gort","Nion"})));

 
 
 
 
 
 
 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.RexxIO.Say(json2bean(JSON_DWARFS));
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say(bean2json(SAMPLE_BEAN));
  netrexx.lang.RexxIO.Say("");
  return;
  }

 
 public static java.util.List json2bean(netrexx.lang.Rexx dwarfs){
  java.util.ArrayList jsonBeans;
  org.json.JSONObject jd=null;
  java.lang.String ns[]=null;
  java.lang.String name=null;
  java.util.ArrayList dwarves=null;
  org.json.JSONObject jn=null;
  java.lang.String title=null;
  java.lang.Long year=null;
  java.lang.String medium=null;
  org.json.JSONArray dwa=null;
  netrexx.lang.Rexx di=null;
  RJson01.DwarfBean jb=null;
  org.json.JSONException ex=null;
  netrexx.lang.RexxIO.Say("Make beans from this JSON string:");
  netrexx.lang.RexxIO.Say(dwarfs);
  jsonBeans=new java.util.ArrayList();
  {try{
   jd=new JSONObject(new JSONTokener(netrexx.lang.Rexx.toString(dwarfs)));
   ns=JSONObject.getNames(jd);
   
   {int $3=0;java.lang.String[] $2=new java.lang.String[ns.length];synchronized(ns){for(;;){if($3==$2.length)break;$2[$3]=ns[ns.length-1-$3];$3++;}}name:for(;;){if(--$3<0)break;name=(java.lang.String)$2[$3];
    dwarves=new java.util.ArrayList();
    jn=jd.getJSONObject(name);
    title=jn.getString("title");
    year=new java.lang.Long(jn.getLong("year"));
    medium=jn.getString("medium");
    dwa=jn.getJSONArray("dwarfs");
    {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(dwa.length()).OpSub(null,$05);di=new netrexx.lang.Rexx((byte)0);di:for(;di.OpLtEq(null,$4);di=di.OpAdd(null,new netrexx.lang.Rexx(1))){
     dwarves.add((java.lang.Object)(dwa.getString(di.toint())));
     }
    }/*di*/
    jb=new RJson01.DwarfBean(name,title,year,medium,(java.util.List)dwarves);
    jsonBeans.add((java.lang.Object)(jb.toString()));
    }
   }/*name*/
  }
  catch (org.json.JSONException $5){ex=$5;
   ex.printStackTrace();
  }}
  return (java.util.List)jsonBeans;
  }

 
 public static java.lang.String bean2json(RJson01.DwarfBean sb){
  java.lang.String jsonString=null;
  org.json.JSONObject jd=null;
  org.json.JSONObject jo=null;
  org.json.JSONException ex=null;
  netrexx.lang.RexxIO.Say("Make JSONObject from this bean:");
  netrexx.lang.RexxIO.Say(sb);
  
  {try{
   jd=new JSONObject((java.lang.Object)sb);
   jo=new JSONObject();
   jo=jo.put(sb.keyGet(),(java.lang.Object)jd);
   jsonString=jo.toString(2);
  }
  catch (org.json.JSONException $6){ex=$6;
   ex.printStackTrace();
  }}
  return jsonString;
  }
 
 private RJson01(){return;}

// =============================================================================
 
 public static class DwarfBean{
  private final transient java.lang.String $0="RJson01.nrx";
  /* properties private */
  private java.lang.String key; // not part of bean
  /* properties indirect */
  private java.lang.String title;
  private java.lang.Long year;
  private java.lang.String medium;
  private java.util.List dwarfs;

 
  
  public DwarfBean(){
   this((java.lang.String)null,(java.lang.String)null,(java.lang.Long)null,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String key_){
   this(key_,(java.lang.String)null,(java.lang.Long)null,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String key_,java.lang.String title_){
   this(key_,title_,(java.lang.Long)null,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String key_,java.lang.String title_,java.lang.Long year_){
   this(key_,title_,year_,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String key_,java.lang.String title_,java.lang.Long year_,java.lang.String medium_){
   this(key_,title_,year_,medium_,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String key_,java.lang.String title_,java.lang.Long year_,java.lang.String medium_,java.util.List dwarfs_){super();
   this.keyPut(key_);
   this.setTitle(title_);
   this.setYear(year_);
   this.setMedium(medium_);
   this.setDwarfs(dwarfs_);
   return;
   }

  
  public void keyPut(java.lang.String key_){
   key=key_;
   return;
   }

  
  public java.lang.String keyGet(){
   return key;
   }

  
  public java.lang.String toString(){
   java.lang.StringBuilder ts;
   ts=new java.lang.StringBuilder();
   ts.append(java.lang.String.format("%s@%08x ",new java.lang.Object[]{(java.lang.Object)(this.getClass().getSimpleName()),(java.lang.Object)(new java.lang.Integer(this.hashCode()))}));
   ts.append('[');
   ts.append("key="+java.lang.String.valueOf((java.lang.Object)(this.keyGet()))+", ");
   ts.append("title="+java.lang.String.valueOf((java.lang.Object)(this.getTitle()))+", ");
   ts.append("year="+java.lang.String.valueOf((java.lang.Object)(this.getYear()))+", ");
   ts.append("medium="+java.lang.String.valueOf((java.lang.Object)(this.getMedium()))+", ");
   ts.append("dwarfs="+java.lang.String.valueOf((java.lang.Object)(this.getDwarfs())));
   ts.append(']');
   return ts.toString();
   }
  
  public java.lang.String getTitle(){return title;}
  
  public void setTitle(java.lang.String $1){title=$1;return;}
  
  public java.lang.Long getYear(){return year;}
  
  public void setYear(java.lang.Long $2){year=$2;return;}
  
  public java.lang.String getMedium(){return medium;}
  
  public void setMedium(java.lang.String $3){medium=$3;return;}
  
  public java.util.List getDwarfs(){return dwarfs;}
  
  public void setDwarfs(java.util.List $4){dwarfs=$4;return;}
 }}
