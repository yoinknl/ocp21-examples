package chapter01;

import java.util.Arrays;

public class EscapingArray {


  private final int[] scores;

  public EscapingArray(int[] scores) {
    this.scores = Arrays.copyOf(scores, scores.length);
  }

  @Override
  public String toString() {
    return Arrays.toString(scores);
  }

  public static void main(String[] args) {

    var externalArray = new int[] {1, 2, 3};

    var escapingArray = new EscapingArray(externalArray);
    System.out.println(escapingArray);
    // Outputs [1, 2, 3]


    externalArray[0] = 4;
    System.out.println(escapingArray);
    // Output [1, 2, 3]



  }



}



/*


    10_000_000_000_000_000_000_000_000_000_000_000_000_000_000,4
    1E43 (1*10^43)

    -1 43


    14,4
    14,4   1



 */
