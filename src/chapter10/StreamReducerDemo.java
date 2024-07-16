package chapter10;

import java.util.List;

public class StreamReducerDemo {
  public static void main(String[] args) {
    System.out.print(List.of("duck","flamingo","pelican")
        .parallelStream().parallel()   // q1
        .reduce(0,
            (c1, c2) -> c1 + c2.length(),  // q2
            (s1, s2) -> {
              System.out.println("Combiner call: " + s1 + " - " + s2);
              return s1 + s2;
            }));



    System.out.print(List.of("duck","flamingo","pelican")
        .parallelStream().parallel()   // q1
        .reduce( (s1, s2) -> s1 + s2 )
        .map(String::length)
    );



  }
}
