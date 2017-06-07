
import java.util.Scanner;

public class RPlayfairCipher {

  private String _txt;
  char[] _m = new char[25];

  public void doIt(String k, String t, boolean ij, boolean e) {

    createGrid(k, ij);
    getTextReady(t, ij, e);
    if (e) {
      doIt(1);
    }
    else {
      doIt(-1);
    }
    display();

    return;
  }

  private void doIt(int dir) {

    return;
  }

  private void display() {

    return;
  }

  private Character getChar(int a, int b) {

    return null;
  }

  private boolean getCharPos(char l, int a, int b) {

    return false;
  }

  private void getTextReady(String t, boolean ij, boolean e) {

    return;
  }

  private void createGrid(String k, boolean ij) {

    if (k.length() < 1) {
      j = "KEYWORD";
    }

    return;
  }

  public static void main(String[] args) {

    String txt = null;
    String key = null;
    boolean ij = true;
    boolean e  = true;

    Scanner reply = new Scanner(System.in);
    System.out.println("(E)ncode or (D)ecode?");
    txt = reply.next().toLowerCase();
    if (txt.startsWith("e")) {
      e = true;
    }
    else if (txt.startsWith("d")) {
      e = false;
    }
    else {
      e = true;
    }

    key = "";
    System.out.println("Enter the en/decryption key:");
    while (key.isEmpty()) {
      key = reply.nextLine();
    }

    System.out.println("I <-> J (Y/N):");
    txt = reply.next().toLowerCase();
    if (txt.startsWith("y")) {
      ij = true;
    }
    else if (txt.startsWith("n")) {
      ij = false;
    }
    else {
      ij = true;
    }

    txt = "";
    System.out.println("Enter the text:");
    while (txt.isEmpty()) {
      txt = reply.nextLine();
    }

    System.out.printf("\"%s\" \"%s\" %b %b%n", key, txt, ij, e);

    RPlayfairCipher playfair = new RPlayfairCipher();
    playfair.doIt(key, txt, ij, e);
    reply.close();

    return;
  }
}

