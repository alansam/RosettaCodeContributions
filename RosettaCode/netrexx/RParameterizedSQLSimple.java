/* Generated from 'RParameterizedSQLSimple.nrx' 14 Nov 2012 09:29:20 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




// =============================================================================

public class RParameterizedSQLSimple{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(50000);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(45000);
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("08006");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="RParameterizedSQLSimple.nrx";
 
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

 
 // =============================================================================
 
 public RParameterizedSQLSimple(){super();
  setConnexion((java.sql.Connection)null);
  return;
  }

 // =============================================================================
 
 protected java.sql.Connection createConnexion() throws java.lang.ClassNotFoundException,java.lang.InstantiationException,java.lang.IllegalAccessException,java.sql.SQLException{
  java.util.Properties props=null;
  netrexx.lang.Rexx xURL=null;
  if ((getConnexion())==null) 
   {
    props=new java.util.Properties();
    props.put((java.lang.Object)"user",(java.lang.Object)"user1");
    props.put((java.lang.Object)"password",(java.lang.Object)"user1");
    
    xURL=(netrexx.lang.Rexx.toRexx(netrexx.lang.Rexx.toString(DBURL)).OpCc(null,DBNAME)).OpCc(null,DBMODE_CREATE);
    loadDriver(netrexx.lang.Rexx.toString(DRIVER));
    setConnexion(java.sql.DriverManager.getConnection(netrexx.lang.Rexx.toString(xURL),props));
   }
  
  return getConnexion();
  }

 // =============================================================================
 
 protected boolean shutdownConnexion() throws java.sql.SQLException{
  boolean dbState=false;
  netrexx.lang.Rexx xURL;
  java.sql.SQLException se=null;
  
  
  xURL=(netrexx.lang.Rexx.toRexx(netrexx.lang.Rexx.toString(DBURL)).OpCc(null,DBNAME)).OpCc(null,DBMODE_SHUTDOWN);
  
  {try{
   java.sql.DriverManager.getConnection(netrexx.lang.Rexx.toString(xURL));
   dbState=isTrue();
  }
  catch (java.sql.SQLException $1){se=$1;
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
      dbState=isFalse();
      throw se;
     }
  }}
  
  return dbState;
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
  catch (java.lang.ClassNotFoundException $2){cnfe=$2;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Unable to load the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   netrexx.lang.RexxIO.Say("Please check your CLASSPATH.");
   throw cnfe;
  }
  catch (java.lang.InstantiationException $3){ie=$3;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Unable to instantiate the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   throw ie;
  }
  catch (java.lang.IllegalAccessException $4){iae=$4;
   netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Not allowed to access the JDBC driver").OpCcblank(null,netrexx.lang.Rexx.toRexx(xdriver)));
   throw iae;
  
  }}
  
  return;
  }

 // =============================================================================
 
 protected int updatePlayer(int jerseyNum,java.lang.String name,int score,boolean active) throws java.sql.SQLException{
  java.lang.String updateSQL;
  int rowCt=0;
  int ix;
  java.sql.PreparedStatement ps;
  
  updateSQL=""+"UPDATE TEAM.PLAYERS"+"  SET NAME = ?, SCORE = ?, ACTIVE = ?"+"  WHERE JERSEYNUM = ?";
  
  
  
  
  
  ix=0;
  
  ps=getConnexion().prepareStatement(updateSQL);
  ix++;
  ps.setString(ix,name);
  ix++;
  ps.setInt(ix,score);
  ix++;
  ps.setBoolean(ix,active);
  ix++;
  ps.setInt(ix,jerseyNum);
  rowCt=ps.executeUpdate();
  
  return rowCt;
  }

 // =============================================================================
 
 public static void main(java.lang.String args[]){
  RParameterizedSQLSimple tda=null;
  int updated=0;
  java.lang.Exception ex=null;
  
  {try{
   tda=new RParameterizedSQLSimple();
   tda.createConnexion();
   
   if ((tda.getConnexion())!=null) 
    {try{
     updated=tda.updatePlayer(99,"Smith, Steve",42,isTrue());
     if (new netrexx.lang.Rexx(updated).OpGt(null,$04)) 
      netrexx.lang.RexxIO.Say("Update successful");
     else 
      netrexx.lang.RexxIO.Say("Update failed");
    }
    finally{
     tda.shutdownConnexion();
    }}
  }
  catch (java.lang.Exception $5){ex=$5;
   ex.printStackTrace();
  }}
  
  return;
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
 
 public void setConnexion(java.sql.Connection $6){connexion=$6;return;}
 }
