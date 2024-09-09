package chapter08;

import java.util.function.Predicate;

public class VarLambdas {

    public static void scary(String animal) {
      // Yes it's possible, but why?
      var dino = (Predicate<String>)(s -> "dino".equals(animal));
      // No type info to determine the var or the lambda typing
      // var dragon = s -> "dragon".equals(animal);
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
