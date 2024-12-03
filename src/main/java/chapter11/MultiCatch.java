package chapter11;

import java.io.IOException;
import java.util.IllegalFormatException;

public class MultiCatch {

  public static void weirdMethod() throws Exception {}

  public static void main(String[] args) {


    try {
      weirdMethod();
    } catch(NullPointerException | IllegalFormatException | IOException e) {
      System.out.println("Stupid exception");
    } catch(Exception ex) {
      System.out.println("Any other exception");
    }


  }
}
