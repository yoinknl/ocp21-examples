package review05_08;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */

public class Puzzle02 {

  // Question: which of the following interfaces are valid Functional Interfaces?


  public @interface AnnotedFunctionalInterface {
    int callMe();
  }

  public interface Base {
    int callMe();
  }

  public interface Secondary extends Base {
    int callMeToo();
  }

  public interface Alternative extends Base {
    int callMeThree();

    default int callMe() { return 1; }
  }

  @FunctionalInterface
  public interface TryMe extends Secondary {
    default int callMeToo() { return 1; }
    default int callMe() { return 1; }

    boolean equals(Object other);
    int hashcode();
  }

  public interface Noop {}

  public static void main(String[] args) {

    // After you determined which interfaces are functional, you can uncomment these lines to see the answer

    // AnnotedFunctionalInterface l1 = () -> 10;
    // Base l2 = () -> 10;
    // Secondary l3 = () -> 10;
    // Alternative l4 = () -> 10;
    // TryMe l5 = () -> 10;
    // Noop l6 = () -> 10;

  }

}
