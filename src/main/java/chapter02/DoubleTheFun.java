package chapter02;

public class DoubleTheFun {

  public static void main(String[] args) {
    double one = Math.pow(1, 2);
//    int two = Math.round(1.0);
//    float three = Math.random();
//    var doubles = new double[] {one, two, three};

//
//    long goat = (int)2;
//    goat -= 1.0;
//    goat = goat - 1.0;
//    System.out.print(goat);

    while (true) {
      var a = 1.0f;
      var b = 0.000000000000001f;

      roundingErrors(a - b + b - a);
    }


  }



  public static void roundingErrors(float f) {

    if (f == 0.0f) {
      System.out.println("ZERO");
    } else {
      System.out.println("NON ZERO");
      System.exit(1);
    }

  }

}
