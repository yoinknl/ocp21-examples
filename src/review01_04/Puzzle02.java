package review01_04;

public class Puzzle02 {

  public static void main(String[] args) {

    var a = 10;

    // Question: what will we print here?
    System.out.println( a++ * 2 >= --a * 2 ? a = 200 : a);


    var b = "10";

    b += 10 * 3 << 2;

    // Question: what will we print here?
    System.out.println(b);


  }


}
