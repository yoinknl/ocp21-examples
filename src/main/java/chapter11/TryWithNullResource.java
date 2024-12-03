package chapter11;

import java.io.FileReader;
import java.io.IOException;

public class TryWithNullResource {


  public static void main(String[] args) throws IOException {
    try (FileReader r = null) {
      System.out.println("Try");
    } catch (Exception e) {
      //Ignore
      System.out.println("Exception");

    } finally {
      System.out.println("Finally!");
    }

    System.out.println("Hello!");
  }

}
