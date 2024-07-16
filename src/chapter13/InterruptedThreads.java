package chapter13;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterruptedThreads {

  public static class RocketShip {
    private volatile int fuel;
    private void launch(int checks) {

      Lock l = new ReentrantLock();

      l.lock();
        var p = new ArrayList<Thread>();
        for (int i = 0; i < checks; i++)
          p.add(new Thread(() -> {
            try {
              l.lockInterruptibly();
            } catch (InterruptedException e) {
              System.out.println("Jup");
            }

            fuel++;

//          try {
//            Thread.sleep(100);
//          } catch (InterruptedException e) {
//            System.out.println("Got interrupted!");
//          }

          }));
//        p.forEach(Thread::interrupt);
        p.forEach(Thread::start);
        p.forEach(Thread::interrupt);
    }

    public static void main(String[] args) throws Exception {
      var ship = new RocketShip();
      ship.launch(100);
      Thread.sleep(1000);
      System.out.print(ship.fuel);
    } }

}
