package review05_08;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right. If things break, try to think how you could fix it.
 */

public class Puzzle03 {

  public enum IceCream {

    STRAWBERRY, VANILLA, COCONUT { public String toString() { return "C0C0NUT"; } },
    CHOCOLATE, MANGO;

  }

  public static void main(String[] args) {

    // Question: What will this loop print?
    for (IceCream value : IceCream.values()) {

      var flavorName = value.toString();

      var flavor = IceCream.valueOf(flavorName);

      System.out.println(flavorName + " - " + flavor);

    }


  }

}
