package chapter05;

import chapter01.StaticVsNonStatic;

public class StaticFinalMethod {

  public static final void weirdMethod() {}

}

class InheritingStaticFinal extends StaticFinalMethod {

  // The final keyword above prevents you from hiding the method
  // Even though there's no real use-case for it, you can do it!
//  public static void weirdMethod() {}


  public static void main(String[] args) {


    StaticFinalMethod.weirdMethod();

    var obj = new StaticFinalMethod();
    obj.weirdMethod();


  }


}
