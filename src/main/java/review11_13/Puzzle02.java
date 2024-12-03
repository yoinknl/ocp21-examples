package review11_13;

public class Puzzle02 {

  private static int counter = 0;

  private static Object monitorA = new Object();
  private static Object monitorB = new Object();

  private static Runnable createRunner(Object firstMonitor, Object secondMonitor, int howMany) {
    return () -> {
      for (int i = 0; i < howMany; i++) {

        synchronized (firstMonitor) {
          synchronized (secondMonitor) {
            Puzzle02.counter += 1;
          }
        }

      }
    };
  }


  public static void main(String[] args) throws InterruptedException {
    // A: What happens if we run the code below without any changes? Any idea why?

    // B: Using the variables monitorA and monitorB, how do we make sure the counter
    // reaches 20.000 every time we run this?

    // C: Can we also consistently make the application fail with these monitors?

    // D: Is there also a way to make the output completely unpredictable again?

    var t1 = new Thread(createRunner(null, null, 10_000));
    var t2 = new Thread(createRunner(null, null, 10_000));

    t1.start(); t2.start();
    t1.join(); t2.join();

    System.out.println(counter);
  }

}
