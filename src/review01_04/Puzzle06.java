package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right.
 */
public class Puzzle06 {

  int temp = 1;

  {
    int a = 2;
    temp += a;
  }

  public int runMe(int temp) {
    return temp;
  }

  public static void main(String[] args) {
    int temp = 5;

    var p = new Puzzle06();

    // Question: What will this statement print?
    System.out.println(p.runMe(temp - 1));

  }
}
