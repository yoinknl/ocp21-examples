package review01_04;

public class Puzzle10 {
  public static void main(String[] args) {

    var a = 10;

    if (a < 10)
    if (a > 5)
    System.out.println("5 < a < 10");
    else
    if (a > 3)
    System.out.println("3 < a <= 5");
    else
    // Question: What should a be if we want to get to this branch?
    System.out.println(" ??? ");

  }
}
