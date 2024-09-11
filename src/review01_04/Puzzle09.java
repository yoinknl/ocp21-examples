package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
public class Puzzle09 {
  public static void main(String[] args) {

    var a = 0;
    var iterations = 0;

    do {
      a++;
      iterations++;
    } while (a < 0);

    // Question: What will the values be at this point?
    System.out.println("Phase 1:");
    System.out.println("a: " + a);
    System.out.println("iterations: " + iterations);

    while (a < 1) {
      iterations++;
    }

    // Question: What will the values be at this point?
    System.out.println("Phase 2:");
    System.out.println("a: " + a);
    System.out.println("iterations: " + iterations);

  }
}
