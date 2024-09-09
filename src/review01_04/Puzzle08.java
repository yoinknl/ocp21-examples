package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right.
 */
public class Puzzle08 {
  public static void main(String[] args) {

    var x = "Hello World";
    var y = " Hello World ";

    var z = y.intern().trim();

    // Question 1 : What are the following outcomes?
    System.out.println("X == Y ?");
    System.out.println(x == y);
    System.out.println(x.equals(y));

    System.out.println("X == Z ?");
    System.out.println(x == z);
    System.out.println(x.equals(z));

    // Question 2 : What do we need to change to make x == z become true?
  }
}
