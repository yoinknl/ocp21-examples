package review09_10;

import java.util.stream.Stream;

public class Puzzle08 {

    // What is the output of this program?
    //
    // A. X103050true
    // B. X103050false
    // C. X,10,30,50true
    // D. X,10,30,50false
    // E. X,10,40,70true
    // F. X,11,40,70false
    // G. It does not terminate

    public static void main(String... args) {
        var a = Stream
            .generate(() -> 0)
            .limit(3)
            .reduce("X", (s1, s2) -> s1 + s1.length() + s2, (x, y) -> x + "," + y);

        var b = Stream
            .generate(() -> "A")
            .map(s -> s + "A")
            .anyMatch(s -> s.length() > 10);

        System.out.println("" + a + b);
    }
}
