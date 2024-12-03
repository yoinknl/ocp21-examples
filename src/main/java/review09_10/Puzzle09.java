package review09_10;

import java.util.*;

public class Puzzle09 {

    // With what do we need to replace the `null` to get the output [5, 4, 3, 2, 1] ? Choose all that apply
    //
    // A. new TreeSet<>((a, b) -> b - a)
    // B. new TreeSet<>((a, b) -> a - b)
    // C. new ArrayList<>(3)
    // D. new LinkedHashSet<>()
    // E. new HashSet<>()
    // F. new TreeSet<>(Comparator.reverseOrder())
    // G. new ArrayDeque<>();

    public static void main(String[] args) {
        List<Integer> values = List.of(5, 4, 3, 2, 1);

        Collection<Integer> collection = null; // Replace here
        collection.addAll(values);

        System.out.println("Output: " + collection);
    }
}
