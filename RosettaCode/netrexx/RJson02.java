/* Generated from 'RJson02.nrx' 12 Feb 2013 18:01:36 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.List;

/* NetRexx */





/**
 * Using google-gson library
 *
 * @see https://code.google.com/p/google-gson/
 */

public class RJson02{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("{\n");
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('}');
 private static final java.lang.String $0="RJson02.nrx";
 
 /* properties private constant */
 private static final netrexx.lang.Rexx JSON_DWARFS=((((($01.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"title\" : \"Snow White and the Seven Dwarfs\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"year\"  : 1937,\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"medium\": \"film\",\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("  \"dwarfs\": [ \"Grumpy\", \"Happy\", \"Sleepy\", \"Bashful\", \"Sneezy\", \"Dopey\", \"Doc\" ]\n"))).OpCcblank(null,$03);
 
 
 
 
 
 
 
 /**
  * A bean that looks like the following JSON
  * <pre>
  * {
  *   "title"  : "Snow White & the Huntsman",
  *   "year"   : 2012, 
  *   "medium" : "film",
  *   "dwarfs" : [ "Beith", "Quert", "Muir", "Coll", "Duir", "Gus", "Gort", "Nion" ]
  * }
  * </pre>
  */
 private static final RJson02.DwarfBean SAMPLE_BEAN=new RJson02.DwarfBean("Snow White and the Huntsman",new java.lang.Long(2012),"film",java.util.Arrays.asList((java.lang.Object[])(new java.lang.String[]{"Beith","Quert","Muir","Coll","Duir","Gus","Gort","Nion"})));

 /*"F2012_2",*/
 
 
 
 
 
 
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void main(java.lang.String args[]){
  com.google.gson.Gson gsonObj;
  RJson02.DwarfBean jsonBean;
  java.lang.String json;
  gsonObj=(new com.google.gson.GsonBuilder()).setPrettyPrinting().create();
  jsonBean=(RJson02.DwarfBean)(gsonObj.fromJson(netrexx.lang.Rexx.toString(JSON_DWARFS),RJson02.DwarfBean.class));
  netrexx.lang.RexxIO.Say(JSON_DWARFS);
  netrexx.lang.RexxIO.Say(jsonBean.toString());
  netrexx.lang.RexxIO.Say("");
  
  json=gsonObj.toJson((java.lang.Object)SAMPLE_BEAN);
  netrexx.lang.RexxIO.Say(json);
  netrexx.lang.RexxIO.Say(SAMPLE_BEAN.toString());
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 private RJson02(){return;}

// =============================================================================
 
 public static class DwarfBean{
  private final transient java.lang.String $0="RJson02.nrx";
  /* properties indirect */
  private java.lang.String title;
  private java.lang.Long year;
  private java.lang.String medium;
  private java.util.List dwarfs;

 
  
  public DwarfBean(){
   this((java.lang.String)null,(java.lang.Long)null,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String title_){
   this(title_,(java.lang.Long)null,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String title_,java.lang.Long year_){
   this(title_,year_,(java.lang.String)null,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String title_,java.lang.Long year_,java.lang.String medium_){
   this(title_,year_,medium_,(java.util.List)null);return;
   }
  public DwarfBean(java.lang.String title_,java.lang.Long year_,java.lang.String medium_,java.util.List dwarfs_){super();
   this.setTitle(title_);
   this.setYear(year_);
   this.setMedium(medium_);
   this.setDwarfs(dwarfs_);
   return;
   }

  
  public java.lang.String toString(){
   java.lang.StringBuilder ts;
   ts=new java.lang.StringBuilder();
   ts.append(java.lang.String.format("%s@%08x ",new java.lang.Object[]{(java.lang.Object)(this.getClass().getSimpleName()),(java.lang.Object)(new java.lang.Integer(this.hashCode()))}));
   ts.append('[');
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
