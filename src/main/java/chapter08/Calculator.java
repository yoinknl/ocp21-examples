package chapter08;

import java.util.function.BiFunction;

public class Calculator {





  public int calculate(String input) {

    int result = 0;
    int tmp = -1;

    BiFunction<Integer, Integer, Integer> nextFunction = null;

    for (char c : input.toCharArray()) {

      switch (c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          // TODO;
          tmp = Integer.parseInt(String.valueOf(c));
          break;
        case '+':
          nextFunction = Integer::sum;
          break;
        case '-':
          nextFunction = (x, y) -> x - y;
          break;
        case '*':
          nextFunction = (x, y) -> x * y;
          break;
        case '/':
          nextFunction = (x, y) -> x / y;
          break;
      }

      if (nextFunction != null && tmp > 0) {
        result = nextFunction.apply(result, tmp);
        nextFunction = null;
        tmp = -1;
      }

    }

    return result;

  }


  public static void main(String[] args) {
    System.out.println(new Calculator().calculate("+2+3-4*2/2"));
  }

}
