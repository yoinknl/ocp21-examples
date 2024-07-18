package review01_04;

public class Puzzle07 {
  public static void main(String[] args) {

    // TODO: Make one of the arrays a different length to force the use of ints[a].length
    int[][] ints = {
        { 1, 2, 3 },
        { 4, 5, 6, 7 },
        { 8, 9, 10 },
    };

    // Question: We want the nested loop to print the values 1-10 in order, what should we set maxFirstLoop, maxSecondLoop and leftOrRight to?
    var maxFirstLoop = ints.length;
    for (int a = 0; a < maxFirstLoop; a++) {

      var maxSecondLoop = ints[a].length;
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
