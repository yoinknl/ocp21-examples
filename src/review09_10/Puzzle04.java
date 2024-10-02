package review09_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Puzzle04 {
    // What is true about the output of this program? Choose all that apply.
    //
    // A. Alice=10
    // B. Bob=5
    // C. Charlie=25
    // D. David=15
    // E. Alice is absent
    // F. Bob is absent
    // G. Charlie is absent
    // H. David is absent
    // I. Compiler error
    // J. An exception is thrown

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 0);

        // First set of merge operations
        scores.merge("Alice", 5, (a, b) -> a - b);
        scores.merge("Bob", 15, (a, b) -> a + b);
        scores.merge("Charlie", 25, (a, b) -> a + b);

        // Second set of merge operations with different behavior
        scores.merge("Alice", 10, (a, b) -> a == 5 ? null : b);
        scores.merge("David", 15, (a, b) -> null);
        scores.merge("Bob", -10, (a, b) -> a == 15 ? null : a + b);

        System.out.println(
            scores
                .entrySet()
                .stream()
                .sorted()
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue))
        );
    }
}
