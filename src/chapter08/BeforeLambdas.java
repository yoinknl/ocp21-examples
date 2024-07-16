package chapter08;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BeforeLambdas {

 public static class Panda {
    int age;
    public static void main(String[] args) {
       Panda p1 = new Panda();
       p1.age = 1;
//       check(p1, p -> p.age < 5);
      check(p1, new Predicate<Panda>() {
        @Override
        public boolean test(Panda panda) {
          return panda.age < 5;
        }
      });
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
