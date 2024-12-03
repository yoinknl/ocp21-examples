package chapter13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

  public static void takeNap() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // Do nothing
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(4);
    try {
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
      service.execute(() -> takeNap());
    } finally {
      service.shutdown();
    }
    service.awaitTermination(2, TimeUnit.SECONDS);
    System.out.println("DONE!");
  }
}
