package review01_04;

public class Puzzle09 {
  public static void main(String[] args) {

    var a = 0;
    var iterations = 0;

    do {
      a++;
      iterations++;
    } while (a < 1);

    // Question: What will the values be at this point?
    System.out.println("Phase 1:");
    System.out.println("a: " + a);
    System.out.println("iterations: " + iterations);

    while (a < 1) {
      iterations++;
    }

    // Question: What will the values be at this point?
    System.out.println("Phase 2:");
    System.out.println("a: " + a);
    System.out.println("iterations: " + iterations);

  }
}
