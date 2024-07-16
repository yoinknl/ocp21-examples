package review01_04;

public class Puzzle07 {
  public static void main(String[] args) {


    int[][] ints = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };

    // Question: We want the nested loop to print the values 1-9 in order, what should we set maxFirstLoop, maxSecondLoop and leftOrRight to?
    var maxFirstLoop = 0;
    for (int a = 0; a < maxFirstLoop; a++) {

      var maxSecondLoop = 0;
      for (int b = 0; b < maxSecondLoop; b++) {

        var leftOrRight = false;
        var item = leftOrRight ? ints[b][a] : ints[a][b];

        System.out.println(item);

      }
    }

    System.out.println("DONE!");

  }
}
