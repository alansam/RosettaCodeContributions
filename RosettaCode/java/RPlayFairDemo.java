
import java.io.*;

/**
 * @see http://ha-all-about-programming.blogspot.com/2012/03/playfair-cipher-implementation.html
 * @see http://en.wikipedia.org/wiki/Playfair_cipher
 * @see http://practicalcryptography.com/ciphers/playfair-cipher/
 */
class RPlayFairDemo {
  String key  = new String();
  String key2 = new String();
  String text = new String();
  char key_array[][] = new char[5][5];

  /**
   * @param k
   */
  public void keySetter(String k) {
    String str = new String();
    boolean test = false;
    str = str + k.charAt(0);
    for (int i = 1; i < k.length(); i++) {
      for (int j = 0; j < str.length(); j++) {
        if(k.charAt(i) == str.charAt(j) || k.charAt(i) == 'j') {
          test = true;
        }
      }
      if (!test) {
        str = str + k.charAt(i);
      }
      test = false;
    }
    key = str;
    matrixBuilder(key);
  }

  /**
   * @param k
   */
  public void matrixBuilder(String k) {
    key2 = key2 + key;
    boolean test = false;
    char current;
    for (int i = 0; i < 26; i++) {
      current = (char) (i + 97);
      for (int j = 0; j < key.length(); j++) {
        if (current == 'j' || current == key.charAt(j)) {
          test = true;
        }
      }
      if (!test) {
        key2 = key2 + current;
      }
      test = false;
    }
    System.out.println(key2);
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        key_array[i][j] = key2.charAt(i * 5 + j);
      }
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(key_array[i][j] + " ");
      }
      System.out.println();
    }
  }

  /**
   * @param input
   */
  public void stringConversion(String input) {
    String altered = new String();
    altered = input.replace('j', 'i');
    for (int i = 0; i < altered.length(); i++) {
      if (i > 0 && altered.charAt(i) == altered.charAt(i - 1)) {
        altered = altered.substring(0, i) + 'x' + altered.substring(i);
      }
    }
    if ((altered.length() % 2) != 0) {
      altered = altered + 'x';
    }
    text = altered;
    System.out.println(text);
  }

  /**
   * @param letter
   */
  public int[] getDimensions(char letter) {
    int key[] = new int[2];
    for (int i = 0; i < 5 ;i++) {
      for (int j=0 ; j<5 ; j++) {
        if(key_array[i][j] == letter) {
          key[0]=i;
          key[1]=j;
          break;
        }
      }
    }
    return key;
  }

  /**
   *
   */
  public void Encrypt() {
    char a, b;
    String Code = "";
    int c[] = new int[2];
    int d[] = new int[2];
    for (int i = 0; i < text.length(); i = i + 2) {
      a = text.charAt(i);
      b = text.charAt(i + 1);
      c = getDimensions(a);
      d = getDimensions(b);
      if (c[0] == d[0]) {
        if (c[1] < 4) {
          c[1]++;
        }
        else {
          c[1] = 0;
        }
        if (d[1] < 4) {
          d[1]++;
        }
        else {
          d[1] = 0;
        }
      }
      else if (c[1] == d[1]) {
        if (c[0] < 4) {
          c[0]++;
        }
        else {
          c[0] = 0;
        }
        if(d[0] < 4) {
          d[0]++;
        }
        else {
          d[0] = 0;
        }
      }
      else {
        int temp = c[1];
        c[1] = d[1];
        d[1] = temp;
      }
      Code = Code + key_array[c[0]][c[1]] + key_array[d[0]][d[1]];
    }
    System.out.println("Encrypted text:" + Code);
  }

  /**
   *
   */
  public void Decrypt() {
    char a, b;
    String Code = "";
    int c[] = new int[2];
    int d[] = new int[2];
    for (int i = 0; i < text.length(); i = i + 2) {
      a = text.charAt(i);
      b = text.charAt(i + 1);
      c = getDimensions(a);
      d = getDimensions(b);
      if (c[0] == d[0]) {
        if (c[1] > 0) {
          c[1]--;
        }
        else {
          c[1] = 4;
        }
        if (d[1] > 0) {
          d[1]--;
        }
        else {
          d[1] = 4;
        }
      }
      else if (c[1] == d[1]) {
        if (c[0] > 0) {
          c[0]--;
        }
        else {
          c[0] = 4;
        }
        if (d[0] > 0) {
          d[0]--;
        }
        else {
          d[0] = 4;
        }
      }
      else {
        int temp = c[1];
        c[1] = d[1];
        d[1] = temp;
      }
      Code = Code + key_array[c[0]][c[1]] + key_array[d[0]][d[1]];
    }
    System.out.println("Decrypted text:" + Code);
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    String s, s2, s3, s4;
    int ch;
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      RPlayFairDemo p = new RPlayFairDemo();
      System.out.println("Enter the key:");
      s4 = br.readLine();
      p.keySetter(s4);
      do {
        System.out.println("Enter Your Choice:\n1.Encrypt\n2.Decrypt\n3.Exit");
        s = br.readLine();
        ch = Integer.valueOf(s).intValue();
        switch(ch) {
        case 1 :
          System.out.println("Enter Text to be Encrypted:");
          s2 = br.readLine();
          s2 = s2.toLowerCase();
          p.stringConversion(s2);
          p.Encrypt();
          break;
        case 2 :
          System.out.println("Enter Text to be Decrypted:");
          s3 = br.readLine();
          s3 = s3.toLowerCase();
          p.stringConversion(s3);
          p.Decrypt();
          break;
        case 3 :
          System.exit(0);
        }
      } while (ch < 3);
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}

