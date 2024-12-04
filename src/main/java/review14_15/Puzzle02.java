package review14_15;

import java.io.*;
import java.nio.file.Files;

public class Puzzle02 {


  // What would happen in the code below?
  // Q2: What would happen if we remove the true from the FileOutputStream constructor
  public static void main(String[] args) throws IOException {
    var tempFile = File.createTempFile("ocp", "txt");
    final FileWriter writer = new FileWriter(tempFile);
    writer.write("Hello world");
    writer.close();

    var bytesWritten = 0;
    try (var out = new FileOutputStream(tempFile, true); var in = new FileInputStream(tempFile)) {

      while (in.available() > 0 && bytesWritten < 1000) {
        out.write(in.read());
        bytesWritten++;
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Bytes written: " + bytesWritten);
    System.out.println("Contents of the file are now:");
    System.out.println(Files.readString(tempFile.toPath()));


  }














}
