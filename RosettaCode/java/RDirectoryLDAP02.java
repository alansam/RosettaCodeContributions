/*
 * -----------------------------------------------------------------------------
 * IVP.ApacheDS:RDirectoryLDAP02.java:Sep 28, 2012:1:19:34 PM
 *
 * (C) Copyright Alan Sampson <alansamps@gmail.com> 2012, All rights reserved.
 *
 * #(@) RDirectoryLDAP02.java $Header: $
 *
 * -----------------------------------------------------------------------------
 * echoEnv CLASSPATH
 * .
 * /Applications/OpenOffice.org.app/Contents/program
 * /Applications/OpenOffice.org.app/Contents/basis-link/ure-link/share/java/juh.jar
 * /Applications/OpenOffice.org.app/Contents/basis-link/ure-link/share/java/jurt.jar
 * /Applications/OpenOffice.org.app/Contents/basis-link/ure-link/share/java/ridl.jar
 * /Applications/OpenOffice.org.app/Contents/basis-link/program/classes/unoil.jar
 * /System/Library/Frameworks/BSF4ooRexx.framework/Classes/bsf-rexx-engine.jar
 * /System/Library/Frameworks/BSF4ooRexx.framework/Classes/bsf-v400-20090910.jar
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
 *
 * -----------------------------------------------------------------------------
 *
 * Created: Sep 28, 2012
 *
 * -+----1----+----2----+----3----+----4----+----5----+----6----+----7----+----8
 */

//package net.podzone.as;

import java.io.IOException;

import org.apache.directory.ldap.client.api.LdapConnection;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;
import org.apache.directory.shared.ldap.model.cursor.EntryCursor;
import org.apache.directory.shared.ldap.model.entry.Entry;
import org.apache.directory.shared.ldap.model.exception.LdapException;
import org.apache.directory.shared.ldap.model.message.SearchScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author alansampson : <a href="mailto:%22Alan%20Sampson%22%20%3Calansamps@gmail.com%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 0.1
 *
 */
public class RDirectoryLDAP02 {

  public static final String ID = "@(#) RDirectoryLDAP02 $Header: $"; //$NON-NLS-1$

  public static final String MAINT = "@(#) INIT"; //$NON-NLS-1$

  public static final String CLASSNAME = RDirectoryLDAP02.class.getSimpleName();

  static final Logger log_;

  private static final String ldapHostName;

  private static final int ldapPort;

  private static LdapConnection connection;

  static {

    @SuppressWarnings("unused")
    String METHOD = ".<clinit>"; // $NON-NLS-1$

    log_ = LoggerFactory.getLogger(RDirectoryLDAP02.class);
    connection = null;
    ldapHostName = "allendale.local"; //"localhost"
    ldapPort = 10389;
  }

  /**
   * 
   */
  public RDirectoryLDAP02() {

    @SuppressWarnings("unused")
    String METHOD = ".<init>()"; // $NON-NLS-1$

    // TODO Auto-generated constructor stub

    return;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("unused")
    String METHOD = ".main()"; //$NON-NLS-1$

    try {
      if (log_.isInfoEnabled()) { log_.info("LDAP Connection to " + ldapHostName + " on port " + ldapPort); }
      connection = new LdapNetworkConnection(ldapHostName, ldapPort);

      try {
        if (log_.isTraceEnabled()) { log_.trace("LDAP bind"); }
        connection.bind();

        if (log_.isTraceEnabled()) { log_.trace("LDAP unbind"); }
        connection.unBind();
      }
      catch (LdapException lex) {
        log_.error("LDAP Error", lex);
      }
      catch (IOException ex) {
        log_.error("I/O Error", ex);
      }
    }
    finally {
      if (log_.isTraceEnabled()) { log_.trace("LDAP close connection"); }
      try {
        if (connection != null) {
          connection.close();
        }
      }
      catch (IOException ex) {
        log_.error("I/O Error on connection.close()", ex);
      }
    }

    return;
  }
}
