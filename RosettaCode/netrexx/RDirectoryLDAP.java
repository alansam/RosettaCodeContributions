/* Generated from 'RDirectoryLDAP.nrx' 29 Sep 2012 13:34:47 [v3.01] */
/* Options: Binary Comments Compact Crossref Decimal Format Java Replace Symbols Trace2 UTF8 Verbose3 */
import org.apache.directory.shared.ldap.model.exception.LdapException;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.slf4j.LoggerFactory;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;
import org.slf4j.Logger;

/* NetRexx */









public class RDirectoryLDAP{
 private static final java.lang.String $0="RDirectoryLDAP.nrx";
 
 /* properties constant */
 protected static final org.slf4j.Logger log_=LoggerFactory.getLogger(RDirectoryLDAP.class);
 
 /* properties private static */
 private static org.apache.directory.ldap.client.api.LdapConnection connection=(org.apache.directory.ldap.client.api.LdapConnection)null;

 
 
 public static void main(java.lang.String args[]){
  java.lang.String ldapHostName;
  int ldapPort;
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
   
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP unbind");
   connection.unBind();
  }
  catch (org.apache.directory.shared.ldap.model.exception.LdapException $1){lex=$1;
   log_.error("LDAP Error",(java.lang.Throwable)lex);
  }
  catch (java.io.IOException $2){iox=$2;
   log_.error("I/O Error",(java.lang.Throwable)iox);
  }
  finally{
   {try{
    if (connection!=null) 
     connection.close();
   }
   catch (java.io.IOException $3){iox=$3;
    log_.error("I/O Error on connection.close()",(java.lang.Throwable)iox);
   }}
  }}
  
  return;
  }
 
 private RDirectoryLDAP(){return;}
 }
