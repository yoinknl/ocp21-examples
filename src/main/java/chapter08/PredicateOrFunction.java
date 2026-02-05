package chapter08;


import java.util.function.Predicate;

public class PredicateOrFunction {

  public static class Fantasy {
    public static void scary(String animal) {
//      var dino = s -> "dino".equals(animal);
//      var dragon = s -> "dragon".equals(animal);
      Predicate<String> dino = s -> "dino".equals(animal);
      Predicate<String> dragon = s -> "dragon".equals(animal);
      var combined = dino.or(dragon);
      System.out.println(combined.test(animal));
    }
    public static void main(String[] args) {
      scary("dino");
      scary("dragon");
      scary("unicorn");
    }
  }
}
