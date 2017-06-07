/* Generated from 'RDirectorySearchLDAP.nrx' 29 Sep 2012 13:34:47 [v3.01] */
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












public class RDirectorySearchLDAP{
 private static final java.lang.String $0="RDirectorySearchLDAP.nrx";
 
 /* properties constant */
 protected static final org.slf4j.Logger log_=LoggerFactory.getLogger(RDirectorySearchLDAP.class);
 
 /* properties private constant */
 private static final java.lang.String ldapHostName="localhost";
 private static final int ldapPort=11389;
 private static final java.lang.String ldapDnStr="uid=admin,ou=system";
 private static final java.lang.String ldapCreds="secret";
 
 private static final boolean isTrue=(1==1);
 private static final boolean isFalse=(1!=1);
 
 /* properties private static */
 private static org.apache.directory.ldap.client.api.LdapConnection connection;

 
 
 public static void main(java.lang.String args[]){
  boolean connected;
  
  connected=isFalse;
  {try{
   connected=setUp();
   if (connected) 
    {
     search("*mil*");
    }
  }
  finally{
   if (connected) 
    {
     tearDown();
    }
  }}
  
  return;
  }

 
 public static boolean search(){
  return search("*");
  }
 public static boolean search(java.lang.String uid){
  boolean state;
  org.apache.directory.shared.ldap.model.cursor.EntryCursor cursor=null;
  java.lang.String baseDn;
  java.lang.String filter;
  org.apache.directory.shared.ldap.model.message.SearchScope scope;
  java.lang.String attributes[];
  int ksearch=0;
  java.lang.Object ev=null;
  org.apache.directory.shared.ldap.model.exception.LdapException lex=null;
  java.lang.Exception ex=null;
  
  state=isTrue;
  
  baseDn="ou=users,o=mojo";
  filter="(&(objectClass=person)(&(uid="+uid+")))";
  scope=SearchScope.SUBTREE;
  attributes=new java.lang.String[]{"dn","cn","sn","uid"};
  {try{
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP search");
   if (log_.isInfoEnabled()) 
    {
     log_.info("Begin search");
     log_.info("  search base distinguished name:"+" "+baseDn);
     log_.info("  search filter:"+" "+filter);
     log_.info("  search attributes:"+" "+(java.util.Arrays.asList((java.lang.Object[])attributes)).toString());
    }
   cursor=connection.search(baseDn,filter,scope,attributes);
   {ksearch=1;ksearch:for(;;ksearch++){if(!(cursor.next()))break;
    ev=cursor.get();
    if (log_.isInfoEnabled()) 
     log_.info("Search cursor entry count:"+" "+ksearch);
    if (log_.isInfoEnabled()) 
     log_.info(ev.toString());
    }
   }/*ksearch*/
  }
  catch (org.apache.directory.shared.ldap.model.exception.LdapException $1){lex=$1;
   state=isFalse;
   log_.error("LDAP Error in cursor loop: Iteration"+" "+ksearch,(java.lang.Throwable)lex);
  }
  catch (java.lang.Exception $2){ex=$2;
   state=isFalse;
   log_.error("I/O Error in cursor loop: Iteration"+" "+ksearch,(java.lang.Throwable)ex);
  }}
  
  return state;
  }

 
 public static boolean setUp(){
  boolean state;
  org.apache.directory.shared.ldap.model.exception.LdapException lex=null;
  java.io.IOException iox=null;
  
  state=isFalse;
  {try{
   if (log_.isInfoEnabled()) 
    log_.info("LDAP Connection to"+" "+ldapHostName+" "+"on port"+" "+ldapPort);
   connection=(org.apache.directory.ldap.client.api.LdapConnection)(new LdapNetworkConnection(ldapHostName,ldapPort));
   
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP bind");
   connection.bind(ldapDnStr,ldapCreds);
   
   state=isTrue;
  }
  catch (org.apache.directory.shared.ldap.model.exception.LdapException $3){lex=$3;
   state=isFalse;
   log_.error("LDAP Error",(java.lang.Throwable)lex);
  }
  catch (java.io.IOException $4){iox=$4;
   state=isFalse;
   log_.error("I/O Error",(java.lang.Throwable)iox);
  }}
  
  return state;
  }

 
 public static boolean tearDown(){
  boolean state;
  org.apache.directory.shared.ldap.model.exception.LdapException lex=null;
  java.io.IOException iox=null;
  
  state=isFalse;
  {try{
   if (log_.isTraceEnabled()) 
    log_.trace("LDAP unbind");
   connection.unBind();
   state=isTrue;
  }
  catch (org.apache.directory.shared.ldap.model.exception.LdapException $5){lex=$5;
   state=isFalse;
   log_.error("LDAP Error",(java.lang.Throwable)lex);
  }
  finally{
   {try{
    connection.close();
   }
   catch (java.io.IOException $6){iox=$6;
    state=isFalse;
    log_.error("I/O Error on connection.close()",(java.lang.Throwable)iox);
   }}
  }}
  
  return state;
  }
 
 private RDirectorySearchLDAP(){return;}
 }
