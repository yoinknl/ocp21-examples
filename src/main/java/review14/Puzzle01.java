package review14;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Puzzle01 {


  public static final String river = "mississippi";

  public static void streamMagic(InputStream in) throws IOException {
    final StringBuilder sb = new StringBuilder();

    // Challenge: this loop is building a new String from the input String defined above.
    // The idea is that it copies the String, but transforms every other character to
    // upper case. There are two things wrong with this loop, what are they?
    do {

      int c = in.read();

      sb.append((char)c);

      c = in.read();

      sb.append(Character.toUpperCase(c));

    } while (in.available() > 0);

    // How would you fix these?

    // TODO : Find a way to print the unprintable
    System.out.println(sb);
  }


  public static void main(String[] args) throws IOException {

    streamMagic(new ByteArrayInputStream(river.getBytes()));

  }


}
