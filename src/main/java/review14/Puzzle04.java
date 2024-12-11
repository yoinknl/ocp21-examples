package review14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Puzzle04 {

  public static void main(String[] args) throws IOException {

    var f = File.createTempFile("ocp", "txt");

    var stream = new FileOutputStream(f);

    // We want to write text to this stream, how should we construct the streams to do this?

//    var out = ... ?

//    out.println("Hello World!");

  }

}
