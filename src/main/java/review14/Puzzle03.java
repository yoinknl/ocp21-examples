package review14;

import java.io.*;
import java.nio.file.Files;

public class Puzzle03 {

  public static void main(String[] args) throws IOException {

    var f = File.createTempFile("ocp", "txt");

    // We want to write text to this file, how should we construct the streams to do this?

//    var out = ... ?

//    out.println("Hello World!");

//    out.close();
    System.out.println("Result: " + Files.readString(f.toPath()));
  }

}
