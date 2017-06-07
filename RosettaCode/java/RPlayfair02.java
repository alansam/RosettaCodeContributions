
import java.util.*;
import java.io.*;

/**
 * @see http://read.pudn.com/downloads103/sourcecode/crypt/424167/source/Playfair.java__.htm
 */
public class RPlayfair02 {

  /**
   * input file containing plaintext
   */
  private File inFile;

  /**
   * planar int array of key matrix
   */
  char m[][];

  /**
   * ArrayList of plaintext and cipher
   */
  List<Character> ap , ac;

  /**
   *
   */
  public RPlayfair02() {
    ap = new ArrayList<>();
    ac = new ArrayList<>();
    m  = new char[5][5];
  }

  /**
   * @param keyStr
   */
  public void createMatrix(String keyStr) {
    System.out.println("Key is " + keyStr);
    ap.clear();
    ac.clear();
    Set<Character> keySet = new LinkedHashSet<>();
    char[] keyArray = keyStr.toUpperCase().toCharArray();
    for (int i = 0; i < keyArray.length; i++) {
      char temp = keyArray[i];
      if (temp == 'I') {
        temp = 'J';
      }
      keySet.add(temp);
    }
    for (int n = 65; n < 91; n++) {
      if (n != 73) {
        keySet.add((char) n);
      }
    }
    Object key[] = keySet.toArray();
    
    System.out.println("Playfair matri:");
    for (int i = 0; i <5; i++) {
      for (int j = 0; j < 5; j++) {
        m[i][j]=((Character)key[i*5+j]).charValue();
        System.out.print(m[i][j]);
      }
      System.out.println("");
    }
  }

  /**
   * @param in
   * @param keyText
   */
  public void encrypt(File in, String keyText) throws IOException {

    createMatrix(keyText);

    inFile = in;
    Reader fr = new FileReader(inFile);
    Writer fw = new FileWriter(inFile.getParent() + "/Playfair_cipher.txt");
    StringBuffer sb = new StringBuffer();

    //read plaintext from input file and change to uppercase
    int temp;
    while ((temp = fr.read()) != -1) {
      if ((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122)) {
        sb.append((char) temp);
      }
    }
    fr.close();
    char[] plainChar = sb.toString().toUpperCase().toCharArray();

    for (int i = 0; i < plainChar.length; i++) {
      char ch= plainChar[i];
      if(ch == 'I') ch = 'J';
      ap.add(ch);
    }

    //insert "X" into 2 same character of plaintext
    boolean addX = false;
    for (int i = 0; i < (ap.size())/2; i++) {
      if (addX) {
        i = 0;
        addX = false;
      }
      //TODO check
      if (ap.get(i * 2).equals(ap.get(i * 2 + 1))) {
        addX = true;
        ap.add(i * 2 + 1, 'X');
      }
    }
    //if the number of plaintext is odd,add "X" at the end
    if (ap.size() % 2 != 0) {
      ap.add(ap.size(), 'X');
    }

    int r1 = 5, l1 = 5;
    int r2 = 5, l2 = 5;

    for (int i = 0; i < ap.size() / 2; i++) {
      for (int j = 0; j < 5; j++) {
        for (int j2 = 0; j2 < 5; j2++) {
          if (((Character)ap.get(i * 2)).charValue() == m[j][j2]) {
            r1 = j;
            l1 = j2;
          }
          if (((Character)ap.get(i * 2 + 1)).charValue() == m[j][j2]) {
            r2 = j;
            l2 = j2;
          }
        }
      }
      if (r1 == r2) {
        ac.add(i * 2, m[r1][(l1 + 1) % 5]);
        ac.add(i * 2 + 1, m[r2][(l2 + 1) % 5]);
      }
      else if (l1 == l2) {
        ac.add(i * 2, m[(r1 + 1) % 5][l1]);
        ac.add(i * 2 + 1, m[(r2 + 1) % 5][l2]);
      }
      else {
        ac.add(i * 2, m[r1][l2]);
        ac.add(i * 2 + 1, m[r2][l1]);
      }
    }

      //writer cipher to output file
      for (int i = 0; i < ac.size(); i++) {
          fw.write(((Character) ac.get(i)).charValue());
      }
      fw.close();
      System.out.println("Playfair encryption ok");
  }

  /**
   *
   */
  public void decrypt() throws IOException {
    Writer fw = new FileWriter(inFile.getParent() + "/Playfair_decrypt.txt");

    ap = new ArrayList<>(ac);
    ac.clear();

    //decrypt
    int r1 = 5, l1 = 5;
    int r2 = 5, l2 = 5;

    for (int i = 0; i < ap.size() / 2; i++) {
      for (int j = 0; j < 5; j++) {
        for (int j2 = 0; j2 < 5; j2++) {
          if (((Character)ap.get(i * 2)).charValue() == m[j][j2]) {
            r1 = j;
            l1 = j2;
          }
          if (((Character)ap.get(i * 2 + 1)).charValue() == m[j][j2]) {
            r2 = j;
            l2 = j2;
          }
        }
      }
      if (r1 == r2) {
        ac.add(i * 2, m[r1][(l1 + 4) % 5]);
        ac.add(i * 2 + 1, m[r2][(l2 + 4) % 5]);
      }
      else if (l1 == l2) {
        ac.add(i * 2, m[(r1 + 4) % 5][l1]);
        ac.add(i * 2 + 1, m[(r2 + 4) % 5][l2]);
      }
      else {
        ac.add(i * 2, m[r1][l2]);
        ac.add(i * 2 + 1, m[r2][l1]);
      }
    }

    //writer cipher to output file
    for (int i = 0; i < ac.size(); i++) {
      fw.write((((Character) ac.get(i)).toString().toLowerCase()).charAt(0));
    }
    fw.close();
    System.out.println("Playfair decryption ok");
  }
}

