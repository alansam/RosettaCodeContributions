/* Generated from 'RDirectoryLDAP01.nrx' 29 Sep 2012 13:34:47 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */
import org.apache.directory.shared.ldap.model.exception.LdapException;
import org.apache.directory.shared.ldap.model.entry.Entry;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.slf4j.LoggerFactory;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;
import org.apache.directory.shared.ldap.model.message.SearchScope;
import org.apache.directory.shared.ldap.model.cursor.EntryCursor;
import org.slf4j.Logger;

/* NetRexx */


/*
 * CLASSPATH additions
 *
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/commons-collections-3.2.1.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/commons-io-2.3.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/commons-lang-2.6.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/commons-pool-1.6.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/dom4j-1.6.1.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/antlr-2.7.7.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/log4j-1.2.16.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/mina-core-2.0.4.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/shared-all-1.0.0-M12.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/slf4j-api-1.6.4.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/slf4j-log4j12-1.6.4.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/xml-apis-2.0.2.jar
 * /Users/alansampson/apache/directory/apache-ldap-api-1.0.0-M12-bin/lib/xpp3-1.1.4c.jar
 */











public class RDirectoryLDAP01{
 private static final java.lang.String $0="RDirectoryLDAP01.nrx";
 
 /* properties constant */
 protected static final org.slf4j.Logger log_=LoggerFactory.getLogger(RDirectoryLDAP01.class);
 
 /* properties private static */
 private static org.apache.directory.ldap.client.api.LdapConnection connection;

 
 
 public static void main(java.lang.String args[]){
  java.lang.String ldapHostName;
  int ldapPort;
  org.apache.directory.shared.ldap.model.cursor.EntryCursor cursor=null;
  java.lang.String baseDN=null;
  java.lang.String scope=null;
  org.apache.directory.shared.ldap.model.message.SearchScope filter=null;
  java.lang.String attributes[]=null;
  int ksearch=0;
  java.lang.Object ev=null;
  java.lang.Exception ex=null;
  org.apache.directory.shared.ldap.model.exception.LdapException lex=null;
  java.io.IOException iox=null;
  ldapHostName="localhost"; //"allendale.local"
  ldapPort=10389;
  
  if (log_.isInfoEnabled()) 
   log_.info("LDAP Connection to"+" "+ldapHostName+" "+"on port"+" "+ldapPort);
  connection=(org.apache.directory.ldap.client.api.LdapConnection)(new LdapNetworkConnection(ldapHostName,ldapPort));
  
  {try{
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP bind");
   connection.bind();
   
   
   baseDN="ou=system";
   scope="(objectclass=*)";
   filter=SearchScope.ONELEVEL;
   attributes=new java.lang.String[]{"*"};
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP search");
   cursor=connection.search(baseDN,scope,filter,attributes);
   {try{
    {ksearch=1;ksearch:for(;;ksearch++){if(!(cursor.next()))break;
     ev=cursor.get();
     if (log_.isInfoEnabled()) 
      log_.info("Search cursor entry count:"+" "+ksearch);
     if (log_.isInfoEnabled()) 
      log_.info(ev.toString());
     netrexx.lang.RexxIO.Say(ev.toString());
     }
    }/*ksearch*/
   }
   catch (java.lang.Exception $1){ex=$1;
    log_.error("Error in cursor loop: Iteration"+" "+ksearch,(java.lang.Throwable)ex);
   }}
   
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP unbind");
   connection.unBind();
  }
  catch (org.apache.directory.shared.ldap.model.exception.LdapException $2){lex=$2;
   log_.error("LDAP Error",(java.lang.Throwable)lex);
  }
  catch (java.io.IOException $3){iox=$3;
   log_.error("I/O Error",(java.lang.Throwable)iox);
  }
  finally{
   {try{
    connection.close();
   }
   catch (java.io.IOException $4){iox=$4;
    log_.error("I/O Error on connection.close()",(java.lang.Throwable)iox);
   }}
  }}
  
  return;
  }
 
 private RDirectoryLDAP01(){return;}
 }
