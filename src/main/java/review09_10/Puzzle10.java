package review09_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Puzzle10 {

    // What is the output of this program?
    //
    // A. a
    // B. abc
    // C. abcd
    // D. There is no output
    // E. It throws an exception
    // F. It does not terminate

    public static void main(String[] args) {
        List<String> letters = new ArrayList<>(List.of("a", "b", "c"));
        Spliterator<String> spliterator = letters.spliterator();
        letters.add("d");
        spliterator.tryAdvance(System.out::print);
        spliterator.forEachRemaining(System.out::print);
    }
}
