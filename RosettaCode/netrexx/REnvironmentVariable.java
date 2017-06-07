/* Generated from 'REnvironmentVariable.nrx' 9 Mar 2013 19:47:27 [v3.01] */
/* Options: Comments Crossref Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */



public class REnvironmentVariable{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('=');
 private static final char[] $03={1,10,3,0,1,2,0};
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("\" ");
 private static final java.lang.String $0="REnvironmentVariable.nrx";
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx arg=new netrexx.lang.Rexx($0s);
  runSample(arg);
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void sysEnvironment(){
  sysEnvironment(netrexx.lang.Rexx.toRexx(""));return;
  }
 public static void sysEnvironment(netrexx.lang.Rexx vn){
  netrexx.lang.Rexx envName=null;
  java.lang.String envValu=null;
  java.util.Map envVars=null;
  java.lang.String key=null;
  if ((vn.length()).OpGt(null,$01)) 
   {
    envName=vn;
    envValu=java.lang.System.getenv(netrexx.lang.Rexx.toString(envName));
    if (envValu==null) 
     envValu="";
    netrexx.lang.RexxIO.Say((envName.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(envValu)));
   }
  else 
   {
    envVars=java.lang.System.getenv();
    
    {java.util.Set $4=envVars.keySet();int $3=0;java.lang.Object[] $2=new java.lang.Object[$4.size()];synchronized($4){java.util.Iterator $1=$4.iterator();for(;;){if($3==$2.length)break;$2[$3]=$1.next();$3++;}}key:for(;;){if(--$3<0)break;key=(java.lang.String)((java.lang.Object)$2[$3]);
     envName=netrexx.lang.Rexx.toRexx(key);
     envValu=(java.lang.String)(envVars.get((java.lang.Object)key));
     netrexx.lang.RexxIO.Say((envName.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(envValu)));
     }
    }/*key*/
   }
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void sysProperties(){
  sysProperties(netrexx.lang.Rexx.toRexx(""));return;
  }
 public static void sysProperties(netrexx.lang.Rexx vn){
  netrexx.lang.Rexx propName=null;
  java.lang.String propValu=null;
  java.util.Properties sysProps=null;
  java.lang.String key=null;
  if ((vn.length()).OpGt(null,$01)) 
   {
    propName=vn;
    propValu=java.lang.System.getProperty(netrexx.lang.Rexx.toString(propName));
    if (propValu==null) 
     propValu="";
    netrexx.lang.RexxIO.Say((propName.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(propValu)));
   }
  else 
   {
    sysProps=java.lang.System.getProperties();
    
    {java.util.Set $8=sysProps.keySet();int $7=0;java.lang.Object[] $6=new java.lang.Object[$8.size()];synchronized($8){java.util.Iterator $5=$8.iterator();for(;;){if($7==$6.length)break;$6[$7]=$5.next();$7++;}}key:for(;;){if(--$7<0)break;key=(java.lang.String)((java.lang.Object)$6[$7]);
     propName=netrexx.lang.Rexx.toRexx(key);
     propValu=sysProps.getProperty(key);
     netrexx.lang.RexxIO.Say((propName.OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(propValu)));
     }
    }/*key*/
   }
  return;
  }

 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
 public static void runSample(netrexx.lang.Rexx arg){
  netrexx.lang.Rexx ev=null;
  netrexx.lang.Rexx pv=null;
  {netrexx.lang.Rexx $9[]=new netrexx.lang.Rexx[3];
  netrexx.lang.RexxParse.parse(arg,$03,$9);
  ev=$9[0];pv=$9[1];}
  if (ev.OpEq(null,$04)) 
   ev=netrexx.lang.Rexx.toRexx("CLASSPATH");
  if (pv.OpEq(null,$04)) 
   pv=netrexx.lang.Rexx.toRexx("java.class.path");
  netrexx.lang.RexxIO.Say($05.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-')).overlay((netrexx.lang.Rexx.toRexx(" Environment \"").OpCc(null,ev)).OpCc(null,$06),new netrexx.lang.Rexx((byte)5)));
  sysEnvironment(ev);
  netrexx.lang.RexxIO.Say($05.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-')).overlay((netrexx.lang.Rexx.toRexx(" Properties \"").OpCc(null,pv)).OpCc(null,$06),new netrexx.lang.Rexx((byte)5)));
  sysProperties(pv);
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say($05.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-')).overlay(netrexx.lang.Rexx.toRexx(" Environment "),new netrexx.lang.Rexx((byte)5)));
  sysEnvironment();
  netrexx.lang.RexxIO.Say($05.left(new netrexx.lang.Rexx((byte)80),new netrexx.lang.Rexx('-')).overlay(netrexx.lang.Rexx.toRexx(" Properties "),new netrexx.lang.Rexx((byte)5)));
  sysProperties();
  netrexx.lang.RexxIO.Say("");
  return;
  }
 
 private REnvironmentVariable(){return;}
 }
/*
---- Environment "CLASSPATH" ---------------------------------------------------
CLASSPATH = /Users/alansampson/usr/local/NetRexx/runlib/NetRexxR.jar:.
---- Properties "java.class.path" ----------------------------------------------
java.class.path = /Users/alansampson/usr/local/NetRexx/runlib/NetRexxR.jar:.
---- Environment ---------------------------------------------------------------
JAVA_MAIN_CLASS_15260 = REnvironmentVariable
LANG = en_US.UTF-8
COM_GOOGLE_CHROME_FRAMEWORK_SERVICE_PROCESS/USERS/ALANSAMPSON/LIBRARY/APPLICATION_SUPPORT/GOOGLE/CHROME_SOCKET = /tmp/launch-QlfFo7/ServiceProcessSocket
Apple_PubSub_Socket_Render = /tmp/launch-IQqhyA/Render
JYTHON_HOME = /Users/alansampson/usr/local/jython2.5.2
HOME = /Users/developer
HISTCONTROL = ignoredups
USER = developer
ZBASHRC = 1
DISPLAY = /tmp/launch-BJ3kkZ/org.x:0
COMMAND_MODE = unix2003
PATH = /Users/developer/bin:/Users/developer/cmd:/Users/alansampson/bin:/Users/alansampson/cmd:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin:/usr/X11/bin:/usr/local/MacGPG2/bin:/Users/alansampson/usr/local/jython2.5.2:.:/Users/alansampson/usr/local/jython2.5.2:.
CLASSPATH = /Users/alansampson/usr/local/NetRexx/runlib/NetRexxR.jar:.
SECURITYSESSIONID = 186a4
SHELL = /bin/bash
OLDPWD = /Users/alansampson/projects/RosettaCode/java
SSH_AUTH_SOCK = /tmp/launch-tyxWMn/Listeners
_ = /usr/bin/java
GPG_AGENT_INFO = /Users/alansampson/.gnupg/S.gpg-agent:260:1
HISTIGNORE = ls:ll:h:[   ]*:&:bg:fg:exit
LOGNAME = alansampson
Apple_Ubiquity_Message = /tmp/launch-rVbUtz/Apple_Ubiquity_Message
TERM_SESSION_ID = 40576BFF-BB39-4A5A-B1C7-2FF72F7FFE99
PWD = /Users/alansampson/projects/RosettaCode/netrexx
__CF_USER_TEXT_ENCODING = 0x1F6:0:0
TERM_PROGRAM = Apple_Terminal
VIM = /usr/share/vim
SHLVL = 2
JAVA_HOME = /Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home
TERM_PROGRAM_VERSION = 303.2
TERM = xterm-256color
---- Properties ----------------------------------------------------------------
sun.cpu.isalist = 
ftp.nonProxyHosts = local|*.local|169.254/16|*.169.254/16
socksNonProxyHosts = local|*.local|169.254/16|*.169.254/16
sun.cpu.endian = little
sun.io.unicode.encoding = UnicodeBig
java.vendor.url.bug = http://bugreport.sun.com/bugreport/
file.separator = /
java.vendor = Oracle Corporation
sun.boot.class.path = /Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/JObjC.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/classes
java.ext.dirs = /Users/developer/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java
java.version = 1.7.0_15
java.vm.info = mixed mode
awt.toolkit = sun.lwawt.macosx.LWCToolkit
java.specification.vendor = Oracle Corporation
user.language = en
sun.arch.data.model = 64
java.home = /Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre
sun.java.command = REnvironmentVariable
java.vm.specification.version = 1.7
user.name = developer
java.class.path = /Users/alansampson/usr/local/NetRexx/runlib/NetRexxR.jar:.
java.specification.version = 1.7
file.encoding = UTF-8
java.awt.printerjob = sun.lwawt.macosx.CPrinterJob
user.timezone = 
user.home = /Users/developer
http.nonProxyHosts = local|*.local|169.254/16|*.169.254/16
os.version = 10.7.5
sun.management.compiler = HotSpot 64-Bit Tiered Compilers
java.class.version = 51.0
java.specification.name = Java Platform API Specification
java.library.path = /Users/developer/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
sun.jnu.encoding = UTF-8
os.name = Mac OS X
java.vm.specification.vendor = Oracle Corporation
line.separator = 

java.io.tmpdir = /var/folders/tw/fmwdkh390zz01nj1v556x4lr0000gp/T/
os.arch = x86_64
java.endorsed.dirs = /Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib/endorsed
java.awt.graphicsenv = sun.awt.CGraphicsEnvironment
java.runtime.version = 1.7.0_15-b03
user.dir = /Users/alansampson/projects/RosettaCode/netrexx
java.vm.specification.name = Java Virtual Machine Specification
sun.os.patch.level = unknown
sun.java.launcher = SUN_STANDARD
user.country = US
file.encoding.pkg = sun.io
java.vm.name = Java HotSpot(TM) 64-Bit Server VM
path.separator = :
java.vendor.url = http://java.oracle.com/
java.vm.vendor = Oracle Corporation
gopherProxySet = false
java.vm.version = 23.7-b01
sun.boot.library.path = /Library/Java/JavaVirtualMachines/jdk1.7.0_15.jdk/Contents/Home/jre/lib
java.runtime.name = Java(TM) SE Runtime Environment
 */

/*
---- Environment "CLASSPATH" ---------------------------------------------------
CLASSPATH = /usr/local/NetRexx/runlib/NetRexxR.jar:.
---- Properties "java.class.path" ----------------------------------------------
java.class.path = /usr/local/NetRexx/runlib/NetRexxR.jar:.
---- Environment ---------------------------------------------------------------
HOME = /Users/nrxuser
HISTCONTROL = ignoredups
USER = nrxuser
ZBASHRC = 1
COMMAND_MODE = unix2003
CLASSPATH = /usr/local/NetRexx/runlib/NetRexxR.jar:.
SHELL = /bin/bash
. . .
---- Properties ----------------------------------------------------------------
java.vm.specification.name = Java Virtual Machine Specification
sun.cpu.endian = little
sun.io.unicode.encoding = UnicodeBig
sun.os.patch.level = unknown
file.separator = /
java.vendor = Oracle Corporation
sun.java.launcher = SUN_STANDARD
java.specification.vendor = Oracle Corporation
user.home = /Users/nrxuser
java.class.path = /usr/local/NetRexx/runlib/NetRexxR.jar:.
java.vm.vendor = Oracle Corporation
java.runtime.name = Java(TM) SE Runtime Environment
. . .
 */
