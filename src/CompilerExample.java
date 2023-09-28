import java.util.ArrayList;
import java.util.List;

public class CompilerExample {


  enum Symbol {
    DIGIT,
    CHARACTER,
    OPERATOR,
    EMOJI,
    PAREN,
    UNKNOWN
  }

  public static void main(String[] args) {

    String input = "print('123' + ✅)";

    List<Symbol> pass1Symbols = new ArrayList<>();


    for (int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
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
          pass1Symbols.add(Symbol.DIGIT);
          break;
        case '+':
          pass1Symbols.add(Symbol.OPERATOR);
          break;
        case '(':
        case ')':
          pass1Symbols.add(Symbol.PAREN);
          break;
        case 'p':
        case 'r':
        case 'i':
        case 'n':
        case 't':
          pass1Symbols.add(Symbol.CHARACTER);
          break;
        case '✅':
          pass1Symbols.add(Symbol.EMOJI);
          break;
        default:
          pass1Symbols.add(Symbol.UNKNOWN);
      }
    }

    System.out.println(pass1Symbols);

  }
}
