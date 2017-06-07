
import java.util.zip.CRC32;

public class RCRC_32 {

  public static void main(String[] args) {
    String toBeEncoded = new String("The quick brown fox jumps over the lazy dog");
    CRC32 myCRC = new CRC32();
    myCRC.update(toBeEncoded.getBytes());
    System.out.println("The CRC-32 value is : " + Long.toHexString(myCRC.getValue()) + " !");
    return;
  }
}

