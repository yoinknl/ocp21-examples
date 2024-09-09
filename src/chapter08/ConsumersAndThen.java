package chapter08;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumersAndThen {


  public static void main(String[] args) {

    BiConsumer<String, String> c1 = (s1, s2) -> {
      System.out.println("Consumer 1");
      System.out.println(s1);
      System.out.println(s2);
    };

    BiConsumer<String, String> c2 = (s1, s2) -> {
      System.out.println("Consumer 2");
      System.out.println(s1);
      System.out.println(s2);
    };


    c1.andThen(c2).accept("Input 1", "Input 2");

    // Expected output:
    // Consumer 1
    // Input 1
    // Input 2
    // Consumer 2
    // Input 1
    // Input 2


    Consumer<Supplier<String>> magicConsumer1 = s -> System.out.println(s.get());

    magicConsumer1.andThen(magicConsumer1).accept(() -> {
      System.out.println("Called me!");
      return "Flierp";
    });

    // Expected output:
    // Called me!
    // Flierp
    // Called me!
    // Flierp

  }


}
