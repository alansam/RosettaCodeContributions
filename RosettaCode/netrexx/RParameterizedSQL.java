/* Generated from 'RParameterizedSQL.nrx' 13 Nov 2012 21:43:35 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





// =============================================================================

public class RParameterizedSQL{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(50000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(45000);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("08006");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RParameterizedSQL.nrx";
 
 /* properties indirect */
 private java.sql.Connection connexion;
 
 /* properties inheritable constant */
 protected static final java.lang.String CLASSNAME=RParameterizedSQL.class.getSimpleName();
 
 protected static final netrexx.lang.Rexx DRIVER=netrexx.lang.Rexx.toRexx("org.apache.derby.jdbc.EmbeddedDriver");
 protected static final netrexx.lang.Rexx DBURL=netrexx.lang.Rexx.toRexx("jdbc:derby:");
 protected static final netrexx.lang.Rexx DBNAME=netrexx.lang.Rexx.toRexx("/Users/alansampson/projects/eclipse/juno/workspace/DB.DerbySamples/DB/TEAMS01");
 protected static final netrexx.lang.Rexx DBMODE_CREATE=netrexx.lang.Rexx.toRexx(";create=true");
 protected static final netrexx.lang.Rexx DBMODE_NOCREATE=netrexx.lang.Rexx.toRexx(";create=false");
 protected static final netrexx.lang.Rexx DBMODE_SHUTDOWN=netrexx.lang.Rexx.toRexx(";shutdown=true");
 protected static final netrexx.lang.Rexx K_NL=new netrexx.lang.Rexx('\n');
 protected static final netrexx.lang.Rexx K_HT=new netrexx.lang.Rexx('\t');
 protected static final netrexx.lang.Rexx K_EMPTY=netrexx.lang.Rexx.toRexx("");
 protected static final netrexx.lang.Rexx K_SPACE=new netrexx.lang.Rexx(' ');
 protected static final netrexx.lang.Rexx K_COLON=new netrexx.lang.Rexx(':');
 protected static final netrexx.lang.Rexx K_SEMICOLON=new netrexx.lang.Rexx(';');
 protected static final netrexx.lang.Rexx K_COMMA=new netrexx.lang.Rexx(',');
 protected static final netrexx.lang.Rexx K_DOT=new netrexx.lang.Rexx('.');
 protected static final netrexx.lang.Rexx K_DASH=new netrexx.lang.Rexx('-');
 protected static final netrexx.lang.Rexx K_VBAR=new netrexx.lang.Rexx('|');
 protected static final netrexx.lang.Rexx K_SLASH=new netrexx.lang.Rexx('/');
 protected static final netrexx.lang.Rexx K_BACKSLASH=new netrexx.lang.Rexx('\\');
 protected static final netrexx.lang.Rexx K_UNDERSCORE=new netrexx.lang.Rexx('_');
 protected static final netrexx.lang.Rexx K_CARET=new netrexx.lang.Rexx('^');
 protected static final netrexx.lang.Rexx K_TILDE=new netrexx.lang.Rexx('~');
 protected static final netrexx.lang.Rexx K_QUESTION=new netrexx.lang.Rexx('?');
 protected static final netrexx.lang.Rexx K_EXCLAMATION=new netrexx.lang.Rexx('!');
 protected static final netrexx.lang.Rexx K_PERCENT=new netrexx.lang.Rexx('%');
 protected static final netrexx.lang.Rexx K_ASTERISK=new netrexx.lang.Rexx('*');
 protected static final netrexx.lang.Rexx K_AMPERSAND=new netrexx.lang.Rexx('&');
 protected static final netrexx.lang.Rexx K_AT=new netrexx.lang.Rexx('@');
 protected static final netrexx.lang.Rexx K_HASH=new netrexx.lang.Rexx('#');
 protected static final netrexx.lang.Rexx K_DOLLAR=new netrexx.lang.Rexx('$');
 protected static final netrexx.lang.Rexx K_QUOTE=new netrexx.lang.Rexx('\'');
 protected static final netrexx.lang.Rexx K_DQUOTE=new netrexx.lang.Rexx('\"');
 protected static final netrexx.lang.Rexx K_GRAVE=new netrexx.lang.Rexx('`');
 protected static final netrexx.lang.Rexx K_LT=new netrexx.lang.Rexx('<');
 protected static final netrexx.lang.Rexx K_GT=new netrexx.lang.Rexx('>');
 protected static final netrexx.lang.Rexx K_EQ=new netrexx.lang.Rexx('=');
 protected static final netrexx.lang.Rexx K_PLUS=new netrexx.lang.Rexx('+');
 protected static final netrexx.lang.Rexx K_LBRACKET=new netrexx.lang.Rexx('[');
 protected static final netrexx.lang.Rexx K_RBRACKET=new netrexx.lang.Rexx(']');
 protected static final netrexx.lang.Rexx K_LBRACE=new netrexx.lang.Rexx('{');
 protected static final netrexx.lang.Rexx K_RBRACE=new netrexx.lang.Rexx('}');
 protected static final netrexx.lang.Rexx K_LPAREN=new netrexx.lang.Rexx('(');
 protected static final netrexx.lang.Rexx K_RPAREN=new netrexx.lang.Rexx(')');
 protected static final netrexx.lang.Rexx K_NUL_LC=netrexx.lang.Rexx.toRexx("null");
 protected static final netrexx.lang.Rexx K_NUL_UC=netrexx.lang.Rexx.toRexx("NULL");

 
 
 // =============================================================================
 
 public RParameterizedSQL(){super();
  setConnexion((java.sql.Connection)null);
  return;
  }

 // =============================================================================
 
 protected java.sql.Connection createConnexion(){
  java.util.Properties props=null;
  netrexx.lang.Rexx xURL=null;
  java.sql.SQLException ex=null;
  java.lang.ClassNotFoundException cnfe=null;
  java.lang.InstantiationException ie=null;
  java.lang.IllegalAccessException iae=null;
  if ((getConnexion())==null) 
   {
    props=new java.util.Properties();
    props.put((java.lang.Object)"user",(java.lang.Object)"user1");
    props.put((java.lang.Object)"password",(java.lang.Object)"user1");
    
    xURL=(netrexx.lang.Rexx.toRexx(netrexx.lang.Rexx.toString(DBURL)).OpCc(null,DBNAME)).OpCc(null,DBMODE_CREATE);
    {try{
     loadDriver(netrexx.lang.Rexx.toString(DRIVER));
     setConnexion(java.sql.DriverManager.getConnection(netrexx.lang.Rexx.toString(xURL),props));
    }
    catch (java.sql.SQLException $1){ex=$1;
     printSQLException(ex);
    }
    catch (java.lang.ClassNotFoundException $2){cnfe=$2;
     cnfe.printStackTrace();
     setConnexion((java.sql.Connection)null);
    }
    catch (java.lang.InstantiationException $3){ie=$3;
     ie.printStackTrace();
     setConnexion((java.sql.Connection)null);
    }
    catch (java.lang.IllegalAccessException $4){iae=$4;
     iae.printStackTrace();
     setConnexion((java.sql.Connection)null);
    }}
   }
  
  return getConnexion();
  }

 // =============================================================================
 
 protected boolean shutdownConnexion(){
  boolean dbState=false;
  netrexx.lang.Rexx xURL;
  java.sql.SQLException se=null;
  
  
  xURL=(netrexx.lang.Rexx.toRexx(netrexx.lang.Rexx.toString(DBURL)).OpCc(null,DBNAME)).OpCc(null,DBMODE_SHUTDOWN);
  
  {try{
   java.sql.DriverManager.getConnection(netrexx.lang.Rexx.toString(xURL));
   dbState=isTrue();
  }
  catch (java.sql.SQLException $5){se=$5;
   if (((new netrexx.lang.Rexx(se.getErrorCode()).OpEq(null,$01)))&((netrexx.lang.Rexx.toRexx("XJ015").equals((java.lang.Object)(se.getSQLState()))))) 
    {
     netrexx.lang.RexxIO.Say("Derby shut down normally");
     dbState=isTrue();
    }
   else 
    if (((new netrexx.lang.Rexx(se.getErrorCode()).OpEq(null,$02)))&(($03.equals((java.lang.Object)(se.getSQLState()))))) 
     {
      netrexx.lang.RexxIO.Say("Derby database shut down normally");
      dbState=isTrue();
     }
    else 
     {
      netrexx.lang.RexxIO.Say("Derby did not shut down normally");
      printSQLException(se);
      dbState=isFalse();
     }
  }}
  
  return dbState;
  }

 // =============================================================================
 
 protected java.util.List selectPlayers(){
  netrexx.lang.Rexx selectSQL;
  java.util.List sresults=null;
  java.sql.PreparedStatement ps=null;
  java.sql.ResultSet rs=null;
  RParameterizedSQL.PlayersModel player=null;
  java.sql.SQLException se=null;
  
  selectSQL=($04.OpCc(null,netrexx.lang.Rexx.toRexx("SELECT * from TEAM.PLAYERS"))).OpCc(null,netrexx.lang.Rexx.toRexx("  order by JERSEYNUM"));
  
  
  
  
  
  
  
  {try{
   ps=getConnexion().prepareStatement(netrexx.lang.Rexx.toString(selectSQL));
   rs=ps.executeQuery();
   
   sresults=(java.util.List)(new java.util.ArrayList());
   
   {for(;;){if(!(rs.next()))break;
    player=new RParameterizedSQL.PlayersModel();
    player.setFieldsFromResultSet(rs);
    sresults.add((java.lang.Object)player);
    }
   }
  }
  catch (java.sql.SQLException $6){se=$6;
   sresults=(java.util.List)null;
   printSQLException(se);
  
  }}
  
  return sresults;
  }

 // =============================================================================
 
 protected int insertPlayer(RParameterizedSQL.PlayersModel player){
  netrexx.lang.Rexx insertSQL;
  int rowCt=0;
  int ix=0;
  java.sql.PreparedStatement ps=null;
  java.sql.SQLException ex=null;
  
  insertSQL=(($04.OpCc(null,netrexx.lang.Rexx.toRexx("INSERT INTO TEAM.PLAYERS"))).OpCc(null,netrexx.lang.Rexx.toRexx("  (JERSEYNUM, NAME, POSITION, NATIONALITY, BIRTHPLACE, BIRTHDATE, STATUS, SCORE, ACTIVE)"))).OpCc(null,netrexx.lang.Rexx.toRexx("  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"));
  
  
  
  
  
  
  {try{
   ix=new netrexx.lang.Rexx(0).toint();
   ps=getConnexion().prepareStatement(netrexx.lang.Rexx.toString(insertSQL));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setInt(ix,player.getJerseyNum().intValue());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,player.getName());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,player.getPosition());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,player.getNationality());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,player.getBirthplace());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setDate(ix,player.getBirthdate());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,player.getStatus());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setInt(ix,player.getScore().intValue());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setBoolean(ix,player.getActive().booleanValue());
   rowCt=ps.executeUpdate();
  }
  catch (java.sql.SQLException $7){ex=$7;
   rowCt=$05.OpMinus(null).toint();
   printSQLException(ex);
  }}
  
  return rowCt;
  }

 // =============================================================================
 
 protected int deletePlayer(java.lang.Integer jerseyNum){
  netrexx.lang.Rexx deleteSQL;
  int rowCt=0;
  netrexx.lang.Rexx ix;
  java.sql.PreparedStatement ps=null;
  java.sql.SQLException ex=null;
  
  deleteSQL=($04.OpCc(null,netrexx.lang.Rexx.toRexx("DELETE FROM TEAM.PLAYERS"))).OpCc(null,netrexx.lang.Rexx.toRexx("  WHERE JERSEYNUM = ?"));
  
  
  
  
  ix=new netrexx.lang.Rexx((byte)0);
  
  {try{
   ps=getConnexion().prepareStatement(netrexx.lang.Rexx.toString(deleteSQL));
   ix=ix.OpAdd(null,$05);
   ps.setInt(ix.toint(),jerseyNum.intValue());
   rowCt=ps.executeUpdate();
  }
  catch (java.sql.SQLException $8){ex=$8;
   rowCt=$05.OpMinus(null).toint();
   printSQLException(ex);
  }}
  
  return rowCt;
  }

 // =============================================================================
 
 protected int updatePlayer(java.lang.Integer jerseyNum,java.lang.String name,java.lang.Integer score,java.lang.Boolean active){
  netrexx.lang.Rexx updateSQL;
  int rowCt=0;
  int ix;
  java.sql.PreparedStatement ps=null;
  java.sql.SQLException ex=null;
  
  updateSQL=(($04.OpCc(null,netrexx.lang.Rexx.toRexx("UPDATE TEAM.PLAYERS"))).OpCc(null,netrexx.lang.Rexx.toRexx("  SET NAME = ?, SCORE = ?, ACTIVE = ?"))).OpCc(null,netrexx.lang.Rexx.toRexx("  WHERE JERSEYNUM = ?"));
  
  
  
  
  
  ix=new netrexx.lang.Rexx(0).toint();
  
  {try{
   ps=getConnexion().prepareStatement(netrexx.lang.Rexx.toString(updateSQL));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setString(ix,name);
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setInt(ix,score.intValue());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setBoolean(ix,active.booleanValue());
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   ps.setInt(ix,jerseyNum.intValue());
   rowCt=ps.executeUpdate();
  }
  catch (java.sql.SQLException $9){ex=$9;
   rowCt=$05.OpMinus(null).toint();
   printSQLException(ex);
  }}
  
  return rowCt;
  }

 // =============================================================================
 
 protected static void loadDriver(java.lang.String xdriver) throws java.lang.ClassNotFoundException,java.lang.InstantiationException,java.lang.IllegalAccessException{
  java.lang.ClassNotFoundException cnfe=null;
  java.lang.InstantiationException ie=null;
  java.lang.IllegalAccessException iae=null;
  
  {try{
   java.lang.Class.forName(xdriver).newInstance();
   netrexx.lang.RexxIO.Say("Loaded the appropriate driver");
  }
  catch (java.lang.ClassNotFoundException $10){cnfe=$10;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Unable to load the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   netrexx.lang.RexxIO.Say("Please check your CLASSPATH.");
   throw cnfe;
  }
  catch (java.lang.InstantiationException $11){ie=$11;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Unable to instantiate the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   throw ie;
  }
  catch (java.lang.IllegalAccessException $12){iae=$12;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Not allowed to access the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   throw iae;
  
  }}
  
  return;
  }

 // =============================================================================
 
 public static void printSQLException(java.sql.SQLException sex){
  {for(;;){if(!(sex!=null))break;
   java.lang.System.err.println("\n----- SQLException -----");
   java.lang.System.err.println((java.lang.Object)(netrexx.lang.Rexx.toRexx("  SQL State: ").OpCcblank(null,netrexx.lang.Rexx.toRexx(sex.getSQLState()))));
   java.lang.System.err.println((java.lang.Object)(netrexx.lang.Rexx.toRexx("  Error Code:").OpCcblank(null,new netrexx.lang.Rexx(sex.getErrorCode()))));
   java.lang.System.err.println((java.lang.Object)(netrexx.lang.Rexx.toRexx("  Message:   ").OpCcblank(null,netrexx.lang.Rexx.toRexx(sex.getMessage()))));
   // for stack traces uncomment this:
   // e.printStackTrace(System.err)
   sex=sex.getNextException();
   }
  }
  return;
  }

 // =============================================================================
 
 public static void driver(java.lang.String args[]) throws java.text.ParseException{
  RParameterizedSQL tda;
  java.util.List players=null;
  netrexx.lang.Rexx ix=null;
  java.lang.Object player=null;
  java.sql.Date bday=null;
  RParameterizedSQL.PlayersModel updtPlayer=null;
  
  // arg = Rexx(args)
  tda=new RParameterizedSQL();
  tda.createConnexion();
  
  if ((tda.getConnexion())!=null) 
   {
    {try{
     players=tda.selectPlayers();
     {netrexx.lang.Rexx $13=new netrexx.lang.Rexx(players.size()).OpSub(null,$05);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$13);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
      player=players.get(ix.toint());
      netrexx.lang.RexxIO.Say(player.toString());
      }
     }/*ix*/
     netrexx.lang.RexxIO.Say("");
     
     tda.deletePlayer(new java.lang.Integer(99));
     players=tda.selectPlayers();
     {netrexx.lang.Rexx $14=new netrexx.lang.Rexx(players.size()).OpSub(null,$05);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$14);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
      player=players.get(ix.toint());
      netrexx.lang.RexxIO.Say(player.toString());
      }
     }/*ix*/
     netrexx.lang.RexxIO.Say("");
     
     bday=new java.sql.Date((new java.text.SimpleDateFormat("yyyy-mm-dd")).parse("2000-01-01").getTime());
     updtPlayer=new RParameterizedSQL.PlayersModel((java.lang.Integer)null,new java.lang.Integer(99),"Rotten, Johnny","FWD","English","London",bday,"Inactive",new java.lang.Integer(0),new java.lang.Boolean(isFalse()));
     
     
     
     
     
     
     
     
     
     
     tda.insertPlayer(updtPlayer);
     players=tda.selectPlayers();
     {netrexx.lang.Rexx $15=new netrexx.lang.Rexx(players.size()).OpSub(null,$05);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$15);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
      player=players.get(ix.toint());
      netrexx.lang.RexxIO.Say(player.toString());
      }
     }/*ix*/
     netrexx.lang.RexxIO.Say("");
     
     tda.updatePlayer(new java.lang.Integer(99),"Smith, Steve",new java.lang.Integer(42),new java.lang.Boolean(isTrue()));
     players=tda.selectPlayers();
     {netrexx.lang.Rexx $16=new netrexx.lang.Rexx(players.size()).OpSub(null,$05);ix=new netrexx.lang.Rexx((byte)0);ix:for(;ix.OpLtEq(null,$16);ix=ix.OpAdd(null,new netrexx.lang.Rexx(1))){
      player=players.get(ix.toint());
      netrexx.lang.RexxIO.Say(player.toString());
      }
     }/*ix*/
    }
    finally{
     tda.shutdownConnexion();
    }}
   }
  
  return;
  }

 // =============================================================================
 
 public static void main(java.lang.String args[]) throws java.text.ParseException{
  
  // arg = Rexx(args)
  driver(args);
  
  return;
  }

 // =============================================================================
 
 public static java.lang.String toCSV(java.lang.String elmts[]){
  return toCSV(K_COMMA,K_DQUOTE,K_NUL_LC,elmts);
  }

 // =============================================================================
 
 public static java.lang.String toCSV(netrexx.lang.Rexx dlm,netrexx.lang.Rexx qwot,java.lang.String elmts[]){
  return toCSV(dlm,qwot,K_NUL_LC,elmts);
  }

 // =============================================================================
 
 public static java.lang.String toCSV(netrexx.lang.Rexx dlm,netrexx.lang.Rexx qwot,netrexx.lang.Rexx nulls,java.lang.String elmts[]){
  java.lang.StringBuilder sb;
  java.lang.String elmt=null;
  if (dlm==null) 
   throw new java.lang.IllegalArgumentException("delimiter constant cannot be null");
  if ((dlm.length()).OpEq(null,$06)) 
   throw new java.lang.IllegalArgumentException("delimiter constant cannot be empty");
  if (qwot==null) 
   throw new java.lang.IllegalArgumentException("quote constant cannot be null");
  if (nulls==null) 
   throw new java.lang.IllegalArgumentException("nulls constant cannot be null");
  if (elmts==null) 
   throw new java.lang.IllegalArgumentException("elments array cannot be null");
  
  sb=new java.lang.StringBuilder("");
  {int $19=0;java.lang.String[] $18=new java.lang.String[elmts.length];synchronized(elmts){for(;;){if($19==$18.length)break;$18[$19]=elmts[elmts.length-1-$19];$19++;}}elmt:for(;;){if(--$19<0)break;elmt=(java.lang.String)$18[$19];
   sb.append(netrexx.lang.Rexx.toString(dlm));
   sb.append(netrexx.lang.Rexx.toString(qwot));
   sb.append(elmt.trim());
   sb.append(netrexx.lang.Rexx.toString(qwot));
   }
  }/*elmt*/
  sb.deleteCharAt(new netrexx.lang.Rexx(0).toint());
  
  return sb.toString();
  }

 // =============================================================================
 
 public static boolean isTrue(){
  return 1==1;
  }

 // =============================================================================
 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 public java.sql.Connection getConnexion(){return connexion;}
 
 public void setConnexion(java.sql.Connection $20){connexion=$20;return;}

// =============================================================================
// =============================================================================
 
 static class PlayersModel{
  private final transient java.lang.String $0="RParameterizedSQL.nrx"; //dependent
 
  /* properties constant */
  protected static final java.lang.String CLASSNAME=RParameterizedSQL.PlayersModel.class.getSimpleName();
 
  /* properties indirect */
  private java.lang.Integer player_id;
  private java.lang.Integer jerseyNum;
  private java.lang.String name;
  private java.lang.String position;
  private java.lang.String nationality;
  private java.lang.String birthplace;
  private java.sql.Date birthdate;
  private java.lang.String status;
  private java.lang.Integer score;
  private java.lang.Boolean active;

 
 // =============================================================================
  
  public PlayersModel(java.lang.Integer player_id_,java.lang.Integer jerseyNum_,java.lang.String name_,java.lang.String position_,java.lang.String nationality_,java.lang.String birthplace_,java.sql.Date birthdate_,java.lang.String status_,java.lang.Integer score_,java.lang.Boolean active_){super();
  
  
  
  
   this.setPlayer_id(player_id_);
   this.setJerseyNum(jerseyNum_);
   this.setName(name_);
   this.setPosition(position_);
   this.setNationality(nationality_);
   this.setBirthplace(birthplace_);
   this.setBirthdate(birthdate_);
   this.setStatus(status_);
   this.setScore(score_);
   this.setActive(active_);
  
   return;
   }

 // =============================================================================
  
  public PlayersModel(){
   this((java.lang.Integer)null,(java.lang.Integer)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.lang.String)null,(java.sql.Date)null,(java.lang.String)null,(java.lang.Integer)null,(java.lang.Boolean)null);
   return;
   }

 // =============================================================================
  
  public java.lang.String toString(){
   java.lang.StringBuilder sb;
   java.lang.Object sx[];
   java.lang.String classId;
  
   sb=new java.lang.StringBuilder();
   sx=new java.lang.Object[]{(java.lang.Object)CLASSNAME,(java.lang.Object)(new java.lang.Integer(this.hashCode()))};
   classId=java.lang.String.format("%s@%08x",sx);
  
   sb.append(classId);
   sb.append(netrexx.lang.Rexx.toString(RParameterizedSQL.K_COLON));
   sb.append(netrexx.lang.Rexx.toString(RParameterizedSQL.K_SPACE));
   sb.append(this.toCSV(RParameterizedSQL.K_COMMA,RParameterizedSQL.K_DQUOTE,RParameterizedSQL.K_EMPTY));
  
   return sb.toString();
   }

 // =============================================================================
  
  public void setFieldsFromResultSet(java.sql.ResultSet rs) throws java.sql.SQLException{
   int ix;
  
   ix=new netrexx.lang.Rexx(0).toint();
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setPlayer_id(new java.lang.Integer(rs.getInt(ix)));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setJerseyNum(new java.lang.Integer(rs.getInt(ix)));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setName(rs.getString(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setPosition(rs.getString(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setNationality(rs.getString(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setBirthplace(rs.getString(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setBirthdate(rs.getDate(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setStatus(rs.getString(ix));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setScore(new java.lang.Integer(rs.getInt(ix)));
   ix=new netrexx.lang.Rexx(ix).OpAdd(null,$05).toint();
   this.setActive(new java.lang.Boolean(rs.getBoolean(ix)));
  
   return;
   }

 // =============================================================================
  
  public java.lang.String toCSV(netrexx.lang.Rexx sep,netrexx.lang.Rexx qwot,netrexx.lang.Rexx nulls){
   java.lang.String elmts[];
   java.lang.String csv;
  
   elmts=new java.lang.String[]{this.getPlayer_id().toString(),this.getJerseyNum().toString(),this.getName(),this.getPosition(),this.getNationality(),this.getBirthplace(),this.getBirthdate().toString(),this.getStatus(),this.getScore().toString(),this.getActive().toString()};
  
  
  
  
  
  
  
  
  
  
  
   csv=RParameterizedSQL.toCSV(sep,qwot,nulls,elmts);
  
   return csv;
   }

 // =============================================================================
  
  public java.lang.String toCSV(netrexx.lang.Rexx sep,netrexx.lang.Rexx qwot){
   return this.toCSV(sep,qwot,RParameterizedSQL.K_NUL_LC);
   }

 // =============================================================================
  
  public java.lang.String toCSV(){
   return this.toCSV(RParameterizedSQL.K_COMMA,RParameterizedSQL.K_DQUOTE,RParameterizedSQL.K_NUL_LC);
   }
  
  public java.lang.Integer getPlayer_id(){return player_id;}
  
  public void setPlayer_id(java.lang.Integer $1){player_id=$1;return;}
  
  public java.lang.Integer getJerseyNum(){return jerseyNum;}
  
  public void setJerseyNum(java.lang.Integer $2){jerseyNum=$2;return;}
  
  public java.lang.String getName(){return name;}
  
  public void setName(java.lang.String $3){name=$3;return;}
  
  public java.lang.String getPosition(){return position;}
  
  public void setPosition(java.lang.String $4){position=$4;return;}
  
  public java.lang.String getNationality(){return nationality;}
  
  public void setNationality(java.lang.String $5){nationality=$5;return;}
  
  public java.lang.String getBirthplace(){return birthplace;}
  
  public void setBirthplace(java.lang.String $6){birthplace=$6;return;}
  
  public java.sql.Date getBirthdate(){return birthdate;}
  
  public void setBirthdate(java.sql.Date $7){birthdate=$7;return;}
  
  public java.lang.String getStatus(){return status;}
  
  public void setStatus(java.lang.String $8){status=$8;return;}
  
  public java.lang.Integer getScore(){return score;}
  
  public void setScore(java.lang.Integer $9){score=$9;return;}
  
  public java.lang.Boolean getActive(){return active;}
  
  public void setActive(java.lang.Boolean $10){active=$10;return;}
 }}
