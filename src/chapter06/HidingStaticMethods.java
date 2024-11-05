package chapter06;

public class HidingStaticMethods {



  public class SuperClass {

    public static void utility() {
      System.out.println("I'm SUPER!");
    }

  }


  public class SubClass extends SuperClass {

    public static void utility() {
      System.out.println("I'm SUB!");
    }

    void something() {
      utility();
    }

  }


}
