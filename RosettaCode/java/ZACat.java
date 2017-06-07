
public class ZACat extends ZAAnimal {

  public ZACat() {
    System.out.println("s:" + this.getClass().getSuperclass().toString());
    System.out.println("t:" + this.getClass().toString());
    return;
  }
}

