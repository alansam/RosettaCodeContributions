
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <h1>RosettaCode task <a href="">Hello world/Web server</a></h1>
 * <p>
 * Multiple requests will be served in the order that they reach the server, with a queue size limit of 50 waiting
 * requests imposed by default in the ServerSocket class (may be changed by adding a second positive integer argument
 * to the ServerSocket constructor).
 * </p>
 *
 * @author <a href="http://rosettacode.org/wiki/User:Mwn3d">Mike Neurohr</a>
 * @version 1.0
 */
public class RHelloWorldWebServer {
  public static void main(String[] args) throws IOException {
    ServerSocket listener = new ServerSocket(8080);
    while (true) {
      Socket sock = listener.accept();
      new PrintWriter(sock.getOutputStream(), true).println("Goodbye, World!");
      sock.close();
    }
  }
}

