package review05_08;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
public class Puzzle04 {

  // Question: In what order are the letters A-? printed?

  static {
    System.out.println("A");
  }

  {
    System.out.println("B");
  }

  static class Base {
    static {
      System.out.println("C");
    }

    {
      System.out.println("D");
    }
  }

  class ExtendedBase extends Base {
    static {
      System.out.println("E");
    }

    {
      System.out.println("F");
    }

  }

  public static void main(String[] args) {
    System.out.println("G");
    new Puzzle04().new ExtendedBase();
    System.out.println("H");
  }

}
