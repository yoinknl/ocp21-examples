package review05_08;

import java.util.Arrays;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */

public class Puzzle01 {

  static class AmIImmutable {

    private final int a = 10;
    private String b = "TEST";
    private int[] values = {1, 2, 3, 4, 5};
    private int ext;

    public AmIImmutable(int e) {
      this.ext = e;
    }

    public int getA() {
      return a;
    }

    public String getB() {
      return b;
    }

    public int[] getValues() {
      return values;
    }

    public void setSomethingToOne(int[] target, int index) {
      target[index] = 1;
    }

    @Override
    public String toString() {
      return "AmIImmutable{" +
             "a=" + a +
             ", b='" + b + '\'' +
             ", values=" + Arrays.toString(values) +
             ", ext=" + ext +
             '}';
    }
  }


  public static void main(String[] args) {

    // Question: Is the class AmIImmutable immutable?
    var myImmutableThing = new AmIImmutable(8);

    System.out.println(myImmutableThing);

    myImmutableThing.getA();
    myImmutableThing.getB();
    myImmutableThing.getValues();
    myImmutableThing.setSomethingToOne(new int[] {4, 3, 2, 1}, 2);

    // If AmIImmutable is immutable, this should print the same as the one above, right?
    System.out.println(myImmutableThing);


    myImmutableThing.setSomethingToOne(myImmutableThing.getValues(), 1);

    // Question: Will this have changed the output?
    System.out.println(myImmutableThing);
  }

}
