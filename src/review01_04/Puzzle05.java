package review01_04;

import java.util.HashMap;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right.
 */
public class Puzzle05 {

  public static void main(String[] args) {

    // Fun change: what happens is we change it to LinkedHashMap
    var legsPerAnimal = new HashMap<String, Integer>();
    legsPerAnimal.put("Monkey", 2);
    legsPerAnimal.put("Salmon", 0);
    legsPerAnimal.put("Pig", 4);
    legsPerAnimal.put("Spider", 8);

    // Question: to make this loop print how many legs each animal has, what needs to be at the _____?
//    for (var entry: _____) {
//      System.out.println(entry.getKey() + " has " + entry.getValue() + " legs");
//    }

  }

}
