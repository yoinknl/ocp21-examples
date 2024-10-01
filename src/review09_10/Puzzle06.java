package review09_10;

import java.util.List;
import java.util.stream.Collectors;

public class Puzzle06 {

    // What is true about the following program? Choose all that apply
    //
    // A. s = 28
    // B. s = 34
    // C. There are 5 "true" values
    // D. There are 6 "true" values
    // E. There is 1 "false" value
    // F. A sane person wrote this code

    public static void main(String[] args) {
        List<String> words = List.of("java", "ocp", "stream", "collectors", "exam", "test", "stream");

        var result = words.stream()
            .map(String::toUpperCase)
            .filter(s -> s.length() > 3)
            .distinct()
            .peek(System.out::println)
            .sorted((a, b) -> b.length() - a.length())
            .collect(
                Collectors.teeing(
                    Collectors.partitioningBy(
                        s -> s.length() % 2 == 0,
                        Collectors.mapping(
                            s -> s.substring(0, 1),
                            Collectors.joining(",")
                        )
                    ),
                    Collectors.reducing(0, String::length, Integer::sum),
                    (m, s) -> 
                        "true: " + m.get(true) +
                        " | false: " + m.get(false) +
                        " | s: " + s
                )
            );

        System.out.println(result);
    }
}

