
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RFork {

  public static void main(String[] args) {
    ProcessBuilder pb;
    Process pp;
    List<String> command;
    Map<String, String> env;
    BufferedReader ir;
    String currentuser;
    String line;
    try {
      command = Arrays.asList("");
      pb = new ProcessBuilder(command);
      env = pb.environment();
      currentuser = env.get("USER");
      command = Arrays.asList("ps", "-f", "-U", currentuser);
      pb.command(command);
      pp = pb.start();
      ir = new BufferedReader(new InputStreamReader(pp.getInputStream()));
      line = "Output of running " + command.toString() + " is:";
      do {
        System.out.println(line);
      } while ((line = ir.readLine()) != null);
    }
    catch (IOException iox) {
      iox.printStackTrace();
    }

    return;
  }
}

/*
Output of running [ps, -f, -U, developer] is: 
  UID   PID  PPID   C STIME   TTY           TIME CMD 
  502 74079     1   0  8:13PM ??         0:00.02 /sbin/launchd
  ...
  502 74047 74045   0  8:13PM ttys000    0:00.05 bash
  502 74198 74047   0  8:18PM ttys000    0:00.21 /usr/bin/java -cp .:.. RFork
  502 74199 74047   0  8:18PM ttys000    0:00.00 tee data/RForkJ.log
    0 74200 74198   0  8:18PM ttys000    0:00.00 ps -f -U developer
  ...
 */

