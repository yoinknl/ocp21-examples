package chapter07;

public class InstanceOfCreative {


  interface Shape {}
  record Rectangle(int length, int width) implements Shape {}
  record Circle(int radius) implements Shape {}


  public void doMagic(Shape s) {
    if (s instanceof Circle c) {
      System.out.println(c.radius);
    }

    if (!(s instanceof Rectangle r)) {
      // Magic
      // Nope:
      // System.out.println(r.length);
      return;
    }

    // Nope:
    // System.out.println(c.radius);
    System.out.println(r.length);
  }

}
