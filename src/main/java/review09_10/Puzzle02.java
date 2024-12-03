package review09_10;

import java.util.Optional;

public class Puzzle02 {
    // What's the output of this program?
    //
    // A. `OCP`
    // B. `No Value`
    // C. `OCPOCP`
    // D. no output

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("OCP");
        Optional<String> opt2 = Optional.empty();
        
        String result = opt1.flatMap(s -> opt2.map(t -> s + t))
                            .orElse("No Value");

        System.out.println(result);
    }
}
