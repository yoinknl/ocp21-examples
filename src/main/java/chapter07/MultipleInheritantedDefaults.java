package chapter07;

public class MultipleInheritantedDefaults {


  interface A {
    default String getMessage() {
      return "Hello A";
    }
  }

  interface B {
    default String getMessage() {
      return "Hello B";
    }
  }


  static class TestInheritance implements A, B {
    public String getMessage() {
      return A.super.getMessage();
    }
  }










  // "Related" defaults
  interface Top {
    String getMessage();
  }

  interface Level1 extends Top {
    default String getMessage() {
      return "Hello Level1Left";
    }
  }

  interface Level2Left extends Level1 {
  }

  interface Level2Right extends Level1 {
    default String getMessage() {
      return "Hello Level2Right";
    }
  }

  interface Level3 extends Level2Left {
    default String getMessage() {
      return "Hello Level3Left";
    }
  }

  static class RelatedDefaults implements Level2Left, Level2Right {


    public static void main(String[] args) {
      System.out.println(new RelatedDefaults().getMessage());
    }
  }


}
