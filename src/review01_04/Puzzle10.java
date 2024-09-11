package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
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
