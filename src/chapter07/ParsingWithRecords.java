package chapter07;

public class ParsingWithRecords {


  public sealed interface Symbol {}

  private record Character(char c) implements Symbol {}
  private record Number(int n) implements Symbol {}
  private record Whitespace() implements Symbol {}


  static String input = "Hell0 World!";

  static Symbol[] parsed = {
      new Character('H'),
      new Character('e'),
      // ...
      new Number(0),
      new Whitespace(),
      new Character('W')
      // ...
  };


  public void parseSymbol(Symbol s) {

  }

}
