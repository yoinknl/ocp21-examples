package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
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
