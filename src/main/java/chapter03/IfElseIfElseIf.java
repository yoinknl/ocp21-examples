package chapter03;

public class IfElseIfElseIf {

  public static void main(String[] args) {
    var a = (int)(Math.random() * 10);

    if (a < 2)
      System.out.println("Small!");
    else if (a < 4)
      System.out.println("Medium");
    else if (a < 8)
      System.out.println("Large");
    else
      System.out.println("Extra Large");

  }



}
