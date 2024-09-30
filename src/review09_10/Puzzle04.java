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
    // C. Charlie=35
    // D. David=25
    // E. Eve=15
    // F. Alice is absent
    // G. Bob is absent
    // H. Charlie is absent
    // I. David is absent
    // J. Eve is absent
    // K. Compiler error
    // L. An exception is thrown

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 0);
        scores.put("Charlie", 30);

        // First set of merge operations
        scores.merge("Alice", 5, (a, b) -> a - b);
        scores.merge("Bob", 15, (a, b) -> a + b);
        scores.merge("Charlie", 10, (a, b) -> a + b);
        scores.merge("David", 25, (a, b) -> a + b);

        // Second set of merge operations with different behavior
        scores.merge("Alice", 10, (a, b) -> a == 5 ? null : b);
        scores.merge("Eve", 15, (a, b) -> null);
        scores.merge("Bob", -10, (a, b) -> a == 15 ? null : a + b);
        scores.merge("Charlie", 5, (a, b) -> a == 40 ? a - b : null);

        System.out.println(
            scores
                .entrySet()
                .stream()
                .sorted()
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue))
        );
    }
}
