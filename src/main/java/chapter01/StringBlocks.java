package chapter01;

public class StringBlocks {

  private int numForks;

  public static void main(String[] args) {
    int numKnives;
    System.out.print("""
        "# forks = " + numForks +
         " # knives = " + numKnives +
        # cups = 0""");
  }

}
