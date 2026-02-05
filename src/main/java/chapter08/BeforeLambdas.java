package chapter08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BeforeLambdas {

 public static class Panda {
    int age;

    public static class PandaPredicates {

      public static boolean isYoung(Panda p) {
        return p.age < 5;
      }

      public static boolean isOld(Panda p) {
        return p.age >= 5;
      }

    }

    public static void main(String[] args) {
      Panda p1 = new Panda();
      p1.age = 1;

      Panda p2 = new Panda();
      p2.age = 10;

      Panda p3 = new Panda();
      p3.age = 3;

//      check(p1, p -> p.age < 5);

      List<Panda> pandas = Arrays.asList(p1, p2, p3);
      List<Panda> youngPandas = new ArrayList<>();

      findYoungPandas(pandas, youngPandas);
    }

   /**
    * Finds all the young pandas in the first list and adds them to the second list
    */
    private static void findYoungPandas(List<Panda> pandas, List<Panda> youngPandas) {

      pandas.stream()
          .filter(PandaPredicates::isYoung)
          .forEach(youngPandas::add);

      for (Panda panda : pandas) {
        if (PandaPredicates.isYoung(panda)) {
          youngPandas.add(panda);
        }
      }

    }

    private static void check(Panda panda,
       Predicate<Panda> pred) {
       String result =
          pred.test(panda) ? "match" : "not match";
       System.out.print(result);
 } }


  public static void main(String[] args) {
//    BinaryOperator<Boolean> t = (var x, Boolean y) -> false;
  }
}
