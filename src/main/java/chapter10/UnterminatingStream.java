package chapter10;

import java.util.Arrays;
import java.util.stream.*;

public class UnterminatingStream {


  public static void main(String[] args) {

    var stream = Stream.iterate(new String[] {""}, (s) -> new String[] { s[0] + "1" }).limit(3);
    stream.limit(5)
        .map(x -> new String[] {x[0] + "2"})
//        .map(String::toUpperCase)
        .peek(arr -> arr[0] = "lol")
//        .map(s -> s.replaceAll("12", "13"))
        .forEach(arr -> System.out.println(Arrays.toString(arr)));
//        .toList();


//    System.out.println(result);


//    double result = LongStream.of(6L, 8L, 10L)
//        .mapToInt(x -> (int) x)
//        .boxed()
//        .collect(Collectors.groupingBy(x -> x))
//        .keySet()
//        .stream()
//        .collect(Collectors.averagingInt(x -> x));





    Stream<Integer> s = Stream.of(1);
    Stream<Integer> is = s.limit(5);
    DoubleStream ds = s.mapToDouble(x -> x);
    IntStream s2 = ds.mapToInt(x -> (int)x);
    s2.forEach(System.out::print);


  }
}
