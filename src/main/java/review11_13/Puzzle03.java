package review11_13;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Puzzle03 {

  // To start this exercise, uncomment the line with the throws-clause
  private static void runThisDangerousCommand()
      throws IOException
  {

  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    var executor = Executors.newSingleThreadExecutor();

    // A: How can we make this work?
    var task = executor.submit(() -> {

      try {
        runThisDangerousCommand();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

    });

    // B: How can we report the error back to the calling code?
    task.get();

  }

}
