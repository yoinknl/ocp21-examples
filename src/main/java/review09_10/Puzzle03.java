package review09_10;

import java.util.stream.Stream;

public class Puzzle03 {
    // What is the output of this program?
    //
    // A. applebananaorangeAPPLEBANANA
    // B. applebananaorangeAPPLEORANGE
    // C. applebananaorangepearAPPLEBANANA
    // D. applebananaorangepearAPPLEORANGE
    // E. appleorangebananaAPPLEBANANA
    // F. appleorangebananaAPPLEORANGE
    // G. appleorangepearbananaAPPLEBANANA
    // H. appleorangepearbananaAPPLEORANGE

    public static void main(String[] args) {
        Stream.of("apple", "orange", "pear", "banana")
              .filter(s -> s.length() > 4)
              .peek(System.out::print)
              .map(String::toUpperCase)
              .sorted()
              .limit(2)
              .forEach(System.out::print);
    }
}
