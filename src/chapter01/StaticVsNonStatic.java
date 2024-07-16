package chapter01;

public class StaticVsNonStatic {

  private static int mijnStaticWaarde = 4;

  private static int myInstanceWaarde = 8;

  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Static int: " + mijnStaticWaarde);
    System.out.println("Static int: " + myInstanceWaarde);

    var myInstance = new StaticVsNonStatic();

    var myInstance2 = new StaticVsNonStatic();
    myInstance2.myInstanceWaarde = 10_000_000;

    mijnStaticWaarde = 6;

    System.out.println("Instance int: " + myInstance.myInstanceWaarde);
    System.out.println("Instance int: " + myInstance2.myInstanceWaarde);


    System.out.println("Static int: " + myInstance.mijnStaticWaarde);
    System.out.println("Static int: " + myInstance2.mijnStaticWaarde);

    System.gc();

    for (String arg : args) {
      System.out.println("Argument: " + arg);
    }
  }

}
