package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. There are two moments in
 * this code for you to determine what the output will be. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */
public class Puzzle01 {


  static int c1 = 0;
  int c2 = 0;

  Puzzle01() {
    c1 = ++c1;
    c2 = c2++;
  }


  public static void main(String[] args) {

    var p1 = new Puzzle01();
    var p2 = new Puzzle01();
    var p3 = new Puzzle01();

    // Question: What will the values of c1 and c2 be for each of the Puzzles?
    printPuzzle(p1);
    printPuzzle(p2);
    printPuzzle(p3);

    p1.c1 += 1;

    p2.c2 += 1;

    p3.c2 += 1;
    p3.c2 += 1;

    System.out.println("\n[ == ]\n");

    // Question: What will the values of c1 and c2 now be for each of the Puzzles?
    printPuzzle(p1);
    printPuzzle(p2);
    printPuzzle(p3);

  }

  private static void printPuzzle(Puzzle01 p) {
    System.out.println("--[ Puzzle Status: ]--------------------------------------------------------------------------------------");
    System.out.println(" c1 == " + p.c1);
    System.out.println(" c2 == " + p.c2);
  }

}
