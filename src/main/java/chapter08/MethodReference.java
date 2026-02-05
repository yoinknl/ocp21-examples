package chapter08;

public class MethodReference {



  interface Converter {
    long convert(double d);
  }


  public static void main(String[] args) {


    Converter methodRef = Math::round;



    Converter lambda = (x) -> Math.round(x);



    Converter manual = new Converter() {
      @Override
      public long convert(double d) {
        return Math.round(d);
      }
    };

    System.out.println(lambda.convert(10.0));

  }


}
