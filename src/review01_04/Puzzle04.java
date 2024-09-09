package review01_04;

import java.util.ArrayList;

/**
 * Before running this Puzzle, look at the code and try to decide what it is going to print. Look for the comments that
 * start with 'Question:' and try to answer those questions. Once you think you know the answer, run the application and
 * see if you got it right.
 */
public class Puzzle04 {

  interface Symbol {}

  record Zero() implements Symbol {}
  record Number(int n) implements Symbol {}
  record Add() implements Symbol {}

  public static void main(String[] args) {

    var symbols = new ArrayList<Symbol>();
    var input = "1 + 1";

    // Question: What is in the symbols list after this loop?
    for (var i = 0; i < input.length(); i++) {
      switch (input.charAt(i)) {
        case '0':
          symbols.add(new Zero());
          break;
        case '1', '2', '3', '4', '5', '6', '7', '8', '9':
          symbols.add(new Number(Integer.parseInt("" + input.charAt(i))));
          break;
        case ' ':
          continue;
        case '+':
          symbols.add(new Add());
          break;
        default:
          throw new IllegalArgumentException("Unrecognized character: " + input.charAt(i));
      }
    }

    System.out.println(symbols);
  }

}
