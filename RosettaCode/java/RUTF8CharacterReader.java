
import java.io.*;

public class RUTF8CharacterReader {
  private String slurped;
  private String encoding;
  private String fName;
  private File fFile;
  // ---------------------------------------------------------------------------
  public String slurpChars(String fileName) {
    StringBuilder slrp = new StringBuilder();
    fName = fileName;
    fFile = new File(fName);
    try (Reader fr = new FileReader(fFile)) {
      encoding = ((InputStreamReader) fr).getEncoding();
      int EOF = -1;
      int ic;
      do {
        if ((ic = fr.read()) != EOF) {
          char cc = (char) ic;
          slrp.append(cc);
        }
      } while (ic != EOF);
      /*
      forever: for (;;) {
        int ic;
        if ((ic = fr.read()) < 0) { break forever; }
        char cc = (char) ic;
        slrp.append(cc);
      }
      */
    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
    slurped = slrp.length() > 0 ? slrp.toString() : null;
    return slurped;
  }
  // ---------------------------------------------------------------------------
  public void encodingDetails() {
    String FMT_000 = "file_encoding=\"%s\" file_name=\"%s\"%n";
    String FMT_001 = "unicode_string_length=\"%d\" code_point_count=\"%d\" string=\"%s\"%n";
    String FMT_002 = "codepoint_index=\"%03d\" character_count=\"%d\" unicode_id=\"U+%05X\" hex=\"%#08x\" dec=\"%07d\" oct=\"%07o\" string=\"%s\" utf-16=\"%s\" utf-8=\"%s\" character_name=\"%s\"%n";
    String str = slurped;
    System.out.printf(FMT_000, encoding, fFile.getAbsoluteFile());
    System.out.printf(FMT_001, str.length(), Character.codePointCount(str, 0, str.length()), str);
    for (int ix = 0; ix < str.length(); ++ix) {
      int cp = Character.codePointAt(str, ix);
      int cc = Character.charCount(cp);
      String cpName = Character.getName(cp);
      String x_utf16;
      String x_utf8;
      x_utf16 = "";
      x_utf8 = "";
      try {
        x_utf16 = codePointToUTF16(cp);
        x_utf8 = codePointToUTF8(cp);
      }
      catch (UnsupportedEncodingException ex) {
        ex.printStackTrace();
      }
      System.out.printf(FMT_002, ix, cc, cp, cp, ((long) cp & 0x00000000ffffffff), cp, new String(Character.toChars(cp)), x_utf16, x_utf8, cpName);
      if (cc > 1) {
        int[] surrogates = { (int) Character.highSurrogate(cp), (int) Character.lowSurrogate(cp), };
        int ixx = ix++;
        for (int sp : surrogates) {
          String spName = Character.getName(sp);
          x_utf16 = "";
          x_utf8 = "";
          try {
            x_utf16 = codePointToUTF16(sp);
            x_utf8 = codePointToUTF8(sp);
          }
          catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
          }
          int sc = Character.charCount(sp);
          System.out.printf(FMT_002, ixx++, sc, sp, sp, ((long) sp & 0x00000000ffffffff), sp, new String(Character.toChars(sp)), x_utf16, x_utf8, spName);
        }
      }
    }
    return;
  }
  // ---------------------------------------------------------------------------
  public static String codePointToUTF8(int cp) throws UnsupportedEncodingException {
    String scp = new String(Character.toChars(cp));
    boolean comma = false;
    StringBuilder xparts = new StringBuilder();
    byte[] b_utf8 = scp.getBytes("UTF-8");
    for (int xx = 0; xx < b_utf8.length; ++xx) {
      if (comma) { xparts.append(','); }
      xparts.append(String.format("%02x", b_utf8[xx]));
      comma = true;
    }
    return xparts.toString();
  }
  // ---------------------------------------------------------------------------
  public static String codePointToUTF16(int cp) throws UnsupportedEncodingException {
    String scp = new String(Character.toChars(cp));
    StringBuilder xparts = new StringBuilder();
    byte[] b_utf16 = scp.getBytes("UTF-16BE");
    boolean comma = false;
    for (int xx = 0; xx < b_utf16.length; xx += 2) {
      if (comma) { xparts.append(','); }
      xparts.append(String.format("%02x%02x", b_utf16[xx], b_utf16[xx + 1]));
      comma = true;
    }
    return xparts.toString();
  }
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {
    String inFile;
    if (args.length > 0 && args[0].length() > 0) { inFile = args[0]; }
    else { inFile = "./data/utf8-001.txt"; }
    RUTF8CharacterReader lcl = new RUTF8CharacterReader();
    lcl.slurpChars(inFile);
    lcl.encodingDetails();
    return;
  }
}

