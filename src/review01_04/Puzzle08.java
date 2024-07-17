package review01_04;

public class Puzzle08 {
  public static void main(String[] args) {

    var x = "Hello World";
    var y = " Hello World ";

    var z = y.intern().trim();

    // What are the following outcomes?
    System.out.println("X == Y ?");
    System.out.println(x == y);
    System.out.println(x.equals(y));

    System.out.println("X == Z ?");
    System.out.println(x == z);
    System.out.println(x.equals(z));

  }
}
