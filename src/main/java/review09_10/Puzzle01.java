package review09_10;

import java.util.ArrayList;
import java.util.List;

public class Puzzle01 {

    // What is the result of the following program?
    // Also: what is the result when Line A is commented in?
    //
    // A. The code does not compile
    // B. A ClassCastException is thrown
    // C. The program outputs `10`

    public static void main(String... args) {
        List<? super Integer> numbers = new ArrayList<Number>();
        numbers.add(10);
        numbers.add(20);
        // numbers.add(30.5); // Line A

        Integer num = (Integer) numbers.get(0);
        System.out.println(num);
    }
}
