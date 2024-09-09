package review01_04;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right.
 */
public class Puzzle07 {
  public static void main(String[] args) {

    int[][] ints = {
        { 1, 2, 3 },
        { 4, 5, 6, 7 },
        { 8, 9, 10 },
    };

    // Question: We want the nested loop to print the values 1-10 in order, what should we set maxFirstLoop, maxSecondLoop and leftOrRight to?
    var maxFirstLoop = 0;
    for (int a = 0; a < maxFirstLoop; a++) {

      var maxSecondLoop = 0;
      for (int b = 0; b < maxSecondLoop; b++) {

        var leftOrRight = true;
        var item = leftOrRight ? ints[b][a] : ints[a][b];

        System.out.println(item);

      }
    }

    System.out.println("DONE!");
    // Extra Question: What happens if we change leftOrRight?
  }
}
