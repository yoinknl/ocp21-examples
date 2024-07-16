package review01_04;

import java.util.ArrayList;

public class Puzzle04 {

  interface Symbol {}

  record Zero() implements Symbol {}

  record Number(int n) implements Symbol {}

  record Add() implements Symbol {}

  public static void main(String[] args) {

    var symbols = new ArrayList<Symbol>();
    var input = "1 + 1";

    // Question: What does this loop and switch statement do?
    for (var i = 0; i < input.length(); i++) {
      switch (input.charAt(i)) {
        case '0':
          symbols.add(new Zero());
          break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
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
